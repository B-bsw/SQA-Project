package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

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
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9526563404527691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2618561409496711d + "'", double1 == 1.2618561409496711d);
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.058475939571532604d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05840942441680472d) + "'", double1 == (-0.05840942441680472d));
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0207862162123857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.020786216212386d + "'", double1 == 1.020786216212386d);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        float float2 = org.apache.commons.math.util.FastMath.min(31.0f, 2.52318064E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8028514559173916d, 35.18168321028484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4147467080473405E-4d + "'", double2 == 4.4147467080473405E-4d);
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.688117141816135E43d, 3.475279369318095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.500908011749694E150d + "'", double2 == 8.500908011749694E150d);
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8212597519207547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2110654506974416E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.480036566901908E-10d + "'", double1 == 3.480036566901908E-10d);
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1457584666761651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1569167203609059d + "'", double1 == 0.1569167203609059d);
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        double double1 = org.apache.commons.math.util.FastMath.acos((-6.053272382792571d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000823799461538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7616287512488231d + "'", double1 == 0.7616287512488231d);
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 31.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4913616938342726d + "'", double1 == 1.4913616938342726d);
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        int int1 = org.apache.commons.math.util.FastMath.round(23.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999959038668202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999959038668204d + "'", double1 == 0.9999959038668204d);
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.005282098466922115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.12187114015074264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12217304763960309d + "'", double1 == 0.12217304763960309d);
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5706030611398719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5434543632960706d + "'", double1 == 0.5434543632960706d);
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.451779620382493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6950877074459285d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.764651313204947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05223854493621339d + "'", double1 == 0.05223854493621339d);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.2611472523996335E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20642.546481477602d + "'", double1 == 20642.546481477602d);
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2624062929186908d, (-0.023923011433662468d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.023923011433662468d) + "'", double2 == (-0.023923011433662468d));
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5740864183640747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5183540397694391d) + "'", double1 == (-0.5183540397694391d));
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.518074431338224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9234944948906866d + "'", double1 == 0.9234944948906866d);
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9518224930797358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.846893402426231d + "'", double1 == 0.846893402426231d);
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-4.391593686458413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
        double double2 = org.apache.commons.math.util.FastMath.min(0.03842139290913186d, 36.741374145600744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03842139290913186d + "'", double2 == 0.03842139290913186d);
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6545457907958764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7674021743475873d) + "'", double1 == (-0.7674021743475873d));
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8657584620020855d, (-0.981364306629734d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8657584620020854d + "'", double2 == 0.8657584620020854d);
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5710894459602672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8413125757001132d + "'", double1 == 0.8413125757001132d);
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.003436071571126802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034360783325109324d) + "'", double1 == (-0.0034360783325109324d));
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        double double1 = org.apache.commons.math.util.FastMath.acosh(31.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1268741377911216d + "'", double1 == 4.1268741377911216d);
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3593642103115025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1141338224719455d + "'", double1 == 1.1141338224719455d);
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 145, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.015955941794861567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015954587847280814d + "'", double1 == 0.015954587847280814d);
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.615620091065296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4596942473591723d) + "'", double1 == (-0.4596942473591723d));
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.378163642308943E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794171d + "'", double1 == 1.570796326794171d);
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3204706870687282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.05179172083826d + "'", double1 == 1.05179172083826d);
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.04749646746707084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.323338689672147d) + "'", double1 == (-1.323338689672147d));
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0142047603949278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1609826175660287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06482571745462148d + "'", double1 == 0.06482571745462148d);
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
        double double1 = org.apache.commons.math.util.FastMath.signum(13.897423420904053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.761588719464173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1416760415139082d + "'", double1 == 1.1416760415139082d);
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0996148964519306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0996148964519306d + "'", double1 == 0.0996148964519306d);
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5401776706283433E45d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        double double2 = org.apache.commons.math.util.FastMath.min(0.12564729781709583d, (-0.20330671077725107d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.20330671077725107d) + "'", double2 == (-0.20330671077725107d));
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
        double double1 = org.apache.commons.math.util.FastMath.sin((-4.943508829600679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9734104840886619d + "'", double1 == 0.9734104840886619d);
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5582787291015412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7506370702293346d + "'", double1 == 3.7506370702293346d);
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
        long long1 = org.apache.commons.math.util.FastMath.round(0.18317440686560532d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2512253734876368d + "'", double1 == 1.2512253734876368d);
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.162277660168381d, 2.63676990927424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683804d + "'", double2 == 3.1622776601683804d);
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.676406743021734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2156.8556942637933d + "'", double1 == 2156.8556942637933d);
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-3L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9961652815068444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8786594303971343d + "'", double1 == 0.8786594303971343d);
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9957890945476039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5438408599156771d + "'", double1 == 0.5438408599156771d);
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.22942520686930212d), 1.2265357086400204d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9425345992440989d, 1.0000000000025329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9425345992439575d + "'", double2 == 0.9425345992439575d);
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5485130342067743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.8793838227939d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9619437938642785d), 1.1185968158812507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.710245585525166d) + "'", double2 == (-0.710245585525166d));
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
        long long1 = org.apache.commons.math.util.FastMath.round(2.899417119369014E-4d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.1900628023411102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0033172216864195596d + "'", double1 == 0.0033172216864195596d);
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5650577212629906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027315410219798855d + "'", double1 == 0.027315410219798855d);
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-3L), (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.01817173807132448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1447324312919247d, 2.247220505424423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.144732431291925d + "'", double2 == 1.144732431291925d);
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
        float float2 = org.apache.commons.math.util.FastMath.min((-16.0f), (float) 252318064L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.0f) + "'", float2 == (-16.0f));
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7, 5.0772058E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0772058E16f + "'", float2 == 5.0772058E16f);
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.39486927508948605d, 1.1802310322348821d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3339809623743415d + "'", double2 == 0.3339809623743415d);
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0031091414242400387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9279056024825725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6431065878336908d + "'", double1 == 1.6431065878336908d);
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.21511909301433413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
        double double1 = org.apache.commons.math.util.FastMath.log10(70.35280798945955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.847281436098986d + "'", double1 == 1.847281436098986d);
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
        int int2 = org.apache.commons.math.util.FastMath.min(22025, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
        double double1 = org.apache.commons.math.util.FastMath.cos(79.49946532142216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5738075019839932d) + "'", double1 == (-0.5738075019839932d));
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 32.0f, 1.1373220393635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-6.640836539336446E160d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.24434121060991826d, 65.16375280274023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24434121060991829d + "'", double2 == 0.24434121060991829d);
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.901885733895505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.901885733895505d + "'", double1 == 1.901885733895505d);
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 252318064, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5122039064583164d, 0.5017009167919776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2504552028748932d + "'", double2 == 1.2504552028748932d);
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 26L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14088");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.831008000716577E22d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14089");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2510922586777372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14090");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.12217304763960307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14091");
        double double1 = org.apache.commons.math.util.FastMath.log(1.286032070646461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2515615637987667d + "'", double1 == 0.2515615637987667d);
    }

    @Test
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14092");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9225239138463643E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.922523913609503E-5d + "'", double1 == 1.922523913609503E-5d);
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14093");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.9996560133851694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14094");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.540302305895424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5707963268273212d + "'", double1 == 0.5707963268273212d);
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14095");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3), 2.52318064E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.52318064E8f + "'", float2 == 2.52318064E8f);
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14096");
        double double2 = org.apache.commons.math.util.FastMath.min(0.999986049880067d, 1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.52587890625E-5d + "'", double2 == 1.52587890625E-5d);
    }

    @Test
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14097");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4709296116188755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14098");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.3702770400092708d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14099");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.271806125530277E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.271806125530277E-25d + "'", double1 == 8.271806125530277E-25d);
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14100");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0787810324803502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7927466237637623d + "'", double1 == 0.7927466237637623d);
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14101");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5091359286868075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5582248395712464d + "'", double1 == 0.5582248395712464d);
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14102");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14103");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.570796326794171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.301298902305474d + "'", double1 == 2.301298902305474d);
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14104");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089406E-8d + "'", double1 == 4.214684851089406E-8d);
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14105");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6750559827141311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8297557458819592d + "'", double1 == 0.8297557458819592d);
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14106");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2879824694293398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02247953479950919d + "'", double1 == 0.02247953479950919d);
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14107");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8346187642153643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7410405809129375d + "'", double1 == 0.7410405809129375d);
    }

    @Test
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14108");
        double double2 = org.apache.commons.math.util.FastMath.min(56.98500007761487d, 1.5707963267936307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267936307d + "'", double2 == 1.5707963267936307d);
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14109");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5255815002652741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5799969352562168d + "'", double1 == 0.5799969352562168d);
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14110");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 252318064L, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14111");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1529684096980417d, 1.4917863811300065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4917863811300065d + "'", double2 == 1.4917863811300065d);
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14112");
        long long1 = org.apache.commons.math.util.FastMath.abs((-16L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16L + "'", long1 == 16L);
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14113");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5707963276736048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334031179831089d + "'", double1 == 1.2334031179831089d);
    }

    @Test
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14114");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5679500669490418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.83692132343496d + "'", double1 == 89.83692132343496d);
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14115");
        double double2 = org.apache.commons.math.util.FastMath.min(0.003749170920418732d, 3.0605566643729682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003749170920418732d + "'", double2 == 0.003749170920418732d);
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14116");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.137917206686937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4194860925918155d + "'", double1 == 0.4194860925918155d);
    }

    @Test
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14117");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.0170021864894023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3047063690009496d + "'", double1 == 0.3047063690009496d);
    }

    @Test
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14118");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3260037006675865d, 0.9189765263380592d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3408970477976788d + "'", double2 == 0.3408970477976788d);
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14119");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 208, 6061.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 208.0f + "'", float2 == 208.0f);
    }

    @Test
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14120");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9033343321773988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033343321773988d + "'", double1 == 0.9033343321773988d);
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14121");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0019033590633418204d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14122");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7476026429360669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7333208961805466d + "'", double1 == 0.7333208961805466d);
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14123");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14124");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.015761893714802175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015762546428145154d + "'", double1 == 0.015762546428145154d);
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14125");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.917031690363043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 109.83782505063242d + "'", double1 == 109.83782505063242d);
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14126");
        double double1 = org.apache.commons.math.util.FastMath.sin(13.897423420904053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9713989088133473d + "'", double1 == 0.9713989088133473d);
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14127");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8169805481334204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08778828366206028d) + "'", double1 == (-0.08778828366206028d));
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14128");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5484329805341774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7305391035828035d + "'", double1 == 1.7305391035828035d);
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14129");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14130");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3339809623743415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.69381002474938d + "'", double1 == 0.69381002474938d);
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14131");
        double double1 = org.apache.commons.math.util.FastMath.rint(49.23318428806336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.0d + "'", double1 == 49.0d);
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14132");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.42013128983820774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5221613868226456d + "'", double1 == 1.5221613868226456d);
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14133");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.89324023572096E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9974270370499775d) + "'", double1 == (-0.9974270370499775d));
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14134");
        long long2 = org.apache.commons.math.util.FastMath.min(18L, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14135");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.6571830786712632E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.657183086256344E-4d) + "'", double1 == (-1.657183086256344E-4d));
    }

    @Test
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14136");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1924443884703437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108524088490849d + "'", double1 == 0.6108524088490849d);
    }

    @Test
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14137");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5950899460174346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9287723756281627d + "'", double1 == 3.9287723756281627d);
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14138");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.730093305612845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3153301127902626d + "'", double1 == 1.3153301127902626d);
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14139");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.809784758817255d, 2105.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14140");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6454899392731472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9069210759660673d + "'", double1 == 1.9069210759660673d);
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14141");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14142");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.01747865728166002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14143");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.307369098441672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9531328523472556d + "'", double1 == 0.9531328523472556d);
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14144");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.435961927627987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7582565805871897d + "'", double1 == 0.7582565805871897d);
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14145");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3108282473449602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0850359259571933d + "'", double1 == 1.0850359259571933d);
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14146");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.4825777280150008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 142.24122612843632d + "'", double1 == 142.24122612843632d);
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14147");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7432715394217122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7328488948999224d + "'", double1 == 0.7328488948999224d);
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14148");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-4.22719058232548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9854066682247961d) + "'", double1 == (-0.9854066682247961d));
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14149");
        double double1 = org.apache.commons.math.util.FastMath.acos((-95.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14150");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1873864715321998d + "'", double1 == 1.1873864715321998d);
    }

    @Test
    public void test14151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14151");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 3.6886551128071145E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test14152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14152");
        double double2 = org.apache.commons.math.util.FastMath.max(0.707392452065701d, 1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5395564933646284d + "'", double2 == 1.5395564933646284d);
    }

    @Test
    public void test14153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14153");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.6750163915861345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.162178621572726d + "'", double1 == 2.162178621572726d);
    }

    @Test
    public void test14154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14154");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.435597088531952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.646952089737185d + "'", double1 == 0.646952089737185d);
    }

    @Test
    public void test14155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14155");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2.4751129460689736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7860028569316315d) + "'", double1 == (-0.7860028569316315d));
    }

    @Test
    public void test14156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14156");
        int int2 = org.apache.commons.math.util.FastMath.max(9, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test14157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14157");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1593781051128063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7698202659411677d + "'", double1 == 0.7698202659411677d);
    }

    @Test
    public void test14158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14158");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.764651313204946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.64084337392879d + "'", double1 == 58.64084337392879d);
    }

    @Test
    public void test14159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14159");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4436060621143874d, 0.4800229187927331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4436060621143871d + "'", double2 == 1.4436060621143871d);
    }

    @Test
    public void test14160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14160");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, 252318064L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318064L + "'", long2 == 252318064L);
    }

    @Test
    public void test14161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14161");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.486449227395259E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14162");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1204413228389418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test14163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14163");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.26054715583337607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2635888896600073d + "'", double1 == 0.2635888896600073d);
    }

    @Test
    public void test14164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14164");
        long long2 = org.apache.commons.math.util.FastMath.min(2979L, 16L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
    }

    @Test
    public void test14165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14165");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7272462299567566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0693741735691493d + "'", double1 == 1.0693741735691493d);
    }

    @Test
    public void test14166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14166");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6744030727096091d), 0.7143859385096635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.674403072709609d) + "'", double2 == (-0.674403072709609d));
    }

    @Test
    public void test14167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14167");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4920925950926543E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.031200676838466d + "'", double1 == 28.031200676838466d);
    }

    @Test
    public void test14168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14168");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 208, (long) 145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 208L + "'", long2 == 208L);
    }

    @Test
    public void test14169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14169");
        double double2 = org.apache.commons.math.util.FastMath.max(59.80159175223299d, 0.16712951261998335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.80159175223299d + "'", double2 == 59.80159175223299d);
    }

    @Test
    public void test14170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14170");
        float float2 = org.apache.commons.math.util.FastMath.min(14.0f, (float) 97864804714L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test14171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14171");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0790099456648899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0822150853653685d + "'", double1 == 1.0822150853653685d);
    }

    @Test
    public void test14172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14172");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.17474078431209433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3951538309617622d + "'", double1 == 1.3951538309617622d);
    }

    @Test
    public void test14173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14173");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9374233164976175d), 2.413486398183208d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9374233164976173d) + "'", double2 == (-0.9374233164976173d));
    }

    @Test
    public void test14174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14174");
        double double2 = org.apache.commons.math.util.FastMath.min(5.824846225420071E-4d, 0.03676655317564819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.824846225420071E-4d + "'", double2 == 5.824846225420071E-4d);
    }

    @Test
    public void test14175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14175");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.652233674034091d, 0.621581484926361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4612655066248226d + "'", double2 == 1.4612655066248226d);
    }

    @Test
    public void test14176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14176");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.02296455508820045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02296455508820045d + "'", double1 == 0.02296455508820045d);
    }

    @Test
    public void test14177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14177");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9835107230884862d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.523911322425041d + "'", double1 == 1.523911322425041d);
    }

    @Test
    public void test14178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14178");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.003749170920418732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000070281495277d + "'", double1 == 1.0000070281495277d);
    }

    @Test
    public void test14179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14179");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.8193414259330926E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.8193414259330926E-20d) + "'", double1 == (-4.8193414259330926E-20d));
    }

    @Test
    public void test14180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14180");
        long long2 = org.apache.commons.math.util.FastMath.min(8L, (long) 2105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test14181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14181");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0159090561693984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.613293896316621d + "'", double1 == 1.613293896316621d);
    }

    @Test
    public void test14182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14182");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1644937984762475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15228648484610957d + "'", double1 == 0.15228648484610957d);
    }

    @Test
    public void test14183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14183");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test14184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14184");
        double double1 = org.apache.commons.math.util.FastMath.floor(172.58048571980692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 172.0d + "'", double1 == 172.0d);
    }

    @Test
    public void test14185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14185");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7669718843028057d), 0.015840105828908848d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test14186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14186");
        double double1 = org.apache.commons.math.util.FastMath.atan(51.75724472303371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.551477763761591d + "'", double1 == 1.551477763761591d);
    }

    @Test
    public void test14187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14187");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.357490349840526E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.35749022368013E-4d + "'", double1 == 3.35749022368013E-4d);
    }

    @Test
    public void test14188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14188");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3582230891800424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14189");
        float float2 = org.apache.commons.math.util.FastMath.max(26.0f, 2105.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2105.0f + "'", float2 == 2105.0f);
    }

    @Test
    public void test14190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14190");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7639529884526898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test14191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14191");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2110908904786682E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110908905082742E-5d + "'", double1 == 1.2110908905082742E-5d);
    }

    @Test
    public void test14192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14192");
        int int1 = org.apache.commons.math.util.FastMath.abs((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test14193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14193");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7108807856057305d, 1.4464331883887016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.610427285549859d + "'", double2 == 0.610427285549859d);
    }

    @Test
    public void test14194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14194");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.958144629610086d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14195");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999999999675755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test14196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14196");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.4624424875899187d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test14197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14197");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.653878486731224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 94.76025711718245d + "'", double1 == 94.76025711718245d);
    }

    @Test
    public void test14198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14198");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.985031234232907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test14199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14199");
        float float2 = org.apache.commons.math.util.FastMath.min(9.0f, 208.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test14200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14200");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7334337635678283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.31843871791476d + "'", double1 == 99.31843871791476d);
    }

    @Test
    public void test14201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14201");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 23, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test14202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14202");
        double double1 = org.apache.commons.math.util.FastMath.ceil(316.1598618344127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 317.0d + "'", double1 == 317.0d);
    }

    @Test
    public void test14203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14203");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8681090589666719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.738985235863815d + "'", double1 == 49.738985235863815d);
    }

    @Test
    public void test14204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14204");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9986793944976201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8407567250550904d + "'", double1 == 0.8407567250550904d);
    }

    @Test
    public void test14205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14205");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8089086830966222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14206");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(16.11830415560668d, 1.160875346119392d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.118304155606676d + "'", double2 == 16.118304155606676d);
    }

    @Test
    public void test14207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14207");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8813735870195252d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14208");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 14, (float) 252318064L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test14209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14209");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4194860925918155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.521179609241457d + "'", double1 == 1.521179609241457d);
    }

    @Test
    public void test14210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14210");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.7369561671112403d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test14211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14211");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6603469013500041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.583614610523352d + "'", double1 == 0.583614610523352d);
    }

    @Test
    public void test14212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14212");
        float float2 = org.apache.commons.math.util.FastMath.min(31.0f, (-16.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.0f) + "'", float2 == (-16.0f));
    }

    @Test
    public void test14213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14213");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.746606636224771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4004431651831872d + "'", double1 == 1.4004431651831872d);
    }

    @Test
    public void test14214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14214");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.01745329837617443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745329837617443d + "'", double1 == 0.01745329837617443d);
    }

    @Test
    public void test14215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14215");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.18006177305525128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18006177305525128d + "'", double1 == 0.18006177305525128d);
    }

    @Test
    public void test14216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14216");
        long long2 = org.apache.commons.math.util.FastMath.min(145L, (long) 208);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test14217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14217");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, 2979L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test14218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14218");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.025684489383558138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02536018423537305d + "'", double1 == 0.02536018423537305d);
    }

    @Test
    public void test14219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14219");
        float float2 = org.apache.commons.math.util.FastMath.max(2105.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test14220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14220");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.7641600446179835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.363899346513529d + "'", double1 == 1.363899346513529d);
    }

    @Test
    public void test14221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14221");
        double double1 = org.apache.commons.math.util.FastMath.log(0.017614857748268292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.039012542823684d) + "'", double1 == (-4.039012542823684d));
    }

    @Test
    public void test14222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14222");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test14223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14223");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 24L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test14224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14224");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6552377416047082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6093477665995098d + "'", double1 == 0.6093477665995098d);
    }

    @Test
    public void test14225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14225");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7651652504341014d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test14226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14226");
        double double2 = org.apache.commons.math.util.FastMath.pow((-2.9580097917192205d), (-4.716136598735705d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test14227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14227");
        double double1 = org.apache.commons.math.util.FastMath.exp(27.309421616676456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.24988490626E11d + "'", double1 == 7.24988490626E11d);
    }

    @Test
    public void test14228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14228");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7289664090565792d), 0.5043106036526678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7289664090565791d) + "'", double2 == (-0.7289664090565791d));
    }

    @Test
    public void test14229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14229");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6870151974084779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2454244846495857d + "'", double1 == 1.2454244846495857d);
    }

    @Test
    public void test14230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14230");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.08489862787744332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test14231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14231");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.924115048159362E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.924115048159362E7d + "'", double1 == 8.924115048159362E7d);
    }

    @Test
    public void test14232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14232");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8450980400142568d, 0.621581484926361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9006722936488748d + "'", double2 == 0.9006722936488748d);
    }

    @Test
    public void test14233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14233");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.0021487544300628886d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test14234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14234");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 46L, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46.0f + "'", float2 == 46.0f);
    }

    @Test
    public void test14235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14235");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5422326689561365d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5422326689561363d) + "'", double2 == (-1.5422326689561363d));
    }

    @Test
    public void test14236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14236");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.562011695244624d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test14237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14237");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(30.566416618160495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.528690316717015d + "'", double1 == 5.528690316717015d);
    }

    @Test
    public void test14238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14238");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.41078129050290885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4107812905029089d + "'", double1 == 0.4107812905029089d);
    }

    @Test
    public void test14239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14239");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8592811670678461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3924644804443618d + "'", double1 == 1.3924644804443618d);
    }

    @Test
    public void test14240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14240");
        int int2 = org.apache.commons.math.util.FastMath.max(23, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test14241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14241");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.1577059034868376E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1577059034868376E-10d + "'", double1 == 4.1577059034868376E-10d);
    }

    @Test
    public void test14242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14242");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.815532388198284d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14243");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2114236989366154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7936365157806045d + "'", double1 == 0.7936365157806045d);
    }

    @Test
    public void test14244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14244");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.004855201767862872d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14245");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7669190063698558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6939200598898221d + "'", double1 == 0.6939200598898221d);
    }

    @Test
    public void test14246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14246");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test14247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14247");
        double double1 = org.apache.commons.math.util.FastMath.log(4.204224718596143E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-26.194931210822894d) + "'", double1 == (-26.194931210822894d));
    }

    @Test
    public void test14248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14248");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.000000019030306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806571796825d + "'", double1 == 1.5430806571796825d);
    }

    @Test
    public void test14249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14249");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6514471021142878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9183148188367501d + "'", double1 == 0.9183148188367501d);
    }

    @Test
    public void test14250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14250");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.936739795201818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.414981359230927d + "'", double1 == 1.414981359230927d);
    }

    @Test
    public void test14251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14251");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14252");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.092187372480475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7409156398579155d) + "'", double1 == (-1.7409156398579155d));
    }

    @Test
    public void test14253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14253");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0031091414242400395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003109131405856418d + "'", double1 == 0.003109131405856418d);
    }

    @Test
    public void test14254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14254");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(20.58762794265912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1179.5841912999697d + "'", double1 == 1179.5841912999697d);
    }

    @Test
    public void test14255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14255");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9900259135585372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6913042127149054d + "'", double1 == 1.6913042127149054d);
    }

    @Test
    public void test14256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14256");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.027181892591221314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027175200074137335d + "'", double1 == 0.027175200074137335d);
    }

    @Test
    public void test14257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14257");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.46549581933118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4841947448697316d + "'", double1 == 0.4841947448697316d);
    }

    @Test
    public void test14258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14258");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-59.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14259");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2594052227297022d, 1.8674578744516237d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2594052227297022d + "'", double2 == 0.2594052227297022d);
    }

    @Test
    public void test14260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14260");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.014116713057245904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0142168243772451d + "'", double1 == 1.0142168243772451d);
    }

    @Test
    public void test14261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14261");
        double double1 = org.apache.commons.math.util.FastMath.acosh(25.535789562407242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.93284454973179d + "'", double1 == 3.93284454973179d);
    }

    @Test
    public void test14262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14262");
        long long2 = org.apache.commons.math.util.FastMath.min(5768L, (long) 6061);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5768L + "'", long2 == 5768L);
    }

    @Test
    public void test14263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14263");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7493995704460316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6811993095578336d + "'", double1 == 0.6811993095578336d);
    }

    @Test
    public void test14264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14264");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 145L, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test14265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14265");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 26, (long) 208);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test14266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14266");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4023976994865663d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test14267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14267");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0232274785475506d, (-6.053272382792571d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.053272382792571d) + "'", double2 == (-6.053272382792571d));
    }

    @Test
    public void test14268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14268");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9711317411865499d, 1.1752011915234506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9711317411865499d + "'", double2 == 0.9711317411865499d);
    }

    @Test
    public void test14269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14269");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.40770160394586774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6651773355037965d + "'", double1 == 0.6651773355037965d);
    }

    @Test
    public void test14270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14270");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5287865643035825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14271");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.08223517580477673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0849423747935631d) + "'", double1 == (-1.0849423747935631d));
    }

    @Test
    public void test14272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14272");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 21L, (-5.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test14273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14273");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test14274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14274");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.746606636224771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.589640703828126d + "'", double1 == 14.589640703828126d);
    }

    @Test
    public void test14275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14275");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.24769860755486173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8211004407053897d + "'", double1 == 1.8211004407053897d);
    }

    @Test
    public void test14276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14276");
        double double2 = org.apache.commons.math.util.FastMath.max(1.747294814731883d, 1.558213385991504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.747294814731883d + "'", double2 == 1.747294814731883d);
    }

    @Test
    public void test14277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14277");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9016588263401231d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7843569744012618d) + "'", double1 == (-0.7843569744012618d));
    }

    @Test
    public void test14278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14278");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test14279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14279");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999999675754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999891918d + "'", double1 == 0.9999999999891918d);
    }

    @Test
    public void test14280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14280");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9330920755982086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4678469024554632d + "'", double1 == 1.4678469024554632d);
    }

    @Test
    public void test14281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14281");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8662233981639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42053675389704875d + "'", double1 == 0.42053675389704875d);
    }

    @Test
    public void test14282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14282");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.9702919135521215d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14283");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1268427362473763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.061528490549065d + "'", double1 == 1.061528490549065d);
    }

    @Test
    public void test14284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14284");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4860487273861172d, 0.0808917956833961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0808917956833961d + "'", double2 == 0.0808917956833961d);
    }

    @Test
    public void test14285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14285");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16597934716902493d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14286");
        double double1 = org.apache.commons.math.util.FastMath.log(1.455745113549518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37551787507448225d + "'", double1 == 0.37551787507448225d);
    }

    @Test
    public void test14287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14287");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2800017211707247E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.058104254113516d + "'", double1 == 17.058104254113516d);
    }

    @Test
    public void test14288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14288");
        long long1 = org.apache.commons.math.util.FastMath.round(0.566616563906514d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test14289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14289");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0027856622314566606d, 1.0000000000000047d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002785662231456661d + "'", double2 == 0.002785662231456661d);
    }

    @Test
    public void test14290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14290");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test14291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14291");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.019233306345811094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01923449234092845d + "'", double1 == 0.01923449234092845d);
    }

    @Test
    public void test14292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14292");
        int int2 = org.apache.commons.math.util.FastMath.max(252318064, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252318064 + "'", int2 == 252318064);
    }

    @Test
    public void test14293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14293");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.014568980531170799d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01456794988182905d) + "'", double1 == (-0.01456794988182905d));
    }

    @Test
    public void test14294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14294");
        long long1 = org.apache.commons.math.util.FastMath.round(0.14595315667793862d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14295");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.8210429626092037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45040970022201887d + "'", double1 == 0.45040970022201887d);
    }

    @Test
    public void test14296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14296");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.03700049997605E9d + "'", double1 == 3.03700049997605E9d);
    }

    @Test
    public void test14297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14297");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0098122968053733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0032601256326565d + "'", double1 == 1.0032601256326565d);
    }

    @Test
    public void test14298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14298");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) 23);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test14299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14299");
        float float2 = org.apache.commons.math.util.FastMath.max(23.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test14300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14300");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 31, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test14301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14301");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2492450961977028d, (-0.7249453328133405d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7249453328133405d) + "'", double2 == (-0.7249453328133405d));
    }

    @Test
    public void test14302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14302");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.52318064E8d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5231806399999997E8d + "'", double2 == 2.5231806399999997E8d);
    }

    @Test
    public void test14303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14303");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7L, (float) 16384L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test14304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14304");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4467246575506081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46310103441377193d + "'", double1 == 0.46310103441377193d);
    }

    @Test
    public void test14305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14305");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 573.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test14306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14306");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.239487368601187E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.239487368601187E31d + "'", double1 == 1.239487368601187E31d);
    }

    @Test
    public void test14307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14307");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.647369156657704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9284957243478044d + "'", double1 == 0.9284957243478044d);
    }

    @Test
    public void test14308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14308");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3339809623743415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14309");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1237250362220599d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14310");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test14311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14311");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test14312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14312");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5269814632356071d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.604257704031056d + "'", double1 == 3.604257704031056d);
    }

    @Test
    public void test14313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14313");
        double double1 = org.apache.commons.math.util.FastMath.atan(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5083775167989393d + "'", double1 == 1.5083775167989393d);
    }

    @Test
    public void test14314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14314");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.43708364069671046d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45113407939536315d) + "'", double1 == (-0.45113407939536315d));
    }

    @Test
    public void test14315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14315");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.42951314447129507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3670235408339034d) + "'", double1 == (-0.3670235408339034d));
    }

    @Test
    public void test14316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14316");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3800005942718698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14317");
        double double1 = org.apache.commons.math.util.FastMath.log(76.93224517135305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.342925101645957d + "'", double1 == 4.342925101645957d);
    }

    @Test
    public void test14318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14318");
        double double1 = org.apache.commons.math.util.FastMath.log((-31.55620531888934d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14319");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999999999974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557639d + "'", double1 == 0.7615941559557639d);
    }

    @Test
    public void test14320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14320");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.451779620382493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2707079954049383d + "'", double1 == 3.2707079954049383d);
    }

    @Test
    public void test14321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14321");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.668456226237483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.2997205526499d + "'", double1 == 38.2997205526499d);
    }

    @Test
    public void test14322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14322");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test14323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14323");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.7674983998669958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test14324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14324");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.09713542637401774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1020096046807666d + "'", double1 == 1.1020096046807666d);
    }

    @Test
    public void test14325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14325");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.16305427565736225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test14326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14326");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-7), 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test14327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14327");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.942524682253154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.371165474921258d + "'", double1 == 1.371165474921258d);
    }

    @Test
    public void test14328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14328");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9264927456996489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1849831909065396d + "'", double1 == 1.1849831909065396d);
    }

    @Test
    public void test14329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14329");
        double double1 = org.apache.commons.math.util.FastMath.atanh(28.644920215519164d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test14330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14330");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2425230239169618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021686117799187235d + "'", double1 == 0.021686117799187235d);
    }

    @Test
    public void test14331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14331");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7545371877198279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14332");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.570796326794884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038848218538836d + "'", double1 == 1.0038848218538836d);
    }

    @Test
    public void test14333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14333");
        int int2 = org.apache.commons.math.util.FastMath.min((-5), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test14334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14334");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.10016708343765153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10016708343765154d + "'", double1 == 0.10016708343765154d);
    }

    @Test
    public void test14335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14335");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2405171239L, (float) 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test14336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14336");
        double double1 = org.apache.commons.math.util.FastMath.log(7.370663976112529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.997507793881699d + "'", double1 == 1.997507793881699d);
    }

    @Test
    public void test14337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14337");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0997501702946166d, 8.271806125530277E-25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0997501702946166d + "'", double2 == 1.0997501702946166d);
    }

    @Test
    public void test14338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14338");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14339");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9997652466206903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5428047948800638d + "'", double1 == 1.5428047948800638d);
    }

    @Test
    public void test14340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14340");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0034800801422487353d, 1.560499174232234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002230103309556486d + "'", double2 == 0.002230103309556486d);
    }

    @Test
    public void test14341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14341");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.14595315667793862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1464718991281492d + "'", double1 == 0.1464718991281492d);
    }

    @Test
    public void test14342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14342");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test14343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14343");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.596393425240077d + "'", double1 == 13.596393425240077d);
    }

    @Test
    public void test14344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14344");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1500222153141935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8550623022798706d + "'", double1 == 0.8550623022798706d);
    }

    @Test
    public void test14345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14345");
        double double2 = org.apache.commons.math.util.FastMath.min((-3.355079784480865d), 0.0269315515711845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.355079784480865d) + "'", double2 == (-3.355079784480865d));
    }

    @Test
    public void test14346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14346");
        double double1 = org.apache.commons.math.util.FastMath.rint(1261966.2318521831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.0d + "'", double1 == 1261966.0d);
    }

    @Test
    public void test14347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14347");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test14348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14348");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999938558065222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999979519313128d + "'", double1 == 0.9999979519313128d);
    }

    @Test
    public void test14349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14349");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.442647102379884E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.442647102379884E-6d + "'", double1 == 8.442647102379884E-6d);
    }

    @Test
    public void test14350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14350");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8221356055655724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08505654268914523d) + "'", double1 == (-0.08505654268914523d));
    }

    @Test
    public void test14351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14351");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.718281828459038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7253825588523126d + "'", double1 == 1.7253825588523126d);
    }

    @Test
    public void test14352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14352");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 44, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test14353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14353");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test14354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14354");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1261966.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.741328560917557d + "'", double1 == 14.741328560917557d);
    }

    @Test
    public void test14355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14355");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0000000000000284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284591226d + "'", double1 == 1.7182818284591226d);
    }

    @Test
    public void test14356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14356");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 44, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }
}

