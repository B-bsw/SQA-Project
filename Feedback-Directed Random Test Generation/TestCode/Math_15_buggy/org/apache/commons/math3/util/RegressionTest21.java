package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

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
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(548.3170351552121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.41617037765168d + "'", double1 == 23.41617037765168d);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8851932049196716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.08690914186895d + "'", double1 == 1.08690914186895d);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0587664925401685d, 3.1011072703299664E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0587664925401685d + "'", double2 == 1.0587664925401685d);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.01450228138603884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01439762980966972d) + "'", double1 == (-0.01439762980966972d));
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.0f, 1.1368684E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 175.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0035544935238303E76d + "'", double1 == 1.0035544935238303E76d);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.41419541092925727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.513152784587825d + "'", double1 == 1.513152784587825d);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(10.498374723366416d, 0.6537329234338422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03864794842494135d + "'", double2 == 0.03864794842494135d);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.10727605356188535d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999877116507956d + "'", double1 == 0.9999877116507956d);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 113L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-2.675816E-27f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(9.320517817373968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 534.0263338120142d + "'", double1 == 534.0263338120142d);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.4965358188094133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 41L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 41.000004f + "'", float1 == 41.000004f);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.814697720390854E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000038147049963d + "'", double1 == 1.0000038147049963d);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        int int2 = org.apache.commons.math3.util.FastMath.min((-6), 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.6028797018963968E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6028797018963968E16d + "'", double1 == 3.6028797018963968E16d);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-95.0f), (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.023193359375d) + "'", double2 == (-0.023193359375d));
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.5066812382891345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6597736510616161d + "'", double1 == 0.6597736510616161d);
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.01669581953729926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9834427832234706d + "'", double1 == 0.9834427832234706d);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(152576.0f, 6.932447891572509d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 152575.98f + "'", float2 == 152575.98f);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 1017.99994f, (double) 22026L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1017.9999389648438d + "'", double2 == 1017.9999389648438d);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.00724572153624304d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(96.99999237060547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857414472272d + "'", double1 == 9.848857414472272d);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.834796820967027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8347968209670271d + "'", double1 == 0.8347968209670271d);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.950212931632136d), (double) 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.0d + "'", double2 == 13.0d);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 17);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 17.000002f + "'", float1 == 17.000002f);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-149L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-5.4470149E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5361730662545108d) + "'", double1 == (-0.5361730662545108d));
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-6.923689848499634d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 63);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.937253933193772d + "'", double1 == 7.937253933193772d);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 800.0f, 0.6178030631008742d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 799.9999999999999d + "'", double2 == 799.9999999999999d);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.010565972861379823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10279091818531355d + "'", double1 == 0.10279091818531355d);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(89.40934278535332d, (-0.057144489200644466d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5714354600178846d + "'", double2 == 1.5714354600178846d);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.588250504492026d, 20.078731912282265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07893677431358893d + "'", double2 == 0.07893677431358893d);
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        int int1 = org.apache.commons.math3.util.FastMath.round(1025.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025 + "'", int1 == 1025);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.6630760626877992d, 511.9999694824219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 511.9999694824219d + "'", double2 == 511.9999694824219d);
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(92.11639988914972d, 1.262265463851092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 92.12504785691551d + "'", double2 == 92.12504785691551d);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.0269035089368426d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.420081748504424E270d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 623.1841332994477d + "'", double1 == 623.1841332994477d);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.1368683772161603E-13d, (double) (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1368683772161603E-13d + "'", double2 == 1.1368683772161603E-13d);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.1727481272914977d, (-0.7065920069739766d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4581006770885607d + "'", double2 == 3.4581006770885607d);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.3249670098212854E149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.702690313227965d + "'", double1 == 3.702690313227965d);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-1.9843746f), (double) (-22));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.089312862135152d + "'", double2 == 22.089312862135152d);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.3884476551279826d), 2158.197959725427d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.53754499586793E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.53754499586793E-7d + "'", double1 == 5.53754499586793E-7d);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(89.40934278535332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.5355239009113038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.860001405041904d + "'", double1 == 0.860001405041904d);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(17.894443933771722d, 5.3129131773544485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.89444393377172d + "'", double2 == 17.89444393377172d);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(92.2139997708197d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 92.2139997708197d + "'", double2 == 92.2139997708197d);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.444788742025d + "'", double1 == 22026.444788742025d);
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.2662478706390684E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.025003373828866d + "'", double1 == 38.025003373828866d);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.223373E19f, (-6.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0f) + "'", float2 == (-6.0f));
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0036030562437497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7280936163704657d + "'", double1 == 2.7280936163704657d);
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.6405565398607552E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        double double1 = org.apache.commons.math3.util.FastMath.acos(8.318010277546872d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1025, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.8390720478950319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9431912240707234d) + "'", double1 == (-0.9431912240707234d));
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 33);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.05905081919747683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06082914985639413d + "'", double1 == 0.06082914985639413d);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 333604171326434L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.826483428138438E7d + "'", double1 == 1.826483428138438E7d);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0159153328244164E-12d, (-2.7771201292690524d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7771201292690524d + "'", double2 == 2.7771201292690524d);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.2661026017437569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8180614403732398d + "'", double1 == 0.8180614403732398d);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(22.248715438260383d, 116);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8483509644242353E36d + "'", double2 == 1.8483509644242353E36d);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.561238198427539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009795454450521816d + "'", double1 == 0.009795454450521816d);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-3.901552178612685E8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02691254625951396d) + "'", double1 == (-0.02691254625951396d));
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(6.811682183676626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6171313000091345d + "'", double1 == 2.6171313000091345d);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.24364487601066484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24864537824381677d + "'", double1 == 0.24864537824381677d);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.3312028E-30f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(8.888194417315589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0448443767581986d, (-0.16244735150962653d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-5.4470149E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-18L), 96.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-18.0f) + "'", float2 == (-18.0f));
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.7683716E-7f, 9.0071993E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7683716E-7f + "'", float2 == 4.7683716E-7f);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(108.00884045778375d, 8.108075398769754d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4958682359168363d + "'", double2 == 1.4958682359168363d);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.011299193276846486d, 1.9498235574388578d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011299193276846486d + "'", double2 == 0.011299193276846486d);
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.5625001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5625001f + "'", float1 == 1.5625001f);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.094949E-13f, 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.378699E19f + "'", float2 == 7.378699E19f);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.6420926159343308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4430227241169225d) + "'", double1 == (-0.4430227241169225d));
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.8205092196552366E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        float float2 = org.apache.commons.math3.util.FastMath.max((-3.0f), 187.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 187.0f + "'", float2 == 187.0f);
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.47382873378529766d, (-0.7775867565969075d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7874442638649422d + "'", double2 == 1.7874442638649422d);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8342233605065102d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9069721267647446d, 0.2839447081999322d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2673933143727452d + "'", double2 == 1.2673933143727452d);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 116, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 116L + "'", long2 == 116L);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7.584283767291423E71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3454745049537873E73d + "'", double1 == 4.3454745049537873E73d);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 3, 4294967296L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4294967296L + "'", long2 == 4294967296L);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.09951163E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.3465607551885772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33997365843414346d + "'", double1 == 0.33997365843414346d);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.6262347243376027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-108.0f), (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10546875d) + "'", double2 == (-0.10546875d));
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.801734439119775d, (-0.01294875932935354d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8017809687857234d + "'", double2 == 1.8017809687857234d);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.9932207207429933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8163004800929856d + "'", double1 == 1.8163004800929856d);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.38874545763980906d), 4.22759351940662E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 17.000002f, (-0.2619282050900053d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.000001907348633d + "'", double2 == 17.000001907348633d);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 2.9360128E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9360128E8d + "'", double1 == 2.9360128E8d);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        int int1 = org.apache.commons.math3.util.FastMath.round(22026.006f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22026 + "'", int1 == 22026);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.3841130178712614E-66d, 15.00237797068112d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2557177432036262E-67d + "'", double2 == 2.2557177432036262E-67d);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(496.53109552978157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.20965805822283d + "'", double1 == 6.20965805822283d);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 5.9999986f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4056476107177884d + "'", double1 == 1.4056476107177884d);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.0174594433763538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1321341870083356d + "'", double1 == 0.1321341870083356d);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        long long1 = org.apache.commons.math3.util.FastMath.abs(13L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.3333111502681265d, (-23.79805317935657d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-23.79805317935657d) + "'", double2 == (-23.79805317935657d));
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.888867008940965E-111d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        double double1 = org.apache.commons.math3.util.FastMath.exp(328280.725258389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        double double1 = org.apache.commons.math3.util.FastMath.log(148.99996948242188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.003946101129477d + "'", double1 == 5.003946101129477d);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-106));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-105.99999999999999d) + "'", double1 == (-105.99999999999999d));
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.5628736435298439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009823998352292654d + "'", double1 == 0.009823998352292654d);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-13.4200655606939d), (-106));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.870836283740454E-120d + "'", double2 == 2.870836283740454E-120d);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(63.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 63.000004f + "'", float1 == 63.000004f);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        double double1 = org.apache.commons.math3.util.FastMath.sin(8.155306710247183E-267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.155306710247183E-267d + "'", double1 == 8.155306710247183E-267d);
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.14620091577486963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(9.848857801796106d, 5729.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.848857801796106d + "'", double2 == 9.848857801796106d);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.15853338004399595d), 1024.0014413213473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.15853338004399595d) + "'", double2 == (-0.15853338004399595d));
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9172426875149238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9172426875149238d + "'", double1 == 0.9172426875149238d);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9172426875149238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3057780432045403d + "'", double1 == 1.3057780432045403d);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-458));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 458 + "'", int1 == 458);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.2958765778522976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.543945381313508d + "'", double1 == 0.543945381313508d);
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.2483916387378414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0310081418830803d + "'", double1 == 1.0310081418830803d);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.307158536735294E9d, (-3.5491382441002744E12d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.8025969286496354E-45d, (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1895288505075276E-47d + "'", double2 == 2.1895288505075276E-47d);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-9));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0f + "'", float1 == 9.0f);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(5.298292365610486d, 5.29191991346996E54d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.298292365610486d + "'", double2 == 5.298292365610486d);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.3552527E-20f, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3552527E-20f + "'", float2 == 1.3552527E-20f);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.2207031E-4f, (-1.0822639194654398E10d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.43361281667855023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 83, (long) 67);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        double double1 = org.apache.commons.math3.util.FastMath.tan(167245.87627249642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.049807115302692835d + "'", double1 == 0.049807115302692835d);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-10.01787252709252d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4713043174355667d) + "'", double1 == (-1.4713043174355667d));
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.7065920069739766d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.13925318512771137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7.741970486157563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 443.5822339716745d + "'", double1 == 443.5822339716745d);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.9177770887761845E-18d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.02729777739900466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02730116776664826d + "'", double1 == 0.02730116776664826d);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 76.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0148003881138887E33d + "'", double1 == 1.0148003881138887E33d);
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.07734134029966129d, 1023);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.37928799478267644d), 22026);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.017459443376353793d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.006506382083938511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.5483703652841707d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        float float2 = org.apache.commons.math3.util.FastMath.min(32.000008f, 1.1368684E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1368684E-13f + "'", float2 == 1.1368684E-13f);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.002652408759588795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0026559295078357d + "'", double1 == 1.0026559295078357d);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(26338.81768250355d, (-100));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0777663559470944E-26d + "'", double2 == 2.0777663559470944E-26d);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.512060043241628d), 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.512060043241628d + "'", double2 == 1.512060043241628d);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.201966968334231E246d, (-0.02741900222769117d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.201966968334231E246d + "'", double2 == 4.201966968334231E246d);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 138L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 138.00002f + "'", float1 == 138.00002f);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6795639535619324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8079404376202444d + "'", double1 == 0.8079404376202444d);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        long long2 = org.apache.commons.math3.util.FastMath.min((-10L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        int int2 = org.apache.commons.math3.util.FastMath.min((-40), 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2158.197959725427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.370176108802962d + "'", double1 == 8.370176108802962d);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(20.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 20.000002f + "'", float1 == 20.000002f);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        long long2 = org.apache.commons.math3.util.FastMath.max((-106L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        double double1 = org.apache.commons.math3.util.FastMath.log10(22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.347304940824463d + "'", double1 == 1.347304940824463d);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        long long2 = org.apache.commons.math3.util.FastMath.max(75L, 53248L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53248L + "'", long2 == 53248L);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.430218907497497E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.194550717941807E56d + "'", double1 == 8.194550717941807E56d);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6209479146173003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2069448271067887d) + "'", double1 == (-0.2069448271067887d));
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.9131200615513249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4466780791229317d + "'", double1 == 1.4466780791229317d);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.094949E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.094949E-13f + "'", float1 == 9.094949E-13f);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.938917213337377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027372698868897906d) + "'", double1 == (-0.027372698868897906d));
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.2935448673058457E29d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-52.000004f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.2836764218990301d, 1.537679430522236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28367642189903014d + "'", double2 == 0.28367642189903014d);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-108.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-107.99999f) + "'", float1 == (-107.99999f));
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.7948748463561401d, 0.9689124217106447d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6870438843060785d + "'", double2 == 0.6870438843060785d);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0000000397364284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000019868214d + "'", double1 == 1.000000019868214d);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.0005f, 5.80584E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0005f + "'", float2 == 4096.0005f);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(10.498374723366416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36255.52787447728d + "'", double1 == 36255.52787447728d);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(15.563741239878231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4391215926463277d + "'", double1 == 3.4391215926463277d);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.003046174197867086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0030508185010771d + "'", double1 == 1.0030508185010771d);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.2855802432114244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        double double1 = org.apache.commons.math3.util.FastMath.cos(126.99999237060547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23236652260141127d + "'", double1 == 0.23236652260141127d);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.2266027976716734d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 24);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.0d + "'", double1 == 24.0d);
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(11478.35722564624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.3351263076086d + "'", double1 == 200.3351263076086d);
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        int int2 = org.apache.commons.math3.util.FastMath.min(48, 116);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        long long1 = org.apache.commons.math3.util.FastMath.round(181.97662449228235d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 182L + "'", long1 == 182L);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        long long2 = org.apache.commons.math3.util.FastMath.min(6L, 333604171326434L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.9542141200785643d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3000.0002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3000.0005f + "'", float1 == 3000.0005f);
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.4063156261557984E-38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (-12));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 491, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 491L + "'", long2 == 491L);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        double double1 = org.apache.commons.math3.util.FastMath.cos(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9773570236070704d) + "'", double1 == (-0.9773570236070704d));
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.9999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-8L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9998646693394199d, 0.5662191695169728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999233709364663d + "'", double2 == 0.9999233709364663d);
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-1.7898888675248745E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999839814893d + "'", double1 == 0.9999999839814893d);
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.462542442645822E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.462542442645822E-32d + "'", double1 == 2.462542442645822E-32d);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.05691340783384365d, 1.154986906341471d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05691340783384366d + "'", double2 == 0.05691340783384366d);
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(6.811682183676627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.811682183676628d + "'", double1 == 6.811682183676628d);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.8488112896435829d), (-0.289430284648579d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01947956430215414d + "'", double2 == 0.01947956430215414d);
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.03079207E11f, 3.3166247903554003d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03079199E11f + "'", float2 == 1.03079199E11f);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.5708537835451057d, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.9923316327862005E-6d + "'", double2 == 5.9923316327862005E-6d);
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        long long2 = org.apache.commons.math3.util.FastMath.max(8388608L, (-14L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8388608L + "'", long2 == 8388608L);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.33102839773286313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.05529205333134d + "'", double1 == 1.05529205333134d);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 22025.998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.998046875d + "'", double1 == 22025.998046875d);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 24L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 14, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-35), (float) (-125));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.0f) + "'", float2 == (-35.0f));
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.3197768247158534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.148815400626164d + "'", double1 == 1.148815400626164d);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-18), 76);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3600415E24f) + "'", float2 == (-1.3600415E24f));
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        double double1 = org.apache.commons.math3.util.FastMath.rint(623.1841332994477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 623.0d + "'", double1 == 623.0d);
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.09999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09999999999999999d + "'", double1 == 0.09999999999999999d);
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        int int2 = org.apache.commons.math3.util.FastMath.min(54, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.019190971753849196d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5209433468353801d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.103803694866161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.159641103335257d + "'", double1 == 4.159641103335257d);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.6252248588609128d, 0.45134237381937675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2999117271160934d + "'", double2 == 1.2999117271160934d);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.980232E-8f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.980232E-8f + "'", float1 == 2.980232E-8f);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5188871811480065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41797794906338553d + "'", double1 == 0.41797794906338553d);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        double double1 = org.apache.commons.math3.util.FastMath.signum(99.99999237060545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.003433649623862475d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1508638982962643d) + "'", double1 == (-0.1508638982962643d));
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.0948500982134514E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.690099069835135d + "'", double1 == 61.690099069835135d);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-3.9999998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.30822632959398d + "'", double1 == 27.30822632959398d);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(38.025003373828866d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.5301929214225978d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5588280838315965d) + "'", double1 == (-0.5588280838315965d));
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        double double1 = org.apache.commons.math3.util.FastMath.atan(5.954325598830174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4044039954202339d + "'", double1 == 1.4044039954202339d);
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.029437602008406172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6002381820977454d + "'", double1 == 1.6002381820977454d);
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.1359036E-25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.135904E-25f + "'", float1 == 4.135904E-25f);
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-9));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6537329234338422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18459964245402113d) + "'", double1 == (-0.18459964245402113d));
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.1585290151921035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1717859233256218d + "'", double1 == 1.1717859233256218d);
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 46L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.3638052161411894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.6E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        float float2 = org.apache.commons.math3.util.FastMath.max(17.999998f, (float) (-100L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17.999998f + "'", float2 == 17.999998f);
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 255.99998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 53248L, (float) 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53248.0f + "'", float2 == 53248.0f);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.522697550491263d, 1.0592232274909887d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.963014084061087d + "'", double2 == 0.963014084061087d);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        long long2 = org.apache.commons.math3.util.FastMath.max(127L, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.45134237381937675d, (-1.3131817430873023d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4513423738193767d + "'", double2 == 0.4513423738193767d);
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.3312028E-30f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.3312028E-30f + "'", float1 == 1.3312028E-30f);
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.4581006770885607d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        double double2 = org.apache.commons.math3.util.FastMath.log(100.00371790007361d, 2.5725986423097538E-55d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-27.294593628126286d) + "'", double2 == (-27.294593628126286d));
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0E100d, 3.189620006501493d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1023.99994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.624618688136059d + "'", double1 == 7.624618688136059d);
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.1920300642971347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4723881867929731d + "'", double1 == 1.4723881867929731d);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.026925328154872162d, (double) (-6.338253E29f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026925328154872162d + "'", double2 == 0.026925328154872162d);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-9.0f), 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.426107E30f) + "'", float2 == (-1.426107E30f));
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        int int2 = org.apache.commons.math3.util.FastMath.min(99, 984);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.3166247903554003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9973716983851401d + "'", double1 == 0.9973716983851401d);
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 8, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9620613237814036d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-14.0f), 75.6939756606048d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-13.999999f) + "'", float2 == (-13.999999f));
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-6.194414737140372E10d), (-0.8508150333851735d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.194414737140372E10d + "'", double2 == 6.194414737140372E10d);
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(255370.74139618516d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.1197783433152602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11949376972675076d) + "'", double1 == (-0.11949376972675076d));
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-458), (-39));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6836288453882233E-104d) + "'", double2 == (-1.6836288453882233E-104d));
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.3601977034040275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3457305902718723d + "'", double1 == 0.3457305902718723d);
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.153330206915566d, 0.3040821475326688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1746946756873973d + "'", double2 == 2.1746946756873973d);
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.215216711489161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8762233685887999d) + "'", double1 == (-0.8762233685887999d));
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.499612914713169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4799546101524514d + "'", double1 == 3.4799546101524514d);
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.021451636910020958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021683377377399712d + "'", double1 == 0.021683377377399712d);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3269017.3724721107d + "'", double1 == 3269017.3724721107d);
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 4096.001f, 46);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8823044487118848E17d + "'", double2 == 2.8823044487118848E17d);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.09266045765894548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0926604576589455d + "'", double1 == 0.0926604576589455d);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5258801131414248d, 0.7563221378721827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7563221378721827d + "'", double2 == 0.7563221378721827d);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8731400784750731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8731400784750731d + "'", double1 == 0.8731400784750731d);
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        double double2 = org.apache.commons.math3.util.FastMath.pow(11.093347164296198d, 0.9816129037711879d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.613214402338883d + "'", double2 == 10.613214402338883d);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.634833008701613E30d, (double) 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.015295723476607053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.3312028E-30f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(56.34482984476743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.724558910165124d + "'", double1 == 4.724558910165124d);
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.9843748f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9843748f + "'", float1 == 1.9843748f);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(35.00000381469727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930097512430808E14d + "'", double1 == 7.930097512430808E14d);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 187);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.4029088829471815d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.05007640096477724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05011832201785427d + "'", double1 == 0.05011832201785427d);
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        double double1 = org.apache.commons.math3.util.FastMath.abs(66.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66.0d + "'", double1 == 66.0d);
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.9360128E8d, (-1.0969082479362111d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9360128E8d + "'", double2 == 2.9360128E8d);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        long long1 = org.apache.commons.math3.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        double double1 = org.apache.commons.math3.util.FastMath.atan(50.02724142034319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.550809879104214d + "'", double1 == 1.550809879104214d);
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-149));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.697104747069222d) + "'", double1 == (-5.697104747069222d));
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.3931722845112914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37460659341591257d) + "'", double1 == (-0.37460659341591257d));
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.531532568916072E-4d, 0.3040821475326688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0018190895165525042d + "'", double2 == 0.0018190895165525042d);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 18.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.584289651861328d + "'", double1 == 3.584289651861328d);
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-9.0f), 31098.212405867023d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.999999f) + "'", float2 == (-8.999999f));
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-1023L), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.0f) + "'", float2 == (-1023.0f));
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        int int2 = org.apache.commons.math3.util.FastMath.max(46, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-41), 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-10));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-2147483648L), (double) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.14748352E9f) + "'", float2 == (-2.14748352E9f));
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.1448005255201223d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.723507743E9d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2723507743L + "'", long1 == 2723507743L);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(22026.0f, 1.000013660471644d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.998f + "'", float2 == 22025.998f);
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(53248.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.9444390795532054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9806281043029215d) + "'", double1 == (-0.9806281043029215d));
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.633495252341099E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02152555516668757d + "'", double1 == 0.02152555516668757d);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(38.025003373828866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6331239353195342E16d + "'", double1 == 1.6331239353195342E16d);
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(16.25264603450008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        int int2 = org.apache.commons.math3.util.FastMath.min(24, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.2470996758325352d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(12.701625227919099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 164140.50000152312d + "'", double1 == 164140.50000152312d);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1.03079215E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        double double2 = org.apache.commons.math3.util.FastMath.min(53247.99609374999d, 1.5625001192092898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5625001192092898d + "'", double2 == 1.5625001192092898d);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.2102032422537643d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0785793105465808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        int int2 = org.apache.commons.math3.util.FastMath.min((-6), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.33749774856093107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32524166106460883d + "'", double1 == 0.32524166106460883d);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768371582031251E-7d + "'", double1 == 4.768371582031251E-7d);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 2.09E-43f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-142) + "'", int1 == (-142));
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.3484654383204928E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-14L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.5659969E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.693147178468404d + "'", double1 == 18.693147178468404d);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.1826881112499317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.111480858936716d + "'", double1 == 23.111480858936716d);
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-5.8058394E32f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.195031017211833E24d, 96.99999999999955d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.195031017211833E24d + "'", double2 == 2.195031017211833E24d);
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.0038417443621884145d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0038343743032976875d) + "'", double1 == (-0.0038343743032976875d));
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.4757395E20f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4757397E20f + "'", float1 == 1.4757397E20f);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.01893945804830624d, 1.730093305612845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7301969683239953d + "'", double2 == 1.7301969683239953d);
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9816339318384565d + "'", double1 == 0.9816339318384565d);
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        int int2 = org.apache.commons.math3.util.FastMath.max((-40), 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.830188762901751E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9134098939195124E-4d + "'", double1 == 3.9134098939195124E-4d);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.09239639582003953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5293379817722996d, 4.330733340286331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5293379817722996d + "'", double2 == 1.5293379817722996d);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.9342813E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.30584301E18f + "'", float1 == 2.30584301E18f);
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.0326329306069673d), 3.336041713264338E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0326329306069673d) + "'", double2 == (-1.0326329306069673d));
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.15167488020881612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15167488020881614d + "'", double1 == 0.15167488020881614d);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.330733340286331d, 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2217.3354702266015d + "'", double2 == 2217.3354702266015d);
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.9074079744350795E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9074079744350795E74d + "'", double1 == 2.9074079744350795E74d);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        float float2 = org.apache.commons.math3.util.FastMath.min(7.555787E22f, 4096.001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.001f + "'", float2 == 4096.001f);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        double double1 = org.apache.commons.math3.util.FastMath.abs(11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703395d + "'", double1 == 11013.232874703395d);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.0384594E34f), 2.376845E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.376845E32f + "'", float2 == 2.376845E32f);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        float float2 = org.apache.commons.math3.util.FastMath.max(53248.004f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.1031660031673982E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.42616680577582d + "'", double1 == 74.42616680577582d);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.3383347192043076E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.126564744615436d + "'", double1 == 42.126564744615436d);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9353866470427131d, (-1.9174489497410363d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9353866470427131d) + "'", double2 == (-0.9353866470427131d));
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.188257982E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        long long2 = org.apache.commons.math3.util.FastMath.min(52L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-3.402306645480594d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26678620637833084d) + "'", double1 == (-0.26678620637833084d));
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        int int2 = org.apache.commons.math3.util.FastMath.min((-106), 187);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106) + "'", int2 == (-106));
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1.9073485E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9073485191245059E-6d + "'", double1 == 1.9073485191245059E-6d);
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        float float1 = org.apache.commons.math3.util.FastMath.signum(24.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(22.18604304878552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.186043048785525d + "'", double1 == 22.186043048785525d);
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        int int1 = org.apache.commons.math3.util.FastMath.round((-6912.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6912) + "'", int1 == (-6912));
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(14.0f, (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.544922E-4f + "'", float2 == 8.544922E-4f);
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1638399.9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1638399.9f + "'", float1 == 1638399.9f);
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(34.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.7595094447988621d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6495594256151556d) + "'", double1 == (-0.6495594256151556d));
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.9773570236070704d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(148.99996948242188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.420081748504423E270d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.420081748504423E270d + "'", double1 == 4.420081748504423E270d);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0230833853373482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.61836006978654d + "'", double1 == 58.61836006978654d);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.007983904417203952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.27418518264208536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2707626461424553d + "'", double1 == 0.2707626461424553d);
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5536230742797728d, 4.722257605773872E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5536230742797734d + "'", double2 == 1.5536230742797734d);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1.9342813E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9069721267647446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4768116963477471d + "'", double1 == 1.4768116963477471d);
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 24L, 54.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 54.0f + "'", float2 == 54.0f);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-125));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 125 + "'", int1 == 125);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        long long2 = org.apache.commons.math3.util.FastMath.max(99L, (long) (-8));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        double double1 = org.apache.commons.math3.util.FastMath.atan(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5620699020488424d + "'", double1 == 1.5620699020488424d);
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        long long2 = org.apache.commons.math3.util.FastMath.min((-54L), 22L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54L) + "'", long2 == (-54L));
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.189620006501493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-1.3600415E24f), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.800207735332289E23d) + "'", double2 == (-6.800207735332289E23d));
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.01651688E8f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.01651688E8f + "'", float2 == 1.01651688E8f);
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4965075614664802d + "'", double1 == 3.4965075614664802d);
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(8.796093E12f, 201.7156361224559d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.7960925E12f + "'", float2 == 8.7960925E12f);
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(52.195160378451156d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.270653297844038E30d + "'", double2 == 8.270653297844038E30d);
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.639431632506995E59d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8463952669727287d) + "'", double1 == (-0.8463952669727287d));
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-3.0948501E26f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        int int2 = org.apache.commons.math3.util.FastMath.max((-95), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.8949219476567826d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8949219476567826d + "'", double1 == 0.8949219476567826d);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.5145744929332654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4921644887555587d + "'", double1 == 0.4921644887555587d);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        double double1 = org.apache.commons.math3.util.FastMath.cos(12.701627437177594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9908667326630078d + "'", double1 == 0.9908667326630078d);
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.0174594433763538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01746033053136911d + "'", double1 == 0.01746033053136911d);
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-20));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1759.4875091855324d), 2.8421709430404004E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1759.4875091855324d + "'", double2 == 1759.4875091855324d);
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 22, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22.0f + "'", float2 == 22.0f);
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.2894284851066637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5130857494229015d + "'", double1 == 1.5130857494229015d);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.2104878579383556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5948521233510777d + "'", double1 == 0.5948521233510777d);
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 144.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5636291604955853d) + "'", double1 == (-0.5636291604955853d));
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.7515979658790339d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8243866424204045d) + "'", double1 == (-0.8243866424204045d));
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 4294967296L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9969954337286333d, (double) 3.0562855E-37f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.996995433728633d + "'", double2 == 1.996995433728633d);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9522971143772588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.56260549630396d + "'", double1 == 54.56260549630396d);
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.374030431949343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.298292365610486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8402785435782614d + "'", double1 == 1.8402785435782614d);
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(9.382939107340338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.340163988654244d + "'", double1 == 2.340163988654244d);
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-11.0d), 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-704.0d) + "'", double2 == (-704.0d));
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.238566467956993E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.999999f, (float) 6400L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.999999f + "'", float2 == 5.999999f);
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 28.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0365889718756627d + "'", double1 == 3.0365889718756627d);
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.5485138357157244d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(5.579523046178759E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.57952304617876E-5d + "'", double1 == 5.57952304617876E-5d);
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-6.194414737140372E10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-25.542646147694946d) + "'", double1 == (-25.542646147694946d));
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-2.3768447E32f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992281452030652d + "'", double1 == 0.9992281452030652d);
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (-0.02198977063584929d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.221933116817157d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22565008544035375d) + "'", double1 == (-0.22565008544035375d));
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.006264389542770915d, 223.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 223.00000008798784d + "'", double2 == 223.00000008798784d);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 83, 11.999999046325684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999933242797852d) + "'", double2 == (-0.9999933242797852d));
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(22.624342922017807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39486927508948544d + "'", double1 == 0.39486927508948544d);
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7102126686676506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012395549457626073d + "'", double1 == 0.012395549457626073d);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.2949673E9f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.332063396007248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2867291655856465d + "'", double1 == 0.2867291655856465d);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.094947E-13f, (float) 6400);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(11.0f, 79);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.649092E24f + "'", float2 == 6.649092E24f);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.084289455298593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.858017E24f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0001564104258314d, 128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.020220692368197d + "'", double2 == 1.020220692368197d);
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-0.001953125f), 5.53754499586793E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        int int1 = org.apache.commons.math3.util.FastMath.round(458.00003f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 458 + "'", int1 == 458);
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0001761935342754d, 0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8848188347986294E-4d + "'", double2 == 1.8848188347986294E-4d);
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9930827464263656d) + "'", double1 == (-0.9930827464263656d));
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-7.428926624964046E-45d), 0.03174341134264638d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.428926624964045E-45d) + "'", double2 == (-7.428926624964045E-45d));
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.8996937401571152d, (double) 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.76837158203125E-7d + "'", double2 == 4.76837158203125E-7d);
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.6808785516148948E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6808785516148948E-13d + "'", double1 == 1.6808785516148948E-13d);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1017.9999389648438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9923318359313429d + "'", double1 == 0.9923318359313429d);
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-1.26765045E30f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.4513423738193767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.102527247362364d + "'", double1 == 1.102527247362364d);
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.05905081919747683d, 6.728755998614611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.728755998614611d + "'", double2 == 6.728755998614611d);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.7208989266620003d), 4.810464200693579d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7208989266620003d + "'", double2 == 0.7208989266620003d);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.0029911026661902144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999955266557553d + "'", double1 == 0.9999955266557553d);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(39.999996f, (-7.111969304174328E-6d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.999992f + "'", float2 == 39.999992f);
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(8.796093E12f, (-15));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.68435456E8f + "'", float2 == 2.68435456E8f);
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(6.666667160494015E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.66666617283965E-4d + "'", double1 == 6.66666617283965E-4d);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.6784668E-4f), 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.5591424E11f) + "'", float2 == (-7.5591424E11f));
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.008918845303300279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008918727064749568d + "'", double1 == 0.008918727064749568d);
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805744972d + "'", double1 == 0.6931471805744972d);
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-253.99998474121094d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0E20d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 66 + "'", int1 == 66);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-39));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-27.294593628126286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.000171231545091d) + "'", double1 == (-4.000171231545091d));
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(9.88462260799664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19625.23769644332d + "'", double1 == 19625.23769644332d);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5405377776318283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9323757820972908d + "'", double1 == 0.9323757820972908d);
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-3.1872445334363896E24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.1433134923316977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.727953564802034d + "'", double1 == 1.727953564802034d);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9758393522576108d, (double) 2.0122792E-16f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9758393522576106d + "'", double2 == 0.9758393522576106d);
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        double double2 = org.apache.commons.math3.util.FastMath.log(168.50112223820605d, 1.148815400626164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02705927119263099d + "'", double2 == 0.02705927119263099d);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.733270479283728E32d, 0.23731568623588914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.019178184912433543d) + "'", double2 == (-0.019178184912433543d));
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1863265471780543E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1863265471780545E43d + "'", double1 == 1.1863265471780545E43d);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.8858967399962993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12115488144867342d) + "'", double1 == (-0.12115488144867342d));
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        int int1 = org.apache.commons.math3.util.FastMath.round((-108.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-108) + "'", int1 == (-108));
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 512.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2844135865397565E222d + "'", double1 == 2.2844135865397565E222d);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.6210082E32f), (float) 116);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6210082E32f) + "'", float2 == (-1.6210082E32f));
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(750.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.7412648893537577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3195699637964475d + "'", double1 == 1.3195699637964475d);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-2.675816E-27f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.5381220624782704d), 1.0684342525323527d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4665671894765713d) + "'", double2 == (-0.4665671894765713d));
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(12.125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999411985d + "'", double1 == 0.9999999999411985d);
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.3959251501818342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3959251501818343d + "'", double1 == 0.3959251501818343d);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        double double2 = org.apache.commons.math3.util.FastMath.max(26.0d, (-557.1752425929883d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.0d + "'", double2 == 26.0d);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        int int2 = org.apache.commons.math3.util.FastMath.max((-4), (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.09731253940776538d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 750.00006f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.08921728642486809d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(20.0f, 0.6952633082705699d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.999998f + "'", float2 == 19.999998f);
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.1321341870083356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13252173791335897d + "'", double1 == 0.13252173791335897d);
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.57952304617876E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.4876550949064553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08304547985374004d + "'", double1 == 0.08304547985374004d);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 18L, (-2.09E-43f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.32668391545583547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5715626959974168d + "'", double1 == 0.5715626959974168d);
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5635505418565119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.726671451338972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8889410019077668d + "'", double1 == 0.8889410019077668d);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(36.52075545460172d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.01745320762473575d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745143567418917d) + "'", double1 == (-0.01745143567418917d));
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        double double2 = org.apache.commons.math3.util.FastMath.log((-2.5385093188471615d), 1.3519396962567498E-10d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 95L, 108);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.082926259755054E34d + "'", double2 == 3.082926259755054E34d);
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.014608467389253983d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.1954752489985705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.537544995867647E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008211813725267782d + "'", double1 == 0.008211813725267782d);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.1602819440875591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.024323338403252005d), 0.5013608289305436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.024323338403252005d) + "'", double2 == (-0.024323338403252005d));
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9826275701274103d + "'", double1 == 0.9826275701274103d);
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 53248L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0088885951019526d, (double) 4.5474732E-13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0088885951019526d + "'", double2 == 1.0088885951019526d);
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.882812500000001E-4d + "'", double1 == 4.882812500000001E-4d);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 14L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2446066160948055d + "'", double1 == 7.2446066160948055d);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 12, (double) (-750.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11.999999f + "'", float2 == 11.999999f);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.1070134835587689d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10701348355876888d) + "'", double1 == (-0.10701348355876888d));
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.842171E-14f, 1.1368683772161605E-13d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8421713E-14f + "'", float2 == 2.8421713E-14f);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.027298433348069678d), 0.052547042514038377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0252486091659687d + "'", double2 == 0.0252486091659687d);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.1235582092889473E307d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 1024, (double) 1.3312028E-30f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.930380657631324E-31d + "'", double2 == 4.930380657631324E-31d);
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        double double2 = org.apache.commons.math3.util.FastMath.min((-2.0d), (-1.0000001192092898d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0d) + "'", double2 == (-2.0d));
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.25484119874557287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5937303607106874d) + "'", double1 == (-0.5937303607106874d));
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.07125835569920674d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1500.0005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.447143667627632d + "'", double1 == 11.447143667627632d);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        double double2 = org.apache.commons.math3.util.FastMath.pow(9.5367431640625E-7d, 35.74434308084386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.274962680237319E-216d + "'", double2 == 6.274962680237319E-216d);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-2.09E-43f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        double double2 = org.apache.commons.math3.util.FastMath.log(5.2192449017532813E39d, 24.43887855459679d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.034948763393854956d + "'", double2 == 0.034948763393854956d);
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9645723078325875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5697684081055558d + "'", double1 == 0.5697684081055558d);
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.7715524587962287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.3978950994030255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6086280326444244d + "'", double1 == 1.6086280326444244d);
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(750.000272298204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42971.8502363496d + "'", double1 == 42971.8502363496d);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 58);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.3841130178712614E-66d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3841130178712614E-66d + "'", double1 == 3.3841130178712614E-66d);
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1023), (long) 458);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 458L + "'", long2 == 458L);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(50.119122635657405d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }
}

