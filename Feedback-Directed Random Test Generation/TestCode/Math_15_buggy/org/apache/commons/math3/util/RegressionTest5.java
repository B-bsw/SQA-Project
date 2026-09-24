package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 0, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.43223916527406225d, 1025.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43223916527406225d + "'", double2 == 0.43223916527406225d);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.14620091577486963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14672230633339658d + "'", double1 == 0.14672230633339658d);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.36787946309876646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.068434252532353d + "'", double1 == 1.068434252532353d);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.438801799115821d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-7.016027794960618d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.9843749f), 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 117341.7564427926d + "'", double1 == 117341.7564427926d);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-17));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(10.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000002f + "'", float1 == 10.000002f);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-3.49391564547484d), (double) 52.000004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.11725091815784d + "'", double2 == 52.11725091815784d);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        double double1 = org.apache.commons.math3.util.FastMath.log10(126.99999237060547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.103803694866161d + "'", double1 == 2.103803694866161d);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        long long2 = org.apache.commons.math3.util.FastMath.max((-149L), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 750.0f, 0.6080833035834922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.01144166945411d + "'", double2 == 56.01144166945411d);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.1415126117084844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002469861007409331d + "'", double1 == 0.002469861007409331d);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(138.0088572840262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.747717109465404d + "'", double1 == 11.747717109465404d);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.9333634218998555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0749096321666731d) + "'", double1 == (-1.0749096321666731d));
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-148.99998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.950423060997261E-65d + "'", double1 == 1.950423060997261E-65d);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(750.00006f, 1.0000000000000284d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5707886974003653d, (double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.7453293851523841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453293851523843d + "'", double1 == 1.7453293851523843d);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.16267372390397128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.163399870121596d + "'", double1 == 0.163399870121596d);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(149.0f, 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        double double2 = org.apache.commons.math3.util.FastMath.pow(96.99999237060545d, 0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1291321151650904d + "'", double2 == 1.1291321151650904d);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 1.9843749f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9843749f + "'", float2 == 1.9843749f);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(22025.000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.02655421183195658d, (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5710207593912806d + "'", double2 == 1.5710207593912806d);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        float float2 = org.apache.commons.math3.util.FastMath.min(127.00001f, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.094947E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0842022E-19f + "'", float1 == 1.0842022E-19f);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9792710754903938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.662514762151963d + "'", double1 == 1.662514762151963d);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-127), (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.22609662867095306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2536968024812311d + "'", double1 == 0.2536968024812311d);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(12.000002f, 0.0028241459131883822d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.000001f + "'", float2 == 12.000001f);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(12.000001f, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.40432E16f + "'", float2 == 5.40432E16f);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-1L), (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.440356430148375d, (-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.440356430148375d) + "'", double2 == (-2.440356430148375d));
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4096, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.3283064365386964E22d, (double) 7L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0d + "'", double2 == 7.0d);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 6.0000005f, 0.14672230633339658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5463474835799746d + "'", double2 == 1.5463474835799746d);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        double double2 = org.apache.commons.math3.util.FastMath.pow(32.376000838461856d, (double) 750L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.5060119336077023E83d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5060119336077023E83d + "'", double2 == 1.5060119336077023E83d);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1500.0003333332963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.72983776538828d + "'", double1 == 38.72983776538828d);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6123757901317819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-2.1850398632615184d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-125.1935622327275d) + "'", double1 == (-125.1935622327275d));
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.3768448754279146E32d, (-9.256230992860951E225d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.256230992860951E225d + "'", double2 == 9.256230992860951E225d);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-9.256230992860951E225d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5514298635472507d, 1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852868E30d + "'", double2 == 1.5845632502852868E30d);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(97.19293729440321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.269871691676145d + "'", double1 == 5.269871691676145d);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(126.99999237060547d, 1.9978517795247785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.01570561889895d + "'", double2 == 127.01570561889895d);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.19607161940718024d, 1.4842386559313054d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19607161940718026d + "'", double2 == 0.19607161940718026d);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.1920928E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(18.460482067365035d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(25.75100659895216d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        double double2 = org.apache.commons.math3.util.FastMath.max(6.811682183676626d, 1.0830799868521925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.811682183676626d + "'", double2 == 6.811682183676626d);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.797874411390694E167d, 1.5640850181635741d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.820766091346741E-11d + "'", double1 == 5.820766091346741E-11d);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.3560551570236352d, (-1.522697550491263d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16664239346762777d) + "'", double2 == (-0.16664239346762777d));
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.288774100786787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6578630036664289d) + "'", double1 == (-0.6578630036664289d));
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        double double1 = org.apache.commons.math3.util.FastMath.abs(328280.725258389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328280.725258389d + "'", double1 == 328280.725258389d);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-149), 127.01570561889895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8648790814947103d) + "'", double2 == (-0.8648790814947103d));
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.003946203537474d, (-0.16125382097679095d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00507775325695467d + "'", double2 == 0.00507775325695467d);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-9223372036854775808L), 78.6900675259798d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.2233715E18f) + "'", float2 == (-9.2233715E18f));
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 4096L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0005f + "'", float1 == 4096.0005f);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.185891831851989d) + "'", double1 == (-4.185891831851989d));
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7853981633974483d, 1.1235582092889473E307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9640275800758169d) + "'", double1 == (-0.9640275800758169d));
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.41032129904824216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9169927026825043d + "'", double1 == 0.9169927026825043d);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        double double2 = org.apache.commons.math3.util.FastMath.min((-44.3614195558365d), 6.553096817707418d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-44.3614195558365d) + "'", double2 == (-44.3614195558365d));
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.633123935319537E16d, (-1.522697550491263d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948968d + "'", double2 == 1.5707963267948968d);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.026931837701290245d, 8.63114046460753E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.120310440054329E-41d + "'", double2 == 3.120310440054329E-41d);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.408554367752175d, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07156993751100402d + "'", double2 == 0.07156993751100402d);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.058916076536616895d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.7320508075688772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7320508075688774d + "'", double1 == 1.7320508075688774d);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.1585290151921035d, 4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.150426909772811E-4d + "'", double2 == 2.150426909772811E-4d);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5716460415244097E-138d, (-0.8813735448726939d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5716460415244097E-138d + "'", double2 == 1.5716460415244097E-138d);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.565804732394659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.0562853121379475E-37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.735936195599085E-13d + "'", double1 == 6.735936195599085E-13d);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 96.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1500L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.179938779914945d + "'", double1 == 26.179938779914945d);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 52L, 4096.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.0f, 22026.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        float float2 = org.apache.commons.math3.util.FastMath.max(11.999999f, 7.5557864E22f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.5557864E22f + "'", float2 == 7.5557864E22f);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(22.418333678328555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.73480027861034d + "'", double1 == 4.73480027861034d);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(32.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (byte) 10, 0.16181164155481406d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7528415227961107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7528415227961107d + "'", double1 == 0.7528415227961107d);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.0f, (-2.09E-43f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.15987052369731924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17335893897908844d + "'", double1 == 0.17335893897908844d);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-44.3614195558365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-45.0d) + "'", double1 == (-45.0d));
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7717075948257832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7167209065866512d + "'", double1 == 0.7167209065866512d);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.0038417443621884145d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 7.0000005f, 1.7945743751980148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3198335243404105d + "'", double2 == 1.3198335243404105d);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 22025L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5635500768149995d, 102.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5635500768149997d + "'", double2 == 1.5635500768149997d);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1499.9999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0f + "'", float1 == 1500.0f);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 3.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7627472583327795d + "'", double1 == 1.7627472583327795d);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.17702174851391653d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.911465395190167d + "'", double2 == 31.911465395190167d);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1023 + "'", int2 == 1023);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        double double2 = org.apache.commons.math3.util.FastMath.log(45.254833995939045d, (double) 148.99998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3125760677670308d + "'", double2 == 1.3125760677670308d);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.6920724930525287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6053856514068299d + "'", double1 == 0.6053856514068299d);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 97L, 138);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 10, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(12.0f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(127.0f, (-2.3768449E32f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 3, (float) 76);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.8604993868447559d), 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7209987736895118d) + "'", double2 == (-1.7209987736895118d));
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.22011573792157446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.221933116817157d) + "'", double1 == (-0.221933116817157d));
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.048113204656145E-141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.048113204656145E-141d + "'", double1 == 1.048113204656145E-141d);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.22168521914039824d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.0995616862503343d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.617514616813844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        double double1 = org.apache.commons.math3.util.FastMath.tan(96.99999237060545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4103302129827837d) + "'", double1 == (-0.4103302129827837d));
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-18), (long) (-17));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.0E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E20d + "'", double1 == 1.0E20d);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6795276293349446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.807880403871141d + "'", double1 == 0.807880403871141d);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        long long2 = org.apache.commons.math3.util.FastMath.max(12L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.7968076702201445d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7968076702201445d + "'", double2 == 0.7968076702201445d);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.6698790550935152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1499.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.4874710524825647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4522069348155952d) + "'", double1 == (-0.4522069348155952d));
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 750, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1884224E32f + "'", float2 == 1.1884224E32f);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.005969933155126179d), 0.026938351971522147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026938351971522147d + "'", double2 == 0.026938351971522147d);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(9.999998092651369d, 3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999998092651367d + "'", double2 == 9.999998092651367d);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.9342812E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1529215E18f + "'", float1 == 1.1529215E18f);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5706217938714693d, 1.081221371125345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9678957951470605d + "'", double2 == 0.9678957951470605d);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        double double1 = org.apache.commons.math3.util.FastMath.abs(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.762747174039086d, 1.076985968228509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.076985968228509d + "'", double2 == 1.076985968228509d);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.0836962511904766d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(Float.POSITIVE_INFINITY, 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.07545690704752087d), (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.983978114526449E-12d + "'", double2 == 5.983978114526449E-12d);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.3754263876807227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.956763478491886d + "'", double1 == 3.956763478491886d);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(7.2247201030232695d, (-0.942437867146782d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7005101697610547d + "'", double2 == 1.7005101697610547d);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.09252791806716626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6634567844538422d + "'", double1 == 1.6634567844538422d);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.06434163106438166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06443056647584822d) + "'", double1 == (-0.06443056647584822d));
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 6L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        double double1 = org.apache.commons.math3.util.FastMath.floor(148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.0d + "'", double1 == 148.0d);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.7763568394002489E-15d, 1.0036030562437495d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7763568394002489E-15d + "'", double2 == 1.7763568394002489E-15d);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.000000000000001d + "'", double1 == 5.000000000000001d);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-127L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.128360965853085d, 18.460482067365035d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.582769399647436d + "'", double2 == 18.582769399647436d);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1029.9685644157091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3862943611198906d + "'", double1 == 1.3862943611198906d);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        int int2 = org.apache.commons.math3.util.FastMath.max(4096, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4096 + "'", int2 == 4096);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9746486480944884d, 2.080594477611303E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9746486480944883d + "'", double2 == 0.9746486480944883d);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.3237334981628701d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.97364275804712E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.973642758047122E-8d + "'", double1 == 3.973642758047122E-8d);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567780803774d + "'", double1 == 0.027415567780803774d);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.47381939152118935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.688345401322032d + "'", double1 == 0.688345401322032d);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.8526676855528264E78d, 0.8480576692493907d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8526676855528264E78d + "'", double2 == 1.8526676855528264E78d);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        double double1 = org.apache.commons.math3.util.FastMath.tan(11.747717109465404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0688248503046665d) + "'", double1 == (-1.0688248503046665d));
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        int int2 = org.apache.commons.math3.util.FastMath.max(32, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        int int1 = org.apache.commons.math3.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2979.38053468028d, 101.46782120377229d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2979.3805346802797d + "'", double2 == 2979.3805346802797d);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        double double1 = org.apache.commons.math3.util.FastMath.exp(97.01261692195835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.355327355879784E42d + "'", double1 == 1.355327355879784E42d);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999875783251015d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999751568045011d + "'", double2 == 0.9999751568045011d);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.027415567780803778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-9.223372036854776E18d), 18128.26395102926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854776E18d + "'", double2 == 9.223372036854776E18d);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(18.582769399647436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1064.7142582646527d + "'", double1 == 1064.7142582646527d);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 5, (long) (-149));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(10.000000000000002d, 0.1578293055013132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.001245426929342d + "'", double2 == 10.001245426929342d);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016388539363305053d + "'", double1 == 0.016388539363305053d);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        long long2 = org.apache.commons.math3.util.FastMath.max(5447015486L, (long) 4096);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5447015486L + "'", long2 == 5447015486L);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(10.000001f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1018, (long) 1023);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1018L + "'", long2 == 1018L);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.15919046908362347d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.627430214775713E-5d + "'", double2 == 1.627430214775713E-5d);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0113951599323715E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.8828125E-4f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8828125E-4f + "'", float2 == 4.8828125E-4f);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        double double2 = org.apache.commons.math3.util.FastMath.max(26.179938779914945d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.1920928E-7f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.000000000000001d + "'", double1 == 5.000000000000001d);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9758393522576108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        double double2 = org.apache.commons.math3.util.FastMath.max(9.580542411316679E-15d, 0.6123757901317819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6123757901317819d + "'", double2 == 0.6123757901317819d);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.5835191503837134d, 2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8886168046158662d) + "'", double2 == (-0.8886168046158662d));
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        int int2 = org.apache.commons.math3.util.FastMath.max(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-126.99999f), 35.00000381469727d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.3025849976266093d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3025849976266093d + "'", double2 == 2.3025849976266093d);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.0836962511904766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 76, 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.551115123125783E-17d, (double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.551115123125783E-17d + "'", double2 == 5.551115123125783E-17d);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.656854249492381d, 22.248715438260383d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24897964224240698d + "'", double2 == 0.24897964224240698d);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0E100d, (double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998E99d + "'", double2 == 9.999999999999998E99d);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.25484119874557287d, 6.735936195599085E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.500218349388472d + "'", double2 == 20.500218349388472d);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(22026.002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.001953125f + "'", float1 == 0.001953125f);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 750L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.4515827052894548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4374925441739296d + "'", double1 == 0.4374925441739296d);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.1170794008387335d), 15.29676667877352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.33750100937614d + "'", double2 == 15.33750100937614d);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        float float2 = org.apache.commons.math3.util.FastMath.max(32.000008f, (-52.000004f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000008f + "'", float2 == 32.000008f);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.401298464324817E-45d, 5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6448115121396387E-46d + "'", double2 == 2.6448115121396387E-46d);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.00001f + "'", float1 == 97.00001f);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(12.000002f, 15.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.000002f + "'", float2 == 12.000002f);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        float float2 = org.apache.commons.math3.util.FastMath.max(31.999996f, 5.4470154E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4470154E9f + "'", float2 == 5.4470154E9f);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.38636319993752116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.396685334941981d + "'", double1 == 0.396685334941981d);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        double double2 = org.apache.commons.math3.util.FastMath.pow(114.59155902616463d, 1024.999755859375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.7687861752511085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.0f, 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51200.0f + "'", float2 == 51200.0f);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(17.894443933771722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.894443933771726d + "'", double1 == 17.894443933771726d);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-126.99999f), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-253.99998f) + "'", float2 == (-253.99998f));
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        long long1 = org.apache.commons.math3.util.FastMath.round(7.629394531250002E-6d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.7254630513334037d, 127);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.935723255711777E38d + "'", double2 == 2.935723255711777E38d);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-149L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-54));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.415376651637347E23d) + "'", double1 == (-1.415376651637347E23d));
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.1578506894064046d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.39165746393081896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3817208956030992d + "'", double1 == 0.3817208956030992d);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(12.701627437177594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 164140.86262767154d + "'", double1 == 164140.86262767154d);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.233403117511217d + "'", double1 == 1.233403117511217d);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.03079223296E11d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.05553124655104E14d + "'", double2 == 1.05553124655104E14d);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(35.00000381469727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860195024861605E15d + "'", double1 == 1.5860195024861605E15d);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.3618317991931828E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.13412347087103d + "'", double1 == 34.13412347087103d);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5327963125236284E304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5327963125236287E304d + "'", double1 == 1.5327963125236287E304d);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.9611213280559075E-308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        double double2 = org.apache.commons.math3.util.FastMath.log(5.269871691676145d, (-0.7966228647962957d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-3.5498905892585824d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.373400766945016d + "'", double1 == 1.373400766945016d);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        long long2 = org.apache.commons.math3.util.FastMath.max(750L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.01893945804830624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018940590342241933d + "'", double1 == 0.018940590342241933d);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        long long2 = org.apache.commons.math3.util.FastMath.min(52L, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023L) + "'", long2 == (-1023L));
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        double double2 = org.apache.commons.math3.util.FastMath.min(22026.0d, 1.0585641430645576d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0585641430645576d + "'", double2 == 1.0585641430645576d);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.102E-42f, 2.3768449E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.102E-42f + "'", float2 == 2.102E-42f);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.031634807252392476d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.60243641290531d + "'", double1 == 1.60243641290531d);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.308769561254787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 304.1700902674171d + "'", double1 == 304.1700902674171d);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 97L, (float) 138L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        long long2 = org.apache.commons.math3.util.FastMath.max(5447015486L, (long) (-149));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5447015486L + "'", long2 == 5447015486L);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.2684529660545276d, 0.8480576692493907d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4203952968051369d + "'", double2 == 0.4203952968051369d);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.1908327857428453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.41541687366796d + "'", double1 == 4.41541687366796d);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.7450920600186577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2942474977419397d) + "'", double1 == (-0.2942474977419397d));
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.16664239346762777d), (-0.0271852399623789d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16664239346762777d) + "'", double2 == (-0.16664239346762777d));
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-97.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.1425465430742778d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1023.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1023.0d + "'", double1 == 1023.0d);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-0.5f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008726646259971648d) + "'", double1 == (-0.008726646259971648d));
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6301286610132414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 12L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 0.008022644671146243d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(10.000001f, 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223373E19f + "'", float2 == 9.223373E19f);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.5514298635472507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8517762794017062d + "'", double1 == 0.8517762794017062d);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.15987052369731924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0842022E-19f, 0.9950547536867305d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842023E-19f + "'", float2 == 1.0842023E-19f);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.027415567780803774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.784919240787009E-4d + "'", double1 == 4.784919240787009E-4d);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.633123935319537E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.21301914394243d + "'", double1 == 16.21301914394243d);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.08032752400444744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001401979773852388d + "'", double1 == 0.001401979773852388d);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 76, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 76.0f + "'", float2 == 76.0f);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08737760592421796d + "'", double1 == 0.08737760592421796d);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.247748258387595d + "'", double1 == 17.247748258387595d);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(107.53731818565555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.595196397132241E-32d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-106) + "'", int1 == (-106));
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1920928E-7f, 10.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920928E-7f + "'", float2 == 1.1920928E-7f);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-6), 3.9999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9999998f + "'", float2 == 3.9999998f);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.2089257E24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.20892575E24f + "'", float1 == 1.20892575E24f);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(89.54726317526658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.462941570952797d + "'", double1 == 9.462941570952797d);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 12);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        long long2 = org.apache.commons.math3.util.FastMath.max(79L, (long) 1023);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023L + "'", long2 == 1023L);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(11.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.564085018163574d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1500L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.013560982203286d + "'", double1 == 9.013560982203286d);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-7.111969304174328E-6d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1 == (-18));
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-30.708115498279298d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.0d) + "'", double1 == (-31.0d));
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9172426875149238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8079404376202444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6795639535619324d + "'", double1 == 0.6795639535619324d);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.16371340869567735d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-5.877472E-39f), 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.877472E-39f + "'", float2 == 5.877472E-39f);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.5136814478622124d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        double double1 = org.apache.commons.math3.util.FastMath.exp(6.811682183676626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 908.3976140407738d + "'", double1 == 908.3976140407738d);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(22025.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261939.543775638d + "'", double1 == 1261939.543775638d);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(22025.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.03100307406022d + "'", double1 == 28.03100307406022d);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.6209036226920994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.057658467270625d + "'", double1 == 5.057658467270625d);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192093037616354E-7d + "'", double1 == 1.192093037616354E-7d);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.0512062454087515E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        long long1 = org.apache.commons.math3.util.FastMath.round(6.591783121186793E31d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.71828215250351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4107809950605586d + "'", double1 == 0.4107809950605586d);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.560487413648653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.40934278535332d + "'", double1 == 89.40934278535332d);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        int int2 = org.apache.commons.math3.util.FastMath.min(1023, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.94875668844129d + "'", double1 == 2.94875668844129d);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8898290414478994d, 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2300806254785061E-52d + "'", double2 == 1.2300806254785061E-52d);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 12, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.52587890625E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.44415377950555d + "'", double1 == 26.44415377950555d);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2005.3522829578812d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.02655421183195658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16295463120745166d + "'", double1 == 0.16295463120745166d);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9875650456761652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7563221378721827d + "'", double1 == 0.7563221378721827d);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 53247.996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.008022644671146243d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2567246294766798d + "'", double2 == 0.2567246294766798d);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.6554162488146006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6554162488146007d + "'", double1 == 0.6554162488146007d);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.026547972235306663d, 3.970566590482209E45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026547972235306663d + "'", double2 == 0.026547972235306663d);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.159127075050616d, (-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6378768135265336d + "'", double2 == 1.6378768135265336d);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        float float1 = org.apache.commons.math3.util.FastMath.signum(75.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9682413013090552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9892996786096249d + "'", double1 == 0.9892996786096249d);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        double double2 = org.apache.commons.math3.util.FastMath.max(15.29676667877352d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.29676667877352d + "'", double2 == 15.29676667877352d);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        double double1 = org.apache.commons.math3.util.FastMath.atan(53.80040108927525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.552211244862155d + "'", double1 == 1.552211244862155d);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        int int1 = org.apache.commons.math3.util.FastMath.round(149.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.2835960924048626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.076985968228509d, 22.48528964305201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.076985968228509d + "'", double2 == 1.076985968228509d);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        float float2 = org.apache.commons.math3.util.FastMath.min(512.0f, 15.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.000001f + "'", float2 == 15.000001f);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9999983369439447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414700862537113d + "'", double1 == 0.8414700862537113d);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.1291321151650904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9075712776160786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9526653544745283d + "'", double1 == 0.9526653544745283d);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 100, (-148.99998f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.026547972235306663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02654173791358725d + "'", double1 == 0.02654173791358725d);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        int int2 = org.apache.commons.math3.util.FastMath.min(4, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-149L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 22026);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        int int1 = org.apache.commons.math3.util.FastMath.round(31.999996f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1884224E32f, (double) (-106));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1884223E32f + "'", float2 == 1.1884223E32f);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(11013.232920103323d, 0.5403024061792941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232920103323d + "'", double2 == 11013.232920103323d);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 149.0f, 2.4531176911848156E25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0739034468434105E-24d + "'", double2 == 6.0739034468434105E-24d);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.07545690704752087d), 5729.577951308233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.07545690704752087d) + "'", double2 == (-0.07545690704752087d));
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 9.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4121184852417566d + "'", double1 == 0.4121184852417566d);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5860195024861605E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.69315099525722d + "'", double1 == 35.69315099525722d);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 22026.002f, 1.2998044433940747d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22026.001953125d + "'", double2 == 22026.001953125d);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920930376163597E-7d + "'", double1 == 1.1920930376163597E-7d);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.026938351971522147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.3734007669450157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8643238493907621d + "'", double1 == 0.8643238493907621d);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        double double2 = org.apache.commons.math3.util.FastMath.min(22.418333678328555d, 3.031835271646539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.031835271646539d + "'", double2 == 3.031835271646539d);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.177193365409636E-8d, (-3.031835271646539d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1415926365136895d + "'", double2 == 3.1415926365136895d);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.956763478491886d, 1.7320508075688774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.956763478491886d + "'", double2 == 3.956763478491886d);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 7.0f, (-0.942437867146782d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15978926741180702d + "'", double2 == 0.15978926741180702d);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 97, (double) 1018);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(718053.0d, 97.19293729440321d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 718052.9999999999d + "'", double2 == 718052.9999999999d);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.5855175597800497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2769028317709905d + "'", double1 == 1.2769028317709905d);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5635500768149995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9159937224722687d + "'", double1 == 0.9159937224722687d);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.06537329234338424d, 3.010723761948906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06537329234338425d + "'", double2 == 0.06537329234338425d);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-57.1143461733168d), 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.95729927114847d + "'", double2 == 57.95729927114847d);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.012849789557351724d), (-0.6420926159343308d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.012849789557351726d) + "'", double2 == (-0.012849789557351726d));
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9289897956534603d, 0.40180391273652716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.378790834633142d + "'", double2 == 12.378790834633142d);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.8480576692493907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3351068943768114d + "'", double1 == 1.3351068943768114d);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610486d + "'", double1 == 5.298292365610486d);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.2536968024812311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9679911994835083d + "'", double1 == 0.9679911994835083d);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021989770635849296d) + "'", double1 == (-0.021989770635849296d));
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 35, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) 10, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.16323882911185375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.570796326794893d, 384.416897404767d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794893d + "'", double2 == 1.570796326794893d);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.41095182754680054d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 138.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.620414103520911d + "'", double1 == 5.620414103520911d);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.848629212096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16413292293649706d) + "'", double1 == (-0.16413292293649706d));
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(75.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0000001192092898d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-127L), (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-97.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(74.20321057778875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.07726425812829045d, (double) (-253.99998f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07726425812829045d + "'", double2 == 0.07726425812829045d);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-54), (-18L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9950547536867305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9950547536867304d) + "'", double1 == (-0.9950547536867304d));
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-56.83127452036154d), (-2.185039863261519d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.873264042190655d + "'", double2 == 56.873264042190655d);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-2.204438512506361d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        int int2 = org.apache.commons.math3.util.FastMath.max((-106), (-106));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106) + "'", int2 == (-106));
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5710207593912806d, (-0.41095182754680054d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5710207593912806d + "'", double2 == 1.5710207593912806d);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(8.108075398769753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7897890063461337d + "'", double1 == 2.7897890063461337d);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-17));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-16.999998f) + "'", float1 == (-16.999998f));
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.802425921479547d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 12L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        long long2 = org.apache.commons.math3.util.FastMath.min(97L, (long) 22026);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(33.418366853490404d, 1.7945743751980148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.418366853490404d + "'", double2 == 33.418366853490404d);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.1920928E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.830188762901751E-6d + "'", double1 == 6.830188762901751E-6d);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.7608407657843304d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.822713036326232d) + "'", double1 == (-2.822713036326232d));
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9640275800758169d + "'", double1 == 0.9640275800758169d);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.71828215250351d, 0.396685334941981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.71828215250351d + "'", double2 == 2.71828215250351d);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(53247.996f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53247.996f + "'", float2 == 53247.996f);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        double double2 = org.apache.commons.math3.util.FastMath.log((-5.447015424E9d), 53.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 97, 127.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        int int2 = org.apache.commons.math3.util.FastMath.min(1, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.761141324937584d + "'", double1 == 4.761141324937584d);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.16589945506899414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16589945506899414d + "'", double1 == 0.16589945506899414d);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.973642758047122E-8d, 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.722257605773872E-8d + "'", double2 == 4.722257605773872E-8d);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.9998646693394199d), 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998646693394199d + "'", double2 == 0.9998646693394199d);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(11013.21191404869d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.472984194686474E-35d + "'", double2 == 6.472984194686474E-35d);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        double double1 = org.apache.commons.math3.util.FastMath.atan(718053.7444319915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707949341414806d + "'", double1 == 1.5707949341414806d);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 63, 12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 258048.0f + "'", float2 == 258048.0f);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7450729502920265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7450729502920265d + "'", double1 == 0.7450729502920265d);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.625595310085968d + "'", double1 == 7.625595310085968d);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.19607161940718024d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19607161940718024d + "'", double2 == 0.19607161940718024d);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        double double1 = org.apache.commons.math3.util.FastMath.log10(148.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1702617153949575d + "'", double1 == 2.1702617153949575d);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1018L, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1018.0f) + "'", float2 == (-1018.0f));
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        double double1 = org.apache.commons.math3.util.FastMath.cos(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5529523200824553d + "'", double1 == 0.5529523200824553d);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.7438257353236503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.1826881112499317d, (double) 5447015486L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        int int2 = org.apache.commons.math3.util.FastMath.min(75, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.7945743751980148d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1837.6441602027671d + "'", double2 == 1837.6441602027671d);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.1760912590556813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.176091259055682d + "'", double1 == 3.176091259055682d);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 10.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993223037822113d + "'", double1 == 2.993223037822113d);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9998646693394199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        double double1 = org.apache.commons.math3.util.FastMath.atan(39.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.545160918273219d + "'", double1 == 1.545160918273219d);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.8813735448726939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.381888937281653d) + "'", double1 == (-1.381888937281653d));
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.615120516841259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615120516841259d + "'", double1 == 4.615120516841259d);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.017453291479645992d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.588250504492026d + "'", double1 == 1.588250504492026d);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7539022543433046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7168146928204135d + "'", double1 == 0.7168146928204135d);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.6072657569537874d, 35.74434308084387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6072657569537875d + "'", double2 == 0.6072657569537875d);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 5, (long) 4096);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8414700862537113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.699521118285311d + "'", double1 == 0.699521118285311d);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.0786305240141214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3612100257239834d + "'", double1 == 1.3612100257239834d);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.0271852399623789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        double double2 = org.apache.commons.math3.util.FastMath.max(10.0d, 178.34851573024756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 178.34851573024756d + "'", double2 == 178.34851573024756d);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.20892575E24f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        double double2 = org.apache.commons.math3.util.FastMath.min((-4.722581482379799E9d), (double) (-149.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.722581482379799E9d) + "'", double2 == (-4.722581482379799E9d));
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.447015485737373E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.447015486E9d + "'", double1 == 5.447015486E9d);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000004d + "'", double1 == 10.000000000000004d);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.9E-324d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.7400166479096761d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.017459443376353793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.3197768247158534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7798115718222205d + "'", double1 == 0.7798115718222205d);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.4012984643248174E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.4016131876221174d), 0.03413309100327678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007983904417203952d + "'", double2 == 0.007983904417203952d);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 750L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 750 + "'", int1 == 750);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        double double1 = org.apache.commons.math3.util.FastMath.acos(28.03100307406022d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 127, (-0.01745329147964599d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.99999f + "'", float2 == 126.99999f);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-5.007031379631276E-24d), (double) 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 6, 0.16244735150962653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5437283808052962d + "'", double2 == 1.5437283808052962d);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.7254630513334037d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        float float2 = org.apache.commons.math3.util.FastMath.max((-253.99998f), 9.223373E19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223373E19f + "'", float2 == 9.223373E19f);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.948163070152176E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471428d) + "'", double1 == (-0.4161468365471428d));
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        double double1 = org.apache.commons.math3.util.FastMath.abs(13.394771296627336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.394771296627336d + "'", double1 == 13.394771296627336d);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        double double1 = org.apache.commons.math3.util.FastMath.rint(12.701627437177594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.031250004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.0000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.0d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.75d + "'", double2 == 0.75d);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 63, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-126.999985f), 0.13925318512771137d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-126.99998f) + "'", float2 == (-126.99998f));
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(101.04822696504081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.0d + "'", double1 == 102.0d);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        double double2 = org.apache.commons.math3.util.FastMath.pow(19010.49395704137d, 2.080594477611303E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.00000002049957d + "'", double2 == 1.00000002049957d);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.950423060997261E-65d, (double) 4096.001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4096.0009765625d + "'", double2 == 4096.0009765625d);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-9.256230992860951E225d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.0271852399623789d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-6.053128792867638d), 0.8256645486206606d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.053128792867637d) + "'", double2 == (-6.053128792867637d));
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.7208914127261735d), 25.751006598945605d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(384.416897404767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.954325598830174d + "'", double1 == 5.954325598830174d);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.0688248503046665d), 0.6420926159343308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0688248503046662d) + "'", double2 == (-1.0688248503046662d));
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1833.464944418634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105049.8032003758d + "'", double1 == 105049.8032003758d);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5380757678599976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4305321337581916d + "'", double1 == 0.4305321337581916d);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.371747880871523E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000337174845d + "'", double1 == 1.000000337174845d);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.021989770635849296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99975823473606d + "'", double1 == 0.99975823473606d);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.016451973321653327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016450489224905697d + "'", double1 == 0.016450489224905697d);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29937.07086594976d + "'", double1 == 29937.07086594976d);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.14620091577486963d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3484654383204928E18d + "'", double2 == 1.3484654383204928E18d);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(11.747717109465404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999998749475d + "'", double1 == 0.9999999998749475d);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 9, 3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(258048.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 258048.0f + "'", float2 == 258048.0f);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        int int1 = org.apache.commons.math3.util.FastMath.round(1500.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1500 + "'", int1 == 1500);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.7561974449853123d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-17), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-126.99999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.026525594659021d) + "'", double1 == (-5.026525594659021d));
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        int int2 = org.apache.commons.math3.util.FastMath.min((-149), 6400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.153330206915566d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.7182818284590455d, (double) (-126.999985f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7182818284590455d + "'", double2 == 1.7182818284590455d);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.192093037616354E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920931086706475E-7d + "'", double1 == 1.1920931086706475E-7d);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(29937.07086594976d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 22026L, 22026);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2979.3805346802806d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        double double1 = org.apache.commons.math3.util.FastMath.signum(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(328280.7252583891d, (double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 328280.7253817591d + "'", double2 == 328280.7253817591d);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.40432E16f, (float) 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.40432E16f + "'", float2 == 5.40432E16f);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        float float1 = org.apache.commons.math3.util.FastMath.signum(51200.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.7554474551938102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0529879845855437d + "'", double1 == 1.0529879845855437d);
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        double double1 = org.apache.commons.math3.util.FastMath.signum(192.21757041936067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.6634567844538422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7335027263445277d + "'", double1 == 2.7335027263445277d);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 455.00418673529737d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.948163070152176E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5247523005882602d) + "'", double1 == (-0.5247523005882602d));
    }
}

