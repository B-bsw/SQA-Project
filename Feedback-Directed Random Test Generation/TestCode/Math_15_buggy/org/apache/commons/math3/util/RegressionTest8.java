package org.apache.commons.math3.util;

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
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 1.0f, 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.112963841460668E31d + "'", double2 == 8.112963841460668E31d);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.440892098500626E-16d, (double) 126.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 126.99999237060547d + "'", double2 == 126.99999237060547d);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 49.99500000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9969063677702439d), 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9056071494359416d + "'", double2 == 0.9056071494359416d);
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 76);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.330733340286331d + "'", double1 == 4.330733340286331d);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.26697894345395573d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 100L, 750.00006f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        double double2 = org.apache.commons.math3.util.FastMath.pow(102.0d, 1.7320508075688772d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3012.989023970796d + "'", double2 == 3012.989023970796d);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.26765045E30f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.26765045E30f) + "'", float2 == (-1.26765045E30f));
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.284538580399531E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.284538580399531E-14d + "'", double1 == 7.284538580399531E-14d);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.025822755842440984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025817018473160622d + "'", double1 == 0.025817018473160622d);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8139312059190631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9021813597714503d + "'", double1 == 0.9021813597714503d);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.4425149084880988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3663880545204354d + "'", double1 == 0.3663880545204354d);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.10172233398898892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46680851797176126d) + "'", double1 == (-0.46680851797176126d));
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 63L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 63.000004f + "'", float1 == 63.000004f);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.371095219025714E7d, 9.673635772608993E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.673635772608993E42d + "'", double2 == 9.673635772608993E42d);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.008726646259971648d), (double) 5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008726646259971648d + "'", double2 == 0.008726646259971648d);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9376558078861459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5916794741160867d + "'", double1 == 0.5916794741160867d);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(10.693147181075235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44051.931612313434d + "'", double1 == 44051.931612313434d);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.3187334977903953E21d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 79L, 1.5327963125236284E304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5327963125236284E304d + "'", double2 == 1.5327963125236284E304d);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.4711276743037347d, (double) 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.152916652254682d + "'", double2 == 7.152916652254682d);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-2.3768449E32f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.194414737140372E10d) + "'", double1 == (-6.194414737140372E10d));
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        double double1 = org.apache.commons.math3.util.FastMath.log((-97.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-5.4470154E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.4470154E9f + "'", float1 == 5.4470154E9f);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9075712776160786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6156614228606675d + "'", double1 == 0.6156614228606675d);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.7724538509055159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.857680860275251d + "'", double1 == 2.857680860275251d);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 4.8828125E-4f, (-1.1274099260468922d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1274099260468922d) + "'", double2 == (-1.1274099260468922d));
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.18360360379727975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18570947431310014d) + "'", double1 == (-0.18570947431310014d));
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        int int2 = org.apache.commons.math3.util.FastMath.max(138, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 138 + "'", int2 == 138);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-7.6770288745698245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9727152021545762d) + "'", double1 == (-1.9727152021545762d));
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 4096, (float) (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.1606570981826605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2999252260795204d + "'", double1 == 2.2999252260795204d);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.6685791825735485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.419467201178799d + "'", double1 == 13.419467201178799d);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 18, (double) 31.999996f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.0d + "'", double2 == 18.0d);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(39.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6806784082777886d + "'", double1 == 0.6806784082777886d);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(9.999998092651369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978950994030255d + "'", double1 == 2.3978950994030255d);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1024, (-3.850490314861334d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.99994f + "'", float2 == 1023.99994f);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-106L), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 106.0f + "'", float2 == 106.0f);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(10.545893600459793d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        long long2 = org.apache.commons.math3.util.FastMath.max(22026L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22026L + "'", long2 == 22026L);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 0, 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.5855175597800497d, (-7.263102063200969E31d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.3197768247158532d, 144);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9432006686914056E43d + "'", double2 == 2.9432006686914056E43d);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        double double1 = org.apache.commons.math3.util.FastMath.atan(33.418366853490404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5408815889082699d + "'", double1 == 1.5408815889082699d);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1500.0002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0004f + "'", float1 == 1500.0004f);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        int int2 = org.apache.commons.math3.util.FastMath.max((-106), (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, 1018);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        long long2 = org.apache.commons.math3.util.FastMath.min(79L, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 79L + "'", long2 == 79L);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0954922813103776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9678957951470605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.032630847141665004d) + "'", double1 == (-0.032630847141665004d));
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 75);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 75L + "'", long1 == 75L);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 2.3768449E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.1578506894064046d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15655890067882908d) + "'", double1 == (-0.15655890067882908d));
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854067E-14d + "'", double1 == 1.2722218725854067E-14d);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.8014959971344089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.001401979773852388d, 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0130505418701649E-214d + "'", double2 == 1.0130505418701649E-214d);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0831933869426666d, 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.665547095541333d + "'", double2 == 8.665547095541333d);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 10, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9105668365896491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.485731137483685d + "'", double1 == 2.485731137483685d);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(54.1199089796844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.191374943865368E23d + "'", double1 == 3.191374943865368E23d);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        long long1 = org.apache.commons.math3.util.FastMath.round(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 328281L + "'", long1 == 328281L);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-1), 31.999996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.008726646259971648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9913113203967063d + "'", double1 == 0.9913113203967063d);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(7.629394531324017E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000291038d + "'", double1 == 1.0000000000291038d);
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.1529215E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        float float1 = org.apache.commons.math3.util.FastMath.signum(53248.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 10, (double) 5.40432E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.24E-44f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.005913009255871099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.04687067344618581d, 114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 114.59156861177442d + "'", double2 == 114.59156861177442d);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        double double2 = org.apache.commons.math3.util.FastMath.min(114.59155902616463d, 1.662514762151963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.662514762151963d + "'", double2 == 1.662514762151963d);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(18.999352444162646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.99935244416265d + "'", double1 == 18.99935244416265d);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4583.662361046586d, 0.9105668365896491d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1310943457077296d) + "'", double2 == (-0.1310943457077296d));
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.5707963267948966d), 1.068434252532353d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.068434252532353d + "'", double2 == 1.068434252532353d);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706400767961681d + "'", double1 == 1.5706400767961681d);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-3.850490314861334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-41) + "'", int1 == (-41));
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.09246595244807976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4781981015473142d + "'", double1 == 1.4781981015473142d);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.7713898455600543E306d, 1.0529879845855437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06692625537479202d + "'", double2 == 0.06692625537479202d);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.9443043E-31f, 7.2247201030232695d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9443045E-31f + "'", float2 == 3.9443045E-31f);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(7.62939453125E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000291038d + "'", double1 == 1.0000000000291038d);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        int int1 = org.apache.commons.math3.util.FastMath.round((-148.99998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-9223372036854775808L), (-458));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.39153270995434547d, (-0.021986227279203782d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.021986227279203782d) + "'", double2 == (-0.021986227279203782d));
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        double double1 = org.apache.commons.math3.util.FastMath.log((-6.053128792867638d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.4280592992577826E77d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.048113204656145E-141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2374576517016327E-71d + "'", double1 == 3.2374576517016327E-71d);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(97.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.102E-42f, (float) 1500L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.102E-42f + "'", float2 == 2.102E-42f);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-54), 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6912.0f) + "'", float2 == (-6912.0f));
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        int int2 = org.apache.commons.math3.util.FastMath.max(23, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(114.59156861177442d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1500.0003333332963d, (double) 22026L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1500.0003333332966d + "'", double2 == 1500.0003333332966d);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        int int2 = org.apache.commons.math3.util.FastMath.max(149, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.8894854184948215d, 1.570796326794887d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.8559846071046557d) + "'", double2 == (-3.8559846071046557d));
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-48.212736012209476d) + "'", double1 == (-48.212736012209476d));
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        double double1 = org.apache.commons.math3.util.FastMath.log10(31.594603878732343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.499612914713169d + "'", double1 == 1.499612914713169d);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8375714918828912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.3012989025220967d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35.000004f, 0.337497748560931d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-5137.518865003625d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.023665418289289288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999719987057447d + "'", double1 == 0.999719987057447d);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '4', 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1500L, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3000.0f + "'", float2 == 3000.0f);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.13970367520817575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14015855437046063d + "'", double1 == 0.14015855437046063d);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9746486480944883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9872429529221711d + "'", double1 == 0.9872429529221711d);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.570796326880503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963268805032d + "'", double1 == 1.5707963268805032d);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(12.000001f, 131072.02f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.000001f + "'", float2 == 12.000001f);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.5110121940091826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008918845303300279d + "'", double1 == 0.008918845303300279d);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.1863265471780543E43d, 101.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.0d + "'", double2 == 101.0d);
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(7.342690407571987E-8d, (double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.342689847369209E-10d + "'", double2 == 7.342689847369209E-10d);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 750L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0000000000001d + "'", double1 == 750.0000000000001d);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.23003301858504133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9736588669793692d + "'", double1 == 0.9736588669793692d);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.06443056647584822d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 22026, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 88104.0d + "'", double2 == 88104.0d);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.3010299956639812d, 12.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.53754499586793E-7d + "'", double2 == 5.53754499586793E-7d);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(32768.0f, (float) 75L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.7717075948257832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8784688923495146d + "'", double1 == 0.8784688923495146d);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.0969082479362111d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6643970310541525d + "'", double1 == 1.6643970310541525d);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5133499650156709d, 5.447015486E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.009624211171012755d, 2.91590986500387E-138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009624211171012755d + "'", double2 == 0.009624211171012755d);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.24364487601066484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.661011522946662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(79.0f, (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 100, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.051758E-5f + "'", float1 == 3.051758E-5f);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        int int2 = org.apache.commons.math3.util.FastMath.min((-6), (-106));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106) + "'", int2 == (-106));
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.49999997f), 1025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(847.3800800113253d, (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1874324048193107E-42d + "'", double2 == 1.1874324048193107E-42d);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.9333634218998555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 328281L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        long long2 = org.apache.commons.math3.util.FastMath.max((-149L), 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.11052961946631416d, (-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11052961946631415d + "'", double2 == 0.11052961946631415d);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.23003301858504133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8029079379718067d + "'", double1 == 1.8029079379718067d);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 5.95177979919759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.1612272431311002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16193403859934294d) + "'", double1 == (-0.16193403859934294d));
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.14517240706053733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(101.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.30829220390157d + "'", double1 == 5.30829220390157d);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 63);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.0d + "'", double1 == 63.0d);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.15167488020881612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.620414103520911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1321892048529211E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1024.0000003439764d, 12.378790834633142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8360035413770986E37d + "'", double2 == 1.8360035413770986E37d);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(32.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.00001f + "'", float1 == 32.00001f);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.002652408759588795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000035176381763d + "'", double1 == 1.0000035176381763d);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 79.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 75);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0954922813103776d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.3788101090755207d, (double) (-2.07E-43f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0739217272007293E-43d) + "'", double2 == (-2.0739217272007293E-43d));
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.192093037616354E-7d, (-9.223372036854776E18d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.192093037616354E-7d + "'", double2 == 1.192093037616354E-7d);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1920929E-7f, (-5.007031379631276E-24d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920928E-7f + "'", float2 == 1.1920928E-7f);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1500, (long) 1018);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        double double1 = org.apache.commons.math3.util.FastMath.cos(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37076031045626007d + "'", double1 == 0.37076031045626007d);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-2.09E-43f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0879347118439774E-43d + "'", double1 == 2.0879347118439774E-43d);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.6503694795665515E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 93.29755009017639d + "'", double1 == 93.29755009017639d);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9353866470427131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5481985207131723d + "'", double1 == 2.5481985207131723d);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.970566590482209E45d, 53248);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.9709157047357585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5095486063796122d + "'", double1 == 1.5095486063796122d);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0000038147049963d, 1.0230833853373482d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000038147049963d + "'", double2 == 1.0000038147049963d);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.868551121099462d + "'", double1 == 1.868551121099462d);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        int int2 = org.apache.commons.math3.util.FastMath.max((-4), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-45.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.0d + "'", double1 == 45.0d);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.4874710524825647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0799873446393424d + "'", double1 == 2.0799873446393424d);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1500.0003333332966d, 4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5677465296093194d + "'", double2 == 1.5677465296093194d);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9792710754903938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9792710754903938d + "'", double1 == 0.9792710754903938d);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.3788101090755207d, 3.8972849022006305E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000125196767945d + "'", double2 == 1.000125196767945d);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) '#', (-0.8604993868447559d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.999996f + "'", float2 == 34.999996f);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.1533302069155655d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 19.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.689503773740456d + "'", double1 == 3.689503773740456d);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-1.9843746f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 31.99999809265137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.001f, 1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842022E-19f + "'", float2 == 1.0842022E-19f);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5376614260315677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5376614260315677d + "'", double1 == 1.5376614260315677d);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-32.57791748631743d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 5, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 100L, 3.051758E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-2.600540585471551d), 0.0174594433763538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.164776051653889E-4d + "'", double2 == 9.164776051653889E-4d);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1023.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 0L, 101.46782120377229d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(32.376000838461856d, 16.93539593942879d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.53783061317823d + "'", double2 == 36.53783061317823d);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4095.9998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4414062E-4f + "'", float1 == 2.4414062E-4f);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(89.65361018130909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.507045761904912d + "'", double1 == 4.507045761904912d);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414710492169446d + "'", double1 == 0.8414710492169446d);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        double double1 = org.apache.commons.math3.util.FastMath.asin(10.882734304052615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-2));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 3.8146977E-6f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-5.999999f), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.999999f + "'", float2 == 5.999999f);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-18L), (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        double double1 = org.apache.commons.math3.util.FastMath.exp(8.317766405137894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4096.000976562497d + "'", double1 == 4096.000976562497d);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5862338664598659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.885315488201766d + "'", double1 == 4.885315488201766d);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-1.522697550491263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1504591866298164d) + "'", double1 == (-1.1504591866298164d));
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0013810679320049757d + "'", double1 == 0.0013810679320049757d);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.03079215E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.03079223E11f + "'", float1 == 1.03079223E11f);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 14, (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.000000000000001d, 1.5501637768927253E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5501637768927253E-17d + "'", double2 == 1.5501637768927253E-17d);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        int int2 = org.apache.commons.math3.util.FastMath.max(12, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        float float1 = org.apache.commons.math3.util.FastMath.abs(32.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000004f + "'", float1 == 32.000004f);
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.4781981015473142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.067661995777762d + "'", double1 == 10.067661995777762d);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.19607161940718026d, 62.692646897240664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003127495644813641d + "'", double2 == 0.003127495644813641d);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.6643855961249147d, (-1.0969082479362111d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43252265181129645d) + "'", double2 == (-0.43252265181129645d));
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.606354165955547d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-5.9325167282148206E-15d), 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.2412414525108126E8d) + "'", double2 == (-2.2412414525108126E8d));
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        float float1 = org.apache.commons.math3.util.FastMath.signum(75.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999875783251015d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998757901941958d + "'", double2 == 0.9998757901941958d);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 328281L, 5.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.999999f + "'", float2 == 5.999999f);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.017453292519943295d, 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.933345970255334E-13d + "'", double2 == 4.933345970255334E-13d);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.383362716805521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.383362716805521d + "'", double1 == 3.383362716805521d);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0000000397364284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-63) + "'", int1 == (-63));
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5635505418565119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00724572153624304d + "'", double1 == 0.00724572153624304d);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.17453292519943295d, 0.6554162488146006d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6782567369284829d + "'", double2 == 0.6782567369284829d);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5163019408528369d + "'", double1 == 1.5163019408528369d);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1606570981826605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4393749034754382d + "'", double1 == 1.4393749034754382d);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-9.2233709E18f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.2233709E18f + "'", float1 == 9.2233709E18f);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0139170048883013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6061400801265278d + "'", double1 == 1.6061400801265278d);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.2374576517016327E-71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0215293667718976E-87d + "'", double1 == 4.0215293667718976E-87d);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000003d + "'", double1 == 97.00000000000003d);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1024, 1.9342812E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.6283137044023508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5877813477142805d) + "'", double1 == (-0.5877813477142805d));
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.1826881112499317d, 1.2238399254752328d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.124197661557911d + "'", double2 == 4.124197661557911d);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.39153270995434547d, 23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3284414.422984702d + "'", double2 == 3284414.422984702d);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.8421709430404007E-14d, (double) (-0.25f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8421709430404004E-14d + "'", double2 == 2.8421709430404004E-14d);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9999999999998966d, (-6.194414737140372E10d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.194414737140372E10d) + "'", double2 == (-6.194414737140372E10d));
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.4470154E9f), 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-4));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7568024953079282d + "'", double1 == 0.7568024953079282d);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1743590056195488d, (double) 1024L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1743590056195488d + "'", double2 == 1.1743590056195488d);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(8.644433940529861E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4421.593908697327d + "'", double1 == 4421.593908697327d);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.4273537190268928E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.333333333333336d + "'", double1 == 42.333333333333336d);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        double double2 = org.apache.commons.math3.util.FastMath.min(8.317766226323982d, 1500.0003333332963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.317766226323982d + "'", double2 == 8.317766226323982d);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-149), (long) 22026);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22026L + "'", long2 == 22026L);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.5403023058681398d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5403023058681398d) + "'", double2 == (-0.5403023058681398d));
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.76034803810641d + "'", double1 == 1.76034803810641d);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.02396008020219597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023964666826589657d + "'", double1 == 0.023964666826589657d);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4095.9998f, 2.723507742868687E9d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.807880403871141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5921551114807293d + "'", double1 == 0.5921551114807293d);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.802596928649634E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.891454401121671E-47d + "'", double1 == 4.891454401121671E-47d);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5060119336077026E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.17782841321889d + "'", double1 == 83.17782841321889d);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9640275800758169d, 0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7181765752430962d + "'", double2 == 1.7181765752430962d);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9892996786096249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.68269625798027d + "'", double1 == 56.68269625798027d);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.371095219025714E7d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 18, 1064.7142582646527d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8376078965335373d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.75d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7227342478134157d + "'", double1 == 0.7227342478134157d);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.0272356433040997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026871352829836912d + "'", double1 == 0.026871352829836912d);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9105668365896491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.718623469602896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2557079554805255d + "'", double1 == 2.2557079554805255d);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.124197661557911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        double double1 = org.apache.commons.math3.util.FastMath.log(7.342690407571994E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.42697542794437d) + "'", double1 == (-16.42697542794437d));
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-2));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.342925101645957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 22025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.342915917084086d + "'", double1 == 4.342915917084086d);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.318269386720797E-31d, 2.9831006351425686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.318269386720798E-31d + "'", double2 == 5.318269386720798E-31d);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.684342E-14f, (float) 22026L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.684342E-14f + "'", float2 == 5.684342E-14f);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.03844259002118798d, 6400);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        double double2 = org.apache.commons.math3.util.FastMath.log(6.666666666666754E-4d, (double) 2.3768449E32f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.193662019676344d) + "'", double2 == (-10.193662019676344d));
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(7.6770294200238824d, 1.1062729886764988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06688150071160925d) + "'", double2 == (-0.06688150071160925d));
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 4, 0.832824094709035d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.172561628611239d + "'", double2 == 3.172561628611239d);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        double double1 = org.apache.commons.math3.util.FastMath.acos(54.1199089796844d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.430218907497497E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.00000762939453d + "'", double1 == 127.00000762939453d);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        double double1 = org.apache.commons.math3.util.FastMath.log(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.999470683622238d + "'", double1 == 7.999470683622238d);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.2300806254785061E-52d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0000000000002d + "'", double1 == 1024.0000000000002d);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.371095219025714E7d, 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.94762912722163E52d + "'", double2 == 4.94762912722163E52d);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.2281805647428924E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.50895781851543d + "'", double1 == 20.50895781851543d);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8643238493907621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6984787287238104d + "'", double1 == 0.6984787287238104d);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.797874411390694E167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 385.1183156145558d + "'", double1 == 385.1183156145558d);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 12, 32768.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        double double1 = org.apache.commons.math3.util.FastMath.tan(7.999470683622238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.82480460136275d) + "'", double1 == (-6.82480460136275d));
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.7144175303058917d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.159127075050616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8508150333851735d) + "'", double1 == (-0.8508150333851735d));
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.0786305240141214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1244848630456532d + "'", double1 == 1.1244848630456532d);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(34.999996f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.999996f + "'", float2 == 34.999996f);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.76837158203125E-7d + "'", double1 == 4.76837158203125E-7d);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-3.0f), 4096.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        int int2 = org.apache.commons.math3.util.FastMath.max((-10), 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.15707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1564407373162061d + "'", double1 == 0.1564407373162061d);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        double double1 = org.apache.commons.math3.util.FastMath.atan(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1.1884224E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.5474735E-13f, (-54));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5243549E-29f + "'", float2 == 2.5243549E-29f);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        int int2 = org.apache.commons.math3.util.FastMath.max(100, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1023 + "'", int2 == 1023);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.2238399254752328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        int int2 = org.apache.commons.math3.util.FastMath.min(97, 1018);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        double double1 = org.apache.commons.math3.util.FastMath.asin(15.004028425245222d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.1826881112499317d, (double) 53248.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53248.0d + "'", double2 == 53248.0d);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.4111572870929613E-29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4111572870929613E-29d + "'", double1 == 1.4111572870929613E-29d);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.8435577321556793d), (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01318058956493249d) + "'", double2 == (-0.01318058956493249d));
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 35, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        double double2 = org.apache.commons.math3.util.FastMath.log((-48.212736012209476d), (double) 1.0842023E-19f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.5258789E-5f, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967296E9d + "'", double2 == 4.294967296E9d);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6536436208636119d) + "'", double1 == (-0.6536436208636119d));
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        int int1 = org.apache.commons.math3.util.FastMath.round(15.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.17190027517928788d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(54.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.693231035668714d + "'", double1 == 4.693231035668714d);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(9.256230992860951E225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1024, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 18, (long) 6400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6400L + "'", long2 == 6400L);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.9342813E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9342813E25f + "'", float1 == 1.9342813E25f);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.13590897899958626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.873294847951899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.988607446555139d + "'", double1 == 0.988607446555139d);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.15987052369731924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15987052369731924d + "'", double1 == 0.15987052369731924d);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.6420926159343308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 51200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.70926996097583d + "'", double1 == 4.70926996097583d);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        float float1 = org.apache.commons.math3.util.FastMath.abs(5.684342E-14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.684342E-14f + "'", float1 == 5.684342E-14f);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        double double1 = org.apache.commons.math3.util.FastMath.atan(12.378790834633142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.49018803671909d + "'", double1 == 1.49018803671909d);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(127.00001f, 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.2238399254752328d, 148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2238399254752328d + "'", double2 == 1.2238399254752328d);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 106.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.356564024018388d + "'", double1 == 5.356564024018388d);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.179785437699879d + "'", double1 == 3.179785437699879d);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.7031839360032603E-108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7031839360032603E-108d + "'", double1 == 1.7031839360032603E-108d);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.5243549E-29f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-95) + "'", int1 == (-95));
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9021813597714503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4649742464968374d + "'", double1 == 1.4649742464968374d);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.7687861752511085d, 0.848629212096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.624216256515976d + "'", double2 == 0.624216256515976d);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1024.0000003439764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.384186E-7f + "'", float1 == 2.384186E-7f);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.2491947060601294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.4016131876221174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4255708704179856d + "'", double1 == 0.4255708704179856d);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.545160918273219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2430450186027935d + "'", double1 == 1.2430450186027935d);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.048008891512491894d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 1.2599960997248316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.1920929E-7f, 8.699271704857068E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078125E-7d + "'", double2 == 1.1920928955078125E-7d);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 97.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5849675565215335d + "'", double1 == 4.5849675565215335d);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.1760912590556813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 181.97662449228235d + "'", double1 == 181.97662449228235d);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.176194859519057E-53d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.176194859519057E-53d + "'", double1 == 4.176194859519057E-53d);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.39592515018183416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.333557385554463d + "'", double1 == 0.333557385554463d);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.0995616862503343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(18629.058771181848d, (double) 17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18629.058771181844d + "'", double2 == 18629.058771181844d);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        long long2 = org.apache.commons.math3.util.FastMath.max(1023L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023L + "'", long2 == 1023L);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.2894284851066637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1433134923316977d) + "'", double1 == (-1.1433134923316977d));
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(35.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.000008f + "'", float1 == 35.000008f);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.4210854715202004E-14d, (double) 22025.998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.998046875d + "'", double2 == 22025.998046875d);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(750.0030809757644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.313224939490047d + "'", double1 == 7.313224939490047d);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(5.954325598830174d, 1.5258789061907882E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.954325598830174d + "'", double2 == 5.954325598830174d);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-1.26765045E30f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-97.0f), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-97.0f) + "'", float2 == (-97.0f));
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.956763478491886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992687429159126d + "'", double1 == 0.9992687429159126d);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0842023E-19f + "'", float1 == 1.0842023E-19f);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 75L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7332419967990015E32d + "'", double1 == 3.7332419967990015E32d);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.0799873446393424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.064649704370918d + "'", double1 == 4.064649704370918d);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.384186E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.452146029569111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.272273108766264d + "'", double1 == 3.272273108766264d);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6209036226920994d, (-0.09709247702671989d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9541884483339822d + "'", double2 == 0.9541884483339822d);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 328281L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.394772408476724d + "'", double1 == 13.394772408476724d);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.6578630036664289d), 0.3915327099543454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12520241624226192d + "'", double2 == 0.12520241624226192d);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        int int2 = org.apache.commons.math3.util.FastMath.max(35, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-44.55243935826922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.55243935826922d + "'", double1 == 44.55243935826922d);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-6L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29100619138474915d + "'", double1 == 0.29100619138474915d);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.7005101697610547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02967950142597812d + "'", double1 == 0.02967950142597812d);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.6717532003326169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6717532003326169d + "'", double1 == 0.6717532003326169d);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.4E-44f, (float) 6400L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.625595310085968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1547339819947946d + "'", double1 == 2.1547339819947946d);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.3132686642828073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5209433468353801d + "'", double1 == 1.5209433468353801d);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1.03079207E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.03079206912E11d + "'", double1 == 1.03079206912E11d);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        float float2 = org.apache.commons.math3.util.FastMath.min((-6912.0f), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6912.0f) + "'", float2 == (-6912.0f));
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7687861752511085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7187551267105248d + "'", double1 == 0.7187551267105248d);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-57.1143461733168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.0d) + "'", double1 == (-57.0d));
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.7182818284590455d, 23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 255370.74139618516d + "'", double2 == 255370.74139618516d);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 75);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        double double2 = org.apache.commons.math3.util.FastMath.min(6.811682183676626d, (-3.8559846071046557d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.8559846071046557d) + "'", double2 == (-3.8559846071046557d));
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014608467389253983d) + "'", double1 == (-0.014608467389253983d));
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-5.877472E-39f), 3.814697720372351E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(99.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(328280.6350011744d, 58.224363167035406d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 328280.6401645561d + "'", double2 == 328280.6401645561d);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.6370408237133427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.472691046113234d + "'", double1 == 2.472691046113234d);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.973642758047122E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.7500000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2946832846768448d + "'", double1 == 1.2946832846768448d);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.6413706132531851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.684434645507153d, (-95));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.938953933193034E-64d + "'", double2 == 1.938953933193034E-64d);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8480576692493907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 75.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.31748811353631d + "'", double1 == 4.31748811353631d);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5060119336077026E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5060119336077026E83d + "'", double1 == 1.5060119336077026E83d);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.2169445E35f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.972578244439181E36d + "'", double1 == 6.972578244439181E36d);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(200.3351263076086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11478.35722564624d + "'", double1 == 11478.35722564624d);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-2.0879347118439774E-43d), (double) 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0879347118439774E-43d + "'", double2 == 2.0879347118439774E-43d);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.40180391273652716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.920357019063927d + "'", double1 == 0.920357019063927d);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1064.7142582646527d, 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.551070328970187E21d + "'", double2 == 1.551070328970187E21d);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        int int1 = org.apache.commons.math3.util.FastMath.round(32.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1018, (long) 53248);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53248L + "'", long2 == 53248L);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-57.0d), 18);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4942208E7d) + "'", double2 == (-1.4942208E7d));
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(32.000004f, 1.1982426812833557E29d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000008f + "'", float2 == 32.000008f);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-57.1143461733168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.1872445334363896E24d) + "'", double1 == (-3.1872445334363896E24d));
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.01318058956493249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-106), (double) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-105.99999f) + "'", float2 == (-105.99999f));
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.5380757678599976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5380757678599976d + "'", double1 == 0.5380757678599976d);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.4890291189784026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 3.9999998f, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.4E-44f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.7897890063461337d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.16589945506899414d, (-0.22011573792157446d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-63));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-62.99999999999999d) + "'", double1 == (-62.99999999999999d));
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.4302079958348105E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028300622637313404d + "'", double1 == 0.028300622637313404d);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-17));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4096, (long) (-106));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 1, 1018L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.1961161351381842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19739555984988094d + "'", double1 == 0.19739555984988094d);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.7320508075688774d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(6.932447891572509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.93244789157251d + "'", double1 == 6.93244789157251d);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2), (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.155183333204203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1746053747553624d + "'", double1 == 3.1746053747553624d);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.38991180981351d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 2L, 0.3155379877120162d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(31.594603878732347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.59460387873235d + "'", double1 == 31.59460387873235d);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.972630067242408d) + "'", double1 == (-0.972630067242408d));
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1025, (-0.6669829823489768d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5714470418077833d + "'", double2 == 1.5714470418077833d);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(99.99999f, 138.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.005970039541977278d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0419684648175772E-4d) + "'", double1 == (-1.0419684648175772E-4d));
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 2.5243549E-29f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 4L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.723507742868687E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.723507743E9d + "'", double1 == 2.723507743E9d);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0698934839162715d, 0.193615433083745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0698934839162715d + "'", double2 == 1.0698934839162715d);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1500.0003333332963d, 1.0001761935342754d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1501.9343928329747d + "'", double2 == 1501.9343928329747d);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.9999902065507035d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999902065507035d + "'", double2 == 0.9999902065507035d);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(148.41315910257663d, (-4.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.46705289324876d + "'", double2 == 148.46705289324876d);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9706244805940947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3278128830900011d + "'", double1 == 1.3278128830900011d);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.3931722845112914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.414768062680135d) + "'", double1 == (-0.414768062680135d));
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 63L, (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 19.999998f, 18.582769399647436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9754659633069416d + "'", double2 == 0.9754659633069416d);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        float float2 = org.apache.commons.math3.util.FastMath.max(76.0f, (float) (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 76.0f + "'", float2 == 76.0f);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.396685334941981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4868879847381629d + "'", double1 == 1.4868879847381629d);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 22026.002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707509259090962d + "'", double1 == 1.5707509259090962d);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-1.564085018163574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-148.99999999999804d) + "'", double1 == (-148.99999999999804d));
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.675935607488626d) + "'", double1 == (-14.675935607488626d));
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(9.99997885272489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932207207429933d + "'", double1 == 2.9932207207429933d);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.1359036E-25f, (-4.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1359036E-25f + "'", float2 == 4.1359036E-25f);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.0017254937309181954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.011554682704359E-5d) + "'", double1 == (-3.011554682704359E-5d));
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 53247.996f, (-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53247.99609374999d + "'", double2 == 53247.99609374999d);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        double double1 = org.apache.commons.math3.util.FastMath.log10(164140.86262767154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.215216711489161d + "'", double1 == 5.215216711489161d);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6262876474165445E-23d, (-0.7400166479096761d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.3129623428552976E16d + "'", double2 == 7.3129623428552976E16d);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 9223372036854775807L, (double) (-17.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233715E18f + "'", float2 == 9.2233715E18f);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 458L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 458 + "'", int1 == 458);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.8715802485510056E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-18));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18L + "'", long1 == 18L);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 76, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(49.99500000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-4.185891831851989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.185891831851988d) + "'", double1 == (-4.185891831851988d));
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(750.0000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 12.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6358572501411002d) + "'", double1 == (-0.6358572501411002d));
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 54.1199089796844d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-106));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.026544854745010848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1629259179658376d + "'", double1 == 0.1629259179658376d);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9353866470427131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06679530892297404d) + "'", double1 == (-0.06679530892297404d));
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-458));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.3513335921151082d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 9.2233709E18f, (double) 1.1529215E18f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223370937343148E18d + "'", double2 == 9.223370937343148E18d);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 52.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.051758E-5f, 0.12520241624226192d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0517585E-5f + "'", float2 == 3.0517585E-5f);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-57.1143461733168d), 2.850338976445283E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.850338976445283E14d + "'", double2 == 2.850338976445283E14d);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.361831799193183E34d, 4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6855647465563859d) + "'", double2 == (-1.6855647465563859d));
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.298292365610486d, (-62.99999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.395725598471343E-46d + "'", double2 == 2.395725598471343E-46d);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-44.3614195558365d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1920928E-7f, (-1.5707860170342276d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.19209275E-7f + "'", float2 == 1.19209275E-7f);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6033115335528957d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6033115335528957d + "'", double2 == 0.6033115335528957d);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.0f, (-97.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-97.0f) + "'", float2 == (-97.0f));
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 22026L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 384.426221044271d + "'", double1 == 384.426221044271d);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1638400.1f, 1.0124843102732666d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1638400.0f + "'", float2 == 1638400.0f);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (-17));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.552211244862155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9369601382566869d + "'", double1 == 0.9369601382566869d);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        float float2 = org.apache.commons.math3.util.FastMath.min((-0.9999999f), 512.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.9999999f) + "'", float2 == (-0.9999999f));
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.003173546455298d + "'", double1 == 3.003173546455298d);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.4711276648614138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02567602146900736d + "'", double1 == 0.02567602146900736d);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9875650456761652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        int int2 = org.apache.commons.math3.util.FastMath.max((-6), 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        double double1 = org.apache.commons.math3.util.FastMath.acos(63.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.2913289205442933d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27490521305142845d + "'", double1 == 0.27490521305142845d);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.7208914127261735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8050876807284643d) + "'", double1 == (-0.8050876807284643d));
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.163085598195192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9921249019112125d + "'", double1 == 0.9921249019112125d);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(5.983978114526449E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.983978114544353E-12d + "'", double1 == 5.983978114544353E-12d);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        long long2 = org.apache.commons.math3.util.FastMath.max(458L, 4294967296L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4294967296L + "'", long2 == 4294967296L);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        double double1 = org.apache.commons.math3.util.FastMath.floor(10.882734304052615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-41), 0.0771875889955993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-41.0d) + "'", double2 == (-41.0d));
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 2.3841858E-7f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.384185791015625E-7d + "'", double2 == 2.384185791015625E-7d);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(27.386127875258307d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 52.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.951243865300542d + "'", double1 == 3.951243865300542d);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        int int1 = org.apache.commons.math3.util.FastMath.round((-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1759.4875643140501d, 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.647156080594096E25d + "'", double2 == 6.647156080594096E25d);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.026928583045972357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026931838645756087d + "'", double1 == 0.026931838645756087d);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0000000000000042E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000001E10d + "'", double1 == 1.0000000001E10d);
    }
}

