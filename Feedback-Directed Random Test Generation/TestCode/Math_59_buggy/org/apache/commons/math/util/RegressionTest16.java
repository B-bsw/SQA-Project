package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

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
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.6522336740340915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0963506817327155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.899417119369014E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8994171193690146E-4d + "'", double1 == 2.8994171193690146E-4d);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854778E18d + "'", double1 == 9.223372036854778E18d);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6090535823208306d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6090535823208306d + "'", double1 == 0.6090535823208306d);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.13997351035384709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0098122968053733d + "'", double1 == 1.0098122968053733d);
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.027670648769195613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5854113908637746d + "'", double1 == 1.5854113908637746d);
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 38);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.764160044617983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9961652815068444d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9648525037059907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3048815314103699d + "'", double1 == 1.3048815314103699d);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.782159649779516d + "'", double1 == 2.782159649779516d);
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 32L, 0.029949908321658922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5698603924331294d + "'", double2 == 1.5698603924331294d);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.46944266321560457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8918205598968713d + "'", double1 == 0.8918205598968713d);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.017902848520331135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017904761458085616d) + "'", double1 == (-0.017904761458085616d));
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 145, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        double double1 = org.apache.commons.math.util.FastMath.tanh(137.34414422946176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7268687239847369d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.039048665719590016d, 2.8332133440562157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013781593104919576d + "'", double2 == 0.013781593104919576d);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.3325401204690593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2565.7714645900714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.690080134215329d + "'", double1 == 13.690080134215329d);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.444667861009766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2019433684703145d + "'", double1 == 1.2019433684703145d);
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5323425837018869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5733416078768503d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6383260072387366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19495746080256454d) + "'", double1 == (-0.19495746080256454d));
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.408334722591744d, 0.7094902377818831d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4083347225917441d + "'", double2 == 0.4083347225917441d);
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.0011371729996371193d), 0.9818490617583829d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6823165548747481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8260245485908685d + "'", double1 == 0.8260245485908685d);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5887989736417515d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1932800507380152d + "'", double1 == 2.1932800507380152d);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.6291227665749557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9985923061026828d + "'", double1 == 0.9985923061026828d);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5974781997606962d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.77640662496864d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.03843312210120447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03843312210120447d + "'", double1 == 0.03843312210120447d);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4693643970957537d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3403843704464924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0411283785788545d + "'", double1 == 2.0411283785788545d);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.477336814478207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23289371728776143d) + "'", double1 == (-0.23289371728776143d));
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.5470689102278574d), 1.461419372308587d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.397107525138078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9213479352710031d) + "'", double1 == (-0.9213479352710031d));
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9623912578794126d, (-4.716136598735705d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9623912578794126d + "'", double2 == 0.9623912578794126d);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        double double2 = org.apache.commons.math.util.FastMath.min(1.6681507037242218d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2533138212020358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9030612511435305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7852261405049433d + "'", double1 == 0.7852261405049433d);
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3384744041042738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.101693129621601d + "'", double1 == 1.101693129621601d);
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.11041129351109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49281782011752945d + "'", double1 == 0.49281782011752945d);
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.025618622601251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0874466129197624d) + "'", double1 == (-3.0874466129197624d));
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6975744860120547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.968073944498414d + "'", double1 == 39.968073944498414d);
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-7L), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4365120111136124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4227811167173201d + "'", double1 == 0.4227811167173201d);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        double double1 = org.apache.commons.math.util.FastMath.log(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5293379817722996d + "'", double1 == 1.5293379817722996d);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 70368744177664L, (float) 252318064L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.52318064E8f + "'", float2 == 2.52318064E8f);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (short) -1, 1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.52587890625E-5d + "'", double2 == 1.52587890625E-5d);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2501327124042694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2554832911987143d + "'", double1 == 0.2554832911987143d);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.17410381825958643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16050514872231786d + "'", double1 == 0.16050514872231786d);
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.261646633260967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1822321700847158d + "'", double1 == 1.1822321700847158d);
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 26, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.9702919135521215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.999999999999986d + "'", double1 == 51.999999999999986d);
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6407814939389498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6855415188524085d) + "'", double1 == (-0.6855415188524085d));
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6813522939629808d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7496085578759729d) + "'", double1 == (-0.7496085578759729d));
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (-7L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.0d) + "'", double1 == (-7.0d));
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        long long2 = org.apache.commons.math.util.FastMath.max(6061L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0474607997439881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0486050947274312d + "'", double1 == 1.0486050947274312d);
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.003441988422769002d), (-0.0013377555385146107d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0034419884227690017d) + "'", double2 == (-0.0034419884227690017d));
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0895609743647756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2700305245105663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9551098989683715d + "'", double1 == 0.9551098989683715d);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6987456384434759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.01122831707001d + "'", double1 == 2.01122831707001d);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7925863873716607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23245377302423387d) + "'", double1 == (-0.23245377302423387d));
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.46656342243821886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9904761558980245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13812313260893225d + "'", double1 == 0.13812313260893225d);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.40508603762258366d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.010734328930361884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999423876444131d + "'", double1 == 0.9999423876444131d);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        long long2 = org.apache.commons.math.util.FastMath.min((-7L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7L) + "'", long2 == (-7L));
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        double double1 = org.apache.commons.math.util.FastMath.atanh(29.923020517919355d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 24L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707038251666727d, 4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000019030306d + "'", double2 == 1.000000019030306d);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8622926809699383d), 0.9964228836762624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7133601908261946d) + "'", double2 == (-0.7133601908261946d));
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.0772059364683248E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        long long1 = org.apache.commons.math.util.FastMath.abs(21L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 21L + "'", long1 == 21L);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.716461206378684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0471758442373165d + "'", double1 == 1.0471758442373165d);
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.0679515313825692E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0679515313825696E-25d + "'", double1 == 2.0679515313825696E-25d);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7616835171611754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3043794210067827d + "'", double1 == 1.3043794210067827d);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.00959020835021504d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.549478463118442d) + "'", double1 == (-0.549478463118442d));
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3131479741286372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9934155197087668d + "'", double1 == 1.9934155197087668d);
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6477149319066933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5747671681801312d + "'", double1 == 0.5747671681801312d);
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 6061);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6061L + "'", long1 == 6061L);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.09180265859838255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.780112592997408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9127535552074842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6115694833732153d + "'", double1 == 0.6115694833732153d);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3153778949771762d, 1.5707963267936307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3153778949771764d + "'", double2 == 1.3153778949771764d);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.004756300337967979d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5887989736417515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.230032955705395d) + "'", double1 == (-0.230032955705395d));
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6960734350155904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.120369769123427d + "'", double1 == 1.120369769123427d);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        double double1 = org.apache.commons.math.util.FastMath.sinh(22.326014307562925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4833322067277274E9d + "'", double1 == 2.4833322067277274E9d);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.666140437719325E21d, (-1.8418176412695313d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.0755196757053205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0536779445509261d + "'", double1 == 0.0536779445509261d);
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3265.0000000000005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 187070.7201102138d + "'", double1 == 187070.7201102138d);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.47516248865385863d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7803343343483228d) + "'", double1 == (-0.7803343343483228d));
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 88L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 88.0f + "'", float1 == 88.0f);
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9525849574608642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7611197186420408d + "'", double1 == 0.7611197186420408d);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 252318064L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 252318064 + "'", int1 == 252318064);
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3072816183413566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.953159315987153d + "'", double1 == 0.953159315987153d);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.6522336740340915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.589913436819202d) + "'", double1 == (-0.589913436819202d));
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.15268415727515278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1526841572751528d + "'", double1 == 0.1526841572751528d);
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1726310973781435d, (-1.233403117511217d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1726310973781435d + "'", double2 == 1.1726310973781435d);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3036378347354876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8344895406930911d + "'", double1 == 0.8344895406930911d);
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 57, (long) 6061);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6061L + "'", long2 == 6061L);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.999999995520374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999995520376d + "'", double1 == 9.999999995520376d);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        float float1 = org.apache.commons.math.util.FastMath.abs(18.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 18.0f + "'", float1 == 18.0f);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        double double1 = org.apache.commons.math.util.FastMath.log(0.050922739949144445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9774456978414334d) + "'", double1 == (-2.9774456978414334d));
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.757447703809722d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6984728684912337d, 96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99484522385717d + "'", double2 == 96.99484522385717d);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.5778020121309203E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5778020121309203E33d + "'", double1 == 2.5778020121309203E33d);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.021258600143870807d), (-0.0267884501723548d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0267884501723548d) + "'", double2 == (-0.0267884501723548d));
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.42614722344031464d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9996157480444497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430735359421346d + "'", double1 == 1.5430735359421346d);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.378742784442106d) + "'", double1 == (-7.378742784442106d));
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        double double1 = org.apache.commons.math.util.FastMath.exp(423.85042430535873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1909689201661917E184d + "'", double1 == 1.1909689201661917E184d);
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4766393240263169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.309421616676456d + "'", double1 == 27.309421616676456d);
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1169110613978732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.055401663508057d + "'", double1 == 3.055401663508057d);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.07140440247247d + "'", double1 == 36.07140440247247d);
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7151743879062039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5395147593587678d + "'", double1 == 0.5395147593587678d);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-7.470158750205857E-4d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        int int2 = org.apache.commons.math.util.FastMath.max(7, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        double double1 = org.apache.commons.math.util.FastMath.tanh(22.082967749701865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2885829000440232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.534582212168228d + "'", double1 == 16.534582212168228d);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        double double2 = org.apache.commons.math.util.FastMath.max(0.008377980417966557d, 1.5475868312936525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5475868312936525d + "'", double2 == 1.5475868312936525d);
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9995740182847914d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.42941052881510655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3108282473449602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.759577111061563d + "'", double1 == 3.759577111061563d);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, 18.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        long long1 = org.apache.commons.math.util.FastMath.round(1.000000000000564d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8169805481334202d, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8169805481334201d + "'", double2 == 0.8169805481334201d);
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9, (float) 2405171239L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4051712E9f + "'", float2 == 2.4051712E9f);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8592811670678461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.23318428806336d + "'", double1 == 49.23318428806336d);
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7459634284910276d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.037259332522805d + "'", double1 == 1.037259332522805d);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6870151974084779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8134229531940107d + "'", double1 == 0.8134229531940107d);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.6291227665749557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.629122766574956d + "'", double1 == 3.629122766574956d);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        double double1 = org.apache.commons.math.util.FastMath.asin(65.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1416876847493498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.1715099723401879d, 4.619035187754997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03711407449322506d + "'", double2 == 0.03711407449322506d);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 252318064L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.52318064E8f + "'", float2 == 2.52318064E8f);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.22337203685478E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2048.0d + "'", double1 == 2048.0d);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.9999561898404403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599118502706619d + "'", double1 == 1.2599118502706619d);
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.274123996952347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26755161558636115d + "'", double1 == 0.26755161558636115d);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5792809126705764d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7459634284910276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3702770400092708d) + "'", double1 == (-1.3702770400092708d));
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        float float2 = org.apache.commons.math.util.FastMath.min(18.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        long long1 = org.apache.commons.math.util.FastMath.round((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 573);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32830.48166099617d + "'", double1 == 32830.48166099617d);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.10915815991542903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10915815991542904d + "'", double1 == 0.10915815991542904d);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5402647332399916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6045293842815553d + "'", double1 == 0.6045293842815553d);
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999103740052037d) + "'", double1 == (-0.9999103740052037d));
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.01913259410521866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019316795055774244d + "'", double1 == 0.019316795055774244d);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7393910596966158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6287771131163347d + "'", double1 == 0.6287771131163347d);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.063180265289355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0631802652893552d + "'", double1 == 1.0631802652893552d);
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3891513396382057d, 0.9806829901996237d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37775910173659477d + "'", double2 == 0.37775910173659477d);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8237344352789204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014376878057673298d + "'", double1 == 0.014376878057673298d);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.233403117511217d), 1.1749455142537384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.233403117511217d) + "'", double2 == (-1.233403117511217d));
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.261725192512572E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.261725192512572E-19d + "'", double1 == 9.261725192512572E-19d);
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.00944988413518589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9765628692296336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        double double2 = org.apache.commons.math.util.FastMath.min(0.982933744815721d, 1.7357243515423462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.982933744815721d + "'", double2 == 0.982933744815721d);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3922026785961111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39220267859611113d + "'", double1 == 0.39220267859611113d);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3684785197548404d, 1.028815182787626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.028815182787626d + "'", double2 == 1.028815182787626d);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.896296018267967E13d, 104.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.227162898778971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3416329019087894d + "'", double1 == 1.3416329019087894d);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.022989228293811562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022993279121268483d + "'", double1 == 0.022993279121268483d);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.427768900977763E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.427768900977764E74d + "'", double1 == 5.427768900977764E74d);
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4894731122556734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5114854340796523d + "'", double1 == 0.5114854340796523d);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8236544498809605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014375482049125378d + "'", double1 == 0.014375482049125378d);
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.43361108619104427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 44L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        double double1 = org.apache.commons.math.util.FastMath.expm1(185.47866641176898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5674782450106557E80d + "'", double1 == 3.5674782450106557E80d);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.824846225420071E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999998303558371d + "'", double1 == 0.9999998303558371d);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8414709825806044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3754263855773785d + "'", double1 == 1.3754263855773785d);
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(416.60399367417324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.271111366571952d + "'", double1 == 7.271111366571952d);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5937881252841114d, 1.189207115002721d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.189207115002721d + "'", double2 == 1.189207115002721d);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2510922586777372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25109225867773727d + "'", double1 == 0.25109225867773727d);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.592891404615008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9996157480449777d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.020573130836222826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020573130836222826d + "'", double2 == 0.020573130836222826d);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9153412831308465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9709443748973418d + "'", double1 == 0.9709443748973418d);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0471758442373165d, 11013.232874703392d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.508341946412625E-5d + "'", double2 == 9.508341946412625E-5d);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 18, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6060.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.76695267085637d + "'", double1 == 105.76695267085637d);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.8634651242655194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.420029280006169d) + "'", double1 == (-1.420029280006169d));
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9709393822234023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016946089057078072d + "'", double1 == 0.016946089057078072d);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        float float2 = org.apache.commons.math.util.FastMath.min(44.0f, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.44395208930645685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.762860921275018d + "'", double1 == 0.762860921275018d);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.592891404615008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.77462798227501d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0135198087687792d) + "'", double1 == (-0.0135198087687792d));
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8032290633000474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        double double2 = org.apache.commons.math.util.FastMath.pow(10.991338187845834d, 0.1690062794301309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4994917602860767d + "'", double2 == 1.4994917602860767d);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.017480437429290896d, 2.520368950567552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0174804374292909d + "'", double2 == 0.0174804374292909d);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9225054335922256E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5968020998202846d + "'", double1 == 0.5968020998202846d);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7370529091738743d), 7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0393469217744312E-249d) + "'", double2 == (-1.0393469217744312E-249d));
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1703428488012644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9208843066558391d + "'", double1 == 0.9208843066558391d);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0471758442373165d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7330383821741316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.8428599996679864E24d, 3.8545352927414394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8107709146380932E94d + "'", double2 == 1.8107709146380932E94d);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.17814068151824805d, 2.733677467944594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008950102194420759d + "'", double2 == 0.008950102194420759d);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.806217383900344E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.318196590067012d) + "'", double1 == (-5.318196590067012d));
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.022989228293811562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023255517280065433d + "'", double1 == 0.023255517280065433d);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9028593904094279d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01575786904519343d) + "'", double1 == (-0.01575786904519343d));
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8758577137362273d), 0.006766867647289856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8758577137362273d) + "'", double2 == (-0.8758577137362273d));
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.18950492734531413d, (-0.9999999999999746d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.276907645666474d + "'", double2 == 5.276907645666474d);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.8002419211835452d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.02669432190897104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026341177789841626d) + "'", double1 == (-0.026341177789841626d));
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.02455809351027681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.84585047808035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3795753676207831d + "'", double1 == 1.3795753676207831d);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.014382967415158656d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6218099972365793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5825073257289527d + "'", double1 == 0.5825073257289527d);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999923903252116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1169110613978732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8064918000376506d + "'", double1 == 0.8064918000376506d);
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7433358671192637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        double double1 = org.apache.commons.math.util.FastMath.ulp(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8089086830966221d, (double) 4.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8089086830966222d + "'", double2 == 0.8089086830966222d);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707963267936305d, 0.047514327475808714d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.540556986954528d + "'", double2 == 1.540556986954528d);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.4928804097777624E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2121306115084953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8373174648948869d + "'", double1 == 0.8373174648948869d);
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-7L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5816161669572506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.191510382551503d + "'", double1 == 2.191510382551503d);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.0393469217744312E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0393469217744312E-249d) + "'", double1 == (-1.0393469217744312E-249d));
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6894104737616445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9925405320054786d + "'", double1 == 0.9925405320054786d);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        float float1 = org.apache.commons.math.util.FastMath.abs(88.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 88.0f + "'", float1 == 88.0f);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.198083698874328E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8192337173071638d + "'", double1 == 0.8192337173071638d);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.3325401204690593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.717099897902571d + "'", double1 == 0.717099897902571d);
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        float float2 = org.apache.commons.math.util.FastMath.max((-5.0f), (float) 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8203867151263053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014318449318574797d) + "'", double1 == (-0.014318449318574797d));
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.013459592477606882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.04744296789287678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04742517217871524d + "'", double1 == 0.04742517217871524d);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.25557896783025d + "'", double1 == 70.25557896783025d);
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        long long1 = org.apache.commons.math.util.FastMath.round(0.010703208866066098d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5706217762642902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.98999899128448d + "'", double1 == 89.98999899128448d);
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.03467616460044844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000601278442d + "'", double1 == 1.000601278442d);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        long long2 = org.apache.commons.math.util.FastMath.min((-5L), (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.260882740708347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.591552284503315d + "'", double1 == 8.591552284503315d);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        double double1 = org.apache.commons.math.util.FastMath.sinh(23.47295752174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.818904883224629E9d + "'", double1 == 7.818904883224629E9d);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5937881252841114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.181533252594591d + "'", double1 == 1.181533252594591d);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4362355307740595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9835078296932542d + "'", double1 == 1.9835078296932542d);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.19655672755619258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2172043679489204d + "'", double1 == 0.2172043679489204d);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.65685424949238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9964228836762624d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.26755161558636115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27085111057860184d + "'", double1 == 0.27085111057860184d);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.15179996136176638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        int int1 = org.apache.commons.math.util.FastMath.abs(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        double double2 = org.apache.commons.math.util.FastMath.min(0.004302852580113831d, 0.2937272068925049d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004302852580113831d + "'", double2 == 0.004302852580113831d);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.8205576256903795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06668130983047423d + "'", double1 == 0.06668130983047423d);
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7766609160650201d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-44.49939260328993d) + "'", double1 == (-44.49939260328993d));
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8169805481334201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.263654512325672d + "'", double1 == 2.263654512325672d);
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.798432482299821E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8089086830966222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01411811986800746d + "'", double1 == 0.01411811986800746d);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8414709825806044d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        double double1 = org.apache.commons.math.util.FastMath.acos(11.548739357257746d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999860498800671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        long long1 = org.apache.commons.math.util.FastMath.round(1.448317288402091d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.435597088531952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07741577348675698d + "'", double1 == 0.07741577348675698d);
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-4.945371607655668E36d), 0.07900994566488992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.14336970329182389d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1443601628891088d) + "'", double1 == (-0.1443601628891088d));
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 44, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.14524381079801105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6061L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 6061);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.18838862103418863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5775492543555664d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5208818956630829d) + "'", double1 == (-0.5208818956630829d));
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.4315459888945143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4450658763843532d) + "'", double1 == (-0.4450658763843532d));
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        double double1 = org.apache.commons.math.util.FastMath.log(4.9617267167450815E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.25862585439924d + "'", double1 == 52.25862585439924d);
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(151.2644211956603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8666.81292500057d + "'", double1 == 8666.81292500057d);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        int int2 = org.apache.commons.math.util.FastMath.min(6061, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.3217505543966422d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9486832980505138d + "'", double1 == 0.9486832980505138d);
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        double double1 = org.apache.commons.math.util.FastMath.expm1(26.00961538461539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9762070212477264E11d + "'", double1 == 1.9762070212477264E11d);
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.0214659450282346d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.796016763369322d) + "'", double1 == (-0.796016763369322d));
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.048623772378180656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.486449227395259E-4d + "'", double1 == 8.486449227395259E-4d);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 31L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1664909604641016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16726988328881526d + "'", double1 == 0.16726988328881526d);
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        double double2 = org.apache.commons.math.util.FastMath.max(2.397107525138078d, 0.9092974268256818d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.397107525138078d + "'", double2 == 2.397107525138078d);
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6250369392251006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5546252992521606d + "'", double1 == 0.5546252992521606d);
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8089086830966221d, 0.9640275800758168d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8089086830966221d + "'", double2 == 0.8089086830966221d);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, (float) 14L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4651144277202135E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4651144277202135E-16d + "'", double1 == 1.4651144277202135E-16d);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6994983692632405d, 0.0474607997439881d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0474607997439881d + "'", double2 == 0.0474607997439881d);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.3580540499984855E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.35805398688651E-4d + "'", double1 == 3.35805398688651E-4d);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4693643970957537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16712951261998335d + "'", double1 == 0.16712951261998335d);
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.217963665598969d + "'", double1 == 1.217963665598969d);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.012933598027822206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7410405809129375d + "'", double1 == 0.7410405809129375d);
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6218099972365793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.716645036486314d + "'", double1 == 0.716645036486314d);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        int int2 = org.apache.commons.math.util.FastMath.max(6061, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6061 + "'", int2 == 6061);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.70197740328915E-38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.206498704176892E-40d + "'", double1 == 8.206498704176892E-40d);
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8813735870195252d), (-0.017604807315766753d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8813735870195251d) + "'", double2 == (-0.8813735870195251d));
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6855415188524085d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3771116715785444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3866757288323445d + "'", double1 == 0.3866757288323445d);
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-6.4742592311448774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-370.94772941821475d) + "'", double1 == (-370.94772941821475d));
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        double double1 = org.apache.commons.math.util.FastMath.cos(10.69310178011491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29788137754031907d) + "'", double1 == (-0.29788137754031907d));
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3072816183413566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2584612042072416d + "'", double1 == 1.2584612042072416d);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9703295057068511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9850530471537312d + "'", double1 == 0.9850530471537312d);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0033524283771879993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003352422097687813d + "'", double1 == 0.003352422097687813d);
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5486825246672982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5401776706283433E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.04822696504081d + "'", double1 == 104.04822696504081d);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 573, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.17814068151824805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42206715285396d + "'", double1 == 0.42206715285396d);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9694911126077237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03098397132677646d) + "'", double1 == (-0.03098397132677646d));
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-4.716132424155146d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7805951733159244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.535856475922823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.018258696658209093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.186743738086344E-4d + "'", double1 == 3.186743738086344E-4d);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        double double2 = org.apache.commons.math.util.FastMath.atan2(319.8834925338725d, 1.564865991609037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5659043784915472d + "'", double2 == 1.5659043784915472d);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6881824710286039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.602750627100152d) + "'", double1 == (-0.602750627100152d));
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.172148047597968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.777117472048689d + "'", double1 == 8.777117472048689d);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9957890945476039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0805585454182745d + "'", double1 == 3.0805585454182745d);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7953789955635642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7290557895569716d + "'", double1 == 0.7290557895569716d);
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9074644222731123d, 1.5707955344160478d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7576537376554007d + "'", double2 == 2.7576537376554007d);
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3132616875182228d, 1164.1175712113197d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0011281172648607977d + "'", double2 == 0.0011281172648607977d);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        long long2 = org.apache.commons.math.util.FastMath.max(252318064L, 70368744177664L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 70368744177664L + "'", long2 == 70368744177664L);
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-3.1214098374803794E-44d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (short) 10, 0.6983555819361141d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.37265448204541224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.070242962723665d + "'", double1 == 1.070242962723665d);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.004756300337967979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004756300337967979d + "'", double1 == 0.004756300337967979d);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        int int1 = org.apache.commons.math.util.FastMath.round(18.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2781825699829986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24543920176413073d + "'", double1 == 0.24543920176413073d);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07587629588596118d + "'", double1 == 0.07587629588596118d);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.094712547261101d + "'", double1 == 2.094712547261101d);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8368009637323028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3710312336377286d + "'", double1 == 1.3710312336377286d);
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7162992214244817d, (double) 6061.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7162992214244818d + "'", double2 == 0.7162992214244818d);
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 809.0886869668323d + "'", double1 == 809.0886869668323d);
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        int int2 = org.apache.commons.math.util.FastMath.min(14, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.005930300425384097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0350326805537281E-4d + "'", double1 == 1.0350326805537281E-4d);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5632046291841053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027283067661679677d + "'", double1 == 0.027283067661679677d);
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.1500253585642916d), 4.48863636973214d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.15002535856429158d) + "'", double2 == (-0.15002535856429158d));
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.920960112236651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.17597003220072988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17506327198083801d + "'", double1 == 0.17506327198083801d);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5707775369683652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        double double2 = org.apache.commons.math.util.FastMath.max(1.217963665598969d, 1.9459101490553132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9459101490553132d + "'", double2 == 1.9459101490553132d);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5773024999492183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7812270842136727d + "'", double1 == 0.7812270842136727d);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        long long2 = org.apache.commons.math.util.FastMath.max(9L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3026405418156002d, 0.017454071817960312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017454071817960312d + "'", double2 == 0.017454071817960312d);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5403057526408277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1495508594130641d + "'", double1 == 1.1495508594130641d);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.043456497483734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2689810367809309d + "'", double1 == 1.2689810367809309d);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 18L, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1050481441584241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6752823835417388d + "'", double1 == 1.6752823835417388d);
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        double double1 = org.apache.commons.math.util.FastMath.log(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.6035750265302235d + "'", double1 == 7.6035750265302235d);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6842868307608122d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7377936960093874E-61d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.454467422037778E-77d + "'", double1 == 3.454467422037778E-77d);
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6022261743924853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        int int2 = org.apache.commons.math.util.FastMath.min(573, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999999998054523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023060318459d + "'", double1 == 0.5403023060318459d);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.43747530300863346d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.467699925813914d) + "'", double1 == (-0.467699925813914d));
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        double double1 = org.apache.commons.math.util.FastMath.rint(11.548739357257745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.0429318112613317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4626719456900756d + "'", double1 == 1.4626719456900756d);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.0034360850939669095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034360783325109324d) + "'", double1 == (-0.0034360783325109324d));
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6507779951543294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6953504051162575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7689073597099995d + "'", double1 == 0.7689073597099995d);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5904245494217928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9202144007992752d) + "'", double1 == (-0.9202144007992752d));
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3777732767106265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9429581799620673d + "'", double1 == 0.9429581799620673d);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7254630513334037d + "'", double1 == 1.7254630513334037d);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.2863121968974662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        double double1 = org.apache.commons.math.util.FastMath.floor(26.00961538461539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.0d + "'", double1 == 26.0d);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.757373373600886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9850530471537312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.439382198410065d + "'", double1 == 56.439382198410065d);
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        double double1 = org.apache.commons.math.util.FastMath.log10(23.47295752174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3705678128390975d + "'", double1 == 1.3705678128390975d);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9763608754884531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9763608754884531d + "'", double1 == 0.9763608754884531d);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9949723229224731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.704649483450097d + "'", double1 == 2.704649483450097d);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2396109578603927d + "'", double1 == 2.2396109578603927d);
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.047478595403964284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04751430328761029d + "'", double1 == 0.04751430328761029d);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-3.1214098374803794E-44d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.826090850019643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.051646920459275d + "'", double1 == 2.051646920459275d);
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        double double1 = org.apache.commons.math.util.FastMath.floor(5768.06833196359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5768.0d + "'", double1 == 5768.0d);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.31381977877042333d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5887989736417516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.555362640229557d + "'", double1 == 0.555362640229557d);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8918205598968713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.16666666666666666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.0772059364683248E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.46612258567652d + "'", double1 == 38.46612258567652d);
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 97864804714L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        double double1 = org.apache.commons.math.util.FastMath.asinh(22.46077005725419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8054126007489795d + "'", double1 == 3.8054126007489795d);
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        long long2 = org.apache.commons.math.util.FastMath.max(44L, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        float float2 = org.apache.commons.math.util.FastMath.min(2.52318064E8f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        double double1 = org.apache.commons.math.util.FastMath.ulp(89.98999899128448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3416329019087894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.227162898778971d + "'", double1 == 0.227162898778971d);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8148580335308185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3507785698429924d + "'", double1 == 1.3507785698429924d);
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        double double1 = org.apache.commons.math.util.FastMath.signum((-6.56811156719042E12d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8206232337472084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0730536793306322d + "'", double1 == 1.0730536793306322d);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8772827919571973d, 0.5836293809324178d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5836293809324178d + "'", double2 == 0.5836293809324178d);
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.4091896264064065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24434121060991826d + "'", double1 == 0.24434121060991826d);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5546252992521606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5295292477045612d + "'", double1 == 0.5295292477045612d);
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 252318064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5508032856724236d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5011220152577573d) + "'", double1 == (-0.5011220152577573d));
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6931471804454368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999999770983d + "'", double1 == 0.999999999770983d);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9960434131864047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.707547959166626d + "'", double1 == 2.707547959166626d);
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.748480575315297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7327237226262463d + "'", double1 == 0.7327237226262463d);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.13812313260893225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0095541749481223d + "'", double1 == 1.0095541749481223d);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.2233720368547748E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0000000000000564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000282d + "'", double1 == 1.0000000000000282d);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.015955941794861567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015957296087205166d + "'", double1 == 0.015957296087205166d);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4386368936167206d, 0.02321157953304928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4386368936167206d + "'", double2 == 0.4386368936167206d);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9852843599720181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5081249405686994d + "'", double1 == 1.5081249405686994d);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.109913766657001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.187253120449862d + "'", double1 == 11.187253120449862d);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        double double1 = org.apache.commons.math.util.FastMath.sinh(157.76352969722723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6398359282348776E68d + "'", double1 == 1.6398359282348776E68d);
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6657142123412991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707963129646567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987320636162d + "'", double1 == 0.19611987320636162d);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.5740143590154496E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5740143590154496E-17d + "'", double1 == 3.5740143590154496E-17d);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.129274398827451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.848062556598485d + "'", double1 == 0.848062556598485d);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.798196712620037d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.02048667164338245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.02069796392607d + "'", double1 == 1.02069796392607d);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.02069796392607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.02069796392607d + "'", double1 == 1.02069796392607d);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7457592412576343d) + "'", double1 == (-0.7457592412576343d));
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.834741096244351d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014568980531170799d) + "'", double1 == (-0.014568980531170799d));
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        long long2 = org.apache.commons.math.util.FastMath.max(252318057L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318057L + "'", long2 == 252318057L);
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4679136108514075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0838677999087907d + "'", double1 == 1.0838677999087907d);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999999999675754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999675755d + "'", double1 == 0.9999999999675755d);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089409E-8d + "'", double1 == 4.214684851089409E-8d);
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        double double1 = org.apache.commons.math.util.FastMath.exp(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3314536537354545E42d + "'", double1 == 1.3314536537354545E42d);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.361853049433758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.361853049433758d + "'", double1 == 1.361853049433758d);
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6595834124225789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01151190223831367d + "'", double1 == 0.01151190223831367d);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5709620451035222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.23289371728776143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2328937172877614d) + "'", double1 == (-0.2328937172877614d));
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.668456226237483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6684562262374831d + "'", double1 == 0.6684562262374831d);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        int int2 = org.apache.commons.math.util.FastMath.min(38, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.49849450465990564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1268427362473763d + "'", double1 == 1.1268427362473763d);
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 145, 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9710527319006851d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        int int2 = org.apache.commons.math.util.FastMath.max(26, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5611212455169257d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1726310973781435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0636083985381795d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.4833322067277274E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963263922118d + "'", double1 == 1.5707963263922118d);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.09507068650612026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09492805084579563d + "'", double1 == 0.09492805084579563d);
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-22.790761408083426d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1305.8144405728135d) + "'", double1 == (-1305.8144405728135d));
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7603734074051981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5325081704970691d) + "'", double1 == (-0.5325081704970691d));
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.570490128690081d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9835078296932542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9835078296932542d + "'", double1 == 1.9835078296932542d);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7811284620871497d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.467267466445614d + "'", double1 == 2.467267466445614d);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4692606193559588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.18243249387379d + "'", double1 == 84.18243249387379d);
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.02077447867535781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6258305327034395E-4d + "'", double1 == 3.6258305327034395E-4d);
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8185970499987356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9131333407359165d + "'", double1 == 0.9131333407359165d);
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.07959101875688647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2821188025582245d + "'", double1 == 0.2821188025582245d);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2915304609745629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00508816641386296d + "'", double1 == 0.00508816641386296d);
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.1414757783667606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.137988217209347d + "'", double1 == 23.137988217209347d);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        double double2 = org.apache.commons.math.util.FastMath.min(0.25533087064513765d, 0.9777313730176922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25533087064513765d + "'", double2 == 0.25533087064513765d);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.197511737224069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8241478787897265d + "'", double1 == 1.8241478787897265d);
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        long long1 = org.apache.commons.math.util.FastMath.round(1.164006151880159d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 573);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000736613927508d + "'", double1 == 10.000736613927508d);
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        long long1 = org.apache.commons.math.util.FastMath.abs(3L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.230532564718819E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.789555525379853d + "'", double1 == 18.789555525379853d);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.666140437719325E21d, 1.2265357086400204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6661404377193246E21d + "'", double2 == 3.6661404377193246E21d);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        double double2 = org.apache.commons.math.util.FastMath.atan2(19.0d, 4.654592440028928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3305492899811646d + "'", double2 == 1.3305492899811646d);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.77462798227501d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        double double1 = org.apache.commons.math.util.FastMath.log(1.414973347970818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34711069556150104d + "'", double1 == 0.34711069556150104d);
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.984807753012208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4362460537158763d + "'", double1 == 2.4362460537158763d);
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.84585047808035d), 1.7273406689256667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8458504780803499d) + "'", double2 == (-0.8458504780803499d));
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(25.306852819445986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9359323643709385d + "'", double1 == 2.9359323643709385d);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.07657274203834082d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.920960112236651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.029647097861444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1084461433855373d + "'", double1 == 1.1084461433855373d);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.638420522237698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9074644222731123d + "'", double1 == 1.9074644222731123d);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8241478787897265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2088909653991513d + "'", double1 == 1.2088909653991513d);
    }
}

