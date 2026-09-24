package org.apache.commons.math3.util;

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
        double double1 = org.apache.commons.math3.util.FastMath.cos((-1.0823734317612075d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46923377193038524d + "'", double1 == 0.46923377193038524d);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-149));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.600540585471551d) + "'", double1 == (-2.600540585471551d));
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.0f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) ' ', 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 9.536743E-7f, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.648027917416435E219d + "'", double2 == 5.648027917416435E219d);
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.269871691676145d, 35.00000381469727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.269871691676145d + "'", double2 == 5.269871691676145d);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.0562853121379475E-37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-84.07844821253163d) + "'", double1 == (-84.07844821253163d));
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.688345401322032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6430926109273056d + "'", double1 == 0.6430926109273056d);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1023), 5447015486L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5447015486L + "'", long2 == 5447015486L);
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3108324944320862d + "'", double1 == 1.3108324944320862d);
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        long long2 = org.apache.commons.math3.util.FastMath.min(138L, (long) 1018);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(31.911465395190167d, 102.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.911465395190167d + "'", double2 == 31.911465395190167d);
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.15052756842981832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15167488020881612d + "'", double1 == 0.15167488020881612d);
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 4096.001f, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8446748471756063E19d + "'", double2 == 1.8446748471756063E19d);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.192093037616354E-7d, 0.01893945804830624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920930376163544E-7d + "'", double2 == 1.1920930376163544E-7d);
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 9.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15707963267948966d + "'", double1 == 0.15707963267948966d);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.6378768135265336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06703019001296902d) + "'", double1 == (-0.06703019001296902d));
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-3.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.99189285848507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5471063997054444d + "'", double1 == 0.5471063997054444d);
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5716460415244097E-138d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-458) + "'", int1 == (-458));
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-18));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.5403024061792941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403024061792943d + "'", double1 == 0.5403024061792943d);
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.19607161940718024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2166140353901593d + "'", double1 == 0.2166140353901593d);
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-2.09E-43f), 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.09E-43f + "'", float2 == 2.09E-43f);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.188257982441615E9d, (-0.10172233398898892d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326880503d + "'", double2 == 1.570796326880503d);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.2238399254752328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1062729886764988d + "'", double1 == 1.1062729886764988d);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        long long1 = org.apache.commons.math3.util.FastMath.round(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        double double1 = org.apache.commons.math3.util.FastMath.log(38.025003373828866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.63824392687195d + "'", double1 == 3.63824392687195d);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        double double2 = org.apache.commons.math3.util.FastMath.log(403.4287934927351d, 1.602619601945246E39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.045409694732443d + "'", double2 == 15.045409694732443d);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.189620006501493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 182.75176462302574d + "'", double1 == 182.75176462302574d);
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        double double1 = org.apache.commons.math3.util.FastMath.sin(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999902065507035d) + "'", double1 == (-0.9999902065507035d));
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.7627472583327795d, 1.5707949341414806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8429167374147226d + "'", double2 == 0.8429167374147226d);
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.75d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7500000000000001d + "'", double1 == 0.7500000000000001d);
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(7276.563998161455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.3734007669450157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1961161351381842d + "'", double1 == 0.1961161351381842d);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.08957411090233484d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44743247469394815d) + "'", double1 == (-0.44743247469394815d));
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.6519950360895284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6128962765107444d + "'", double1 == 0.6128962765107444d);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        long long1 = org.apache.commons.math3.util.FastMath.round(6.70949768864047E-4d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(16.252646034500078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.25264603450008d + "'", double1 == 16.25264603450008d);
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        float float2 = org.apache.commons.math3.util.FastMath.max(149.0f, (float) 12L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 6400);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6400L + "'", long1 == 6400L);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.38636319993752116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32668391545583547d + "'", double1 == 0.32668391545583547d);
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.308769561254787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09265550807355083d + "'", double1 == 0.09265550807355083d);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.63824392687195d, (double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.63824392687195d + "'", double2 == 3.63824392687195d);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 0.031250004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03126018221959883d + "'", double1 == 0.03126018221959883d);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        double double1 = org.apache.commons.math3.util.FastMath.exp(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042886E42d + "'", double1 == 1.3383347192042886E42d);
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        double double1 = org.apache.commons.math3.util.FastMath.signum(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 7L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.004335786492981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5723611106383126d + "'", double1 == 1.5723611106383126d);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        double double1 = org.apache.commons.math3.util.FastMath.rint(101.04822696504081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.4107809950605586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.389765650634909d + "'", double1 == 0.389765650634909d);
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 97, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.2676505E30f), (double) (-2.3768449E32f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2676506E30f) + "'", float2 == (-1.2676506E30f));
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        int int1 = org.apache.commons.math3.util.FastMath.round(138.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 138 + "'", int1 == 138);
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.5f), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.338253E29f) + "'", float2 == (-6.338253E29f));
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.1702617153949575d, (-458));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.91590986500387E-138d + "'", double2 == 2.91590986500387E-138d);
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.03079215E11f, 384.416897404767d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03079207E11f + "'", float2 == 1.03079207E11f);
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        double double1 = org.apache.commons.math3.util.FastMath.abs(192.21757041936067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.21757041936067d + "'", double1 == 192.21757041936067d);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        double double1 = org.apache.commons.math3.util.FastMath.acos(5.983978114526449E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267889127d + "'", double1 == 1.5707963267889127d);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.5707952330074615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 914254.422643271d + "'", double1 == 914254.422643271d);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000002f + "'", float1 == 3.0000002f);
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.17453292519943295d, (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.331580545039619E-6d + "'", double2 == 1.331580545039619E-6d);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(31.999998f, (-106));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9443043E-31f + "'", float2 == 3.9443043E-31f);
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        long long2 = org.apache.commons.math3.util.FastMath.max(1018L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.337497748560931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33749774856093107d + "'", double1 == 0.33749774856093107d);
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(16.93539593942879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1321892048529211E7d + "'", double1 == 1.1321892048529211E7d);
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.832824094709035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6727890835229181d + "'", double1 == 0.6727890835229181d);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.9611213280559075E-308d, 2.080594477611303E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9611213280559075E-308d + "'", double2 == 1.9611213280559075E-308d);
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.9897050718833815d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6283137044023508d) + "'", double1 == (-0.6283137044023508d));
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.8828125E-4f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.565804732394659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2888027187107256d + "'", double1 == 2.2888027187107256d);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1.9342813E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.224363167035406d + "'", double1 == 58.224363167035406d);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.8146972656157483E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        double double1 = org.apache.commons.math3.util.FastMath.exp(328281.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.00597000407914589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005970039541977278d) + "'", double1 == (-0.005970039541977278d));
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.820766091346741E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.584283767291423E71d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.584283767291423E71d + "'", double2 == 7.584283767291423E71d);
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.7615941559557649d), (double) 63.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615941559557649d + "'", double2 == 0.7615941559557649d);
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(10.052274715955628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23207.519636520385d + "'", double1 == 23207.519636520385d);
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        long long1 = org.apache.commons.math3.util.FastMath.abs(79L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 79L + "'", long1 == 79L);
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.3899118098135099d), 13.394771296627335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.38991180981350987d) + "'", double2 == (-0.38991180981350987d));
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.3351068943768114d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.670213788753623d + "'", double2 == 2.670213788753623d);
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.108075398769753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8504903148613345d) + "'", double1 == (-3.8504903148613345d));
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.8387762206112901d), (double) (-253.99998f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.33667481938672716d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0551539859229482d + "'", double2 == 1.0551539859229482d);
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2.24E-44f, 328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        double double2 = org.apache.commons.math3.util.FastMath.min((-19.409313714545853d), (double) 1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-19.409313714545853d) + "'", double2 == (-19.409313714545853d));
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.7798115718222205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6525985397934726d + "'", double1 == 0.6525985397934726d);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-6), (long) 1018);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1018L + "'", long2 == 1018L);
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.6931471805599453d, 1.6202204943810763E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.278104017100014E-21d + "'", double2 == 4.278104017100014E-21d);
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.15978926741180702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.012793491209214d + "'", double1 == 1.012793491209214d);
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1761948595190557E-53d + "'", double1 == 4.1761948595190557E-53d);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6094379124341003d + "'", double1 == 1.6094379124341003d);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        int int2 = org.apache.commons.math3.util.FastMath.min(5, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.0f), (int) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        float float2 = org.apache.commons.math3.util.FastMath.max(1500.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0f + "'", float2 == 1500.0f);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0036030562437495d, 1.9978517795247785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0036030562437497d + "'", double2 == 1.0036030562437497d);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        int int2 = org.apache.commons.math3.util.FastMath.max((-6), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0317125014678934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5133499650156709d + "'", double1 == 0.5133499650156709d);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.684342E-14f + "'", float1 == 5.684342E-14f);
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.021989770635849296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021986227279203782d) + "'", double1 == (-0.021986227279203782d));
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.17190027517928788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1727481272914977d + "'", double1 == 0.1727481272914977d);
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.7627472583327795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7627472583327795d + "'", double1 == 1.7627472583327795d);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.16244735150962653d, (double) (-126.99998f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16244735150962653d) + "'", double2 == (-0.16244735150962653d));
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.9950547536867305d), 79);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.014736918310818E23d) + "'", double2 == (-6.014736918310818E23d));
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        double double2 = org.apache.commons.math3.util.FastMath.log(96.30685281944005d, (-0.4103302129827837d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1023);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1023.0d + "'", double1 == 1023.0d);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 4096.0005f, 12.378790834633142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5677741706249706d + "'", double2 == 1.5677741706249706d);
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.6519950360895284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7102126686676506d + "'", double1 == 0.7102126686676506d);
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(38.72983776538828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.383362716805521d + "'", double1 == 3.383362716805521d);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7976931348623157E308d) + "'", double1 == (-1.7976931348623157E308d));
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.10172233398898892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.672694910211587d + "'", double1 == 1.672694910211587d);
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-149.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5060119336077026E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5404161777443722d, 182.75176462302574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 182.7525636550004d + "'", double2 == 182.7525636550004d);
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.2998044433940747d, (-1023.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.0008257531325d + "'", double2 == 1023.0008257531325d);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.18360360379727975d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-5.4470154E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-5.4470149E9f) + "'", float1 == (-5.4470149E9f));
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7782794100389228d + "'", double1 == 1.7782794100389228d);
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 10, (long) 1018);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.557407724654902d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02718189259122131d) + "'", double1 == (-0.02718189259122131d));
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.19607161940718026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0192837000737716d + "'", double1 == 1.0192837000737716d);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6413706132531851d + "'", double1 == 0.6413706132531851d);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.383362716805521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9709157047357585d) + "'", double1 == (-0.9709157047357585d));
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1500.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.3789102796893686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0726495045964528d + "'", double1 == 1.0726495045964528d);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        double double2 = org.apache.commons.math3.util.FastMath.pow(10.000000000000002d, 148.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000263E148d + "'", double2 == 1.0000000000000263E148d);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.952895810720043E12d, (-0.7438257353236503d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.4016131876221174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3915327099543454d + "'", double1 == 0.3915327099543454d);
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.17702174851391653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5614902362389387d + "'", double1 == 0.5614902362389387d);
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4096.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(31.594603878732343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.594603878732347d + "'", double1 == 31.594603878732347d);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        long long1 = org.apache.commons.math3.util.FastMath.abs(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.0771875889955993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9970225167945358d + "'", double1 == 0.9970225167945358d);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.027415567780803774d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 1.0842023E-19f, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0842023017324751E-19d + "'", double2 == 1.0842023017324751E-19d);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.8370630725347682d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-47.96018124249531d) + "'", double1 == (-47.96018124249531d));
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.176091259055682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.872707828823713d + "'", double1 == 1.872707828823713d);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 148.99998474121094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4096.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.848629212096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014811373879680489d + "'", double1 == 0.014811373879680489d);
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.0194839173657902E-28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0194839173657902E-28d + "'", double1 == 2.0194839173657902E-28d);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1932800507380155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.873294847951899d + "'", double1 == 0.873294847951899d);
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2979.38053468028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988093d + "'", double1 == 4.605170185988093d);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.4374925441739296d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 9223372036854775807L, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1691265E29f + "'", float2 == 3.1691265E29f);
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.2913289205442933d, (-2.600540585471551d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2913289205442933d) + "'", double2 == (-1.2913289205442933d));
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(39.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.3625831891367726E215d, 4.465643948356059E96d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        float float1 = org.apache.commons.math3.util.FastMath.signum(31.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1920930376163597E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192093037616354E-7d + "'", double1 == 1.192093037616354E-7d);
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.4842386559313054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2182933373910019d + "'", double1 == 1.2182933373910019d);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 3L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.0512062454087515E29d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1024.9998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 4294967296L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9875650456761652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1561034226520874d + "'", double1 == 1.1561034226520874d);
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.031634807252392476d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031139661750354587d) + "'", double1 == (-0.031139661750354587d));
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        int int2 = org.apache.commons.math3.util.FastMath.max(14, 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-3.8504903148613345d), 1.471793136883215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.850490314861334d) + "'", double2 == (-3.850490314861334d));
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.223373E19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223373E19f + "'", float1 == 9.223373E19f);
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0585641430645576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05691340783384365d + "'", double1 == 0.05691340783384365d);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(10.545893600459793d, 3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2456317406686555d + "'", double2 == 1.2456317406686555d);
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.298292365610486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7433261306201426d + "'", double1 == 1.7433261306201426d);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4096.0005f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.598150033144236d + "'", double1 == 54.598150033144236d);
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.3899118098135099d), 0.16267372390397128d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.27151120192428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.24E-44f, (double) 22025L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4E-44f + "'", float2 == 2.4E-44f);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.570796326880503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012989025220967d + "'", double1 == 2.3012989025220967d);
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.3625831891367726E215d, 0.9679911994835083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9679911994835083d + "'", double2 == 0.9679911994835083d);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        float float1 = org.apache.commons.math3.util.FastMath.signum(52.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.1760912590556813d, 8.699271704857068E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.699271704857068E-5d + "'", double2 == 8.699271704857068E-5d);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.1761948595190557E-53d, 3050885.6675126073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.176194859519057E-53d + "'", double2 == 4.176194859519057E-53d);
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(101.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.16244735150962653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17638638185117023d + "'", double1 == 0.17638638185117023d);
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0269035089368426d, (-0.15919828051924276d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0269035089368426d) + "'", double2 == (-1.0269035089368426d));
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.066281120220074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 430.07458243245395d + "'", double1 == 430.07458243245395d);
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 138.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.228037402771233d) + "'", double1 == (-0.228037402771233d));
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.63824392687195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.16267372390397128d, 126.99999237060547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.667490975180856d) + "'", double2 == (-2.667490975180856d));
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9971213268799871d + "'", double1 == 0.9971213268799871d);
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.185891831851989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.8648790814947103d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(53248.0f, 0.7341433604804716d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53247.996f + "'", float2 == 53247.996f);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(9.5367431640625E-7d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 6L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.1741109918529156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7721795659792d + "'", double1 == 1.7721795659792d);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.7724538509055159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2102032422537643d + "'", double1 == 1.2102032422537643d);
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 127.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(11.0d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 6400L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.381888937281653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9822099981282539d) + "'", double1 == (-0.9822099981282539d));
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.3710953E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.02648053791345d + "'", double1 == 18.02648053791345d);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.522697550491263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.522697550491263d + "'", double1 == 1.522697550491263d);
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.4531176911848156E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4055329035376677E27d + "'", double1 == 1.4055329035376677E27d);
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-17), 2.234021194410018d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.999998f) + "'", float2 == (-16.999998f));
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 15L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        int int1 = org.apache.commons.math3.util.FastMath.round(53247.996f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53248 + "'", int1 == 53248);
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 22025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.693080631879683d + "'", double1 == 10.693080631879683d);
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.620414103520911d, 6.735936195599085E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267947769d + "'", double2 == 1.5707963267947769d);
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        int int1 = org.apache.commons.math3.util.FastMath.abs(63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(31.999996f, 1.0000000000000284d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.999994f + "'", float2 == 31.999994f);
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.9914900537226896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6077344731494023d + "'", double1 == 1.6077344731494023d);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.0995616862503343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9500520559216498d) + "'", double1 == (-0.9500520559216498d));
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.2350186363540905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.573806628911546d) + "'", double1 == (-1.573806628911546d));
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 138L, (float) 1018L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.07726425812829045d, 0.5127512017063653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07726425812829045d + "'", double2 == 0.07726425812829045d);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.661011522946662d + "'", double1 == 0.661011522946662d);
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(89.40934278535332d, (double) 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021824986869035452d + "'", double2 == 0.021824986869035452d);
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        float float1 = org.apache.commons.math3.util.FastMath.signum(22025.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        long long2 = org.apache.commons.math3.util.FastMath.max(4096L, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        int int2 = org.apache.commons.math3.util.FastMath.max(1023, 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1023 + "'", int2 == 1023);
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-253.99998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0227318499062852E110d + "'", double1 == 1.0227318499062852E110d);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.07726425812829045d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9075712776160786d, 7.306979419100936E85d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.306979419100936E85d + "'", double2 == 7.306979419100936E85d);
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.544245235091198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02695216381057528d + "'", double1 == 0.02695216381057528d);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 149L, (-31.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7759236913328136d + "'", double2 == 1.7759236913328136d);
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.8828125E-4f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 22025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.0d + "'", double1 == 22025.0d);
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(15.00402842524522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.004028425245222d + "'", double1 == 15.004028425245222d);
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1884224E32f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 106, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 106.0f + "'", float2 == 106.0f);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-458));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 458L + "'", long1 == 458L);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 63, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        float float2 = org.apache.commons.math3.util.FastMath.max(1500.0001f, (-1.9843749f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0001f + "'", float2 == 1500.0001f);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-253.99998f), (-0.027415567780803774d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4337808304830271d + "'", double1 == 0.4337808304830271d);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.22011573792157446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24860975225892687d) + "'", double1 == (-0.24860975225892687d));
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.0038417443621884145d), (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4655091713670404E-8d) + "'", double2 == (-1.4655091713670404E-8d));
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6420926159343308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.747801550829054d + "'", double1 == 0.747801550829054d);
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 5447015486L, 750);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.814697720372351E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999999992724d + "'", double1 == 0.999999999992724d);
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        double double1 = org.apache.commons.math3.util.FastMath.log(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.57791748631743d) + "'", double1 == (-32.57791748631743d));
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.2089257E24f, 750.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2089257E24f + "'", float2 == 1.2089257E24f);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.00001f, 14);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1638400.1f + "'", float2 == 1638400.1f);
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 12L, 0.7450920600186577d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11.999999f + "'", float2 == 11.999999f);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.10172233398898892d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.0562853E-37f, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-2.09E-43f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.9325167282148206E-15d) + "'", double1 == (-5.9325167282148206E-15d));
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 6400.0f, 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17425494561394386d + "'", double2 == 0.17425494561394386d);
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.11977834331526022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 149L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-3L), 10.067661995777765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9999999999999996d) + "'", double2 == (-2.9999999999999996d));
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.824212550988658E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0165168535073021E8d + "'", double1 == 1.0165168535073021E8d);
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-6L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.999999999999999d) + "'", double1 == (-5.999999999999999d));
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.000667111259251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5596953038813823d + "'", double1 == 1.5596953038813823d);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(35.000008f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-4));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-3.9999998f) + "'", float1 == (-3.9999998f));
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.807880403871141d, 127.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7103239887280342E-12d + "'", double2 == 1.7103239887280342E-12d);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(56.01144166945411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.718623469602896d + "'", double1 == 4.718623469602896d);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 3, (float) 22025L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.1884223E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.9520523170857447d, 0.3686583499659085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10876056725620209d + "'", double2 == 0.10876056725620209d);
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 15.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3269017.3724721107d + "'", double1 == 3269017.3724721107d);
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.3625831891367726E215d, (double) 2.24E-44f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2420775429197073E-44d + "'", double2 == 2.2420775429197073E-44d);
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(6.70949768864047E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.709497185234125E-4d + "'", double1 == 6.709497185234125E-4d);
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1638400.1f, 63.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1638400.1f + "'", float2 == 1638400.1f);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.7911843097149078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8894854184948215d + "'", double1 == 0.8894854184948215d);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.373400766945016d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.373400766945016d + "'", double2 == 1.373400766945016d);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0585641430645576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7220087218417287d + "'", double1 == 0.7220087218417287d);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        long long2 = org.apache.commons.math3.util.FastMath.max(97L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.0970924770267199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09709247702671989d) + "'", double1 == (-0.09709247702671989d));
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 0.001953125f, 0.15987052369731924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2938915700029449d + "'", double2 == 0.2938915700029449d);
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.3025849976266093d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.7144175303058917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2178216919163152d + "'", double1 == 1.2178216919163152d);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        int int2 = org.apache.commons.math3.util.FastMath.max((-17), 106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.001401979773852388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00140198023312869d + "'", double1 == 0.00140198023312869d);
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6880966331881486E43d + "'", double1 == 2.6880966331881486E43d);
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        int int1 = org.apache.commons.math3.util.FastMath.round((-127.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1025);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.6880966331881486E43d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 144 + "'", int1 == 144);
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.07156993751100402d, (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0011182802736094378d + "'", double2 == 0.0011182802736094378d);
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.150426909772811E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.0000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8387762206112901d), 5.824212550988658E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.7005101697610547d, 2.617514616813844d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8123449763706567d + "'", double2 == 1.8123449763706567d);
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.0842023E-19f, 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842023E-19f + "'", float2 == 1.0842023E-19f);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.163544458620017d, 1.1920930376163597E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920930376163597E-7d + "'", double2 == 1.1920930376163597E-7d);
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        double double1 = org.apache.commons.math3.util.FastMath.atan(908.3976140407738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5696954877123248d + "'", double1 == 1.5696954877123248d);
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1029.9685644157091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1029.0d + "'", double1 == 1029.0d);
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-3L), (-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.014609506662591823d) + "'", double2 == (-0.014609506662591823d));
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.99500000000002d + "'", double1 == 49.99500000000002d);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.066281120220074d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.066281120220074d + "'", double2 == 6.066281120220074d);
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5327963125236284E304d, (-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        long long1 = org.apache.commons.math3.util.FastMath.abs(149L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.0688248503046665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-61.239152961159384d) + "'", double1 == (-61.239152961159384d));
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5707963264277232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356089556d + "'", double1 == 0.9171523356089556d);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.602619601945246E39d, 1.1321892048529211E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17992474214638624d + "'", double2 == 0.17992474214638624d);
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        double double2 = org.apache.commons.math3.util.FastMath.min(27.386127875258307d, (double) (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2676505246703657E30d) + "'", double2 == (-1.2676505246703657E30d));
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        float float2 = org.apache.commons.math3.util.FastMath.min(131072.02f, 148.99998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 148.99998f + "'", float2 == 148.99998f);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0130295945424812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7670121802616704d + "'", double1 == 0.7670121802616704d);
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8429167374147226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        double double2 = org.apache.commons.math3.util.FastMath.max(2979.3805346802806d, 1.0842023017324751E-19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2979.3805346802806d + "'", double2 == 2979.3805346802806d);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-44.3614195558365d), 3.6764351714917964E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.676435171491823E8d + "'", double2 == 3.676435171491823E8d);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        int int2 = org.apache.commons.math3.util.FastMath.max(12, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 31.999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.09966865249116202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950371902099892d + "'", double1 == 0.9950371902099892d);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1025);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.63824392687195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5380269225745904d + "'", double1 == 1.5380269225745904d);
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        float float2 = org.apache.commons.math3.util.FastMath.min(10.000002f, 3.1691265E29f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000002f + "'", float2 == 10.000002f);
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.7528415227961108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.134641898419105d + "'", double1 == 43.134641898419105d);
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(268.3983345924218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.285615910267171d + "'", double1 == 6.285615910267171d);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 79);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 79.0f + "'", float1 == 79.0f);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0000000074505806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-18));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1 == (-18));
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.3129131773544485d, (-0.3440960317521253d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6354719781306986d + "'", double2 == 1.6354719781306986d);
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.026931837701290245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026931837701290248d + "'", double1 == 0.026931837701290248d);
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.17335893897908844d, (double) 138L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17335893897908844d + "'", double2 == 0.17335893897908844d);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.4425149084880988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(223.2377295332742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.931287896711864E96d + "'", double1 == 8.931287896711864E96d);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.6503694795665515E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.60440290961644d + "'", double1 == 92.60440290961644d);
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.058704492638887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8014959971344089d + "'", double1 == 1.8014959971344089d);
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        long long2 = org.apache.commons.math3.util.FastMath.min(15L, (long) 1025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.6217880014903024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6217880014903024d + "'", double1 == 0.6217880014903024d);
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.383362716805521d, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.025819886105840354d + "'", double2 == 0.025819886105840354d);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 127.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7276.5644352935615d + "'", double1 == 7276.5644352935615d);
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(79.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3788101090755207d + "'", double1 == 1.3788101090755207d);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(12.000001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.14620091577486963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14725614967358547d + "'", double1 == 0.14725614967358547d);
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.850338976445283E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.974779993689529E12d + "'", double1 == 4.974779993689529E12d);
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (short) 10, 2.935723255711777E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4063156261557984E-38d + "'", double2 == 3.4063156261557984E-38d);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.7320508075688774d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(80.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4583.662361046586d + "'", double1 == 4583.662361046586d);
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5862338664598659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1662430606729808d + "'", double1 == 1.1662430606729808d);
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.8851621707325812d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.3931722845112914d), 1.1062729886764988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.34147968535479184d) + "'", double2 == (-0.34147968535479184d));
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(16.252646034500078d, 4.1761948595190557E-53d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.228037402771233d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.796094483138759d + "'", double1 == 0.796094483138759d);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9875650456761652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0054342900833709755d) + "'", double1 == (-0.0054342900833709755d));
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.9E-324d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        int int2 = org.apache.commons.math3.util.FastMath.min((-4), 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 6);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.334875669653525d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        double double2 = org.apache.commons.math3.util.FastMath.min(16.21301914394243d, (-0.8052885407089897d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8052885407089897d) + "'", double2 == (-0.8052885407089897d));
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 144);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(22026.002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22026.004f + "'", float1 == 22026.004f);
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0174594433763538d, 0.0325944886750007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8457801672828005d + "'", double2 == 0.8457801672828005d);
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.570796326794893d, 0.002824153421498769d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002824153421498769d + "'", double2 == 0.002824153421498769d);
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1025, (float) (-18));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-18.0f) + "'", float2 == (-18.0f));
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.14672230633339658d, 1.4716190657154944d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09937288259301753d + "'", double2 == 0.09937288259301753d);
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(52.11725091815784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1537956230870856E22d + "'", double1 == 2.1537956230870856E22d);
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.194983122255699E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 223.17520542459923d + "'", double1 == 223.17520542459923d);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 7, (-18L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.3351068943768114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-9.2233709E18f) + "'", float1 == (-9.2233709E18f));
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 0.001953125f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001953127483530655d + "'", double1 == 0.001953127483530655d);
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        float float2 = org.apache.commons.math3.util.FastMath.min(35.0f, (float) (-4));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.1537956230870856E22d, 1.3601695942848226E29d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.304496767367758d + "'", double2 == 1.304496767367758d);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.269984763141685E296d, (double) 22026L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        int int2 = org.apache.commons.math3.util.FastMath.min((-17), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(12.035003420284841d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.15919046908362347d, 0.8291319638968807d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21791339488786254d + "'", double2 == 0.21791339488786254d);
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 149, 0.6717532003326169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6717532003326169d + "'", double2 == 0.6717532003326169d);
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-6.014736918310818E23d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1023L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.4121184852417566d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(97.00001f, 1261939.543775638d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.000015f + "'", float2 == 97.000015f);
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 3, (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.09E-43f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.09E-43f + "'", float1 == 2.09E-43f);
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-7.263102063200969E31d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        long long2 = org.apache.commons.math3.util.FastMath.min(138L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.13970721181982995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5188871811480065d + "'", double1 == 0.5188871811480065d);
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        double double1 = org.apache.commons.math3.util.FastMath.asin(6.666665679012609E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.666666172839648E-4d + "'", double1 == 6.666666172839648E-4d);
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        long long2 = org.apache.commons.math3.util.FastMath.max(4294967296L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4294967296L + "'", long2 == 4294967296L);
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.1368683772161603E-13d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1368683772161603E-13d + "'", double2 == 1.1368683772161603E-13d);
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 512.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0036030562437497d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5437283808052962d, 84.31756151648315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5437283808052962d + "'", double2 == 1.5437283808052962d);
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.13970721181982995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8547811746108328d) + "'", double1 == (-0.8547811746108328d));
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.298292365610486d, 1024.0000003439764d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0137072356283d + "'", double2 == 1024.0137072356283d);
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.4716190657154942d, 0.46923377193038524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5446174307243075d + "'", double2 == 1.5446174307243075d);
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(847.3800800113253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.0842023E-19f, (-18));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1359036E-25f + "'", float2 == 4.1359036E-25f);
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-3));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-126.99998f), (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9843746f) + "'", float2 == (-1.9843746f));
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.3796077390275217d, 0.6301286610132414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.476794584436373d + "'", double2 == 0.476794584436373d);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(138.00000000000003d, 4.382026634673881d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 138.00000000000003d + "'", double2 == 138.00000000000003d);
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.3768449E32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.376845E32f + "'", float1 == 2.376845E32f);
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.37928799478267644d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37928799478267644d + "'", double1 == 0.37928799478267644d);
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.6448115121396387E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7341433604804715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9376558078861459d + "'", double1 == 0.9376558078861459d);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 35.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.7399130658427445E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.739913065842745E-6d + "'", double1 == 2.739913065842745E-6d);
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.2238399254752328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7992353978425616d + "'", double1 == 0.7992353978425616d);
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.63824392687195d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 22026.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 384.426221044271d + "'", double1 == 384.426221044271d);
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.43361281667855023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0954922813103776d + "'", double1 == 1.0954922813103776d);
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-52.000004f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-52.0f) + "'", float1 == (-52.0f));
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(12.03500342028484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 689.5549024078317d + "'", double1 == 689.5549024078317d);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980153d + "'", double1 == 0.6108652381980153d);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.337497748560931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2908005164676777d + "'", double1 == 0.2908005164676777d);
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.5557864E22f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2835960924048626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.666278804840212d + "'", double1 == 1.666278804840212d);
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.430218907497497E55d, (double) (-5.4470154E9f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-0.9999999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.9999999f + "'", float1 == 0.9999999f);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.0272356433040997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-6L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 1.1884224E32f, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.104235503814077E41d + "'", double2 == 5.104235503814077E41d);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.38991180981351d), 1.5563207343123242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.24548152128728426d) + "'", double2 == (-0.24548152128728426d));
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5689319876403915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5145744929332654d + "'", double1 == 0.5145744929332654d);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590458d + "'", double1 == 1.7182818284590458d);
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-6.338253E29f), 99.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.338253E29f + "'", float2 == 6.338253E29f);
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.0038417443621884145d), 0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04399474110473024d) + "'", double2 == (-0.04399474110473024d));
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.23422432986760747d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5437283808052962d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.026931837701290248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026928583045972357d + "'", double1 == 0.026928583045972357d);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.002893947719693431d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.002889764289507054d) + "'", double1 == (-0.002889764289507054d));
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.38636319993752116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(8.317766405137894d, 8388608.06237799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.317766405137894d + "'", double2 == 8.317766405137894d);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.477888730288475d + "'", double1 == 2.477888730288475d);
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1500L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1500 + "'", int1 == 1500);
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.7670121802616704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.308860714383271d + "'", double1 == 1.308860714383271d);
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-4.825487151967882d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.825487151967882d + "'", double1 == 4.825487151967882d);
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536743164059608E-7d + "'", double1 == 9.536743164059608E-7d);
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(6.691673596021348E41d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.1962369316816621d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.4391749470972324d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.1920928E-7f, (float) (-54));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-54.0f) + "'", float2 == (-54.0f));
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.4107809950605586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39932547317763495d + "'", double1 == 0.39932547317763495d);
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-18L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.5707860170342276d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-106));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        double double2 = org.apache.commons.math3.util.FastMath.pow(101.46782120377229d, 2.128360965853085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18629.058771181848d + "'", double2 == 18629.058771181848d);
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.176091259055682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.95294447899659d + "'", double1 == 22.95294447899659d);
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.016388539363305053d, 0.40180391273652716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40213799685287804d + "'", double2 == 0.40213799685287804d);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.6209036226920994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 138.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.281689144134155E59d + "'", double1 == 4.281689144134155E59d);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-127.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-126.99999f) + "'", float1 == (-126.99999f));
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.40432E16f, 5.40432E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.40432E16f + "'", float2 == 5.40432E16f);
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.5474735E-13f, (float) 1025L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5474735E-13f + "'", float2 == 4.5474735E-13f);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 149L, (-149));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.09E-43f + "'", float2 == 2.09E-43f);
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        double double1 = org.apache.commons.math3.util.FastMath.rint(89.65361018130909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.649558242894909d + "'", double1 == 2.649558242894909d);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8191520442889918d + "'", double1 == 0.8191520442889918d);
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-17L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-3L), (float) (-106));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.18360360379727975d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.2676506E30f), 2.8190930489946614E-4d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2676505E30f) + "'", float2 == (-1.2676505E30f));
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.11052961946631416d, 5.447015486E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.178715679155326d) + "'", double2 == (-10.178715679155326d));
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.0026306558026923d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.63824392687195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.999352444162646d + "'", double1 == 18.999352444162646d);
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.22374095013561138d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5463474835799746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.913180823778077d + "'", double1 == 0.913180823778077d);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4096, 1025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(9.178679289503757E-29d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.153770189511292E-18d + "'", double2 == 3.153770189511292E-18d);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 1025L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1025.0f + "'", float1 == 1025.0f);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        int int1 = org.apache.commons.math3.util.FastMath.abs(127);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.9998646693394199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5404161777443722d + "'", double1 == 0.5404161777443722d);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.025819886105840354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025822755842440984d + "'", double1 == 0.025822755842440984d);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.545160918273219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9964048291869961d + "'", double1 == 0.9964048291869961d);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.02655421183195658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        int int2 = org.apache.commons.math3.util.FastMath.min(1018, 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1018 + "'", int2 == 1018);
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.13970721181982995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13970721181982998d + "'", double1 == 0.13970721181982998d);
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        int int2 = org.apache.commons.math3.util.FastMath.max((-4), (-458));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7528415227961107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9794818692056363d + "'", double1 == 0.9794818692056363d);
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-127L), 2.376845E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.128360965853085d, (double) 750.00006f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 750.0030809757644d + "'", double2 == 750.0030809757644d);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.3025849976266093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.049999527931213d + "'", double1 == 5.049999527931213d);
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.44743247469394815d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.034688665149571d + "'", double1 == 2.034688665149571d);
    }
}

