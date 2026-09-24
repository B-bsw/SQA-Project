package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.04744296789287678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047478595403964284d + "'", double1 == 0.047478595403964284d);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8595318579974747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015001660947840287d + "'", double1 == 0.015001660947840287d);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0497881796611646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3142624216984847d + "'", double1 == 0.3142624216984847d);
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        int int2 = org.apache.commons.math.util.FastMath.min(26, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7044288495501951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13323515056598115d) + "'", double1 == (-0.13323515056598115d));
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.159449696805132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        double double1 = org.apache.commons.math.util.FastMath.atan(50.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.551072352769543d + "'", double1 == 1.551072352769543d);
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3026405418156002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3072816183413566d + "'", double1 == 0.3072816183413566d);
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2110908904786682E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110982242139993E-5d + "'", double1 == 1.2110982242139993E-5d);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        double double2 = org.apache.commons.math.util.FastMath.min(2.899417119369014E-4d, (-0.029468377407925152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.029468377407925152d) + "'", double2 == (-0.029468377407925152d));
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8931193992435265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46656342243821886d + "'", double1 == 0.46656342243821886d);
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        double double1 = org.apache.commons.math.util.FastMath.ceil(56.25580735763506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1776486171538092d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.47612948991158704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38942345262260686d + "'", double1 == 0.38942345262260686d);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2598597557151618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5249271018183177d + "'", double1 == 2.5249271018183177d);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9786883441146831d), 0.027670648769195613d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9786883441146831d) + "'", double2 == (-0.9786883441146831d));
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515679276951895d + "'", double1 == 1.5515679276951895d);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6098494453571868d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        double double2 = org.apache.commons.math.util.FastMath.atan2(31.0d, 5.824846225420071E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707775369683652d + "'", double2 == 1.5707775369683652d);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.6604007228000894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1900628023411102d + "'", double1 == 0.1900628023411102d);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7806737720297888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013625327705883431d + "'", double1 == 0.013625327705883431d);
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5619730447758076d, 1.0000823799461538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000823799461538d + "'", double2 == 1.0000823799461538d);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        long long1 = org.apache.commons.math.util.FastMath.round(3.1400656231999866d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.16571020934276798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4043181929877973d + "'", double1 == 1.4043181929877973d);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 31L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        double double1 = org.apache.commons.math.util.FastMath.atanh(187.34742828514646d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.922505433355371E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0011015144742223212d + "'", double1 == 0.0011015144742223212d);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        long long1 = org.apache.commons.math.util.FastMath.round(4.675016391586134d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.49186351728990335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        double double2 = org.apache.commons.math.util.FastMath.max(45.17197351819585d, 1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.17197351819585d + "'", double2 == 45.17197351819585d);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6588988415573005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2879824694293398d + "'", double1 == 1.2879824694293398d);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        double double2 = org.apache.commons.math.util.FastMath.min((-4.716136598735705d), 169.42101997711706d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.716136598735705d) + "'", double2 == (-4.716136598735705d));
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        double double1 = org.apache.commons.math.util.FastMath.exp(104.06639041664195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.568408219180732E45d + "'", double1 == 1.568408219180732E45d);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.8994170381213606E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5376893133346528d) + "'", double1 == (-3.5376893133346528d));
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5569432209472811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7462862861846525d + "'", double1 == 0.7462862861846525d);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6625147656574195d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-111.63986321151813d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(57.29577951308234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8551464208140986d + "'", double1 == 3.8551464208140986d);
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.675640048483193E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.677934571594396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8784747043354492d + "'", double1 == 0.8784747043354492d);
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        double double1 = org.apache.commons.math.util.FastMath.cosh(794.344456722457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.155849014780759d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2110654506974416E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110654506974416E-19d + "'", double1 == 1.2110654506974416E-19d);
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        long long1 = org.apache.commons.math.util.FastMath.round(2.717906776707044d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.08510319447875853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9999999999999996d) + "'", double1 == (-2.9999999999999996d));
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.281047928335586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8567638683085653d + "'", double1 == 0.8567638683085653d);
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5385290260103368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.657733824090901d + "'", double1 == 3.657733824090901d);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.358053923774534E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3574902236589466E-4d + "'", double1 == 3.3574902236589466E-4d);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7675283643313483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6454899392731472d + "'", double1 == 0.6454899392731472d);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.9269488944079232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.868521653837575d + "'", double1 == 6.868521653837575d);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.6145485553432248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2080511103631155d + "'", double1 == 0.2080511103631155d);
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5573656314890014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027181157926883755d + "'", double1 == 0.027181157926883755d);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6908159092322977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.8634651242655194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 97864804714L, 20.399552596494082d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5990573688262014E224d + "'", double2 == 1.5990573688262014E224d);
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.555769423778169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1584562587899128d + "'", double1 == 1.1584562587899128d);
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1108.4556657549201d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0f + "'", float1 == 9.0f);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2725138805025834d + "'", double1 == 0.2725138805025834d);
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.748066E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.439335651251554d + "'", double1 == 17.439335651251554d);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1820604684682068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        long long2 = org.apache.commons.math.util.FastMath.min(6061L, 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4561916900643846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5780528128207831d + "'", double1 == 1.5780528128207831d);
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7493933565307835d, (-89.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1219390793339943d + "'", double2 == 3.1219390793339943d);
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        double double1 = org.apache.commons.math.util.FastMath.signum(185.47866641176898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.6604007228000894d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(116.29021260843672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.029647097861444d + "'", double1 == 2.029647097861444d);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(13.845300947487887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24164608746315416d + "'", double1 == 0.24164608746315416d);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2286446715540403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2568953489826145d + "'", double1 == 1.2568953489826145d);
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        long long1 = org.apache.commons.math.util.FastMath.abs(5L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4043181929877973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16571020934276787d + "'", double1 == 0.16571020934276787d);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.026147060205699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6336342900042088d) + "'", double1 == (-0.6336342900042088d));
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.09180265859838255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.12186934340514759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12247628949473413d + "'", double1 == 0.12247628949473413d);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.0013377555385146109d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0013377555385146107d) + "'", double1 == (-0.0013377555385146107d));
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0318224457943774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        double double1 = org.apache.commons.math.util.FastMath.rint(916.7324722093172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 917.0d + "'", double1 == 917.0d);
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8845500881248141d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0855285725376713d) + "'", double1 == (-1.0855285725376713d));
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9075541030048625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9526563404527691d + "'", double1 == 0.9526563404527691d);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.65292812185E-312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8849038025E-314d + "'", double1 == 2.8849038025E-314d);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        float float2 = org.apache.commons.math.util.FastMath.min(145.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6061L, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        double double1 = org.apache.commons.math.util.FastMath.exp(31.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9048849665247426E13d + "'", double1 == 2.9048849665247426E13d);
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.014382967415158656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014381975696922048d) + "'", double1 == (-0.014381975696922048d));
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        double double2 = org.apache.commons.math.util.FastMath.max(1.156864174916083E21d, 4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.156864174916083E21d + "'", double2 == 1.156864174916083E21d);
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5792809126705765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5792809126705765d + "'", double1 == 0.5792809126705765d);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        double double1 = org.apache.commons.math.util.FastMath.rint(86.97925790240271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.0d + "'", double1 == 87.0d);
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        double double2 = org.apache.commons.math.util.FastMath.max(0.08106152637093929d, (-0.08298661180557045d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08106152637093929d + "'", double2 == 0.08106152637093929d);
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3593642103115025d, 0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999092042625951d + "'", double2 == 0.9999092042625951d);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.613248695272591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010703208866066098d + "'", double1 == 0.010703208866066098d);
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 26, 18.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6552377416047083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011436055974333992d + "'", double1 == 0.011436055974333992d);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.14436016288910877d), 0.7675283643313484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.14436016288910875d) + "'", double2 == (-0.14436016288910875d));
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3276676988791267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6894104737616445d + "'", double1 == 0.6894104737616445d);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9337643921132143d, (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9337643921132144d + "'", double2 == 0.9337643921132144d);
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        double double1 = org.apache.commons.math.util.FastMath.cosh(10.693147180044656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806703d + "'", double1 == 22026.465794806703d);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904824216d) + "'", double1 == (-0.41032129904824216d));
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4315459888945143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4604935143691005d) + "'", double1 == (-0.4604935143691005d));
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7777181923662807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6797686131578042d + "'", double1 == 0.6797686131578042d);
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4768639242040633d + "'", double1 == 0.4768639242040633d);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.1219390793339943d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.009972525083085703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        double double2 = org.apache.commons.math.util.FastMath.max(2.8421709430404007E-14d, 2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.993222846126381d + "'", double2 == 2.993222846126381d);
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.04747861148694368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04749646746707084d + "'", double1 == 0.04749646746707084d);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 573, (float) 6061L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6061.0f + "'", float2 == 6061.0f);
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.027708598556821548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30260180916397406d + "'", double1 == 0.30260180916397406d);
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.27781241944192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3411556794582669d + "'", double1 == 1.3411556794582669d);
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-3.6478005095231385d), 0.5663169859928074d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.647800509523138d) + "'", double2 == (-3.647800509523138d));
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.716003343634799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029949908321658922d + "'", double1 == 0.029949908321658922d);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.691649480399091E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        double double1 = org.apache.commons.math.util.FastMath.log(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574657835069204d + "'", double1 == 4.574657835069204d);
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        double double1 = org.apache.commons.math.util.FastMath.signum(99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.02670066439081122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003564839175727d + "'", double1 == 1.0003564839175727d);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.05482909570415162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.054801661324977324d + "'", double1 == 0.054801661324977324d);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3689877298052193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.170037490769086d + "'", double1 == 1.170037490769086d);
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9966529754586305d) + "'", double1 == (-0.9966529754586305d));
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 4.810477380965351d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2725138805025834d, (-0.40908917437285713d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7020660139843184d + "'", double2 == 1.7020660139843184d);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.001337755538514611d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1101857890167285d) + "'", double1 == (-0.1101857890167285d));
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4078300410496931d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38662864041595896d) + "'", double1 == (-0.38662864041595896d));
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1891529137764139d + "'", double1 == 1.1891529137764139d);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        double double2 = org.apache.commons.math.util.FastMath.min(2.71827069403746d, (-0.3643047812382505d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3643047812382505d) + "'", double2 == (-0.3643047812382505d));
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        double double1 = org.apache.commons.math.util.FastMath.atan(220.50287227348372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.566261269568209d + "'", double1 == 1.566261269568209d);
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7144972908707885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7144972908707886d + "'", double1 == 0.7144972908707886d);
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        double double1 = org.apache.commons.math.util.FastMath.atan(103.35507978448088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5611212455169257d + "'", double1 == 1.5611212455169257d);
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.025676021633806945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025351928495140397d + "'", double1 == 0.025351928495140397d);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.8849038025E-314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8849038025E-314d + "'", double1 == 2.8849038025E-314d);
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.43361108619104427d, 4.702262890231486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.019658508809675648d + "'", double2 == 0.019658508809675648d);
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1891529137764139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1732412164843911d + "'", double1 == 0.1732412164843911d);
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-8.345153194998874d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2104.863863001364d + "'", double1 == 2104.863863001364d);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5792809126705765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8336103015735465d) + "'", double1 == (-0.8336103015735465d));
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        double double1 = org.apache.commons.math.util.FastMath.log(9.434905982971384E167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 386.7761267440676d + "'", double1 == 386.7761267440676d);
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.9624960684073707d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        double double1 = org.apache.commons.math.util.FastMath.asin(32.69314718055994d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.43442052080657195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        double double2 = org.apache.commons.math.util.FastMath.min((-36.736800569677094d), 0.19611987691520022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-36.736800569677094d) + "'", double2 == (-36.736800569677094d));
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.642595581083531E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-3.647800509523138d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5401776706283436E45d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        double double1 = org.apache.commons.math.util.FastMath.tan(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904825876d) + "'", double1 == (-0.41032129904825876d));
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5569432209472811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5285938486055354d + "'", double1 == 0.5285938486055354d);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04749646746707085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047514327475808714d + "'", double1 == 0.047514327475808714d);
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        double double1 = org.apache.commons.math.util.FastMath.rint(22025.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.0d + "'", double1 == 22025.0d);
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3689877298052193d, 1.5707963267948457d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3689877298052195d + "'", double2 == 1.3689877298052195d);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.044033658705184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6940658945086007E-21d, (-0.012836499881563112d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6483608274590842d, 2104.8636254562957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6483608274590843d + "'", double2 == 0.6483608274590843d);
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.6043506968245094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.522442286918901d + "'", double1 == 13.522442286918901d);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6507779951543295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7614327327621273d + "'", double1 == 0.7614327327621273d);
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0997245430382512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6681507037242218d + "'", double1 == 1.6681507037242218d);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9998542144022069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017450748081259817d) + "'", double1 == (-0.017450748081259817d));
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5707963267936305d, 1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267936302d + "'", double2 == 1.5707963267936302d);
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-4.1451683936911605d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9994982660231281d) + "'", double1 == (-0.9994982660231281d));
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9698480248174192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6779563950113555d + "'", double1 == 0.6779563950113555d);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.117692795479829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9624876016981836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2960262299781737d + "'", double1 == 1.2960262299781737d);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.837300699980114E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.837300888630653E-4d + "'", double1 == 4.837300888630653E-4d);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8.442682412367938E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000356395d + "'", double1 == 1.0000000000356395d);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        double double2 = org.apache.commons.math.util.FastMath.max(52.00000000000001d, (-35.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.00000000000001d + "'", double2 == 52.00000000000001d);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9996157480449777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.278583561895402d + "'", double1 == 4.278583561895402d);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        double double1 = org.apache.commons.math.util.FastMath.abs(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.99999999999999d + "'", double1 == 99.99999999999999d);
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8236544498809605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9640275800758168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015910541093645102d) + "'", double1 == (-0.015910541093645102d));
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.4161468365471424d), 100.51992632180419d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.41614683654714235d) + "'", double2 == (-0.41614683654714235d));
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-4.716132424155146d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9910502745590536d) + "'", double1 == (-0.9910502745590536d));
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        int int1 = org.apache.commons.math.util.FastMath.round(22025.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22025 + "'", int1 == 22025);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4694426632156045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46944266321560457d + "'", double1 == 0.46944266321560457d);
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.08489862787744332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08139459933906179d) + "'", double1 == (-0.08139459933906179d));
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.6789823271282955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6725680697682985d + "'", double1 == 1.6725680697682985d);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        int int2 = org.apache.commons.math.util.FastMath.max(145, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.566261269568209d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2401310215141802E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2401310215141802E-16d + "'", double1 == 1.2401310215141802E-16d);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 573L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3953889504077017d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        float float2 = org.apache.commons.math.util.FastMath.min(8.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        double double1 = org.apache.commons.math.util.FastMath.atanh(51.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        double double2 = org.apache.commons.math.util.FastMath.max(0.23824322705557036d, 314.7524207034134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 314.7524207034134d + "'", double2 == 314.7524207034134d);
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9136034117448754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4932907187078306d + "'", double1 == 1.4932907187078306d);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.964384282367839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2676907246789413d + "'", double1 == 0.2676907246789413d);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        long long1 = org.apache.commons.math.util.FastMath.round((-7.3975854401035095d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-7L) + "'", long1 == (-7L));
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2304174960375769E11d, (-1.0258124639856192d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.204224718596143E-12d + "'", double2 == 4.204224718596143E-12d);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.017737032688675995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017738893077120243d + "'", double1 == 0.017738893077120243d);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.688117141816135E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3877159156483166d, 0.9756139057433201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3967785394904115d + "'", double2 == 0.3967785394904115d);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9247009288407589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2599210498948732d, 9.616441887145511E102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2599210498948734d + "'", double2 == 1.2599210498948734d);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.02670066439081122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02669432190897104d) + "'", double1 == (-0.02669432190897104d));
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        double double1 = org.apache.commons.math.util.FastMath.log10(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        double double1 = org.apache.commons.math.util.FastMath.acos(31.999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5791357593406526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5791357593406528d + "'", double1 == 0.5791357593406528d);
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4350981213052501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4648059638067725d + "'", double1 == 0.4648059638067725d);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.012836499881563112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9207813824870029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9916765892091398d, 0.46549581933118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9916765892091397d + "'", double2 == 0.9916765892091397d);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.172527850990744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.376687536538531d + "'", double1 == 2.376687536538531d);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5430770857878007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02693177575907612d + "'", double1 == 0.02693177575907612d);
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1900795435532183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0437346740099507d + "'", double1 == 1.0437346740099507d);
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.325178437245552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.487119795718273d + "'", double1 == 1.487119795718273d);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.14436016288910877d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        double double1 = org.apache.commons.math.util.FastMath.floor(15.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4043181929877973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5707660601741342d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8278068656280009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1811276859692628d + "'", double1 == 1.1811276859692628d);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5005983596580951d, 22.597055569270644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5005983596580951d + "'", double2 == 0.5005983596580951d);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3276676988791268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1157552973174212d) + "'", double1 == (-1.1157552973174212d));
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5447568000938525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.50804501951195d + "'", double1 == 88.50804501951195d);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7718336803958262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.572014987956012d + "'", double1 == 0.572014987956012d);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(113.8351333444046d, 0.2501327124042694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 113.83513334440458d + "'", double2 == 113.83513334440458d);
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        float float1 = org.apache.commons.math.util.FastMath.abs(145.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 145.0f + "'", float1 == 145.0f);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.08883176481419076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        int int1 = org.apache.commons.math.util.FastMath.round((-2.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.267831587699267d, 4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1164.1175712113197d + "'", double2 == 1164.1175712113197d);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        double double2 = org.apache.commons.math.util.FastMath.max(0.677934571594396d, 0.027705053070945423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.677934571594396d + "'", double2 == 0.677934571594396d);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6946461479871102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.09607204776374d + "'", double1 == 97.09607204776374d);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7571699146056852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030668400526856803d + "'", double1 == 0.030668400526856803d);
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.239487368601187E31d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5695141467684478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8421630577599043d + "'", double1 == 0.8421630577599043d);
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3414179241869126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0797696988252596d, 4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0797696988252599d + "'", double2 == 1.0797696988252599d);
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.6588988415573005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02895324674269463d + "'", double1 == 0.02895324674269463d);
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 145, (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17979457111788427d) + "'", double1 == (-0.17979457111788427d));
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.286032070646461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7393910596966158d + "'", double1 == 0.7393910596966158d);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.18838862103418863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18950492734531413d + "'", double1 == 0.18950492734531413d);
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-36.91281425065235d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.1855931757113756E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15179996136176638d + "'", double1 == 0.15179996136176638d);
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2780447199016436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5558853478064775d) + "'", double1 == (-0.5558853478064775d));
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0547920720722763d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8135279227115659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6715318396690159d) + "'", double1 == (-0.6715318396690159d));
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9879690512915179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.111770234441798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.46077005725419d + "'", double1 == 22.46077005725419d);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3239195328189275d + "'", double1 == 1.3239195328189275d);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.08139459933906179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.001337755538514611d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.14466555184225383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1556529996109892d + "'", double1 == 1.1556529996109892d);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4677992676220697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0546210580295705d + "'", double1 == 2.0546210580295705d);
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.001137172509454239d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0011371729996371193d) + "'", double1 == (-0.0011371729996371193d));
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9990920390306268d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990920390306268d + "'", double1 == 0.9990920390306268d);
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.01773703268867599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.095696199512584E-4d + "'", double1 == 3.095696199512584E-4d);
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7320508075688772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9867717342662448d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        double double1 = org.apache.commons.math.util.FastMath.floor((-90.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-90.0d) + "'", double1 == (-90.0d));
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9526563404527691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.42206715285395996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1350720090231239d + "'", double1 == 1.1350720090231239d);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.630107219510141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4894731122556734d + "'", double1 == 0.4894731122556734d);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6321205588285577d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(572.9577951308232d, (-0.9158465150847866d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 572.9577951308231d + "'", double2 == 572.9577951308231d);
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.3922026785961111d), 0.02347666707911227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5110091575633238d) + "'", double2 == (-1.5110091575633238d));
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.1855931757113756E16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        double double1 = org.apache.commons.math.util.FastMath.exp(8.123795169711219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3373.800624777237d + "'", double1 == 3373.800624777237d);
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3010525128752803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31048985231669685d + "'", double1 == 0.31048985231669685d);
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.02604835893450624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29643316379434637d + "'", double1 == 0.29643316379434637d);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.619035187754997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6653943626343264d + "'", double1 == 1.6653943626343264d);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5030754111237369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6537995713645458d + "'", double1 == 0.6537995713645458d);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198.57204013738644d + "'", double1 == 198.57204013738644d);
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.688117141816135E43d, 0.6555421614583431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6881171418161346E43d + "'", double2 == 2.6881171418161346E43d);
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.7167639596083E91d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0259126351421606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.227162898778971d + "'", double1 == 0.227162898778971d);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274785465052d + "'", double1 == 1.0232274785465052d);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6715318396690159d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7828694956525941d + "'", double1 == 0.7828694956525941d);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        long long1 = org.apache.commons.math.util.FastMath.round(4.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.092046153706293E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000409204699d + "'", double1 == 1.000000409204699d);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        long long2 = org.apache.commons.math.util.FastMath.max(252318057L, 252318057L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318057L + "'", long2 == 252318057L);
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.43321775502441545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.095315644213873d + "'", double1 == 1.095315644213873d);
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5525884268785045E-18d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        double double1 = org.apache.commons.math.util.FastMath.rint(17.741263221749836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.0d + "'", double1 == 18.0d);
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        float float2 = org.apache.commons.math.util.FastMath.min(38.0f, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.809784758817254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9927738000811871d + "'", double1 == 0.9927738000811871d);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6750559827141311d, (-0.1559057424196283d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.063180265289355d + "'", double2 == 1.063180265289355d);
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        long long2 = org.apache.commons.math.util.FastMath.max((-7L), 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        float float1 = org.apache.commons.math.util.FastMath.abs(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.140655263641914E-9d, 1.3564962504917153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.408834622494818E-10d + "'", double2 == 8.408834622494818E-10d);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7054294284722258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7830288330849284d + "'", double1 == 0.7830288330849284d);
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-36.7368005696771d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2425230239169618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2425230239169618d + "'", double1 == 1.2425230239169618d);
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.9386097226368193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9944105305785783d + "'", double1 == 0.9944105305785783d);
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.8754094422318124E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8754094422318124E-18d + "'", double1 == 3.8754094422318124E-18d);
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.442682412367938E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1204413228389418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6961714618132557d + "'", double1 == 1.6961714618132557d);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.691649480399091E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.18317440686560532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18525095627631863d + "'", double1 == 0.18525095627631863d);
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.999933450804381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2915496650148839d, (-0.3922026785961111d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2915496650148839d + "'", double2 == 1.2915496650148839d);
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9998983798039537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.194268262590603d) + "'", double1 == (-9.194268262590603d));
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7593379915389414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5680722294658567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7909427726190764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7255801160921299d + "'", double1 == 0.7255801160921299d);
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4023976994865663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.064934783641962d + "'", double1 == 4.064934783641962d);
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7830288330849284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6712757054461316d + "'", double1 == 0.6712757054461316d);
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        double double1 = org.apache.commons.math.util.FastMath.abs(220.5028722734837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 220.5028722734837d + "'", double1 == 220.5028722734837d);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.551401785493842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7425643308790437d + "'", double1 == 0.7425643308790437d);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6108652381980153d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5323425837018869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5934084662501166d + "'", double1 == 0.5934084662501166d);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9994982660231281d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.109913766657001d + "'", double1 == 3.109913766657001d);
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2699081698724155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5605255838238796d + "'", double1 == 3.5605255838238796d);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015840105828908848d + "'", double1 == 0.015840105828908848d);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.14575846667616507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8740254132919673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1346458267562316d) + "'", double1 == (-0.1346458267562316d));
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0115470718397392d, 0.9518224930797358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9518224930797358d + "'", double2 == 0.9518224930797358d);
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.01913492915272034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01913259410521866d + "'", double1 == 0.01913259410521866d);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0963506817327158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5257228523581828d), 0.9999451923884265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5257228523581828d) + "'", double2 == (-0.5257228523581828d));
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8740254132919673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05847593957153261d) + "'", double1 == (-0.05847593957153261d));
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.46549581933118d, (-0.9545943990414509d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.687884041545413d + "'", double2 == 2.687884041545413d);
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9136034117448754d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        int int2 = org.apache.commons.math.util.FastMath.max(573, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 573 + "'", int2 == 573);
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 38, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.342925101645957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1746941190129174d + "'", double1 == 2.1746941190129174d);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.784425389995983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5974781997606962d + "'", double1 == 0.5974781997606962d);
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.140655263641914E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.942845591094487d) + "'", double1 == (-8.942845591094487d));
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 44L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2851600114359308E19d + "'", double1 == 1.2851600114359308E19d);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9998620166517991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.556935161647739d + "'", double1 == 1.556935161647739d);
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4328100205340815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.156905649464094d + "'", double1 == 1.156905649464094d);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.11087075938446825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3329726105619924d + "'", double1 == 0.3329726105619924d);
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        double double1 = org.apache.commons.math.util.FastMath.cos(185.47866641176898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9922350436600222d) + "'", double1 == (-0.9922350436600222d));
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9518224930797358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7406070204028499d + "'", double1 == 0.7406070204028499d);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9702957262762539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3333452696210846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7953789955635642d + "'", double1 == 0.7953789955635642d);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0003841043626869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543532148561955d + "'", double1 == 1.543532148561955d);
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5999857756436902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9529619711981727d + "'", double1 == 3.9529619711981727d);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1902899496825317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 38);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1086.6081402784184d, 1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1086.6081402784182d + "'", double2 == 1086.6081402784182d);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        double double1 = org.apache.commons.math.util.FastMath.cos(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9510980675063472d + "'", double1 == 0.9510980675063472d);
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.45158270528864863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4866866385819412d + "'", double1 == 0.4866866385819412d);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0009877980461306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000329157658725d + "'", double1 == 1.000329157658725d);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.02693177575907612d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2184249125858766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.719473597969312d + "'", double1 == 2.719473597969312d);
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.2233720368547748E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.38662864041595896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3866286404159589d) + "'", double1 == (-0.3866286404159589d));
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0347427151417616d, 0.054801661324977324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0347427151417616d + "'", double2 == 1.0347427151417616d);
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8492431649093556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8492431649093556d + "'", double1 == 0.8492431649093556d);
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 18L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        double double2 = org.apache.commons.math.util.FastMath.min(1.8218948327082145d, (-57.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-57.0d) + "'", double2 == (-57.0d));
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4430227241169228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0997501702946166d + "'", double1 == 1.0997501702946166d);
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        double double1 = org.apache.commons.math.util.FastMath.log(3.0605566643729682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1185968158812507d + "'", double1 == 1.1185968158812507d);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.1346458267562316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13546545818457925d) + "'", double1 == (-0.13546545818457925d));
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 8L, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.841104430236654E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.197664423181247E-5d + "'", double1 == 6.197664423181247E-5d);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9998037827419103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019810283960318427d + "'", double1 == 0.019810283960318427d);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        double double1 = org.apache.commons.math.util.FastMath.tan((-3.8485011312768047d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8541673877839708d) + "'", double1 == (-0.8541673877839708d));
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(117.61174253155806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6738.656468237557d + "'", double1 == 6738.656468237557d);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.165189640442122E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.165189640442122E-17d + "'", double1 == 7.165189640442122E-17d);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        float float2 = org.apache.commons.math.util.FastMath.min(57.0f, 573.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.784425389995983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        double double1 = org.apache.commons.math.util.FastMath.abs((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6268604078470186d + "'", double1 == 3.6268604078470186d);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6881824710286039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6881824710286039d + "'", double1 == 0.6881824710286039d);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.029949908321658922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029954387626321317d + "'", double1 == 0.029954387626321317d);
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.657733824090901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.37379252549111d + "'", double1 == 19.37379252549111d);
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.023271265020779454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02326916464517103d + "'", double1 == 0.02326916464517103d);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.551401785493842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8556343548213673d + "'", double1 == 0.8556343548213673d);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7493933565307835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9624960684073707d + "'", double1 == 2.9624960684073707d);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.5249271018183177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04406829129956775d + "'", double1 == 0.04406829129956775d);
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.325178437245552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3248054181561355d + "'", double1 == 1.3248054181561355d);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.4647579066758625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4962149926291224d + "'", double1 == 1.4962149926291224d);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6994983692632405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6994983692632406d + "'", double1 == 0.6994983692632406d);
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.643440755033571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9973625536928628d + "'", double1 == 0.9973625536928628d);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3800005942718698d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9437258688167108d + "'", double2 == 0.9437258688167108d);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 22025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-4.943508829600679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.13433525595926d + "'", double1 == 70.13433525595926d);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6832810232787436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1109771831925104d + "'", double1 == 1.1109771831925104d);
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9867978813066445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03467616460044844d + "'", double1 == 0.03467616460044844d);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.666140437719325E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.666140437719325E21d + "'", double1 == 3.666140437719325E21d);
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.7020660139843184d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.7929422793014347d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16646964819512283d + "'", double1 == 0.16646964819512283d);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.02670066439081122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9736526468163437d + "'", double1 == 0.9736526468163437d);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4336110861910443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.408334722591744d + "'", double1 == 0.408334722591744d);
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.0920461537065214E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.560229461916166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07959101875688647d + "'", double1 == 0.07959101875688647d);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        double double2 = org.apache.commons.math.util.FastMath.min(0.02057603387904735d, 1.5999857756436902d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02057603387904735d + "'", double2 == 0.02057603387904735d);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.4825777280150008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2477727460250425d + "'", double1 == 1.2477727460250425d);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.156905649464094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.5574077246548148d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7893184915864477d) + "'", double1 == (-0.7893184915864477d));
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        double double1 = org.apache.commons.math.util.FastMath.cosh(68.94253586247545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.368505610608687E29d + "'", double1 == 4.368505610608687E29d);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.16227766016838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5792809126705765d, 1.9936116249145202d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9936116249145202d + "'", double2 == 1.9936116249145202d);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2848536225107588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2885829000440232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.117692795479829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.117692795479829d + "'", double1 == 1.117692795479829d);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2725138805025834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0373622735664414d + "'", double1 == 1.0373622735664414d);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.915504000358288E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4194304.0d + "'", double1 == 4194304.0d);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        double double1 = org.apache.commons.math.util.FastMath.rint(50.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.0d + "'", double1 == 51.0d);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0758711123132111d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.02321157953304928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6342953050784887d) + "'", double1 == (-1.6342953050784887d));
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6636920174428667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2822642133870938d + "'", double1 == 1.2822642133870938d);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3686469200204923d + "'", double1 == 1.3686469200204923d);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.02109732960109633d, 5.954844600830958E183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        long long1 = org.apache.commons.math.util.FastMath.round(23.62434292201784d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24L + "'", long1 == 24L);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.04636973784987636d, 5.184705528587072E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.943562482807576E-24d + "'", double2 == 8.943562482807576E-24d);
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        double double1 = org.apache.commons.math.util.FastMath.ceil(21.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.35992209475067005d, 96.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003749170920418732d + "'", double2 == 0.003749170920418732d);
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        long long2 = org.apache.commons.math.util.FastMath.max(573L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.974903989667673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06937516207035956d + "'", double1 == 0.06937516207035956d);
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        double double2 = org.apache.commons.math.util.FastMath.min(1.8002419211835452d, 2.147483647E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8002419211835452d + "'", double2 == 1.8002419211835452d);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5703212366690238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2531245894439322d + "'", double1 == 1.2531245894439322d);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 26L, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.819513221744016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        long long2 = org.apache.commons.math.util.FastMath.max(31L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.1256138592702154d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.9225054334737986E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9224869535749408E-5d + "'", double1 == 1.9224869535749408E-5d);
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.02678524629463562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.47627435869419515d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.288510643477288d) + "'", double1 == (-27.288510643477288d));
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.12125048919205E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.17410381825958643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.395800713121622d + "'", double1 == 1.395800713121622d);
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3873669366539792d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6823165548747481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8334357964461425d + "'", double1 == 0.8334357964461425d);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        double double1 = org.apache.commons.math.util.FastMath.rint(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0016554297339535329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999996693227694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.8076350433445d + "'", double1 == 7.8076350433445d);
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.2621221781635565E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0482269650408d + "'", double1 == 36.0482269650408d);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.0d) + "'", double1 == (-89.0d));
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 57);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.18115285874844744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5658244769790579d + "'", double1 == 0.5658244769790579d);
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5611212455169257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02724670575710512d + "'", double1 == 0.02724670575710512d);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.0034419884227690025d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4386368936167206d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8030064940059782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6657142123412991d + "'", double1 == 0.6657142123412991d);
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1474836470000002E9d + "'", double1 == 2.1474836470000002E9d);
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.1186432080671145d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-64.09353460322046d) + "'", double1 == (-64.09353460322046d));
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.01153673179946589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000665488284177d + "'", double1 == 1.0000665488284177d);
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        double double1 = org.apache.commons.math.util.FastMath.expm1(65.16375280274023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9964491924882743E28d + "'", double1 == 1.9964491924882743E28d);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9642258512973702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.04406829129956775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04405404020821298d + "'", double1 == 0.04405404020821298d);
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4430227241169228d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.149071860492834d, 82.84379293103548d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.169084941497005E58d + "'", double2 == 9.169084941497005E58d);
    }
}

