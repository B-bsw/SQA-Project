package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.04640300046199763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04636973784987636d + "'", double1 == 0.04636973784987636d);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        double double1 = org.apache.commons.math.util.FastMath.cosh(36.0482269650408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2621221781635565E15d + "'", double1 == 2.2621221781635565E15d);
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        float float1 = org.apache.commons.math.util.FastMath.abs(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.015955941794861567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015956618846211263d + "'", double1 == 0.015956618846211263d);
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.6571830710861824E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998342954234115d + "'", double1 == 0.9998342954234115d);
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2700305245105663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10381415911910054d + "'", double1 == 0.10381415911910054d);
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.230532568900645E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        double double1 = org.apache.commons.math.util.FastMath.sin(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097466d) + "'", double1 == (-0.5063656411097466d));
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7054294284722258d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0023782107733894223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13626144010775731d + "'", double1 == 0.13626144010775731d);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        double double1 = org.apache.commons.math.util.FastMath.log(2.1544346900318834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7675283643313484d + "'", double1 == 0.7675283643313484d);
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3276676988791267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3276676988791268d + "'", double1 == 0.3276676988791268d);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.0d), 7.896296018267969E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        long long1 = org.apache.commons.math.util.FastMath.abs(573L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 573L + "'", long1 == 573L);
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.16649096046410153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18115285874844744d + "'", double1 == 0.18115285874844744d);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7544036781775962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7544036781775965d + "'", double1 == 1.7544036781775965d);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        int int1 = org.apache.commons.math.util.FastMath.abs(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3796077390275217d, 0.015956618915170855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5287865643035825d + "'", double2 == 1.5287865643035825d);
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        double double1 = org.apache.commons.math.util.FastMath.tan(1261967.0000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.336729333420862d) + "'", double1 == (-4.336729333420862d));
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4201312898382078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37661497259666377d) + "'", double1 == (-0.37661497259666377d));
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9996157480444497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7614327327621273d + "'", double1 == 0.7614327327621273d);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8686709614860095d, 1.2533138212020356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8686709614860096d + "'", double2 == 0.8686709614860096d);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7866131422952851d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 145, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.04749646746707084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0232758299736455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8977366876079912d + "'", double1 == 0.8977366876079912d);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5975638469446122d, 2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5975638469446122d + "'", double2 == 0.5975638469446122d);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9030612511435305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030612511435306d + "'", double1 == 0.9030612511435306d);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        double double1 = org.apache.commons.math.util.FastMath.tanh(47.7974777282436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.8428599996679606E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        int int2 = org.apache.commons.math.util.FastMath.max(573, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.378163642309E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.89629601826829E13d + "'", double1 == 7.89629601826829E13d);
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707963267936305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267936307d + "'", double1 == 1.5707963267936307d);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1267812468982092d + "'", double1 == 2.1267812468982092d);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        int int2 = org.apache.commons.math.util.FastMath.min(26, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6823165548747481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2180280666000018d) + "'", double1 == (-1.2180280666000018d));
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.137917206686937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1379172066869372d + "'", double1 == 1.1379172066869372d);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(38.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3619754067989636d + "'", double1 == 3.3619754067989636d);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9545943990414509d), (-221.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-221.0d) + "'", double2 == (-221.0d));
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        double double1 = org.apache.commons.math.util.FastMath.log(9.2233720368547451E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.66827237527655d + "'", double1 == 43.66827237527655d);
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.3977738256075148d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40908917437285713d) + "'", double1 == (-0.40908917437285713d));
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.653878486731224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08298661180557045d) + "'", double1 == (-0.08298661180557045d));
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 181.18516357615334d + "'", double1 == 181.18516357615334d);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.3053205627843726d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.49357964610362d) + "'", double1 == (-17.49357964610362d));
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 22025L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22025 + "'", int1 == 22025);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.046385953977476656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0463693213253177d + "'", double1 == 0.0463693213253177d);
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        double double1 = org.apache.commons.math.util.FastMath.rint(52.38248989944038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4023976994865663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1842287361344372d + "'", double1 == 1.1842287361344372d);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.543080634815244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.365513453787659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999940841932833d + "'", double1 == 0.9999940841932833d);
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.0013377559375205616d), (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0013377559375205613d) + "'", double2 == (-0.0013377559375205613d));
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9756139057433201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6527952774484755d + "'", double1 == 1.6527952774484755d);
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.1339290130681278E-7d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        long long1 = org.apache.commons.math.util.FastMath.round(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.019234492165425023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019233306345811094d + "'", double1 == 0.019233306345811094d);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4430227241169228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7623282273954516d + "'", double1 == 0.7623282273954516d);
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.155849014780759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.424516743121025d + "'", double1 == 1.424516743121025d);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.0920453164646635E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0920461537065214E-7d + "'", double1 == 4.0920461537065214E-7d);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.6384205222376984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9074644222731123d + "'", double1 == 1.9074644222731123d);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 180.0d + "'", double1 == 180.0d);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.16723958605665326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1656976552431233d + "'", double1 == 0.1656976552431233d);
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.5982145799432725d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000073d + "'", double1 == 1.0000000000000073d);
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        double double2 = org.apache.commons.math.util.FastMath.max(3.3078511907005352d, 0.22882280821594225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3078511907005352d + "'", double2 == 3.3078511907005352d);
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7085012011516139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2616633120174228d + "'", double1 == 1.2616633120174228d);
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        double double1 = org.apache.commons.math.util.FastMath.signum(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2798386717543342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32291637134351786d + "'", double1 == 0.32291637134351786d);
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        double double1 = org.apache.commons.math.util.FastMath.signum((-8.271228063367024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5282953052207049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0142047603949278d + "'", double1 == 1.0142047603949278d);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.33730966282112745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3250734611491427d) + "'", double1 == (-0.3250734611491427d));
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6555421614583431d, (-0.0034360715711427674d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.655542161458343d + "'", double2 == 0.655542161458343d);
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9763608754884531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3689877298052193d, 9.786480471441937E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3689877298052193d + "'", double2 == 1.3689877298052193d);
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.185039863261519d) + "'", double1 == (-2.185039863261519d));
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        int int2 = org.apache.commons.math.util.FastMath.min(22025, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.956824444577827E-60d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7377936960093874E-61d + "'", double1 == 1.7377936960093874E-61d);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        double double1 = org.apache.commons.math.util.FastMath.abs((-6.053272382792571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.053272382792571d + "'", double1 == 6.053272382792571d);
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3418628230105176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35583418012252627d + "'", double1 == 0.35583418012252627d);
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        double double1 = org.apache.commons.math.util.FastMath.atan((-42.13742894001701d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5470689102278574d) + "'", double1 == (-1.5470689102278574d));
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0067670225817297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0067670225817297d + "'", double1 == 0.0067670225817297d);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.2529813614778327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1530632246059498d + "'", double1 == 1.1530632246059498d);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0461462579250012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.009495102254525043d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009495387614688914d) + "'", double1 == (-0.009495387614688914d));
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-89.0d), 1.2567610122556662E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-88.99999999999999d) + "'", double2 == (-88.99999999999999d));
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080844E43d + "'", double1 == 1.3440585709080844E43d);
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, 38.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.7621956910836305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8135279227115659d) + "'", double1 == (-0.8135279227115659d));
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6145485553432246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4790553853029686d + "'", double1 == 0.4790553853029686d);
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        double double1 = org.apache.commons.math.util.FastMath.signum((-221.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3104642473694204d, 2.397107525138078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.911968685443677d + "'", double2 == 1.911968685443677d);
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.027415567773547207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0277948324376378d + "'", double1 == 1.0277948324376378d);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(137.34414422946176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.159449696805132d + "'", double1 == 5.159449696805132d);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2104.8636254562957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.156864174916083E21d + "'", double1 == 1.156864174916083E21d);
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        double double1 = org.apache.commons.math.util.FastMath.asinh(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.132482812411777d + "'", double1 == 18.132482812411777d);
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.616441887145511E102d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1037080495808624d, (-0.9251475365964138d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9127535552074842d + "'", double2 == 0.9127535552074842d);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5525884268785043E-18d, 0.376727508058575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.12125048919205E-18d + "'", double2 == 4.12125048919205E-18d);
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.432066880993469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9612179885158494d + "'", double1 == 0.9612179885158494d);
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        double double2 = org.apache.commons.math.util.FastMath.pow(10.693147180044656d, 1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2616633120174228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.28798294509544d + "'", double1 == 72.28798294509544d);
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 22025L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.915504000358288E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.675640048483193E7d + "'", double1 == 2.675640048483193E7d);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7614327327621273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.355372716651809E-7d, 0.666536656761523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3553727166518095E-7d + "'", double2 == 3.3553727166518095E-7d);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.1267812468982092d, 0.5402647332399915d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.126781246898209d + "'", double2 == 2.126781246898209d);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.08883176481419076d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.16571439123522547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16724814964758392d + "'", double1 == 0.16724814964758392d);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.030312139532567103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17410381825958643d + "'", double1 == 0.17410381825958643d);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12186934340514759d) + "'", double1 == (-0.12186934340514759d));
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.047407404488248234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        long long1 = org.apache.commons.math.util.FastMath.abs(145L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 145L + "'", long1 == 145L);
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4371344463413933d, (-6.053272382793105d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9084938189508023d + "'", double2 == 2.9084938189508023d);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1171584131235877d, 4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6636920174428667d + "'", double2 == 1.6636920174428667d);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3796077390275217d, 3.5740143590154496E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5740143590154496E-17d + "'", double2 == 3.5740143590154496E-17d);
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        double double2 = org.apache.commons.math.util.FastMath.max(0.019234492165425023d, 0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5403023058681398d + "'", double2 == 0.5403023058681398d);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.12125048919205E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        double double2 = org.apache.commons.math.util.FastMath.max(0.11533380529205599d, 0.42206715285395996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.42206715285395996d + "'", double2 == 0.42206715285395996d);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.47447846432657004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5158342259816473d + "'", double1 == 0.5158342259816473d);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.39704103087032844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.088887490341627E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948457d + "'", double1 == 1.5707963267948457d);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        double double1 = org.apache.commons.math.util.FastMath.abs(72.28798294509544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.28798294509544d + "'", double1 == 72.28798294509544d);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5978220919084256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.903137390602939E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.382248583674181E-17d + "'", double1 == 3.382248583674181E-17d);
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0145502426353863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8492431649093556d + "'", double1 == 0.8492431649093556d);
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        double double1 = org.apache.commons.math.util.FastMath.atan((-17.49357964610362d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5136946405560185d) + "'", double1 == (-1.5136946405560185d));
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        double double1 = org.apache.commons.math.util.FastMath.atan(185.47866641176898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5654049234046847d + "'", double1 == 1.5654049234046847d);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7589809880912084d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7589809880912084d + "'", double1 == 0.7589809880912084d);
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8998668269691937d + "'", double1 == 0.8998668269691937d);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3962634015954634d, (-1.979079474234486E-9d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3962634015954631d + "'", double2 == 1.3962634015954631d);
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.19240232444172625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17597003220072988d + "'", double1 == 0.17597003220072988d);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.19687317393211679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5817398942542069d) + "'", double1 == (-0.5817398942542069d));
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49321676688550387d + "'", double1 == 0.49321676688550387d);
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5409243178208767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4757278705561235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3891513396382057d + "'", double1 == 0.3891513396382057d);
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.142219984546603E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.142219984543288E-13d + "'", double1 == 8.142219984543288E-13d);
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1805546814635168E-15d + "'", double1 == 3.1805546814635168E-15d);
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.317069759957247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02298720378970533d + "'", double1 == 0.02298720378970533d);
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.025681666614117072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025684490500959736d + "'", double1 == 0.025684490500959736d);
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.551401785493842d, 0.986746382996133d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.555769423778169d + "'", double2 == 0.555769423778169d);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0000446504873581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9818490617583829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.25580735763506d + "'", double1 == 56.25580735763506d);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.1649569776443817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1649569776443817d + "'", double1 == 0.1649569776443817d);
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5703212366690238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5703212366690238d + "'", double1 == 1.5703212366690238d);
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        double double1 = org.apache.commons.math.util.FastMath.signum(47.7974777282436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7143859385096635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.577721810442024E-30d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.675640048483193E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.675640048483193E7d + "'", double1 == 2.675640048483193E7d);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.82679529269723d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2224467810154838d) + "'", double1 == (-1.2224467810154838d));
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.2621221781635565E15d, 1.834991508392875E-20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.262122178163556E15d + "'", double2 == 2.262122178163556E15d);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.184705528587072E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.69314718055995d + "'", double1 == 50.69314718055995d);
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015747708586685748d + "'", double1 == 0.015747708586685748d);
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.142219984543288E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.3053205627843726d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.08298661180557045d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08308215993632734d) + "'", double1 == (-0.08308215993632734d));
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.577721810442024E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.577721810442024E-30d + "'", double1 == 1.577721810442024E-30d);
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02109576457512843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02109732960109633d + "'", double1 == 0.02109732960109633d);
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4694426632156045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4694426632156045d + "'", double1 == 0.4694426632156045d);
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.5356779950985695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04425592978483868d) + "'", double1 == (-0.04425592978483868d));
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9225239138463643E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9225239137279338E-5d + "'", double1 == 1.9225239137279338E-5d);
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.28858290004402326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.524244356327113E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.524244356327113E15d + "'", double1 == 4.524244356327113E15d);
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9337643921132143d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9337643921132143d + "'", double2 == 0.9337643921132143d);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7785713669985503d, (-5.693388459081093d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.693388459081093d) + "'", double2 == (-5.693388459081093d));
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        double double2 = org.apache.commons.math.util.FastMath.atan2(794.344456722457d, 0.025684490500959736d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707639925974655d + "'", double2 == 1.5707639925974655d);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.08308215993632734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08317777404333762d) + "'", double1 == (-0.08317777404333762d));
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9225239137279338E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9225239138463643E-5d + "'", double1 == 1.9225239138463643E-5d);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 8L, (float) 26L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        double double1 = org.apache.commons.math.util.FastMath.floor((-2104.8636254562957d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2105.0d) + "'", double1 == (-2105.0d));
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 573);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        double double2 = org.apache.commons.math.util.FastMath.min(3.1084164823547447E8d, (double) 573);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 573.0d + "'", double2 == 573.0d);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7048627526623752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5334846105232111d + "'", double1 == 0.5334846105232111d);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        double double1 = org.apache.commons.math.util.FastMath.acos(99.30685281944007d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 22025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5017009167919775d, (double) 573.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5017009167919776d + "'", double2 == 0.5017009167919776d);
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        long long1 = org.apache.commons.math.util.FastMath.round(2.3978952727983702d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.818446459232067d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.448317288402091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.255946955090421d + "'", double1 == 4.255946955090421d);
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.020573130590485034d, 3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020573130590485038d + "'", double2 == 0.020573130590485038d);
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        double double2 = org.apache.commons.math.util.FastMath.min(0.486876001962704d, 1.956763353344058E80d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.486876001962704d + "'", double2 == 0.486876001962704d);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.262122178163556E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3978952727983707d + "'", double2 == 2.3978952727983707d);
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5430770857878007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9957890945476039d + "'", double1 == 0.9957890945476039d);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.142219984543288E-13d, 5557.395265851666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4651144277202135E-16d + "'", double2 == 1.4651144277202135E-16d);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6750559827141311d + "'", double1 == 0.6750559827141311d);
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.0d, (-0.9036922050915037d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6832810232787436d + "'", double2 == 1.6832810232787436d);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-59.00187915014031d), 1.3032833236333146d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.548711073922983d) + "'", double2 == (-1.548711073922983d));
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0797696988252596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0259126351421606d + "'", double1 == 1.0259126351421606d);
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        double double1 = org.apache.commons.math.util.FastMath.rint((-8.271228063367024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.0d) + "'", double1 == (-8.0d));
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.44760755429150645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42086258607142485d + "'", double1 == 0.42086258607142485d);
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 7L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.050000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.247220505424423d + "'", double1 == 2.247220505424423d);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.43442052080657195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5817398942542069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.549478463118442d) + "'", double1 == (-0.549478463118442d));
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9999999999999747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195252d) + "'", double1 == (-0.8813735870195252d));
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6674572160283838d + "'", double1 == 0.6674572160283838d);
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.01900502000357532d), 3.841104430236654E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01900502000357532d) + "'", double2 == (-0.01900502000357532d));
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        long long1 = org.apache.commons.math.util.FastMath.round(6.614415338769718E71d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2533138212020356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.119514993737036d + "'", double1 == 1.119514993737036d);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        double double1 = org.apache.commons.math.util.FastMath.log(7.642595581083531E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.2722241413791169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23831648283882453d) + "'", double1 == (-0.23831648283882453d));
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.046385953977476656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.359304092810529d + "'", double1 == 0.359304092810529d);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2.5356779950985695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5356779950985695d + "'", double1 == 2.5356779950985695d);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9545943990414509d), 2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9545943990414509d) + "'", double2 == (-0.9545943990414509d));
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        long long1 = org.apache.commons.math.util.FastMath.round(18.132482812411777d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18L + "'", long1 == 18L);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1256138592702154d + "'", double1 == 2.1256138592702154d);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 31L, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        double double1 = org.apache.commons.math.util.FastMath.floor(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.0d + "'", double1 == 2005.0d);
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 26L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6150317436149153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6545457907958764d) + "'", double1 == (-0.6545457907958764d));
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8686709614860096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.38374066418898d + "'", double1 == 2.38374066418898d);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        int int2 = org.apache.commons.math.util.FastMath.min(573, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.359304092810529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3675220813204314d + "'", double1 == 0.3675220813204314d);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943298d + "'", double1 == 1.7453292519943298d);
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 22025);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22025L + "'", long1 == 22025L);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6417445913244706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8740254132919673d + "'", double1 == 0.8740254132919673d);
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6552377416047082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6552377416047083d + "'", double1 == 0.6552377416047083d);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.647369156657704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2738247147297843d + "'", double1 == 1.2738247147297843d);
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4997813562224119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590842d + "'", double1 == 0.6483608274590842d);
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.1400656231999866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.137917206686937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7589809880912084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7003164898521066d + "'", double1 == 0.7003164898521066d);
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.027705053070945423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027705053070945423d + "'", double1 == 0.027705053070945423d);
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.009972194509427618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        long long2 = org.apache.commons.math.util.FastMath.max(145L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6527952774484755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.221555141999398d + "'", double1 == 4.221555141999398d);
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        double double1 = org.apache.commons.math.util.FastMath.rint(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3333452696210846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023271265020779454d + "'", double1 == 0.023271265020779454d);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.03994949099270701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.972501523185553E-4d + "'", double1 == 6.972501523185553E-4d);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7675283643313484d, 0.01144136910308836d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7675283643313483d + "'", double2 == 0.7675283643313483d);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.956824444577827E-60d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.956824444577827E-60d + "'", double1 == 9.956824444577827E-60d);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0029461466385965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7628286883743736d + "'", double1 == 0.7628286883743736d);
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.11533380529205599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.7897808285809945E73d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.19438719642597732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5792809126705765d) + "'", double1 == (-0.5792809126705765d));
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.3614195558365d + "'", double1 == 44.3614195558365d);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.548711073922983d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5230140581531376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4800229187927331d + "'", double1 == 0.4800229187927331d);
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.07890198156137432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1029120896883755d) + "'", double1 == (-1.1029120896883755d));
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.486876001962704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.697765004828061d + "'", double1 == 0.697765004828061d);
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.2180280666000018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021258600143870807d) + "'", double1 == (-0.021258600143870807d));
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7320508075688772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0471975511965976d + "'", double1 == 1.0471975511965976d);
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.999986049880067d, 4.691649480399091E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999860498800671d + "'", double2 == 0.9999860498800671d);
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-2.5356779950985695d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9999999999351508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999675754d + "'", double1 == 0.9999999999675754d);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9936116249145202d + "'", double1 == 1.9936116249145202d);
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9999940841932833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853952054853407d + "'", double1 == 0.7853952054853407d);
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.05482909570415162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.10707716392528016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.296722144923343d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9961652815068444d + "'", double1 == 0.9961652815068444d);
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5703212366690238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.808192513462892d + "'", double1 == 3.808192513462892d);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.432066880993469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1966899686190524d + "'", double1 == 1.1966899686190524d);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.902641160672524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8108288062597232d) + "'", double1 == (-0.8108288062597232d));
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.16646964819512286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1416876847493498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019926209128347205d + "'", double1 == 0.019926209128347205d);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6305926250944657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5896235118375416d + "'", double1 == 0.5896235118375416d);
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.140655263641914E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0679515313825692E-25d + "'", double1 == 2.0679515313825692E-25d);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        double double1 = org.apache.commons.math.util.FastMath.atan(5729.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706217762642902d + "'", double1 == 1.5706217762642902d);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9189065459251122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9189065459251123d + "'", double1 == 0.9189065459251123d);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.003109141424240039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0031091414242400395d + "'", double1 == 0.0031091414242400395d);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.14436016288910877d), 0.666536656761523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.14436016288910877d) + "'", double2 == (-0.14436016288910877d));
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        double double2 = org.apache.commons.math.util.FastMath.max(0.39704103087032844d, 1.2304174960375769E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2304174960375769E11d + "'", double2 == 1.2304174960375769E11d);
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9786883441146831d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.848501131276807d) + "'", double1 == (-3.848501131276807d));
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.688117141816135E43d, 1.5707038251666727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6398359282348625E68d + "'", double2 == 1.6398359282348625E68d);
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.748066E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.0920461537065214E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.092046153706293E-7d + "'", double1 == 4.092046153706293E-7d);
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.8104768396174693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.597055569270644d + "'", double1 == 22.597055569270644d);
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.8055865251572774E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9187618740866558d + "'", double1 == 0.9187618740866558d);
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5451146601807795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5451146601807795d + "'", double1 == 1.5451146601807795d);
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.8002419211835452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8002419211835452d + "'", double1 == 1.8002419211835452d);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7183274194704676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.16648030344294168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16725907543191326d + "'", double1 == 0.16725907543191326d);
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9698463103929541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.770091723226162d + "'", double1 == 0.770091723226162d);
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2110908904786682E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.2621221781635565E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        double double1 = org.apache.commons.math.util.FastMath.log(4.957234655978706E136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 314.7524207034134d + "'", double1 == 314.7524207034134d);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 145L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.3554049701598595E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8562864467071635E-9d + "'", double1 == 5.8562864467071635E-9d);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.547473508864641E-13d, 0.037712963705904774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2058117586109089E-11d + "'", double2 == 1.2058117586109089E-11d);
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5812661035094697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999451923884265d + "'", double1 == 0.9999451923884265d);
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7614327327621273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6507779951543295d + "'", double1 == 0.6507779951543295d);
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5451146601807795d, 0.015956618846211263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5451146601807795d + "'", double2 == 1.5451146601807795d);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        double double1 = org.apache.commons.math.util.FastMath.ulp(57.870002544225116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.866317614445707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6994983692632405d + "'", double1 == 0.6994983692632405d);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.903137390602939E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        double double1 = org.apache.commons.math.util.FastMath.log(0.46749182950293094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7603734074051981d) + "'", double1 == (-0.7603734074051981d));
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.398057842737113E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293955920339377E-23d + "'", double1 == 5.293955920339377E-23d);
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.31223183389476095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        double double1 = org.apache.commons.math.util.FastMath.atanh(88.41160108781288d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7811284620871497d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.920960112236651d) + "'", double1 == (-0.920960112236651d));
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.3588589435717465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35885894357174647d) + "'", double1 == (-0.35885894357174647d));
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.229687871848033d + "'", double1 == 2.229687871848033d);
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483647E9d + "'", double1 == 2.147483647E9d);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.25109225867773716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2510922586777372d + "'", double1 == 0.2510922586777372d);
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.0013377559375205616d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0013377551395091605d) + "'", double1 == (-0.0013377551395091605d));
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9536075631471675d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.9484831895170822d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3564962504917153d + "'", double1 == 1.3564962504917153d);
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6784102379846987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2855617141854978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0410505700010417d + "'", double1 == 1.0410505700010417d);
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        double double1 = org.apache.commons.math.util.FastMath.asin(11013.232874703392d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2304174960375769E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.798432482299822E248d, 0.8060294742125208d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.798432482299821E248d + "'", double2 == 6.798432482299821E248d);
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5475868312936525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.67019386315084d + "'", double1 == 88.67019386315084d);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5501042757606859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.156119580207155E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.527196701237181E38d + "'", double1 == 3.527196701237181E38d);
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        double double1 = org.apache.commons.math.util.FastMath.log(0.16646964819512286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7929422793014345d) + "'", double1 == (-1.7929422793014345d));
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9996157480444497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.843257992499208E-4d) + "'", double1 == (-3.843257992499208E-4d));
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, 38.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9224869535749408E-5d, 1.0997245430382512d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9224869535749408E-5d + "'", double2 == 1.9224869535749408E-5d);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        double double1 = org.apache.commons.math.util.FastMath.log(3282.8063500117437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.096453930081621d + "'", double1 == 8.096453930081621d);
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.837300699980114E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.1061285321866012d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8993090504883884d + "'", double1 == 0.8993090504883884d);
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0398314119215128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9440450304036032d), 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9440450304036031d) + "'", double2 == (-0.9440450304036031d));
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        double double1 = org.apache.commons.math.util.FastMath.log(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-39.50938929191688d) + "'", double1 == (-39.50938929191688d));
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.156119580207155E36d, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.230532568900645E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 416.60399367417324d + "'", double1 == 416.60399367417324d);
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.37661497259666377d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.14336970329182389d), 0.14466555184225385d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        int int2 = org.apache.commons.math.util.FastMath.min(26, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707008595346152d, 1.2700305245105663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707008595346152d + "'", double2 == 1.5707008595346152d);
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8236544498809605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075541030048625d + "'", double1 == 0.9075541030048625d);
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        double double2 = org.apache.commons.math.util.FastMath.min(3.1084164823547447E8d, 1.356655043862392d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.356655043862392d + "'", double2 == 1.356655043862392d);
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.954844600830958E183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.7167639596083E91d + "'", double1 == 7.7167639596083E91d);
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.00000000000001d + "'", double1 == 57.00000000000001d);
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9879690512915179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.550386653691239d + "'", double1 == 0.550386653691239d);
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9936116249145202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03479508686079259d + "'", double1 == 0.03479508686079259d);
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (float) 573);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.5469160326749675E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5469160326749675E-19d + "'", double1 == 2.5469160326749675E-19d);
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.04751433553952635d, 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017477767330207263d + "'", double2 == 0.017477767330207263d);
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        double double2 = org.apache.commons.math.util.FastMath.min((-39.50938929191688d), (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.50938929191688d) + "'", double2 == (-39.50938929191688d));
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.548711073922983d), 1.2054747075950174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.548711073922983d) + "'", double2 == (-1.548711073922983d));
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-4.916823262511692d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7603734074051979d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.34668423136158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2976454463101708d + "'", double1 == 0.2976454463101708d);
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        double double1 = org.apache.commons.math.util.FastMath.log(7.89629601826797E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.999999999999986d + "'", double1 == 31.999999999999986d);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02321157953304928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5475826624438378d + "'", double1 == 1.5475826624438378d);
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.376727508058575d, (-5.693388459081093d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0755196757053205d + "'", double2 == 3.0755196757053205d);
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        double double1 = org.apache.commons.math.util.FastMath.log(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.355079784480865d) + "'", double1 == (-3.355079784480865d));
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.42206715285395996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9122440868593062d + "'", double1 == 0.9122440868593062d);
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        double double2 = org.apache.commons.math.util.FastMath.max(3.399216241149525E248d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.399216241149525E248d + "'", double2 == 3.399216241149525E248d);
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4677992676220697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3837641821656744d + "'", double1 == 0.3837641821656744d);
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.644250144850967d) + "'", double1 == (-0.644250144850967d));
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4467246575506081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2848536225107588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29295641644784054d + "'", double1 == 0.29295641644784054d);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2706488717750568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.270648871775057d + "'", double1 == 1.270648871775057d);
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5473008271869906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9916605674542439d + "'", double1 == 0.9916605674542439d);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.6625219529419444d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5017009167919775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7945995197127065d + "'", double1 == 0.7945995197127065d);
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9330920755982086d + "'", double1 == 0.9330920755982086d);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.3643047812382505d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.943682501001078d + "'", double1 == 1.943682501001078d);
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        double double1 = org.apache.commons.math.util.FastMath.log(8.037623954904807E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-99.22961058022105d) + "'", double1 == (-99.22961058022105d));
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9251475365964138d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.8551464208140986d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        float float1 = org.apache.commons.math.util.FastMath.abs(7.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022920740387489907d + "'", double1 == 0.022920740387489907d);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        long long2 = org.apache.commons.math.util.FastMath.min(26L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        double double1 = org.apache.commons.math.util.FastMath.log10(104.06639041664195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0173104911493955d + "'", double1 == 2.0173104911493955d);
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7675283643313483d, 6.35088571671474d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18631502623505247d + "'", double2 == 0.18631502623505247d);
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        int int1 = org.apache.commons.math.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9092974268256818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4825777280150008d + "'", double1 == 2.4825777280150008d);
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9312797787813019d, (-0.07634906307728516d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.07634906307728516d) + "'", double2 == (-0.07634906307728516d));
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.029464112608972946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.029468377407925152d) + "'", double1 == (-0.029468377407925152d));
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.911968685443677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3827395580671282d + "'", double1 == 1.3827395580671282d);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.07657274203834082d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.17814068151824802d, 1.0963506817327158d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1508598335814295d + "'", double2 == 0.1508598335814295d);
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.16227766016838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9997860728793259d) + "'", double1 == (-0.9997860728793259d));
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.124050593532391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4947180585964329d + "'", double1 == 0.4947180585964329d);
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.11109916834859056d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 573, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5211141550652623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9247009288407589d + "'", double1 == 0.9247009288407589d);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 22025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.0d + "'", double1 == 22025.0d);
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.972501523185553E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5700990765860825d + "'", double1 == 1.5700990765860825d);
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3962634015954634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.117692795479829d + "'", double1 == 1.117692795479829d);
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        float float1 = org.apache.commons.math.util.FastMath.abs(26.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 26.0f + "'", float1 == 26.0f);
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.411337566029088E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.411337566029088E-22d + "'", double1 == 8.411337566029088E-22d);
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.922505433236944E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.716132424155146d) + "'", double1 == (-4.716132424155146d));
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        float float1 = org.apache.commons.math.util.FastMath.abs(8.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941553786771d + "'", double1 == 0.7615941553786771d);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2182829050172777d + "'", double1 == 1.2182829050172777d);
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.915504000358288E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.915504000358288E22d + "'", double1 == 1.915504000358288E22d);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.84585047808035d), (-3.8485011312768047d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.066732021965656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36332563610469826d + "'", double1 == 0.36332563610469826d);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2809413143351598d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3384744041042738d, 10.206709210579758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.338474404104274d + "'", double2 == 1.338474404104274d);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0997245430382512d, 794.3444567224569d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0997245430382512d + "'", double2 == 1.0997245430382512d);
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.16723958605665326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16882546477676433d + "'", double1 == 0.16882546477676433d);
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.40908917437285713d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.833489212424966E38d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.56811156719042E12d) + "'", double1 == (-6.56811156719042E12d));
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5569432209472811d + "'", double1 == 0.5569432209472811d);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2937272068925049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.0034419884227690025d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003441988422769002d) + "'", double1 == (-0.003441988422769002d));
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5792809126705765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5792809126705764d) + "'", double1 == (-0.5792809126705764d));
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5663169859928074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.3754758794263844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.23819432624582d + "'", double1 == 29.23819432624582d);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.11109916834859056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9297272897535336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.786083656729492d + "'", double1 == 2.786083656729492d);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.816301153436276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.149071860492834d + "'", double1 == 5.149071860492834d);
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        double double1 = org.apache.commons.math.util.FastMath.log(7.89629601826829E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000000000003d + "'", double1 == 32.00000000000003d);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.262122178163556E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.262122178163556E15d + "'", double1 == 2.262122178163556E15d);
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        double double1 = org.apache.commons.math.util.FastMath.sin(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4281826694961574d) + "'", double1 == (-0.4281826694961574d));
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.692955134525155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5998770763750486d + "'", double1 == 0.5998770763750486d);
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5619730447758076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0013299769888426d + "'", double1 == 1.0013299769888426d);
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        long long1 = org.apache.commons.math.util.FastMath.round(2.38374066418898d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.397107525138078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.991338187845832d + "'", double1 == 10.991338187845832d);
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6977837230134307d + "'", double1 == 2.6977837230134307d);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.786480471441937E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.786480471441939E10d + "'", double1 == 9.786480471441939E10d);
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }
}

