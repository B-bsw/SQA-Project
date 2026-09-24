package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-126.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.999470683622238d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, (double) 53248.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.01669581953729926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016697371032360686d) + "'", double1 == (-0.016697371032360686d));
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.551635497780683E154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.551635497780683E154d + "'", double1 == 2.551635497780683E154d);
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.7837860351644754d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.1425465430742778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15320675349590304d + "'", double1 == 0.15320675349590304d);
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        double double1 = org.apache.commons.math3.util.FastMath.signum(107.53731818565555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        long long1 = org.apache.commons.math3.util.FastMath.round(96.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 96L + "'", long1 == 96L);
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-5.4470149E9f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 18L, 127.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-3L), 4.952895810720043E12d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.1894250945222025d, 50.23719874670144d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1894250945222025d + "'", double2 == 4.1894250945222025d);
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-2.9999998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.9999998f + "'", float1 == 2.9999998f);
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.15987052369731924d, (double) (-8.999999f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15987052369731922d + "'", double2 == 0.15987052369731922d);
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.23208856521353044d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9731881258098355d + "'", double1 == 0.9731881258098355d);
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 106);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2005.3522829578812d, 15.851614849324065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5628918379719732d + "'", double2 == 1.5628918379719732d);
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(328280.6401645561d, 1.730093305612845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707910566293921d + "'", double2 == 1.5707910566293921d);
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(8.602325267042627d, 5.824212550988658E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.602325267042627d + "'", double2 == 8.602325267042627d);
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1), 1.8257462397988056E-22d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-41));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.546410917622178d) + "'", double1 == (-1.546410917622178d));
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.13608771814969906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36890068873573423d + "'", double1 == 0.36890068873573423d);
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5706217938714693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.745329225412492E-4d + "'", double1 == 1.745329225412492E-4d);
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8205677036841424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6753787465717384d + "'", double1 == 0.6753787465717384d);
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.027415567780803778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027412134624038857d + "'", double1 == 0.027412134624038857d);
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-7.6770288745698245d), 0.5574077842595472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.697238191645882d + "'", double2 == 7.697238191645882d);
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.38418579101567E-7d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-22) + "'", int1 == (-22));
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        long long2 = org.apache.commons.math3.util.FastMath.min(7L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.381888937281653d, (double) 108);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 108.00884045778375d + "'", double2 == 108.00884045778375d);
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-2.0879347118439774E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0879347118439774E-43d) + "'", double1 == (-2.0879347118439774E-43d));
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.288241522117258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 302.99392026315724d + "'", double1 == 302.99392026315724d);
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7017203400855395d) + "'", double1 == (-0.7017203400855395d));
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        double double1 = org.apache.commons.math3.util.FastMath.abs(97.00518408307889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00518408307889d + "'", double1 == 97.00518408307889d);
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 63);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.29378315946961E27d + "'", double1 == 2.29378315946961E27d);
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(20.500218349388472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7129873150012553d + "'", double1 == 3.7129873150012553d);
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.973642758047122E-8d, 1.0026306558026923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.973642758047122E-8d + "'", double2 == 3.973642758047122E-8d);
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        double double1 = org.apache.commons.math3.util.FastMath.log10(8886109.520507872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.948711661578621d + "'", double1 == 6.948711661578621d);
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(12.182493960703473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2126246307186003d + "'", double1 == 0.2126246307186003d);
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1.2089257E24f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.476794584436373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44491153754783735d + "'", double1 == 0.44491153754783735d);
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-6.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 62, (float) 1023L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 62.0f + "'", float2 == 62.0f);
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7920349615599266d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5305894532583966d + "'", double2 == 0.5305894532583966d);
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-12));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(89.40934278535332d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91555.1670122018d + "'", double2 == 91555.1670122018d);
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.09937288259301753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0027321120508483d) + "'", double1 == (-1.0027321120508483d));
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6.1035156E-5f, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.6714065E24f + "'", float2 == 9.6714065E24f);
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.371747880871523E-7d, (double) 52.000008f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.48412958879172E-9d + "'", double2 == 6.48412958879172E-9d);
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.5127512017063653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6698790550935152d + "'", double1 == 1.6698790550935152d);
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        long long2 = org.apache.commons.math3.util.FastMath.max(4096L, (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7888705944722437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013768389245705632d + "'", double1 == 0.013768389245705632d);
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.38636319993752116d, (-0.2988575544122901d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.38636319993752116d) + "'", double2 == (-0.38636319993752116d));
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.42280635864377986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24.225019901583217d) + "'", double1 == (-24.225019901583217d));
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.026871352829836912d, 23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.4758266482833906E-37d + "'", double2 == 7.4758266482833906E-37d);
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 25);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.23494048220588d) + "'", double1 == (-7.23494048220588d));
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(8.644433940529861E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.52587890625E-5d + "'", double1 == 1.52587890625E-5d);
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        double double2 = org.apache.commons.math3.util.FastMath.pow(385.1183156145558d, (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3933437225722068E-26d + "'", double2 == 1.3933437225722068E-26d);
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        float float1 = org.apache.commons.math3.util.FastMath.signum(12.125f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 15L, 1.452146029569111d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.999999f + "'", float2 == 14.999999f);
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.36890068873573423d, (-2147483648));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        double double1 = org.apache.commons.math3.util.FastMath.log10(57.295779939969144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7581226356449182d + "'", double1 == 1.7581226356449182d);
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 62);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9.810189733007238d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1499.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.313886750307468d + "'", double1 == 7.313886750307468d);
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2979.3805346802806d, 1.522697550491263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5385716311211011d) + "'", double2 == (-0.5385716311211011d));
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5707932806215363d, (-1.5706791906040234d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.221356488779385d + "'", double2 == 2.221356488779385d);
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 8, (-127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.12520241624226192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12520241624226194d + "'", double1 == 0.12520241624226194d);
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.6109948509855884E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        double double1 = org.apache.commons.math3.util.FastMath.cos(60.20853816867183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8686736438028053d) + "'", double1 == (-0.8686736438028053d));
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-5.3014591923809045d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5707846912665506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232178731710393d + "'", double1 == 1.0232178731710393d);
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1977461928657025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8329658578462645d + "'", double1 == 0.8329658578462645d);
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.09252791806716626d), (-0.08638318796176292d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12658384882867754d + "'", double2 == 0.12658384882867754d);
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.688117141816136E43d, 44.55243935826922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03796666907934495d + "'", double2 == 0.03796666907934495d);
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-253.99998f), (-1.4825609493135583d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-253.99998474121094d) + "'", double2 == (-253.99998474121094d));
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-2.9999998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.01787252709252d) + "'", double1 == (-10.01787252709252d));
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1501.9344625450144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(127.01570561889895d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 35.000004f, (-0.8508150333851735d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.163399870121596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7528415227961107d, 0.1464203458717925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1464203458717925d + "'", double2 == 0.1464203458717925d);
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.030765742067207565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5119326053018818d) + "'", double1 == (-1.5119326053018818d));
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        double double2 = org.apache.commons.math3.util.FastMath.log(10.498374723366416d, 1.5707886974003653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1920610408619642d + "'", double2 == 0.1920610408619642d);
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.6888846723792674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6888846723792674d + "'", double1 == 1.6888846723792674d);
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.6123757901317819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1934352946829203d + "'", double1 == 1.1934352946829203d);
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        double double1 = org.apache.commons.math3.util.FastMath.log10(203.18733465192955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.307896633423856d + "'", double1 == 2.307896633423856d);
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.17889431650439688d, 1.7320508763943914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7412648893537577d + "'", double2 == 1.7412648893537577d);
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08037538236017183d + "'", double1 == 0.08037538236017183d);
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.8949219476567826d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2470996758325354d) + "'", double1 == (-1.2470996758325354d));
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 2.0769192E34f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.44115205255724032E17d + "'", double1 == 1.44115205255724032E17d);
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        int int2 = org.apache.commons.math3.util.FastMath.max(458, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 458 + "'", int2 == 458);
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 3.056285E-37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.735936030883969E-13d + "'", double1 == 6.735936030883969E-13d);
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 22026.004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.693126210116734d + "'", double1 == 10.693126210116734d);
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8104773809653483d + "'", double1 == 3.8104773809653483d);
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-5.4470149E9f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-2), 9.6714065E24f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.6714065E24f + "'", float2 == 9.6714065E24f);
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        float float2 = org.apache.commons.math3.util.FastMath.max(15.000001f, 126.999985f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.999985f + "'", float2 == 126.999985f);
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.3197768247158534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02303445098280772d + "'", double1 == 0.02303445098280772d);
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9872429529221711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005575957634910489d) + "'", double1 == (-0.005575957634910489d));
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16157002187908354d) + "'", double1 == (-0.16157002187908354d));
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(8.699271704857068E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.699650102470575E-5d + "'", double1 == 8.699650102470575E-5d);
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) 100, (float) 750L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        int int2 = org.apache.commons.math3.util.FastMath.max((-458), 458);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 458 + "'", int2 == 458);
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.0786305240141214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0786305240141214d + "'", double1 == 2.0786305240141214d);
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(99.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.07545690704752087d), (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.07545690704752085d) + "'", double2 == (-0.07545690704752085d));
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.0979403578008362d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.7185149746194424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000857660011895d + "'", double1 == 1.0000857660011895d);
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 131072.02f, 0.23509439727547046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 131072.015625d + "'", double2 == 131072.015625d);
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        double double1 = org.apache.commons.math3.util.FastMath.sin(12.03500342028484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5067124930751009d) + "'", double1 == (-0.5067124930751009d));
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 15.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 859.4367473377482d + "'", double1 == 859.4367473377482d);
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.00724572153624304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007245784937053269d + "'", double1 == 0.007245784937053269d);
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(223.23772953327418d, (-113.22351824030044d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 223.23772953327415d + "'", double2 == 223.23772953327415d);
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.1961161351381842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6290482690107402d) + "'", double1 == (-1.6290482690107402d));
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5635505418565119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.1702617153949575d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(63.000004f, 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1008.00006f + "'", float2 == 1008.00006f);
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5188871811480065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4768406791145167d + "'", double1 == 0.4768406791145167d);
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        double double2 = org.apache.commons.math3.util.FastMath.log(512.0d, (-0.9640275800758169d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(23207.519636520385d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.1425465430742778d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03563663576856945d + "'", double2 == 0.03563663576856945d);
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1022.99994f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.43361281667855023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5428213977454868d + "'", double1 == 1.5428213977454868d);
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.194068795155346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.801734439119775d + "'", double1 == 1.801734439119775d);
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.120310440054329E-41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.120310440054329E-41d + "'", double1 == 3.120310440054329E-41d);
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8790267201163946d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        int int2 = org.apache.commons.math3.util.FastMath.min(53248, 138);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 138 + "'", int2 == 138);
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.8996937401571155d, 1.452146029569111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8996937401571152d + "'", double2 == 1.8996937401571152d);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        double double1 = org.apache.commons.math3.util.FastMath.cos(7.2247201030232695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5885478940499735d + "'", double1 == 0.5885478940499735d);
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7576211478872673d + "'", double1 == 0.7576211478872673d);
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.164573608297005E24d, (-2.267909768656306d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1645736082970047E24d + "'", double2 == 2.1645736082970047E24d);
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3.9999998f, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8446708889369969E19d + "'", double2 == 1.8446708889369969E19d);
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.0879347118439774E-43d, 1.5635500768149995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3353807740505287E-43d + "'", double2 == 1.3353807740505287E-43d);
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.0688248503046665d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(32.763865073340014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.723972840024664d + "'", double1 == 5.723972840024664d);
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(9.999978852724889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453255610985444d + "'", double1 == 0.17453255610985444d);
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(31.999994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 31.999996f + "'", float1 == 31.999996f);
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(182.7525636550004d, (-10.017874927409903d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6255581242493435d + "'", double2 == 1.6255581242493435d);
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-3.944304291006189E-31d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.884109657859856E-33d) + "'", double1 == (-6.884109657859856E-33d));
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(53248.0f, 58);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5347691E22f + "'", float2 == 1.5347691E22f);
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(57.29578634327149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.7456418720467646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.729577951308232d + "'", double1 == 5.729577951308232d);
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.15349285356613754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39178164015958883d + "'", double1 == 0.39178164015958883d);
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 99, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.0f + "'", float2 == 99.0f);
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 3.051758E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62939453139803E-6d + "'", double1 == 7.62939453139803E-6d);
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.984807753012208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9949100540772481d + "'", double1 == 0.9949100540772481d);
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 5L, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.310887241768095E67d + "'", double2 == 6.310887241768095E67d);
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(10.000000000000004d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.002889764289507054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0028897723334217395d) + "'", double1 == (-0.0028897723334217395d));
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-7.428926624964046E-45d), 35.000007629394524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.000007629394524d + "'", double2 == 35.000007629394524d);
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7.236605282015445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 414.6269406615638d + "'", double1 == 414.6269406615638d);
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-100), 0.11812448149071139d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-99.99999f) + "'", float2 == (-99.99999f));
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.371095219025714E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.371095219025714E7d + "'", double1 == 3.371095219025714E7d);
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.2988575544122901d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2904083499766355d) + "'", double1 == (-0.2904083499766355d));
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.7966228647962957d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 79);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-63));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.023964666826589657d, 1.0001705983992748d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.571853651987668E-5d) + "'", double2 == (-4.571853651987668E-5d));
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.059306170823243d) + "'", double1 == (-1.059306170823243d));
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.004420564839032246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2532797083404758d + "'", double1 == 0.2532797083404758d);
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        double double1 = org.apache.commons.math3.util.FastMath.log10(18.02648051389328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2559109434391555d + "'", double1 == 1.2559109434391555d);
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1023);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.984371183438952d + "'", double1 == 31.984371183438952d);
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        int int2 = org.apache.commons.math3.util.FastMath.min(9, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(106.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5.621322410763002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 276.25446366451143d + "'", double1 == 276.25446366451143d);
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 10.693147181075235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0000000000000263E148d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 491 + "'", int1 == 491);
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        long long2 = org.apache.commons.math3.util.FastMath.max((-61944147371L), 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(8.419503680225981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2267.3262397605376d + "'", double1 == 2267.3262397605376d);
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 31, 76L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 76L + "'", long2 == 76L);
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        int int2 = org.apache.commons.math3.util.FastMath.min(32, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.320704855363221d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.988607446555139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7567679096855728d + "'", double1 == 0.7567679096855728d);
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.220703128031649E-4d + "'", double1 == 1.220703128031649E-4d);
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-6.047748557155732E15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.074958678352131d, (double) 750L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 750.0d + "'", double2 == 750.0d);
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.9999875783251015d), 107.53731818565555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999875783251015d) + "'", double2 == (-0.9999875783251015d));
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 0.031250004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03174341134264638d + "'", double1 == 0.03174341134264638d);
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 11.999999f, 0.6916437678655323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.999999046325684d + "'", double2 == 11.999999046325684d);
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7185540823899328d + "'", double1 == 0.7185540823899328d);
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.4296721313153656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4296721313153656d + "'", double1 == 0.4296721313153656d);
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.0024151657987541153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999970834884999d + "'", double1 == 0.9999970834884999d);
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.6072657569537876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6526145766592608d + "'", double1 == 0.6526145766592608d);
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.676435171491823E8d, 0.14933831547143916d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.017193539622728d + "'", double2 == 19.017193539622728d);
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 2147483648L, 5.8058397E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        long long2 = org.apache.commons.math3.util.FastMath.min(1500L, 2147483648L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.512923318980856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3801241820582253d + "'", double1 == 2.3801241820582253d);
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 6400, 2.38418579101567E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6400.0d + "'", double2 == 6400.0d);
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.1754644578327482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001705983992748d + "'", double1 == 1.0001705983992748d);
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.0f), (double) (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0000001f) + "'", float2 == (-1.0000001f));
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-9223372036854775808L), 7.5557864E22f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.223372E18f) + "'", float2 == (-9.223372E18f));
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-2.9405615342893493E8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        double double1 = org.apache.commons.math3.util.FastMath.floor(96.99999999999956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.21791339488786254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21619283687474575d + "'", double1 == 0.21619283687474575d);
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.000667111259251d, 7.677028874569825d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.741970486157563d + "'", double2 == 7.741970486157563d);
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.4768406791145167d, 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4983023731160971E-5d + "'", double2 == 1.4983023731160971E-5d);
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(859.4367473377482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.316151646110516d + "'", double1 == 29.316151646110516d);
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.011298952859326998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011298952859327d + "'", double1 == 0.011298952859327d);
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.051758E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0517585E-5f + "'", float1 == 3.0517585E-5f);
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.745329225412492E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000152308706d + "'", double1 == 1.0000000152308706d);
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.6486443753959988d, 1.4425149084880988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6486443753959988d + "'", double2 == 0.6486443753959988d);
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.23794004E27f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.615120516841259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.50495049504947d + "'", double1 == 50.50495049504947d);
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.7182818284590453d, 11.747717109465404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7182818284590455d + "'", double2 == 1.7182818284590455d);
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.6916437678655323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(91.45317136336227d, (-40));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.317617481530967E-11d + "'", double2 == 8.317617481530967E-11d);
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9999875783251015d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(7.236605282015445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1388.3694387556268d + "'", double1 == 1388.3694387556268d);
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0230833853373484d, (-0.5136814478622124d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1448005255201223d + "'", double2 == 1.1448005255201223d);
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(63.000004f, 1.0000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.000004f + "'", float2 == 63.000004f);
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        float float1 = org.apache.commons.math3.util.FastMath.signum(12.000003f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        float float2 = org.apache.commons.math3.util.FastMath.min(Float.NEGATIVE_INFINITY, (float) 8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-3.49782137E13f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-253.99998f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 14.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7725886626351346d + "'", double1 == 2.7725886626351346d);
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(52.0d, 0.00140198023312869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.531532568916072E-4d + "'", double2 == 5.531532568916072E-4d);
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.23794004E27f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2379402E27f + "'", float1 == 1.2379402E27f);
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.472691046113234d, (double) 127.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.561990438708674E49d + "'", double2 == 8.561990438708674E49d);
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.7227342478134157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.618600102394578d + "'", double1 == 0.618600102394578d);
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (short) 10, (-0.031149732764242856d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.031149732764242856d) + "'", double2 == (-0.031149732764242856d));
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 4.70197740328915E-38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.70197740328915E-38d + "'", double2 == 4.70197740328915E-38d);
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 9.2233709E18f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        double double1 = org.apache.commons.math3.util.FastMath.atan(9.580542411316679E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.580542411316679E-15d + "'", double1 == 9.580542411316679E-15d);
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.223373E19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.796093E12f + "'", float1 == 8.796093E12f);
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9056071494359416d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.003173546455298d, 35.69315099525722d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.003173546455298d + "'", double2 == 3.003173546455298d);
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.23509439727547046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23731568623588914d + "'", double1 == 0.23731568623588914d);
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2147483648), 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.23731568623588914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23300532098995755d + "'", double1 == 0.23300532098995755d);
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        double double1 = org.apache.commons.math3.util.FastMath.sin(32.376000838461856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8192341800450601d + "'", double1 == 0.8192341800450601d);
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5471063997054444d, (double) (-10L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5471063997054444d + "'", double2 == 0.5471063997054444d);
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        double double1 = org.apache.commons.math3.util.FastMath.signum(5.211020790109826E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 4.8828125E-4f, 0.3040821475326688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0016057530318482293d + "'", double2 == 0.0016057530318482293d);
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.666666666666755E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999777777786d + "'", double1 == 0.999999777777786d);
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5015887158341327d, (double) 5.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.031749638761473686d + "'", double2 == 0.031749638761473686d);
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13) + "'", int1 == (-13));
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.3933437225722068E-26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3933437225722068E-26d + "'", double1 == 1.3933437225722068E-26d);
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5707963267948968d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        int int2 = org.apache.commons.math3.util.FastMath.max(175, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 175 + "'", int2 == 175);
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        int int2 = org.apache.commons.math3.util.FastMath.min(25, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8457801672828005d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4096.000976562497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 7.629395E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629395440818717E-6d + "'", double1 == 7.629395440818717E-6d);
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        double double1 = org.apache.commons.math3.util.FastMath.cos(5.44703591863261E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5904105265143091d) + "'", double1 == (-0.5904105265143091d));
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 32.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5440680443502757d, 0.21619283687474575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5440680443502757d + "'", double2 == 1.5440680443502757d);
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9171523356089556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6080833036297886d + "'", double1 == 0.6080833036297886d);
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5635505418565119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9413932280045508d + "'", double1 == 0.9413932280045508d);
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 1.6370408237133427d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.75006293476747d + "'", double1 == 4.75006293476747d);
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.16299078079570548d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(56.01144166945411d, 1.201867548519866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.0114416694541d + "'", double2 == 56.0114416694541d);
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-5.877472E-39f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000035176381763d, 4.933345970255334E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000003517638176d + "'", double2 == 1.000003517638176d);
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-48.212736012209476d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(78.6900675259798d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.0017254937309181956d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1684043449710089E-19d + "'", double1 == 2.1684043449710089E-19d);
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        long long1 = org.apache.commons.math3.util.FastMath.round(8388608.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8388608L + "'", long1 == 8388608L);
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.9238054901410364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.846965011933846d + "'", double1 == 6.846965011933846d);
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        double double1 = org.apache.commons.math3.util.FastMath.log(31.99999809265137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.46573584319508d + "'", double1 == 3.46573584319508d);
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.1415926365136895d, (-0.9950547536867305d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2954116975928205d + "'", double2 == 3.2954116975928205d);
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 14, 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.475789056E9d + "'", double2 == 1.475789056E9d);
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        float float2 = org.apache.commons.math3.util.FastMath.max(12.000003f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.000003f + "'", float2 == 12.000003f);
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.3862943611198906d, 0.6033115335528957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3862943611198906d + "'", double2 == 1.3862943611198906d);
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 108.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.68213122712422d + "'", double1 == 4.68213122712422d);
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-3.1872445334363896E24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7507613009436614d) + "'", double1 == (-0.7507613009436614d));
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 15L, (float) (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-15.0f) + "'", float2 == (-15.0f));
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-1), (-41L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41L) + "'", long2 == (-41L));
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.695600561273704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1924527621043843d + "'", double1 == 1.1924527621043843d);
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        double double1 = org.apache.commons.math3.util.FastMath.acos(10.424132284821418d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 7.629395E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629366337055335E-6d + "'", double1 == 7.629366337055335E-6d);
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-14));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.17453255610985444d, 1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17453255610985444d + "'", double2 == 0.17453255610985444d);
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 750, 15L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8141342142776004d) + "'", double1 == (-0.8141342142776004d));
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-12L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.0d) + "'", double1 == (-12.0d));
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.7364276427422787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.19419584590056d + "'", double1 == 42.19419584590056d);
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 53247.996f, 1.4626599322445797E-282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(97.000015f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.00002f + "'", float1 == 97.00002f);
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0000857660011895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.576232349627925E-5d + "'", double1 == 8.576232349627925E-5d);
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.9999951358629069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1384736341809347d + "'", double1 == 3.1384736341809347d);
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(8.112963841460668E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.648385874579398E33d + "'", double1 == 4.648385874579398E33d);
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        float float2 = org.apache.commons.math3.util.FastMath.max((-99.99999f), 75.000015f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 75.000015f + "'", float2 == 75.000015f);
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        float float2 = org.apache.commons.math3.util.FastMath.min((-99.99999f), (-253.99998f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-253.99998f) + "'", float2 == (-253.99998f));
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        double double1 = org.apache.commons.math3.util.FastMath.sin(7.342690407571987E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.34269040757198E-8d + "'", double1 == 7.34269040757198E-8d);
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.2676506E30f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.2676505E30f) + "'", float1 == (-1.2676505E30f));
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.33667481938672716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47278936418910433d) + "'", double1 == (-0.47278936418910433d));
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.4764498148372358E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 22026L, (-13));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.482063978476385E-57d + "'", double2 == 3.482063978476385E-57d);
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.15167488020881612d, 2.9932228461263812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15167488020881614d + "'", double2 == 0.15167488020881614d);
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(385.1183156145558d, (-44.55243935826922d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-15.853638609867168d) + "'", double2 == (-15.853638609867168d));
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 75L, 6400);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-126.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9439841391523142d + "'", double1 == 0.9439841391523142d);
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.1741109918529156d, 0.6679190596134986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6679190596134986d + "'", double2 == 0.6679190596134986d);
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        double double2 = org.apache.commons.math3.util.FastMath.pow(200.3351263076086d, 6400);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9172426875149238d, 0.004420564839032246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0021857658352489153d + "'", double2 == 0.0021857658352489153d);
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        double double1 = org.apache.commons.math3.util.FastMath.tan(106.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0592232274909887d) + "'", double1 == (-1.0592232274909887d));
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(6.212020862233431E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.212020862233431E-18d + "'", double1 == 6.212020862233431E-18d);
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.5185125808637102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8033776881577706d + "'", double1 == 0.8033776881577706d);
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        long long2 = org.apache.commons.math3.util.FastMath.min(63L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(6.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(7.5796654013055405E-28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.5796654013055405E-28d + "'", double1 == 7.5796654013055405E-28d);
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.7725886626351346d, (-0.021989770635849296d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7725886626351346d + "'", double2 == 2.7725886626351346d);
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.233403117511217d, 0.002415168146714362d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2334054821199578d + "'", double2 == 1.2334054821199578d);
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-149));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-149.0d) + "'", double1 == (-149.0d));
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(7.629394531250002E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629394531175987E-6d + "'", double1 == 7.629394531175987E-6d);
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(7.313219942645561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6781233564734555d + "'", double1 == 2.6781233564734555d);
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.5793535481493914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        double double2 = org.apache.commons.math3.util.FastMath.min(6.811682183676626d, 5.897032971783702d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.897032971783702d + "'", double2 == 5.897032971783702d);
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.09937288259301753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09473991049806847d + "'", double1 == 0.09473991049806847d);
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 138L, Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-138.0f) + "'", float2 == (-138.0f));
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 187, (-0.012849789557351726d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 186.99998f + "'", float2 == 186.99998f);
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 9.223373E19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.964889768248362d + "'", double1 == 19.964889768248362d);
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.38991180981350987d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49415175818839135d) + "'", double1 == (-0.49415175818839135d));
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1.23794004E27f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.07639343095502d + "'", double1 == 63.07639343095502d);
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.789716390178187E26d), (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(16.252646034500078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.480455125209073d + "'", double1 == 3.480455125209073d);
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.26310292903031E33d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.263102929030309E33d + "'", double2 == 7.263102929030309E33d);
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(9.382939107340336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.382939107340338d + "'", double1 == 9.382939107340338d);
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.15786583843612662d, 192.21757041936067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15786583843612662d + "'", double2 == 0.15786583843612662d);
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.013768389245705632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7888705944722437d + "'", double1 == 0.7888705944722437d);
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-10.017874927409903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999554043807747d) + "'", double1 == (-0.9999554043807747d));
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-14));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(22.418333678328555d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0677263196157526E20d + "'", double2 == 2.0677263196157526E20d);
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        int int2 = org.apache.commons.math3.util.FastMath.max((-458), (-458));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-458) + "'", int2 == (-458));
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 31.999996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.46573578359043d + "'", double1 == 3.46573578359043d);
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7992353978425616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.223839925475233d + "'", double1 == 2.223839925475233d);
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.006264389542770914d, 1.5293379817722996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006264389542770915d + "'", double2 == 0.006264389542770915d);
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1023.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.2873554892516914d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.012128149649440787d, (double) (-4.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.0d) + "'", double2 == (-4.0d));
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 22026.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707509259050705d + "'", double1 == 1.5707509259050705d);
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6605207131100784d + "'", double1 == 0.6605207131100784d);
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 97L, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 388.0d + "'", double2 == 388.0d);
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 0, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1.26765045E30f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.013610279473449985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.0842022E-19f, (-1018.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1018.0f) + "'", float2 == (-1018.0f));
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        double double1 = org.apache.commons.math3.util.FastMath.rint(89.54726317526658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.25d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22119921692859512d) + "'", double1 == (-0.22119921692859512d));
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.40180391273652716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4945182479484402d + "'", double1 == 1.4945182479484402d);
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1018.00006f, 0.04452297315338434d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1018.0f + "'", float2 == 1018.0f);
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.723507742868687E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.725186498135784d + "'", double1 == 21.725186498135784d);
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.8435577321556793d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7470130562799936d) + "'", double1 == (-0.7470130562799936d));
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 3L, 2.102E-42f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.4696084840113481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9948848769417228d + "'", double1 == 0.9948848769417228d);
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.5305894532583966d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.4353833334705676d), 0.2612473073318639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5077487593801612d + "'", double2 == 0.5077487593801612d);
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 138.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7906.818447069574d + "'", double1 == 7906.818447069574d);
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.6487212707001282d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.7837860351644754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9923895833351326d + "'", double1 == 0.9923895833351326d);
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.2699847631416846E296d, 1.0124843102732668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2699847631416842E296d + "'", double2 == 3.2699847631416842E296d);
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.5243549E-29f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.5243552E-29f + "'", float1 == 2.5243552E-29f);
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8104874485208914d, 0.6047432792246682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6047432792246682d + "'", double2 == 0.6047432792246682d);
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 18, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 2.24E-44f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8197907155348637E-15d + "'", double1 == 2.8197907155348637E-15d);
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.2379402E27f, 6.718548E31f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.718548E31f + "'", float2 == 6.718548E31f);
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.1564407373162061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8056501458546222d) + "'", double1 == (-0.8056501458546222d));
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-127.0f), (-4.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.6554162488146006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6094892958074748d + "'", double1 == 0.6094892958074748d);
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.16193403859934294d), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16193403859934294d) + "'", double2 == (-0.16193403859934294d));
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (-126.999985f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-126.999985f) + "'", float2 == (-126.999985f));
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 258047.98f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 258047.0d + "'", double1 == 258047.0d);
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(97.04617139798238d, (-0.005575957634910489d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708537835451057d + "'", double2 == 1.5708537835451057d);
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 79);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 79.00001f + "'", float1 == 79.00001f);
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-1.2676505E30f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        double double1 = org.apache.commons.math3.util.FastMath.log((-6.07975889918023E10d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.23794004E27f, 1.1884224E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.23794004E27f + "'", float2 == 1.23794004E27f);
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 10.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.998223140086234d + "'", double1 == 2.998223140086234d);
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.8626451E-9f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8626451492309568E-9d + "'", double2 == 1.8626451492309568E-9d);
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.973642758047122E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.973642758047121E-8d + "'", double1 == 3.973642758047121E-8d);
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.289430284648579d), 2.0626820368470065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.289430284648579d) + "'", double2 == (-0.289430284648579d));
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(5.438612812779122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.438612812779123d + "'", double1 == 5.438612812779123d);
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-52.000004f), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.3732912E-4f, (-0.9999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3732912E-4f + "'", float2 == 1.3732912E-4f);
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8191520442889918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.8715802485510056E20d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.03837595936612E29d + "'", double2 == 8.03837595936612E29d);
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(18.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.1911036946760945E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2837568197948556E-15d + "'", double1 == 2.2837568197948556E-15d);
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.8446748471756063E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 18L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6207413942088964d + "'", double1 == 2.6207413942088964d);
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 26);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 26L + "'", long1 == 26L);
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        float float2 = org.apache.commons.math3.util.FastMath.min(32.00001f, 32.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.00001f + "'", float2 == 32.00001f);
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3166247903554003d + "'", double1 == 3.3166247903554003d);
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-5.4470149E9f), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.4470149E9f) + "'", float2 == (-5.4470149E9f));
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        int int2 = org.apache.commons.math3.util.FastMath.max(35, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-1023L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1023L + "'", long1 == 1023L);
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0021857658352489153d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0021857658352489153d + "'", double2 == 0.0021857658352489153d);
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.420081748504424E270d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.7778696553673483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7152939446264618d + "'", double1 == 0.7152939446264618d);
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5653799348568223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1641303166053958d + "'", double1 == 1.1641303166053958d);
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.23731568623588914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23514276401971068d + "'", double1 == 0.23514276401971068d);
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.03079223296E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 61944147371L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(22.418333678328555d, 0.06670719631768762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.418432923889235d + "'", double2 == 22.418432923889235d);
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.7400166479096761d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7400166479096761d + "'", double1 == 0.7400166479096761d);
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.2684529660545276d, 1.6209036226920994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.058227752497012d + "'", double2 == 2.058227752497012d);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5327963125236287E304d, 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5927622578907794d, 1.00000002049957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5927622578907794d + "'", double2 == 1.5927622578907794d);
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2147483647, (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0092655367037576E-36d + "'", double2 == 3.0092655367037576E-36d);
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.9117340478983207d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-138.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 138.0f + "'", float1 == 138.0f);
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        int int2 = org.apache.commons.math3.util.FastMath.min(138, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 138 + "'", int2 == 138);
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 26, 54L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2.3768449E32f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.3768447E32f) + "'", float1 == (-2.3768447E32f));
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8550811513593495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8550811513593496d + "'", double1 == 0.8550811513593496d);
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(458.00003f, (-2.07E-43f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-458.00003f) + "'", float2 == (-458.00003f));
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.035211118248524166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03521111824852417d + "'", double1 == 0.03521111824852417d);
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(79.0f, (-5.877472E-39f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-79.0f) + "'", float2 == (-79.0f));
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(328281.00000000006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.70162827408527d + "'", double1 == 12.70162827408527d);
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0148003881138887E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.69314718055995d + "'", double1 == 76.69314718055995d);
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        double double1 = org.apache.commons.math3.util.FastMath.rint(7.694785265142018E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.694785265142018E23d + "'", double1 == 7.694785265142018E23d);
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.017459443376353793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.30685281944005d + "'", double1 == 96.30685281944005d);
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.7254630513334037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1994124557376138d + "'", double1 == 1.1994124557376138d);
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-6));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-5.9999995f) + "'", float1 == (-5.9999995f));
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(96.99999f, 11013.21191404869d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.27490521305142845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.0466282343967674d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932228461263812d + "'", double1 == 2.9932228461263812d);
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 7L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        long long2 = org.apache.commons.math3.util.FastMath.min(8L, 1018L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.09E-43f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.1E-43f + "'", float1 == 2.1E-43f);
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (-1.1329639571222294d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        int int2 = org.apache.commons.math3.util.FastMath.min(25, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 1.9073486E-6f, 1018);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3575430359313366E300d + "'", double2 == 5.3575430359313366E300d);
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.0384596E34f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9706244805940947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01294875932935354d) + "'", double1 == (-0.01294875932935354d));
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5708537835451057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.00329202929152d + "'", double1 == 90.00329202929152d);
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 2.24E-44f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-100.50634118119207d) + "'", double1 == (-100.50634118119207d));
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.8813735448726939d), (-0.8036261707997578d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1927423644675912d + "'", double2 == 1.1927423644675912d);
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-127));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        int int1 = org.apache.commons.math3.util.FastMath.abs(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(8.69889334015925E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5182433006558598E-6d + "'", double1 == 1.5182433006558598E-6d);
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2.7787262E7f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.778726E7f) + "'", float1 == (-2.778726E7f));
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        float float1 = org.apache.commons.math3.util.FastMath.signum(9.094949E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4421.593908697327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 95L, (-0.027181892591221314d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.027181892591221314d) + "'", double2 == (-0.027181892591221314d));
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        double double2 = org.apache.commons.math3.util.FastMath.max(5.9604644775390625E-8d, (-2.204438512506361d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.9604644775390625E-8d + "'", double2 == 5.9604644775390625E-8d);
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 26L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) -1, 144L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144L + "'", long2 == 144L);
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(62.0f, 3.9443045E-31f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 62.0f + "'", float2 == 62.0f);
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.102E-42f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.39972514891529615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9211679912654148d + "'", double1 == 0.9211679912654148d);
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 22026.004f, 101.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22026.00390625d + "'", double2 == 22026.00390625d);
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 1.9978517795247785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.021989770635849296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021989770635849292d) + "'", double1 == (-0.021989770635849292d));
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9073486E-6f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073485E-6f + "'", float2 == 1.9073485E-6f);
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.43223916527406225d, 5.53754499586793E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.77904466796625E-10d) + "'", double2 == (-6.77904466796625E-10d));
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (double) 53248);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53248.0d + "'", double2 == 53248.0d);
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.4750429751260321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45737666422341455d + "'", double1 == 0.45737666422341455d);
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.1920610408619642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9816129037711879d + "'", double1 == 0.9816129037711879d);
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.223839925475233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7992353978425616d + "'", double1 == 0.7992353978425616d);
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(16.25264603450008d, 0.026931837701290248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5691392542792273d + "'", double2 == 1.5691392542792273d);
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9921249019112125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9973680462002735d + "'", double1 == 0.9973680462002735d);
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.7400166479096761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8602422030507897d + "'", double1 == 0.8602422030507897d);
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.3768449E32f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.7185149746194424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718514974619443d + "'", double1 == 2.718514974619443d);
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.09473991049806847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        double double1 = org.apache.commons.math3.util.FastMath.signum(5.447015424E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 6.9999995f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0000000422840953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.086227143433629d, (-40));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6808785516148948E-13d + "'", double2 == 1.6808785516148948E-13d);
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.7209987736895118d), 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8221711451973557E12d + "'", double2 == 1.8221711451973557E12d);
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.825487151967882d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        double double2 = org.apache.commons.math3.util.FastMath.log(18.99935244416265d, 0.699521118285311d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12136893780784676d) + "'", double2 == (-0.12136893780784676d));
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1884224E32f, (float) 96L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1884224E32f + "'", float2 == 1.1884224E32f);
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 25, (long) 31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9780821240516806d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (-0.16664239346762777d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 187L, 4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 186.99999999999997d + "'", double2 == 186.99999999999997d);
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        double double1 = org.apache.commons.math3.util.FastMath.tan(402.4287934927351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31475050324190496d + "'", double1 == 0.31475050324190496d);
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.7470130562799936d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

