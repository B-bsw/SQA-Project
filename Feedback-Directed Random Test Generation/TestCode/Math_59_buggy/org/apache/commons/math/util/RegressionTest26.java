package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

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
    public void test13001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13001");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5780308183687116d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test13002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13002");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test13003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13003");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4709296116188755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5091359286868075d + "'", double1 == 0.5091359286868075d);
    }

    @Test
    public void test13004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13004");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9771057199762778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1025275752909531d + "'", double1 == 1.1025275752909531d);
    }

    @Test
    public void test13005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13005");
        double double1 = org.apache.commons.math.util.FastMath.floor(2097152.0000000005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2097152.0d + "'", double1 == 2097152.0d);
    }

    @Test
    public void test13006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13006");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5707008595346152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5608900953347472d) + "'", double1 == (-0.5608900953347472d));
    }

    @Test
    public void test13007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13007");
        double double1 = org.apache.commons.math.util.FastMath.sin(603.1587393940363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02704679653111138d) + "'", double1 == (-0.02704679653111138d));
    }

    @Test
    public void test13008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13008");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.983606621708336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.289079657662799d + "'", double1 == 2.289079657662799d);
    }

    @Test
    public void test13009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13009");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test13010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13010");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.9246629085368494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2413380082851593d + "'", double1 == 1.2413380082851593d);
    }

    @Test
    public void test13011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13011");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0159090561693984d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13012");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(10.69310178011491d, 9.623785737698326E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.693101780114908d + "'", double2 == 10.693101780114908d);
    }

    @Test
    public void test13013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13013");
        double double2 = org.apache.commons.math.util.FastMath.min((-11.38587492474475d), (-1.6571830862563444E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-11.38587492474475d) + "'", double2 == (-11.38587492474475d));
    }

    @Test
    public void test13014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13014");
        int int2 = org.apache.commons.math.util.FastMath.max(22025, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test13015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13015");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.047568020491626006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04871753297741368d + "'", double1 == 0.04871753297741368d);
    }

    @Test
    public void test13016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13016");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test13017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13017");
        double double2 = org.apache.commons.math.util.FastMath.min(3.3541424281629695d, 0.3061772933911105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3061772933911105d + "'", double2 == 0.3061772933911105d);
    }

    @Test
    public void test13018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13018");
        double double1 = org.apache.commons.math.util.FastMath.sin(13.110581167104948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5177428511368601d + "'", double1 == 0.5177428511368601d);
    }

    @Test
    public void test13019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13019");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2105 + "'", int2 == 2105);
    }

    @Test
    public void test13020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13020");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9228015395339156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8257193917990734d + "'", double1 == 0.8257193917990734d);
    }

    @Test
    public void test13021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13021");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5975638469446122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13022");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.702262890231486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.361254438841193d + "'", double1 == 1.361254438841193d);
    }

    @Test
    public void test13023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13023");
        double double1 = org.apache.commons.math.util.FastMath.atan(15.154093508474027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.504903089822128d + "'", double1 == 1.504903089822128d);
    }

    @Test
    public void test13024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13024");
        int int2 = org.apache.commons.math.util.FastMath.max(22025, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test13025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13025");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-8.70522113787048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999450748849d) + "'", double1 == (-0.9999999450748849d));
    }

    @Test
    public void test13026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13026");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0095541749481223d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test13027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13027");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test13028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13028");
        int int2 = org.apache.commons.math.util.FastMath.max(2105, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2105 + "'", int2 == 2105);
    }

    @Test
    public void test13029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13029");
        double double1 = org.apache.commons.math.util.FastMath.asin(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13030");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5435393044832875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4340780291537025d + "'", double1 == 0.4340780291537025d);
    }

    @Test
    public void test13031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13031");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8524700138162723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7731182873282435d + "'", double1 == 0.7731182873282435d);
    }

    @Test
    public void test13032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13032");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8213843305800421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test13033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13033");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7703989319318401d), 0.5239029773179922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5239029773179922d + "'", double2 == 0.5239029773179922d);
    }

    @Test
    public void test13034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13034");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-36.912814250652346d), 1.5401776706283433E45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-36.91281425065234d) + "'", double2 == (-36.91281425065234d));
    }

    @Test
    public void test13035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13035");
        double double2 = org.apache.commons.math.util.FastMath.max(9.616441887145511E102d, 0.49087059928372606d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.616441887145511E102d + "'", double2 == 9.616441887145511E102d);
    }

    @Test
    public void test13036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13036");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5451146601807795d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13037");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-42.13742894001701d), 0.16595398048800908d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-42.137428940017d) + "'", double2 == (-42.137428940017d));
    }

    @Test
    public void test13038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13038");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.661006041483758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7893750108307137d + "'", double1 == 0.7893750108307137d);
    }

    @Test
    public void test13039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13039");
        double double2 = org.apache.commons.math.util.FastMath.atan2(59.817214750406706d, 32.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0795710440799429d + "'", double2 == 1.0795710440799429d);
    }

    @Test
    public void test13040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13040");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test13041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13041");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.25650571966039964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5064639371765769d + "'", double1 == 0.5064639371765769d);
    }

    @Test
    public void test13042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13042");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6098494453571868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.94179935736092d) + "'", double1 == (-34.94179935736092d));
    }

    @Test
    public void test13043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13043");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7202126291763723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.624163073879524d + "'", double1 == 0.624163073879524d);
    }

    @Test
    public void test13044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13044");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.06230646868508781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06226622566523778d) + "'", double1 == (-0.06226622566523778d));
    }

    @Test
    public void test13045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13045");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 65L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test13046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13046");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.21108355686176E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110835568025492E-5d + "'", double1 == 1.2110835568025492E-5d);
    }

    @Test
    public void test13047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13047");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707790699497692d, 3.808192513462892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.808192513462892d + "'", double2 == 3.808192513462892d);
    }

    @Test
    public void test13048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13048");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.29896066870743415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26156445909876513d + "'", double1 == 0.26156445909876513d);
    }

    @Test
    public void test13049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13049");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7268687239847369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.646510144384976d + "'", double1 == 41.646510144384976d);
    }

    @Test
    public void test13050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13050");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.36019649632180123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test13051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13051");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.027712143770207958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test13052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13052");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5665959743566382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004200340087160527d + "'", double1 == 0.004200340087160527d);
    }

    @Test
    public void test13053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13053");
        int int2 = org.apache.commons.math.util.FastMath.max(252318064, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252318064 + "'", int2 == 252318064);
    }

    @Test
    public void test13054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13054");
        long long1 = org.apache.commons.math.util.FastMath.round(144.99999999999997d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 145L + "'", long1 == 145L);
    }

    @Test
    public void test13055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13055");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) 208);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test13056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13056");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.7902953051996431E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7902953051996431E-9d) + "'", double1 == (-1.7902953051996431E-9d));
    }

    @Test
    public void test13057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13057");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1216780097738317d, (-0.12627601285118364d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6829020899740903d + "'", double2 == 1.6829020899740903d);
    }

    @Test
    public void test13058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13058");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4694426632156045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00819332012244317d + "'", double1 == 0.00819332012244317d);
    }

    @Test
    public void test13059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13059");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test13060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13060");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3894772598027302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39939901327501687d + "'", double1 == 0.39939901327501687d);
    }

    @Test
    public void test13061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13061");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.189143237539527d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13062");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 8L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test13063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13063");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9201573526616591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6524071371928835d + "'", double1 == 0.6524071371928835d);
    }

    @Test
    public void test13064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13064");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.04503312184618226d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13065");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.3582501415697792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006252644516128454d) + "'", double1 == (-0.006252644516128454d));
    }

    @Test
    public void test13066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13066");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.142219984546602E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.665148409815947E-11d + "'", double1 == 4.665148409815947E-11d);
    }

    @Test
    public void test13067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13067");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test13068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13068");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test13069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13069");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1373220393635002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13070");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.3967502042642406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37716488311804813d) + "'", double1 == (-0.37716488311804813d));
    }

    @Test
    public void test13071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13071");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.43082678203704855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4308267820370486d + "'", double1 == 0.4308267820370486d);
    }

    @Test
    public void test13072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13072");
        double double1 = org.apache.commons.math.util.FastMath.abs((-6.4742592311448774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.4742592311448774d + "'", double1 == 6.4742592311448774d);
    }

    @Test
    public void test13073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13073");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9786883441146831d), 1.2755968012964243d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test13074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13074");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.78648047144194E10d, 1.037259332522805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267842977d + "'", double2 == 1.5707963267842977d);
    }

    @Test
    public void test13075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13075");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.008377980417966557d, 0.00126983485097483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008377980417966556d + "'", double2 == 0.008377980417966556d);
    }

    @Test
    public void test13076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13076");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6725993386887972d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.308512119425998d + "'", double1 == 2.308512119425998d);
    }

    @Test
    public void test13077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13077");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.169084941497005E58d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test13078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13078");
        double double2 = org.apache.commons.math.util.FastMath.atan2(248.83240878877044d, 0.9711073542921324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5668936903624444d + "'", double2 == 1.5668936903624444d);
    }

    @Test
    public void test13079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13079");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1642851984039091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16283068213619753d + "'", double1 == 0.16283068213619753d);
    }

    @Test
    public void test13080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13080");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) 18L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test13081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13081");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.943562482807576E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13082");
        double double1 = org.apache.commons.math.util.FastMath.sin(5728.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9536075631474413d) + "'", double1 == (-0.9536075631474413d));
    }

    @Test
    public void test13083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13083");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3026405418156002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13084");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5937881252841113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8405118409662973d + "'", double1 == 0.8405118409662973d);
    }

    @Test
    public void test13085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13085");
        long long2 = org.apache.commons.math.util.FastMath.max(208L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 208L + "'", long2 == 208L);
    }

    @Test
    public void test13086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13086");
        double double1 = org.apache.commons.math.util.FastMath.log(0.4644172503913179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7669718843028057d) + "'", double1 == (-0.7669718843028057d));
    }

    @Test
    public void test13087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13087");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.454467422037778E-77d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.454467422037778E-77d + "'", double1 == 3.454467422037778E-77d);
    }

    @Test
    public void test13088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13088");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test13089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13089");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6929693744344996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13090");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.864392833312451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test13091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13091");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0024988823881342955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0025020071970303583d + "'", double1 == 0.0025020071970303583d);
    }

    @Test
    public void test13092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13092");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.022993279121268483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022993279121268483d + "'", double1 == 0.022993279121268483d);
    }

    @Test
    public void test13093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13093");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.003749170920418732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037562078531869505d + "'", double1 == 0.0037562078531869505d);
    }

    @Test
    public void test13094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13094");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1095.6331584284585d + "'", double1 == 1095.6331584284585d);
    }

    @Test
    public void test13095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13095");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.1696040598924322d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9963677375518782d) + "'", double1 == (-0.9963677375518782d));
    }

    @Test
    public void test13096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13096");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.677934571594396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5175636153863576d + "'", double1 == 0.5175636153863576d);
    }

    @Test
    public void test13097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13097");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.104805763827216d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13098");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 23);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 23.0f + "'", float1 == 23.0f);
    }

    @Test
    public void test13099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13099");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8918205598968713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13100");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7094902377818831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6514471021142878d + "'", double1 == 0.6514471021142878d);
    }

    @Test
    public void test13101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13101");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 8L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.446441332248135d + "'", double1 == 1.446441332248135d);
    }

    @Test
    public void test13102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13102");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4315459888945143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0170021864894023d + "'", double1 == 2.0170021864894023d);
    }

    @Test
    public void test13103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13103");
        float float2 = org.apache.commons.math.util.FastMath.max(2.4051712E9f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test13104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13104");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.4103212990482587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4103212990482587d + "'", double1 == 0.4103212990482587d);
    }

    @Test
    public void test13105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13105");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9698463103929542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9698463103929543d + "'", double1 == 0.9698463103929543d);
    }

    @Test
    public void test13106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13106");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.763865462982212E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.600743252030506E-10d + "'", double1 == 2.600743252030506E-10d);
    }

    @Test
    public void test13107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13107");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, (float) 14);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test13108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13108");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.39857533900047715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4092125804796355d) + "'", double1 == (-0.4092125804796355d));
    }

    @Test
    public void test13109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13109");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2963685787093853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5281678425836974d) + "'", double1 == (-0.5281678425836974d));
    }

    @Test
    public void test13110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13110");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9201573526616591d, 0.17843732213843988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.920157352661659d + "'", double2 == 0.920157352661659d);
    }

    @Test
    public void test13111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13111");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3403843704464924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.820511714973782d + "'", double1 == 2.820511714973782d);
    }

    @Test
    public void test13112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13112");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8212984814728256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6875935736067623d + "'", double1 == 0.6875935736067623d);
    }

    @Test
    public void test13113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13113");
        double double2 = org.apache.commons.math.util.FastMath.max(0.019926209128347205d, 5.878549459101058E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.019926209128347205d + "'", double2 == 0.019926209128347205d);
    }

    @Test
    public void test13114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13114");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7048627526623752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.841214002075451d + "'", double1 == 2.841214002075451d);
    }

    @Test
    public void test13115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13115");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5560922495134364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19203533961194985d + "'", double1 == 0.19203533961194985d);
    }

    @Test
    public void test13116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13116");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test13117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13117");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2464946689549923d, 1.232242072380867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.246494668954992d + "'", double2 == 1.246494668954992d);
    }

    @Test
    public void test13118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13118");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9871894583475739d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13119");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.047407404488248234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3619223414507422d + "'", double1 == 0.3619223414507422d);
    }

    @Test
    public void test13120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13120");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7725296756890861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13121");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 46L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46L + "'", long2 == 46L);
    }

    @Test
    public void test13122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13122");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9484831895170822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test13123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13123");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8421630577599043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1204993774722352d + "'", double1 == 1.1204993774722352d);
    }

    @Test
    public void test13124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13124");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5836293809324178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9476052075434358d + "'", double1 == 0.9476052075434358d);
    }

    @Test
    public void test13125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13125");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7228843693793349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7228843693793349d + "'", double1 == 0.7228843693793349d);
    }

    @Test
    public void test13126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13126");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13127");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.8507543610711985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334229304450168d + "'", double1 == 1.2334229304450168d);
    }

    @Test
    public void test13128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13128");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6603469013500041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41498997393915654d) + "'", double1 == (-0.41498997393915654d));
    }

    @Test
    public void test13129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13129");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5914044369322959d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8950294555227126d) + "'", double1 == (-0.8950294555227126d));
    }

    @Test
    public void test13130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13130");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9999103740052038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853533483917855d + "'", double1 == 0.7853533483917855d);
    }

    @Test
    public void test13131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13131");
        long long2 = org.apache.commons.math.util.FastMath.min(2979L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test13132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13132");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13133");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.8414687716506352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test13134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13134");
        double double1 = org.apache.commons.math.util.FastMath.log(11.624987626712537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4531568871040395d + "'", double1 == 2.4531568871040395d);
    }

    @Test
    public void test13135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13135");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6987456384434759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8359100660020048d + "'", double1 == 0.8359100660020048d);
    }

    @Test
    public void test13136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13136");
        double double1 = org.apache.commons.math.util.FastMath.floor((-36.912814250652346d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-37.0d) + "'", double1 == (-37.0d));
    }

    @Test
    public void test13137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13137");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7162992214244817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0468442594085454d + "'", double1 == 2.0468442594085454d);
    }

    @Test
    public void test13138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13138");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8672060090250945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7625243164949341d + "'", double1 == 0.7625243164949341d);
    }

    @Test
    public void test13139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13139");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0997501702946166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9501788657259784d + "'", double1 == 0.9501788657259784d);
    }

    @Test
    public void test13140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13140");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.09507068650612024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4564034058832269d + "'", double1 == 0.4564034058832269d);
    }

    @Test
    public void test13141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13141");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.982245962441371E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.991119037646069E13d + "'", double1 == 9.991119037646069E13d);
    }

    @Test
    public void test13142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13142");
        double double2 = org.apache.commons.math.util.FastMath.pow(334.6589236650981d, 0.5440680443502759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.634993975383424d + "'", double2 == 23.634993975383424d);
    }

    @Test
    public void test13143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13143");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.026931775759076123d, 1.4414100388676627d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005462207545959866d + "'", double2 == 0.005462207545959866d);
    }

    @Test
    public void test13144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13144");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4434101142727052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.807635043344494d + "'", double1 == 7.807635043344494d);
    }

    @Test
    public void test13145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13145");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4554625215028407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025402613139603337d + "'", double1 == 0.025402613139603337d);
    }

    @Test
    public void test13146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13146");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.2427728858045115d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5883129417272057d) + "'", double1 == (-1.5883129417272057d));
    }

    @Test
    public void test13147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13147");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.4091896264064065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1609041787526973d + "'", double1 == 0.1609041787526973d);
    }

    @Test
    public void test13148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13148");
        double double1 = org.apache.commons.math.util.FastMath.floor(11.71517765301278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test13149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13149");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.2661802399344254E97d, (-0.3746156955164151d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test13150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13150");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test13151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13151");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3934486217273407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4043797612833817d + "'", double1 == 0.4043797612833817d);
    }

    @Test
    public void test13152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13152");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5574077246549023d), (-0.08894901143102314d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08894901143102314d) + "'", double2 == (-0.08894901143102314d));
    }

    @Test
    public void test13153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13153");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.4360530864024404E78d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13154");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5397294065638794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5397294065638792d) + "'", double1 == (-0.5397294065638792d));
    }

    @Test
    public void test13155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13155");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9234976649034378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07958700787507242d) + "'", double1 == (-0.07958700787507242d));
    }

    @Test
    public void test13156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13156");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.048586396335614665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13157");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.3926112041789106E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.72687759619303d) + "'", double1 == (-35.72687759619303d));
    }

    @Test
    public void test13158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13158");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0033892936490607d, 1.2932359235759898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043853326935157d + "'", double2 == 1.0043853326935157d);
    }

    @Test
    public void test13159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13159");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.527625971442648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2099902975181547d) + "'", double1 == (-1.2099902975181547d));
    }

    @Test
    public void test13160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13160");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.41602402396743615d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13161");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9717320044784656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01245349332912947d) + "'", double1 == (-0.01245349332912947d));
    }

    @Test
    public void test13162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13162");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9989251163235675d, (-1.163085598195192d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.431978615455663d + "'", double2 == 2.431978615455663d);
    }

    @Test
    public void test13163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13163");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.02725345025673568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026888687507049105d + "'", double1 == 0.026888687507049105d);
    }

    @Test
    public void test13164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13164");
        double double1 = org.apache.commons.math.util.FastMath.log10((-4.969174393787706d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13165");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 14, 50772059364683248L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test13166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13166");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9, (float) 145);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test13167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13167");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test13168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13168");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6712757054461316d, 1.4414100388676625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.435839370198855d + "'", double2 == 0.435839370198855d);
    }

    @Test
    public void test13169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13169");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2979L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test13170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13170");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.296722144923345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8126199095770787d + "'", double1 == 2.8126199095770787d);
    }

    @Test
    public void test13171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13171");
        float float2 = org.apache.commons.math.util.FastMath.max(8.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test13172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13172");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.012779990912280517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999183370276388d + "'", double1 == 0.9999183370276388d);
    }

    @Test
    public void test13173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13173");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5430642407677928d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13174");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.017454730321241296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453844127570044d + "'", double1 == 0.017453844127570044d);
    }

    @Test
    public void test13175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13175");
        int int2 = org.apache.commons.math.util.FastMath.max(145, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test13176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13176");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5519859061836423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5243792308451708d) + "'", double1 == (-0.5243792308451708d));
    }

    @Test
    public void test13177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13177");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.600743252030506E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.600743252030506E-10d + "'", double1 == 2.600743252030506E-10d);
    }

    @Test
    public void test13178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13178");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7370529091738743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6827573097139488d) + "'", double1 == (-0.6827573097139488d));
    }

    @Test
    public void test13179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13179");
        double double1 = org.apache.commons.math.util.FastMath.log(6.785670652509232E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.17685536366517d + "'", double1 == 57.17685536366517d);
    }

    @Test
    public void test13180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13180");
        double double2 = org.apache.commons.math.util.FastMath.atan2(15.999999999999993d, 198.60867061197564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0803868273741325d + "'", double2 == 0.0803868273741325d);
    }

    @Test
    public void test13181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13181");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.055454452467354E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.055454452467354E-6d + "'", double1 == 6.055454452467354E-6d);
    }

    @Test
    public void test13182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13182");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.3507127702249935d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3507127702249935d + "'", double1 == 0.3507127702249935d);
    }

    @Test
    public void test13183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13183");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.1346458267562316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13383799735566232d) + "'", double1 == (-0.13383799735566232d));
    }

    @Test
    public void test13184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13184");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.85836923677614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13185");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.3553727166519355E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000564d + "'", double1 == 1.0000000000000564d);
    }

    @Test
    public void test13186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13186");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.09713542637401774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09713542637401774d + "'", double1 == 0.09713542637401774d);
    }

    @Test
    public void test13187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13187");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9207751579328988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08253940072543253d) + "'", double1 == (-0.08253940072543253d));
    }

    @Test
    public void test13188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13188");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6398359282348625E68d, (-0.49299653486035117d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6398359282348625E68d + "'", double2 == 1.6398359282348625E68d);
    }

    @Test
    public void test13189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13189");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1500460074074101d, 0.1253169546054925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15004600740741006d + "'", double2 == 0.15004600740741006d);
    }

    @Test
    public void test13190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13190");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7L, (float) 65L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test13191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13191");
        int int2 = org.apache.commons.math.util.FastMath.min(22025, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test13192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13192");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9998017543876165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4141434702276912d + "'", double1 == 1.4141434702276912d);
    }

    @Test
    public void test13193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13193");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8323937271739859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8323937271739859d + "'", double1 == 0.8323937271739859d);
    }

    @Test
    public void test13194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13194");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.8849038025E-314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13195");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.028396905882036416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0004032192265475d + "'", double1 == 1.0004032192265475d);
    }

    @Test
    public void test13196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13196");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 70368744177664L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0368744E13f + "'", float2 == 7.0368744E13f);
    }

    @Test
    public void test13197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13197");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test13198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13198");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9030899869919435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.74324477516278d + "'", double1 == 51.74324477516278d);
    }

    @Test
    public void test13199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13199");
        double double1 = org.apache.commons.math.util.FastMath.log1p(423.85042430535873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.051737164167091d + "'", double1 == 6.051737164167091d);
    }

    @Test
    public void test13200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13200");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7806737720297888d, 0.39220267859611113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7806737720297887d + "'", double2 == 0.7806737720297887d);
    }

    @Test
    public void test13201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13201");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6098477665110738d, 0.1333763191612873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.065565612641488d + "'", double2 == 1.065565612641488d);
    }

    @Test
    public void test13202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13202");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9030899869919435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9503104687374245d + "'", double1 == 0.9503104687374245d);
    }

    @Test
    public void test13203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13203");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5295292477045612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1435074213010377d + "'", double1 == 1.1435074213010377d);
    }

    @Test
    public void test13204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13204");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6870151974084779d, 1.3375726937940255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47449071755445954d + "'", double2 == 0.47449071755445954d);
    }

    @Test
    public void test13205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13205");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.285024441173896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0018391360678826746d + "'", double1 == 0.0018391360678826746d);
    }

    @Test
    public void test13206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13206");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8569259205417066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06705672030612886d) + "'", double1 == (-0.06705672030612886d));
    }

    @Test
    public void test13207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13207");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.427768900977763E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test13208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13208");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test13209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13209");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9992931288863935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test13210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13210");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.22882280821594222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2308682344585033d + "'", double1 == 0.2308682344585033d);
    }

    @Test
    public void test13211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13211");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9128531089774885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4914206974104893d + "'", double1 == 1.4914206974104893d);
    }

    @Test
    public void test13212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13212");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 145, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test13213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13213");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.41602402396743615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13214");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7837855463789322d, 0.9848077530257846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6722216741515517d + "'", double2 == 0.6722216741515517d);
    }

    @Test
    public void test13215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13215");
        double double1 = org.apache.commons.math.util.FastMath.acos(3246235.170392019d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13216");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(104.18930738450575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.207316365455993d + "'", double1 == 10.207316365455993d);
    }

    @Test
    public void test13217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13217");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7658368273288395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.010180894343902d + "'", double1 == 1.010180894343902d);
    }

    @Test
    public void test13218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13218");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.6625147656574195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9305551205503534d + "'", double1 == 0.9305551205503534d);
    }

    @Test
    public void test13219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13219");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.189143237539527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7312716587758639d + "'", double1 == 1.7312716587758639d);
    }

    @Test
    public void test13220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13220");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 23, 21.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test13221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13221");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.015583573192166111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015584203939114872d + "'", double1 == 0.015584203939114872d);
    }

    @Test
    public void test13222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13222");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7460679984455996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13223");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.363899346513529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7641600446179835d + "'", double1 == 4.7641600446179835d);
    }

    @Test
    public void test13224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13224");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.017466184278427548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test13225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13225");
        long long2 = org.apache.commons.math.util.FastMath.min(70368744177664L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test13226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13226");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9589491796883352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8185884496762226d + "'", double1 == 0.8185884496762226d);
    }

    @Test
    public void test13227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13227");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.7603734074051979d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6501071001720871d) + "'", double1 == (-0.6501071001720871d));
    }

    @Test
    public void test13228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13228");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9648525037059907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016839852985780328d + "'", double1 == 0.016839852985780328d);
    }

    @Test
    public void test13229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13229");
        double double2 = org.apache.commons.math.util.FastMath.min(3.948148009134034E13d, 5.427768900977763E74d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.948148009134034E13d + "'", double2 == 3.948148009134034E13d);
    }

    @Test
    public void test13230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13230");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.573924941356922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5376670274871433d + "'", double1 == 0.5376670274871433d);
    }

    @Test
    public void test13231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13231");
        int int1 = org.apache.commons.math.util.FastMath.round(8.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test13232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13232");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3770540051424462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8802898719578948d + "'", double1 == 0.8802898719578948d);
    }

    @Test
    public void test13233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13233");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8673789059065279d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test13234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13234");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1838634728558128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13235");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-2.3227307295361186d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13236");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 18, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test13237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13237");
        double double1 = org.apache.commons.math.util.FastMath.asin((-6.931823875783932d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13238");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(62.001875319682284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.00187531968229d + "'", double1 == 62.00187531968229d);
    }

    @Test
    public void test13239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13239");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3091969930773629d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13240");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.986746382996133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.551407059902704d + "'", double1 == 0.551407059902704d);
    }

    @Test
    public void test13241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13241");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 185.47866641176898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test13242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13242");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0887482668978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0887482668978d + "'", double1 == 1.0887482668978d);
    }

    @Test
    public void test13243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13243");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6809442969904994d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8308726454524988d) + "'", double1 == (-0.8308726454524988d));
    }

    @Test
    public void test13244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13244");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.3260523900154437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13245");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.259554979423884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7713947959866282d + "'", double1 == 0.7713947959866282d);
    }

    @Test
    public void test13246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13246");
        int int2 = org.apache.commons.math.util.FastMath.min(145, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test13247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13247");
        double double1 = org.apache.commons.math.util.FastMath.log1p(10.207316365455993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.416566811943871d + "'", double1 == 2.416566811943871d);
    }

    @Test
    public void test13248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13248");
        double double1 = org.apache.commons.math.util.FastMath.expm1(38.48042882520381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.1503637193539384E16d + "'", double1 == 5.1503637193539384E16d);
    }

    @Test
    public void test13249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13249");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1587902392173515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.076471197579086d + "'", double1 == 1.076471197579086d);
    }

    @Test
    public void test13250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13250");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0471758442373165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7319639829961304d + "'", double1 == 1.7319639829961304d);
    }

    @Test
    public void test13251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13251");
        int int2 = org.apache.commons.math.util.FastMath.max(44, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test13252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13252");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3686181549811498d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13253");
        int int2 = org.apache.commons.math.util.FastMath.min(38, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test13254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13254");
        float float1 = org.apache.commons.math.util.FastMath.abs(2105.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2105.0f + "'", float1 == 2105.0f);
    }

    @Test
    public void test13255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13255");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.6789823271282955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08166364725101516d + "'", double1 == 0.08166364725101516d);
    }

    @Test
    public void test13256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13256");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.092317685041624d, 2.8824804320384763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.896098390260185d + "'", double2 == 25.896098390260185d);
    }

    @Test
    public void test13257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13257");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.12187114015074264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test13258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13258");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.860487744432721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1627023223395934d + "'", double1 == 1.1627023223395934d);
    }

    @Test
    public void test13259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13259");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 26, (float) 24);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24.0f + "'", float2 == 24.0f);
    }

    @Test
    public void test13260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13260");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test13261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13261");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.3075995814907488d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test13262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13262");
        double double1 = org.apache.commons.math.util.FastMath.acosh(24.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.870766700287094d + "'", double1 == 3.870766700287094d);
    }

    @Test
    public void test13263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13263");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7143859385096635d, 3.539204170954297d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19917311357228823d + "'", double2 == 0.19917311357228823d);
    }

    @Test
    public void test13264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13264");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test13265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13265");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.41032129904825876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5073020020181596d + "'", double1 == 1.5073020020181596d);
    }

    @Test
    public void test13266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13266");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.6416568898277903d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.64165688982779d) + "'", double2 == (-2.64165688982779d));
    }

    @Test
    public void test13267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13267");
        double double1 = org.apache.commons.math.util.FastMath.tanh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13268");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.475279369318095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3275286075081404d) + "'", double1 == (-0.3275286075081404d));
    }

    @Test
    public void test13269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13269");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.676406743021734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4412565244308435d + "'", double1 == 1.4412565244308435d);
    }

    @Test
    public void test13270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13270");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5763404979381906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6142435364666222d) + "'", double1 == (-0.6142435364666222d));
    }

    @Test
    public void test13271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13271");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1262947170145017d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13272");
        float float1 = org.apache.commons.math.util.FastMath.abs(7.0368744E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0368744E13f + "'", float1 == 7.0368744E13f);
    }

    @Test
    public void test13273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13273");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7805951733159243d, 0.078927767113337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7805951733159243d + "'", double2 == 0.7805951733159243d);
    }

    @Test
    public void test13274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13274");
        int int2 = org.apache.commons.math.util.FastMath.min(252318064, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test13275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13275");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.036874417766399E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0078125d + "'", double1 == 0.0078125d);
    }

    @Test
    public void test13276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13276");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3314536537354545E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test13277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13277");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test13278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13278");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9587005044817638d, (-0.06424358004527628d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0027132469484226d + "'", double2 == 1.0027132469484226d);
    }

    @Test
    public void test13279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13279");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4386368936167206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1167150295138388d + "'", double1 == 1.1167150295138388d);
    }

    @Test
    public void test13280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13280");
        double double1 = org.apache.commons.math.util.FastMath.cos(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test13281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13281");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9995305483505298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997652466206903d + "'", double1 == 0.9997652466206903d);
    }

    @Test
    public void test13282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13282");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9946705819037911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8385795515579468d + "'", double1 == 0.8385795515579468d);
    }

    @Test
    public void test13283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13283");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3220707078292161d, 1.1529211698783688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32207070782921615d + "'", double2 == 0.32207070782921615d);
    }

    @Test
    public void test13284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13284");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.38542049584402066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13285");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0572983097976434d + "'", double1 == 2.0572983097976434d);
    }

    @Test
    public void test13286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13286");
        long long1 = org.apache.commons.math.util.FastMath.round(2.8249000307521015E-30d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13287");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1787535542062797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13288");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.365513453787659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08223517580477673d + "'", double1 == 0.08223517580477673d);
    }

    @Test
    public void test13289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13289");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6507779951543294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test13290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13290");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.986746382996133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5276400417824103d + "'", double1 == 1.5276400417824103d);
    }

    @Test
    public void test13291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13291");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1576846224537243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14642199529924824d + "'", double1 == 0.14642199529924824d);
    }

    @Test
    public void test13292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13292");
        double double1 = org.apache.commons.math.util.FastMath.rint((-4.819341425933092E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13293");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1713189077681307d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13294");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.160875346119392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.160875346119392d + "'", double1 == 1.160875346119392d);
    }

    @Test
    public void test13295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13295");
        double double1 = org.apache.commons.math.util.FastMath.tan(35.27243300150086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8681090589666719d + "'", double1 == 0.8681090589666719d);
    }

    @Test
    public void test13296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13296");
        long long2 = org.apache.commons.math.util.FastMath.min(65L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65L + "'", long2 == 65L);
    }

    @Test
    public void test13297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13297");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999999999675755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951122453d + "'", double1 == 57.29577951122453d);
    }

    @Test
    public void test13298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13298");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.49321676688550387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13299");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6375754550500171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8606842647946611d + "'", double1 == 0.8606842647946611d);
    }

    @Test
    public void test13300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13300");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9955924691418194E14d + "'", double1 == 2.9955924691418194E14d);
    }

    @Test
    public void test13301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13301");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9130353976390855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.313074830768485d + "'", double1 == 52.313074830768485d);
    }

    @Test
    public void test13302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13302");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.261646633260967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test13303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13303");
        int int1 = org.apache.commons.math.util.FastMath.abs(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test13304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13304");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.017429734739979972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5533657094213067d + "'", double1 == 1.5533657094213067d);
    }

    @Test
    public void test13305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13305");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test13306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13306");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.2907797382680593d, 3.6886551128071145E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000003057498128d + "'", double2 == 1.0000003057498128d);
    }

    @Test
    public void test13307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13307");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7240465401405306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3228996067003586d) + "'", double1 == (-0.3228996067003586d));
    }

    @Test
    public void test13308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13308");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.542519758633026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26558444013559956d) + "'", double1 == (-0.26558444013559956d));
    }

    @Test
    public void test13309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13309");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.459356638080273d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.459356638080273d + "'", double2 == 1.459356638080273d);
    }

    @Test
    public void test13310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13310");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.748066027288557E7d, 5.5897037861715806E-24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test13311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13311");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0027856622314566606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5680106609606774d + "'", double1 == 1.5680106609606774d);
    }

    @Test
    public void test13312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13312");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.761588719464173d, (-88.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1329384523823336d + "'", double2 == 3.1329384523823336d);
    }

    @Test
    public void test13313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13313");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test13314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13314");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(84.18243249387379d, 0.0026428819590263043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 84.18243249387378d + "'", double2 == 84.18243249387378d);
    }

    @Test
    public void test13315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13315");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1650292235158622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5485130342067743d + "'", double1 == 0.5485130342067743d);
    }

    @Test
    public void test13316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13316");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9861758970260069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9953705670984729d + "'", double1 == 0.9953705670984729d);
    }

    @Test
    public void test13317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13317");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7417751600726001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17014699103276054d) + "'", double1 == (-0.17014699103276054d));
    }

    @Test
    public void test13318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13318");
        double double1 = org.apache.commons.math.util.FastMath.asin(3265.0000000000005d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13319");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.69927534455855d, 572.9577951308231d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.772019376909056E-90d + "'", double2 == 9.772019376909056E-90d);
    }

    @Test
    public void test13320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13320");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3705678128390975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023920920955899663d + "'", double1 == 0.023920920955899663d);
    }

    @Test
    public void test13321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13321");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707878841124843d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test13322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13322");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.08726646259971647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13323");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.0021487544300628886d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13324");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test13325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13325");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5430735359421353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999939594162265d + "'", double1 == 0.9999939594162265d);
    }

    @Test
    public void test13326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13326");
        float float2 = org.apache.commons.math.util.FastMath.max(23.0f, 44.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test13327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13327");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.019234492165425023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00018498854761d + "'", double1 == 1.00018498854761d);
    }

    @Test
    public void test13328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13328");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999390753501719d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13329");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2988776555210748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.4202077652048d + "'", double1 == 74.4202077652048d);
    }

    @Test
    public void test13330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13330");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test13331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13331");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-6.263184405090835d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8433100866400067d) + "'", double1 == (-1.8433100866400067d));
    }

    @Test
    public void test13332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13332");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) 31);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test13333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13333");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0822609728078258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test13334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13334");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1635662297792864d, 1.4920299855772985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1635662297792864d + "'", double2 == 1.1635662297792864d);
    }

    @Test
    public void test13335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13335");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.12217304763960309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.129949619977457d + "'", double1 == 1.129949619977457d);
    }

    @Test
    public void test13336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13336");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6566128730773926E-10d + "'", double1 == 4.6566128730773926E-10d);
    }

    @Test
    public void test13337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13337");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.826543326104914E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842021724855044E-19d + "'", double1 == 1.0842021724855044E-19d);
    }

    @Test
    public void test13338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13338");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1908935183406186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8308557776153688d + "'", double1 == 0.8308557776153688d);
    }

    @Test
    public void test13339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13339");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7162992214244818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.04092225612964d + "'", double1 == 41.04092225612964d);
    }

    @Test
    public void test13340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13340");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.40026505289990955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13341");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test13342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13342");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3873669366539792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13343");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5665959743566382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002671129502563d + "'", double1 == 1.002671129502563d);
    }

    @Test
    public void test13344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13344");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6722216741515517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13345");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9801980198019802d + "'", double1 == 0.9801980198019802d);
    }

    @Test
    public void test13346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13346");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 88L, (float) 8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test13347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13347");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3240578294914163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2807011344245738d + "'", double1 == 0.2807011344245738d);
    }

    @Test
    public void test13348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13348");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.02741500344259761d, 0.33978118561914555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0805098862159868d + "'", double2 == 0.0805098862159868d);
    }

    @Test
    public void test13349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13349");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8674578744516237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2368097780417677d + "'", double1 == 1.2368097780417677d);
    }

    @Test
    public void test13350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13350");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, (float) 24);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test13351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13351");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.028809780999338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test13352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13352");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4161468365471423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test13353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13353");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.1253169546054925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1253169546054925d + "'", double1 == 0.1253169546054925d);
    }

    @Test
    public void test13354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13354");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test13355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13355");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.09867546503898518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10370804958086244d + "'", double1 == 0.10370804958086244d);
    }

    @Test
    public void test13356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13356");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7821340737569482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13357");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9074644222731123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.735987506975257d + "'", double1 == 5.735987506975257d);
    }

    @Test
    public void test13358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13358");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2148823033161556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2182844213793957d + "'", double1 == 0.2182844213793957d);
    }

    @Test
    public void test13359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13359");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.338474404104274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8713053304870307d + "'", double1 == 0.8713053304870307d);
    }

    @Test
    public void test13360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13360");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0345641983513346d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test13361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13361");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3644746251564972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1171584131235877d + "'", double1 == 1.1171584131235877d);
    }

    @Test
    public void test13362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13362");
        long long2 = org.apache.commons.math.util.FastMath.min(252318064L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test13363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13363");
        double double1 = org.apache.commons.math.util.FastMath.sinh(10.54930615400752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19075.47910531175d + "'", double1 == 19075.47910531175d);
    }

    @Test
    public void test13364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13364");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.14575846667616507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1457584666761651d + "'", double1 == 0.1457584666761651d);
    }

    @Test
    public void test13365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13365");
        double double2 = org.apache.commons.math.util.FastMath.pow(60.29681577459477d, 0.09983407889920767d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.505684741787261d + "'", double2 == 1.505684741787261d);
    }

    @Test
    public void test13366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13366");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 22025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 384.4087677517511d + "'", double1 == 384.4087677517511d);
    }

    @Test
    public void test13367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13367");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.805720310651806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.239260810116091d + "'", double1 == 8.239260810116091d);
    }

    @Test
    public void test13368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13368");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.448317288402091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test13369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13369");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999999945888711d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test13370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13370");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2636545123256722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8520684934069587d + "'", double1 == 0.8520684934069587d);
    }

    @Test
    public void test13371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13371");
        double double1 = org.apache.commons.math.util.FastMath.asin(18.853143817940012d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13372");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5525884268785045E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9259299443872359E-34d + "'", double1 == 1.9259299443872359E-34d);
    }

    @Test
    public void test13373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13373");
        double double1 = org.apache.commons.math.util.FastMath.log(4.89324023572096E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.61370563888011d + "'", double1 == 24.61370563888011d);
    }

    @Test
    public void test13374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13374");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0011273202556092d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13375");
        double double1 = org.apache.commons.math.util.FastMath.tan(38.2427552769663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6043930627064142d + "'", double1 == 0.6043930627064142d);
    }

    @Test
    public void test13376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13376");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7836624457399028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2437769052498596d) + "'", double1 == (-0.2437769052498596d));
    }

    @Test
    public void test13377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13377");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2334229304450168d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test13378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13378");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.19240232444172614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19006280234111014d + "'", double1 == 0.19006280234111014d);
    }

    @Test
    public void test13379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13379");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test13380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13380");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9150844419188419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13381");
        int int2 = org.apache.commons.math.util.FastMath.min(14, 208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test13382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13382");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0961179680051676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4570523903400867d + "'", double1 == 0.4570523903400867d);
    }

    @Test
    public void test13383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13383");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9698463103929543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9698463103929544d + "'", double1 == 0.9698463103929544d);
    }

    @Test
    public void test13384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13384");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8902596696356354d, 1.156864174916083E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8902596696356354d + "'", double2 == 0.8902596696356354d);
    }

    @Test
    public void test13385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13385");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9964491924882743E28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9964491924882747E28d + "'", double1 == 1.9964491924882747E28d);
    }

    @Test
    public void test13386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13386");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.019926209128347205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019924890524982336d + "'", double1 == 0.019924890524982336d);
    }

    @Test
    public void test13387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13387");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.356655043862392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.73060826845064d + "'", double1 == 77.73060826845064d);
    }

    @Test
    public void test13388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13388");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6987456384434759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.03517603598534d + "'", double1 == 40.03517603598534d);
    }

    @Test
    public void test13389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13389");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.015759634004795586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13390");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9762070212577264E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.702762565175334d + "'", double1 == 26.702762565175334d);
    }

    @Test
    public void test13391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13391");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7304003084084858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9005758900264696d + "'", double1 == 0.9005758900264696d);
    }

    @Test
    public void test13392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13392");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0277948324376378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7069489131741041d + "'", double1 == 0.7069489131741041d);
    }

    @Test
    public void test13393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13393");
        double double1 = org.apache.commons.math.util.FastMath.tan(10.991338187845832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 236.06479661590365d + "'", double1 == 236.06479661590365d);
    }

    @Test
    public void test13394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13394");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 2405171239L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2405171239L + "'", long2 == 2405171239L);
    }

    @Test
    public void test13395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13395");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 252318064L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test13396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13396");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test13397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13397");
        double double1 = org.apache.commons.math.util.FastMath.acos((-221.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13398");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8431746481004084d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test13399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13399");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.14131975637264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test13400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13400");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5525884268785043E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2460290634164615E-9d + "'", double1 == 1.2460290634164615E-9d);
    }

    @Test
    public void test13401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13401");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9976632019944932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7119371688849663d + "'", double1 == 2.7119371688849663d);
    }

    @Test
    public void test13402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13402");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.247595209480447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.18616053088712d + "'", double1 == 14.18616053088712d);
    }

    @Test
    public void test13403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13403");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1167150295138388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0374825171916622d + "'", double1 == 1.0374825171916622d);
    }

    @Test
    public void test13404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13404");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 44L, 21.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test13405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13405");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 88);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 88L + "'", long1 == 88L);
    }

    @Test
    public void test13406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13406");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.1029120896883755d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8015426125190456d) + "'", double1 == (-0.8015426125190456d));
    }

    @Test
    public void test13407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13407");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.1253502589028981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1253502589028981d + "'", double1 == 0.1253502589028981d);
    }

    @Test
    public void test13408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13408");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.027726343135365997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003843996764912d + "'", double1 == 1.0003843996764912d);
    }

    @Test
    public void test13409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13409");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.18838862103418863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7249453328133405d) + "'", double1 == (-0.7249453328133405d));
    }

    @Test
    public void test13410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13410");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test13411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13411");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.29788137754031907d), 181.18516357615334d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.29788137754031907d) + "'", double2 == (-0.29788137754031907d));
    }

    @Test
    public void test13412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13412");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-38.123094930796995d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13413");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1020168835252733E14d + "'", double1 == 1.1020168835252733E14d);
    }

    @Test
    public void test13414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13414");
        double double2 = org.apache.commons.math.util.FastMath.max(0.43863689361672054d, 0.7448204053596359d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7448204053596359d + "'", double2 == 0.7448204053596359d);
    }

    @Test
    public void test13415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13415");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.31223183389476095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13416");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.3847207980220791d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-22.04287801757012d) + "'", double1 == (-22.04287801757012d));
    }

    @Test
    public void test13417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13417");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 9.7864802E10f, (double) 8L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.414187489815264E87d + "'", double2 == 8.414187489815264E87d);
    }

    @Test
    public void test13418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13418");
        double double2 = org.apache.commons.math.util.FastMath.max(916.7324722093172d, 0.6144072740383286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 916.7324722093172d + "'", double2 == 916.7324722093172d);
    }

    @Test
    public void test13419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13419");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9474823836948711d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9821784054330412d) + "'", double1 == (-0.9821784054330412d));
    }

    @Test
    public void test13420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13420");
        double double1 = org.apache.commons.math.util.FastMath.log(0.02965498116117008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.518125168958212d) + "'", double1 == (-3.518125168958212d));
    }

    @Test
    public void test13421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13421");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0145502426353863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7003959658373307d + "'", double1 == 0.7003959658373307d);
    }

    @Test
    public void test13422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13422");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7821340737569482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.887123018745097d + "'", double1 == 2.887123018745097d);
    }

    @Test
    public void test13423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13423");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test13424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13424");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1553250449256478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149262027709257d + "'", double1 == 0.9149262027709257d);
    }

    @Test
    public void test13425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13425");
        long long1 = org.apache.commons.math.util.FastMath.round(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13426");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test13427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13427");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.602750627100152d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13428");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7403681597556238d, 1261967.0000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.740368159755624d + "'", double2 == 1.740368159755624d);
    }

    @Test
    public void test13429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13429");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-8.415543885269349d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2258.3658459955036d + "'", double1 == 2258.3658459955036d);
    }

    @Test
    public void test13430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13430");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test13431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13431");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6827573097139488d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13432");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5699061505137777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02740003127377509d + "'", double1 == 0.02740003127377509d);
    }

    @Test
    public void test13433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13433");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4142135623730951d, (-7.470160139737163E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.414213562373095d + "'", double2 == 1.414213562373095d);
    }

    @Test
    public void test13434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13434");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7703989319318401d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13435");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3380.558658643968d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13436");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.02741500344259761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003758147439736d + "'", double1 == 1.0003758147439736d);
    }

    @Test
    public void test13437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13437");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0519393961983163d, 0.49620195291270724d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10429410794845573d + "'", double2 == 0.10429410794845573d);
    }

    @Test
    public void test13438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13438");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.16305427565736225d, 5.824846225420026E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5672240062138871d + "'", double2 == 1.5672240062138871d);
    }

    @Test
    public void test13439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13439");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5415833237027999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4328100205340816d + "'", double1 == 0.4328100205340816d);
    }

    @Test
    public void test13440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13440");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1175057225567089d, 1.0821368667394677d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1175057225567089d + "'", double2 == 1.1175057225567089d);
    }

    @Test
    public void test13441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13441");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.16666666666666666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16743934398751595d + "'", double1 == 0.16743934398751595d);
    }

    @Test
    public void test13442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13442");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.7739894478141198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7739894478141196d) + "'", double1 == (-1.7739894478141196d));
    }

    @Test
    public void test13443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13443");
        double double1 = org.apache.commons.math.util.FastMath.rint(20948.590341753694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20949.0d + "'", double1 == 20949.0d);
    }

    @Test
    public void test13444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13444");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.6881171418161346E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.69314718055995d + "'", double1 == 100.69314718055995d);
    }

    @Test
    public void test13445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13445");
        int int2 = org.apache.commons.math.util.FastMath.max(65, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test13446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13446");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 21L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test13447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13447");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.191466239019064d + "'", double1 == 1.191466239019064d);
    }

    @Test
    public void test13448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13448");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.12217394401427815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9130214060198962d) + "'", double1 == (-0.9130214060198962d));
    }

    @Test
    public void test13449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13449");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.047436422015804246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04741863366609028d + "'", double1 == 0.04741863366609028d);
    }

    @Test
    public void test13450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13450");
        double double1 = org.apache.commons.math.util.FastMath.exp(15.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3269017.3724721107d + "'", double1 == 3269017.3724721107d);
    }

    @Test
    public void test13451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13451");
        double double2 = org.apache.commons.math.util.FastMath.min(1.551648944791524d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test13452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13452");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.025402613139603337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025399881207383d + "'", double1 == 0.025399881207383d);
    }

    @Test
    public void test13453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13453");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test13454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13454");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3414179241869126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35569666594586236d + "'", double1 == 0.35569666594586236d);
    }

    @Test
    public void test13455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13455");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.719767342840083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9646520626422475d + "'", double1 == 2.9646520626422475d);
    }

    @Test
    public void test13456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13456");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.21940482668407568d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13457");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.8589849307047837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test13458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13458");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3142624216984847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6798777329901241d + "'", double1 == 0.6798777329901241d);
    }

    @Test
    public void test13459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13459");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.757447703809722d), 0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.757447703809722d) + "'", double2 == (-1.757447703809722d));
    }

    @Test
    public void test13460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13460");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7045495209043636d, (-1.629029208709809d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.733389530225801d + "'", double2 == 2.733389530225801d);
    }

    @Test
    public void test13461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13461");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test13462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13462");
        int int2 = org.apache.commons.math.util.FastMath.max((-5), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test13463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13463");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707963267948823d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13464");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5298961219858488d), 1.0232758299736455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5298961219858487d) + "'", double2 == (-0.5298961219858487d));
    }

    @Test
    public void test13465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13465");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7611452618032624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9130386933385013d) + "'", double1 == (-0.9130386933385013d));
    }

    @Test
    public void test13466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13466");
        long long2 = org.apache.commons.math.util.FastMath.max(21L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21L + "'", long2 == 21L);
    }

    @Test
    public void test13467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13467");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 573L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test13468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13468");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0605566643729682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2549933183688529d + "'", double1 == 1.2549933183688529d);
    }

    @Test
    public void test13469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13469");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2510922586777372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test13470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13470");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.2884410516143325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7533566748044158d + "'", double1 == 0.7533566748044158d);
    }

    @Test
    public void test13471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13471");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.40770160394586774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3871280085871781d) + "'", double1 == (-0.3871280085871781d));
    }

    @Test
    public void test13472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13472");
        double double2 = org.apache.commons.math.util.FastMath.max(13.845300947487885d, 0.2855617141854978d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.845300947487885d + "'", double2 == 13.845300947487885d);
    }

    @Test
    public void test13473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13473");
        float float2 = org.apache.commons.math.util.FastMath.min(24.0f, 46.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24.0f + "'", float2 == 24.0f);
    }

    @Test
    public void test13474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13474");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.676406743021734d, (double) 26L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.676406743021735d + "'", double2 == 7.676406743021735d);
    }

    @Test
    public void test13475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13475");
        double double1 = org.apache.commons.math.util.FastMath.atanh(13.522442286918901d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13476");
        double double2 = org.apache.commons.math.util.FastMath.pow((-21.705919018022865d), 76.19939021146808d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test13477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13477");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5893504478253487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.767293314537504d + "'", double1 == 33.767293314537504d);
    }

    @Test
    public void test13478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13478");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.015910541093645102d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13479");
        long long2 = org.apache.commons.math.util.FastMath.min(88L, 6061L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88L + "'", long2 == 88L);
    }

    @Test
    public void test13480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13480");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.1474836470000002E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483647E9d + "'", double1 == 2.147483647E9d);
    }

    @Test
    public void test13481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13481");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.9084938189508023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4274340374889793d + "'", double1 == 1.4274340374889793d);
    }

    @Test
    public void test13482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13482");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5780308183687116d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13483");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test13484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13484");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 23L, 7.0368744E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test13485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13485");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.073385839060845E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.41034234681374E-4d + "'", double1 == 8.41034234681374E-4d);
    }

    @Test
    public void test13486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13486");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.778585770254719d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13487");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6134071408270492d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6526049779830512d) + "'", double1 == (-0.6526049779830512d));
    }

    @Test
    public void test13488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13488");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.190457935876819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13489");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5480438588551437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.69637961354545d + "'", double1 == 88.69637961354545d);
    }

    @Test
    public void test13490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13490");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.733677467944594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2201089985312494d + "'", double1 == 1.2201089985312494d);
    }

    @Test
    public void test13491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13491");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0803868273741325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08047343252769867d + "'", double1 == 0.08047343252769867d);
    }

    @Test
    public void test13492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13492");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6674572160283838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13493");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.22690570903791685d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7969959282601431d + "'", double1 == 0.7969959282601431d);
    }

    @Test
    public void test13494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13494");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9479282788649209d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test13495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13495");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0996148964519306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10474539477439905d + "'", double1 == 0.10474539477439905d);
    }

    @Test
    public void test13496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13496");
        double double1 = org.apache.commons.math.util.FastMath.log10(35.627088500697376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5517803326023183d + "'", double1 == 1.5517803326023183d);
    }

    @Test
    public void test13497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13497");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.970329505706851d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13498");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7929030831950329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9155585851901884d + "'", double1 == 0.9155585851901884d);
    }

    @Test
    public void test13499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13499");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8921309921954693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6377037030086881d + "'", double1 == 0.6377037030086881d);
    }

    @Test
    public void test13500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13500");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.030950552935740366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03094067572170715d) + "'", double1 == (-0.03094067572170715d));
    }
}

