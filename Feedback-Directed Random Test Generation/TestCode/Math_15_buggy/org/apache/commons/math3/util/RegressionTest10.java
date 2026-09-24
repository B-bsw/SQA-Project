package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.41032129904824216d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.7456418720467646d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        int int1 = org.apache.commons.math3.util.FastMath.abs(53248);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53248 + "'", int1 == 53248);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-149));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        long long2 = org.apache.commons.math3.util.FastMath.max((-6L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.016451973321653327d, 90.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016451973321653327d + "'", double2 == 0.016451973321653327d);
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 5.40432E16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 378077.081374287d + "'", double1 == 378077.081374287d);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5060119336077026E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8163415799735064d) + "'", double1 == (-0.8163415799735064d));
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 2L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0000000000000284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308395d + "'", double1 == 57.29577951308395d);
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.8414710492169446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17260366972569707d) + "'", double1 == (-0.17260366972569707d));
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        int int2 = org.apache.commons.math3.util.FastMath.max(144, 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 144 + "'", int2 == 144);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        double double2 = org.apache.commons.math3.util.FastMath.min(101.04822696504083d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.176091259055682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.95294447899659d + "'", double1 == 23.95294447899659d);
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 4096, (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5707509259090962d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-7.6770288745698245d), 3.120310440054329E-41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.6770288745698245d + "'", double2 == 7.6770288745698245d);
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3036.676314193363d, (-0.04399474110473024d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01669581953729926d) + "'", double2 == (-0.01669581953729926d));
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        long long2 = org.apache.commons.math3.util.FastMath.min(22026L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        long long1 = org.apache.commons.math3.util.FastMath.round(22026.001953125d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22026L + "'", long1 == 22026L);
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.094948E-13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-40) + "'", int1 == (-40));
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.76034803810641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8144606961796d + "'", double1 == 4.8144606961796d);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        long long2 = org.apache.commons.math3.util.FastMath.max((-127L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 1024.9999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-127L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.16125382097679095d), 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.658062037120332E-60d) + "'", double2 == (-3.658062037120332E-60d));
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.002415168146714362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04914436027373194d + "'", double1 == 0.04914436027373194d);
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1500.0002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-41), 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-41.0f) + "'", float2 == (-41.0f));
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.017612750376510982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0177687694936988d + "'", double1 == 1.0177687694936988d);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.9999951358629069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745320762473575d) + "'", double1 == (-0.01745320762473575d));
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.6536436208636119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533141373155003d + "'", double1 == 1.2533141373155003d);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        int int2 = org.apache.commons.math3.util.FastMath.min(58, 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 76);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        int int2 = org.apache.commons.math3.util.FastMath.max((-458), (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.308769561254787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1.23794004E27f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(96.99999237060545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99999237060547d + "'", double1 == 96.99999237060547d);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9172426875149238d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.668970750059695d + "'", double2 == 3.668970750059695d);
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.23422432986760747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.4200655606939d) + "'", double1 == (-13.4200655606939d));
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 6400L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.457200456011224d + "'", double1 == 9.457200456011224d);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.4626599322445797E-282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4626599322445797E-282d + "'", double1 == 1.4626599322445797E-282d);
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.2835960924048626d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.9155040003582885E22d, (double) (-2147483648));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.9843746f), 0.5403024061792941d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9843745f) + "'", float2 == (-1.9843745f));
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.02655421183195658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026557332620245466d + "'", double1 == 0.026557332620245466d);
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        double double1 = org.apache.commons.math3.util.FastMath.tan(9.194508866842774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23442722673729072d) + "'", double1 == (-0.23442722673729072d));
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1024.0d, 1.3560551570236352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0008978929602d + "'", double2 == 1024.0008978929602d);
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(149.0f, (float) 76);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 3.051759E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0517589048410336E-5d + "'", double1 == 3.0517589048410336E-5d);
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.25d), 3.371747880871523E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25d + "'", double2 == 0.25d);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.37684487542793E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6916437678655323d + "'", double1 == 0.6916437678655323d);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4288992721907328d + "'", double1 == 1.4288992721907328d);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6649237511146353d + "'", double1 == 1.6649237511146353d);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.048113204656145E-141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.048113204656145E-141d + "'", double1 == 1.048113204656145E-141d);
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.4750429751260321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8892730666245672d + "'", double1 == 0.8892730666245672d);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(7.334875669653525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1531.8371899144815d + "'", double1 == 1531.8371899144815d);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7798115718222205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7798115718222205d + "'", double1 == 0.7798115718222205d);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6717532003326169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011724305106613233d + "'", double1 == 0.011724305106613233d);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.3554640413010734E-8d, 0.04690504152837204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3554640413010734E-8d + "'", double2 == 5.3554640413010734E-8d);
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6400.0d + "'", double1 == 6400.0d);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-44.55243935826922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7775867565969075d) + "'", double1 == (-0.7775867565969075d));
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        long long2 = org.apache.commons.math3.util.FastMath.min(32L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        long long1 = org.apache.commons.math3.util.FastMath.abs(4294967296L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967296L + "'", long1 == 4294967296L);
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.14748365E9f, 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9171523356089556d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.1977461928657025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0619928668337089d + "'", double1 == 1.0619928668337089d);
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0817453575253018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.4290008686463924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(101.00000000000003d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-148.99998f), 2.2329477897752064E19d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-148.99997f) + "'", float2 == (-148.99997f));
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0000000037838663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.643312264866606E-9d + "'", double1 == 1.643312264866606E-9d);
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        double double1 = org.apache.commons.math3.util.FastMath.abs(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.008837862703320917d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 10, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.1612272431311002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16053679331693801d) + "'", double1 == (-0.16053679331693801d));
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(85943.66926962348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.054594532724904d + "'", double1 == 12.054594532724904d);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        long long2 = org.apache.commons.math3.util.FastMath.max(18L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5135741754193315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41447385747550813d + "'", double1 == 0.41447385747550813d);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-2.0f), 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.0f) + "'", float2 == (-16.0f));
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0165168535073021E8d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 101651685L + "'", long1 == 101651685L);
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6795276293349446d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.009624211171012755d, (double) 149.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 149.0d + "'", double2 == 149.0d);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        double double1 = org.apache.commons.math3.util.FastMath.atan(10.052274715955628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4716425806946505d + "'", double1 == 1.4716425806946505d);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        int int2 = org.apache.commons.math3.util.FastMath.min((-63), 138);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        float float1 = org.apache.commons.math3.util.FastMath.signum(32.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5707963264277232d, 2.2367438401448574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7826660686916311d + "'", double2 == 1.7826660686916311d);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 18);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 18.000002f + "'", float1 == 18.000002f);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-2147483648));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483648L + "'", long1 == 2147483648L);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1025.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.666666666666754E-4d, 1.0001761935342757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.666666666666755E-4d + "'", double2 == 6.666666666666755E-4d);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.382026634673881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.945924865824463d) + "'", double1 == (-0.945924865824463d));
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.081221371125345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01887087286906482d + "'", double1 == 0.01887087286906482d);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 126.99999f, 164140.86262767154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.478946455040302d + "'", double2 == 2.478946455040302d);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030765742067207565d + "'", double1 == 0.030765742067207565d);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-149));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-149.0d) + "'", double1 == (-149.0d));
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 9.2233709E18f, (double) 18.000002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223370937343148E18d + "'", double2 == 9.223370937343148E18d);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-54));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54 + "'", int1 == 54);
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        float float1 = org.apache.commons.math3.util.FastMath.signum(97.000015f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-4));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.09746678486527317d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-61944147371L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 61944147371L + "'", long1 == 61944147371L);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.153770189511292E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.950423060997261E-65d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.2102032422537643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3541662915943533d + "'", double1 == 2.3541662915943533d);
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        int int2 = org.apache.commons.math3.util.FastMath.min(99, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9171523356672728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.502154937700731d + "'", double1 == 2.502154937700731d);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.40432E16f, (double) 22026);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4043196E16f + "'", float2 == 5.4043196E16f);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.4273537190268928E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 4294967296L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1071487177940904d + "'", double1 == 1.1071487177940904d);
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.6880966331881486E43d, 117341.7564427926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6880966331881486E43d + "'", double2 == 2.6880966331881486E43d);
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5563207343123242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.247525845148037d + "'", double1 == 1.247525845148037d);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4096.0005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-5.9325167282148206E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3990817041746885E-13d) + "'", double1 == (-3.3990817041746885E-13d));
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5095486063796122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9709157047357585d + "'", double1 == 0.9709157047357585d);
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.159127075050616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0393938008757937d + "'", double1 == 2.0393938008757937d);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-106L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 106L + "'", long1 == 106L);
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.9843749f, (float) (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9843749f) + "'", float2 == (-1.9843749f));
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-5.4470154E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4673530127728553d + "'", double1 == 0.4673530127728553d);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.3554640413010734E-8d, 750.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3554640413010734E-8d + "'", double2 == 5.3554640413010734E-8d);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-7.6770288745698245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17603073842084696d + "'", double1 == 0.17603073842084696d);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.951243865300542d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.42073952573286544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6486443753959988d + "'", double1 == 0.6486443753959988d);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(12.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.000003f + "'", float1 == 12.000003f);
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(35.000007629394524d, (-1.4942208E7d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.000007629394524d + "'", double2 == 35.000007629394524d);
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        float float2 = org.apache.commons.math3.util.FastMath.max(18.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.2684529660545276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(171.8873521996253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1500.0004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1760913650845946d + "'", double1 == 3.1760913650845946d);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1024L, 5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0001f + "'", float2 == 1024.0001f);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.8190930489946614E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06556969098097142d + "'", double1 == 0.06556969098097142d);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.027298433348069678d), 1.0001761935342757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.027298433348069674d) + "'", double2 == (-0.027298433348069674d));
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 99);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 99L + "'", long1 == 99L);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.124197661557911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07198082819723632d + "'", double1 == 0.07198082819723632d);
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 5L, (-0.8508150333851735d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.739344907779113d + "'", double2 == 1.739344907779113d);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.09E-43f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 6400, 5.877472E-39f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.877472E-39f + "'", float2 == 5.877472E-39f);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(12.03500342028484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1826881112499317d + "'", double1 == 3.1826881112499317d);
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 5L, (double) (-58));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.999999999999999d + "'", double2 == 4.999999999999999d);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.027415567780803778d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        long long2 = org.apache.commons.math3.util.FastMath.max(2L, 63L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.3862943611198906d, 0.011724305106613233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3862943611198906d + "'", double2 == 1.3862943611198906d);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0192837000737716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0095958102497116d + "'", double1 == 1.0095958102497116d);
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.018471250572709978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001705983992748d + "'", double1 == 1.0001705983992748d);
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.2233709E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1024.0000003439764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.872171546425456d + "'", double1 == 17.872171546425456d);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1531.8371899144815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.527563848906032d + "'", double1 == 11.527563848906032d);
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 144L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.179785437699879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2661026017437569d + "'", double1 == 1.2661026017437569d);
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.9999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-61944147371L), 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.789716390178187E26d) + "'", double2 == (-2.789716390178187E26d));
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.001739546146996826d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-3.5963016834733655E18d), 1.5677741706249706d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5963016834733655E18d + "'", double2 == 3.5963016834733655E18d);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.551070328970187E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.551070328970187E21d + "'", double1 == 1.551070328970187E21d);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5265890341390445d + "'", double1 == 0.5265890341390445d);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0962012461388824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        double double1 = org.apache.commons.math3.util.FastMath.log(13.419467201178799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5967064289058284d + "'", double1 == 2.5967064289058284d);
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-7.016027794960618d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-557.1752425929883d) + "'", double1 == (-557.1752425929883d));
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.15349285356613754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.142794603177835d + "'", double1 == 0.142794603177835d);
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(12.035003420284841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.42637126919570534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37021206770136134d) + "'", double1 == (-0.37021206770136134d));
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.7187551267105248d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.0517589048410336E-5d, (-40));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.775558555041274E-17d + "'", double2 == 2.775558555041274E-17d);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.6072657569537875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6072657569537876d + "'", double1 == 0.6072657569537876d);
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.666977646080837d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3334888230404185d + "'", double2 == 0.3334888230404185d);
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 53247.996f, 2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707543717664076d + "'", double2 == 1.5707543717664076d);
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 0, 53248.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-52.000004f), (float) 58);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000004f + "'", float2 == 52.000004f);
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.371747880871523E-7d, 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.806197099592598E-64d + "'", double2 == 1.806197099592598E-64d);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(7.313224939490047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-18), 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(100.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.709498192047019E-4d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1 == (-11));
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.830189170012751E-6d + "'", double1 == 6.830189170012751E-6d);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 75);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.31748811353631d + "'", double1 == 4.31748811353631d);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        double double1 = org.apache.commons.math3.util.FastMath.log(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5649493574615367d + "'", double1 == 2.5649493574615367d);
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 149);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-19.409313714545853d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0830799868521925d, 2.01744846757651d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1746969338774258d + "'", double2 == 1.1746969338774258d);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.066281120220073d, 138);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1048656045237131E108d + "'", double2 == 1.1048656045237131E108d);
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(76.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        long long1 = org.apache.commons.math3.util.FastMath.round(384.426221044271d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 384L + "'", long1 == 384L);
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.796094483138759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(11013.21191404869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.248701292912614d + "'", double1 == 22.248701292912614d);
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.546349804879155d) + "'", double1 == (-13.546349804879155d));
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        int int2 = org.apache.commons.math3.util.FastMath.max(1024, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-6.338253E29f), (-11));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0948501E26f) + "'", float2 == (-3.0948501E26f));
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.7453293851523843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453293851523843d + "'", double1 == 1.7453293851523843d);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.5877813477142805d), 2.299249233707907E97d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.556405539239385E-98d) + "'", double2 == (-2.556405539239385E-98d));
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.384186E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-22) + "'", int1 == (-22));
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(9.5367431640625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357508E-22d + "'", double1 == 2.1175823681357508E-22d);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 76, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 76L + "'", long2 == 76L);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.35050620855721d) + "'", double1 == (-35.35050620855721d));
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        long long2 = org.apache.commons.math3.util.FastMath.max(35L, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        double double1 = org.apache.commons.math3.util.FastMath.log(28.03100307406022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3333111502681265d + "'", double1 == 3.3333111502681265d);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 5.40432E16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 99, (float) 1023L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.0f + "'", float2 == 1023.0f);
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 5447015486L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.111480858936716d + "'", double1 == 23.111480858936716d);
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9169927026825043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.037634120379412966d) + "'", double1 == (-0.037634120379412966d));
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        long long2 = org.apache.commons.math3.util.FastMath.max(2147483648L, (long) (-2147483648));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483648L + "'", long2 == 2147483648L);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.64808806136277d, 108);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1031660031673982E32d + "'", double2 == 2.1031660031673982E32d);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 187L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 187.00002f + "'", float1 == 187.00002f);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5707963267948928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1961198770301516d + "'", double1 == 0.1961198770301516d);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 9L, 9.2233709E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-5.4470149E9f), (-1.05553124655104E14d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.4470154E9f) + "'", float2 == (-5.4470154E9f));
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.03079207E11f, 1500.0003333332963d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03079199E11f + "'", float2 == 1.03079199E11f);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        double double2 = org.apache.commons.math3.util.FastMath.max(5.53754499586793E-7d, 5.308769561254787d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.308769561254787d + "'", double2 == 5.308769561254787d);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.984375f, (-17.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.984375f + "'", float2 == 1.984375f);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 9, 79L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.172561628611239d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3248.7031076979088d + "'", double2 == 3248.7031076979088d);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9999751568045011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4843504096183804E-5d) + "'", double1 == (-2.4843504096183804E-5d));
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 4096.001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 75);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.94762912722163E52d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 175 + "'", int1 == 175);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.064649704370918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6033851350158855d) + "'", double1 == (-0.6033851350158855d));
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1500.0d, (-0.37021206770136134d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06670719631768762d + "'", double2 == 0.06670719631768762d);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1500);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.7911843097149077d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5631773624134415E15d + "'", double2 == 3.5631773624134415E15d);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        int int2 = org.apache.commons.math3.util.FastMath.min(23, 175);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.6469779601696886E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9802322387695312E-8d + "'", double1 == 2.9802322387695312E-8d);
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3383347192042886E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042886E42d + "'", double1 == 1.3383347192042886E42d);
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 7.555787E22f, 0.14620091577486963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 23, 1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5258789E-5f + "'", float2 == 1.5258789E-5f);
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0036030562437497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        float float2 = org.apache.commons.math3.util.FastMath.max(7.629395E-6f, 1.1884224E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1884224E32f + "'", float2 == 1.1884224E32f);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        int int2 = org.apache.commons.math3.util.FastMath.min(79, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.676435171491823E8d, 144.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2519853959658094d + "'", double2 == 0.2519853959658094d);
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        int int1 = org.apache.commons.math3.util.FastMath.abs(138);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 138 + "'", int1 == 138);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.3554640413010734E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.2712028923680645d) + "'", double1 == (-7.2712028923680645d));
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.699208415745597d + "'", double1 == 12.699208415745597d);
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 10, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        double double2 = org.apache.commons.math3.util.FastMath.pow(50.02724142034319d, 1.6209036226920994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 567.8714856179881d + "'", double2 == 567.8714856179881d);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-5.026525594659021d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(29937.07086594976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.000000000557893d + "'", double1 == 11.000000000557893d);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 76, 6.243374546616421E-11d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 75.99999f + "'", float2 == 75.99999f);
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.128360965853085d, 1.3076604860118306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.128360965853085d + "'", double2 == 2.128360965853085d);
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(223.2377295332742d, (-32.57791748631743d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 223.23772953327418d + "'", double2 == 223.23772953327418d);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        double double1 = org.apache.commons.math3.util.FastMath.exp(8.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2980.9579870417283d + "'", double1 == 2980.9579870417283d);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0124843102732666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0041442383211276d + "'", double1 == 1.0041442383211276d);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1499.9999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.718623469602896d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.437246939205792d + "'", double2 == 9.437246939205792d);
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        int int2 = org.apache.commons.math3.util.FastMath.max((-17), (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.2699847631416846E296d, 0.5662191695169728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5662191695169728d + "'", double2 == 0.5662191695169728d);
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1531.8371899144815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570143515997163d + "'", double1 == 1.570143515997163d);
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.025822755842440984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.479534925168657d + "'", double1 == 1.479534925168657d);
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.294967296E9d, 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(328280.725258389d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 328280.725258389d + "'", double2 == 328280.725258389d);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        double double2 = org.apache.commons.math3.util.FastMath.log(1531.8371899144815d, 0.6123757901317819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06686586213046941d) + "'", double2 == (-0.06686586213046941d));
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.01318058956493249d), 6.472984194686474E-35d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01318058956493249d + "'", double2 == 0.01318058956493249d);
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-9.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-8.999999f) + "'", float1 == (-8.999999f));
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.094948E-13f, (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.8029079379718067d, 1.864427920919126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8029079379718067d + "'", double2 == 1.8029079379718067d);
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.021824986869035452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14773282258535322d + "'", double1 == 0.14773282258535322d);
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3248.7031076979088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.70056564910045d + "'", double1 == 56.70056564910045d);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.006732012348487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-52.000004f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 2.384186E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.38418607523272E-7d + "'", double1 == 2.38418607523272E-7d);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.6717532003326169d, 13.394771296627336d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05010842414258889d + "'", double2 == 0.05010842414258889d);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1023.0f), 18.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.0f) + "'", float2 == (-1023.0f));
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.395725598471343E-46d, 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.8390715290764514d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.292518830274316E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6846182206158719d + "'", double1 == 0.6846182206158719d);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-41));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-41L) + "'", long1 == (-41L));
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 79, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.09246595244807976d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09220376963371194d) + "'", double1 == (-0.09220376963371194d));
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.026541737035255974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026538621740554002d + "'", double1 == 0.026538621740554002d);
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        int int1 = org.apache.commons.math3.util.FastMath.abs(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-63));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-63L) + "'", long1 == (-63L));
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 75L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8666209983995007E32d + "'", double1 == 1.8666209983995007E32d);
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.07726425812829045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07734134029966129d + "'", double1 == 0.07734134029966129d);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.5247523005882602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5828755547221693d) + "'", double1 == (-0.5828755547221693d));
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 2.3768449E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.643312264866606E-9d, (-0.16371340869567735d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16371340869567735d) + "'", double2 == (-0.16371340869567735d));
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 458);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0517578E-5f + "'", float1 == 3.0517578E-5f);
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.1691265E29f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        int int2 = org.apache.commons.math3.util.FastMath.max(75, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        double double1 = org.apache.commons.math3.util.FastMath.floor(74.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.0d + "'", double1 == 74.0d);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.8991879649199075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.159393316255343d + "'", double1 == 17.159393316255343d);
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.3678794630987664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3854256169537897d + "'", double1 == 0.3854256169537897d);
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5877852480805601d, 3.584873353677999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.584873353677999d + "'", double2 == 3.584873353677999d);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.031250004f, (float) 99);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.031250004f + "'", float2 == 0.031250004f);
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.031139661750354587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031149732764242856d) + "'", double1 == (-0.031149732764242856d));
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 5.621322410763002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(10.067664384225559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17571389149050348d + "'", double1 == 0.17571389149050348d);
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.0017254937309181954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0017254945871452996d) + "'", double1 == (-0.0017254945871452996d));
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.53680964411134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4323992136554504d + "'", double1 == 2.4323992136554504d);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.606354165955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 76, 63L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        double double1 = org.apache.commons.math3.util.FastMath.asin(8.973830118957931E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.973831323390355E-4d + "'", double1 == 8.973831323390355E-4d);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) '4', (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        float float2 = org.apache.commons.math3.util.FastMath.min(3000.0f, (-52.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-52.0f) + "'", float2 == (-52.0f));
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.564085018163574d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-63), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.7350254851689573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 75.000015f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38776757055609445d) + "'", double1 == (-0.38776757055609445d));
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.04060401E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4901161193847656E-8d + "'", double1 == 1.4901161193847656E-8d);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        double double1 = org.apache.commons.math3.util.FastMath.rint(7.668093098623077E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.668093098623077E43d + "'", double1 == 7.668093098623077E43d);
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 10.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 4096L, (-54.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-54.0f) + "'", float2 == (-54.0f));
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.739913065842745E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707935868818308d + "'", double1 == 1.5707935868818308d);
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-54), 8886109.520507872d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.999996f) + "'", float2 == (-53.999996f));
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0000001685874083d, (-0.4404244741854283d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0926911982057677d + "'", double2 == 1.0926911982057677d);
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.188257982441615E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.188257982E9d + "'", double1 == 1.188257982E9d);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(32.000008f, 1.03079207E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000008f + "'", float2 == 32.000008f);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.1908327857428453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1602819440875591d + "'", double1 == 1.1602819440875591d);
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-17L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.0d) + "'", double1 == (-17.0d));
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-149), (-148.99998f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-148.99998f) + "'", float2 == (-148.99998f));
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 0L, 1.984375f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.984375f + "'", float2 == 1.984375f);
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0036030562437495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.001799908286954d + "'", double1 == 1.001799908286954d);
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.6525985397934726d, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6525985397934726d + "'", double2 == 0.6525985397934726d);
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-2147483648), 1.9342813E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.14748365E9f) + "'", float2 == (-2.14748365E9f));
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.447015485737373E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.1114808588885d + "'", double1 == 23.1114808588885d);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.8190930489946614E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8190931236751223E-4d + "'", double1 == 2.8190931236751223E-4d);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 52.00001f, 6.066281120220073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0000114440918d + "'", double2 == 52.0000114440918d);
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(5.177193365409636E-8d, 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.177193365409636E-8d + "'", double2 == 5.177193365409636E-8d);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 5.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        double double1 = org.apache.commons.math3.util.FastMath.log((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.3884476551279826d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37928799478267655d) + "'", double1 == (-0.37928799478267655d));
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.068434252532353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7888705944722437d + "'", double1 == 0.7888705944722437d);
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(7.0d, (-44.3614195558365d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0d + "'", double2 == 7.0d);
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.9932228461263812d, (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.023384553485362353d + "'", double2 == 0.023384553485362353d);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 1.2131030729973007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.4626599322445797E-282d, (-0.04430534570644151d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04430534570644151d) + "'", double2 == (-0.04430534570644151d));
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.6698790550935152d, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.271479494282417d + "'", double2 == 5.271479494282417d);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.7782794100389228d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.045178700342172E-38d + "'", double2 == 1.045178700342172E-38d);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8230640525110062d, 0.8851880063739007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8230640525110062d + "'", double2 == 0.8230640525110062d);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-1.2676506E30f), (-148.99999999999804d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.16125382097679095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16267372390397128d) + "'", double1 == (-0.16267372390397128d));
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.333557385554463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0979403578008362d) + "'", double1 == (-1.0979403578008362d));
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.025819886105840354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025819886105840354d + "'", double1 == 0.025819886105840354d);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.5243549E-29f, (-63));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.545160918273219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.237724259907281d + "'", double1 == 2.237724259907281d);
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7187551267105248d, 4.064649704370918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2612473073318639d + "'", double2 == 0.2612473073318639d);
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1024);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        double double1 = org.apache.commons.math3.util.FastMath.log10(32.57791748631743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.512923318980856d + "'", double1 == 1.512923318980856d);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 127L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.052547042514038377d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        double double1 = org.apache.commons.math3.util.FastMath.exp(91.45317136336227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2192449017532813E39d + "'", double1 == 5.2192449017532813E39d);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 0, (long) 127);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 4L, (float) (-149L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-149.0f) + "'", float2 == (-149.0f));
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.8052885407089897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8052885407089896d) + "'", double1 == (-0.8052885407089896d));
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.5797630630139097E-10d), (double) 97.00001f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9057397565936123d, (-41));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.92410399097922d + "'", double2 == 57.92410399097922d);
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19198621771937624d + "'", double1 == 0.19198621771937624d);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        int int2 = org.apache.commons.math3.util.FastMath.min(32, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(200.3351263076086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.33512630760862d + "'", double1 == 200.33512630760862d);
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.6685791825735485d, 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6863.108174357926d + "'", double2 == 6863.108174357926d);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(74.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.602325267042627d + "'", double1 == 8.602325267042627d);
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.606354165955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.811682183676627d + "'", double1 == 6.811682183676627d);
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 32768.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32768.0d + "'", double1 == 32768.0d);
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-10.579878738885967d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5422429081369673E-5d + "'", double1 == 2.5422429081369673E-5d);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.91590986500387E-138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.91590986500387E-138d + "'", double1 == 2.91590986500387E-138d);
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-148.99997f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.0823734317612075d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.562922473770796d), 1.0954922813103776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0954922813103776d + "'", double2 == 1.0954922813103776d);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0000000074505806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292649980457d + "'", double1 == 0.017453292649980457d);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.4696084840113481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1023.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.9843749f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.16413292293649706d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        double double1 = org.apache.commons.math3.util.FastMath.atan(5729.579526593802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706217939194553d + "'", double1 == 1.5706217939194553d);
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.831008000716578E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-95));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 95L + "'", long1 == 95L);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2147483648), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-17.839398615889458d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5927622578907794d + "'", double1 == 1.5927622578907794d);
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.337497748560931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0058904469304562005d + "'", double1 == 0.0058904469304562005d);
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.46227637316155d, (double) 2.5243549E-29f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 85.3416724552812d + "'", double2 == 85.3416724552812d);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.8991879649199075d, 1.7759236913328136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.6216704535420705d + "'", double2 == 6.6216704535420705d);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 63L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        double double1 = org.apache.commons.math3.util.FastMath.exp(567.8714856179881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.201966968334231E246d + "'", double1 == 4.201966968334231E246d);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 4.2949673E9f, 1.5707952330074615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3865479290981546d + "'", double2 == 0.3865479290981546d);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.691622542798067E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.6358572501411002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2599150451156507d + "'", double1 == 2.2599150451156507d);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9172426875149238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08638318796176292d) + "'", double1 == (-0.08638318796176292d));
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.026535507103947666d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9999983369439447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999991684716266d + "'", double1 == 0.9999991684716266d);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.3125760677670308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11812448149071139d + "'", double1 == 0.11812448149071139d);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9999975763076077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5685946486297746d + "'", double1 == 1.5685946486297746d);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 63);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.0d + "'", double1 == 63.0d);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 2.3841858E-7f, 31.911465395190167d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.22709104338717356d) + "'", double2 == (-0.22709104338717356d));
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.2612473073318639d, (double) 1.9342813E25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-43.37695978532385d) + "'", double2 == (-43.37695978532385d));
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.565804732394659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44839989783648926d + "'", double1 == 0.44839989783648926d);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.4470154E9f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4470154E9f + "'", float2 == 5.4470154E9f);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-2L), (float) 22025L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-41.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.2032471075153308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18502382530484585d + "'", double1 == 0.18502382530484585d);
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.243374546616421E-11d, 1.4153401004382837E-77d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.243374546616421E-11d + "'", double2 == 6.243374546616421E-11d);
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 3.051758E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017485286359640957d + "'", double1 == 0.0017485286359640957d);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.2374576517016327E-71d, (double) 1.1920928E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999806514771749d + "'", double2 == 0.9999806514771749d);
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0001705983992748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1754644578327482d + "'", double1 == 1.1754644578327482d);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.8390715290764514d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7440230792707037d) + "'", double1 == (-0.7440230792707037d));
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.7144175303058917d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.8029079379718067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1948514127726066d + "'", double1 == 1.1948514127726066d);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(597.258785006331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.43887855459679d + "'", double1 == 24.43887855459679d);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 458L, (-0.09709247702671989d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 458.0d + "'", double2 == 458.0d);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        double double1 = org.apache.commons.math3.util.FastMath.asin(23.95294447899659d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        double double2 = org.apache.commons.math3.util.FastMath.log((-6809493.145514925d), 20.50895781851543d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 25);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5860134523134308E15d, 4.505395525898652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.140756901953206d + "'", double2 == 1.140756901953206d);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        double double1 = org.apache.commons.math3.util.FastMath.log(1023.0008257531325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.930495573139114d + "'", double1 == 6.930495573139114d);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842023017324751E-19d + "'", double1 == 1.0842023017324751E-19d);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.5609003851579142d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 108);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        float float2 = org.apache.commons.math3.util.FastMath.max(52.00001f, (float) 1025L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1025.0f + "'", float2 == 1025.0f);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5729.579526593802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.8050876807284643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8949219476567826d) + "'", double1 == (-0.8949219476567826d));
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0000004268869143d, 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000013660471644d + "'", double2 == 1.000013660471644d);
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 76, (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 76L + "'", long2 == 76L);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(6.212020862233431E-18d, 2.0879347118439774E-43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-20) + "'", int1 == (-20));
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-148.99998f), 0.9999983369439447d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        int int2 = org.apache.commons.math3.util.FastMath.max(17, 138);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 138 + "'", int2 == 138);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (byte) 100, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 458, 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8058397E32f + "'", float2 == 5.8058397E32f);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003046174197867086d + "'", double1 == 0.003046174197867086d);
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-63));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0000000074505806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779939969144d + "'", double1 == 57.295779939969144d);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        float float1 = org.apache.commons.math3.util.FastMath.signum(258048.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9950547536867305d, (-56.83127452036154d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9950547536867305d) + "'", double2 == (-0.9950547536867305d));
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.3732912E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4551915E-11f + "'", float1 == 1.4551915E-11f);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.14933831547143916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14933831547143916d + "'", double1 == 0.14933831547143916d);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.10876056725620209d, (double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.00065713495353d + "'", double2 == 9.00065713495353d);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.414424815716438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        double double1 = org.apache.commons.math3.util.FastMath.rint(9.462941570952797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.1425465430742778d, 1.5696954877123248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5696954877123248d + "'", double2 == 1.5696954877123248d);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 0L, 1018);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.25484119874557287d, 1.9867717001074399d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25484119874557287d + "'", double2 == 0.25484119874557287d);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        double double1 = org.apache.commons.math3.util.FastMath.signum(53248.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.12520241624226192d, 62.692646897240664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12520241624226194d + "'", double2 == 0.12520241624226194d);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 5.4043196E16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.4043195528445952E16d + "'", double1 == 5.4043195528445952E16d);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0001705983992748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 25);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.15052756842981832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15168019163443253d + "'", double1 == 0.15168019163443253d);
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1023), (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.6717532003326169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5138728963108883d + "'", double1 == 0.5138728963108883d);
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.0038417538123018545d), 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.368500656742681E-13d) + "'", double2 == (-8.368500656742681E-13d));
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-63));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 63.0f + "'", float1 == 63.0f);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.9604644775390625E-8d + "'", double1 == 5.9604644775390625E-8d);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9999902065507035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999902065507035d + "'", double1 == 0.9999902065507035d);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-5.999999523162841d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.999999523162841d) + "'", double2 == (-5.999999523162841d));
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        long long2 = org.apache.commons.math3.util.FastMath.min(7L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1894250945222025d + "'", double1 == 4.1894250945222025d);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.15052756842981832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        double double1 = org.apache.commons.math3.util.FastMath.acos(11013.232874703393d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.7341433604804716d, 0.7911843097149078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0793234388618709d + "'", double2 == 1.0793234388618709d);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-4.323362308933902d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9867447596805989d) + "'", double1 == (-0.9867447596805989d));
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.045031552153607E46d, 0.5645439425056553d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.18521513906713682d) + "'", double2 == (-0.18521513906713682d));
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 127, 144);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.008918845303300279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 0, 1531.8371899144815d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.104235503814077E41d, (-0.8648790814947103d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.104235503814077E41d + "'", double2 == 5.104235503814077E41d);
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 458);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26241.467016991704d + "'", double1 == 26241.467016991704d);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.008837862703320917d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-2));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-16.42697542794437d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1024.999755859375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.01561737432803d + "'", double1 == 32.01561737432803d);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.5138728963108883d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.789716390178187E26d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.07552869653363556d), 0.8091056466488193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8126232407697149d + "'", double2 == 0.8126232407697149d);
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.624342922017807d + "'", double1 == 22.624342922017807d);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2532797083404758d + "'", double1 == 0.2532797083404758d);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        double double2 = org.apache.commons.math3.util.FastMath.pow(750.0d, 0.17190027517928788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.12049738039639d + "'", double2 == 3.12049738039639d);
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        int int1 = org.apache.commons.math3.util.FastMath.round((-0.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 0.9353866470427131d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.499612914713169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9620773500730718d + "'", double1 == 0.9620773500730718d);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.058916076536616895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0607229579714315d) + "'", double1 == (-0.0607229579714315d));
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        int int1 = org.apache.commons.math3.util.FastMath.round(1023.99994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5135741754193315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1481568901940804d + "'", double1 == 1.1481568901940804d);
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6679190596134986d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7031839360032603E-108d) + "'", double1 == (-1.7031839360032603E-108d));
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.001f, (float) (-41));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-41.0f) + "'", float2 == (-41.0f));
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-7.263102063200969E31d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9352688996691373d + "'", double1 == 0.9352688996691373d);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.05010842414258889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }
}

