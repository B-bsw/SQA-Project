package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

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
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) 14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2148823033161556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003750403697136045d + "'", double1 == 0.003750403697136045d);
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.09460497975487737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0044783897735092d + "'", double1 == 1.0044783897735092d);
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0024988771868024017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0024988823881342955d + "'", double1 == 0.0024988823881342955d);
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.12311456005264212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12249813260893226d) + "'", double1 == (-0.12249813260893226d));
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.848501131276807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.1438634000260818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.9727794501544427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.0643321090394411d), 1.2567610122556662E-9d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6061, (float) 2105L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2105.0f + "'", float2 == 2105.0f);
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.027729896256446035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027733451290817925d + "'", double1 == 0.027733451290817925d);
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6968620773297396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.63676990927424d + "'", double1 == 2.63676990927424d);
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 145);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.4999999999999996d, 0.9989251163235675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4975389472752845d + "'", double2 == 2.4975389472752845d);
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.01654379973059443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5542517723057603d + "'", double1 == 1.5542517723057603d);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        double double1 = org.apache.commons.math.util.FastMath.floor(33.439500327260546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9913622428561392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6949030854871128d + "'", double1 == 1.6949030854871128d);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3026405418156001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9545528260480599d + "'", double1 == 0.9545528260480599d);
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6146089504495703d, 1.567596525075122d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6146089504495703d + "'", double2 == 0.6146089504495703d);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4626719456900756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9711073542921324d + "'", double1 == 0.9711073542921324d);
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4404842646755718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8556343548213673d, 0.031689820826759175d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9950713577254318d + "'", double2 == 0.9950713577254318d);
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1714.4627859601458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.9369645424212623d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(48.42055096759488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.420550967594885d + "'", double1 == 48.420550967594885d);
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.5778020121309203E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5778020121309203E33d + "'", double1 == 2.5778020121309203E33d);
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6762038531919243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.841470984684158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6865874069331717d + "'", double1 == 0.6865874069331717d);
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0127428005375332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.890355464123843d + "'", double1 == 0.890355464123843d);
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 31.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9048849665247426E13d + "'", double1 == 2.9048849665247426E13d);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.757373373600886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3007817820479022d + "'", double1 == 1.3007817820479022d);
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1175057225567089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.117505722556709d + "'", double1 == 1.117505722556709d);
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.7182818284590375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459038d + "'", double1 == 2.718281828459038d);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999860498800669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(69.35280798945955d, 0.005282172155090746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 69.35280798945954d + "'", double2 == 69.35280798945954d);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        long long2 = org.apache.commons.math.util.FastMath.min(9L, (long) 573);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        float float2 = org.apache.commons.math.util.FastMath.min(14.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.65685424949238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5861761930033738d) + "'", double1 == (-0.5861761930033738d));
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.853988047997524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2707029090566726d + "'", double1 == 1.2707029090566726d);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(27.951773034959217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4878504712302064d + "'", double1 == 0.4878504712302064d);
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-44.49939260328993d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-44.49939260328992d) + "'", double1 == (-44.49939260328992d));
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3299302472020562d, 0.9999999999999972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.329930247202055d + "'", double2 == 1.329930247202055d);
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3248054181561355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.90575913641077d + "'", double1 == 75.90575913641077d);
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5313592245660101d), 0.7144776763732182d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5313592245660101d) + "'", double2 == (-0.5313592245660101d));
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        double double1 = org.apache.commons.math.util.FastMath.tan(4443055.260253961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6196057152098526d + "'", double1 == 3.6196057152098526d);
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.9702919135521215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3240578294914163d + "'", double1 == 1.3240578294914163d);
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        double double2 = org.apache.commons.math.util.FastMath.min(11013.232874703392d, (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        long long1 = org.apache.commons.math.util.FastMath.round(1.000000409204699d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5402647332399916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26739338089528586d) + "'", double1 == (-0.26739338089528586d));
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3584059010869395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3438091364081366d + "'", double1 == 0.3438091364081366d);
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        int int2 = org.apache.commons.math.util.FastMath.max(14, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.44395208930645685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4439520893064569d + "'", double1 == 0.4439520893064569d);
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.0393469217744312E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0393469217744312E-249d) + "'", double1 == (-1.0393469217744312E-249d));
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.748066027288557E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9517287150164593d, 0.3028076688540548d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.26275795703227d + "'", double2 == 1.26275795703227d);
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        long long1 = org.apache.commons.math.util.FastMath.round(572.9577951308231d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 573L + "'", long1 == 573L);
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0398314119215128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.039831411921513d + "'", double1 == 1.039831411921513d);
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.3368086899420177E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.7167639596083E91d, 1.5430770857878007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        float float2 = org.apache.commons.math.util.FastMath.max((-7.0f), 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        double double1 = org.apache.commons.math.util.FastMath.signum(46.507797209669384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2572089825833372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6155744386477795d + "'", double1 == 1.6155744386477795d);
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 38L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.13882014128207512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1489174386017265d + "'", double1 == 1.1489174386017265d);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0103661992710218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.746606636224771d + "'", double1 == 1.746606636224771d);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9994109602857177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8809570117013472d + "'", double1 == 0.8809570117013472d);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5876803459339235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9197929105384216d + "'", double1 == 0.9197929105384216d);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        long long1 = org.apache.commons.math.util.FastMath.round(57.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9964228836762624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8788419204708066d + "'", double1 == 0.8788419204708066d);
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2568953489826145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9511362998119728d + "'", double1 == 0.9511362998119728d);
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        double double1 = org.apache.commons.math.util.FastMath.floor(11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        double double1 = org.apache.commons.math.util.FastMath.rint(89.06376603792404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.0d + "'", double1 == 89.0d);
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-220.50287227348372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.898348982495419E95d) + "'", double1 == (-2.898348982495419E95d));
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.4766393240263169d), (-40.65444981483749d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4766393240263169d) + "'", double2 == (-0.4766393240263169d));
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.4161468365471423d), 1.4328100205340815d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4328100205340815d + "'", double2 == 1.4328100205340815d);
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        long long1 = org.apache.commons.math.util.FastMath.abs(70368744177664L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 70368744177664L + "'", long1 == 70368744177664L);
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        double double1 = org.apache.commons.math.util.FastMath.log(14.223400923003245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6548885605479215d + "'", double1 == 2.6548885605479215d);
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.94744238847516E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999553501771875d, 6.365513453787659d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999553501771876d + "'", double2 == 0.9999553501771876d);
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        int int2 = org.apache.commons.math.util.FastMath.min(252318064, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.14436016288910883d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        double double1 = org.apache.commons.math.util.FastMath.log(4.702262890231486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5480438588551437d + "'", double1 == 1.5480438588551437d);
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5180744313382242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9986105227635058d + "'", double1 == 0.9986105227635058d);
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.00014339808637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9373799744831653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9373799744831653d + "'", double1 == 0.9373799744831653d);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-8.411337566029088E-22d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.4039548065783E-38d + "'", double1 == 9.4039548065783E-38d);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.165189640442122E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.232595164407831E-32d + "'", double1 == 1.232595164407831E-32d);
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.741789388563884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8357346443918057d + "'", double1 == 0.8357346443918057d);
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3239195328189275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.84325521395775d + "'", double1 == 0.84325521395775d);
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.18838862103418863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9823072833290152d + "'", double1 == 0.9823072833290152d);
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.748066027288557E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5822397121190288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5), (float) 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.40908917437285713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39846112325445276d) + "'", double1 == (-0.39846112325445276d));
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.368505610608687E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.640332897826156d + "'", double1 == 29.640332897826156d);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 57, (long) (-7));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8740254132919673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3965385208703287d + "'", double1 == 1.3965385208703287d);
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6552377416047082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18360109522414125d) + "'", double1 == (-0.18360109522414125d));
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        double double1 = org.apache.commons.math.util.FastMath.log10(17765.729914390176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2495830554099125d + "'", double1 == 4.2495830554099125d);
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        long long2 = org.apache.commons.math.util.FastMath.max(38L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.0013377555385146109d), 88.41160108781288d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0013377555385146109d) + "'", double2 == (-0.0013377555385146109d));
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0000823799461538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        long long2 = org.apache.commons.math.util.FastMath.min(18L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3922026785961111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9984652528042448d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.535856475922823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        double double1 = org.apache.commons.math.util.FastMath.exp(8.271806125530277E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9680831371227122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0519393961983163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05198617759458842d + "'", double1 == 0.05198617759458842d);
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 252318064L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4342.170967875233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.03468311433197074d, (-4.9617267167450915E22d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03468311433197073d + "'", double2 == 0.03468311433197073d);
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        double double1 = org.apache.commons.math.util.FastMath.acos(52.50123045039397d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.17474078431209433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.06424358004527628d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.997937090867597d + "'", double1 == 0.997937090867597d);
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.777169725542001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6806406458923995d + "'", double1 == 0.6806406458923995d);
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3777732767106265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.109099920787457d + "'", double1 == 2.109099920787457d);
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.19495746080256454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9734004347642043d) + "'", double1 == (-0.9734004347642043d));
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.377731627086182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023093369417d + "'", double1 == 0.5403023093369417d);
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        int int2 = org.apache.commons.math.util.FastMath.min(6061, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5817398942542069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8347881634826463d) + "'", double1 == (-0.8347881634826463d));
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9262856941868183d, 0.7668092411294383d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7668092411294383d + "'", double2 == 0.7668092411294383d);
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        long long2 = org.apache.commons.math.util.FastMath.max(38L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.016946089057078072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7709305155677555d) + "'", double1 == (-1.7709305155677555d));
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.357490349840526E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3574904760009334E-4d + "'", double1 == 3.3574904760009334E-4d);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        double double2 = org.apache.commons.math.util.FastMath.min(3.0805585454182745d, (-0.47627435869419515d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.47627435869419515d) + "'", double2 == (-0.47627435869419515d));
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5703212367226402d, (-0.9634979770895203d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9634979770895203d) + "'", double2 == (-0.9634979770895203d));
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.162277660168381d, 0.5403023060318459d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.401571813317414d + "'", double2 == 1.401571813317414d);
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4679136108514075d, 0.874325854012688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4913867385859409d + "'", double2 == 0.4913867385859409d);
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-22.84139267594658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999998797433d) + "'", double1 == (-0.9999999998797433d));
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9030612511435305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10196489714181856d) + "'", double1 == (-0.10196489714181856d));
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9905499752128979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.675074442256637d + "'", double1 == 2.675074442256637d);
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.890355464123843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.890355464123843d + "'", double1 == 0.890355464123843d);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.009923127595128856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0996148964519306d + "'", double1 == 0.0996148964519306d);
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2572089825833372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1212533088394152d + "'", double1 == 1.1212533088394152d);
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.07547866415616125d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07555051586576621d) + "'", double1 == (-0.07555051586576621d));
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.003109141424240039d, (-0.9990920390306268d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0031091414242400387d + "'", double2 == 0.0031091414242400387d);
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6384734124839342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6015344862473527d + "'", double1 == 0.6015344862473527d);
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.556320495207163d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3673250405135535d) + "'", double1 == (-1.3673250405135535d));
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.149071860492834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08986825738739009d + "'", double1 == 0.08986825738739009d);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.3574904760009334E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.473985210595541d) + "'", double1 == (-3.473985210595541d));
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8458504780803499d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7020801147004252d) + "'", double1 == (-0.7020801147004252d));
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.0368744177664E13d, (-13.654528655066557d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766399E13d + "'", double2 == 7.036874417766399E13d);
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.735436873328441d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5659043784915472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1612393557517264d + "'", double1 == 1.1612393557517264d);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        double double1 = org.apache.commons.math.util.FastMath.asinh(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3334775868839923d + "'", double1 == 3.3334775868839923d);
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5975638469446121d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8837010719759295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237368423548132d + "'", double1 == 0.7237368423548132d);
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.8373008886306445E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.837300699980123E-4d + "'", double1 == 4.837300699980123E-4d);
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2304174960375769E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267867693d + "'", double1 == 1.5707963267867693d);
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        long long2 = org.apache.commons.math.util.FastMath.min(44L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.764651313204946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.764651313204947d + "'", double1 == 4.764651313204947d);
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.4825777280150008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7304003084084857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.818907853626945d + "'", double1 == 0.818907853626945d);
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        double double2 = org.apache.commons.math.util.FastMath.pow(184.52940052788836d, 2.1375961717620005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 69812.48373231749d + "'", double2 == 69812.48373231749d);
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0100224164209735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 145);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 145L + "'", long1 == 145L);
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        int int1 = org.apache.commons.math.util.FastMath.round(44.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.1729941422876436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.838470862556551E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7740624720562873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6990459782509952d) + "'", double1 == (-0.6990459782509952d));
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7646088003705097E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0011281692747829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0005639256313326d + "'", double1 == 1.0005639256313326d);
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1715099723401879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16985734991186185d + "'", double1 == 0.16985734991186185d);
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.3012986199364707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.040165237989493036d + "'", double1 == 0.040165237989493036d);
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.06937516207035956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7493995704460316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12528656017866552d) + "'", double1 == (-0.12528656017866552d));
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9694911126077237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8245979327377687d + "'", double1 == 0.8245979327377687d);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 88);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8492431649093556d, 2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8492431649093556d + "'", double2 == 0.8492431649093556d);
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        double double1 = org.apache.commons.math.util.FastMath.log10(79.49946532142216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9003642077918563d + "'", double1 == 1.9003642077918563d);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5452361990715799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26341531840017945d) + "'", double1 == (-0.26341531840017945d));
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3032833236333146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        double double1 = org.apache.commons.math.util.FastMath.tan((-44.49939260328993d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5687114866419769d) + "'", double1 == (-0.5687114866419769d));
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.003142877647074027d, 0.16646964819512286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0031428776470740273d + "'", double2 == 0.0031428776470740273d);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.176903375733162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        int int2 = org.apache.commons.math.util.FastMath.max(573, 6061);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6061 + "'", int2 == 6061);
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.027708598556821548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430841813905365d + "'", double1 == 1.5430841813905365d);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.1430297799195695d), 13.897423420904053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010291456619670528d) + "'", double2 == (-0.010291456619670528d));
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        double double1 = org.apache.commons.math.util.FastMath.exp(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        double double2 = org.apache.commons.math.util.FastMath.min(1.834991508392875E-20d, 2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.834991508392875E-20d + "'", double2 == 1.834991508392875E-20d);
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.675016391586134d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.050000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7410405809129375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.098117640127735d + "'", double1 == 2.098117640127735d);
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.14436016288910875d), (-0.7723057735309792d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9568041038130293d) + "'", double2 == (-2.9568041038130293d));
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9835107230884862d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.105044993492522d) + "'", double1 == (-4.105044993492522d));
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 88, 252318064L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88L + "'", long2 == 88L);
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.01790380500454481d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017903805004544807d) + "'", double1 == (-0.017903805004544807d));
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2885829000440232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0419298307345257d + "'", double1 == 1.0419298307345257d);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.527196701237181E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8927780093580949d) + "'", double1 == (-0.8927780093580949d));
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.35019665784357706d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3573985629477082d) + "'", double1 == (-0.3573985629477082d));
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3276676988791268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3220707078292161d + "'", double1 == 0.3220707078292161d);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        double double1 = org.apache.commons.math.util.FastMath.log10(416.60399367417324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.619723428891474d + "'", double1 == 2.619723428891474d);
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9823511917766846d, 0.869760369346332d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8461139641393225d + "'", double2 == 0.8461139641393225d);
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(100.3961566678666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.019788254642242d + "'", double1 == 10.019788254642242d);
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9440450304036032d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.2125204179373373d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.368505610608687E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6949885829579836d + "'", double1 == 0.6949885829579836d);
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9256440224479643d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9756139057433201d, 0.2980417794264124d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.97561390574332d + "'", double2 == 0.97561390574332d);
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.066732021965656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.927781993063035d + "'", double1 == 0.927781993063035d);
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        double double2 = org.apache.commons.math.util.FastMath.min(0.985031234232907d, 5.291336409328633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.985031234232907d + "'", double2 == 0.985031234232907d);
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.02771924100709588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) 145);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.24667646914497054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        long long1 = org.apache.commons.math.util.FastMath.round(6.978995704713228E82d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3305689962177146E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.74532925199433d, 0.0067668676472898565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5669192166547647d + "'", double2 == 1.5669192166547647d);
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.785670652509231E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.785670652509232E24d + "'", double1 == 6.785670652509232E24d);
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.806217383900344E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7864802E10f + "'", float2 == 9.7864802E10f);
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.5243548967072378E-29d, 0.0031091414242400387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5243548967072383E-29d + "'", double2 == 2.5243548967072383E-29d);
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(15.04595194541315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.045951945413151d + "'", double1 == 15.045951945413151d);
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0515804565243465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6057781034033436d + "'", double1 == 1.6057781034033436d);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1495508594130641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02006344741588842d + "'", double1 == 0.02006344741588842d);
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.02326916464517103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023542003793204997d + "'", double1 == 0.023542003793204997d);
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        double double2 = org.apache.commons.math.util.FastMath.pow(68204.64473888976d, 52.38248989944039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6114263875697965E253d + "'", double2 == 1.6114263875697965E253d);
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.16712951261998335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16791750933321592d + "'", double1 == 0.16791750933321592d);
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.015966225340774735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015966225340774735d + "'", double1 == 0.015966225340774735d);
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5385290260103368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.980369973160098d + "'", double1 == 30.980369973160098d);
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8592811670678461d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5071221992618503d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9545943990414509d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7418559722221916d) + "'", double1 == (-0.7418559722221916d));
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        double double1 = org.apache.commons.math.util.FastMath.sinh(23.137988217209347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.593332143810673E9d + "'", double1 == 5.593332143810673E9d);
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        long long1 = org.apache.commons.math.util.FastMath.round(8.591552284503315d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8902596696356354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8902596696356355d + "'", double1 == 0.8902596696356355d);
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        double double2 = org.apache.commons.math.util.FastMath.min(1.095821923671918d, 0.3223164485279285d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3223164485279285d + "'", double2 == 0.3223164485279285d);
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.027733451290817925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.028121603408807d + "'", double1 == 1.028121603408807d);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09744208412802913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09713542637401774d + "'", double1 == 0.09713542637401774d);
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9762070212477264E11d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3748459100034484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3582230891800424d + "'", double1 == 0.3582230891800424d);
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4414100388676627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8077671816348476d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9403545884174804d) + "'", double1 == (-0.9403545884174804d));
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6558995212736551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        double double1 = org.apache.commons.math.util.FastMath.rint((-6.982599029145449d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.0d) + "'", double1 == (-7.0d));
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.095315644213873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8308566982600258d + "'", double1 == 0.8308566982600258d);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) 14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7603734074051981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.434684175902781d + "'", double1 == 2.434684175902781d);
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        double double1 = org.apache.commons.math.util.FastMath.signum(18.789555525379853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8685646297050478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5804466683565797d) + "'", double1 == (-0.5804466683565797d));
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.1267812468982092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3277228222249259d + "'", double1 == 0.3277228222249259d);
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.8373008886306445E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.442682741625229E-6d + "'", double1 == 8.442682741625229E-6d);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.0034360715711427674d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034360648097666196d) + "'", double1 == (-0.0034360648097666196d));
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1556529996109892d, (-0.9702957262762538d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8690380517576407d + "'", double2 == 0.8690380517576407d);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 60.29681577459477d + "'", double1 == 60.29681577459477d);
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6715318396690159d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.24673403229618204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2798386717543342d + "'", double1 == 1.2798386717543342d);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5546252992521606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7412884004539402d + "'", double1 == 0.7412884004539402d);
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        double double1 = org.apache.commons.math.util.FastMath.log1p(23.62434292201784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.203735503332311d + "'", double1 == 3.203735503332311d);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9751426940447304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9916446132980798d + "'", double1 == 0.9916446132980798d);
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5695141467684478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6402833035492551d) + "'", double1 == (-0.6402833035492551d));
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.1157552973174212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6723323011208733d) + "'", double1 == (-0.6723323011208733d));
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        double double2 = org.apache.commons.math.util.FastMath.min(1.558278729101541d, 1.0003297196042849d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0003297196042849d + "'", double2 == 1.0003297196042849d);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9849405581677622d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-4.819341425933092E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9372885744304817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6612893534164409d + "'", double1 == 0.6612893534164409d);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5706217762642902d, 0.01913492915272034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5706217762642902d + "'", double2 == 1.5706217762642902d);
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7198644879044633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        double double2 = org.apache.commons.math.util.FastMath.max(36.741374145600744d, 0.0033625075349079095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.741374145600744d + "'", double2 == 36.741374145600744d);
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8030064940059782d, (-1.2670163798587484d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8030064940059782d + "'", double2 == 0.8030064940059782d);
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.140655263641914E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1406552636419142E-9d + "'", double1 == 1.1406552636419142E-9d);
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        float float2 = org.apache.commons.math.util.FastMath.min(2.52318064E8f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        int int2 = org.apache.commons.math.util.FastMath.min(88, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5792809126705765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8368565106885936d + "'", double1 == 0.8368565106885936d);
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.570284784815413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.44488600522827004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46104697186111915d + "'", double1 == 0.46104697186111915d);
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 4.691649480399091E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        double double1 = org.apache.commons.math.util.FastMath.cosh(17.439335658532258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8740330636442814E7d + "'", double1 == 1.8740330636442814E7d);
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.3260523900154437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3666194921802116d + "'", double1 == 0.3666194921802116d);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        long long2 = org.apache.commons.math.util.FastMath.max(2105L, (long) 2105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        long long1 = org.apache.commons.math.util.FastMath.round((-6.982599029145449d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-7L) + "'", long1 == (-7L));
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4194304.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.942385152878757d + "'", double1 == 15.942385152878757d);
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2366108776907425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0392014991613199d + "'", double1 == 1.0392014991613199d);
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0002899837490977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8416276283141133d + "'", double1 == 0.8416276283141133d);
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.16354719567405981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1650292235158622d + "'", double1 == 0.1650292235158622d);
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.13326424646685242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        long long1 = org.apache.commons.math.util.FastMath.round(4.0920461537065214E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.869760369346332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.386338945042338d + "'", double1 == 2.386338945042338d);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6005990604736159d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2150464716458638d + "'", double1 == 2.2150464716458638d);
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        double double2 = org.apache.commons.math.util.FastMath.max(1.461419372308587d, 0.03791113527135105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.461419372308587d + "'", double2 == 1.461419372308587d);
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        long long1 = org.apache.commons.math.util.FastMath.round(0.46376691716139407d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        long long1 = org.apache.commons.math.util.FastMath.round(0.748480575315297d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9030612511435306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 44L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-6.058502367302896E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.1346458267562316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1338408776625688d) + "'", double1 == (-0.1338408776625688d));
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        double double1 = org.apache.commons.math.util.FastMath.log(0.777169725542001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25209651547738315d) + "'", double1 == (-0.25209651547738315d));
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        long long1 = org.apache.commons.math.util.FastMath.round(0.027726343135365997d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.271111366571952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999990330084076d + "'", double1 == 0.9999990330084076d);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0144000753344111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0144000753344113d + "'", double1 == 1.0144000753344113d);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        double double2 = org.apache.commons.math.util.FastMath.max(1.978790047262867d, 2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2005.3522829578812d + "'", double2 == 2005.3522829578812d);
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        int int2 = org.apache.commons.math.util.FastMath.max(18, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2105, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 573);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        double double2 = org.apache.commons.math.util.FastMath.min(0.44760755429150645d, 1.5707775369683652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44760755429150645d + "'", double2 == 0.44760755429150645d);
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8977366876079912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232758299736455d + "'", double1 == 1.0232758299736455d);
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.09983407889920767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10016708343765153d + "'", double1 == 0.10016708343765153d);
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.13524400261494204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13524400261494207d + "'", double1 == 0.13524400261494207d);
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.916079783099616d, 1.5719334995494423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.35257472052315d + "'", double2 == 16.35257472052315d);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9092974268256817d) + "'", double1 == (-0.9092974268256817d));
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9835107230884862d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-548.3161232732465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.0d) + "'", double1 == (-7.0d));
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.35280798945955d + "'", double1 == 70.35280798945955d);
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0142047603949278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.1748021039363987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5017166594399687d + "'", double1 == 0.5017166594399687d);
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 38L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.12217123753453288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5071221992618504d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5291397667325838d) + "'", double1 == (-0.5291397667325838d));
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.006948882707861607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006948938632492979d + "'", double1 == 0.006948938632492979d);
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 44L, (-7.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2180280666000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.716145454548682d + "'", double1 == 2.716145454548682d);
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.098117640127735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.15081270044863d + "'", double1 == 8.15081270044863d);
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.806217383900344E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707915205775127d + "'", double1 == 1.5707915205775127d);
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        double double1 = org.apache.commons.math.util.FastMath.floor((-88.99999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.0d) + "'", double1 == (-89.0d));
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9262160379374064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0644436491518945d + "'", double1 == 1.0644436491518945d);
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5081249405686994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1467773520354667d + "'", double1 == 1.1467773520354667d);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6669977550399027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7175659295927064d + "'", double1 == 0.7175659295927064d);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        int int2 = org.apache.commons.math.util.FastMath.min(44, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.47268102317694594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4566444952199831d + "'", double1 == 0.4566444952199831d);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.027733451290817925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2121306115084953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0237158576051484d + "'", double1 == 1.0237158576051484d);
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5164470423549196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.02809969691994d + "'", double1 == 1.02809969691994d);
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        long long2 = org.apache.commons.math.util.FastMath.max(70368744177664L, (long) 145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 70368744177664L + "'", long2 == 70368744177664L);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8988277953526667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1580419920146572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9888326485685772d + "'", double1 == 0.9888326485685772d);
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.3012986199364707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.987143540941481d + "'", double1 == 8.987143540941481d);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(32.69314718055993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5706030611398719d + "'", double1 == 0.5706030611398719d);
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 24L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.28409796425857E43d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2840979642585698E43d + "'", double2 == 1.2840979642585698E43d);
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.020573130836222826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997883806080136d + "'", double1 == 0.9997883806080136d);
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.156119580207158E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5901750099221726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5901750099221728d + "'", double1 == 0.5901750099221728d);
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 573);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.07594384022318276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07579817506743834d + "'", double1 == 0.07579817506743834d);
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        long long2 = org.apache.commons.math.util.FastMath.max(14L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0001924087026581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6442070736028715d, 0.4083347225917441d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6442070736028715d + "'", double2 == 1.6442070736028715d);
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.092046153706293E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.015583573192166111d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01558357319216611d + "'", double2 == 0.01558357319216611d);
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4790553853029686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5217575897377857d + "'", double1 == 0.5217575897377857d);
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9640275800758168d, 0.07609034874226744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4920299855772985d + "'", double2 == 1.4920299855772985d);
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.6571830862563444E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.710505431213761E-20d + "'", double1 == 2.710505431213761E-20d);
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9030612511435306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2681114372998328d + "'", double1 == 1.2681114372998328d);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.10369259505400377d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9015023811213569d + "'", double1 == 0.9015023811213569d);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        long long1 = org.apache.commons.math.util.FastMath.round(1.444667861009766d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.833433014318606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.719590361169149d) + "'", double1 == (-3.719590361169149d));
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        double double2 = org.apache.commons.math.util.FastMath.min(0.14317511632530183d, 0.8873733262331065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14317511632530183d + "'", double2 == 0.14317511632530183d);
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.7897808285809945E73d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 169.42101997711706d + "'", double1 == 169.42101997711706d);
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.31408714102768087d), 0.12217123753453288d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.337865423418791E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 38, 6061.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6061.0f + "'", float2 == 6061.0f);
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21L + "'", long2 == 21L);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        double double2 = org.apache.commons.math.util.FastMath.min(1.646687632678067d, 0.5292052776014188d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5292052776014188d + "'", double2 == 0.5292052776014188d);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3072816183413566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5124634185645992d) + "'", double1 == (-0.5124634185645992d));
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2611472523996335E8d + "'", double1 == 4.2611472523996335E8d);
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4554625215028407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2864655896856925d + "'", double1 == 3.2864655896856925d);
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.11041129351109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.19284265622496d + "'", double1 == 11.19284265622496d);
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4341096590261957d, 1.0446244017252841d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0446244017252841d + "'", double2 == 1.0446244017252841d);
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.014375482049125378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014376472383597346d + "'", double1 == 0.014376472383597346d);
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.25650571966039964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.696695157506763d + "'", double1 == 14.696695157506763d);
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        double double1 = org.apache.commons.math.util.FastMath.tan(52.089425942248695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8655263841422394d) + "'", double1 == (-3.8655263841422394d));
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.15122623336946336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9885870885753854d + "'", double1 == 0.9885870885753854d);
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 145, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(116.2902126084367d, 26.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 116.29021260843669d + "'", double2 == 116.29021260843669d);
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999999995419658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.2723414711850413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27939113786590053d) + "'", double1 == (-0.27939113786590053d));
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5611212455169257d, 0.9999979411810735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999979411810735d + "'", double2 == 0.9999979411810735d);
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.9787900472628672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.255451401301077d + "'", double1 == 1.255451401301077d);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3220707078292161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.6268604078470186d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        long long1 = org.apache.commons.math.util.FastMath.round(0.003358054049998483d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.691649480399091E41d, 1.0848151289814358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.027726343135365997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.839159772498645E-4d + "'", double1 == 4.839159772498645E-4d);
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.00475626447215646d, 1.1279379694981986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0042167534122862105d + "'", double2 == 0.0042167534122862105d);
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6806406458923995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5976146060304162d + "'", double1 == 0.5976146060304162d);
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7945995197127065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6524486566078189d + "'", double1 == 0.6524486566078189d);
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 88, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88L + "'", long2 == 88L);
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.17415508950769856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1732760697622087d + "'", double1 == 0.1732760697622087d);
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.36938946978079723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1924443884703437d + "'", double1 == 1.1924443884703437d);
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        long long1 = org.apache.commons.math.util.FastMath.round(1.551648944791524d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.1649569776443817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4626719456900756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025528441328843503d + "'", double1 == 0.025528441328843503d);
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.7092603658226646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.823600827369575d + "'", double1 == 40.823600827369575d);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.370663976112528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9996157480449777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.3553727166518725E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3553727166517466E-7d + "'", double1 == 3.3553727166517466E-7d);
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6042895701620367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268E13d + "'", double1 == 7.896296018268E13d);
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) 38);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.757447703809722d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7574477038097218d) + "'", double1 == (-1.7574477038097218d));
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        int int2 = org.apache.commons.math.util.FastMath.max(18, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        double double1 = org.apache.commons.math.util.FastMath.cos(96.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18043044929108396d) + "'", double1 == (-0.18043044929108396d));
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2114236989366154d, 0.9108825383003673d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1908935183406186d + "'", double2 == 1.1908935183406186d);
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-1.7883278476424156d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.999933450804381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999971097955397d + "'", double1 == 0.9999971097955397d);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6218099972365794d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8169805481334201d, 1.5707963263922118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8169805481334202d + "'", double2 == 0.8169805481334202d);
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3277366163928728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7889886852857807d + "'", double1 == 0.7889886852857807d);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        int int2 = org.apache.commons.math.util.FastMath.min((-7), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.02772279083371712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027715690870484647d + "'", double1 == 0.027715690870484647d);
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.025618622601251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.39320825252632513d, 0.013459592477606882d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9875151923529222d + "'", double2 == 0.9875151923529222d);
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.78648047144194E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4608.315216893515d + "'", double1 == 4608.315216893515d);
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9860480246128209d, 0.023271265020779454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9996730870762927d + "'", double2 == 0.9996730870762927d);
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9437258688167108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.03700049997605E9d + "'", double1 == 3.03700049997605E9d);
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1811276859692623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.305865114670475d + "'", double1 == 8.305865114670475d);
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5334846105232111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4900750952145388d + "'", double1 == 0.4900750952145388d);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.434684175902781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5663169859928074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6061);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6061 + "'", int1 == 6061);
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.005282073904701802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005282049342824138d + "'", double1 == 0.005282049342824138d);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.702486392946792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.702486392946792d + "'", double1 == 0.702486392946792d);
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5560922495134364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.740261246641661d + "'", double1 == 4.740261246641661d);
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.15327808949840438d, 2.783937610096956E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5689800629322823d + "'", double2 == 1.5689800629322823d);
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(25.535789562407242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4456836049604084d + "'", double1 == 0.4456836049604084d);
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.822285085872435d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7275746186569931d) + "'", double1 == (-1.7275746186569931d));
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4386368936167206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.6571830862563444E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6571830862563444E-4d + "'", double1 == 1.6571830862563444E-4d);
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.015910541093645102d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015910541093645102d + "'", double1 == 0.015910541093645102d);
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.389662458514335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40026505289990955d + "'", double1 == 0.40026505289990955d);
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.057219132537549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1175057225567089d + "'", double1 == 1.1175057225567089d);
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9698480248174192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.56819859113724d + "'", double1 == 55.56819859113724d);
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0000000000000284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848079118d + "'", double1 == 0.8414709848079118d);
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5791357593406528d, 1.046956526320538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5791357593406529d + "'", double2 == 0.5791357593406529d);
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3689877298052195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9797056623737544d + "'", double1 == 0.9797056623737544d);
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7022630673105111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.018315125977104d + "'", double1 == 1.018315125977104d);
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3280805330246155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        int int2 = org.apache.commons.math.util.FastMath.min(22025, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999994323574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941557173695d + "'", double1 == 0.7615941557173695d);
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3498819149396504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1085021523306384d + "'", double1 == 1.1085021523306384d);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        double double1 = org.apache.commons.math.util.FastMath.acosh(22025.46174822276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.693101595361254d + "'", double1 == 10.693101595361254d);
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.2567992959374606d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2540574317869379d) + "'", double1 == (-0.2540574317869379d));
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.1589185064977667d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        double double1 = org.apache.commons.math.util.FastMath.log1p(43.63613080502884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.798543638801929d + "'", double1 == 3.798543638801929d);
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        int int2 = org.apache.commons.math.util.FastMath.max(88, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8291545066738191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7373605044683924d + "'", double1 == 0.7373605044683924d);
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.607240273007999E12d, (-0.01575786904519343d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6296611237943861d + "'", double2 == 0.6296611237943861d);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5313592245660101d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-11.38587492474475d), (-1.1310193973073308d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6698068255943352d) + "'", double2 == (-1.6698068255943352d));
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.821297790541765E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.028110643220979767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.534429040383576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5918820555798898d + "'", double1 == 0.5918820555798898d);
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4099406642694605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.042827011853929196d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.810477380965351d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1282113520070887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1908935183406186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        double double1 = org.apache.commons.math.util.FastMath.log1p(31.306852819440067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.475279369318095d + "'", double1 == 3.475279369318095d);
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4434830720305272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3670589930209352d + "'", double1 == 0.3670589930209352d);
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 24);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24L + "'", long1 == 24L);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        long long1 = org.apache.commons.math.util.FastMath.abs(14L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }
}

