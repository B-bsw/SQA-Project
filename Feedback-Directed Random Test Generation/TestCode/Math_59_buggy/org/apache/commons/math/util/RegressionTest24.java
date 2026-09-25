package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

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
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9036922050915037d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0019033590633418204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0019033613618278193d + "'", double1 == 0.0019033613618278193d);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9516746866399276d), (-3.6478005095231385d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6478005095231385d) + "'", double2 == (-3.6478005095231385d));
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3827395580671282d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5293379817722996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4248349501142075d + "'", double1 == 0.4248349501142075d);
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1650292235158622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0136482556216875d + "'", double1 == 1.0136482556216875d);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.037807848611429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.234395688650514d + "'", double1 == 1.234395688650514d);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5524262636095455d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5247541376602676d) + "'", double1 == (-0.5247541376602676d));
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.0896545917828711d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        long long1 = org.apache.commons.math.util.FastMath.round((-3.1762777305546113d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.14595315667793862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9259299443872359E-34d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.46297836831268596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5887989736417516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9412241963654839d + "'", double1 == 0.9412241963654839d);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8267569045751701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2054747075950174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.019473243773419d + "'", double1 == 1.019473243773419d);
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        int int2 = org.apache.commons.math.util.FastMath.max(88, 208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 208 + "'", int2 == 208);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        double double2 = org.apache.commons.math.util.FastMath.pow((-3.719590361169149d), (-2.6416568898277903d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        double double1 = org.apache.commons.math.util.FastMath.asin(57.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6296611237943861d, 0.02641081871667966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9878573789612174d + "'", double2 == 0.9878573789612174d);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 18, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        int int2 = org.apache.commons.math.util.FastMath.max(18, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.05625771078525112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0562280776835805d + "'", double1 == 0.0562280776835805d);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3195709533072597d + "'", double1 == 0.3195709533072597d);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9225054328816626E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3881317890172014E-21d + "'", double1 == 3.3881317890172014E-21d);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        float float2 = org.apache.commons.math.util.FastMath.max(2.4051712E9f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 5.0772058E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0772058E16f + "'", float2 == 5.0772058E16f);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5876803459339235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.675074442256637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2222642564342365d + "'", double1 == 7.2222642564342365d);
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5698603924331294d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3299302472020562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.19939021146808d + "'", double1 == 76.19939021146808d);
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.45013943973911846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4832270541164472d + "'", double1 == 0.4832270541164472d);
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6625147656574195d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.02077447867535781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020772984402938136d + "'", double1 == 0.020772984402938136d);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 38, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.4825777280150008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3949028548792195d + "'", double1 == 0.3949028548792195d);
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5415833237027999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5415833237028d + "'", double1 == 0.5415833237028d);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.477336814478207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 256.5325029281497d + "'", double1 == 256.5325029281497d);
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1123.372703893139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.047478595403964284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5901750099221728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.81453724263198d + "'", double1 == 33.81453724263198d);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1811276859692623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8682511937248917d + "'", double1 == 0.8682511937248917d);
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.092046153706293E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.8428599996679606E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.006929673254199679d, 3.9529619711981727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.913531011175185E-9d + "'", double2 == 2.913531011175185E-9d);
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.0805585454182745d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3584059010869395d, 1.1726310973781435d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.35840590108693954d + "'", double2 == 0.35840590108693954d);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        float float2 = org.apache.commons.math.util.FastMath.min(9.7864802E10f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0272763001493514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.16571020934276798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16724385078247328d + "'", double1 == 0.16724385078247328d);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3265.0000000000005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.98500007761487d + "'", double1 == 56.98500007761487d);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999924632254483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.244429828962812d + "'", double1 == 6.244429828962812d);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9980595798433141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.1846016276221d + "'", double1 == 57.1846016276221d);
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5054239130833369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3967502042642406d) + "'", double1 == (-0.3967502042642406d));
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8646887382670995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9526936435579973d + "'", double1 == 0.9526936435579973d);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.026036584087129624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026039526701044122d + "'", double1 == 0.026039526701044122d);
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5292064628230686d, 3.3881317890172014E-21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5292064628230684d + "'", double2 == 1.5292064628230684d);
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8685646297050478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853178872007314d) + "'", double1 == (-0.7853178872007314d));
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3877277521741615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9257705537109344d + "'", double1 == 0.9257705537109344d);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5843980649389331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.102050415563806E69d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.102050415563806E69d + "'", double1 == 7.102050415563806E69d);
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        long long1 = org.apache.commons.math.util.FastMath.round(0.24673403229618204d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0424543400597124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3211090992020038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3211090992020038d + "'", double1 == 1.3211090992020038d);
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        long long2 = org.apache.commons.math.util.FastMath.min(70368744177664L, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3333452696210846d, (-0.39857533900047715d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8612701053336018d + "'", double2 == 1.8612701053336018d);
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        double double2 = org.apache.commons.math.util.FastMath.max(0.46376691716139407d, 1.018315125977104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.018315125977104d + "'", double2 == 1.018315125977104d);
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 252318064, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318064L + "'", long2 == 252318064L);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.545676718844663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1479927738667195d + "'", double1 == 2.1479927738667195d);
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-7));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.118819655545162E-4d + "'", double1 == 9.118819655545162E-4d);
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        double double2 = org.apache.commons.math.util.FastMath.pow(116.29021260843672d, 0.01151190223831367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0562782347418378d + "'", double2 == 1.0562782347418378d);
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4181620688734913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) 2979L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2979.0f + "'", float2 == 2979.0f);
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        double double1 = org.apache.commons.math.util.FastMath.acosh(137.34414422946176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.61562370482875d + "'", double1 == 5.61562370482875d);
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.184705528587072E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1539819417261585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8567638683085653d + "'", double1 == 0.8567638683085653d);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1685366493835514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06764233793101719d + "'", double1 == 0.06764233793101719d);
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        double double2 = org.apache.commons.math.util.FastMath.pow(59.92148128532128d, 2.7209682685497256d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 68666.62279495456d + "'", double2 == 68666.62279495456d);
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4711270153964662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.291903030389681d + "'", double1 == 2.291903030389681d);
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.551648944791524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.90293582248201d + "'", double1 == 88.90293582248201d);
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6146089504495703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        double double2 = org.apache.commons.math.util.FastMath.atan2(630983.1159256954d, 0.9802576824651942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707947732546232d + "'", double2 == 1.5707947732546232d);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        float float2 = org.apache.commons.math.util.FastMath.min(573.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0250132137771875d, 0.1518086555466036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4959695450457575d + "'", double2 == 1.4959695450457575d);
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7611452618032624d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.411320617819579d, 0.7304003084084858d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2861352674645237d + "'", double2 == 1.2861352674645237d);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6931404284793072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931404284793073d + "'", double1 == 0.6931404284793073d);
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        double double1 = org.apache.commons.math.util.FastMath.log(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2684529660545276d + "'", double1 == 1.2684529660545276d);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.5706008419460695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0038284389445293d) + "'", double1 == (-1.0038284389445293d));
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.15122623336946336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16325979649867572d + "'", double1 == 0.16325979649867572d);
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.8271614989766833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.12246868058081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.115997069138992d + "'", double1 == 4.115997069138992d);
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1529211698783688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.815532388198284d) + "'", double1 == (-0.815532388198284d));
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        double double2 = org.apache.commons.math.util.FastMath.min(0.02109732960109633d, 1.3153778949771764d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02109732960109633d + "'", double2 == 0.02109732960109633d);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, (long) 252318064);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318064L + "'", long2 == 252318064L);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.1428830338846818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5227895377286519d) + "'", double1 == (-0.5227895377286519d));
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        double double1 = org.apache.commons.math.util.FastMath.asin(72.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        double double1 = org.apache.commons.math.util.FastMath.signum(54.31009080891797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999860498800671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0585023672546786E-6d) + "'", double1 == (-6.0585023672546786E-6d));
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        double double1 = org.apache.commons.math.util.FastMath.asinh(13.110581167104948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.268018085576361d + "'", double1 == 3.268018085576361d);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.301298902307231d, (-1.3673250405135535d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.31993754771431815d + "'", double2 == 0.31993754771431815d);
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5000715031063323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1447324312919247d + "'", double1 == 1.1447324312919247d);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5573656314890014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.23047784304605d + "'", double1 == 89.23047784304605d);
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.3598729022063691d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9389279919880056d + "'", double1 == 1.9389279919880056d);
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0024588689821368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8831112015908872d + "'", double1 == 0.8831112015908872d);
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6801446119583209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6289054637568178d + "'", double1 == 0.6289054637568178d);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0765822830801347d, 1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267947305d + "'", double2 == 1.5707963267947305d);
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.16143936157126962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16074620394812397d + "'", double1 == 0.16074620394812397d);
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2105, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.15081270044863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5575274776122784d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5914044369322959d) + "'", double1 == (-0.5914044369322959d));
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        long long1 = org.apache.commons.math.util.FastMath.abs(2979L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2979L + "'", long1 == 2979L);
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6090535823208306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9159295540552121d + "'", double1 == 0.9159295540552121d);
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        double double1 = org.apache.commons.math.util.FastMath.log(2.262122178163556E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.35507978448085d + "'", double1 == 35.35507978448085d);
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1350720090231239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.135072009023124d + "'", double1 == 1.135072009023124d);
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5385290260103368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43082678203704855d + "'", double1 == 0.43082678203704855d);
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.646142621210584E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.646142621210586E-8d + "'", double1 == 4.646142621210586E-8d);
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        double double2 = org.apache.commons.math.util.FastMath.max(2.2011692254191186d, (-43.56618709829934d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2011692254191186d + "'", double2 == 2.2011692254191186d);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9651522587201157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8221356055655724d + "'", double1 == 0.8221356055655724d);
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 31, 2979.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1961970956842123d, (-0.18360109522414125d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1961970956842123d + "'", double2 == 1.1961970956842123d);
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.17682829234729394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        float float2 = org.apache.commons.math.util.FastMath.max(26.0f, (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.03510704E-316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.95553826735078E-106d + "'", double1 == 7.95553826735078E-106d);
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.39813660169837595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.811546946998025d + "'", double1 == 22.811546946998025d);
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9592918926262646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6098477665110738d + "'", double1 == 1.6098477665110738d);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7743832799865517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.69927534455855d + "'", double1 == 0.69927534455855d);
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4407748512619138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5403140444367246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5144053249353481d + "'", double1 == 0.5144053249353481d);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.13812646321591882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.137690974559507d + "'", double1 == 0.137690974559507d);
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-6.263184405090835d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        long long2 = org.apache.commons.math.util.FastMath.min(31L, 46L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.4766393240263169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1157594180832158d + "'", double1 == 1.1157594180832158d);
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8835877589816592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7966179335720232d + "'", double1 == 0.7966179335720232d);
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.0605566643729682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8368009637323028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014604932000990343d) + "'", double1 == (-0.014604932000990343d));
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        double double1 = org.apache.commons.math.util.FastMath.log(0.027705053070945427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5861404610918224d) + "'", double1 == (-3.5861404610918224d));
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.1797945711178876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42402189933762574d + "'", double1 == 0.42402189933762574d);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 44.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.530348335326063d + "'", double1 == 3.530348335326063d);
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 573);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9958465871576268d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.190457935876819d, 56.439382198410065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0741110728095127d + "'", double2 == 0.0741110728095127d);
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7162992214244818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.621581484926361d + "'", double1 == 0.621581484926361d);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5574077246549023d), 3.1219390793339943d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5574077246549023d) + "'", double2 == (-1.5574077246549023d));
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3803000710956943d, 1.9771057199762778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9771057199762778d + "'", double2 == 1.9771057199762778d);
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7510946386756716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6358015443055876d + "'", double1 == 0.6358015443055876d);
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        float float2 = org.apache.commons.math.util.FastMath.max(7.0f, (float) 2105L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2105.0f + "'", float2 == 2105.0f);
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        long long2 = org.apache.commons.math.util.FastMath.max(97864804714L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2781825699829986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004855201767862872d + "'", double1 == 0.004855201767862872d);
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        double double2 = org.apache.commons.math.util.FastMath.max(573.0d, 5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 573.0d + "'", double2 == 573.0d);
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8567638683085654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9567633533440579E80d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.653571668725002d + "'", double1 == 8.653571668725002d);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7465662286826749d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9252030414785088d) + "'", double1 == (-0.9252030414785088d));
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 97864804714L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7864802E10f + "'", float2 == 9.7864802E10f);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.486451264704345E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.486450246049692E-4d + "'", double1 == 8.486450246049692E-4d);
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0887482668978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9112536742994843d + "'", double1 == 1.9112536742994843d);
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        long long1 = org.apache.commons.math.util.FastMath.round((-6.0585023672546786E-6d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.348292357453579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8736496294680708d + "'", double1 == 0.8736496294680708d);
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4917863811300067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.454467422037778E-77d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0000446504873581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414951087303602d + "'", double1 == 0.8414951087303602d);
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9786883441146829d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8662233981639d) + "'", double1 == (-0.8662233981639d));
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4436060621143874d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.012522457881223827d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23221834552847842d) + "'", double1 == (-0.23221834552847842d));
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.434905982971384E167d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.2654676519986654d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.0484473319527443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9318862155125696d) + "'", double1 == (-1.9318862155125696d));
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 23L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.01539777269705334d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01539777269705334d + "'", double2 == 0.01539777269705334d);
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
        long long2 = org.apache.commons.math.util.FastMath.min(23L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23L + "'", long2 == 23L);
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2979L, (float) 573);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.0624758151222142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9968718951372059d) + "'", double1 == (-0.9968718951372059d));
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.154434690031884d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.06510909570837217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        int int2 = org.apache.commons.math.util.FastMath.max(44, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5978220919084256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5388165584601314d) + "'", double1 == (-0.5388165584601314d));
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        double double2 = org.apache.commons.math.util.FastMath.min(3.382248583674181E-17d, (double) 21.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.382248583674181E-17d + "'", double2 == 3.382248583674181E-17d);
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5887989736417515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8381511555330426d + "'", double1 == 0.8381511555330426d);
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        long long2 = org.apache.commons.math.util.FastMath.max(70368744177664L, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 70368744177664L + "'", long2 == 70368744177664L);
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.786856877513438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7868568775134381d + "'", double1 == 0.7868568775134381d);
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 26, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.8428599996679606E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.68607828989877E12d + "'", double1 == 1.68607828989877E12d);
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9806829901996237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.520665756794651d + "'", double1 == 1.520665756794651d);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7315511733755106d, 0.9393167815174964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7455603080204268d + "'", double2 == 0.7455603080204268d);
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        long long2 = org.apache.commons.math.util.FastMath.max(2979L, (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2979L + "'", long2 == 2979L);
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9097589647345423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.957234655978707E136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8402862384356652E138d + "'", double1 == 2.8402862384356652E138d);
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.18043044929108396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18142406551130624d) + "'", double1 == (-0.18142406551130624d));
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-6.650437639661919d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.019658508809675648d, 0.5074898020664782d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.038717398466346635d + "'", double2 == 0.038717398466346635d);
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3277366163928728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24067352203077338d + "'", double1 == 0.24067352203077338d);
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.8541015767011735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8541015767011735d + "'", double1 == 3.8541015767011735d);
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.8257883656009093d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6651429140501224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0269315515711845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026575279816992373d + "'", double1 == 0.026575279816992373d);
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.761588719464173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7023923821188396d + "'", double1 == 0.7023923821188396d);
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9983488597987606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        double double1 = org.apache.commons.math.util.FastMath.sin(57.29322126667916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6776435276542403d + "'", double1 == 0.6776435276542403d);
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0034800731177357003d, 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999974d + "'", double2 == 0.9999999999999974d);
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9545943990414508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2105L, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 6061, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        long long2 = org.apache.commons.math.util.FastMath.min(573L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.197664423181247E-5d, 0.9991371441458284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.197664423181249E-5d + "'", double2 == 6.197664423181249E-5d);
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.030591696752983d, 0.02088089633707753d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0343093128552823d + "'", double2 == 1.0343093128552823d);
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0201244245550114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8521731349288452d + "'", double1 == 0.8521731349288452d);
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4450005666942871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3108324944320862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9663992754985742d + "'", double1 == 0.9663992754985742d);
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.7822996259883344d), 1.2879824694293398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7822996259883344d) + "'", double2 == (-1.7822996259883344d));
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
        long long1 = org.apache.commons.math.util.FastMath.round(3.092317685041624d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-1.0129472849435034E-83d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.14811691220162723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5978220919084255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4499918000729172d) + "'", double1 == (-0.4499918000729172d));
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.5677643628300215d + "'", double1 == 5.5677643628300215d);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7158477234221334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7545371877198279d + "'", double1 == 0.7545371877198279d);
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5313592245660101d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.53135922456601d) + "'", double1 == (-0.53135922456601d));
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.009972525083085703d, 0.17597003220072988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009972525083085704d + "'", double2 == 0.009972525083085704d);
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.4039548065783E-38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2676907246789413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2742735649582718d + "'", double1 == 0.2742735649582718d);
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9936794828003057d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5359674386018927d) + "'", double1 == (-1.5359674386018927d));
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.023271265020779454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3333452696210846d + "'", double1 == 1.3333452696210846d);
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        double double1 = org.apache.commons.math.util.FastMath.log1p(56.255807357635064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.047529075851117d + "'", double1 == 4.047529075851117d);
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.4751129460689736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.475112946068973d) + "'", double1 == (-2.475112946068973d));
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.42013128983820774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5741491464259456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.19210241432772d + "'", double1 == 90.19210241432772d);
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7359704175800965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9057274051886361d) + "'", double1 == (-0.9057274051886361d));
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1155899177076454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0562149012902844d + "'", double1 == 1.0562149012902844d);
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8274186954093609d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9744955389015586d) + "'", double1 == (-0.9744955389015586d));
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 23L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.3702770400092708d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3643135933151023d, 0.9896835559265444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.364313593315102d + "'", double2 == 1.364313593315102d);
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3976568654895484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        int int1 = org.apache.commons.math.util.FastMath.abs(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, 24.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8988277953526667d), 1.520665756794651d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8988277953526665d) + "'", double2 == (-0.8988277953526665d));
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-5L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9589242746631385d + "'", double1 == 0.9589242746631385d);
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.708105081693799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029812057645603515d + "'", double1 == 0.029812057645603515d);
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.5311260223141459d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 145L, (float) 50772059364683248L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7373605044683924d, 8.653397151028901d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0850051845495627d + "'", double2 == 0.0850051845495627d);
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.342925101645957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0839685942081654d + "'", double1 == 2.0839685942081654d);
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0031091414242400395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17814068151824805d + "'", double1 == 0.17814068151824805d);
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.08123954526961918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0846306835996808d + "'", double1 == 1.0846306835996808d);
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        double double2 = org.apache.commons.math.util.FastMath.max(0.04813832110931332d, (-1.420029280006169d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04813832110931332d + "'", double2 == 0.04813832110931332d);
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.013564170557528593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013563338773585676d + "'", double1 == 0.013563338773585676d);
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12269");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.8674578744516237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1586536602706285d + "'", double1 == 3.1586536602706285d);
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12270");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.03841421002450886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0384047630569131d + "'", double1 == 0.0384047630569131d);
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12271");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3010525128752803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12272");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7304003084084858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6233101930000114d + "'", double1 == 0.6233101930000114d);
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12273");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.411320617819579d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12274");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9700147524633321d, 0.9834418302543224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9705038571618079d + "'", double2 == 0.9705038571618079d);
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12275");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.685844387060522E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12276");
        double double2 = org.apache.commons.math.util.FastMath.pow(10313.240312354817d, 5.192685234819999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.923053249606733E20d + "'", double2 == 6.923053249606733E20d);
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12277");
        double double2 = org.apache.commons.math.util.FastMath.pow(89.66021682275232d, 0.1729941422876436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.176648615878283d + "'", double2 == 2.176648615878283d);
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12278");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9525849574608642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.048575981774211414d) + "'", double1 == (-0.048575981774211414d));
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12279");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0477128967594869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4995536312753045d + "'", double1 == 0.4995536312753045d);
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12280");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.577721810442024E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.577721810442024E-30d + "'", double1 == 1.577721810442024E-30d);
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12281");
        long long1 = org.apache.commons.math.util.FastMath.round(27.788944546524185d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12282");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6442070736028715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.491868853745365d + "'", double1 == 2.491868853745365d);
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12283");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1584562587899128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.05025126527625d + "'", double1 == 1.05025126527625d);
    }

    @Test
    public void test12284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12284");
        double double1 = org.apache.commons.math.util.FastMath.log1p(208.466140018005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.344562103474065d + "'", double1 == 5.344562103474065d);
    }

    @Test
    public void test12285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12285");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4230598789337311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12286");
        double double1 = org.apache.commons.math.util.FastMath.atanh(75.90575913641077d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12287");
        long long1 = org.apache.commons.math.util.FastMath.round(2.779955530279347d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test12288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12288");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.920960112236651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0567820727841177d + "'", double1 == 1.0567820727841177d);
    }

    @Test
    public void test12289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12289");
        double double2 = org.apache.commons.math.util.FastMath.max(0.02006344741588842d, 1.189207115002721d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.189207115002721d + "'", double2 == 1.189207115002721d);
    }

    @Test
    public void test12290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12290");
        long long2 = org.apache.commons.math.util.FastMath.min(145L, 23L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23L + "'", long2 == 23L);
    }

    @Test
    public void test12291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12291");
        double double1 = org.apache.commons.math.util.FastMath.cos((-371.2416781774396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8609077747453328d + "'", double1 == 0.8609077747453328d);
    }

    @Test
    public void test12292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12292");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0174804374292909d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12293");
        long long1 = org.apache.commons.math.util.FastMath.round(1.559486076253748d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test12294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12294");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0013299769888426d, 32.69314718055993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030618558610310445d + "'", double2 == 0.030618558610310445d);
    }

    @Test
    public void test12295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12295");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0033681607366540358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0033681543683328455d + "'", double1 == 0.0033681543683328455d);
    }

    @Test
    public void test12296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12296");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.798432482299821E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 248.83240878877044d + "'", double1 == 248.83240878877044d);
    }

    @Test
    public void test12297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12297");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999092042625951d, 0.9999994330067817d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999092042625952d + "'", double2 == 0.9999092042625952d);
    }

    @Test
    public void test12298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12298");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.2501327124042694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6300719766628764d + "'", double1 == 0.6300719766628764d);
    }

    @Test
    public void test12299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12299");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4436060621143874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.20150158639695d + "'", double1 == 1.20150158639695d);
    }

    @Test
    public void test12300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12300");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.77640662496864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6801705331156747d + "'", double1 == 1.6801705331156747d);
    }

    @Test
    public void test12301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12301");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.154374381457872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.401823418415869d + "'", double1 == 1.401823418415869d);
    }

    @Test
    public void test12302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12302");
        double double1 = org.apache.commons.math.util.FastMath.atanh(237.46520946276348d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12303");
        double double2 = org.apache.commons.math.util.FastMath.min(7.896296018267967E13d, 1.964851878753161E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.964851878753161E-5d + "'", double2 == 1.964851878753161E-5d);
    }

    @Test
    public void test12304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12304");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1924023244417262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12305");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5234524435626737d), 59.64780396057959d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5234524435626735d) + "'", double2 == (-1.5234524435626735d));
    }

    @Test
    public void test12306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12306");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0790099456648899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07909217553300694d + "'", double1 == 0.07909217553300694d);
    }

    @Test
    public void test12307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12307");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) 6061);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6061L + "'", long2 == 6061L);
    }

    @Test
    public void test12308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12308");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0092570056990897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017614857748268292d + "'", double1 == 0.017614857748268292d);
    }

    @Test
    public void test12309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12309");
        double double1 = org.apache.commons.math.util.FastMath.cos(14.741329353331306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5680729590898163d) + "'", double1 == (-0.5680729590898163d));
    }

    @Test
    public void test12310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12310");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.1243451287244837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12311");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3229163713435177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3229163713435177d + "'", double1 == 1.3229163713435177d);
    }

    @Test
    public void test12312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12312");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.16354719567405981d, 1.6849742439769542d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04731609333806991d + "'", double2 == 0.04731609333806991d);
    }

    @Test
    public void test12313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12313");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 2979L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2979.0f + "'", float2 == 2979.0f);
    }

    @Test
    public void test12314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12314");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9999999999999747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999747d + "'", double1 == 0.9999999999999747d);
    }

    @Test
    public void test12315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12315");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0550944219637926d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12316");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.05847593957153261d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05850927105379495d) + "'", double1 == (-0.05850927105379495d));
    }

    @Test
    public void test12317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12317");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9974964160775457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.711484893675166d + "'", double1 == 2.711484893675166d);
    }

    @Test
    public void test12318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12318");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.33410855904595715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5780212444590226d + "'", double1 == 0.5780212444590226d);
    }

    @Test
    public void test12319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12319");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.4647579066758625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.464757906675863d + "'", double1 == 3.464757906675863d);
    }

    @Test
    public void test12320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12320");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.01773703268867599d, 1.1624471770240332d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009213329913378736d + "'", double2 == 0.009213329913378736d);
    }

    @Test
    public void test12321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12321");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.36233071379136494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3091969930773629d + "'", double1 == 0.3091969930773629d);
    }

    @Test
    public void test12322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12322");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.12466504278665175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.142780804492972d + "'", double1 == 7.142780804492972d);
    }

    @Test
    public void test12323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12323");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 18L, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test12324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12324");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.1529211698783688d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12325");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2369623959457474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2369623959457476d + "'", double1 == 1.2369623959457476d);
    }

    @Test
    public void test12326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12326");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.186439588236026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03816056971066773d + "'", double1 == 0.03816056971066773d);
    }

    @Test
    public void test12327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12327");
        double double2 = org.apache.commons.math.util.FastMath.max(4.9680578953622686E232d, 474.8705346675522d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9680578953622686E232d + "'", double2 == 4.9680578953622686E232d);
    }

    @Test
    public void test12328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12328");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2256606743523214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12329");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.993222845712074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932228457120744d + "'", double1 == 2.9932228457120744d);
    }

    @Test
    public void test12330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12330");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5212327146899054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8672060090250945d + "'", double1 == 0.8672060090250945d);
    }

    @Test
    public void test12331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12331");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0772058E16f, (float) (-7L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test12332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12332");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8612696487393387E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12333");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.15162623805801723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3893921391836477d + "'", double1 == 0.3893921391836477d);
    }

    @Test
    public void test12334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12334");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.40783004104969306d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39661827653839765d) + "'", double1 == (-0.39661827653839765d));
    }

    @Test
    public void test12335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12335");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.48727747834274504d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1210874014888992d + "'", double1 == 1.1210874014888992d);
    }

    @Test
    public void test12336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12336");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5680729590898163d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12337");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.0636613312976665E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.077935669463161E-28d + "'", double1 == 8.077935669463161E-28d);
    }

    @Test
    public void test12338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12338");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, (long) 208);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 208L + "'", long2 == 208L);
    }

    @Test
    public void test12339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12339");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5011863400790127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12340");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.789780828580952E73d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 169.42101997711706d + "'", double1 == 169.42101997711706d);
    }

    @Test
    public void test12341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12341");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.08715591099014713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08704594486757403d) + "'", double1 == (-0.08704594486757403d));
    }

    @Test
    public void test12342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12342");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6723323011208732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011734412322069199d + "'", double1 == 0.011734412322069199d);
    }

    @Test
    public void test12343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12343");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(30.980369973160098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.566001255224445d + "'", double1 == 5.566001255224445d);
    }

    @Test
    public void test12344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12344");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5756219247526232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12345");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12346");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1685366493835512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12347");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4794572327333977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39167528587283384d + "'", double1 == 0.39167528587283384d);
    }

    @Test
    public void test12348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12348");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.14352199719731384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1430297799195695d) + "'", double1 == (-0.1430297799195695d));
    }

    @Test
    public void test12349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12349");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7133601908261946d), 0.2981237180183044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7133601908261946d) + "'", double2 == (-0.7133601908261946d));
    }

    @Test
    public void test12350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12350");
        double double1 = org.apache.commons.math.util.FastMath.cos(100.51992632180419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999390753501719d + "'", double1 == 0.9999390753501719d);
    }

    @Test
    public void test12351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12351");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2976454463101708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29764544631017087d + "'", double1 == 0.29764544631017087d);
    }

    @Test
    public void test12352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12352");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6929693744344996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9925461516413221d + "'", double1 == 0.9925461516413221d);
    }

    @Test
    public void test12353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12353");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.01745650316761996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12354");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 22025L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test12355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12355");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.301298902307231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4756716789398359d + "'", double1 == 1.4756716789398359d);
    }

    @Test
    public void test12356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12356");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.203690117036716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6236306936974761d + "'", double1 == 0.6236306936974761d);
    }

    @Test
    public void test12357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12357");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9373799744831653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test12358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12358");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.03677484159688882d, 0.01151190223831367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9626906663078043d + "'", double2 == 0.9626906663078043d);
    }

    @Test
    public void test12359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12359");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.048586396335614665d + "'", double1 == 0.048586396335614665d);
    }

    @Test
    public void test12360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12360");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test12361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12361");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8373830985134536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.742893887782155d + "'", double1 == 0.742893887782155d);
    }

    @Test
    public void test12362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12362");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9698463103929542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.984807753012208d + "'", double1 == 0.984807753012208d);
    }

    @Test
    public void test12363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12363");
        long long1 = org.apache.commons.math.util.FastMath.round(1.076731389884332d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12364");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6245173869567006d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12365");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2821188025582245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28587607751715355d + "'", double1 == 0.28587607751715355d);
    }

    @Test
    public void test12366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12366");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.485207247472973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12367");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0002899837490977d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test12368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12368");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6277335322511155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5605625869463581d + "'", double1 == 0.5605625869463581d);
    }

    @Test
    public void test12369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12369");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 8L, (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test12370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12370");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04640300046199763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046436349132154164d + "'", double1 == 0.046436349132154164d);
    }

    @Test
    public void test12371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12371");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.1577059034868376E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1577059043511633E-10d + "'", double1 == 4.1577059043511633E-10d);
    }

    @Test
    public void test12372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12372");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.16227766016838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.16227766016838d + "'", double1 == 3.16227766016838d);
    }

    @Test
    public void test12373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12373");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.18360109522414125d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18360109522414123d) + "'", double1 == (-0.18360109522414123d));
    }

    @Test
    public void test12374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12374");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.9304472369983396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test12375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12375");
        int int2 = org.apache.commons.math.util.FastMath.max(57, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test12376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12376");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8522390299521388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9231679316094872d + "'", double1 == 0.9231679316094872d);
    }

    @Test
    public void test12377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12377");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5990573688262014E224d, 0.9337643921132144d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.257276807732676E209d + "'", double2 == 2.257276807732676E209d);
    }

    @Test
    public void test12378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12378");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test12379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12379");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7868568775134381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10410425488203659d) + "'", double1 == (-0.10410425488203659d));
    }

    @Test
    public void test12380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12380");
        double double1 = org.apache.commons.math.util.FastMath.log(2.9359323643709385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0770250738285216d + "'", double1 == 1.0770250738285216d);
    }

    @Test
    public void test12381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12381");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.12564729781709583d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12382");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1448.1546878700494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1448.1546878700497d + "'", double1 == 1448.1546878700497d);
    }

    @Test
    public void test12383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12383");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4677992676220695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4677992676220695d + "'", double1 == 1.4677992676220695d);
    }

    @Test
    public void test12384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12384");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8001550844245482d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12385");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test12386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12386");
        double double2 = org.apache.commons.math.util.FastMath.atan2(79.49946532142216d, 1.2184249125858766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5554713240230669d + "'", double2 == 1.5554713240230669d);
    }

    @Test
    public void test12387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12387");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7198644879044633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0541548289568423d + "'", double1 == 2.0541548289568423d);
    }

    @Test
    public void test12388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12388");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5247541376602676d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.549171227933197d) + "'", double1 == (-0.549171227933197d));
    }

    @Test
    public void test12389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12389");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.022989228293811562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test12390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12390");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8492219606876473d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8919464619152244d) + "'", double1 == (-1.8919464619152244d));
    }

    @Test
    public void test12391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12391");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5638998844065481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12392");
        double double1 = org.apache.commons.math.util.FastMath.asin(1261966.9999996033d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12393");
        double double2 = org.apache.commons.math.util.FastMath.min(9.786480471441937E10d, 1.712891454807323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.712891454807323d + "'", double2 == 1.712891454807323d);
    }

    @Test
    public void test12394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12394");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7763127943644386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12395");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.019473243773419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12396");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7603734074051979d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.532508170497069d) + "'", double1 == (-0.532508170497069d));
    }

    @Test
    public void test12397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12397");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800076512800236d + "'", double1 == 0.011800076512800236d);
    }

    @Test
    public void test12398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12398");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test12399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12399");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1478035149914898d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12400");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2073193467367487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2073193467367487d + "'", double1 == 1.2073193467367487d);
    }

    @Test
    public void test12401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12401");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0027856622314566606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002785655025990363d + "'", double1 == 0.002785655025990363d);
    }

    @Test
    public void test12402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12402");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.23952769265148452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24427299786223713d + "'", double1 == 0.24427299786223713d);
    }

    @Test
    public void test12403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12403");
        int int2 = org.apache.commons.math.util.FastMath.min(38, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12404");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.14436016288910883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1553001298352472d + "'", double1 == 1.1553001298352472d);
    }

    @Test
    public void test12405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12405");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test12406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12406");
        double double1 = org.apache.commons.math.util.FastMath.cosh(64.00846211951401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.144067765084785E27d + "'", double1 == 3.144067765084785E27d);
    }

    @Test
    public void test12407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12407");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.028961339866994493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6593625434227572d + "'", double1 == 1.6593625434227572d);
    }

    @Test
    public void test12408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12408");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.396067466391991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1635662297792864d + "'", double1 == 1.1635662297792864d);
    }

    @Test
    public void test12409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12409");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.04753219147216658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047568020491626006d + "'", double1 == 0.047568020491626006d);
    }

    @Test
    public void test12410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12410");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.023542003793204997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023542003793204997d + "'", double1 == 0.023542003793204997d);
    }

    @Test
    public void test12411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12411");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.15085983358142951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0114009426539916d + "'", double1 == 1.0114009426539916d);
    }

    @Test
    public void test12412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12412");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8030064940059782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.232242072380867d + "'", double1 == 2.232242072380867d);
    }

    @Test
    public void test12413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12413");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.583398179910364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6675988327616476d + "'", double1 == 0.6675988327616476d);
    }

    @Test
    public void test12414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12414");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.999470683622238d, 0.005282073904701802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.999470683622237d + "'", double2 == 7.999470683622237d);
    }

    @Test
    public void test12415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12415");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.9727794501544427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47316269018916124d + "'", double1 == 0.47316269018916124d);
    }

    @Test
    public void test12416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12416");
        long long2 = org.apache.commons.math.util.FastMath.min(28L, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21L + "'", long2 == 21L);
    }

    @Test
    public void test12417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12417");
        double double2 = org.apache.commons.math.util.FastMath.max(4.444306073422251E59d, (-0.9862108565452042d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444306073422251E59d + "'", double2 == 4.444306073422251E59d);
    }

    @Test
    public void test12418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12418");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9966529754586305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test12419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12419");
        double double1 = org.apache.commons.math.util.FastMath.cosh(65.16375280274023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.982245962441371E27d + "'", double1 == 9.982245962441371E27d);
    }

    @Test
    public void test12420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12420");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2863121968974662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.041268096879679d + "'", double1 == 1.041268096879679d);
    }

    @Test
    public void test12421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12421");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.7923701627780075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7956130199809311d) + "'", double1 == (-0.7956130199809311d));
    }

    @Test
    public void test12422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12422");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9189065459251122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5065480956939856d + "'", double1 == 2.5065480956939856d);
    }

    @Test
    public void test12423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12423");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test12424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12424");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 31, (float) 3374L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test12425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12425");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5695141467684478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8288987896501194d) + "'", double1 == (-0.8288987896501194d));
    }

    @Test
    public void test12426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12426");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5486825246672982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.43719295601887d + "'", double1 == 31.43719295601887d);
    }

    @Test
    public void test12427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12427");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.979079474234486E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test12428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12428");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5702138421394163d, 0.8486310513737183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4665494919090376d + "'", double2 == 1.4665494919090376d);
    }

    @Test
    public void test12429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12429");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.833262585529406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9410093976343895d + "'", double1 == 0.9410093976343895d);
    }

    @Test
    public void test12430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12430");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.0129472849435034E-83d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0129472849435034E-83d) + "'", double1 == (-1.0129472849435034E-83d));
    }

    @Test
    public void test12431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12431");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.002941815253766312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0029418237402383954d + "'", double1 == 0.0029418237402383954d);
    }

    @Test
    public void test12432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12432");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.809784758817255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9927738000811871d + "'", double1 == 0.9927738000811871d);
    }

    @Test
    public void test12433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12433");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test12434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12434");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.842859999667966E24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test12435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12435");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8721925418312972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7172377208137243d + "'", double1 == 0.7172377208137243d);
    }

    @Test
    public void test12436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12436");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.848062556598485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.335118306887265d + "'", double1 == 1.335118306887265d);
    }

    @Test
    public void test12437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12437");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999939085675996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12438");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.0038284389445293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7631973198765565d) + "'", double1 == (-0.7631973198765565d));
    }

    @Test
    public void test12439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12439");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.04395847663815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4297730640216535d + "'", double1 == 1.4297730640216535d);
    }

    @Test
    public void test12440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12440");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.28858290004402326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6608306804495031d + "'", double1 == 0.6608306804495031d);
    }

    @Test
    public void test12441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12441");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.877008724326435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12442");
        long long2 = org.apache.commons.math.util.FastMath.max(70368744177664L, (long) 208);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 70368744177664L + "'", long2 == 70368744177664L);
    }

    @Test
    public void test12443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12443");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.010703208866066098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560092913560715d + "'", double1 == 1.560092913560715d);
    }

    @Test
    public void test12444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12444");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4181620688734913d, 0.9189065459251123d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.418162068873491d + "'", double2 == 1.418162068873491d);
    }

    @Test
    public void test12445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12445");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.605056010682738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01056021954539576d + "'", double1 == 0.01056021954539576d);
    }

    @Test
    public void test12446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12446");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 9.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4121184852417566d + "'", double1 == 0.4121184852417566d);
    }

    @Test
    public void test12447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12447");
        double double1 = org.apache.commons.math.util.FastMath.sin((-42.13742894001701d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9626768102829836d + "'", double1 == 0.9626768102829836d);
    }

    @Test
    public void test12448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12448");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7291547992158472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12449");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0463693213253177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04532638298569164d + "'", double1 == 0.04532638298569164d);
    }

    @Test
    public void test12450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12450");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9820976136448372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8686578642190482d + "'", double1 == 0.8686578642190482d);
    }

    @Test
    public void test12451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12451");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7972957247486471d, 1.058283143422131d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7868383278417456d + "'", double2 == 0.7868383278417456d);
    }

    @Test
    public void test12452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12452");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.226651359933871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.653770797665783d + "'", double1 == 1.653770797665783d);
    }

    @Test
    public void test12453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12453");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9944105305785783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4650165156335162d + "'", double1 == 1.4650165156335162d);
    }

    @Test
    public void test12454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12454");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8192337173071638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8192337173071639d + "'", double1 == 0.8192337173071639d);
    }

    @Test
    public void test12455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12455");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test12456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12456");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7476026429360669d, 0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7476026429360669d + "'", double2 == 0.7476026429360669d);
    }

    @Test
    public void test12457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12457");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7740624720562873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013509938753508815d) + "'", double1 == (-0.013509938753508815d));
    }

    @Test
    public void test12458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12458");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1732760697622087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15979989557099752d + "'", double1 == 0.15979989557099752d);
    }

    @Test
    public void test12459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12459");
        double double1 = org.apache.commons.math.util.FastMath.tan(1261968.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35843456579816485d) + "'", double1 == (-0.35843456579816485d));
    }

    @Test
    public void test12460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12460");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7459634284910276d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12461");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2668250024125176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7151743879062039d + "'", double1 == 0.7151743879062039d);
    }

    @Test
    public void test12462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12462");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6865874069331717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37602173932515726d) + "'", double1 == (-0.37602173932515726d));
    }

    @Test
    public void test12463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12463");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-5), 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test12464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12464");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.2654676519986654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test12465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12465");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4817567395291671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7839275601243316d + "'", double1 == 0.7839275601243316d);
    }

    @Test
    public void test12466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12466");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.027726343135365997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027722791925532463d + "'", double1 == 0.027722791925532463d);
    }

    @Test
    public void test12467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12467");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.05198617759458842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05193939619831631d + "'", double1 == 0.05193939619831631d);
    }

    @Test
    public void test12468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12468");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.17453292512124874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9848077530257846d + "'", double1 == 0.9848077530257846d);
    }

    @Test
    public void test12469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12469");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557647d) + "'", double1 == (-0.7615941559557647d));
    }

    @Test
    public void test12470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12470");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.9932228457120744d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12471");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.70197740328915E-38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1684043449710089E-19d + "'", double1 == 2.1684043449710089E-19d);
    }

    @Test
    public void test12472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12472");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test12473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12473");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.016946089057078072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016804105884637304d + "'", double1 == 0.016804105884637304d);
    }

    @Test
    public void test12474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12474");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.560092913560715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7592634247064667d + "'", double1 == 3.7592634247064667d);
    }

    @Test
    public void test12475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12475");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.653571668725002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.847763999241344d + "'", double1 == 2.847763999241344d);
    }

    @Test
    public void test12476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12476");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 52L, 0.9999999999816658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999816658d + "'", double2 == 0.9999999999816658d);
    }

    @Test
    public void test12477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12477");
        double double1 = org.apache.commons.math.util.FastMath.cosh(13.522442286918901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 372985.605362843d + "'", double1 == 372985.605362843d);
    }

    @Test
    public void test12478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12478");
        double double1 = org.apache.commons.math.util.FastMath.sinh(38.03171900616457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6441283045187972E16d + "'", double1 == 1.6441283045187972E16d);
    }

    @Test
    public void test12479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12479");
        double double1 = org.apache.commons.math.util.FastMath.floor(3266.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3266.0d + "'", double1 == 3266.0d);
    }

    @Test
    public void test12480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12480");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.05025126527625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.85836923677614d + "'", double1 == 1.85836923677614d);
    }

    @Test
    public void test12481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12481");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.02724670575710512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16506576191659225d + "'", double1 == 0.16506576191659225d);
    }

    @Test
    public void test12482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12482");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.142219984543288E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715196218E-14d + "'", double1 == 1.4210854715196218E-14d);
    }

    @Test
    public void test12483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12483");
        double double1 = org.apache.commons.math.util.FastMath.atan(97.11079348211254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560499174232234d + "'", double1 == 1.560499174232234d);
    }

    @Test
    public void test12484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12484");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) ' ', 0.9992931288863935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5395785615511952d + "'", double2 == 1.5395785615511952d);
    }

    @Test
    public void test12485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12485");
        double double1 = org.apache.commons.math.util.FastMath.sin(809.0886869668323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9917451453082339d) + "'", double1 == (-0.9917451453082339d));
    }

    @Test
    public void test12486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12486");
        double double1 = org.apache.commons.math.util.FastMath.log(185.47866641176898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.222939869567334d + "'", double1 == 5.222939869567334d);
    }

    @Test
    public void test12487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12487");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1416876847493498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12488");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6149142306722746d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6622771995498022d) + "'", double1 == (-0.6622771995498022d));
    }

    @Test
    public void test12489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12489");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.822285085872435d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6805486965870974d + "'", double1 == 0.6805486965870974d);
    }

    @Test
    public void test12490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12490");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test12491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12491");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test12492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12492");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5255815002652741d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12493");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.602750627100152d), 2.8271614989766833d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.21005498467852518d) + "'", double2 == (-0.21005498467852518d));
    }

    @Test
    public void test12494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12494");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8435037267365852d, 1.3036378347354873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2197475989877318d + "'", double2 == 2.2197475989877318d);
    }

    @Test
    public void test12495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12495");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (-3L), 1.9835078296932542d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0d) + "'", double2 == (-3.0d));
    }

    @Test
    public void test12496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12496");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000000000047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000047d + "'", double1 == 1.0000000000000047d);
    }

    @Test
    public void test12497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12497");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.46637207480363707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4834631014271604d) + "'", double1 == (-0.4834631014271604d));
    }

    @Test
    public void test12498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12498");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 14L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6390573296152584d + "'", double1 == 2.6390573296152584d);
    }

    @Test
    public void test12499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12499");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8251802222449077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6016787340738233d + "'", double1 == 0.6016787340738233d);
    }

    @Test
    public void test12500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12500");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.46104697186111915d, 0.7342532423748005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5606911349445465d + "'", double2 == 0.5606911349445465d);
    }
}

