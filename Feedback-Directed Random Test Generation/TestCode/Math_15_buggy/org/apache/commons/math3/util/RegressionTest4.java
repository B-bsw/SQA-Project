package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(6.8556837405048565d, (-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11977834331526022d) + "'", double2 == (-0.11977834331526022d));
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17702174851391653d + "'", double1 == 0.17702174851391653d);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.4716190657154944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0633645101086056d + "'", double1 == 2.0633645101086056d);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 32, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.942437867146782d), 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-2.204438512506361d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.252646034500078d + "'", double1 == 16.252646034500078d);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.248715438260383d + "'", double1 == 22.248715438260383d);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.4111572870929613E-29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4111572870929613E-29d + "'", double1 == 1.4111572870929613E-29d);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(5.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1018);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1018 + "'", int1 == 1018);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(631011.7625152355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        float float1 = org.apache.commons.math3.util.FastMath.signum(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.37928799478267644d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-149.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.23422432986760747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23208856521353044d) + "'", double1 == (-0.23208856521353044d));
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2261911708835171d) + "'", double1 == (-1.2261911708835171d));
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.6795276293349446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5185125808637102d + "'", double1 == 0.5185125808637102d);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-7.016027794960618d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.973830118957931E-4d + "'", double1 == 8.973830118957931E-4d);
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.41032129904824216d, 7.668093098623077E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41032129904824216d + "'", double2 == 0.41032129904824216d);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.2247201030232695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.687883945229643d + "'", double1 == 2.687883945229643d);
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 750L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 750.00006f + "'", float1 == 750.00006f);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9426286359925615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7364276427422787d + "'", double1 == 0.7364276427422787d);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.38991180981351d), 1.5563207343123242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3899118098135099d) + "'", double2 == (-0.3899118098135099d));
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        double double1 = org.apache.commons.math3.util.FastMath.sin(39.803104571515284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8611867780249577d + "'", double1 == 0.8611867780249577d);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(9.506835355571496E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1659255.7839972847d + "'", double1 == 1659255.7839972847d);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-2.9405615342893493E8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9353866470427131d, 1.155183333204203d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9353866470427131d + "'", double2 == 0.9353866470427131d);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.2998044433940747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7561974449853123d + "'", double1 == 0.7561974449853123d);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1833.464944418634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33879047458320544d + "'", double1 == 0.33879047458320544d);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 100, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.002893947719693431d, (-44.3614195558365d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.002893947719693431d) + "'", double2 == (-0.002893947719693431d));
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(31.99999809265137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.159127075050616d + "'", double1 == 4.159127075050616d);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 127);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.449489742783178d + "'", double1 == 2.449489742783178d);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        int int1 = org.apache.commons.math3.util.FastMath.abs(750);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 750 + "'", int1 == 750);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4096.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 750.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.1826881112499317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.03500342028484d + "'", double1 == 12.03500342028484d);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 97.00001f, 1.5640850181635741d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.01261692195835d + "'", double2 == 97.01261692195835d);
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        double double2 = org.apache.commons.math3.util.FastMath.pow(101.0d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.04060401E8d + "'", double2 == 1.04060401E8d);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 10, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.7853981633974483d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(10.079368399158986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23844.919681868952d + "'", double1 == 23844.919681868952d);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.561238198427539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7528415227961107d + "'", double1 == 0.7528415227961107d);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1023.0f, (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(53248.0f, 114.59155902616465d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53247.996f + "'", float2 == 53247.996f);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(32.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000008f + "'", float1 == 32.000008f);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1024, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.9999998f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9999998f + "'", float2 == 3.9999998f);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-2.9405615342893493E8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 3.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.067664384225559d + "'", double1 == 10.067664384225559d);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-96.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6916735960212525E41d + "'", double1 == 6.6916735960212525E41d);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.6643855961249147d, 22026);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        long long2 = org.apache.commons.math3.util.FastMath.min(2L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.026535507103947666d, 0.9169970877394357d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026535507103947666d + "'", double2 == 0.026535507103947666d);
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9998646693394199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5404161777443722d + "'", double1 == 0.5404161777443722d);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.09252791806716626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09252791806716626d + "'", double1 == 0.09252791806716626d);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.662514762151963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9792710754903938d + "'", double1 == 0.9792710754903938d);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.380515006246586d) + "'", double1 == (-3.380515006246586d));
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.0836962511904766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7341433604804716d + "'", double1 == 0.7341433604804716d);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05235987755982989d) + "'", double1 == (-0.05235987755982989d));
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-54) + "'", int1 == (-54));
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(7.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0000005f + "'", float1 == 7.0000005f);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.536743E-7f, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536743E-7f + "'", float2 == 9.536743E-7f);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.23422432986760747d), (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.012849789557351724d) + "'", double2 == (-0.012849789557351724d));
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4, 22026L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22026L + "'", long2 == 22026L);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.04687067344618581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        float float2 = org.apache.commons.math3.util.FastMath.min(12.000001f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        double double2 = org.apache.commons.math3.util.FastMath.min(10.052274715955628d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.6217880014903024d, 6.932447891572509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6217880014903024d + "'", double2 == 0.6217880014903024d);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        float float1 = org.apache.commons.math3.util.FastMath.abs(19.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 19.999998f + "'", float1 == 19.999998f);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1024.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.010723761948906d + "'", double1 == 3.010723761948906d);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8405507891024043d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.5574077842595472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.22304735158536d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.508115596856299E15d + "'", double2 == 5.508115596856299E15d);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.09252791806716626d), 1.1168694296386497d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1168694296386497d + "'", double2 == 1.1168694296386497d);
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.4716190657154944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2131030729973007d + "'", double1 == 1.2131030729973007d);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 22025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.000000000004d + "'", double1 == 22025.000000000004d);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.3197768247158532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2483916387378414d + "'", double1 == 0.2483916387378414d);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0001761935342754d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.03844259002118798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.337497748560931d + "'", double1 == 0.337497748560931d);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.0f, 3050885.6675126073d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0000005f + "'", float2 == 7.0000005f);
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1743590056195488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8256645486206606d + "'", double1 == 0.8256645486206606d);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9483398404364088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9483398404364088d + "'", double1 == 0.9483398404364088d);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 22026.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.0d + "'", double1 == 22026.0d);
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 1500, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.37684487542793E32d + "'", double2 == 2.37684487542793E32d);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 2L, (double) 12.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000004d + "'", double2 == 2.0000000000000004d);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.7254630513334037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7185149746194424d + "'", double1 == 2.7185149746194424d);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 9.999998f, 2.4273537190268928E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999998092651369d + "'", double2 == 9.999998092651369d);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (byte) 100, 0.8898290414478994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 60.20853816867183d + "'", double2 == 60.20853816867183d);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(97.0d, 127);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6503694795665515E40d + "'", double2 == 1.6503694795665515E40d);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(718053.7444319915d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2872214.977727966d + "'", double2 == 2872214.977727966d);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.027415567780803774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567780803778d + "'", double1 == 0.027415567780803778d);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 5447015486L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        double double2 = org.apache.commons.math3.util.FastMath.max(7.334875669653525d, (double) 1024.9998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.999755859375d + "'", double2 == 1024.999755859375d);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(53248.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        double double2 = org.apache.commons.math3.util.FastMath.max(5.508115596856299E15d, (-0.027181892591221314d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.508115596856299E15d + "'", double2 == 5.508115596856299E15d);
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        double double1 = org.apache.commons.math3.util.FastMath.exp(6.668888394485652E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000667111259251d + "'", double1 == 1.000667111259251d);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 75, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 100, 1025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.7363713281677684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.682208564883936d) + "'", double1 == (-0.682208564883936d));
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.4016131876221174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.031634807252392476d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.7528415227961107d, 0.9998646693394199d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7528415227961108d + "'", double2 == 0.7528415227961108d);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.99999994f), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.515287744883901E10d, 97);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.027181892591221314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0271852399623789d) + "'", double1 == (-0.0271852399623789d));
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.0466282343967674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.498374723366416d + "'", double1 == 10.498374723366416d);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, (-0.8813735448726939d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.0d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 128.0d + "'", double2 == 128.0d);
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.17702174851391653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17889431650439688d + "'", double1 == 0.17889431650439688d);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 22026);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22026.002f + "'", float1 == 22026.002f);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2979.38053468028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1658334890961391E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9073486328125E-6d + "'", double1 == 1.9073486328125E-6d);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.0633645101086056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.063364510108606d + "'", double1 == 2.063364510108606d);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 750L, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5442452350911982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.320704855363221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0786305240141214d + "'", double1 == 2.0786305240141214d);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        int int2 = org.apache.commons.math3.util.FastMath.max(75, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.1415126117084844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.108075398769753d + "'", double1 == 8.108075398769753d);
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-17));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.49391564547484d) + "'", double1 == (-3.49391564547484d));
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.17190027517928788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7608407657843304d) + "'", double1 == (-1.7608407657843304d));
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000001f + "'", float1 == 10.000001f);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.026547972235306663d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026547972235306663d + "'", double2 == 0.026547972235306663d);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.13925318512771137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13970721181982995d + "'", double1 == 0.13970721181982995d);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-149), 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-148.99998f) + "'", float2 == (-148.99998f));
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 6400L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6400.0d + "'", double1 == 6400.0d);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.1415126117084844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13235423529153753d + "'", double1 == 0.13235423529153753d);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.0d + "'", double1 == 138.0d);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.004335786492981d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.0028241459131883822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002824153421498769d + "'", double1 == 0.002824153421498769d);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-2));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.08726646259971647d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(15.29676667877352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26697894345395573d + "'", double1 == 0.26697894345395573d);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(6.70949768864047E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.709497688640471E-4d + "'", double1 == 6.709497688640471E-4d);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.37460659341591257d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3931722845112914d) + "'", double1 == (-0.3931722845112914d));
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.0572141123059735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        double double2 = org.apache.commons.math3.util.FastMath.pow(74.20321057778875d, (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.595196397132241E-32d + "'", double2 == 1.595196397132241E-32d);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837862703320917d) + "'", double1 == (-0.008837862703320917d));
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 100, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(149.0f, (-0.027298433348069678d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 148.99998f + "'", float2 == 148.99998f);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        double double2 = org.apache.commons.math3.util.FastMath.min(11013.232920103323d, 0.41031030614622616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41031030614622616d + "'", double2 == 0.41031030614622616d);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(10.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514298635472507d + "'", double1 == 0.5514298635472507d);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.035211118248524166d, 97.00518408307889d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.048113204656145E-141d + "'", double2 == 1.048113204656145E-141d);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-10L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276648614138d + "'", double1 == 1.4711276648614138d);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.8139312059190631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5706217938714693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19607161940718024d + "'", double1 == 0.19607161940718024d);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-126.99999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 99.99999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 9.094948E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.041199774787314d) + "'", double1 == (-12.041199774787314d));
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.420081748504423E270d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6217880014903024d, (-0.11977834331526022d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0585641430645576d + "'", double2 == 1.0585641430645576d);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-7.6770288745698245d), 0.002893947719693431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.6770294200238824d + "'", double2 == 7.6770294200238824d);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-1.26765045E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.263102063200969E31d) + "'", double1 == (-7.263102063200969E31d));
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.18360360379727975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1846511283989136d) + "'", double1 == (-0.1846511283989136d));
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 6400L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8387762206112901d) + "'", double1 == (-0.8387762206112901d));
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        double double1 = org.apache.commons.math3.util.FastMath.floor(7.677028874569825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2089257E24f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 79 + "'", int1 == 79);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        double double1 = org.apache.commons.math3.util.FastMath.signum(8.915327333074469E166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.013362476578269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01327398611765252d + "'", double1 == 0.01327398611765252d);
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.03413309100327678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03413309100327678d + "'", double1 == 0.03413309100327678d);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-52.000004f), (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.111969304174328E-6d) + "'", double2 == (-7.111969304174328E-6d));
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        int int2 = org.apache.commons.math3.util.FastMath.min(97, 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        int int1 = org.apache.commons.math3.util.FastMath.abs(4096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8256645486206606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.008837862703320917d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.22011573792157446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0038417443621884145d) + "'", double1 == (-0.0038417443621884145d));
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.7399168194079767E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7399130658427445E-6d + "'", double1 == 2.7399130658427445E-6d);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.0995616862503343d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.691673596021348E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5845632502852866E29d, 1.5706217938714693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852866E29d + "'", double2 == 1.5845632502852866E29d);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.0026272016841214006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00262719563966585d + "'", double1 == 0.00262719563966585d);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        float float2 = org.apache.commons.math3.util.FastMath.max(15.0f, 35.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        double double1 = org.apache.commons.math3.util.FastMath.signum(128.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1071487177940904d) + "'", double1 == (-1.1071487177940904d));
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9998646693394199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8812778905541143d + "'", double1 == 0.8812778905541143d);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) -1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.408554367752175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8790267201163946d + "'", double1 == 0.8790267201163946d);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.6376174496659073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5514753400485246d) + "'", double1 == (-0.5514753400485246d));
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        double double1 = org.apache.commons.math3.util.FastMath.exp(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 403.4287934927351d + "'", double1 == 403.4287934927351d);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1023.0d), 7.6770294200238824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.0d + "'", double2 == 1023.0d);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1170794008387335d) + "'", double1 == (-1.1170794008387335d));
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-3), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.570796326794887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672728d + "'", double1 == 0.9171523356672728d);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32L, 12.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        double double1 = org.apache.commons.math3.util.FastMath.acos(149.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.27666287087872976d, 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.188257982441615E9d + "'", double2 == 1.188257982441615E9d);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1025, (long) (-17));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17L) + "'", long2 == (-17L));
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(31.99999809265137d, 1.6370408237133427d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.99999809265137d + "'", double2 == 31.99999809265137d);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(75.24164408196494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.01389619242801d + "'", double1 == 5.01389619242801d);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-149.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.606354165955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 96.99999f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999237060545d + "'", double2 == 96.99999237060545d);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.1920928E-7f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920928E-7f + "'", float2 == 1.1920928E-7f);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        float float2 = org.apache.commons.math3.util.FastMath.max(22026.0f, 1024.9999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22026.0f + "'", float2 == 22026.0f);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.4531176911848156E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        int int2 = org.apache.commons.math3.util.FastMath.max(4096, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4096 + "'", int2 == 4096);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 127.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.430218907497497E55d + "'", double1 == 1.430218907497497E55d);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 2.3768449E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.361831799193183E34d + "'", double1 == 1.361831799193183E34d);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.6643855961249147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5094560439945823d + "'", double1 == 0.5094560439945823d);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.119898284918105E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 53247.996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53247.99609375001d + "'", double1 == 53247.99609375001d);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.8808637063441951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.414424815716438d + "'", double1 == 0.414424815716438d);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.36787946309876646d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.8731400784750731d, 9.178679289503757E-29d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8731400784750731d + "'", double2 == 0.8731400784750731d);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.52587890625E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.751006598945605d + "'", double1 == 25.751006598945605d);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1023.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.13925318512771137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13970367520817575d + "'", double1 == 0.13970367520817575d);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1024L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9950547536867305d) + "'", double1 == (-0.9950547536867305d));
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.562922473770796d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.2835960924048626d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        long long2 = org.apache.commons.math3.util.FastMath.min(100L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.0633645101086056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9682413013090552d + "'", double1 == 0.9682413013090552d);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(31.999996f, (-0.15919828051924276d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.999994f + "'", float2 == 31.999994f);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(10.498374723366416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18128.26395102926d + "'", double1 == 18128.26395102926d);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 9, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8790267201163946d, 0.19607161940718024d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3513335921151082d + "'", double2 == 1.3513335921151082d);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0001761935342754d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.16125382097679095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16267372390397128d + "'", double1 == 0.16267372390397128d);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1.9843749f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.269984763141685E296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.076985968228509d, (-0.38991180981351d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.918156524989778d + "'", double2 == 1.918156524989778d);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 3.0000002f, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.03079223296E11d + "'", double2 == 1.03079223296E11d);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.4842386559313054d, 1.22304735158536d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6209036226920994d + "'", double2 == 1.6209036226920994d);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0000001192092898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.177193365409636E-8d + "'", double1 == 5.177193365409636E-8d);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(Float.NEGATIVE_INFINITY, (float) 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.835406085372415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6072657569537874d + "'", double1 == 0.6072657569537874d);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.9131200615513249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7400166479096761d) + "'", double1 == (-0.7400166479096761d));
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.824212550988658E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.48528964305201d + "'", double1 == 22.48528964305201d);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1L), (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.163085598195192d + "'", double1 == 1.163085598195192d);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(15.29676667877352d, 1025.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1025.1141356311623d + "'", double2 == 1025.1141356311623d);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.7400166479096761d), (double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707860170342276d) + "'", double2 == (-1.5707860170342276d));
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 79);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.382026634673881d + "'", double1 == 4.382026634673881d);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(56.39608926335157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.108210104759392E24d + "'", double1 == 3.108210104759392E24d);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 127.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4302079958348105E55d + "'", double1 == 1.4302079958348105E55d);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.7450920600186577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8079404376202444d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8149601367384811d, 7.584283767291423E71d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.6920724930525287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9978517795247785d + "'", double1 == 1.9978517795247785d);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.0466282343967674d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8790267201163946d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.8190930489946614E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5498905892585824d) + "'", double1 == (-3.5498905892585824d));
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 750L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 750L + "'", long1 == 750L);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-5.4470154E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.14517240706053733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14620091577486963d + "'", double1 == 0.14620091577486963d);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(35.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.00001f + "'", float1 == 35.00001f);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(32768.0f, 138);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        double double1 = org.apache.commons.math3.util.FastMath.log(148.99998474121094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.003946203537474d + "'", double1 == 5.003946203537474d);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        double double2 = org.apache.commons.math3.util.FastMath.min((-3.5498905892585824d), 89.54726317526658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.5498905892585824d) + "'", double2 == (-3.5498905892585824d));
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 6400);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.16125382097679095d, 22.248715438260383d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16125382097679095d + "'", double2 == 0.16125382097679095d);
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.026931837701290245d, 1.564085018163574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026931837701290245d + "'", double2 == 0.026931837701290245d);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        int int1 = org.apache.commons.math3.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0000001f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        double double2 = org.apache.commons.math3.util.FastMath.min((-4.9E-324d), (double) 4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        float float1 = org.apache.commons.math3.util.FastMath.signum(32768.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9875650456761653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9875650456761653d + "'", double1 == 0.9875650456761653d);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(101.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 35, 750L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.3554640413010734E-8d, 0.13925318512771137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3554640413010734E-8d + "'", double2 == 5.3554640413010734E-8d);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.1932800507380155d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9998646693394199d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.921585041052686E225d + "'", double2 == 5.921585041052686E225d);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0269035089368426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0088885951019526d + "'", double1 == 1.0088885951019526d);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6400.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '#', 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2872214.977727966d, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707952330074615d + "'", double2 == 1.5707952330074615d);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1500L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.5136814478622125d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7208914127261735d) + "'", double1 == (-0.7208914127261735d));
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 138, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 138.0d + "'", double2 == 138.0d);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 35, (long) (-6));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(13.394771296627336d, 0.5110121940091826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.394771296627335d + "'", double2 == 13.394771296627335d);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.371747880871523E-7d + "'", double1 == 3.371747880871523E-7d);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-6));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9171523356672728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6080833035834922d + "'", double1 == 0.6080833035834922d);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 149L, 4.420081748504424E270d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.027298433348069678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.97364275804712E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000397364284d + "'", double1 == 1.0000000397364284d);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        double double2 = org.apache.commons.math3.util.FastMath.max(8.006367456539117d, (double) 12.000002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.000001907348633d + "'", double2 == 12.000001907348633d);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 6.0000005f, 0.7450729502920265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03941687450094644d + "'", double2 == 0.03941687450094644d);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 12L, 0.9292551640092286d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11.999999f + "'", float2 == 11.999999f);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 97L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        double double1 = org.apache.commons.math3.util.FastMath.tan(5.95177979919759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3440960317521253d) + "'", double1 == (-0.3440960317521253d));
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(101.46782120377229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.0d + "'", double1 == 102.0d);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        double double1 = org.apache.commons.math3.util.FastMath.abs(54.1199089796844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.1199089796844d + "'", double1 == 54.1199089796844d);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.633123935319537E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.025003373828866d + "'", double1 == 38.025003373828866d);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 75);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        long long2 = org.apache.commons.math3.util.FastMath.max(22025L, (long) 138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.371095219025714E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4404244741854283d) + "'", double1 == (-0.4404244741854283d));
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 100L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.629394531250002E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629394531324017E-6d + "'", double1 == 7.629394531324017E-6d);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 0, 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        int int2 = org.apache.commons.math3.util.FastMath.min((-3), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.949823557438858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6677388851171007d + "'", double1 == 0.6677388851171007d);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999983369439447d + "'", double1 == 0.9999983369439447d);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(22025.000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.99997885272489d + "'", double1 == 9.99997885272489d);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(96.99999237060545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691622542798067E41d + "'", double1 == 6.691622542798067E41d);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.5706791906040234d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-1.9843749f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.361831799193183E34d, 1.730093305612845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3618317991931828E34d + "'", double2 == 1.3618317991931828E34d);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.163544458620017d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.00498431552268554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999875783251015d + "'", double1 == 0.9999875783251015d);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(11013.232874703393d, 2.802596928649634E-45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703393d + "'", double2 == 11013.232874703393d);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.8146977E-6f, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 131072.02f + "'", float2 == 131072.02f);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(75.24164408196494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3768448754279146E32d + "'", double1 == 2.3768448754279146E32d);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.824212550988658E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.824212550988658E9d + "'", double1 == 5.824212550988658E9d);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(200.3351263076086d, (double) 15.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 200.3351263076086d + "'", double2 == 200.3351263076086d);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.8387762206112901d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43223916527406225d + "'", double1 == 0.43223916527406225d);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 22026, 4294967296L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4294967296L + "'", long2 == 4294967296L);
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        double double1 = org.apache.commons.math3.util.FastMath.log(8.63114046460753E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.65361018130909d + "'", double1 == 89.65361018130909d);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.048113204656145E-141d, (-0.4016131876221174d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4016131876221174d + "'", double2 == 0.4016131876221174d);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-0.99999994f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 10L, 32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.864427920919126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.9073486328125E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01240157071850156d + "'", double1 == 0.01240157071850156d);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.005969933155126179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4649444186343d + "'", double1 == 1833.4649444186343d);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.045031552153607E46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 107.53731818565555d + "'", double1 == 107.53731818565555d);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        double double1 = org.apache.commons.math3.util.FastMath.rint(149.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.13590897899958626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3686583499659085d + "'", double1 == 0.3686583499659085d);
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6217880014903024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        long long2 = org.apache.commons.math3.util.FastMath.min((-1L), (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-0.5f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.9604645E-8f + "'", float1 == 5.9604645E-8f);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.4425149084880988d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(8.317766405137894d, (-0.6420926159343308d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.029437602008406172d) + "'", double2 == (-0.029437602008406172d));
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.3513335921151082d, 1.0130295945424812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6888846723792674d + "'", double2 == 1.6888846723792674d);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-5.4470154E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.447015424E9d) + "'", double1 == (-5.447015424E9d));
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.33879047458320544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0823734317612075d) + "'", double1 == (-1.0823734317612075d));
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        double double1 = org.apache.commons.math3.util.FastMath.tan(384.416897404767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1908327857428453d + "'", double1 == 2.1908327857428453d);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 0.08032752400444744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 6, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(10.052274715955628d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.052274715955628d + "'", double2 == 10.052274715955628d);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        double double1 = org.apache.commons.math3.util.FastMath.tan(12.701627437177594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13608771814969906d + "'", double1 == 0.13608771814969906d);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-1), (-0.5f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(15.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 15.000001f + "'", float1 == 15.000001f);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-6L), (-0.16371340869567735d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.9999995f) + "'", float2 == (-5.9999995f));
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.2998044433940747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.730093305612845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.730093305612845d + "'", double1 == 1.730093305612845d);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.027415567780803774d), 1.6370408237133427d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.027415567780803774d) + "'", double2 == (-0.027415567780803774d));
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014609506662591821d) + "'", double1 == (-0.014609506662591821d));
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.3440960317521253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0597874769906153d + "'", double1 == 1.0597874769906153d);
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(53.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3036.676314193363d + "'", double1 == 3036.676314193363d);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-1023L), 8388608.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8388608.06237799d + "'", double2 == 8388608.06237799d);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6483608274590866d + "'", double2 == 0.6483608274590866d);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (double) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 4096.001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.0f, 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(126.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5501637768927253E-17d + "'", double1 == 1.5501637768927253E-17d);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(5.447015423999999E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.447015424E9d + "'", double1 == 5.447015424E9d);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0026306558026923d, (-0.014609506662591821d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0026306558026923d) + "'", double2 == (-1.0026306558026923d));
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2798733507685274d + "'", double1 == 0.2798733507685274d);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.008949316167871405d, 0.7911843097149078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02396008020219597d + "'", double2 == 0.02396008020219597d);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(22025.0d, 1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.0d + "'", double2 == 22025.0d);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-2.0980541598711233d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.0017254937309181956d), 0.03413309100327678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0017254937309181954d) + "'", double2 == (-0.0017254937309181954d));
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.5557864E22f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-1023));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.7450729502920265d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.595196397132241E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 79);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.00000000000001d + "'", double1 == 79.00000000000001d);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.18360360379727975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7554474551938102d + "'", double1 == 1.7554474551938102d);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1500L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0001f + "'", float1 == 1500.0001f);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1500.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 9.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7687861752511085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6554162488146006d + "'", double1 == 0.6554162488146006d);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-1), 1025.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        int int1 = org.apache.commons.math3.util.FastMath.round(96.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        float float2 = org.apache.commons.math3.util.FastMath.min(512.0f, 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-7f + "'", float2 == 1.1920929E-7f);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 52.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075712776160786d + "'", double1 == 0.9075712776160786d);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.027415567780803778d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5060119336077023E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5060119336077026E83d + "'", double1 == 1.5060119336077026E83d);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8790267201163946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-2.185039863261519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1850398632615184d) + "'", double1 == (-2.1850398632615184d));
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-1023));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.0f + "'", float1 == 1023.0f);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 5.4470154E9f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-6), 0.7911843097149078d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.9999995f) + "'", float2 == (-5.9999995f));
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-5137.518865003625d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.8052885407089897d), (-3.49391564547484d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5855175597800497d + "'", double2 == 3.5855175597800497d);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-2.09E-43f), (-0.8036261707997578d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0879347118439774E-43d) + "'", double2 == (-2.0879347118439774E-43d));
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2), 4096L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6420926159343308d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.19607161940718024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.193615433083745d + "'", double1 == 0.193615433083745d);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.9950547536867305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.01243777067935d) + "'", double1 == (-57.01243777067935d));
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.9843749f), (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9843749f + "'", float2 == 1.9843749f);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        double double1 = org.apache.commons.math3.util.FastMath.rint(328280.725258389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328281.0d + "'", double1 == 328281.0d);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2L, 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4096.0d + "'", double2 == 4096.0d);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 100, 39.803104571515284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-19.409313714545853d) + "'", double2 == (-19.409313714545853d));
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        double double1 = org.apache.commons.math3.util.FastMath.cos(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.066281120220074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4890291189784026d + "'", double1 == 2.4890291189784026d);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.7717075948257832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9172426875149238d + "'", double1 == 0.9172426875149238d);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1023, (double) 31.999994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1022.99994f + "'", float2 == 1022.99994f);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.1533302069155655d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.3768449E32f, 19.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3768449E32f + "'", float2 == 2.3768449E32f);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.119898284918105E-6d, (-0.7208914127261735d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7208914127261735d) + "'", double2 == (-0.7208914127261735d));
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.5514298635472507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.594603878732343d + "'", double1 == 31.594603878732343d);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5707952330074615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1024, 4294967296L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.996833390848202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.1143461733168d) + "'", double1 == (-57.1143461733168d));
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.8715802485510056E20d, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(149.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.3014591923809045d + "'", double1 == 5.3014591923809045d);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        float float2 = org.apache.commons.math3.util.FastMath.min(32.0f, 1500.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.2281805647428924E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3789102796893686d + "'", double1 == 0.3789102796893686d);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.4531176911848156E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.96478087983791d + "'", double1 == 44.96478087983791d);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.4531176911848156E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.952895810720043E12d + "'", double1 == 4.952895810720043E12d);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-1023), 4294967296L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023L) + "'", long2 == (-1023L));
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.193615433083745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.093347164296198d + "'", double1 == 11.093347164296198d);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(12.701627437177594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22168521914039824d + "'", double1 == 0.22168521914039824d);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 6400, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6400L + "'", long2 == 6400L);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-1023L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.342925101645957d, (-0.3440960317521253d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6033115335528957d + "'", double2 == 0.6033115335528957d);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5707952330074615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.4696084840113481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.288774100786787d + "'", double1 == 2.288774100786787d);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.105427357601002E-15d, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8813735870195429d) + "'", double2 == (-0.8813735870195429d));
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.949823557438858d, 0.018471250572709978d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9498235574388578d + "'", double2 == 1.9498235574388578d);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        double double1 = org.apache.commons.math3.util.FastMath.signum(9.580542411316679E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.7966228647962957d), (-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7966228647962957d) + "'", double2 == (-0.7966228647962957d));
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.008022644671146243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.825487151967882d) + "'", double1 == (-4.825487151967882d));
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5635500768149995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1606570981826605d + "'", double1 == 1.1606570981826605d);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1962369316816621d + "'", double1 == 1.1962369316816621d);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.234021194410018d + "'", double1 == 2.234021194410018d);
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.2710663101885897d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2710663101885897d + "'", double2 == 3.2710663101885897d);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 22026L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        int int2 = org.apache.commons.math3.util.FastMath.min(6400, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 138.00002f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.5707963266960232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.1932800507380155d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 79);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 79L + "'", long1 == 79L);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        double double1 = org.apache.commons.math3.util.FastMath.log((-9.215235055286076E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.8387762206112901d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7438257353236503d) + "'", double1 == (-0.7438257353236503d));
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.9117340478983207d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6123757901317819d + "'", double1 == 0.6123757901317819d);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(12.03500342028484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.035003420284841d + "'", double1 == 12.035003420284841d);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.564085018163574d, 0.4515827052894548d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2238399254752328d + "'", double2 == 1.2238399254752328d);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.02396008020219597d, 1500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.22191504464504894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7945743751980148d + "'", double1 == 1.7945743751980148d);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 9.536743E-7f, (-1.7608407657843304d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.5367431640625E-7d + "'", double2 == 9.5367431640625E-7d);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8731400784750731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3461439951660608d + "'", double1 == 1.3461439951660608d);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 3, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03079215E11f + "'", float2 == 1.03079215E11f);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.102E-42f, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.103E-42f + "'", float2 == 2.103E-42f);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(15.000001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.762747174039086d, (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9611213280559075E-308d + "'", double2 == 1.9611213280559075E-308d);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.048113204656145E-141d, 6.668888394485652E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5716460415244097E-138d + "'", double2 == 1.5716460415244097E-138d);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        double double1 = org.apache.commons.math3.util.FastMath.cos(42971.83463481174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42637126919570534d + "'", double1 == 0.42637126919570534d);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.034665567835052E197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 455.00418673529737d + "'", double1 == 455.00418673529737d);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(750.00006f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.41315910257663d + "'", double1 == 148.41315910257663d);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        int int1 = org.apache.commons.math3.util.FastMath.abs(79);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 79 + "'", int1 == 79);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(718053.7444319915d, 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6764351714917964E8d + "'", double2 == 3.6764351714917964E8d);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.7438257353236503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3618973446962992d) + "'", double1 == (-1.3618973446962992d));
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (-10L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.560487412837878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874128378783d + "'", double1 == 1.5604874128378783d);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        double double1 = org.apache.commons.math3.util.FastMath.atan(10.067661995777765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.471793136883215d + "'", double1 == 1.471793136883215d);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.371095219025714E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.02648051389328d + "'", double1 == 18.02648051389328d);
    }
}

