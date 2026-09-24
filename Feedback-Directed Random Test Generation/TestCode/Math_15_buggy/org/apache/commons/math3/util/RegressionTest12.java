package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.25d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9689124217106447d + "'", double1 == 0.9689124217106447d);
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1018);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1018.00006f + "'", float1 == 1018.00006f);
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5927622578907794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.356974989417331d + "'", double1 == 2.356974989417331d);
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0842024E-19f, 9.86283941997888d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842026E-19f + "'", float2 == 1.0842026E-19f);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.949823557438858d, 16.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.118368773084438d + "'", double2 == 16.118368773084438d);
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.3334888230404185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34000183600275813d + "'", double1 == 0.34000183600275813d);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.5877813477142805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        long long1 = org.apache.commons.math3.util.FastMath.round(19.69771560359221d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 20L + "'", long1 == 20L);
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5163019408528369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        double double2 = org.apache.commons.math3.util.FastMath.log(11013.232920103323d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.7778932E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.7778936E22f + "'", float1 == 3.7778936E22f);
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9292551640092286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.598430891781625d + "'", double1 == 0.598430891781625d);
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(22.248715407688366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.24871540768837d + "'", double1 == 22.24871540768837d);
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0536712127723509E-8d + "'", double1 == 1.0536712127723509E-8d);
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-3.901552178612685E8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.90155218E8d) + "'", double1 == (-3.90155218E8d));
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.004420564839032246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3601695942848226E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3601695942848226E29d + "'", double1 == 1.3601695942848226E29d);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-2.14748365E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.084289455298593d + "'", double1 == 4.084289455298593d);
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-54));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-54) + "'", int1 == (-54));
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(18.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9444389791664403d + "'", double1 == 2.9444389791664403d);
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.000125196767945d, 1.0000035176381763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7854589990470453d + "'", double2 == 0.7854589990470453d);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.7254630513334037d, (-54));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6109948509855884E-13d + "'", double2 == 1.6109948509855884E-13d);
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 9.2233709E18f, 1.1291321151650904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223370937343147E18d + "'", double2 == 9.223370937343147E18d);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        double double2 = org.apache.commons.math3.util.FastMath.pow(18.0d, (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.844222393007231E-26d + "'", double2 == 7.844222393007231E-26d);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        long long2 = org.apache.commons.math3.util.FastMath.max(61944147371L, 95L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61944147371L + "'", long2 == 61944147371L);
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        int int2 = org.apache.commons.math3.util.FastMath.max((-106), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 102400.0f + "'", float2 == 102400.0f);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.761141324937584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6777110728270873d + "'", double1 == 0.6777110728270873d);
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-149.00002f), 1.695600561273704d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-149.0f) + "'", float2 == (-149.0f));
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.1606570981826605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1920300642971347d + "'", double1 == 3.1920300642971347d);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        float float1 = org.apache.commons.math3.util.FastMath.abs(97.000015f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.000015f + "'", float1 == 97.000015f);
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2922328441437454d + "'", double1 == 1.2922328441437454d);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.420081748504424E270d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5325202929210884E272d + "'", double1 == 2.5325202929210884E272d);
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(181.97662449228235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.897032971783702d + "'", double1 == 5.897032971783702d);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.01471727643514217d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        double double1 = org.apache.commons.math3.util.FastMath.log10(9.86283941997888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9940019622947788d + "'", double1 == 0.9940019622947788d);
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.3862943611198906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.875d + "'", double1 == 1.875d);
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.1310943457077296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.0771875889955993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07718758899559931d + "'", double1 == 0.07718758899559931d);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.0038417349122005003d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 3.7778936E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        int int1 = org.apache.commons.math3.util.FastMath.round(32.000008f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        long long2 = org.apache.commons.math3.util.FastMath.min((-1L), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.05448754828505034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05448754828505034d + "'", double1 == 0.05448754828505034d);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(384.426221044271d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(8.006367456539117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1499.999666666629d + "'", double1 == 1499.999666666629d);
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(57.295779939969144d, 1.9503933001340736E-65d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(75.24164408196494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4096.000976562497d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(255.99998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1024.0137072356283d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-8.704462930760254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7515979658790339d) + "'", double1 == (-0.7515979658790339d));
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        int int2 = org.apache.commons.math3.util.FastMath.max(458, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 458 + "'", int2 == 458);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 53248L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.03254040588615121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3192574118357667d + "'", double1 == 0.3192574118357667d);
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-5.007031379631276E-24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.73891833252399E-26d) + "'", double1 == (-8.73891833252399E-26d));
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 9L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(138.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.281623811241246E59d + "'", double1 == 4.281623811241246E59d);
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        int int2 = org.apache.commons.math3.util.FastMath.min(106, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.15052756842981832d, 6.930495573139114d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9974303711370634E-6d + "'", double2 == 1.9974303711370634E-6d);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.094947E-13f, 0.7364276427422787d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.094948E-13f + "'", float2 == 9.094948E-13f);
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        long long2 = org.apache.commons.math3.util.FastMath.min((-3L), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(97.01261692195835d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.1674533972268024E8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014608467344896908d) + "'", double1 == (-0.014608467344896908d));
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-10), 1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 7.555788E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.555788174031283E22d + "'", double1 == 7.555788174031283E22d);
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7798115718222205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013610279473449985d + "'", double1 == 0.013610279473449985d);
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.9155040003582885E22d, 15);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5698197646053376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.94404710810622d + "'", double1 == 89.94404710810622d);
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(13.394771296627335d, 0.476794584436373d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.394771296627333d + "'", double2 == 13.394771296627333d);
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1025, 106L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106L + "'", long2 == 106L);
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.01240157071850156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2872214.977727966d, 0.5185125808637102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707961462678175d + "'", double2 == 1.5707961462678175d);
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(476.5729099901041d, (double) 3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.57079626275941d + "'", double2 == 1.57079626275941d);
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9892996786096249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1464203458717925d + "'", double1 == 0.1464203458717925d);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.012128149649440787d), 223.17520542459923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012128149649440787d + "'", double2 == 0.012128149649440787d);
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        float float1 = org.apache.commons.math3.util.FastMath.abs(7.555788E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.555788E22f + "'", float1 == 7.555788E22f);
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 6, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1982426812833557E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.24999999999211775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(200.3351263076086d, 0.8256645486206606d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 200.33682775424077d + "'", double2 == 200.33682775424077d);
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(35.74434308084387d, (-0.43252265181129645d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.74695984451546d + "'", double2 == 35.74695984451546d);
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.384185791015625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3660378340025502E-5d + "'", double1 == 1.3660378340025502E-5d);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 149L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(32.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.42073952573286544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3975532597337468d + "'", double1 == 0.3975532597337468d);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.0688248503046665d), 2.6448115121396387E-46d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6448115121396387E-46d + "'", double2 == 2.6448115121396387E-46d);
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5380269225745904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2156733284569168d + "'", double1 == 1.2156733284569168d);
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5135741754193315d, 1.6144206905127136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5135741754193315d + "'", double2 == 1.5135741754193315d);
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-5.999999f), 3.051758E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.999999f + "'", float2 == 5.999999f);
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8079404376202444d, 0.002824153421498769d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002824153421498769d + "'", double2 == 0.002824153421498769d);
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 95L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.2831781865614684d, 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-3L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.24E-44f, 0.18196468595918594d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4E-44f + "'", float2 == 2.4E-44f);
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 2.24E-44f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1023, (long) 53248);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023L + "'", long2 == 1023L);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        double double2 = org.apache.commons.math3.util.FastMath.max(3050885.6675126073d, (-0.39410242298628406d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3050885.6675126073d + "'", double2 == 3050885.6675126073d);
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9021813597714503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8104874485208914d + "'", double1 == 0.8104874485208914d);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        double double1 = org.apache.commons.math3.util.FastMath.asin(11013.232920103323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7528415227961108d, (-1.9727152021545762d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9727152021545762d) + "'", double2 == (-1.9727152021545762d));
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 2.150426909772811E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.2420775429197073E-44d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.8079404376202444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2432830442674963d + "'", double1 == 2.2432830442674963d);
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1.0842026E-19f, 0.21791339488786254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21791339488786254d + "'", double2 == 0.21791339488786254d);
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.2949673E9f, 148.99998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 148.99998f + "'", float2 == 148.99998f);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-2.169280592675679E-8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1023L, 0.07951849401287635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707185961068686d + "'", double2 == 1.5707185961068686d);
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(328280.725258389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.394771571571138d + "'", double1 == 13.394771571571138d);
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        float float2 = org.apache.commons.math3.util.FastMath.max((-149.0f), 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(100.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.9831006351425686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.092963241182991d + "'", double1 == 1.092963241182991d);
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 23, (long) (-12));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.42637126919570534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40228427169398895d + "'", double1 == 0.40228427169398895d);
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(268.3983345924218d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(78.6900675259798d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4965075614664807d + "'", double1 == 3.4965075614664807d);
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.1578293055013132d, 97.01261692195835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.01274530769818d + "'", double2 == 97.01274530769818d);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-2.07E-43f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8256645486206606d, 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5628736435298439d + "'", double2 == 0.5628736435298439d);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.9074079744350795E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9074079744350795E74d + "'", double1 == 2.9074079744350795E74d);
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        long long2 = org.apache.commons.math3.util.FastMath.max(1024L, (long) (-40));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        double double2 = org.apache.commons.math3.util.FastMath.max(172.15170601593198d, 35.74434308084387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 172.15170601593198d + "'", double2 == 172.15170601593198d);
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.027415567780803778d, (-0.16267372390397128d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027415567780803778d + "'", double2 == 0.027415567780803778d);
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-149));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-3.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.4741259760439713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9980812179114271d + "'", double1 == 0.9980812179114271d);
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-148.99998f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 100, (-6L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1018L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1018.00006f + "'", float1 == 1018.00006f);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        double double1 = org.apache.commons.math3.util.FastMath.exp(9.580542411316677E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000095d + "'", double1 == 1.0000000000000095d);
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        int int2 = org.apache.commons.math3.util.FastMath.max(458, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 458 + "'", int2 == 458);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.4965075614664807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.04060401E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.6209036226920994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0635277990373233d + "'", double1 == 1.0635277990373233d);
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.1874324048193107E-42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1874324048193107E-42d + "'", double1 == 1.1874324048193107E-42d);
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436354751788103d + "'", double1 == 1.4436354751788103d);
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.6302320770101165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5893322666832159d + "'", double1 == 0.5893322666832159d);
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-8.73891833252399E-26d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.007031379631276E-24d) + "'", double1 == (-5.007031379631276E-24d));
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0842023E-19f, 1.15292150460684723E18d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842024E-19f + "'", float2 == 1.0842024E-19f);
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.13235423529153753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.00855711691964206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5793535481493914d + "'", double1 == 1.5793535481493914d);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 97, 2.9932228461263812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.04617139798238d + "'", double2 == 97.04617139798238d);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1022.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1022.99994f + "'", float1 == 1022.99994f);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 79);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        double double1 = org.apache.commons.math3.util.FastMath.tan(5.2192449017532813E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1827413075473787d + "'", double1 == 2.1827413075473787d);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.005913009255871099d, 15.045409694732443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5284124140109207d) + "'", double2 == (-0.5284124140109207d));
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.38418607523272E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 79.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2908404270262075d + "'", double1 == 4.2908404270262075d);
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.9885260408288E48d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9885260408288E48d + "'", double1 == 2.9885260408288E48d);
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.684342E-14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9780821240516806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.03997772535232d + "'", double1 == 56.03997772535232d);
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-5.4470149E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1759.4875091855324d) + "'", double1 == (-1759.4875091855324d));
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-58), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 9.223373E19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.000004f + "'", float1 == 35.000004f);
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.013610279473449985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013609859283310707d + "'", double1 == 0.013609859283310707d);
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.2567246294766798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.993223037822113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.94987819537234d + "'", double1 == 19.94987819537234d);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1018.0f), 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.49782137E13f) + "'", float2 == (-3.49782137E13f));
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.970566590482209E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970566590482209E45d + "'", double1 == 3.970566590482209E45d);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 18);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.565996913733051E7d + "'", double1 == 6.565996913733051E7d);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        long long2 = org.apache.commons.math3.util.FastMath.max(1024L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.1464203458717925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8343985715979176d) + "'", double1 == (-0.8343985715979176d));
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        double double1 = org.apache.commons.math3.util.FastMath.signum(11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(9.223370937343148E18d, 1.8049881677891615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223370937343148E18d + "'", double2 == 9.223370937343148E18d);
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-7));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 0.7220087218417287d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-9.256230992860951E225d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        long long1 = org.apache.commons.math3.util.FastMath.abs(22026L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22026L + "'", long1 == 22026L);
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 175);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.017695903071647E75d + "'", double1 == 5.017695903071647E75d);
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0192837000737716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0192837000737716d + "'", double1 == 1.0192837000737716d);
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-1.9843745f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1374665693876721d + "'", double1 == 0.1374665693876721d);
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.20892575E24f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0652867919345605E8d + "'", double1 == 1.0652867919345605E8d);
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.505395525898652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6537329234338422d + "'", double1 == 0.6537329234338422d);
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9826981349689595d, (-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9826981349689595d) + "'", double2 == (-0.9826981349689595d));
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.000013660471644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543096688761802d + "'", double1 == 1.543096688761802d);
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.00001f, (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5625001f + "'", float2 == 1.5625001f);
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 328281L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(23.1114808588885d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.55574042944425d + "'", double2 == 11.55574042944425d);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2657697715420921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6318995190516268d + "'", double1 == 1.6318995190516268d);
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.1564407373162061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15644073731620614d + "'", double1 == 0.15644073731620614d);
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.15644073731620614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0027304059504153545d + "'", double1 == 0.0027304059504153545d);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        double double1 = org.apache.commons.math3.util.FastMath.abs(91.45317136336227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.45317136336227d + "'", double1 == 91.45317136336227d);
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.5704510598095374d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-0.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.36787946309876646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9426286359925615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        long long2 = org.apache.commons.math3.util.FastMath.max(76L, 127L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-4), 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9999998f) + "'", float2 == (-3.9999998f));
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.5625001f, 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5625001192092898d + "'", double2 == 1.5625001192092898d);
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.629395E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        int int2 = org.apache.commons.math3.util.FastMath.max(6, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(59.45881643099403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 1500.0002f, 0.04687067344618581d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4184699583316451d) + "'", double2 == (-0.4184699583316451d));
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.73480027861034d, 3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 229.71924284615818d + "'", double2 == 229.71924284615818d);
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        float float2 = org.apache.commons.math3.util.FastMath.min(15.0f, 4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8828125E-4f + "'", float2 == 4.8828125E-4f);
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.1537956230870856E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(7.624632610454212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.235329763979993d, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.712409072799656E-6d + "'", double2 == 4.712409072799656E-6d);
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        long long2 = org.apache.commons.math3.util.FastMath.min(100L, (long) 54);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54L + "'", long2 == 54L);
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        double double1 = org.apache.commons.math3.util.FastMath.abs(6.735936195599085E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.735936195599085E-13d + "'", double1 == 6.735936195599085E-13d);
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-2.7520476545250374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04803229274324933d) + "'", double1 == (-0.04803229274324933d));
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 32L, 0.5280657044573005d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.999998f + "'", float2 == 31.999998f);
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.272740699632835d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.16181164155481406d, (double) 1018L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.589505306405459E-4d + "'", double2 == 1.589505306405459E-4d);
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.7615941559557649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.2405994964072952d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        int int1 = org.apache.commons.math3.util.FastMath.abs(458);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 458 + "'", int1 == 458);
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        int int2 = org.apache.commons.math3.util.FastMath.max((-5), (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0853695281061901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7349460712526883d + "'", double1 == 0.7349460712526883d);
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.9867447596805989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.796094483138759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-9.999999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(328281.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.394772408481364d + "'", double1 == 13.394772408481364d);
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.186033145648624d, 5.447015486E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.657955798600714d + "'", double2 == 15.657955798600714d);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 750L, 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.22122547E12f + "'", float2 == 3.22122547E12f);
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        double double2 = org.apache.commons.math3.util.FastMath.pow(22025.998046875d, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(5.298292365610486d, (double) 1500.0004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.298292365610486d + "'", double2 == 5.298292365610486d);
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-10L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.102E-42f, (double) 187L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.103E-42f + "'", float2 == 2.103E-42f);
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) -1, (-458));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-2147483648));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 32768.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37293782932771496d + "'", double1 == 0.37293782932771496d);
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.4655091713670404E-8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(52.000004f, (float) 149L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000004f + "'", float2 == 52.000004f);
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5262586308923471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04452297315338434d + "'", double1 == 0.04452297315338434d);
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        int int1 = org.apache.commons.math3.util.FastMath.round((-54.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-54) + "'", int1 == (-54));
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.056285E-37f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.9971213268799871d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, (double) (-0.5f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0298285346991745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7738395618477601d + "'", double1 == 0.7738395618477601d);
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9971213268799871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(26.44415377950555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.051757812490001E11d + "'", double1 == 3.051757812490001E11d);
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 750, (double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.99994f + "'", float2 == 749.99994f);
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.0000001f, (-0.6997588155238473d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.181360348068698d + "'", double2 == 2.181360348068698d);
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        float float2 = org.apache.commons.math3.util.FastMath.max(8192.0f, 1.4551915E-11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8192.0f + "'", float2 == 8192.0f);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.318010277546872d + "'", double1 == 8.318010277546872d);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 0, (-41));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.3461439951660608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.661011522946662d, 11.093347164296198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6610115229466621d + "'", double2 == 0.6610115229466621d);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.02695216381057528d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02695216381057528d + "'", double2 == 0.02695216381057528d);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-95));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.891454401121671E-47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.891454401121672E-47d + "'", double1 == 4.891454401121672E-47d);
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-3.0f), 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4338891524382005E32d) + "'", double2 == (-2.4338891524382005E32d));
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.2661026017437569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.547001510853031d + "'", double1 == 3.547001510853031d);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-0.9999999f), 14.177446878757825d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998807907104d + "'", double2 == 0.9999998807907104d);
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        int int1 = org.apache.commons.math3.util.FastMath.round((-2.14748365E9f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 4095.9998f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4194303.75d + "'", double2 == 4194303.75d);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(567.8714856179881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.281010857092381d + "'", double1 == 8.281010857092381d);
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.177193365409636E-8d, (double) (-52.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-52.0d) + "'", double2 == (-52.0d));
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.6578630036664289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.2676506E30f), 187);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.544245235091198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999647540471237d + "'", double1 == 0.999647540471237d);
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.015179338053620484d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015295723476607053d) + "'", double1 == (-0.015295723476607053d));
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 31.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342244122679194d + "'", double1 == 0.8342244122679194d);
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.39410242298628406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7331672126158295d) + "'", double1 == (-0.7331672126158295d));
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.9432006686914056E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        double double1 = org.apache.commons.math3.util.FastMath.acos(12.701627437177594d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(12.699208415745597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999813518d + "'", double1 == 0.9999999999813518d);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.3440960317521253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-9.215236359557623E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.215236359557623E-4d + "'", double1 == 9.215236359557623E-4d);
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5707961462678175d, 7.668093098623077E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.7683716E-7f, 6400);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.2688682312579694E-7d, 11.747717109465404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2688682312579694E-7d + "'", double2 == 4.2688682312579694E-7d);
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 54, (long) 138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9369601382566869d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.6643970310541525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-2.267909768656306d), 0.5893322666832159d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3165622025370705d) + "'", double2 == (-1.3165622025370705d));
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.988607446555139d, (double) 127.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.00384775542584d + "'", double2 == 127.00384775542584d);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.267964697122677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.91750815023843d + "'", double1 == 1.91750815023843d);
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.31748811353631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.628334846308393d + "'", double1 == 1.628334846308393d);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 1.0165168535073021E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 149, 10.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2147483648L, (float) 22026L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-6.82480460136275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.6379788E-12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        double double2 = org.apache.commons.math3.util.FastMath.max((-2.600540585471551d), 1.000000000000004E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000000004E10d + "'", double2 == 1.000000000000004E10d);
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 0.018940590342241933d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-6));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 384L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.0065821320002953E46d, (-0.06698009627141037d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.0065821320002953E46d) + "'", double2 == (-4.0065821320002953E46d));
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 2.103E-42f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.647156080594096E25d, (-458));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1.2207033E-4f, 3050885.6675126073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3050885.6675126073d + "'", double2 == 3050885.6675126073d);
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.699271704857068E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.69889334015925E-5d + "'", double1 == 8.69889334015925E-5d);
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 175);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-52.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.24999999999211775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49999999999211775d + "'", double1 == 0.49999999999211775d);
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.3686583499659085d, 22.48528964305201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3686583499659085d + "'", double2 == 0.3686583499659085d);
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9746486480944883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9914771161824055d + "'", double1 == 0.9914771161824055d);
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (double) 15L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.9443045E-31f, (-148.99999999999997d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9443043E-31f + "'", float2 == 3.9443043E-31f);
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.4661381914791386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3314853131387436d) + "'", double1 == (-0.3314853131387436d));
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.27666287087872976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2839447081999322d + "'", double1 == 0.2839447081999322d);
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.05553124655104E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.047748557155732E15d) + "'", double1 == (-6.047748557155732E15d));
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 138.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1398790864012365d + "'", double1 == 2.1398790864012365d);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.5380757678599976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.829470556638885d + "'", double1 == 30.829470556638885d);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        double double1 = org.apache.commons.math3.util.FastMath.log(9.999999999999998E99d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 230.25850929940458d + "'", double1 == 230.25850929940458d);
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.188257982E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        double double2 = org.apache.commons.math3.util.FastMath.max(74.0d, (-2.556405539239385E-98d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.0d + "'", double2 == 74.0d);
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 6.9999995f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.079441482075189d + "'", double1 == 2.079441482075189d);
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.1863265471780543E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0705304252072893E41d + "'", double1 == 2.0705304252072893E41d);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(18.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        double double2 = org.apache.commons.math3.util.FastMath.min(91.0d, 55.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 55.0d + "'", double2 == 55.0d);
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.357616567889211E-68d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.357616567889211E-68d + "'", double2 == 3.357616567889211E-68d);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-1.1433134923316977d), 7.629394531324017E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707896537392716d) + "'", double2 == (-1.5707896537392716d));
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.228037402771233d), 5.4043195528445952E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.228037402771233d) + "'", double2 == (-0.228037402771233d));
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(97.00000000000003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.3187334977903953E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3016241492783763E19d + "'", double1 == 2.3016241492783763E19d);
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-25606.921810260723d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        int int2 = org.apache.commons.math3.util.FastMath.min(1018, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1018 + "'", int2 == 1018);
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1.2169445E35f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1239687940820016E33d + "'", double1 == 2.1239687940820016E33d);
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 31.999994f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0089894810243984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5537075751191067d + "'", double1 == 1.5537075751191067d);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        int int1 = org.apache.commons.math3.util.FastMath.round(6.0000005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.3014591923809045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7243954228040914d + "'", double1 == 0.7243954228040914d);
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.15655890067882908d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8550811513593495d + "'", double1 == 0.8550811513593495d);
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.3660378340025502E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.826820254353866E-4d + "'", double1 == 7.826820254353866E-4d);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.6503694795665515E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 93.29755009017639d + "'", double1 == 93.29755009017639d);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.695600561273704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.449917992279107d + "'", double1 == 4.449917992279107d);
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 8);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.723507742868687E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.2367438401448574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.734800278610341d + "'", double1 == 4.734800278610341d);
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        int int2 = org.apache.commons.math3.util.FastMath.max(79, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.6952633082705699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8858967399962993d + "'", double1 == 0.8858967399962993d);
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(52.195160378451156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-18.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 18.0f + "'", float1 == 18.0f);
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        int int1 = org.apache.commons.math3.util.FastMath.round(75.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0028241459131883822d, 43.134641898419105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0028241459131883822d + "'", double2 == 0.0028241459131883822d);
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-4.185891831851988d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 9.457200456011224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8375714918828912d, 2.9885260408288E48d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8375714918828912d + "'", double2 == 0.8375714918828912d);
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.401298464324817E-45d + "'", double1 == 1.401298464324817E-45d);
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        int int2 = org.apache.commons.math3.util.FastMath.min(35, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9999999999998128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058682972d + "'", double1 == 0.5403023058682972d);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(178.34851573024756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1127688155377187d + "'", double1 == 3.1127688155377187d);
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        long long2 = org.apache.commons.math3.util.FastMath.max(6400L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6400L + "'", long2 == 6400L);
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.8163415799735064d), 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2935448673058457E29d) + "'", double2 == (-1.2935448673058457E29d));
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        int int2 = org.apache.commons.math3.util.FastMath.max(4096, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4096 + "'", int2 == 4096);
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5707093340779579d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9541884483339822d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.1359036E-25f, 1.2657697715420921d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.135904E-25f + "'", float2 == 4.135904E-25f);
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.7778932E22f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        float float2 = org.apache.commons.math3.util.FastMath.min((-54.0f), (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-54.0f) + "'", float2 == (-54.0f));
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9706244805940947d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7771201292690524d) + "'", double1 == (-2.7771201292690524d));
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.3768448754279146E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9620613237814036d + "'", double1 == 0.9620613237814036d);
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.970566590482209E45d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        long long2 = org.apache.commons.math3.util.FastMath.max(54L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54L + "'", long2 == 54L);
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9999875783251015d, (-0.008837862703320917d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999875783251015d) + "'", double2 == (-0.9999875783251015d));
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.2483916387378414d, (-1.5698188099996992d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2483916387378414d) + "'", double2 == (-0.2483916387378414d));
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-41.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16065669868064283d) + "'", double1 == (-0.16065669868064283d));
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(6.709497688640471E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1710282582172556E-5d + "'", double1 == 1.1710282582172556E-5d);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(53.80040108927525d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-18L), 2979.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-17.999998f) + "'", float2 == (-17.999998f));
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.38418579101567E-7d + "'", double1 == 2.38418579101567E-7d);
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.824212550988658E9d, 52);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.45760881147219573d, 1501.9343928329747d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1501.9344625450144d + "'", double2 == 1501.9344625450144d);
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0041442383211276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5716961944464807d + "'", double1 == 1.5716961944464807d);
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.718623469602896d, 2.4280173086891232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.306663311270204d + "'", double2 == 5.306663311270204d);
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.0017254937309181956d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0017254920184673012d) + "'", double1 == (-0.0017254920184673012d));
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        float float2 = org.apache.commons.math3.util.FastMath.min(14.0f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.2207033E-4f, 0.9826981349689595d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2207032705191526E-4d + "'", double2 == 1.2207032705191526E-4d);
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.342915917084086d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-2.9999999999999996d), 128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0208471007628152E39d) + "'", double2 == (-1.0208471007628152E39d));
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(76.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.343805421853684d + "'", double1 == 4.343805421853684d);
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.03472230979471843d, 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021348E41d + "'", double2 == 6.691673596021348E41d);
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.4414062E-4f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        double double2 = org.apache.commons.math3.util.FastMath.min(106.0d, 0.06670719631768762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06670719631768762d + "'", double2 == 0.06670719631768762d);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.633495252341099E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999998926536107d + "'", double1 == 0.9999998926536107d);
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.05691340783384365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.605170185988093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1070134835587689d) + "'", double1 == (-0.1070134835587689d));
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8342244122679194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2018710074591044d + "'", double1 == 1.2018710074591044d);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-41L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.469446951953614E-18d, 1.2835960924048626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.469446951953614E-18d + "'", double2 == 3.469446951953614E-18d);
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.3734007669450161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.05235987755982989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 3.7778936E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.164573608297005E24d + "'", double1 == 2.164573608297005E24d);
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3000.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4414062E-4f + "'", float1 == 2.4414062E-4f);
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.548045480055047d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.1760913650845946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.955599251180722d + "'", double1 == 11.955599251180722d);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(6.212020862233431E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 2147483648L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(6.93244789157251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12099404093087916d + "'", double1 == 0.12099404093087916d);
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-58), (float) 138);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.015625f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.8626451E-9f + "'", float1 == 1.8626451E-9f);
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(22026.0f, (double) 458);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.998f + "'", float2 == 22025.998f);
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.16589945506899414d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-2.556405539239385E-98d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.556405539239385E-98d) + "'", double1 == (-2.556405539239385E-98d));
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-6.1944148E10f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0f + "'", float1 == 4096.0f);
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.4470154E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.3192574118357667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4958590114270875d) + "'", double1 == (-0.4958590114270875d));
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.9978517795247785d, 430.07458243245395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9978517795247785d + "'", double2 == 1.9978517795247785d);
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-17L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.0d) + "'", double1 == (-17.0d));
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        double double2 = org.apache.commons.math3.util.FastMath.pow(53248.00000000001d, 26);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.653953283385728E122d + "'", double2 == 7.653953283385728E122d);
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-12.125f), (float) (-1023L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-12.125f) + "'", float2 == (-12.125f));
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.5471063997054444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2619282050900053d) + "'", double1 == (-0.2619282050900053d));
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        int int2 = org.apache.commons.math3.util.FastMath.min(2147483647, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(7.334875669653525d, 1.6202204943810763E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.334875669653525d + "'", double2 == 7.334875669653525d);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.108075398769753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8474682436806478d + "'", double1 == 2.8474682436806478d);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.020299673171033917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020299673171033917d + "'", double1 == 0.020299673171033917d);
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.0024151657987541153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002415170494673239d + "'", double1 == 0.002415170494673239d);
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.5442452350911982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.3513335921151082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21770527575405668d + "'", double1 == 0.21770527575405668d);
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-5.877472E-39f), 62);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-63L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.359610000063081E-28d + "'", double1 == 4.359610000063081E-28d);
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.7331672126158295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7430585504480339d + "'", double1 == 0.7430585504480339d);
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-7));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.512923318980856d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 127, 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        long long1 = org.apache.commons.math3.util.FastMath.round(7.555788174031283E22d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-13.244927519754937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-758.8784468386351d) + "'", double1 == (-758.8784468386351d));
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.8643238493907621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9760322118920343d + "'", double1 == 0.9760322118920343d);
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5710207593912806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 4.974779993689529E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        double double1 = org.apache.commons.math3.util.FastMath.asin(114.59156861177442d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7611413249375834d + "'", double1 == 3.7611413249375834d);
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.734800278610341d, (-0.7438257353236503d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.27184586666843935d + "'", double2 == 0.27184586666843935d);
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.201966968334231E246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 567.8714856179881d + "'", double1 == 567.8714856179881d);
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.02741900222769117d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027046513573097505d) + "'", double1 == (-0.027046513573097505d));
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-126.99999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-126.0d) + "'", double1 == (-126.0d));
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        double double1 = org.apache.commons.math3.util.FastMath.abs(9.382939107340336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.382939107340336d + "'", double1 == 9.382939107340336d);
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        double double1 = org.apache.commons.math3.util.FastMath.sin(9.013560982203286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39972514891529615d + "'", double1 == 0.39972514891529615d);
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.17571389149050348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(115.05919655879654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.438612812779122d + "'", double1 == 5.438612812779122d);
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9934708510524944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4564611501574685d + "'", double1 == 1.4564611501574685d);
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.8387762206112901d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8114214365648633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-1.9843748f), 0.02967950142597812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5558408409678617d) + "'", double2 == (-1.5558408409678617d));
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0585641430645576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9999806514771749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813599054816682d + "'", double1 == 0.8813599054816682d);
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 7, 0.9999875783251015d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.071066055186057d + "'", double2 == 7.071066055186057d);
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 175, 187L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 175L + "'", long2 == 175L);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1884223E32f, (float) (-41));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1884223E32f) + "'", float2 == (-1.1884223E32f));
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.2676506E30f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2676506E30f + "'", float1 == 1.2676506E30f);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 100, (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.015179338053620484d), (-0.7775867565969075d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7775867565969075d) + "'", double2 == (-0.7775867565969075d));
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.877472E-39f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.877473E-39f + "'", float1 == 5.877473E-39f);
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        double double1 = org.apache.commons.math3.util.FastMath.sin(544.5092619083326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8488112896435829d) + "'", double1 == (-0.8488112896435829d));
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7430585504480339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7331672126158295d + "'", double1 == 0.7331672126158295d);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        int int2 = org.apache.commons.math3.util.FastMath.min((-106), 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106) + "'", int2 == (-106));
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        int int2 = org.apache.commons.math3.util.FastMath.min(26, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 76L, 5.877472E-39f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 76.0f + "'", float2 == 76.0f);
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.201966968334231E246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.762590461503545E230d + "'", double1 == 7.762590461503545E230d);
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-5.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        float float2 = org.apache.commons.math3.util.FastMath.min(31.999996f, (-2.7787262E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7787262E7f) + "'", float2 == (-2.7787262E7f));
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1500L, 14);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4576E7f + "'", float2 == 2.4576E7f);
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-6L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.7156361224559d + "'", double1 == 201.7156361224559d);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.5537689358093707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6670173837384175d + "'", double1 == 1.6670173837384175d);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.94762912722163E52d, 1.169647840508743E306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.94762912722163E52d + "'", double2 == 4.94762912722163E52d);
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-17), (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.627430214775713E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.840401559427466E-7d + "'", double1 == 2.840401559427466E-7d);
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 7.555787E22f, 62);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1982426812833557E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.6536436208636119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5789323781787993d) + "'", double1 == (-0.5789323781787993d));
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9748453191400233d, 384.426221044271d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5795230490737015E-5d + "'", double2 == 5.5795230490737015E-5d);
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.06434163106438166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        int int2 = org.apache.commons.math3.util.FastMath.min(22025, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 12L, (float) (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0f) + "'", float2 == (-6.0f));
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.22709104338717356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2031517687744916d) + "'", double1 == (-0.2031517687744916d));
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.5987297191141082d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 95L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.683261714736121d + "'", double1 == 0.683261714736121d);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 32.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        int int2 = org.apache.commons.math3.util.FastMath.max(97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.505395525898652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.2913289205442933d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2913289205442933d + "'", double1 == 1.2913289205442933d);
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1500.0001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.313220468470506d + "'", double1 == 7.313220468470506d);
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.267650449112502E30d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.4430227241169226d, 15.62408966978161d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4430227241169226d + "'", double2 == 0.4430227241169226d);
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        int int1 = org.apache.commons.math3.util.FastMath.round(108.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108 + "'", int1 == 108);
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-52.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1500.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        float float1 = org.apache.commons.math3.util.FastMath.signum(52.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(18.999352444162646d, 9.341371165927588E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.033893323226712E-18d + "'", double2 == 2.033893323226712E-18d);
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.0384596E34f, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0769192E34f + "'", float2 == 2.0769192E34f);
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.20893701516559085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.565722435280296d) + "'", double1 == (-1.565722435280296d));
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 10.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978954461936857d + "'", double1 == 2.3978954461936857d);
    }
}

