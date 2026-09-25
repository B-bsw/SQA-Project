package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, 145L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 6061L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6061L + "'", long2 == 6061L);
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2105, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 57);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16571020934276798d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.281317477353221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5508032856724236d) + "'", double1 == (-0.5508032856724236d));
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0026428819590263043d, (-8.345153194998874d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0026428819590263043d + "'", double2 == 0.0026428819590263043d);
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.06230646868508781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9980595798433141d + "'", double1 == 0.9980595798433141d);
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9478899016727291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5802593100976132d + "'", double1 == 1.5802593100976132d);
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3967785394904115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3870426100977542d + "'", double1 == 0.3870426100977542d);
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        double double1 = org.apache.commons.math.util.FastMath.cosh(57.870002544225116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.785670652509231E24d + "'", double1 == 6.785670652509231E24d);
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2800017211707247E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2800017E7d + "'", double1 == 1.2800017E7d);
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9660121696160564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.8055865251572774E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.342227591314738E8d + "'", double1 == 8.342227591314738E8d);
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9034600343951872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015768352260377233d + "'", double1 == 0.015768352260377233d);
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.917031690363043d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5974781997606962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8267569045751701d + "'", double1 == 0.8267569045751701d);
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        double double1 = org.apache.commons.math.util.FastMath.sinh(18.132482812411777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066027288557E7d + "'", double1 == 3.748066027288557E7d);
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        double double2 = org.apache.commons.math.util.FastMath.min(0.07758970755368584d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        double double1 = org.apache.commons.math.util.FastMath.log(0.19006280234111023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6604007228000892d) + "'", double1 == (-1.6604007228000892d));
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4315459888945143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6495041918715682d + "'", double1 == 0.6495041918715682d);
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.20615494521474886d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9367397952018179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.551648944791524d + "'", double1 == 1.551648944791524d);
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        long long1 = org.apache.commons.math.util.FastMath.round(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9640275800758169d) + "'", double1 == (-0.9640275800758169d));
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2501327124042694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.05363026241493581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3771116715785444d + "'", double1 == 0.3771116715785444d);
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5802718846862194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.8199681505512405E-18d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9075541030048625d, 0.9999923903252116d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9075541030048625d + "'", double2 == 0.9075541030048625d);
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7476026429360669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.927128473999452d + "'", double1 == 0.927128473999452d);
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        float float2 = org.apache.commons.math.util.FastMath.max(21.0f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8835877589816593d, 0.005958866902386009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8835877589816592d + "'", double2 == 0.8835877589816592d);
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0717314035742076d + "'", double1 == 2.0717314035742076d);
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9802576824651942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6651429140501224d + "'", double1 == 1.6651429140501224d);
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1358057023023203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9962287607713785d + "'", double1 == 0.9962287607713785d);
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, 2105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.25480723471248695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26054715583337607d + "'", double1 == 0.26054715583337607d);
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.948148009133979E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.306852819440067d + "'", double1 == 31.306852819440067d);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        double double2 = org.apache.commons.math.util.FastMath.max((-3.848501131276805d), 3.355404407222922E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.355404407222922E-7d + "'", double2 == 3.355404407222922E-7d);
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1529211698783688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1422988693731795d + "'", double1 == 0.1422988693731795d);
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.27401024075282976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2932359235759898d + "'", double1 == 1.2932359235759898d);
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.025081067752414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8962099211411942d + "'", double1 == 2.8962099211411942d);
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.8384708625565505E-4d, 4.064934783641962d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.838470862556551E-4d + "'", double2 == 4.838470862556551E-4d);
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.6342953050784885d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0216840061629693d) + "'", double1 == (-1.0216840061629693d));
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.078927767113337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0790099456648899d + "'", double1 == 0.0790099456648899d);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.112226704088329d, 1.0963506817327158d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7925863873716607d + "'", double2 == 0.7925863873716607d);
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        double double1 = org.apache.commons.math.util.FastMath.log((-5.073519547246666d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.6691057363794052E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.668966448431096E-4d) + "'", double1 == (-1.668966448431096E-4d));
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 88L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 88 + "'", int1 == 88);
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065306597126334d + "'", double1 == 0.6065306597126334d);
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3375726937940255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8001550844245482d + "'", double1 == 0.8001550844245482d);
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.3595791268726303d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.8212977905417654E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9548140040785889E12d + "'", double1 == 1.9548140040785889E12d);
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.554877906181354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.261646633260967d + "'", double1 == 2.261646633260967d);
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.04749646746707084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04864249675059162d + "'", double1 == 0.04864249675059162d);
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.543532148561955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.18631502623505247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5711488333128701d + "'", double1 == 0.5711488333128701d);
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672743d + "'", double1 == 0.9171523356672743d);
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7805951733159244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.862318872287684d + "'", double1 == 0.862318872287684d);
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 252318057L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.52318064E8f + "'", float1 == 2.52318064E8f);
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5225789835263854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9823511917766846d + "'", double1 == 0.9823511917766846d);
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        double double2 = org.apache.commons.math.util.FastMath.pow(3266.0d, 8886110.520507816d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.022989228293811562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15162199145840144d + "'", double1 == 0.15162199145840144d);
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.7092603658226646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8431572614602446d) + "'", double1 == (-0.8431572614602446d));
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.4466253619172305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.549306154007517d + "'", double1 == 11.549306154007517d);
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.643440755033571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1555516045788383d + "'", double1 == 1.1555516045788383d);
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9771057199762778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.17058116794162126d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.017429734739979972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7587092222898677d) + "'", double1 == (-1.7587092222898677d));
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.02320532867235397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02320116475950291d + "'", double1 == 0.02320116475950291d);
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.293727206892505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005126506862960794d + "'", double1 == 0.005126506862960794d);
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.702683232003031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.2932344847484805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07493107731902326d + "'", double1 == 0.07493107731902326d);
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3803000710956943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8810184436663309d + "'", double1 == 0.8810184436663309d);
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4336110861910443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        double double1 = org.apache.commons.math.util.FastMath.log10(40.236709864803935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6046224614619247d + "'", double1 == 1.6046224614619247d);
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.028092407000022617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.903049969606974E-4d + "'", double1 == 4.903049969606974E-4d);
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        float float2 = org.apache.commons.math.util.FastMath.max(88.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.053272382792571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.522227941985666d, (-0.5695141467684478d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6960734350155904d + "'", double2 == 1.6960734350155904d);
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0440073467671152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.817214750406706d + "'", double1 == 59.817214750406706d);
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.04582714110102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.92148128532128d + "'", double1 == 59.92148128532128d);
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.49546634624061675d, 0.6816339640127264d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6195998352919936d + "'", double2 == 0.6195998352919936d);
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        double double1 = org.apache.commons.math.util.FastMath.tanh(21.48756259689264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.015705630273145536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015583573192166111d + "'", double1 == 0.015583573192166111d);
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1123.372703893139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64364.51475327641d + "'", double1 == 64364.51475327641d);
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4341096590261957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4341096590261957d + "'", double1 == 1.4341096590261957d);
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0011273202556092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3848831882289924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40508603762258366d + "'", double1 == 0.40508603762258366d);
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.41078129050290885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34414365766927546d + "'", double1 == 0.34414365766927546d);
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.555769423778169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.555769423778169d + "'", double1 == 0.555769423778169d);
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.005282123029073894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17415508950769856d + "'", double1 == 0.17415508950769856d);
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3135381832487074d + "'", double1 == 1.3135381832487074d);
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.000000335537328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745329837617443d + "'", double1 == 0.01745329837617443d);
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.009440910350078538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.003749170920418732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06123047378894542d + "'", double1 == 0.06123047378894542d);
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8447250802010534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1262947170145017d + "'", double1 == 1.1262947170145017d);
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 44, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5796414510841192d + "'", double1 == 0.5796414510841192d);
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5514266812417142d, 1.9567633533440579E80d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        double double1 = org.apache.commons.math.util.FastMath.log(0.981992372399956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01817173807132448d) + "'", double1 == (-0.01817173807132448d));
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.02077447867535781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02077746805881874d + "'", double1 == 0.02077746805881874d);
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9478899016727291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.31009080891797d + "'", double1 == 54.31009080891797d);
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9700147524633321d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7175814658190476d), 0.16571020934276795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7175814658190476d) + "'", double2 == (-0.7175814658190476d));
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7711778429329054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013459592477606882d + "'", double1 == 0.013459592477606882d);
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        double double2 = org.apache.commons.math.util.FastMath.max(11128.422256815777d, 0.5239029773179922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11128.422256815777d + "'", double2 == 11128.422256815777d);
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.5356779950985695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5822397121190288d + "'", double1 == 1.5822397121190288d);
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2439775726559248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1153374254708415d + "'", double1 == 1.1153374254708415d);
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        double double1 = org.apache.commons.math.util.FastMath.signum(157.76352969722723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.17914743767370203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17914743767370203d + "'", double1 == 0.17914743767370203d);
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4328100205340816d, 1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40846716344564316d + "'", double2 == 0.40846716344564316d);
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1037080495808624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 7L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        long long1 = org.apache.commons.math.util.FastMath.round(0.025351928495140397d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.668966448431096E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.08883176481419076d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0980197632589184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4392243904439938d + "'", double1 == 0.4392243904439938d);
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.917031690363043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.917031690363043d + "'", double1 == 1.917031690363043d);
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        double double1 = org.apache.commons.math.util.FastMath.sinh(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6116860184273725E18d + "'", double1 == 4.6116860184273725E18d);
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1443601628891088d, 198.57204013738644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14436016288910883d + "'", double2 == 0.14436016288910883d);
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.34414365766927546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3584059010869395d + "'", double1 == 0.3584059010869395d);
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.317069759957247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.009494959628835965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999549232094803d + "'", double1 == 0.9999549232094803d);
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.1687440534368837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.66832207986347d) + "'", double1 == (-9.66832207986347d));
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608216038771d + "'", double1 == 0.6483608216038771d);
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        long long2 = org.apache.commons.math.util.FastMath.min(252318057L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.21565069657906166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21735815689017746d + "'", double1 == 0.21735815689017746d);
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.841104430236654E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.415543885269349d) + "'", double1 == (-8.415543885269349d));
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.8199681505512405E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8199681505512405E-18d + "'", double1 == 2.8199681505512405E-18d);
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.0889074357665705d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019005020003575318d) + "'", double1 == (-0.019005020003575318d));
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        int int2 = org.apache.commons.math.util.FastMath.min(88, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        double double2 = org.apache.commons.math.util.FastMath.min(9.434905982971384E167d, 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.211102550927978d + "'", double2 == 7.211102550927978d);
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.18317440686560532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9832704240126623d + "'", double1 == 0.9832704240126623d);
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.35019665784357706d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7045495209043636d + "'", double1 == 0.7045495209043636d);
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.837300699980114E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8373006999801143E-4d + "'", double1 == 4.8373006999801143E-4d);
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        double double1 = org.apache.commons.math.util.FastMath.atanh(13.110581167104948d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2915496650148839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9119464411208467d + "'", double1 == 0.9119464411208467d);
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        double double1 = org.apache.commons.math.util.FastMath.asin(10.991338187845832d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.834741096244351d), (-2.2529813614778327d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8347410962443511d) + "'", double2 == (-0.8347410962443511d));
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.834991508392875E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.006767125876795721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.006790074609561d + "'", double1 == 1.006790074609561d);
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7377936960093874E-61d, 0.2286446715540403d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2810006461461376E-14d + "'", double2 == 1.2810006461461376E-14d);
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8030064940059782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6384734124839342d + "'", double1 == 0.6384734124839342d);
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4677992676220695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.674658414801334d + "'", double1 == 9.674658414801334d);
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8032290633000474d, 0.025351928495140397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.025351928495140397d + "'", double2 == 0.025351928495140397d);
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7315511733755106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5490176387842941d + "'", double1 == 0.5490176387842941d);
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.1205702641807171d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2172043679489204d, 8.037623954904807E-44d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.003441988422769002d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        int int2 = org.apache.commons.math.util.FastMath.max(26, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.8373005113295966E-4d, 6.055454452467354E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.558278729101541d + "'", double2 == 1.558278729101541d);
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0016308456897390394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-59.00187915014031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3380.558658643968d) + "'", double1 == (-3380.558658643968d));
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2439775726559248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8465862106190108d + "'", double1 == 0.8465862106190108d);
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.009972194509427618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5713646578737349d + "'", double1 == 0.5713646578737349d);
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.12186934340514759d, 1.432066880993469d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1218693434051476d + "'", double2 == 0.1218693434051476d);
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.716003343634799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9373799744831653d + "'", double1 == 0.9373799744831653d);
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.902641160672524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.064934783641962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5L), (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7925863873716607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7268687239847369d + "'", double1 == 0.7268687239847369d);
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5777218104420236E-30d + "'", double1 == 1.5777218104420236E-30d);
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        double double1 = org.apache.commons.math.util.FastMath.atanh(68.94253586247545d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.999301726082793d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017441105341007235d) + "'", double1 == (-0.017441105341007235d));
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.30280766885405475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9545030018773397d + "'", double1 == 0.9545030018773397d);
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2932359235759898d, 0.16354719567405981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4450005666942871d + "'", double2 == 1.4450005666942871d);
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7410405809129375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7377665079155183d + "'", double1 == 0.7377665079155183d);
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.40531933496538397d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4671904686841657d + "'", double2 == 2.4671904686841657d);
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.0717314035742076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8771338786018624d + "'", double1 == 0.8771338786018624d);
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7, (float) (-5L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999999999999972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818284590375d + "'", double1 == 2.7182818284590375d);
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.0572983097976434d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8839737144478427d) + "'", double1 == (-0.8839737144478427d));
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.7755575615628914E-17d, 0.08106152637093929d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04548756600101103d + "'", double2 == 0.04548756600101103d);
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1379172066869372d, 0.9986502386334037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1379172066869372d + "'", double2 == 1.1379172066869372d);
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5896235118375416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22942520686930212d) + "'", double1 == (-0.22942520686930212d));
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6681507037242218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0307694028144718d + "'", double1 == 1.0307694028144718d);
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(21.48756259689264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.780112592997408d + "'", double1 == 2.780112592997408d);
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7465662286826749d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        double double1 = org.apache.commons.math.util.FastMath.asinh(794.3444567224569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.370664768526758d + "'", double1 == 7.370664768526758d);
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 252318057L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        double double2 = org.apache.commons.math.util.FastMath.max(3.875409442231813E-18d, 1.000000000000007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000000007d + "'", double2 == 1.000000000000007d);
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7644456989950164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1478035149914898d + "'", double1 == 1.1478035149914898d);
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9075541030048625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075541030048625d + "'", double1 == 0.9075541030048625d);
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.29969989012090864d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6692096495584949d) + "'", double1 == (-0.6692096495584949d));
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        double double1 = org.apache.commons.math.util.FastMath.asinh(10.991338187845832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0923176850416234d + "'", double1 == 3.0923176850416234d);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.05847593957153261d), 0.1900795435532183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.058475939571532604d) + "'", double2 == (-0.058475939571532604d));
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 24L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7044288495501951d, 16384.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0403008077402379E-4d + "'", double2 == 1.0403008077402379E-4d);
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.549478463118442d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.07657256688026017d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        int int2 = org.apache.commons.math.util.FastMath.max(2105, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2105 + "'", int2 == 2105);
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        long long2 = org.apache.commons.math.util.FastMath.max(24L, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.717237764496549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        double double1 = org.apache.commons.math.util.FastMath.log(0.19655672755619258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6268041994823212d) + "'", double1 == (-1.6268041994823212d));
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        double double1 = org.apache.commons.math.util.FastMath.acosh(6.978995704713228E82d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 191.44802983064776d + "'", double1 == 191.44802983064776d);
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5122039064583164d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.6667712316526706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8893743780568829d) + "'", double1 == (-0.8893743780568829d));
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.405171239038476E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1339.826820836073d + "'", double1 == 1339.826820836073d);
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3169578969248166d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.026697492810876286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026694321456989602d) + "'", double1 == (-0.026694321456989602d));
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9545030018773397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9769866948312754d + "'", double1 == 0.9769866948312754d);
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4957913555252836d, 0.9997774817202983d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46036359942346083d + "'", double2 == 0.46036359942346083d);
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5937881252841114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46611365138537225d + "'", double1 == 0.46611365138537225d);
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9974964160775458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3142624216984847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.0034419748301271536d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15098572778760802d) + "'", double1 == (-0.15098572778760802d));
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3686181549811496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3686181549811498d + "'", double1 == 1.3686181549811498d);
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.777169725542001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771697255420011d + "'", double1 == 0.7771697255420011d);
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        double double2 = org.apache.commons.math.util.FastMath.max(0.61391130652238d, 1.2304174960375769E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2304174960375769E11d + "'", double2 == 1.2304174960375769E11d);
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0829060309440988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8251802222449077d + "'", double1 == 0.8251802222449077d);
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.11219328616561733d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11172607161151513d) + "'", double1 == (-0.11172607161151513d));
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.344569741801254E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3445422571944796E-5d + "'", double1 == 2.3445422571944796E-5d);
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8060294742125208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1155899177076454d + "'", double1 == 1.1155899177076454d);
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(172.58048571980692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.13698921822679d + "'", double1 == 13.13698921822679d);
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-36.912814250652346d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(57.295779251985515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577925198552d + "'", double1 == 57.29577925198552d);
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5695141467684478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5695141467684478d + "'", double1 == 0.5695141467684478d);
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.687884041545413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8988277953526667d) + "'", double1 == (-0.8988277953526667d));
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.4671904686841657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3922026785961111d + "'", double1 == 0.3922026785961111d);
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        double double1 = org.apache.commons.math.util.FastMath.sinh(32.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134147E13d + "'", double1 == 3.948148009134147E13d);
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        int int2 = org.apache.commons.math.util.FastMath.min(145, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        double double1 = org.apache.commons.math.util.FastMath.signum((-2.0240230476782646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.395778272734467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.038116105652526d + "'", double1 == 4.038116105652526d);
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        double double1 = org.apache.commons.math.util.FastMath.acos(21.487562596892644d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9408416071039944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9798783713774953d + "'", double1 == 0.9798783713774953d);
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4866866385819412d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.8193414259330926E-20d), 1.027513104308492d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.819341425933092E-20d) + "'", double2 == (-4.819341425933092E-20d));
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999103740052037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        double double2 = org.apache.commons.math.util.FastMath.max(0.227162898778971d, 2.1482664472188384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1482664472188384d + "'", double2 == 2.1482664472188384d);
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-104.42056479913087d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.04640300046199763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8995084834391828d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5773024999492185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1713189077681307d + "'", double1 == 1.1713189077681307d);
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.984807753012208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        double double1 = org.apache.commons.math.util.FastMath.acosh(794.3444567224569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.370663976112528d + "'", double1 == 7.370663976112528d);
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.3078511907005352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9862108565452042d) + "'", double1 == (-0.9862108565452042d));
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 263.25696924845715d + "'", double1 == 263.25696924845715d);
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6592827871476782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7198644879044633d + "'", double1 == 0.7198644879044633d);
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 18L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, (float) 18L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9960434131864047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.543627421086951d + "'", double1 == 0.543627421086951d);
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9777313730176922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.992521333312215d + "'", double1 == 0.992521333312215d);
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 18.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999996d + "'", double1 == 0.9999999999999996d);
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5660043779672871d, 0.0027856622314566606d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9984157868786833d + "'", double2 == 0.9984157868786833d);
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8772827919571973d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.896296018267966E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9904761558980245d + "'", double1 == 0.9904761558980245d);
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97864804714L, 6061.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6061.0f + "'", float2 == 6061.0f);
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.10707716392528016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.135069575149024d) + "'", double1 == (-6.135069575149024d));
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.03467616460044844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03468311433197074d + "'", double1 == 0.03468311433197074d);
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4679136108514075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7763458326584011d + "'", double1 == 0.7763458326584011d);
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.54983443527075d + "'", double1 == 7.54983443527075d);
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.027729896256446035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02772279083371712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027726343135365997d + "'", double1 == 0.027726343135365997d);
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2172043679489204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.540837475237443d + "'", double1 == 1.540837475237443d);
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.920960112236651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39813660169837595d + "'", double1 == 0.39813660169837595d);
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 88, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.0214659450282346d), 0.6989700043360189d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6928551622806686d, (double) 44);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.733479389818152E-8d + "'", double2 == 9.733479389818152E-8d);
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.017480437429290896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017480437429290896d + "'", double1 == 0.017480437429290896d);
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        double double1 = org.apache.commons.math.util.FastMath.ulp(14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4365120111136123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4365120111136124d + "'", double1 == 0.4365120111136124d);
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        double double1 = org.apache.commons.math.util.FastMath.asin(14.741329353331304d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 7);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8450980400142568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.42055096759488d + "'", double1 == 48.42055096759488d);
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        long long2 = org.apache.commons.math.util.FastMath.min(44L, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6935845637532064d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.08308215993632732d), 0.020573130836222826d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8711009277842993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7019330522792107d + "'", double1 == 0.7019330522792107d);
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 7, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.08308215993632732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08317777404333761d) + "'", double1 == (-0.08317777404333761d));
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.095696199512584E-4d, 6662.938381142456d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.646142621210584E-8d + "'", double2 == 4.646142621210584E-8d);
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3940493875124622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.57736682417917d + "'", double1 == 22.57736682417917d);
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6238107163648714d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.41032129904825876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4103212990482587d) + "'", double1 == (-0.4103212990482587d));
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.0605566643729682d, 0.535856475922823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.060556664372968d + "'", double2 == 3.060556664372968d);
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.36019649632180123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3684785197548404d + "'", double1 == 0.3684785197548404d);
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.19006280234111017d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19006280234111014d + "'", double2 == 0.19006280234111014d);
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        float float2 = org.apache.commons.math.util.FastMath.max(26.0f, (float) 97864804714L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7864802E10f + "'", float2 == 9.7864802E10f);
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7357658507756508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.565404923404685d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.025081067752414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.41032129904825876d), 0.4876096657890749d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.41032129904825876d) + "'", double2 == (-0.41032129904825876d));
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8401463744358098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3741766975878222d + "'", double1 == 1.3741766975878222d);
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.806217383955855E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.8428599996679606E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1449159333471108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1449159333471108d + "'", double1 == 1.1449159333471108d);
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18006177305525128d + "'", double1 == 0.18006177305525128d);
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.08894901143102314d), (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.6881171418161346E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.685719999335933E24d + "'", double1 == 5.685719999335933E24d);
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.841104430236654E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.841104430236654E-9d + "'", double1 == 3.841104430236654E-9d);
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1261967.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6994983692632406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2547886346349597d + "'", double1 == 1.2547886346349597d);
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6098494453571868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6558706068682112d) + "'", double1 == (-0.6558706068682112d));
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.189442356607096E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.027138506478055E8d + "'", double1 == 6.027138506478055E8d);
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.8435037267365852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9630452163468409d + "'", double1 == 0.9630452163468409d);
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(180.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10313.240312354817d + "'", double1 == 10313.240312354817d);
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0963506817327155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45684539312060757d + "'", double1 == 0.45684539312060757d);
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        double double2 = org.apache.commons.math.util.FastMath.max((-8.144346427974586d), 0.6381615560800912d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6381615560800912d + "'", double2 == 0.6381615560800912d);
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, 6061.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6061.0f + "'", float2 == 6061.0f);
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        double double1 = org.apache.commons.math.util.FastMath.atan(144.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5638998844065481d + "'", double1 == 1.5638998844065481d);
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3026405418156001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3072816183413564d + "'", double1 == 0.3072816183413564d);
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.338474404104274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.037733537220261d + "'", double1 == 2.037733537220261d);
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9999999995419658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011929370179d + "'", double1 == 1.1752011929370179d);
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.231079894239296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5664744974827294d + "'", double1 == 1.5664744974827294d);
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.0429318112613317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4293116564491215d + "'", double1 == 1.4293116564491215d);
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0438252985430079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        double double1 = org.apache.commons.math.util.FastMath.tan(386.7761267440676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37666586311390227d + "'", double1 == 0.37666586311390227d);
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        int int2 = org.apache.commons.math.util.FastMath.min(44, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999938558065222d + "'", double1 == 0.9999938558065222d);
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0348924178573234d + "'", double1 == 0.0348924178573234d);
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.317069759957247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8660533668334749d + "'", double1 == 0.8660533668334749d);
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6046224614619247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1707323589456107d + "'", double1 == 1.1707323589456107d);
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5575274776122784d), 1.0115470718397392d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5037357911332905d) + "'", double2 == (-0.5037357911332905d));
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.017450748081259817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017450748081259813d) + "'", double1 == (-0.017450748081259813d));
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.009494959759213906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09744208412802913d + "'", double1 == 0.09744208412802913d);
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3333452696210846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12494262448882598d + "'", double1 == 0.12494262448882598d);
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        double double1 = org.apache.commons.math.util.FastMath.rint(4342.170967875233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4342.0d + "'", double1 == 4342.0d);
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.9369645424212623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9225054331185167E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3881317890172014E-21d + "'", double1 == 3.3881317890172014E-21d);
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2426208133067402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3223164485279285d + "'", double1 == 0.3223164485279285d);
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.023209495501244227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02321157975766268d + "'", double1 == 0.02321157975766268d);
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9122769076921013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4457971536268004d + "'", double1 == 1.4457971536268004d);
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.8373005113295966E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8373008886306445E-4d + "'", double1 == 4.8373008886306445E-4d);
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6380998614296134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5636043816926894d) + "'", double1 == (-0.5636043816926894d));
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.00495749420004732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0049574942000473205d + "'", double1 == 0.0049574942000473205d);
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.026744865808352235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440482715802522d + "'", double1 == 1.5440482715802522d);
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 26, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.0572983097976434d), 11013.232874703392d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.057298309797643d) + "'", double2 == (-2.057298309797643d));
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.543073535942135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026931713802581317d + "'", double1 == 0.026931713802581317d);
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.3554049701598595E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.3250734611491427d), (-0.5680724581504838d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.32507346114914276d) + "'", double2 == (-0.32507346114914276d));
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5093497777060075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.534429040383576d + "'", double1 == 0.534429040383576d);
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.757373373600886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9900259135585372d + "'", double1 == 0.9900259135585372d);
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.014382967415158656d), 0.01773703268867599d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6813522939629808d) + "'", double2 == (-0.6813522939629808d));
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.834202696611004d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.47268102317694594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.687518016619889d + "'", double1 == 0.687518016619889d);
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.2511212299366168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6309008946504804d + "'", double1 == 0.6309008946504804d);
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.71827069403746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182706940374604d + "'", double1 == 2.7182706940374604d);
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.42614722344031464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7525231897963122d) + "'", double1 == (-0.7525231897963122d));
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8622926809699384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015049846398774476d) + "'", double1 == (-0.015049846398774476d));
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4614193723085869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.461419372308587d + "'", double1 == 1.461419372308587d);
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6894104737616445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7716211363261058d + "'", double1 == 0.7716211363261058d);
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.18054648615969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0446384732171334d + "'", double1 == 2.0446384732171334d);
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.12217304763960309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0021323219385069605d + "'", double1 == 0.0021323219385069605d);
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4434101142727052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8933946514049345d + "'", double1 == 0.8933946514049345d);
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.6548885605479215d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.654888560547921d + "'", double2 == 2.654888560547921d);
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8030064940059782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.232242072380867d + "'", double1 == 1.232242072380867d);
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1508598335814295d, 2.5249271018183177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008432537512342445d + "'", double2 == 0.008432537512342445d);
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5323425837018869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0094308805335483d + "'", double1 == 1.0094308805335483d);
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        long long2 = org.apache.commons.math.util.FastMath.min(14L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3873669366539792d, (-0.7289664090565792d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7289664090565792d) + "'", double2 == (-0.7289664090565792d));
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 145L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.16571020934276795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3686181549811498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2008036112160549d + "'", double1 == 0.2008036112160549d);
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.2931185359546688E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.293118535954669E-4d + "'", double1 == 2.293118535954669E-4d);
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.09744208412802913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.583020167494775d + "'", double1 == 5.583020167494775d);
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        long long2 = org.apache.commons.math.util.FastMath.max(145L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3108282473449602d, 0.42206715285395996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.42206715285395996d + "'", double2 == 0.42206715285395996d);
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02740339846894975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027406828344271994d + "'", double1 == 0.027406828344271994d);
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        double double1 = org.apache.commons.math.util.FastMath.exp(169.42101997711706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.789780828580952E73d + "'", double1 == 3.789780828580952E73d);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 4.6116860184273725E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6116860184273725E18d + "'", double2 == 4.6116860184273725E18d);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7925622793797507d + "'", double1 == 0.7925622793797507d);
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.09364907698670265d), (-0.08883176481419076d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08883176481419076d) + "'", double2 == (-0.08883176481419076d));
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        double double1 = org.apache.commons.math.util.FastMath.tan(572.9577951308231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.483006288299812d + "'", double1 == 2.483006288299812d);
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.028063127633168303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027676573351037934d + "'", double1 == 0.027676573351037934d);
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        float float1 = org.apache.commons.math.util.FastMath.abs(21.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 21.0f + "'", float1 == 21.0f);
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        int int2 = org.apache.commons.math.util.FastMath.max(252318064, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252318064 + "'", int2 == 252318064);
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9950547536867305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9983488597987606d + "'", double1 == 0.9983488597987606d);
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7972957247486471d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-5L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        int int1 = org.apache.commons.math.util.FastMath.abs(88);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 88 + "'", int1 == 88);
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1684368179756126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0142190505354765d + "'", double1 == 1.0142190505354765d);
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.036090693379206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6975744860120547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8625603629504911d + "'", double1 == 0.8625603629504911d);
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8749693034931421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.505423913083337d + "'", double1 == 0.505423913083337d);
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2), 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.08139459933906179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.190457935876819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.05303208879876d + "'", double1 == 65.05303208879876d);
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(184.52940052788836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 184.52940052788838d + "'", double1 == 184.52940052788838d);
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5428187279146441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4336110861910443d + "'", double1 == 0.4336110861910443d);
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5402647332399915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26739338089528597d) + "'", double1 == (-0.26739338089528597d));
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3748459100034484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3836860204576589d + "'", double1 == 0.3836860204576589d);
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2976454463101708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2891563983546802d + "'", double1 == 0.2891563983546802d);
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        long long1 = org.apache.commons.math.util.FastMath.round(2.405171239038476E9d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2405171239L + "'", long1 == 2405171239L);
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        double double2 = org.apache.commons.math.util.FastMath.min(0.36221796077615454d, 0.0214010731908018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0214010731908018d + "'", double2 == 0.0214010731908018d);
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        double double2 = org.apache.commons.math.util.FastMath.max(2.6977837230134307d, 1.0497671000301219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6977837230134307d + "'", double2 == 2.6977837230134307d);
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1726310973781435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8646887382670995d + "'", double1 == 0.8646887382670995d);
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2502.0077057310687d + "'", double1 == 2502.0077057310687d);
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2146848510894035E-8d + "'", double1 == 4.2146848510894035E-8d);
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.1339290130681278E-7d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7267002501159548d) + "'", double1 == (-0.7267002501159548d));
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6994983692632405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0127428005375332d + "'", double1 == 1.0127428005375332d);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9973625536928628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.542519758633026d + "'", double1 == 0.542519758633026d);
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.8212977905417654E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8212977905417654E24d + "'", double1 == 3.8212977905417654E24d);
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.28940686250036d + "'", double1 == 84.28940686250036d);
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 52.0f, 4.2932344847484805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3291890022899713E7d + "'", double2 == 2.3291890022899713E7d);
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        double double1 = org.apache.commons.math.util.FastMath.atan(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.694903085487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2982333069391765d + "'", double1 == 1.2982333069391765d);
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4648059638067725d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0106616096925348d + "'", double1 == 0.0106616096925348d);
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8556343548213673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3889399778217377d + "'", double1 == 1.3889399778217377d);
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.0794534402614928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.883541294419299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8835412944192991d + "'", double1 == 0.8835412944192991d);
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        double double1 = org.apache.commons.math.util.FastMath.log10(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5185139398778875d + "'", double1 == 1.5185139398778875d);
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        long long1 = org.apache.commons.math.util.FastMath.round(2.4360530864024404E78d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9866275920404841d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.26054715583337607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.647800509523138d), 2.713200981319833d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9312808719911467d) + "'", double2 == (-0.9312808719911467d));
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        long long2 = org.apache.commons.math.util.FastMath.min(21L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1322832176218787E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.976207021257726E11d + "'", double1 == 1.976207021257726E11d);
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.09950371902099903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09983407889920767d + "'", double1 == 0.09983407889920767d);
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        int int1 = org.apache.commons.math.util.FastMath.round(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        long long1 = org.apache.commons.math.util.FastMath.round(0.11109916834859056d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4637669171613941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5900523133380877d + "'", double1 == 1.5900523133380877d);
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        double double1 = org.apache.commons.math.util.FastMath.log(11013.232874703392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306852817378902d + "'", double1 == 9.306852817378902d);
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2172043679489204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6477149319066933d + "'", double1 == 0.6477149319066933d);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.355404970159796E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.47425505651082d) + "'", double1 == (-6.47425505651082d));
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9995818558737992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.917031690363043d, 2.232630319679133d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7094902377818831d + "'", double2 == 0.7094902377818831d);
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.6522336740340915d, 1.363899346513529d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.652233674034091d + "'", double2 == 5.652233674034091d);
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6218099972365794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.627088500697376d + "'", double1 == 35.627088500697376d);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6250369392251006d, 3.360842641004344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6250369392251007d + "'", double2 == 0.6250369392251007d);
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.646142621210584E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003594988557117298d + "'", double1 == 0.003594988557117298d);
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.02326916464517103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997292852036567d + "'", double1 == 0.9997292852036567d);
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7678292603100174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.99337600241585d + "'", double1 == 43.99337600241585d);
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04749646746707085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0011281692747829d + "'", double1 == 1.0011281692747829d);
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3333452696210848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7201746613556624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8486310513737183d + "'", double1 == 0.8486310513737183d);
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        int int2 = org.apache.commons.math.util.FastMath.max(22025, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.44430607342225E59d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.444306073422251E59d + "'", double1 == 4.444306073422251E59d);
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0860321793404941d, (-6.4742592311448774d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.586064087335976d + "'", double2 == 0.586064087335976d);
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57, (float) (-7L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        double double2 = org.apache.commons.math.util.FastMath.max(198.57204013738644d, 1.1193272159135788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.57204013738644d + "'", double2 == 198.57204013738644d);
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8169805481334202d, 3.2503203288452633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8169805481334204d + "'", double2 == 0.8169805481334204d);
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.8055865251572774E26d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.15268415727515278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15328370882278117d + "'", double1 == 0.15328370882278117d);
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.197664423181247E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.197856482370466E-5d + "'", double1 == 6.197856482370466E-5d);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.535856475922823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.859831647227964d + "'", double1 == 0.859831647227964d);
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        long long1 = org.apache.commons.math.util.FastMath.round(9.78648047144194E10d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97864804714L + "'", long1 == 97864804714L);
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 88.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.48863636973214d + "'", double1 == 4.48863636973214d);
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        double double1 = org.apache.commons.math.util.FastMath.cosh(99.95436267781281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.28409796425857E43d + "'", double1 == 1.28409796425857E43d);
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7658368273288395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931404284793072d + "'", double1 == 0.6931404284793072d);
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        double double2 = org.apache.commons.math.util.FastMath.min(1.257208982583337d, 5.159449696805132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.257208982583337d + "'", double2 == 1.257208982583337d);
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9251475365964139d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        long long1 = org.apache.commons.math.util.FastMath.round(3373.800624777237d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3374L + "'", long1 == 3374L);
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.333345269621085d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        double double1 = org.apache.commons.math.util.FastMath.sin((-5.073519547246666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9354979560654033d + "'", double1 == 0.9354979560654033d);
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999553501771875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557254786481422d + "'", double1 == 1.557254786481422d);
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1215705721632271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9151715393217529d) + "'", double1 == (-0.9151715393217529d));
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.31048985231669685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        double double1 = org.apache.commons.math.util.FastMath.acos(794.3444567224569d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

