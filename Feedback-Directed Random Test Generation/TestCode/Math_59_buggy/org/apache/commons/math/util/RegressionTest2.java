package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.3078511907005352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1752011936438014d, 0.986746382996133d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.986746382996133d + "'", double2 == 0.986746382996133d);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.1606074732651916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1261967.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261967.0000000002d + "'", double1 == 1261967.0000000002d);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1155899177076452d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.1205702641807171d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        double double1 = org.apache.commons.math.util.FastMath.tanh(99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.1664909604641016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1672611943505358d + "'", double1 == 0.1672611943505358d);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.267831587699267d, 2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 144.54565322796893d + "'", double2 == 144.54565322796893d);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        double double2 = org.apache.commons.math.util.FastMath.pow(14.741328744640542d, 0.12217304763960307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3891965034627198d + "'", double2 == 1.3891965034627198d);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.338474404104274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.226651359933871d + "'", double1 == 4.226651359933871d);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.875409442231813E-18d + "'", double1 == 3.875409442231813E-18d);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941542245016d + "'", double1 == 0.7615941542245016d);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999999d + "'", double1 == 0.9999999999999999d);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8964711396507173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7811284620871498d) + "'", double1 == (-0.7811284620871498d));
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.0889074357665707d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        double double1 = org.apache.commons.math.util.FastMath.log(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.999470683622238d + "'", double1 == 7.999470683622238d);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.025676021633806945d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.616441887145511E102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) 573L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        int int2 = org.apache.commons.math.util.FastMath.min(26, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9225054334737986E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0963506817327155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03994949099270701d + "'", double1 == 0.03994949099270701d);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8184464592320673d, (-0.7603734074051981d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6346446623333779d + "'", double2 == 0.6346446623333779d);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1593781051128063d + "'", double1 == 1.1593781051128063d);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.78648047144194E10d, 1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.786480471441939E10d + "'", double2 == 9.786480471441939E10d);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        double double2 = org.apache.commons.math.util.FastMath.min(0.34668423136158d, (-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-57.29577951308232d) + "'", double2 == (-57.29577951308232d));
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.19240232444172617d, (-0.0850005042632922d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9867978813066445d + "'", double2 == 1.9867978813066445d);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        float float1 = org.apache.commons.math.util.FastMath.abs(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.16646964819512283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5501042757606859d + "'", double1 == 0.5501042757606859d);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015840768241279675d + "'", double1 == 0.015840768241279675d);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.253522697326158d + "'", double1 == 4.253522697326158d);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.7897808285809945E73d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.156119580207157E36d + "'", double1 == 6.156119580207157E36d);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        long long1 = org.apache.commons.math.util.FastMath.abs(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.786480471441937E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14317511632530183d + "'", double1 == 0.14317511632530183d);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999959038668202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403057526408277d + "'", double1 == 0.5403057526408277d);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        double double1 = org.apache.commons.math.util.FastMath.log1p(144.54565322796893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.980489805286518d + "'", double1 == 4.980489805286518d);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5988224392024553d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9251475365964139d), 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9251475365964139d) + "'", double2 == (-0.9251475365964139d));
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0850005042632922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.995592469141819E14d + "'", double1 == 2.995592469141819E14d);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        double double1 = org.apache.commons.math.util.FastMath.log1p(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9459101490553132d + "'", double1 == 1.9459101490553132d);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.317069759957247d + "'", double1 == 1.317069759957247d);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0486237723781806d, 3.3541424281629695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1726310973781435d + "'", double2 == 1.1726310973781435d);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1593781051128063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4371344463413933d + "'", double1 == 1.4371344463413933d);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5395564933646284d + "'", double1 == 1.5395564933646284d);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        double double1 = org.apache.commons.math.util.FastMath.cosh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7453292519943293d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7453292519943293d + "'", double2 == 1.7453292519943293d);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        long long2 = org.apache.commons.math.util.FastMath.min(26L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        double double1 = org.apache.commons.math.util.FastMath.asin(22025.465794806718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.7543545188936296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4078300410496931d) + "'", double1 == (-0.4078300410496931d));
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6146685600490525d + "'", double1 == 4.6146685600490525d);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.9624960684073707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.34620097980911d + "'", double1 == 19.34620097980911d);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1373220393635d, 3.9702919135521215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1373220393635002d + "'", double2 == 1.1373220393635002d);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 2147483647, 7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836470000002E9d + "'", double2 == 2.1474836470000002E9d);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.01661243639878233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.009972194509427618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009972525083085703d + "'", double1 == 0.009972525083085703d);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16393750213817188d + "'", double1 == 0.16393750213817188d);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.14317511632530183d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.08883176481419076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.3643047812382505d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.435597088531952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.0643321090394411d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0643321090394411d) + "'", double2 == (-0.0643321090394411d));
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4669214877224426d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        double double2 = org.apache.commons.math.util.FastMath.min(100.0d, (-0.3643047812382505d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3643047812382505d) + "'", double2 == (-0.3643047812382505d));
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.993222845712074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05224159390358993d + "'", double1 == 0.05224159390358993d);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        double double2 = org.apache.commons.math.util.FastMath.min(0.04747861148694368d, 3.355404970159859E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.355404970159859E-7d + "'", double2 == 3.355404970159859E-7d);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.0643321090394411d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        double double1 = org.apache.commons.math.util.FastMath.log10(26.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.414973347970818d + "'", double1 == 1.414973347970818d);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9867978813066445d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9756139057433201d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        double double1 = org.apache.commons.math.util.FastMath.log(2.993222845712074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0963506817327158d + "'", double1 == 1.0963506817327158d);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0961179680051676d + "'", double1 == 1.0961179680051676d);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        double double2 = org.apache.commons.math.util.FastMath.max(207.12724888983414d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 207.12724888983414d + "'", double2 == 207.12724888983414d);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.16765036534441544d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        double double1 = org.apache.commons.math.util.FastMath.acosh(11013.232874703392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999995877692d + "'", double1 == 9.999999995877692d);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0486237723781806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0486237723781806d + "'", double1 == 1.0486237723781806d);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836305d + "'", double1 == 3.7621956910836305d);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        double double1 = org.apache.commons.math.util.FastMath.cosh(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8212977905417654E24d + "'", double1 == 3.8212977905417654E24d);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5525884268785043E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        double double1 = org.apache.commons.math.util.FastMath.expm1(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161737E43d + "'", double1 == 2.6881171418161737E43d);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(104.06639041664197d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.06639041664195d + "'", double2 == 104.06639041664195d);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0963506817327158d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        double double1 = org.apache.commons.math.util.FastMath.acos((-57.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.08883176481419076d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-3.848501131276805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9786883441146831d) + "'", double1 == (-0.9786883441146831d));
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.3541424281629695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.281047928335586d + "'", double1 == 1.281047928335586d);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8.893761324052697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8346187642153643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3689877298052193d + "'", double1 == 1.3689877298052193d);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6283429.00742421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.3588589435717465d), 1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.33730966282112745d) + "'", double2 == (-0.33730966282112745d));
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        long long1 = org.apache.commons.math.util.FastMath.round(0.247595209480447d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.3541424281629695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9442157056960554d + "'", double1 == 0.9442157056960554d);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.956763353344058E80d, (-0.6150317436149153d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9567633533440579E80d + "'", double2 == 1.9567633533440579E80d);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        double double1 = org.apache.commons.math.util.FastMath.cos(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3295673951398002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.153068686219429d + "'", double1 == 1.153068686219429d);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9442157056960554d, 1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5412326235096074d + "'", double2 == 0.5412326235096074d);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.0643321090394411d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06424358004527628d) + "'", double1 == (-0.06424358004527628d));
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9964228836762624d + "'", double1 == 0.9964228836762624d);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562596892644d + "'", double1 == 21.487562596892644d);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9999999986258976d, 1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1752011936438014d + "'", double2 == 1.1752011936438014d);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.71827069403746d, 0.42206715285395996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3299302472020562d + "'", double2 == 1.3299302472020562d);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.01661243639878233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.899417119369014E-4d + "'", double1 == 2.899417119369014E-4d);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4669214877224426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4501394397391184d + "'", double1 == 0.4501394397391184d);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5707963267936305d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7615941542245016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2723414711850413d) + "'", double1 == (-0.2723414711850413d));
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8488998154697595d), 0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8488998154697595d) + "'", double2 == (-0.8488998154697595d));
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        double double1 = org.apache.commons.math.util.FastMath.log10(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        double double1 = org.apache.commons.math.util.FastMath.sin(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.893761324052697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8622926809699384d) + "'", double1 == (-0.8622926809699384d));
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.544068044350276d + "'", double1 == 1.544068044350276d);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.964889726830815d + "'", double1 == 18.964889726830815d);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9756139057433201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6808791884039018d + "'", double1 == 0.6808791884039018d);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.1692480936637681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1692480936637681d + "'", double1 == 0.1692480936637681d);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8060294742125208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6784066528087076d + "'", double1 == 0.6784066528087076d);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.02771569143445394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.342925101645957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07579834219123135d + "'", double1 == 0.07579834219123135d);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599210498948732d + "'", double1 == 1.2599210498948732d);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        double double1 = org.apache.commons.math.util.FastMath.abs(11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703395d + "'", double1 == 11013.232874703395d);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        double double1 = org.apache.commons.math.util.FastMath.log(2.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0145502426353863d + "'", double1 == 1.0145502426353863d);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.33730966282112745d), 3.355404970159859E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9867978813066445d, 0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9867978813066445d + "'", double2 == 1.9867978813066445d);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97864804714L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.7864802E10f + "'", float1 == 9.7864802E10f);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        double double1 = org.apache.commons.math.util.FastMath.ceil(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.809784758817254d + "'", double1 == 2.809784758817254d);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5525884268785043E-18d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9459101490553132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6657298105782764d + "'", double1 == 0.6657298105782764d);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        double double1 = org.apache.commons.math.util.FastMath.atan(18.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.518074431338224d + "'", double1 == 1.518074431338224d);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.52587890625E-5d + "'", double1 == 1.52587890625E-5d);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        double double2 = org.apache.commons.math.util.FastMath.min(7.896296018267967E13d, 1.2700305245105663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2700305245105663d + "'", double2 == 1.2700305245105663d);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.806217383937352E-6d + "'", double1 == 4.806217383937352E-6d);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5230140581531376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.866317614445707d + "'", double1 == 0.866317614445707d);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.435597088531952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6430496853696097d + "'", double1 == 1.6430496853696097d);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        double double1 = org.apache.commons.math.util.FastMath.exp((-6.041406849910749d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0023782107733894223d + "'", double1 == 0.0023782107733894223d);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.047478611486943684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.048623772378180656d + "'", double1 == 0.048623772378180656d);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        double double1 = org.apache.commons.math.util.FastMath.sin(31.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.404037645323065d) + "'", double1 == (-0.404037645323065d));
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0461462579250012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8079471069956127d + "'", double1 == 0.8079471069956127d);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999959038668202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.761592435679563d + "'", double1 == 0.761592435679563d);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8079471069956127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8988587803407233d + "'", double1 == 0.8988587803407233d);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0162571141467134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01773703268867599d + "'", double1 == 0.01773703268867599d);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.949874371066198d + "'", double1 == 9.949874371066198d);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.267831587699267d, 8.893761324052697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5347432219246039d + "'", double2 == 0.5347432219246039d);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.404037645323065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.149651841415288d) + "'", double1 == (-23.149651841415288d));
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0963506817327158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222845712074d + "'", double1 == 2.993222845712074d);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.543080634815244d, 0.12217304763960307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4917863811300067d + "'", double2 == 1.4917863811300067d);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1261967.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.741329353331304d + "'", double1 == 14.741329353331304d);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6346446623333779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(88.41160108781288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.402744338107512d + "'", double1 == 9.402744338107512d);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6268604078470186d + "'", double1 == 3.6268604078470186d);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.9567633533440579E80d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8055865251572774E26d + "'", double1 == 5.8055865251572774E26d);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6483608274590842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7054294284722258d + "'", double1 == 0.7054294284722258d);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.653805147100431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9293779356001103d + "'", double1 == 0.9293779356001103d);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.16393750213817188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1518086555466036d + "'", double1 == 0.1518086555466036d);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261911708835171d + "'", double1 == 1.2261911708835171d);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6916735960213485E41d + "'", double1 == 6.6916735960213485E41d);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        double double1 = org.apache.commons.math.util.FastMath.asin(8886110.520507816d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 97);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1416876847493498d + "'", double1 == 1.1416876847493498d);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9567633533440579E80d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.291336409328632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.291336409328633d + "'", double1 == 5.291336409328633d);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1518086555466036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15122623336946334d + "'", double1 == 0.15122623336946334d);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        double double1 = org.apache.commons.math.util.FastMath.ceil(18.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.0d + "'", double1 == 19.0d);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.980489805286518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.980489805286518d + "'", double1 == 4.980489805286518d);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7805951733159243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6751788539128234d + "'", double1 == 0.6751788539128234d);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(32.69314718055993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.69314718055994d + "'", double1 == 32.69314718055994d);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.848501131276805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0572983097976434d) + "'", double1 == (-2.0572983097976434d));
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45158270528864863d + "'", double1 == 0.45158270528864863d);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.00944988413518589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000044650487358d + "'", double1 == 1.000044650487358d);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.2679097686563057d), 1.000044650487358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000044650487358d + "'", double2 == 1.000044650487358d);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        double double2 = org.apache.commons.math.util.FastMath.min(3.130126224133262d, 3.8212977905417654E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.130126224133262d + "'", double2 == 3.130126224133262d);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.027715691434453932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996159448097379d + "'", double1 == 0.9996159448097379d);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7811284620871498d), 9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854776E18d + "'", double2 == 9.223372036854776E18d);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        double double1 = org.apache.commons.math.util.FastMath.exp(99.30685281944007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080844E43d + "'", double1 == 1.3440585709080844E43d);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.073385839060845E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707956194563126d + "'", double1 == 1.5707956194563126d);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707956194563126d, 0.07579834219123135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5225789835263854d + "'", double2 == 1.5225789835263854d);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.524244356327113E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.741374145600744d + "'", double1 == 36.741374145600744d);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.875409442231813E-18d + "'", double1 == 3.875409442231813E-18d);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9996159448097379d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.692955134525155d + "'", double1 == 0.692955134525155d);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1261967.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        double double2 = org.apache.commons.math.util.FastMath.max(2.842859999667966E24d, 0.0023782107733894223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.842859999667966E24d + "'", double2 == 2.842859999667966E24d);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1726310973781435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5794495262170003d + "'", double1 == 0.5794495262170003d);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.16646964819512283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1811276859692623d + "'", double1 == 1.1811276859692623d);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.009494959585376654d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6751788539128234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8772827919571972d + "'", double1 == 0.8772827919571972d);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        double double1 = org.apache.commons.math.util.FastMath.exp(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8845500881248141d) + "'", double1 == (-0.8845500881248141d));
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.577721810442024E-30d + "'", double1 == 1.577721810442024E-30d);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1726310973781435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3877277521741615d + "'", double1 == 0.3877277521741615d);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.3977738256075148d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.735436873328441d) + "'", double1 == (-0.735436873328441d));
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-16.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999747d) + "'", double1 == (-0.9999999999999747d));
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.009494959585376654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6571830710861824E-4d) + "'", double1 == (-1.6571830710861824E-4d));
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.14436016288910877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.271228063367024d) + "'", double1 == (-8.271228063367024d));
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5707956194563126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        double double1 = org.apache.commons.math.util.FastMath.atan(3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570490128690081d + "'", double1 == 1.570490128690081d);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07011222389235412d + "'", double1 == 0.07011222389235412d);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3266.0d + "'", double1 == 3266.0d);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.027715691434453935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027715691434453935d + "'", double1 == 0.027715691434453935d);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.027715691434453935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430770857878007d + "'", double1 == 1.5430770857878007d);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.7621956910836305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836305d + "'", double1 == 3.7621956910836305d);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5412326235096074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5151928326914723d + "'", double1 == 0.5151928326914723d);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        double double1 = org.apache.commons.math.util.FastMath.tanh(88.41160108781288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7453292519943293d, 0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7453292519943293d + "'", double2 == 1.7453292519943293d);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.2722241413791169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7616835171611754d + "'", double1 == 0.7616835171611754d);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.999470683622238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1971657626758088d + "'", double1 == 2.1971657626758088d);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.735436873328441d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.902641160672524d) + "'", double1 == (-0.902641160672524d));
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-36.7368005696771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.736800569677094d) + "'", double1 == (-36.736800569677094d));
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2997277948552883d + "'", double1 == 1.2997277948552883d);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8002419211835452d) + "'", double1 == (-1.8002419211835452d));
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        double double1 = org.apache.commons.math.util.FastMath.asin(151.2644211956603d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.291336409328633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.529835379788728d) + "'", double1 == (-1.529835379788728d));
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0d, 14.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16384.0d + "'", double2 == 16384.0d);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.12217304763960309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1215705721632271d + "'", double1 == 0.1215705721632271d);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2146848510894035E-8d + "'", double1 == 4.2146848510894035E-8d);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9408416071039944d + "'", double1 == 0.9408416071039944d);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4023976994865663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1193272159135788d + "'", double1 == 1.1193272159135788d);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6823165548747481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6823165548747481d + "'", double1 == 0.6823165548747481d);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3266.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.18054648615969d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 97864804714L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7864802E10f + "'", float2 == 9.7864802E10f);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0961179680051676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.046956526320538d + "'", double1 == 1.046956526320538d);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.06424358004527628d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2184249125858766d + "'", double1 == 1.2184249125858766d);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707008595346152d, 0.5988224392024553d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3104642473694204d + "'", double2 == 1.3104642473694204d);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7831978161372731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8657584620020855d + "'", double1 == 0.8657584620020855d);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.291336409328632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.404037645323065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38398225238984507d) + "'", double1 == (-0.38398225238984507d));
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        double double1 = org.apache.commons.math.util.FastMath.exp(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3295673951398002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2848536225107588d + "'", double1 == 0.2848536225107588d);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.786480471441937E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.607240273008231E12d + "'", double1 == 5.607240273008231E12d);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9694911126077237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.748480575315297d + "'", double1 == 0.748480575315297d);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        double double1 = org.apache.commons.math.util.FastMath.sinh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.853398979608905d + "'", double1 == 7.853398979608905d);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1593781051128063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.0d, (-0.8964711396507173d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2885829000440232d + "'", double2 == 0.2885829000440232d);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.0850005042632922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08510319447875853d) + "'", double1 == (-0.08510319447875853d));
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        double double1 = org.apache.commons.math.util.FastMath.sin(14.04818156408044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9960434131864047d + "'", double1 == 0.9960434131864047d);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        double double2 = org.apache.commons.math.util.FastMath.min(4.641588833612779d, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077246549023d + "'", double2 == 1.5574077246549023d);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.281047928335586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2857111204210793d + "'", double1 == 0.2857111204210793d);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0963506817327158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9478899016727291d + "'", double1 == 0.9478899016727291d);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7831978161372731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1061285321866012d) + "'", double1 == (-0.1061285321866012d));
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.8163011534362759d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.04747861148694368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046385953977476656d + "'", double1 == 0.046385953977476656d);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-6.053272382792571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1056495335997729d) + "'", double1 == (-0.1056495335997729d));
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.469446951953614E-18d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1373220393635002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.16375280274023d + "'", double1 == 65.16375280274023d);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3266.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3266.0d + "'", double1 == 3266.0d);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258789063684237E-5d + "'", double1 == 1.5258789063684237E-5d);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        double double1 = org.apache.commons.math.util.FastMath.sinh(13.845300947487887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 515119.2812612585d + "'", double1 == 515119.2812612585d);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3877277521741615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006767125876795721d + "'", double1 == 0.006767125876795721d);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7893750108307106d + "'", double1 == 0.7893750108307106d);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.08510319447875853d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6112949659561453d) + "'", double1 == (-1.6112949659561453d));
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9999103740052037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999103740052037d + "'", double1 == 0.9999103740052037d);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818284590455d + "'", double1 == 2.7182818284590455d);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4023976994865663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        double double2 = org.apache.commons.math.util.FastMath.min(36.741374145600744d, 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2710663101885897d + "'", double2 == 3.2710663101885897d);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308234d + "'", double1 == 57.29577951308234d);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23688540362855587d + "'", double1 == 0.23688540362855587d);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        double double1 = org.apache.commons.math.util.FastMath.acos(26.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.570796326379126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1577059034868376E-10d + "'", double1 == 4.1577059034868376E-10d);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6808791884039018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.45158270528864863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37265448204541224d + "'", double1 == 0.37265448204541224d);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.748066E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9312797787813019d + "'", double1 == 0.9312797787813019d);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003884821853522d + "'", double1 == 1.003884821853522d);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        long long1 = org.apache.commons.math.util.FastMath.round(38.45962336030118d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 38L + "'", long1 == 38L);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.16227766016838d + "'", double1 == 3.16227766016838d);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01153673179946589d + "'", double1 == 0.01153673179946589d);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.050000000000001d + "'", double1 == 5.050000000000001d);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        double double2 = org.apache.commons.math.util.FastMath.max(32.69314718055994d, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854776E18d + "'", double2 == 9.223372036854776E18d);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974484d + "'", double1 == 0.7853981633974484d);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9142469191379081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.38248989944039d + "'", double1 == 52.38248989944039d);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9732324798502845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8267087199189199d + "'", double1 == 0.8267087199189199d);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.82679529269723d) + "'", double1 == (-1.82679529269723d));
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4501394397391184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45013943973911846d + "'", double1 == 0.45013943973911846d);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.31223183389476095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.889566311799566d + "'", double1 == 17.889566311799566d);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.1494681981443936d), (-0.4182755546463937d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.7983904661072323d) + "'", double2 == (-2.7983904661072323d));
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.7616835171611754d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.999470683622238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.77640662496864d + "'", double1 == 2.77640662496864d);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5632046291841053d + "'", double1 == 1.5632046291841053d);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        double double1 = org.apache.commons.math.util.FastMath.sinh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.015955941794861567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.786480471441937E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        long long1 = org.apache.commons.math.util.FastMath.round(2.1544346900318834d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9877735581754346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9877735581754346d + "'", double1 == 1.9877735581754346d);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        double double2 = org.apache.commons.math.util.FastMath.max(3.1558490147807587d, 57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308232d + "'", double2 == 57.29577951308232d);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4694426632156045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.112226704088329d + "'", double1 == 1.112226704088329d);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99484522385717d + "'", double1 == 96.99484522385717d);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.1494681981443936d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9225054335922256E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9225239138463643E-5d + "'", double1 == 1.9225239138463643E-5d);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8622926809699384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3953889504077017d + "'", double1 == 1.3953889504077017d);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5316667212195025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.025618622601251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9513433746520442d) + "'", double1 == (-0.9513433746520442d));
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        double double2 = org.apache.commons.math.util.FastMath.min(97.0d, (-0.00944988413518589d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.00944988413518589d) + "'", double2 == (-0.00944988413518589d));
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.518074431338224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.172148047597968d + "'", double1 == 2.172148047597968d);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1215705721632271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1292690580733946d + "'", double1 == 0.1292690580733946d);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        double double2 = org.apache.commons.math.util.FastMath.max(9.78648047144194E10d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.78648047144194E10d + "'", double2 == 9.78648047144194E10d);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        int int1 = org.apache.commons.math.util.FastMath.round(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1261966.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.230532568900645E7d + "'", double1 == 7.230532568900645E7d);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.16393750213817188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5473008271869906d + "'", double1 == 0.5473008271869906d);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.19006280234111017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1900628023411102d + "'", double1 == 0.1900628023411102d);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5403057526408277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403057526408277d + "'", double1 == 0.5403057526408277d);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(10.206709210579758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17814068151824802d + "'", double1 == 0.17814068151824802d);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0963506817327158d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5430735359421353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996157480444497d + "'", double1 == 0.9996157480444497d);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        int int1 = org.apache.commons.math.util.FastMath.abs(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        long long1 = org.apache.commons.math.util.FastMath.round(144.54565322796893d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 145L + "'", long1 == 145L);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        double double2 = org.apache.commons.math.util.FastMath.min(3.948148009134034E13d, (-3.848501131276805d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.848501131276805d) + "'", double2 == (-3.848501131276805d));
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8997923511366261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6417445913244706d + "'", double1 == 0.6417445913244706d);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9918043161804359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.746594273122733d + "'", double1 == 2.746594273122733d);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        double double1 = org.apache.commons.math.util.FastMath.asin(1261967.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.545750190492393E248d, 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7320508075688772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1292690580733946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-4.8193414259330926E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.819341425933092E-20d) + "'", double1 == (-4.819341425933092E-20d));
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8964711396507173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2679048611920414d) + "'", double1 == (-2.2679048611920414d));
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.009972194509427618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0100220825342237d + "'", double1 == 1.0100220825342237d);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.338474404104274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1020552221563014d + "'", double1 == 1.1020552221563014d);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        double double2 = org.apache.commons.math.util.FastMath.pow(35.0d, 4.463984075193098E74d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.0034360850939669095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034360783325428643d) + "'", double1 == (-0.0034360783325428643d));
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8813735870195429d), (-1.1205702641807171d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4751129460689736d) + "'", double2 == (-2.4751129460689736d));
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5440211108893683d), 0.376727508058575d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0100220825342237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        int int1 = org.apache.commons.math.util.FastMath.round(3.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.930067261567154E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0805490483952224d + "'", double1 == 0.0805490483952224d);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        double double1 = org.apache.commons.math.util.FastMath.log((-8.271228063367024d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8964711396507173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6610060414837631d, 3.130126224133262d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.130126224133262d + "'", double2 == 3.130126224133262d);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 145L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 145 + "'", int1 == 145);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1811276859692623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8278068656280008d + "'", double1 == 0.8278068656280008d);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.1494681981443936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1500253585642916d) + "'", double1 == (-0.1500253585642916d));
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6784066528087076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6784066528087076d + "'", double1 == 0.6784066528087076d);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0461462579250012d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.14317511632530183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3012989023072947d) + "'", double1 == (-2.3012989023072947d));
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.027719239916259047d, 1.1193272159135788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01807019118332042d + "'", double2 == 0.01807019118332042d);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3295673951398002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023205328672353965d + "'", double1 == 0.023205328672353965d);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        double double2 = org.apache.commons.math.util.FastMath.max(9.999999999999996d, (-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999996d + "'", double2 == 9.999999999999996d);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        double double1 = org.apache.commons.math.util.FastMath.log(99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5982145799432725d + "'", double1 == 4.5982145799432725d);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.49546634624061675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.6881171418161356E43d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.688117141816135E43d + "'", double2 == 2.688117141816135E43d);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.050000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.005282073904701802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999986049880067d + "'", double1 == 0.999986049880067d);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8184464592320673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.162277660168381d + "'", double1 == 3.162277660168381d);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6751788539128234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6250369392251006d + "'", double1 == 0.6250369392251006d);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.644483341943245d, 1.5525884268785045E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        double double1 = org.apache.commons.math.util.FastMath.exp(13.845300947487885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1030238.5625234859d + "'", double1 == 1030238.5625234859d);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.5469160326749675E-19d, 0.9698463103929541d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.261725192512572E-19d + "'", double2 == 9.261725192512572E-19d);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.12911222262740002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.3975854401035095d) + "'", double1 == (-7.3975854401035095d));
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.543073535942135d, (-0.6150317436149153d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7658368273288395d + "'", double2 == 0.7658368273288395d);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5794495262170003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7612158210501148d + "'", double1 == 0.7612158210501148d);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        long long1 = org.apache.commons.math.util.FastMath.abs(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8267087199189199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1776486171538092d + "'", double1 == 1.1776486171538092d);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.027715691434453932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02771214322521837d + "'", double1 == 0.02771214322521837d);
    }
}

