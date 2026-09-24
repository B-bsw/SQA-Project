package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

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
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5699061505137777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45101584083069923d + "'", double1 == 0.45101584083069923d);
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5706217762642902d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7716211363261058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4593566380802732d, 0.01151190223831367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.459356638080273d + "'", double2 == 1.459356638080273d);
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        double double1 = org.apache.commons.math.util.FastMath.tanh(69.35280798945955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.281452070980398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.157700062643438d + "'", double1 == 1.157700062643438d);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.0923176850416234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        long long1 = org.apache.commons.math.util.FastMath.round(0.19611987691520022d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1358057023023203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0463693213253177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04636932132531771d + "'", double1 == 0.04636932132531771d);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7175814658190476d), 0.16724814964758392d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3418122447084941d) + "'", double2 == (-1.3418122447084941d));
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9990920390306268d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.7212497613894784d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-20.64589664698613d) + "'", double1 == (-20.64589664698613d));
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 2405171239L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8742049625998478d) + "'", double1 == (-0.8742049625998478d));
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599210498948732d + "'", double1 == 1.2599210498948732d);
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.661006041483758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.936739795201818d + "'", double1 == 1.936739795201818d);
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2997277948552883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8327907658682646d + "'", double1 == 0.8327907658682646d);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 70368744177664L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 252318064);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.52318064E8f + "'", float2 == 2.52318064E8f);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.263592139934385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10932030584389242d + "'", double1 == 0.10932030584389242d);
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9866275920404841d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8293830829792643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.603978796891841d + "'", double1 == 0.603978796891841d);
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.764160044617983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999854487078507d + "'", double1 == 0.999854487078507d);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3754263855773785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6494710267528832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7743832799865517d + "'", double1 == 0.7743832799865517d);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.89629601826829E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.89742342090407d + "'", double1 == 13.89742342090407d);
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9224869535749408E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9313641603463556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5379690138846116d + "'", double1 == 1.5379690138846116d);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.2673631790022216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.31878175402805d) + "'", double1 == (-15.31878175402805d));
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.1273944292716545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.016124838541614d + "'", double1 == 61.016124838541614d);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.3580540499984855E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3580541131104675E-4d + "'", double1 == 3.3580541131104675E-4d);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7907497569184486d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6808791884039018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4083347225917441d, 0.7418061661440577d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4083347225917441d + "'", double2 == 0.4083347225917441d);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.643440755033571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 94.16221914321702d + "'", double1 == 94.16221914321702d);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.1562707178680864d), 0.6552377416047083d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6832810232787436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.297413204526123d + "'", double1 == 1.297413204526123d);
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6295736575984704d, 7.853398979608905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026413890076495333d + "'", double2 == 0.026413890076495333d);
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-7));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.522227941985666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.02809969691994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.773145071536183d + "'", double1 == 0.773145071536183d);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.26739338089528597d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.37265448204541224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7L, 145.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4362355307740595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030612511435305d + "'", double1 == 0.9030612511435305d);
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.3078511907005352d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2963685787093853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.980668740338526d + "'", double1 == 16.980668740338526d);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0003297196233996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003297196233996d + "'", double1 == 1.0003297196233996d);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.05363026241493581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5171403224431976d + "'", double1 == 1.5171403224431976d);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.3746156955164151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9547785791847416d + "'", double1 == 1.9547785791847416d);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2054747075950174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1868734375770279d + "'", double1 == 0.1868734375770279d);
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9272995150405832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07547866415616125d) + "'", double1 == (-0.07547866415616125d));
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0201244245550114d, 0.45371490181230795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0201244245550112d + "'", double2 == 1.0201244245550112d);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.1292690580733946d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.970233767273539d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1569245455535437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.747294814731883d + "'", double1 == 1.747294814731883d);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5574077246549023d, 1.2599210498948732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077246549023d + "'", double2 == 1.5574077246549023d);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.2214830415908176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5048474895291349d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8571305341625859d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5756219247526232d) + "'", double1 == (-0.5756219247526232d));
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        long long2 = org.apache.commons.math.util.FastMath.min(573L, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9970996906435381d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8793212708788279d) + "'", double1 == (-0.8793212708788279d));
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        int int2 = org.apache.commons.math.util.FastMath.min((-7), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5400948954987915d, 0.7748910114247427d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.608706107233886d + "'", double2 == 0.608706107233886d);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842859999667966E24d + "'", double1 == 2.842859999667966E24d);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.29804177942641236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2980417794264124d + "'", double1 == 0.2980417794264124d);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9225054335922256E-5d, 0.4230598789337311d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010110987829559367d + "'", double2 == 0.010110987829559367d);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8134229531940107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7431155397672966d + "'", double1 == 0.7431155397672966d);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8645505642120598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        double double1 = org.apache.commons.math.util.FastMath.cosh(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        double double1 = org.apache.commons.math.util.FastMath.exp((-43.56618709829934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2007299560772456E-19d + "'", double1 == 1.2007299560772456E-19d);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.82276518977207E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-19.106639705458534d) + "'", double1 == (-19.106639705458534d));
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        double double2 = org.apache.commons.math.util.FastMath.max(0.01773703268867599d, 1.1219612639891907d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1219612639891907d + "'", double2 == 1.1219612639891907d);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.22690570903791685d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.799695665801612d + "'", double1 == 1.799695665801612d);
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9680831371227122d), (double) 573);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 573.0d + "'", double2 == 573.0d);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.819513221744016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1553333796430316d + "'", double1 == 1.1553333796430316d);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.16571020934276787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.180231032234882d + "'", double1 == 1.180231032234882d);
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8334357964461425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8334357964461425d + "'", double1 == 0.8334357964461425d);
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5193968358809402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5193968358809402d + "'", double1 == 1.5193968358809402d);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.943682501001078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.394160141806198d + "'", double1 == 1.394160141806198d);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.5243548967072378E-29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        long long1 = org.apache.commons.math.util.FastMath.round(0.44488600522827004d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.02895324674269463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028961339866994493d + "'", double1 == 0.028961339866994493d);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 38L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (-7.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5544559615876794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.06376603792404d + "'", double1 == 89.06376603792404d);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        double double1 = org.apache.commons.math.util.FastMath.signum((-89.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5546252992521606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5894625297255608d) + "'", double1 == (-0.5894625297255608d));
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, (float) 2405171239L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4051712E9f + "'", float2 == 2.4051712E9f);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9999938558065222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999969278985422d + "'", double1 == 0.9999969278985422d);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.248094888236225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5104481827297035d + "'", double1 == 0.5104481827297035d);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.694903085487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.11079348211254d + "'", double1 == 97.11079348211254d);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5978220919084256d), 0.5114854340796523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5978220919084255d) + "'", double2 == (-0.5978220919084255d));
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.13812313260893225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14811691220162723d + "'", double1 == 0.14811691220162723d);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        float float2 = org.apache.commons.math.util.FastMath.min(38.0f, (float) 3374L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.011990677206016754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01199038987880212d + "'", double1 == 0.01199038987880212d);
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015966225340774735d + "'", double1 == 0.015966225340774735d);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7310973244101043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.486449227395259E-4d, (-0.1056495335997729d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.486449227395258E-4d + "'", double2 == 8.486449227395258E-4d);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.13442541122615329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1352410045315319d + "'", double1 == 0.1352410045315319d);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1528859429959881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7668092411294383d + "'", double1 == 0.7668092411294383d);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        double double2 = org.apache.commons.math.util.FastMath.pow(13.690080134215329d, 1.036090693379206d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.04595194541315d + "'", double2 == 15.04595194541315d);
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        int int2 = org.apache.commons.math.util.FastMath.max(6061, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6061 + "'", int2 == 6061);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8872709503576206d + "'", double1 == 2.8872709503576206d);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.8931193992435265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        int int2 = org.apache.commons.math.util.FastMath.min(22025, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.40531933496538397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9189765263380592d + "'", double1 == 0.9189765263380592d);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        double double2 = org.apache.commons.math.util.FastMath.min(15.154093508474027d, 9.508341946412625E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.508341946412625E-5d + "'", double2 == 9.508341946412625E-5d);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.09950371902099903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0021606868913209d) + "'", double1 == (-1.0021606868913209d));
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.2710663101885897d, 2.7192510249555397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.877256792376897d + "'", double2 == 0.877256792376897d);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8169805481334202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2636545123256722d + "'", double1 == 1.2636545123256722d);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3962634015954634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0400755875816206d + "'", double1 == 4.0400755875816206d);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.8373008886306445E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.836131291800539E-4d + "'", double1 == 4.836131291800539E-4d);
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        long long1 = org.apache.commons.math.util.FastMath.round(2.2529813614778327d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        double double1 = org.apache.commons.math.util.FastMath.floor(630983.1159256954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 630983.0d + "'", double1 == 630983.0d);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.6635116973665676d, 0.027283067661679677d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6635116973665673d + "'", double2 == 1.6635116973665673d);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.08868019652085424d, 4.477207657226922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08868019652085425d + "'", double2 == 0.08868019652085425d);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.42086258607142485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7493995704460316d + "'", double1 == 0.7493995704460316d);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.0034419884227690017d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034419816264359996d) + "'", double1 == (-0.0034419816264359996d));
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) 38);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8206232337472084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7315708709828758d + "'", double1 == 0.7315708709828758d);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.08726646259971647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        double double1 = org.apache.commons.math.util.FastMath.cos(423.85042430535873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.965201390124394d) + "'", double1 == (-0.965201390124394d));
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.972501523185553E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.972502088141537E-4d + "'", double1 == 6.972502088141537E-4d);
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.07579834219123135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        double double1 = org.apache.commons.math.util.FastMath.log(0.09983407889920767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3042456820170427d) + "'", double1 == (-2.3042456820170427d));
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.011536475885345746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9429581799620673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5675655160966666d + "'", double1 == 1.5675655160966666d);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        double double1 = org.apache.commons.math.util.FastMath.log(9.674658414801334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.269509932328889d + "'", double1 == 2.269509932328889d);
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.6342953050784885d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 9, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        long long1 = org.apache.commons.math.util.FastMath.abs(88L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 88L + "'", long1 == 88L);
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9885908398396104d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.027719239916259047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.342227591314738E8d, (-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963276736048d + "'", double2 == 1.5707963276736048d);
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.19006280234111017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0181163721761375d + "'", double1 == 1.0181163721761375d);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1075653784740282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9995740182847914d, 10.54930615400752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.54930615400752d + "'", double2 == 10.54930615400752d);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.5469160326749675E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-7.095326904862169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 603.1587393940363d + "'", double1 == 603.1587393940363d);
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.017477767330207263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017326787806169353d + "'", double1 == 0.017326787806169353d);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.022993279121268483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022993279121268487d + "'", double1 == 0.022993279121268487d);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 70368744177664L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.02109732960109633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020877862358127622d + "'", double1 == 0.020877862358127622d);
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.3260523900154437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3260523900154437d + "'", double1 == 2.3260523900154437d);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.850894897064994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        double double2 = org.apache.commons.math.util.FastMath.max(0.2552145848023872d, (-0.7465662286826749d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2552145848023872d + "'", double2 == 0.2552145848023872d);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.08106152637093929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08123954526961918d + "'", double1 == 0.08123954526961918d);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5698603924331294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.94637491116947d + "'", double1 == 89.94637491116947d);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(37.87285640966874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.661006041483758d + "'", double1 == 0.661006041483758d);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.023207412479587464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5475868306201088d + "'", double1 == 1.5475868306201088d);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.14147577836676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9962712063398826d + "'", double1 == 0.9962712063398826d);
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.186743738086344E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000507766786d + "'", double1 == 1.0000000507766786d);
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.226651359933871d, 0.21735815689017746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.22665135993387d + "'", double2 == 4.22665135993387d);
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.8257883656009093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 161.90574714610295d + "'", double1 == 161.90574714610295d);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.6145485553432248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9610914460334479d + "'", double1 == 0.9610914460334479d);
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.970233767273539d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        double double1 = org.apache.commons.math.util.FastMath.floor((-8.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.0d) + "'", double1 == (-8.0d));
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0026752073329137003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13882014128207512d + "'", double1 == 0.13882014128207512d);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.105413129397948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0339706381244265d + "'", double1 == 1.0339706381244265d);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.017604807315766753d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017761615041548273d) + "'", double1 == (-0.017761615041548273d));
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9516746866399276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7606422749460052d) + "'", double1 == (-0.7606422749460052d));
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2800017211707247E7d, (-0.7133601908261946d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7133601908261946d) + "'", double2 == (-0.7133601908261946d));
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.07649802229777113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07634914996399904d) + "'", double1 == (-0.07634914996399904d));
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-5.992954145267955E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0391333461933751d) + "'", double1 == (-0.0391333461933751d));
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8431746481004084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8431746481004084d + "'", double1 == 0.8431746481004084d);
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7812270842136727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9916924449244282d + "'", double1 == 0.9916924449244282d);
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7876030784130355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0650870716789331d + "'", double1 == 1.0650870716789331d);
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3135381832487074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1460969344905811d + "'", double1 == 1.1460969344905811d);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        long long1 = org.apache.commons.math.util.FastMath.abs((-5L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.6268041994823212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.028393089566237137d) + "'", double1 == (-0.028393089566237137d));
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, 21.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.012522457881223827d), 4.524244356327113E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.328306436538697E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0636613312976665E-12d + "'", double1 == 4.0636613312976665E-12d);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        double double2 = org.apache.commons.math.util.FastMath.max(0.40508603762258366d, 88.50804501951195d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 88.50804501951195d + "'", double2 == 88.50804501951195d);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 38L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.209802363378155d, (-0.8240833297627779d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1687738769670712d + "'", double2 == 2.1687738769670712d);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.44488600522827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6669977550399027d + "'", double1 == 0.6669977550399027d);
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.286032070646461d, (-0.015049846398774476d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5824983362358749d + "'", double2 == 1.5824983362358749d);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.12217304763960307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12187114015074263d + "'", double1 == 0.12187114015074263d);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.11499635059167614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11524997326667767d + "'", double1 == 0.11524997326667767d);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.01411811986800746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014117181966128814d + "'", double1 == 0.014117181966128814d);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.16723958605665326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9860480246128209d + "'", double1 == 0.9860480246128209d);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.267831587699267d, (-2.0572983097976434d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03276332339253019d + "'", double2 == 0.03276332339253019d);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0201244245550114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9, (float) 2405171239L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.577721810442024E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2105 + "'", int2 == 2105);
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.023472355419337804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        int int2 = org.apache.commons.math.util.FastMath.min((-7), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1086.6081402784182d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3593642103115025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8762455232778116d + "'", double1 == 0.8762455232778116d);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        int int2 = org.apache.commons.math.util.FastMath.max(88, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1526841572751528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8793838227939d) + "'", double1 == (-1.8793838227939d));
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9698480248174192d, (-0.0896545917828711d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0896545917828711d) + "'", double2 == (-0.0896545917828711d));
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0821368667394677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9509786666449536d + "'", double1 == 2.9509786666449536d);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        double double1 = org.apache.commons.math.util.FastMath.log(7.896296018267967E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.999999999999986d + "'", double1 == 31.999999999999986d);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.650149769841539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9686003905273606d + "'", double1 == 1.9686003905273606d);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        double double1 = org.apache.commons.math.util.FastMath.log10(14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1580419920146572d + "'", double1 == 1.1580419920146572d);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.6571831014265066E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6571831165966693E-4d) + "'", double1 == (-1.6571831165966693E-4d));
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        double double1 = org.apache.commons.math.util.FastMath.tanh(31.53483235683642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        double double1 = org.apache.commons.math.util.FastMath.asinh(89.97277934089915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.192685234819999d + "'", double1 == 5.192685234819999d);
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 24L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-3.516464347103154d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.000000019030306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077898435754d + "'", double1 == 1.5574077898435754d);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.5901750099221726d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5901750099221726d + "'", double2 == 0.5901750099221726d);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5658244769790579d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        int int2 = org.apache.commons.math.util.FastMath.min(573, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.008950102194420759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09460497975487737d + "'", double1 == 0.09460497975487737d);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.048623772378180656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.629122766574956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.26982946871976d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        long long2 = org.apache.commons.math.util.FastMath.max(8L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2405171239L, 88.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3374L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8902596696356354d + "'", double1 == 0.8902596696356354d);
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 22025);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22025 + "'", int1 == 22025);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.540060774205339d) + "'", double1 == (-0.540060774205339d));
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.61391130652238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8476439862408351d + "'", double1 == 1.8476439862408351d);
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (-7L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.0018439322145124143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3748459100034484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3934486217273407d + "'", double1 == 0.3934486217273407d);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-7));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.0850005042632922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08479667516930564d) + "'", double1 == (-0.08479667516930564d));
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-6.135069575149024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8306549632998643d) + "'", double1 == (-1.8306549632998643d));
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8575660368838224d + "'", double1 == 0.8575660368838224d);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9269488944079232d, 1.5475826624438378d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9269488944079232d + "'", double2 == 1.9269488944079232d);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 2105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(14.741329353331304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.741329353331306d + "'", double1 == 14.741329353331306d);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4626719456900756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9012469172873533d + "'", double1 == 0.9012469172873533d);
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        double double1 = org.apache.commons.math.util.FastMath.log(6.6916735960213485E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.30685281944005d + "'", double1 == 96.30685281944005d);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0009877980461306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7209682685497256d + "'", double1 == 2.7209682685497256d);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5527136788004946E-15d + "'", double1 == 3.5527136788004946E-15d);
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 145, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.9828744915858403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0928874300868892d + "'", double1 == 1.0928874300868892d);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        double double2 = org.apache.commons.math.util.FastMath.min(2.71827069403746d, 0.5158342259816473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5158342259816473d + "'", double2 == 0.5158342259816473d);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6442070736028715d, 3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        int int2 = org.apache.commons.math.util.FastMath.min(18, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.619035187754997d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5884020436116093d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.013588633815877825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999076759361661d + "'", double1 == 0.9999076759361661d);
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6195998352919936d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2334031175105369d, 0.7623282273954516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0171966362867284d + "'", double2 == 1.0171966362867284d);
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2110835567729439E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110835568321547E-5d + "'", double1 == 1.2110835568321547E-5d);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.1474836470000002E9d, 0.3026405418156001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 667.1451154336451d + "'", double2 == 667.1451154336451d);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9127535552074842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42082174926089705d + "'", double1 == 0.42082174926089705d);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        int int1 = org.apache.commons.math.util.FastMath.abs(44);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.31223183389476095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.307369098441672d + "'", double1 == 0.307369098441672d);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.16467280670940487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.435056825022485d + "'", double1 == 9.435056825022485d);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8645505642120598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8645505642120598d + "'", double1 == 0.8645505642120598d);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999979411810735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999979411810737d + "'", double1 == 0.9999979411810737d);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.6548885605479215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.223400923003245d + "'", double1 == 14.223400923003245d);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7267002501159548d), 5.856230153716194E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7267002501159547d) + "'", double2 == (-0.7267002501159547d));
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9313641603463556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7312292784189323d + "'", double1 == 0.7312292784189323d);
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2110835568321547E-5d, 2.8428599996679665E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8428599996679665E24d + "'", double2 == 2.8428599996679665E24d);
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2800017E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.333869517957054E8d + "'", double1 == 7.333869517957054E8d);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        int int2 = org.apache.commons.math.util.FastMath.min(145, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4430227241169228d, 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.656854249492381d + "'", double2 == 5.656854249492381d);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 18.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        double double1 = org.apache.commons.math.util.FastMath.cosh(62.001875319682284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.227098066237739E26d + "'", double1 == 4.227098066237739E26d);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        double double1 = org.apache.commons.math.util.FastMath.abs(68204.64473888976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68204.64473888976d + "'", double1 == 68204.64473888976d);
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.163042208289171d, 0.2915304609745629d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.16304220828917d + "'", double2 == 6.16304220828917d);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6061, (float) 573L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9024010197259666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.1430297799195695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14352199719731384d) + "'", double1 == (-0.14352199719731384d));
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.558946309455193E-13d, 17.741263221749836d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.558946309455194E-13d + "'", double2 == 4.558946309455194E-13d);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.16299078079570548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17702583839678285d + "'", double1 == 0.17702583839678285d);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8384749410913358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9429674373513335d + "'", double1 == 0.9429674373513335d);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.163042208289171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.833433014318606d + "'", double1 == 1.833433014318606d);
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0928874300868892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4277476069688093d + "'", double1 == 0.4277476069688093d);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        double double1 = org.apache.commons.math.util.FastMath.abs(4342.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4342.0d + "'", double1 == 4342.0d);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.630107219510141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9702957262762539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9702957262762539d + "'", double1 == 0.9702957262762539d);
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        double double2 = org.apache.commons.math.util.FastMath.min(4443055.260253961d, 2.7192510249555397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7192510249555397d + "'", double2 == 2.7192510249555397d);
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        double double1 = org.apache.commons.math.util.FastMath.exp((-5.992954145267955E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999400722542864d + "'", double1 == 0.9999400722542864d);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.19687317393211679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8212947882963074d + "'", double1 == 0.8212947882963074d);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.19240232444172617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19240232444172617d + "'", double1 == 0.19240232444172617d);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.792585752632344E-4d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.07594384022318276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07609034874226744d + "'", double1 == 0.07609034874226744d);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        long long1 = org.apache.commons.math.util.FastMath.round(0.027705053070945423d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.999999999999998d, 1.1193272159135788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.162161518621536d + "'", double2 == 13.162161518621536d);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.1455880470507534d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14558804705075337d) + "'", double1 == (-0.14558804705075337d));
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5364211615694945d + "'", double1 == 1.5364211615694945d);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.2673631790022216d), (-1.1243451287244837d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.027715691434453932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003841043626869d + "'", double1 == 1.0003841043626869d);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1805916207174113E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1726310973781435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06916140719540186d + "'", double1 == 0.06916140719540186d);
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6360918665423811d + "'", double1 == 0.6360918665423811d);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.026785246294635624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5975847769672513d + "'", double1 == 1.5975847769672513d);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        long long1 = org.apache.commons.math.util.FastMath.abs(2405171239L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2405171239L + "'", long1 == 2405171239L);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04635312263426354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04638636378970727d + "'", double1 == 0.04638636378970727d);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4099406642694605d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.8962960182679E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.0429318112613317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3413972973504973d + "'", double1 == 1.3413972973504973d);
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        int int2 = org.apache.commons.math.util.FastMath.min((-7), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.019316795055774244d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        double double2 = org.apache.commons.math.util.FastMath.min(0.1908198889222978d, 0.5893504478253487d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1908198889222978d + "'", double2 == 0.1908198889222978d);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 22025, (long) 6061);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        int int1 = org.apache.commons.math.util.FastMath.round(14.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8845500881248141d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.6604007228000894d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.281452070980398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2814520709803983d + "'", double1 == 2.2814520709803983d);
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.644250144850967d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6005990604736159d) + "'", double1 == (-0.6005990604736159d));
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.1219390793339943d, 1.5707038251666727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1046574097802226d + "'", double2 == 1.1046574097802226d);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3333452696210846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3333452696210846d + "'", double1 == 1.3333452696210846d);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        double double1 = org.apache.commons.math.util.FastMath.exp((-36.912814250652346d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.310402563397053E-17d + "'", double1 == 9.310402563397053E-17d);
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.957234655978706E136d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4626719456900756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 31L, (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.566661270303212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5666612703032121d + "'", double1 == 0.5666612703032121d);
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 18L, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9459101490553132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3949588341794583d + "'", double1 == 1.3949588341794583d);
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3032833236333146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8343356369944229d + "'", double1 == 0.8343356369944229d);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0029461466385965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0029461466385965d + "'", double1 == 1.0029461466385965d);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8868714057877692d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8868714057877691d) + "'", double1 == (-0.8868714057877691d));
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4464331883887016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9922768665593191d + "'", double1 == 0.9922768665593191d);
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 3374L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3374.0f + "'", float2 == 3374.0f);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.017454730321241296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745650316761996d + "'", double1 == 0.01745650316761996d);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5225789835263854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9091460424016333d + "'", double1 == 0.9091460424016333d);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.017738893077120243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.751073484024995d) + "'", double1 == (-1.751073484024995d));
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.271806125530277E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.739395799433465E-23d + "'", double1 == 4.739395799433465E-23d);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.666536656761523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.18973732319525d + "'", double1 == 38.18973732319525d);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9709393822234023d, 1.9686003905273606d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9709393822234024d + "'", double2 == 0.9709393822234024d);
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.365513453787659d, 0.6218099972365793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1610522125512257d + "'", double2 == 3.1610522125512257d);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9030612511435306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.467144110551066d + "'", double1 == 2.467144110551066d);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6931501322170701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7692370153660175d + "'", double1 == 0.7692370153660175d);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 22025);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22025.0f + "'", float1 == 22025.0f);
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4575070963166896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        double double1 = org.apache.commons.math.util.FastMath.log1p(116.29021260843672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.764651313204946d + "'", double1 == 4.764651313204946d);
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 2405171239L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.197815719482145E7d + "'", double1 == 4.197815719482145E7d);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.786480471441937E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.786480471441937E10d + "'", double1 == 9.786480471441937E10d);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9996157480444497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5560922495134364d + "'", double1 == 1.5560922495134364d);
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9264927456996489d, 2.3445697418012538E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707710209330625d + "'", double2 == 1.5707710209330625d);
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.09492753617060128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.338311150777212E44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8582226493088282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6953408030715102d) + "'", double1 == (-0.6953408030715102d));
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.75497889798194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9409398186250052d + "'", double1 == 0.9409398186250052d);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.017454730321241296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4967920654246698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5198985158860395d + "'", double1 == 0.5198985158860395d);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 70368744177664L, (float) 26L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 38L, (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8184602640872807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.4188936723568735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.945282190337118d) + "'", double1 == (-1.945282190337118d));
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-4.916823262511692d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9998927719796812d) + "'", double1 == (-0.9998927719796812d));
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 31);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.6384205222376984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.03171900616457d + "'", double1 == 38.03171900616457d);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        float float2 = org.apache.commons.math.util.FastMath.max(14.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6342323330682557d, (-3.7212497613894784d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9727794501544427d + "'", double2 == 2.9727794501544427d);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.03791113527135105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0386389304106265d + "'", double1 == 1.0386389304106265d);
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6758226352556027d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.016308471348987046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2535932862608865d + "'", double1 == 0.2535932862608865d);
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7771697255420011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013564170557528593d + "'", double1 == 0.013564170557528593d);
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4990641066341381d) + "'", double1 == (-1.4990641066341381d));
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.978995704713228E82d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.117159041693309E27d + "'", double1 == 4.117159041693309E27d);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(13.897423420904053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7279248142772476d + "'", double1 == 3.7279248142772476d);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8447250802010534d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        double double2 = org.apache.commons.math.util.FastMath.min(1.6442070736028715d, 0.030307499521499394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030307499521499394d + "'", double2 == 0.030307499521499394d);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        double double1 = org.apache.commons.math.util.FastMath.rint((-59.00187915014031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-59.0d) + "'", double1 == (-59.0d));
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6022261743924853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9245095865066985d + "'", double1 == 0.9245095865066985d);
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3866286404159589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40711934899342905d) + "'", double1 == (-0.40711934899342905d));
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (-5.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.223372E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.281047928335586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3541424281629695d + "'", double1 == 3.3541424281629695d);
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3875274234338688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.49946532142216d + "'", double1 == 79.49946532142216d);
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 88, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(25.306852819440053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.030591696752983d + "'", double1 == 5.030591696752983d);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9992204598064889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8363276179706672d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        double double1 = org.apache.commons.math.util.FastMath.signum((-4.464745095584537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5666612703032121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24667646914497054d) + "'", double1 == (-0.24667646914497054d));
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.115589917707645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8746755989516632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9905499752128981d + "'", double1 == 0.9905499752128981d);
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4501394397391184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.435091087991252d + "'", double1 == 0.435091087991252d);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.293727206892505d, 1.3916997416124743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29372720689250503d + "'", double2 == 0.29372720689250503d);
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.860352936094126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7733360568141627d) + "'", double1 == (-1.7733360568141627d));
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.04753223187708361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047568060987967994d + "'", double1 == 0.047568060987967994d);
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.015420704664949368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8421630577599043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07460381321604542d) + "'", double1 == (-0.07460381321604542d));
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9922350436600222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3707471282943569d + "'", double1 == 0.3707471282943569d);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6574544539067888d, 0.7462862861846525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.45802932508258d + "'", double2 == 1.45802932508258d);
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5347432219246039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5967644499022131d + "'", double1 == 0.5967644499022131d);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8592811670678461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.652982061744741d + "'", double1 == 0.652982061744741d);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999531967662273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931237786692368d + "'", double1 == 0.6931237786692368d);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        double double1 = org.apache.commons.math.util.FastMath.log10(16.11830415560668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2073193467367487d + "'", double1 == 1.2073193467367487d);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        float float2 = org.apache.commons.math.util.FastMath.min(573.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.38374066418898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.376595521037337d + "'", double1 == 5.376595521037337d);
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.436278331420456d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 22025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570750923843736d + "'", double1 == 1.570750923843736d);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        float float2 = org.apache.commons.math.util.FastMath.max(2105.0f, (float) 3374L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3374.0f + "'", float2 == 3374.0f);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.29153046097456287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02693177575907612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0269350325172229d + "'", double1 == 0.0269350325172229d);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6398359282348625E68d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5528932480470083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.874325854012688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1957822033763512d + "'", double1 == 1.1957822033763512d);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.02771569143445394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8001550844245482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9283777493578383d + "'", double1 == 0.9283777493578383d);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8293830829792643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7375148883697067d + "'", double1 == 0.7375148883697067d);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        float float2 = org.apache.commons.math.util.FastMath.min(26.0f, 14.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24600640679997673d, 2.325178437245552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1054089431628309d + "'", double2 == 0.1054089431628309d);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 18);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18L + "'", long1 == 18L);
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.1428830338846818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-114.66001961430878d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8032290633000474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.232738956216599d + "'", double1 == 2.232738956216599d);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) 31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 38.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6375861597263857d + "'", double1 == 3.6375861597263857d);
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        int int2 = org.apache.commons.math.util.FastMath.min(18, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04640300046199763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046419655042440194d + "'", double1 == 0.046419655042440194d);
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7175814658190476d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2405171239L, 2.4051712E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4051712E9f + "'", float2 == 2.4051712E9f);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8077671816348476d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8077671816348475d) + "'", double1 == (-0.8077671816348475d));
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1448.1546878700494d + "'", double1 == 1448.1546878700494d);
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2982333069391765d, 1.7544036781775965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2982333069391765d + "'", double2 == 1.2982333069391765d);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2976454463101708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        long long2 = org.apache.commons.math.util.FastMath.max(145L, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.01151190223831367d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3870426100977542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9260293789021039d + "'", double1 == 0.9260293789021039d);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9624876016981836d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2997277948552883d, (-0.14352199719731384d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2997277948552883d + "'", double2 == 1.2997277948552883d);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        double double1 = org.apache.commons.math.util.FastMath.log(1.724670203544525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5450358458538829d + "'", double1 == 0.5450358458538829d);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        double double1 = org.apache.commons.math.util.FastMath.rint(264.4010323425236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 264.0d + "'", double1 == 264.0d);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.997417559331972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.997417559331972d + "'", double1 == 4.997417559331972d);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.047532207641238694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04751431132497118d + "'", double1 == 0.04751431132497118d);
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        double double1 = org.apache.commons.math.util.FastMath.log(9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.66827237527656d + "'", double1 == 43.66827237527656d);
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.155849014780759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.75777986873585d + "'", double1 == 11.75777986873585d);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        double double1 = org.apache.commons.math.util.FastMath.log(1.181533252594591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16681296163692264d + "'", double1 == 0.16681296163692264d);
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        long long1 = org.apache.commons.math.util.FastMath.round(4.1577059034868376E-10d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3024764405495296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30710994855259355d + "'", double1 == 0.30710994855259355d);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5326825911566597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9108825383003673d + "'", double1 == 0.9108825383003673d);
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.477207657226922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.173353956732215d + "'", double1 == 4.173353956732215d);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.258096538021482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.258096538021482d + "'", double1 == 3.258096538021482d);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0461462579250012d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.0964965415327947d, 3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 60.30025405769243d + "'", double2 == 60.30025405769243d);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8988277953526667d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0471758442373165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) 31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.13326424646685242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9911334539817277d + "'", double1 == 0.9911334539817277d);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1707323589456107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3894772598027302d + "'", double1 == 0.3894772598027302d);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7675283643313483d, (-9.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7675283643313482d + "'", double2 == 0.7675283643313482d);
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.06916140719540186d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.0684737276299647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4382189428699528d + "'", double1 == 1.4382189428699528d);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        double double1 = org.apache.commons.math.util.FastMath.abs(17.858515120429434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.858515120429434d + "'", double1 == 17.858515120429434d);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.652233674034091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 142.46534984690263d + "'", double1 == 142.46534984690263d);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.029711413080183918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029707043434667513d + "'", double1 == 0.029707043434667513d);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, 2.4051712E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5257228523581828d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0232274785465052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0115470718392225d + "'", double1 == 1.0115470718392225d);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9623912578794126d, 6.6916735960213485E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.001905171600991387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0019033590633418204d + "'", double1 == 0.0019033590633418204d);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9835107230884862d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0961179680051676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.992526362709987d + "'", double1 == 2.992526362709987d);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6028259502186395d, (-36.91281425065235d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6028259502186395d + "'", double2 == 0.6028259502186395d);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.23831648283882453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.028532029497268d + "'", double1 == 1.028532029497268d);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0021323219385069605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002132323554382712d + "'", double1 == 0.002132323554382712d);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.005282123029073894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005268221548625999d + "'", double1 == 0.005268221548625999d);
    }
}

