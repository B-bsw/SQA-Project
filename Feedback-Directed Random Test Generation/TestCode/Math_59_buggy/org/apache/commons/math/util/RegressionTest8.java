package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.463984075193098E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 172.58048571980692d + "'", double1 == 172.58048571980692d);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5000715031063323d, 4.654592440028928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.654592440028928d + "'", double2 == 4.654592440028928d);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.0258124639856192d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01790380500454481d) + "'", double1 == (-0.01790380500454481d));
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.03760197886023983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.037610840448247515d + "'", double1 == 0.037610840448247515d);
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 38);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        float float2 = org.apache.commons.math.util.FastMath.max(8.0f, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7589809880912084d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6881824710286039d) + "'", double1 == (-0.6881824710286039d));
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        int int1 = org.apache.commons.math.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        double double2 = org.apache.commons.math.util.FastMath.min(0.435961927627987d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3877159156483166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9474823836948711d) + "'", double1 == (-0.9474823836948711d));
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4554625215028407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.632006013089796d + "'", double1 == 8.632006013089796d);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        int int2 = org.apache.commons.math.util.FastMath.min(145, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5896235118375416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46349720318630866d + "'", double1 == 0.46349720318630866d);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.015747708586685748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0438252985430079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.840060340331501d + "'", double1 == 2.840060340331501d);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.08308215993632734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08308215993632732d) + "'", double1 == (-0.08308215993632732d));
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1193272159135788d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        double double2 = org.apache.commons.math.util.FastMath.max(0.16393750213817188d, 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.8212977905417654E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        double double1 = org.apache.commons.math.util.FastMath.log(0.4386368936167206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8240833297627779d) + "'", double1 == (-0.8240833297627779d));
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9122440868593062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9698480248174192d + "'", double1 == 0.9698480248174192d);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.154359865434033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.260882740708347d + "'", double1 == 2.260882740708347d);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.117692795479829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999999998054523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.42086258607142485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3976568654895484d + "'", double1 == 0.3976568654895484d);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.746594273122733d, 0.01153673179946589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5665959743566382d + "'", double2 == 1.5665959743566382d);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.05224159390358993d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.6604007228000894d), (-2105.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2105.0d) + "'", double2 == (-2105.0d));
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.046956526320538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5999857756436902d + "'", double1 == 1.5999857756436902d);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1924023244417262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19123459503123072d + "'", double1 == 0.19123459503123072d);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        double double1 = org.apache.commons.math.util.FastMath.floor((-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-90.0d) + "'", double1 == (-90.0d));
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.6604007228000894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.13028260783892d + "'", double1 == 11.13028260783892d);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000125457099495d + "'", double1 == 1.000125457099495d);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        double double1 = org.apache.commons.math.util.FastMath.log(0.16723958605665326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7883278476424156d) + "'", double1 == (-1.7883278476424156d));
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.180231032234882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020598917446710018d + "'", double1 == 0.020598917446710018d);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4650188248182272d) + "'", double1 == (-1.4650188248182272d));
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.1075653784740282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.163042208289171d + "'", double1 == 6.163042208289171d);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8758577137362275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0863269013483303d) + "'", double1 == (-2.0863269013483303d));
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4917863811300067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026036584087129624d + "'", double1 == 0.026036584087129624d);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9442157056960554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        double double1 = org.apache.commons.math.util.FastMath.acos(97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.8199681505512405E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6157227338789841E-16d + "'", double1 == 1.6157227338789841E-16d);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        double double2 = org.apache.commons.math.util.FastMath.max((-15.653559774527022d), 0.9996157480449777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9996157480449777d + "'", double2 == 0.9996157480449777d);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3486697178752796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.984477251954342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.446319123081521d + "'", double1 == 2.446319123081521d);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        double double1 = org.apache.commons.math.util.FastMath.cos(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33410855904595715d + "'", double1 == 0.33410855904595715d);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.01913492915272034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019133761479353487d + "'", double1 == 0.019133761479353487d);
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1966899686190524d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 22025L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5773024999492183d, 1.518074431338224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5773024999492185d + "'", double2 == 0.5773024999492185d);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.6384205222376984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4766393240263169d) + "'", double1 == (-0.4766393240263169d));
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        double double2 = org.apache.commons.math.util.FastMath.max(3.14147577836676d, 0.3414179241869126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.14147577836676d + "'", double2 == 3.14147577836676d);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 22025, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        double double2 = org.apache.commons.math.util.FastMath.min(3.3619754067989636d, 56.25580735763506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3619754067989636d + "'", double2 == 3.3619754067989636d);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.01654379973059443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25480723471248695d + "'", double1 == 0.25480723471248695d);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        double double1 = org.apache.commons.math.util.FastMath.asinh(36.59459942804923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2932344847484805d + "'", double1 == 4.2932344847484805d);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8595318579974747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.362054657837477d + "'", double1 == 2.362054657837477d);
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11.548739357257746d, 1030238.5625234859d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1209771966297117E-5d + "'", double2 == 1.1209771966297117E-5d);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.1029120896883755d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.49849450465990564d, 1.570796326794884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4984945046599057d + "'", double2 == 0.4984945046599057d);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4593566380802732d + "'", double1 == 1.4593566380802732d);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.027705053070945427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027708598556821545d + "'", double1 == 0.027708598556821545d);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4800229187927331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02771569143445394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02771924100709588d + "'", double1 == 0.02771924100709588d);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        double double2 = org.apache.commons.math.util.FastMath.max(2.258046185049248d, 6.156119580207155E36d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.156119580207155E36d + "'", double2 == 6.156119580207155E36d);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.140655263641914E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.377358825534998E-5d + "'", double1 == 3.377358825534998E-5d);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 97864804714L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.306852819445986d + "'", double1 == 25.306852819445986d);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.02109628083757295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997774817202983d + "'", double1 == 0.9997774817202983d);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7876030784130355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9234976649034378d + "'", double1 == 0.9234976649034378d);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.5707962142597218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0582831434221311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.813706986510902d + "'", double1 == 0.813706986510902d);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.331941588598159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.550386653691239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.819513221744016d + "'", double1 == 0.819513221744016d);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5158342259816473d, 0.7615941553786771d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5158342259816474d + "'", double2 == 0.5158342259816474d);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3891513396382057d, 0.03791113527135105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9648525037059907d + "'", double2 == 0.9648525037059907d);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4651144277202135E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.005282073904701802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00528202478170027d + "'", double1 == 0.00528202478170027d);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5836293809324178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.43950032726054d + "'", double1 == 33.43950032726054d);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.048549105685016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0239868679260569d + "'", double1 == 1.0239868679260569d);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7144972908707885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7748910114247427d + "'", double1 == 0.7748910114247427d);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3962634015954634d, 0.7777181923662807d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7777181923662807d + "'", double2 == 0.7777181923662807d);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6346446623333779d, 6.978995704713228E82d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.978995704713228E82d + "'", double2 == 6.978995704713228E82d);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.700888353141813E44d + "'", double1 == 7.700888353141813E44d);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.05224159390358993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05363026241493581d + "'", double1 == 0.05363026241493581d);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.45158270528864863d, (-0.22309009934914975d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.029647097861444d + "'", double2 == 2.029647097861444d);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        double double1 = org.apache.commons.math.util.FastMath.atanh(14.741329353331304d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0995037190209988d + "'", double1 == 0.0995037190209988d);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.003358054049998483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0033524283771879993d + "'", double1 == 0.0033524283771879993d);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.119514993737036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.694903085487113d + "'", double1 == 1.694903085487113d);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 18L, 145.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5887989736417515d, 17.439335658532258d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5887989736417516d + "'", double2 == 0.5887989736417516d);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9957890945476039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09180265859838255d + "'", double1 == 0.09180265859838255d);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        long long1 = org.apache.commons.math.util.FastMath.round(1.6574500491081818d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6398359282348625E68d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6398359282348625E68d + "'", double1 == 1.6398359282348625E68d);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 573);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.3553727166518725E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293955920339377E-23d + "'", double1 == 5.293955920339377E-23d);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.009972194509427618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009972194509427618d + "'", double1 == 0.009972194509427618d);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.02320532867235397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7544036781775962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.51992632180419d + "'", double1 == 100.51992632180419d);
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.748066E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066E7d + "'", double1 == 3.748066E7d);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.211102550927978d + "'", double1 == 7.211102550927978d);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.16571439123522547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15333411044111225d + "'", double1 == 0.15333411044111225d);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.013669380586024594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999065754719239d + "'", double1 == 0.9999065754719239d);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9033018261833695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01576559100617732d) + "'", double1 == (-0.01576559100617732d));
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.369491427691419d + "'", double1 == 4.369491427691419d);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2195305837148458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7972957247486471d + "'", double1 == 0.7972957247486471d);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.44760755429150645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5645645685050509d + "'", double1 == 1.5645645685050509d);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        long long1 = org.apache.commons.math.util.FastMath.round(1.333345269621085d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5323425837018869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009291130834171431d + "'", double1 == 0.009291130834171431d);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5706217762642902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1416876847493498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1416876847493498d + "'", double1 == 1.1416876847493498d);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.896296018267967E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.153068686219429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 38L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1855931757113756E16d + "'", double1 == 3.1855931757113756E16d);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.49624800899233534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47612948991158704d + "'", double1 == 0.47612948991158704d);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.984477251954342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198.6086706119757d + "'", double1 == 198.6086706119757d);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.7092603658226646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 212.52496407679047d + "'", double1 == 212.52496407679047d);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7350525871447157d + "'", double1 == 0.7350525871447157d);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4901161193847656E-8d + "'", double1 == 1.4901161193847656E-8d);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.7864802E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.7864802E10f + "'", float1 == 9.7864802E10f);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 145, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        long long1 = org.apache.commons.math.util.FastMath.abs(18L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18L + "'", long1 == 18L);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9914968516113685d), 1.9224869535749408E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0980197632589186d, (-0.8108288062597232d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0980197632589184d + "'", double2 == 1.0980197632589184d);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5812661035094697d, (-0.026700664390811216d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5876803459339235d + "'", double2 == 1.5876803459339235d);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3104642473694204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0848151289814358d + "'", double1 == 1.0848151289814358d);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.4091896264064065d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.07642343372489104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0029216922179651d + "'", double1 == 1.0029216922179651d);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.3250734611491427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3781636423089612E12d + "'", double1 == 1.3781636423089612E12d);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.4924750848100893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        int int2 = org.apache.commons.math.util.FastMath.max(26, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        long long2 = org.apache.commons.math.util.FastMath.min(573L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.999999995520374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292512124874d + "'", double1 == 0.17453292512124874d);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709825806044d + "'", double1 == 0.8414709825806044d);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 100.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9525849574608642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8474455806785736d + "'", double1 == 0.8474455806785736d);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-4.716136598735705d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        double double1 = org.apache.commons.math.util.FastMath.atanh(26.000000000000004d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 38);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 38L + "'", long1 == 38L);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4947180585964329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6400357798772336d + "'", double1 == 1.6400357798772336d);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        double double1 = org.apache.commons.math.util.FastMath.cosh(31.999999999999986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009133979E13d + "'", double1 == 3.948148009133979E13d);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8772827919571972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.070171415157583d + "'", double1 == 1.070171415157583d);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3593642103115025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9777313730176922d + "'", double1 == 0.9777313730176922d);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9518224930797358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7607198300261392d + "'", double1 == 0.7607198300261392d);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4467246575506081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7644456989950164d + "'", double1 == 0.7644456989950164d);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5792809126705765d), 57.295779251985515d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010110014795759223d) + "'", double2 == (-0.010110014795759223d));
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9996157480449777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02772279083371712d + "'", double1 == 0.02772279083371712d);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        double double1 = org.apache.commons.math.util.FastMath.cos((-29.801969570734137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.043147239384638006d) + "'", double1 == (-0.043147239384638006d));
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.6750163915861345d, (-0.10707716392528016d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.675016391586134d + "'", double2 == 4.675016391586134d);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0232758299736455d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5258789063684237E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258789064276357E-5d + "'", double1 == 1.5258789064276357E-5d);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 573);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 573 + "'", int2 == 573);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.464573725157382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.37875811820847d + "'", double1 == 9.37875811820847d);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.13524400261494204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12684760810589946d + "'", double1 == 0.12684760810589946d);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110654506974416E-19d + "'", double1 == 1.2110654506974416E-19d);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.54930615400752d + "'", double1 == 10.54930615400752d);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-2L), 6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3217505543966422d) + "'", double2 == (-0.3217505543966422d));
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3953889504077017d, 96.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3953889504077017d + "'", double2 == 1.3953889504077017d);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.42012681275810204d, 1.5707955344160478d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25609884107417175d + "'", double2 == 0.25609884107417175d);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8267087199189199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6908159092322977d + "'", double1 == 0.6908159092322977d);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.735436873328441d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8035486307140491d) + "'", double1 == (-0.8035486307140491d));
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.35885894357174647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.0554544523933395E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999816658d + "'", double1 == 0.9999999999816658d);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        double double1 = org.apache.commons.math.util.FastMath.sinh(72.28798294509544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.239487368601187E31d + "'", double1 == 1.239487368601187E31d);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0470934242082532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.899417119369014E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8994170381213606E-4d + "'", double1 == 2.8994170381213606E-4d);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3401110801853975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2286446715540403d + "'", double1 == 0.2286446715540403d);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        double double1 = org.apache.commons.math.util.FastMath.acosh(6.798196712620037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6043506968245094d + "'", double1 == 2.6043506968245094d);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0438252985430079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.596082767675576d + "'", double1 == 1.596082767675576d);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.01790380500454481d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0258124639856192d) + "'", double1 == (-1.0258124639856192d));
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.03843312210120447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03841421002450886d + "'", double1 == 0.03841421002450886d);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.04636973784987636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9989251163235675d + "'", double1 == 0.9989251163235675d);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9999999999999747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2533138212020356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533138212020358d + "'", double1 == 1.2533138212020358d);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.025678842914286692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025684489383558138d + "'", double1 == 0.025684489383558138d);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5403140444367246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        double double2 = org.apache.commons.math.util.FastMath.min((-3.5858845586028694d), 0.2510922586777372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.5858845586028694d) + "'", double2 == (-3.5858845586028694d));
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.518074431338224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5180744313382242d + "'", double1 == 1.5180744313382242d);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        double double1 = org.apache.commons.math.util.FastMath.ulp(44.78115991081385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9986502386334037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017429734739979972d + "'", double1 == 0.017429734739979972d);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.3554049701598595E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.474255056510812d) + "'", double1 == (-6.474255056510812d));
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4080069217490346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43321775502441545d + "'", double1 == 0.43321775502441545d);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9877735581754346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.0679515313825692E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0679515313825692E-25d + "'", double1 == 2.0679515313825692E-25d);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        double double1 = org.apache.commons.math.util.FastMath.log10(99.98991284675515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9999561898404403d + "'", double1 == 1.9999561898404403d);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        long long1 = org.apache.commons.math.util.FastMath.abs(38L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 38L + "'", long1 == 38L);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.551115123125783E-17d, 0.7410405809129375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.993445053121845E-13d + "'", double2 == 8.993445053121845E-13d);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8373830985134536d + "'", double1 == 0.8373830985134536d);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1261966.2318521831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261967.0d + "'", double1 == 1261967.0d);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9136034117448754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.970329505706851d + "'", double1 == 0.970329505706851d);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.12684760810589946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999999997709829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471804454368d + "'", double1 == 0.6931471804454368d);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6751788539128234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8108288062597232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8108288062597232d + "'", double1 == 0.8108288062597232d);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5292064628230686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9279056024825724d + "'", double1 == 0.9279056024825724d);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6042895701620367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47268102317694594d + "'", double1 == 0.47268102317694594d);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6674619946174979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6189946455347085d + "'", double1 == 0.6189946455347085d);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        double double1 = org.apache.commons.math.util.FastMath.signum((-5.693388459081093d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.003358054049998483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05794871914027507d + "'", double1 == 0.05794871914027507d);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.6916735960213485E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.9459101490553132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2891227831726425d + "'", double1 == 0.2891227831726425d);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.9484831895170822d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.520586644733795d + "'", double1 == 2.520586644733795d);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        long long1 = org.apache.commons.math.util.FastMath.round((-3.843257992499208E-4d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 8.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.30264054181560024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29820130685016655d + "'", double1 == 0.29820130685016655d);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.11482578710300392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4860487273861172d + "'", double1 == 0.4860487273861172d);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(14.741329353331304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 844.6159563581988d + "'", double1 == 844.6159563581988d);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.355404970159859E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9999999999999746d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.557407724654815d) + "'", double1 == (-1.557407724654815d));
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.0d), 1.2265357086400204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0206781281751491d) + "'", double2 == (-1.0206781281751491d));
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.924115048159362E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9640275800758168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5792809126705765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.172527850990744d + "'", double1 == 1.172527850990744d);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6592827871476782d + "'", double1 == 0.6592827871476782d);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 9223372036854775807L, 0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.2233720368547748E18d + "'", double2 == 9.2233720368547748E18d);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4593566380802732d + "'", double1 == 1.4593566380802732d);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        double double1 = org.apache.commons.math.util.FastMath.log(26.00961538461539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2584662921392096d + "'", double1 == 3.2584662921392096d);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3675220813204314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1269280110429727d + "'", double1 == 2.1269280110429727d);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.18115285874844744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18317440686560532d + "'", double1 == 0.18317440686560532d);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2105.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13371050230626771d) + "'", double1 == (-0.13371050230626771d));
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9256440224479643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0636083985381795d + "'", double1 == 1.0636083985381795d);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.025678843658570077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1602461970174958d + "'", double1 == 0.1602461970174958d);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7307952105240656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.076731389884332d + "'", double1 == 1.076731389884332d);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0547920720722763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7836624457399028d + "'", double1 == 0.7836624457399028d);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0486237723781806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.781270733495882d + "'", double1 == 0.781270733495882d);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7095540048557133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-40.65444981483749d) + "'", double1 == (-40.65444981483749d));
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.1061285321866012d), (double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10612853218660119d) + "'", double2 == (-0.10612853218660119d));
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        double double1 = org.apache.commons.math.util.FastMath.abs(117.61174253155805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 117.61174253155805d + "'", double1 == 117.61174253155805d);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4371344463413933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8931193992435265d + "'", double1 == 0.8931193992435265d);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        double double2 = org.apache.commons.math.util.FastMath.max(1.565404923404685d, 3.357052182357205E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.565404923404685d + "'", double2 == 1.565404923404685d);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7359704175800968d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        long long1 = org.apache.commons.math.util.FastMath.round(5.050000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4757278705561235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4957913555252836d + "'", double1 == 0.4957913555252836d);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5211141550652623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04966173568391586d + "'", double1 == 0.04966173568391586d);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7416901480811822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6381615560800912d + "'", double1 == 0.6381615560800912d);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.44760755429150645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7649489787787463d + "'", double1 == 0.7649489787787463d);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        double double1 = org.apache.commons.math.util.FastMath.floor(65.16375280274023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.0d + "'", double1 == 65.0d);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5645645685050509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2857068927136726d + "'", double1 == 2.2857068927136726d);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.017136498885300926d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.903137390602939E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.903137390602939E-19d + "'", double1 == 5.903137390602939E-19d);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.18115285874844744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.824846554803807E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.824846225420071E-4d + "'", double1 == 5.824846225420071E-4d);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.976207021257726E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.3746156955164151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35843370322989837d) + "'", double1 == (-0.35843370322989837d));
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        long long1 = org.apache.commons.math.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.903137390602939E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577948946323d + "'", double1 == 572.9577948946323d);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0052820984669221145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005282098466922115d + "'", double1 == 0.005282098466922115d);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9866275920404841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-56.52959697507491d) + "'", double1 == (-56.52959697507491d));
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5557.395265851666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.54793938031867d + "'", double1 == 74.54793938031867d);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        int int2 = org.apache.commons.math.util.FastMath.min(26, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        long long2 = org.apache.commons.math.util.FastMath.min(97864804714L, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.893761324052697d, 0.866317614445707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.473695319958728d + "'", double2 == 1.473695319958728d);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9279056024825724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        double double2 = org.apache.commons.math.util.FastMath.max(7.073385839060845E-7d, (-2.4751129460689736d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.073385839060845E-7d + "'", double2 == 7.073385839060845E-7d);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.6384205222376984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 208.466140018005d + "'", double1 == 208.466140018005d);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2857068927136726d, (-0.9990920390306268d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9828744915858403d + "'", double2 == 1.9828744915858403d);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9097218402675803d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.6571831014265066E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6571831014265066E-4d + "'", double1 == 1.6571831014265066E-4d);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.607240273008231E12d, 2.9386097226368193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.60724027300823E12d + "'", double2 == 5.60724027300823E12d);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.716348056229995E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.38156029837415d + "'", double1 == 37.38156029837415d);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.359304092810529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2032742454744652d + "'", double1 == 1.2032742454744652d);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9158465150847866d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.29804177942641236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.347218072702102d + "'", double1 == 1.347218072702102d);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9819103918991889d, 1.5707956194563126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9717320044784657d + "'", double2 == 0.9717320044784657d);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-23.149651841415288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8355930950276944d) + "'", double1 == (-3.8355930950276944d));
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2110835568321545E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999266639d + "'", double1 == 0.9999999999266639d);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.2673631790022216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3111051691882221d) + "'", double1 == (-0.3111051691882221d));
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7219067166708869d) + "'", double1 == (-0.7219067166708869d));
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.840060340331501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7044288495501951d + "'", double1 == 1.7044288495501951d);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3384744041042738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3384744041042738d + "'", double1 == 1.3384744041042738d);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 9L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5700990765860825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02740339846894975d + "'", double1 == 0.02740339846894975d);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11.548739357257745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.398343619656162d + "'", double1 == 3.398343619656162d);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5501042757606859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.21580950969080773d, 1.776356839400252E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999972d + "'", double2 == 0.9999999999999972d);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, 22025.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        float float1 = org.apache.commons.math.util.FastMath.abs(57.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.050000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        int int1 = org.apache.commons.math.util.FastMath.round(57.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6346446623333779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.592891404615008d + "'", double1 == 0.592891404615008d);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3854204958440206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38542049584402066d + "'", double1 == 0.38542049584402066d);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9852843599720181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5526261428708923d + "'", double1 == 0.5526261428708923d);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.13524400261494204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.395663482186485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40679017491473757d + "'", double1 == 0.40679017491473757d);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.82276518977207E-20d, (-8.271228063367024d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0848620779738065E158d + "'", double2 == 1.0848620779738065E158d);
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.29153046097456287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2915304609745629d + "'", double1 == 0.2915304609745629d);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5700990765860825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9439444493648603d + "'", double1 == 0.9439444493648603d);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7359704175800968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9028593904094279d) + "'", double1 == (-0.9028593904094279d));
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        double double1 = org.apache.commons.math.util.FastMath.floor(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5812661035094697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010469585439389063d) + "'", double1 == (-0.010469585439389063d));
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2885829000440232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2427728858045115d) + "'", double1 == (-1.2427728858045115d));
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.3754758794263844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.636198082366448d + "'", double1 == 14.636198082366448d);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3227009165069088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.78518007393176d + "'", double1 == 75.78518007393176d);
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3032833236333146d, 0.019233306345811094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.019233306345811094d + "'", double2 == 0.019233306345811094d);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9442157056960554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8100372897558831d + "'", double1 == 0.8100372897558831d);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.653878486731224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.286032070646461d + "'", double1 == 1.286032070646461d);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        double double2 = org.apache.commons.math.util.FastMath.min(0.027715691434453935d, 0.6846624340993608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027715691434453935d + "'", double2 == 0.027715691434453935d);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1193272159135788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6946461479871102d + "'", double1 == 1.6946461479871102d);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9030612511435306d, 0.5791357593406526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9030612511435306d + "'", double2 == 0.9030612511435306d);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.9512437185814275d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        long long1 = org.apache.commons.math.util.FastMath.round(8.296722144923343d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.717237764496549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.717237764496549d + "'", double1 == 7.717237764496549d);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5473008271869906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4365120111136123d + "'", double1 == 0.4365120111136123d);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.247595209480447d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6552377416047082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8685596202237091d + "'", double1 == 0.8685596202237091d);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        long long2 = org.apache.commons.math.util.FastMath.max(18L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.0850005042632922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43968383668853217d) + "'", double1 == (-0.43968383668853217d));
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.016308471348987046d, 9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0016308456897390394d + "'", double2 == 0.0016308456897390394d);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.02320532867235397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023201164311237112d + "'", double1 == 0.023201164311237112d);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7165316160329993d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7785713669985503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7158477234221334d + "'", double1 == 0.7158477234221334d);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        double double1 = org.apache.commons.math.util.FastMath.sin(10.991338187845832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999910277430046d) + "'", double1 == (-0.9999910277430046d));
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        double double1 = org.apache.commons.math.util.FastMath.cos(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5266257059491419d + "'", double1 == 0.5266257059491419d);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8035486307140491d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.5136946405560185d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.057070660313307785d + "'", double1 == 0.057070660313307785d);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        double double1 = org.apache.commons.math.util.FastMath.tanh(117.61174253155805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        long long2 = org.apache.commons.math.util.FastMath.min(145L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8199744766146694d, 1.1373220393635002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8199744766146695d + "'", double2 == 0.8199744766146695d);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.11219328616561733d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11242999849270602d) + "'", double1 == (-0.11242999849270602d));
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.096453930081621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        double double2 = org.apache.commons.math.util.FastMath.max(0.47268102317694594d, 3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47268102317694594d + "'", double2 == 0.47268102317694594d);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.5706008419460695d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0398314119215128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03905859609139826d + "'", double1 == 0.03905859609139826d);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.333345269621085d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        double double1 = org.apache.commons.math.util.FastMath.acos(16384.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        float float1 = org.apache.commons.math.util.FastMath.abs(31.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 31.0f + "'", float1 == 31.0f);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.078927767113337d, 0.9142469191379081d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07892776711333702d + "'", double2 == 0.07892776711333702d);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.3689877298052193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3689877298052193d + "'", double2 == 1.3689877298052193d);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        double double2 = org.apache.commons.math.util.FastMath.min(4.806217383955855E-6d, 1.4651144277202135E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4651144277202135E-16d + "'", double2 == 1.4651144277202135E-16d);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7377936960093874E-61d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7377936960093874E-61d + "'", double1 == 1.7377936960093874E-61d);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        double double1 = org.apache.commons.math.util.FastMath.log((-6.041406849910749d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.1256138592702154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2857645798842487d + "'", double1 == 1.2857645798842487d);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.12963181746861624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.025673200539316265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025673200539316265d + "'", double1 == 0.025673200539316265d);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.583398179910364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9478899016727291d + "'", double1 == 0.9478899016727291d);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.1061285321866012d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 220.50287227348372d + "'", double1 == 220.50287227348372d);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        double double1 = org.apache.commons.math.util.FastMath.log(3.974903989667673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3800005942718698d + "'", double1 == 1.3800005942718698d);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.5706008419460695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.16883863257866716d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9819103918991889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6840612239368045d + "'", double1 == 0.6840612239368045d);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.11533380529205599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11584792671408882d + "'", double1 == 0.11584792671408882d);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        long long1 = org.apache.commons.math.util.FastMath.round(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 44L + "'", long1 == 44L);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.07892776711333702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.14436016288910877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1438634000260818d) + "'", double1 == (-0.1438634000260818d));
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.378163642308943E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11128.422256815777d + "'", double1 == 11128.422256815777d);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3877159156483166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36938946978079723d + "'", double1 == 0.36938946978079723d);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9122440868593062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7908790493650335d + "'", double1 == 0.7908790493650335d);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        double double1 = org.apache.commons.math.util.FastMath.abs(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.6625147656574195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        int int2 = org.apache.commons.math.util.FastMath.max(38, 573);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 573 + "'", int2 == 573);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        int int1 = org.apache.commons.math.util.FastMath.abs(57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0003564839175727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7192510249555393d + "'", double1 == 2.7192510249555393d);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.949874371066198d, 1.543080634815244d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.650779705255175d + "'", double2 == 34.650779705255175d);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6674619946174979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.10707716392528016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 9.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.536211111061281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5988224392024553d + "'", double1 == 0.5988224392024553d);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7307952105240656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9007381641682033d + "'", double1 == 0.9007381641682033d);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        double double1 = org.apache.commons.math.util.FastMath.signum((-6.4742592311448774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.12186934340514759d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12186934340514759d + "'", double1 == 0.12186934340514759d);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.12217304763960309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12187114015074264d + "'", double1 == 0.12187114015074264d);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2110835568321545E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110835568321547E-5d + "'", double1 == 1.2110835568321547E-5d);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6994983692632405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        double double1 = org.apache.commons.math.util.FastMath.log(3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3494089883469367d + "'", double1 == 1.3494089883469367d);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8030064940059782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.00888302813979d + "'", double1 == 46.00888302813979d);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8405693131513021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1169110613978732d + "'", double1 == 1.1169110613978732d);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6250369392251006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-6.041406849910749d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.286032070646461d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9007381641682033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.26207036451596d + "'", double1 == 1.26207036451596d);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.328306436538697E-10d + "'", double1 == 2.328306436538697E-10d);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8099371976588898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44488600522827d + "'", double1 == 0.44488600522827d);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        double double1 = org.apache.commons.math.util.FastMath.exp(19.34620097980911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5231805679783186E8d + "'", double1 == 2.5231805679783186E8d);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.549478463118442d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5775492543555664d) + "'", double1 == (-0.5775492543555664d));
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 2177.239621497128d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6946461479871102d, 2.38374066418898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.38374066418898d + "'", double2 == 2.38374066418898d);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6603469013500041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7897794929039231d + "'", double1 == 0.7897794929039231d);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        long long2 = org.apache.commons.math.util.FastMath.min(26L, (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.853988047997524d + "'", double1 == 0.853988047997524d);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.189442356607096E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2980417794264124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.718281827836512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6574544539067888d + "'", double1 == 1.6574544539067888d);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        double double2 = org.apache.commons.math.util.FastMath.min(0.39320825252632513d, 1.6430496853696097d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39320825252632513d + "'", double2 == 0.39320825252632513d);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        double double1 = org.apache.commons.math.util.FastMath.asinh(50.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.619035187754997d + "'", double1 == 4.619035187754997d);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9648525037059907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9648525037059907d + "'", double1 == 0.9648525037059907d);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9225239137279338E-5d, 2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9225239137279338E-5d + "'", double2 == 1.9225239137279338E-5d);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.519955384405313E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8368009637323028d) + "'", double1 == (-0.8368009637323028d));
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6042895701620367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5400948954987915d + "'", double1 == 0.5400948954987915d);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8931193992435265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8931193992435265d + "'", double1 == 0.8931193992435265d);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.6604007228000894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-95.13395371691644d) + "'", double1 == (-95.13395371691644d));
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2533138212020358d, 0.016479672913437944d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016479672913437944d + "'", double2 == 0.016479672913437944d);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.232630319679133d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.16725907543191326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1820604684682068d + "'", double1 == 1.1820604684682068d);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        double double1 = org.apache.commons.math.util.FastMath.expm1(8.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.9579870417283d + "'", double1 == 2979.9579870417283d);
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000142d + "'", double1 == 1.0000000000000142d);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        double double2 = org.apache.commons.math.util.FastMath.max(1.712891454807323d, (-3.516464347103154d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.712891454807323d + "'", double2 == 1.712891454807323d);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.025678842914286692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025678842914286695d + "'", double1 == 0.025678842914286695d);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        double double1 = org.apache.commons.math.util.FastMath.log10(22025.461748222762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.342925021856078d + "'", double1 == 4.342925021856078d);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.0920453164646635E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000837d + "'", double1 == 1.0000000000000837d);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.697765004828061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4430227241169228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9034600343951872d + "'", double1 == 0.9034600343951872d);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7805951733159243d, 5.159449696805132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7805951733159244d + "'", double2 == 0.7805951733159244d);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 38, 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.0034360783325428643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000059033229618d + "'", double1 == 1.0000059033229618d);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.89629601826829E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029711413080183918d + "'", double1 == 0.029711413080183918d);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 100.0f, (-2.2679048611920414d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.436278331420456d + "'", double1 == 1.436278331420456d);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        double double1 = org.apache.commons.math.util.FastMath.log(2.2919043892128173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8293830829792643d + "'", double1 == 0.8293830829792643d);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.2503203288452633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10915815991542903d + "'", double1 == 0.10915815991542903d);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 573, (float) 573L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-6.56811156719042E12d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        double double2 = org.apache.commons.math.util.FastMath.max(2.258046185049248d, 0.04744296789287678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.258046185049248d + "'", double2 == 2.258046185049248d);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 26);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 26.0f + "'", float1 == 26.0f);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.029647097861444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 116.29021260843672d + "'", double1 == 116.29021260843672d);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.026036584087129624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02604246991365352d + "'", double1 == 0.02604246991365352d);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.5707038251666727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707038251666727d + "'", double2 == 1.5707038251666727d);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.570796326379126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987691520022d + "'", double1 == 0.19611987691520022d);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.13371050230626771d), 0.1518086555466036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1518086555466036d + "'", double2 == 0.1518086555466036d);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4365120111136123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36221796077615454d + "'", double1 == 0.36221796077615454d);
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.0173104911493955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03520871010558088d + "'", double1 == 0.03520871010558088d);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 38.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.0d + "'", double1 == 38.0d);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.019234492165425023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.49849450465990564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49849450465990564d + "'", double1 == 0.49849450465990564d);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 573);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 573 + "'", int2 == 573);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2976454463101708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5263007573504037d) + "'", double1 == (-0.5263007573504037d));
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5292064628230686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2366108776907425d + "'", double1 == 1.2366108776907425d);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.027705053070945427d, 1.0009877980461306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027670648769195613d + "'", double2 == 0.027670648769195613d);
    }
}

