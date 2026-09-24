package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

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
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5978220919084257d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        double double2 = org.apache.commons.math.util.FastMath.max((-2105.0d), 0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999092042625951d + "'", double2 == 0.9999092042625951d);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3135381832487074d, 1.0144000753344111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9131969867505101d + "'", double2 == 0.9131969867505101d);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-7), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7L) + "'", long2 == (-7L));
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-5L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08726646259971647d) + "'", double1 == (-0.08726646259971647d));
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8100372897558831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.680831345113993d + "'", double1 == 0.680831345113993d);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        float float2 = org.apache.commons.math.util.FastMath.min(2.4051712E9f, (float) 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        double double1 = org.apache.commons.math.util.FastMath.atan(76.93758070782783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5577995093175134d + "'", double1 == 1.5577995093175134d);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.1732865386340432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.18203743107264986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18006572487830327d + "'", double1 == 0.18006572487830327d);
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.853398979608905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 449.96661636393753d + "'", double1 == 449.96661636393753d);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.290872080286506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2908720802865066d + "'", double1 == 2.2908720802865066d);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6874262672169151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7579392357844018d + "'", double1 == 0.7579392357844018d);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2863121968974662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2863121968974662d + "'", double1 == 0.2863121968974662d);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        double double1 = org.apache.commons.math.util.FastMath.signum(117.61174253155806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5071221992618503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48566364408489066d) + "'", double1 == (-0.48566364408489066d));
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        long long1 = org.apache.commons.math.util.FastMath.round(2.713200981319833d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        double double1 = org.apache.commons.math.util.FastMath.log(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0011281172648607977d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1438634000260818d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6810043444511893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6295736575984704d + "'", double1 == 0.6295736575984704d);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        double double1 = org.apache.commons.math.util.FastMath.rint((-8.411337566029088E-22d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.7182818284590375d, (double) 26L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9572960942882437E11d + "'", double2 == 1.9572960942882437E11d);
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6806406458923995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9751426940447304d + "'", double1 == 0.9751426940447304d);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        float float2 = org.apache.commons.math.util.FastMath.min(2.52318064E8f, 88.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5017009167919776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7945995197127066d + "'", double1 == 0.7945995197127066d);
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.0651551853700286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.5311260223141459d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2035439703792363d) + "'", double1 == (-2.2035439703792363d));
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        double double1 = org.apache.commons.math.util.FastMath.abs(75.78518007393176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.78518007393176d + "'", double1 == 75.78518007393176d);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (-7.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999996693227694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.14575846667616507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9893960285726507d + "'", double1 == 0.9893960285726507d);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        double double1 = org.apache.commons.math.util.FastMath.atan(1164.1175712113197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5699373072432994d + "'", double1 == 1.5699373072432994d);
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7263513014980092d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2755968012964243d + "'", double1 == 1.2755968012964243d);
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8430650369670094d), 2.8994171193690146E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8994171193690146E-4d + "'", double2 == 2.8994171193690146E-4d);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.49619950233918614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0515804565243465d + "'", double1 == 1.0515804565243465d);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.057101686238878076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 573.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.091500380984786E248d + "'", double1 == 7.091500380984786E248d);
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        float float2 = org.apache.commons.math.util.FastMath.max(9.0f, 573.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5397294065638792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1409119715576903d + "'", double1 == 2.1409119715576903d);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        double double1 = org.apache.commons.math.util.FastMath.cos(84.71050998855853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9936794828003057d) + "'", double1 == (-0.9936794828003057d));
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        double double2 = org.apache.commons.math.util.FastMath.min(2.4360530864024404E78d, 0.7972957247486472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7972957247486472d + "'", double2 == 0.7972957247486472d);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        float float2 = org.apache.commons.math.util.FastMath.min(18.0f, 22025.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.674658414801334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2552145848023872d + "'", double1 == 0.2552145848023872d);
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        long long1 = org.apache.commons.math.util.FastMath.round(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1379172066869372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        double double1 = org.apache.commons.math.util.FastMath.log(3.850844047750578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.348292357453579d + "'", double1 == 1.348292357453579d);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9030612511435306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.643463774419014d + "'", double1 == 0.643463774419014d);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.5328331098188576E-12d, 0.012933598027822206d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7079733481537867d + "'", double2 == 0.7079733481537867d);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.77640662496864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4054897757552427d + "'", double1 == 1.4054897757552427d);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        double double1 = org.apache.commons.math.util.FastMath.acos(917.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0475836473520026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.850754361071198d + "'", double1 == 2.850754361071198d);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        float float2 = org.apache.commons.math.util.FastMath.min(14.0f, (float) 573L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3803000710956943d, 0.6931471804454368d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.105413129397948d + "'", double2 == 1.105413129397948d);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.1924023244417262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19240232444172622d + "'", double1 == 0.19240232444172622d);
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.806217383900344E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.806217383900345E-6d + "'", double1 == 4.806217383900345E-6d);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.18838862103418863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.793872893548494d + "'", double1 == 10.793872893548494d);
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.017738893077120243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        double double1 = org.apache.commons.math.util.FastMath.sin(105.3634469745431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.992797488826495d) + "'", double1 == (-0.992797488826495d));
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.653878486731224d, 7.642595581083531E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.7167639596083E91d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        double double1 = org.apache.commons.math.util.FastMath.floor((-7.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.0d) + "'", double1 == (-7.0d));
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, 14.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6603469013500041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7212806105189438d + "'", double1 == 0.7212806105189438d);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.186743738086344E-4d, 4.89324023572096E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        int int1 = org.apache.commons.math.util.FastMath.abs(18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        double double1 = org.apache.commons.math.util.FastMath.log(1.662514763028327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5083313735254839d + "'", double1 == 0.5083313735254839d);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1209452514271958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6968620773297396d + "'", double1 == 1.6968620773297396d);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 38.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6635616461296463d + "'", double1 == 3.6635616461296463d);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2110908904194567E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003480073117650629d + "'", double1 == 0.003480073117650629d);
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8363276179706672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9372885744304817d + "'", double1 == 0.9372885744304817d);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2195305837148458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.87395543398638d + "'", double1 == 69.87395543398638d);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        int int2 = org.apache.commons.math.util.FastMath.min(22025, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09492753617060128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09464342203528683d + "'", double1 == 0.09464342203528683d);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8184602640872807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8184602640872807d + "'", double1 == 0.8184602640872807d);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        double double2 = org.apache.commons.math.util.FastMath.pow(57.00000000000001d, (-0.2673631790022216d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33926863905287485d + "'", double2 == 0.33926863905287485d);
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3940493875124622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6277335322511155d + "'", double1 == 0.6277335322511155d);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 6061);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5054239130833369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46637207480363707d) + "'", double1 == (-0.46637207480363707d));
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.9774456978414334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05196623072667324d) + "'", double1 == (-0.05196623072667324d));
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5604676481299897d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7268687239847369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7472588986525693d + "'", double1 == 0.7472588986525693d);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6380998614296134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5956702710981374d) + "'", double1 == (-0.5956702710981374d));
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.427768900977764E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.427768900977765E74d + "'", double1 == 5.427768900977765E74d);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) (-7));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.44430607342225E59d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2552145848023872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3127266958052475d + "'", double1 == 1.3127266958052475d);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-5));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        double double1 = org.apache.commons.math.util.FastMath.asin((-4.8193414259330926E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.8193414259330926E-20d) + "'", double1 == (-4.8193414259330926E-20d));
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5501042757606859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.259554979423884d) + "'", double1 == (-0.259554979423884d));
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        double double2 = org.apache.commons.math.util.FastMath.pow((-36.91281425065235d), 1.2699081698724155d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.632006013089796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2650915128488487d + "'", double1 == 2.2650915128488487d);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.019658508809675648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019661041786274192d + "'", double1 == 0.019661041786274192d);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9999999999675754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999837876d + "'", double1 == 0.9999999999837876d);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.399216241149911E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3992162411499114E248d + "'", double1 == 3.3992162411499114E248d);
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3108324944320862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3108324944320862d + "'", double1 == 1.3108324944320862d);
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2148823033161556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21488230331615563d + "'", double1 == 0.21488230331615563d);
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        double double2 = org.apache.commons.math.util.FastMath.min((-3380.558658643968d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3380.558658643968d) + "'", double2 == (-3380.558658643968d));
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.058283143422131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7812270842136727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7100500199318782d + "'", double1 == 0.7100500199318782d);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        int int2 = org.apache.commons.math.util.FastMath.max(14, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        float float2 = org.apache.commons.math.util.FastMath.max(14.0f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02109732960109633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5496974318194474d + "'", double1 == 1.5496974318194474d);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999860498800671d, 0.42086258607142485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.42086258607142485d + "'", double2 == 0.42086258607142485d);
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        double double1 = org.apache.commons.math.util.FastMath.abs(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9944105305785783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7592367113429862d + "'", double1 == 0.7592367113429862d);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.982933744815721d, 0.6059822019406358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9829337448157209d + "'", double2 == 0.9829337448157209d);
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 26L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.0d + "'", double1 == 26.0d);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950547536867305d + "'", double1 == 0.9950547536867305d);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        int int2 = org.apache.commons.math.util.FastMath.min(22025, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) 252318064L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.52318064E8f + "'", float2 == 2.52318064E8f);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.096453930081621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24010333262637965d) + "'", double1 == (-0.24010333262637965d));
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.8754094422318124E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.411682406936194d) + "'", double1 == (-17.411682406936194d));
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-7.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-548.3161232732465d) + "'", double1 == (-548.3161232732465d));
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.777117472048689d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.570796326794889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3139311415550486E14d + "'", double1 == 1.3139311415550486E14d);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-88.99999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.464745095584537d) + "'", double1 == (-4.464745095584537d));
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(8.632006013089796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9380275718736537d + "'", double1 == 2.9380275718736537d);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1713189077681307d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7367720489214966d, 1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7907497569184486d + "'", double2 == 0.7907497569184486d);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2857111204210793d, 1.543080634815244d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2857111204210793d + "'", double2 == 0.2857111204210793d);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.140655263641914E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.140655263641914E-9d + "'", double1 == 1.140655263641914E-9d);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 145);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 145 + "'", int1 == 145);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.3580540499984855E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.357490349840526E-4d + "'", double1 == 3.357490349840526E-4d);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4359627388413443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220788174228434d + "'", double1 == 2.220788174228434d);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.164006151880159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06595527560643515d + "'", double1 == 0.06595527560643515d);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.856230153716194E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.271806125530277E-25d + "'", double1 == 8.271806125530277E-25d);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 18, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4637669171613941d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.12186934340514759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12186934340514759d + "'", double1 == 0.12186934340514759d);
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6552490790653522d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8685646297050478d) + "'", double1 == (-0.8685646297050478d));
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2851600114359308E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899871580091143d) + "'", double1 == (-0.9899871580091143d));
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5158342259816473d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5158342259816474d + "'", double2 == 0.5158342259816474d);
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.40508603762258366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.16882546477676433d, 0.6928551622806686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16882546477676436d + "'", double2 == 0.16882546477676436d);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(22.326014307562925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.389662458514335d + "'", double1 == 0.389662458514335d);
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8373830985134536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.109775444349455d + "'", double1 == 1.109775444349455d);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        float float2 = org.apache.commons.math.util.FastMath.max(9.0f, 22025.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        double double1 = org.apache.commons.math.util.FastMath.tanh(86.97925790240271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0000001169973836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1699737671488761E-7d + "'", double1 == 1.1699737671488761E-7d);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.16571020934276792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16420989279721268d + "'", double1 == 0.16420989279721268d);
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9201875472177408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08317777404333765d) + "'", double1 == (-0.08317777404333765d));
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.883541294419299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015420704664949368d + "'", double1 == 0.015420704664949368d);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2700305245105663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0600451207276922d + "'", double1 == 1.0600451207276922d);
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5707963267948712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.301298902307231d + "'", double1 == 2.301298902307231d);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        double double1 = org.apache.commons.math.util.FastMath.log(27.309421616676456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.307231756816692d + "'", double1 == 3.307231756816692d);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.9762070212477264E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1322832176161492E13d + "'", double1 == 1.1322832176161492E13d);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.999986049880067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.058502367302896E-6d) + "'", double1 == (-6.058502367302896E-6d));
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.46749182950293094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6837337416735633d + "'", double1 == 0.6837337416735633d);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.3541424281629695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.35414242816297d + "'", double1 == 3.35414242816297d);
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.860761315262648E-32d + "'", double1 == 9.860761315262648E-32d);
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6870151974084779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011990677206016754d + "'", double1 == 0.011990677206016754d);
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.921464049239914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.593448237887919d + "'", double1 == 0.593448237887919d);
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.247595209480447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.19240232444172625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19240232444172628d + "'", double1 == 0.19240232444172628d);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0031091414242400395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14595315667793862d + "'", double1 == 0.14595315667793862d);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 88, 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88L + "'", long2 == 88L);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.3992154382857253E248d, 84.71050998855853d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2879824694293398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1729941422876436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17474078431209433d + "'", double1 == 0.17474078431209433d);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.185039863261519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9985943900355354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.108780800821564E-4d) + "'", double1 == (-6.108780800821564E-4d));
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.8104768396174693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        double double2 = org.apache.commons.math.util.FastMath.max(0.020598917446710018d, 7.8076350433445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.8076350433445d + "'", double2 == 7.8076350433445d);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7229585916119629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8823160160403881d + "'", double1 == 0.8823160160403881d);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.679230018528973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5910185987845153d + "'", double1 == 0.5910185987845153d);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.984807753012208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.506565440100699d + "'", double1 == 1.506565440100699d);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3333452696210846d, 844.6159563581988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 844.6159563581988d + "'", double2 == 844.6159563581988d);
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.1056495335997729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0018439322145124143d) + "'", double1 == (-0.0018439322145124143d));
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2017861323049612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3260523900154437d + "'", double1 == 2.3260523900154437d);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.0267884501723548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026782044944684776d) + "'", double1 == (-0.026782044944684776d));
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.557254786481422d, (-0.999301726082793d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.14131975637264d + "'", double2 == 2.14131975637264d);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2689810367809309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0067668676472898565d, (-31.55620531888934d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006766867647289856d + "'", double2 == 0.006766867647289856d);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.930380657631324E-32d + "'", double1 == 4.930380657631324E-32d);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.35843370322989837d), 2.5249271018183177d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.115589917707645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.91859395199487d + "'", double1 == 63.91859395199487d);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9289309427987065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9289309427987066d + "'", double1 == 0.9289309427987066d);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        int int2 = org.apache.commons.math.util.FastMath.min(14, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.2650915128488487d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 14);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9986502386334037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.650149769841539d + "'", double1 == 3.650149769841539d);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4454867810501793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9024010197259666d + "'", double1 == 0.9024010197259666d);
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 88, (float) 22025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 31, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9994109602857177d, 1.2201014771445793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.686291938262756d + "'", double2 == 0.686291938262756d);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 7, 2105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6537995713645458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6144072740383286d + "'", double1 == 0.6144072740383286d);
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.022989228293811562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022985179606481648d + "'", double1 == 0.022985179606481648d);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.491172679433163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.491172679433163d + "'", double1 == 2.491172679433163d);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-47.82715545863623d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8347413346163808d) + "'", double1 == (-0.8347413346163808d));
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.4466253619172305d, 3.5605255838238796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.182680047644382d + "'", double2 == 24.182680047644382d);
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        double double2 = org.apache.commons.math.util.FastMath.min(0.04747861148694368d, (double) 14L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04747861148694368d + "'", double2 == 0.04747861148694368d);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6975744860120546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6028259502186395d + "'", double1 == 0.6028259502186395d);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.04749646746707085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04746078367790618d + "'", double1 == 0.04746078367790618d);
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.765626287994698d, 7.642595581083531E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8135279227115659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5567085935001828d) + "'", double1 == (-0.5567085935001828d));
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.23831648283882453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.654528655066557d) + "'", double1 == (-13.654528655066557d));
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-27.288510643477288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.9999484920954336d) + "'", double1 == (-3.9999484920954336d));
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7806737720297888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7806737720297889d + "'", double1 == 0.7806737720297889d);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-5));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9589242746631385d + "'", double1 == 0.9589242746631385d);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2937272068925049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5320558244814895d) + "'", double1 == (-0.5320558244814895d));
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.7983904661072323d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2.2679097686563057d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.642007244983966d) + "'", double1 == (-0.642007244983966d));
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8278068656280008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01444795537582289d + "'", double1 == 0.01444795537582289d);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0801926587133339d + "'", double1 == 0.0801926587133339d);
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, 6061.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.08883176481419076d), 1.3777732767106265d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        double double1 = org.apache.commons.math.util.FastMath.tan((-7.470158750205857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.470160139737163E-4d) + "'", double1 == (-7.470160139737163E-4d));
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.446319123081521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2373067406321299d + "'", double1 == 1.2373067406321299d);
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.255946955090421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3400172179150083d + "'", double1 == 1.3400172179150083d);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        float float2 = org.apache.commons.math.util.FastMath.min(9.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.70197740328915E-38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.70197740328915E-38d + "'", double1 == 4.70197740328915E-38d);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.442682412167346E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707878841124843d + "'", double1 == 1.5707878841124843d);
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5603440460313085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        int int2 = org.apache.commons.math.util.FastMath.max(7, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-16.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4443055.260253993d + "'", double1 == 4443055.260253993d);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1588005903371837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.411320617819579d + "'", double1 == 1.411320617819579d);
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.902641160672524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2670163798587484d) + "'", double1 == (-1.2670163798587484d));
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 2.4825777280150008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        double double2 = org.apache.commons.math.util.FastMath.max(9.025081067752414d, 1.0980197632589186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.025081067752414d + "'", double2 == 9.025081067752414d);
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5858517268878107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.035557078110499d + "'", double1 == 1.035557078110499d);
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.015955264795222576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5011220152577573d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1282113520070887d + "'", double1 == 1.1282113520070887d);
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6960386147148705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-3.5858845586028694d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1218693434051476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11499635059167614d + "'", double1 == 0.11499635059167614d);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.508341946412625E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.50788993223225E-5d + "'", double1 == 9.50788993223225E-5d);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        long long2 = org.apache.commons.math.util.FastMath.min(3374L, 3374L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3374L + "'", long2 == 3374L);
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.405171239038476E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.5231805679783186E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.46611365138537225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5083313735254839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5604771509986111d + "'", double1 == 0.5604771509986111d);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        long long1 = org.apache.commons.math.util.FastMath.round(1.073807815489322d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6139061045510341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9516746866399276d) + "'", double1 == (-0.9516746866399276d));
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 38, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.3325401204690593d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1672611943505358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16571867019064548d + "'", double1 == 0.16571867019064548d);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.3928546462301097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.518030551660861d + "'", double1 == 5.518030551660861d);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 252318064L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.52318064E8f + "'", float1 == 2.52318064E8f);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.834991508392875E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.834991508392875E-20d + "'", double1 == 1.834991508392875E-20d);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.1508598335814295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15085983358142951d + "'", double1 == 0.15085983358142951d);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4554625215028407d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        double double1 = org.apache.commons.math.util.FastMath.log(0.12186934340514748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.104805763827216d) + "'", double1 == (-2.104805763827216d));
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.0350326805537281E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0350326805537281E-4d + "'", double2 == 1.0350326805537281E-4d);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 252318057L, (float) 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.978790047262867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9787900472628672d + "'", double1 == 1.9787900472628672d);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2105);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2105 + "'", int1 == 2105);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0536779445509261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0536264494236831d + "'", double1 == 0.0536264494236831d);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(8.442682411966751E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002905629434729548d + "'", double1 == 0.002905629434729548d);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3705678128390975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3705678128390977d + "'", double1 == 1.3705678128390977d);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.985031234232907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9949853062930847d + "'", double1 == 0.9949853062930847d);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2304174960375769E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.535789562407242d + "'", double1 == 25.535789562407242d);
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.32507346114914276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31408714102768087d) + "'", double1 == (-0.31408714102768087d));
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6042895701620367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6417445913244706d + "'", double1 == 0.6417445913244706d);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.680831345113993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011882748623020987d + "'", double1 == 0.011882748623020987d);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1954.8736035001498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.570284784815413d) + "'", double1 == (-1.570284784815413d));
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9769866948312754d, 1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9601793548609198d + "'", double2 == 0.9601793548609198d);
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4947180585964329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0532859486483415d + "'", double1 == 1.0532859486483415d);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        double double2 = org.apache.commons.math.util.FastMath.max(0.12186934340514748d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12186934340514748d + "'", double2 == 0.12186934340514748d);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1752011936438884d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0067668676472898565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0067669709362069355d + "'", double1 == 0.0067669709362069355d);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3108324944320862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9191066572935884d + "'", double1 == 0.9191066572935884d);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.8428599996679864E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4166149615333447E8d + "'", double1 == 1.4166149615333447E8d);
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1268427362473763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42951314447129507d + "'", double1 == 0.42951314447129507d);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3280805330246155d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1086.6081402784184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.683963294426896d + "'", double1 == 7.683963294426896d);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.000000000000001d + "'", double1 == 6.000000000000001d);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        double double2 = org.apache.commons.math.util.FastMath.max(0.17474078431209433d, (-0.8871428437982151d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17474078431209433d + "'", double2 == 0.17474078431209433d);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 18);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        float float1 = org.apache.commons.math.util.FastMath.abs(44.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 44.0f + "'", float1 == 44.0f);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5879971885027404d + "'", double1 == 0.5879971885027404d);
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.19655672755619258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19408253929953004d + "'", double1 == 0.19408253929953004d);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 88L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.230532568900645E7d, (-1.570284784815413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.558946309455193E-13d + "'", double2 == 4.558946309455193E-13d);
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 2.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.687518016619889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8291670619482475d + "'", double1 == 0.8291670619482475d);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        float float2 = org.apache.commons.math.util.FastMath.min(573.0f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.104805763827216d), 0.3222076544771963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4188936723568735d) + "'", double2 == (-1.4188936723568735d));
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        double double1 = org.apache.commons.math.util.FastMath.asinh(99.98991284675513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298241494034227d + "'", double1 == 5.298241494034227d);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1050481441584241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.893485813313701d + "'", double1 == 0.893485813313701d);
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.031700435335233736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.031689820826759175d + "'", double1 == 0.031689820826759175d);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9998620166517991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        double double2 = org.apache.commons.math.util.FastMath.pow(35.0d, 0.5151928326914723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.244429828961162d + "'", double2 == 6.244429828961162d);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 8.653397151028901d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4876096657890749d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        double double1 = org.apache.commons.math.util.FastMath.expm1(54.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.148435562634557E23d + "'", double1 == 5.148435562634557E23d);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 44L, (float) 38);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2937272068925049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3024764405495296d + "'", double1 == 0.3024764405495296d);
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0115470718397392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15182172134889865d + "'", double1 == 0.15182172134889865d);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 38, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.980489805286518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        double double1 = org.apache.commons.math.util.FastMath.expm1(11.13028260783892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68204.64473888976d + "'", double1 == 68204.64473888976d);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3108324944320862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11754719863773519d + "'", double1 == 0.11754719863773519d);
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.13812313260893225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13725468110322078d + "'", double1 == 0.13725468110322078d);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1209452514271958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.070944752871544d + "'", double1 == 2.070944752871544d);
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6144072740383286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5574077246548148d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4328100205340816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5415833237027999d + "'", double1 == 0.5415833237027999d);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.9337643921132143d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9337643921132143d + "'", double2 == 0.9337643921132143d);
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9944105305785783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005605148959791052d) + "'", double1 == (-0.005605148959791052d));
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6795226183513794d), (-0.2723414711850413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6795226183513794d) + "'", double2 == (-0.6795226183513794d));
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.07642343372489104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.001333840544179023d) + "'", double1 == (-0.001333840544179023d));
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        long long2 = org.apache.commons.math.util.FastMath.min(24L, 2105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        int int2 = org.apache.commons.math.util.FastMath.min(6061, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5514266812417142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812417142d + "'", double1 == 0.5514266812417142d);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.985608890758629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8336085691790922d + "'", double1 == 0.8336085691790922d);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.19006280234111017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.981992372399956d + "'", double1 == 0.981992372399956d);
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(8.142219984546603E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.337865423418791E-5d + "'", double1 == 9.337865423418791E-5d);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 6061);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8384749410913358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1761705835663624d) + "'", double1 == (-0.1761705835663624d));
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2857645798842487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9469359297167088d + "'", double1 == 1.9469359297167088d);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9990920390306268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        float float2 = org.apache.commons.math.util.FastMath.min(145.0f, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.31501331859055964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3204706870687282d + "'", double1 == 0.3204706870687282d);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.342925101645957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.932521081330666d) + "'", double1 == (-0.932521081330666d));
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-7));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7806737720297888d, (-0.77462798227501d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2114236989366154d + "'", double2 == 1.2114236989366154d);
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6065306597126334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5d) + "'", double1 == (-0.5d));
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.574187603328559E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.574187603328559E30d + "'", double1 == 3.574187603328559E30d);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5663169859928074d, 0.2937272068925049d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8461880395534626d + "'", double2 == 0.8461880395534626d);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3139311415550486E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.395778272734467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8737081353760942d + "'", double1 == 0.8737081353760942d);
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        double double1 = org.apache.commons.math.util.FastMath.abs(13.110581167104948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.110581167104948d + "'", double1 == 13.110581167104948d);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.850754361071198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9580038272343695d) + "'", double1 == (-0.9580038272343695d));
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5257228523581828d), 1.1749455142537386d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5263007573504037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1417227752414556d + "'", double1 == 1.1417227752414556d);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.370663976112528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.370663976112529d + "'", double1 == 7.370663976112529d);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6758226352556027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6327472416097215d + "'", double1 == 0.6327472416097215d);
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 31, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.810321840554628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.42944819032518d + "'", double1 == 43.42944819032518d);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-8.70522113787048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.860352936094126d) + "'", double1 == (-2.860352936094126d));
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 301.8275618935516d + "'", double1 == 301.8275618935516d);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9976632019944932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7842283981751023d + "'", double1 == 0.7842283981751023d);
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9961652815068444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.538585403585032d + "'", double1 == 1.538585403585032d);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        long long2 = org.apache.commons.math.util.FastMath.min(8L, 252318064L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8430650369670094d), 3.355404970159796E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8430650369670094d) + "'", double2 == (-0.8430650369670094d));
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.22882280821594225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2308248981974588d + "'", double1 == 0.2308248981974588d);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        double double1 = org.apache.commons.math.util.FastMath.cosh(36.59459942804923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9066329018748125E15d + "'", double1 == 3.9066329018748125E15d);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0863843851210684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4127191608141359d + "'", double1 == 0.4127191608141359d);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6603469013500041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6603469013500042d + "'", double1 == 0.6603469013500042d);
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.028110643220979767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028114346748504045d + "'", double1 == 0.028114346748504045d);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 2405171239L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4051712E9f + "'", float2 == 2.4051712E9f);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9976952979536658d) + "'", double1 == (-0.9976952979536658d));
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4794572327333977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.522279257218709d + "'", double1 == 0.522279257218709d);
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        double double2 = org.apache.commons.math.util.FastMath.min(23.137988217209347d, 0.6987456384434759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6987456384434759d + "'", double2 == 0.6987456384434759d);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        double double2 = org.apache.commons.math.util.FastMath.max(0.015626271752052213d, 0.7019330522792107d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7019330522792107d + "'", double2 == 0.7019330522792107d);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0838677999087907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9560910368101163d + "'", double1 == 1.9560910368101163d);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5779630976207808d, 0.9999979411810735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0059459608296273d + "'", double2 == 1.0059459608296273d);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8347413346163808d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9818490617583829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5220026552323394d + "'", double1 == 1.5220026552323394d);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9234976649034378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0345641983513346d) + "'", double1 == (-0.0345641983513346d));
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.774362643812196d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0130175987600416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5292064628230686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18446612479197164d + "'", double1 == 0.18446612479197164d);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2184249125858764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5419542310290228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6069183803734488d + "'", double1 == 0.6069183803734488d);
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1253169546054925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12564729781709583d + "'", double1 == 0.12564729781709583d);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.6146685600490525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 264.4010323425236d + "'", double1 == 264.4010323425236d);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-88.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.1622776601683795d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5501042757606859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7334337635678283d + "'", double1 == 1.7334337635678283d);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.7092603658226646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.542374748397161d + "'", double1 == 7.542374748397161d);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1478035149914898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13785012906022734d + "'", double1 == 0.13785012906022734d);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999999997709829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806345461026d + "'", double1 == 1.5430806345461026d);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        double double1 = org.apache.commons.math.util.FastMath.exp(5729.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999531967662273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999531967662274d + "'", double1 == 0.9999531967662274d);
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2492450961977028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004350147573099913d + "'", double1 == 0.004350147573099913d);
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.0250132137771875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8541015767011735d + "'", double1 == 3.8541015767011735d);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        long long1 = org.apache.commons.math.util.FastMath.round(1.538659632515502d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0042168243360932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        int int2 = org.apache.commons.math.util.FastMath.min(9, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 9.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.01747865728166002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017478657281660023d + "'", double1 == 0.017478657281660023d);
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.054801661324977324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05480166132497733d + "'", double1 == 0.05480166132497733d);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8344895406930911d, 1.0477128967594869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0477128967594869d + "'", double2 == 1.0477128967594869d);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.1101857890167285d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(8.037623954904806E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.315613681086297E-15d + "'", double1 == 4.315613681086297E-15d);
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.06123047378894542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06314391275900404d + "'", double1 == 0.06314391275900404d);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.13323515056598115d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1322832176161492E13d, 0.00475630033796798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00475630033796798d + "'", double2 == 0.00475630033796798d);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7144972908707885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8673789059065279d + "'", double1 == 0.8673789059065279d);
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.3574902236589466E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019237001957209246d + "'", double1 == 0.019237001957209246d);
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        double double1 = org.apache.commons.math.util.FastMath.atan(2104.863863001364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5703212367226402d + "'", double1 == 1.5703212367226402d);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.018258696658209093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7385302264922817d) + "'", double1 == (-1.7385302264922817d));
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5978220919084257d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6809442969904994d) + "'", double1 == (-0.6809442969904994d));
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0019051692959427317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001905171600991387d + "'", double1 == 0.001905171600991387d);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.3928546462301097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9834418302543224d + "'", double1 == 0.9834418302543224d);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9997860728793259d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        long long1 = org.apache.commons.math.util.FastMath.abs(24L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24L + "'", long1 == 24L);
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, 44.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.14336970329182389d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1428830338846818d) + "'", double1 == (-0.1428830338846818d));
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0000000000000837d, 0.4561916900643846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4561916900643846d + "'", double2 == 0.4561916900643846d);
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        int int2 = org.apache.commons.math.util.FastMath.min(31, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 3374L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3374L + "'", long2 == 3374L);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8421630577599043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5695141467684478d + "'", double1 == 0.5695141467684478d);
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.01570692181693664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015706921816936642d + "'", double1 == 0.015706921816936642d);
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3686181549811498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.092187372480475d + "'", double1 == 2.092187372480475d);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0000000000000282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000284d + "'", double1 == 1.0000000000000284d);
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.07627516821128054d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9980595798433141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5084898581098096d + "'", double1 == 1.5084898581098096d);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 18L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5243548967072378E-29d + "'", double1 == 2.5243548967072378E-29d);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 8L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.22856420083554188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22466546503052987d + "'", double1 == 0.22466546503052987d);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3329726105619924d, 51.75724472303371d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.75724472303371d + "'", double2 == 51.75724472303371d);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        int int1 = org.apache.commons.math.util.FastMath.abs((-7));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 31L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1273944292716545d + "'", double1 == 4.1273944292716545d);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0033681671050402474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0033625075349079095d + "'", double1 == 0.0033625075349079095d);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.030668400526856803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5133088735275844d) + "'", double1 == (-1.5133088735275844d));
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.7496085578759729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6432505387589902d) + "'", double1 == (-0.6432505387589902d));
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.03711407449322506d, (-0.009495102254525043d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8212597519207547d + "'", double2 == 1.8212597519207547d);
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        int int1 = org.apache.commons.math.util.FastMath.round(6061.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6061 + "'", int1 == 6061);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.25533087064513765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0327744053192653d + "'", double1 == 1.0327744053192653d);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 88);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 88.0f + "'", float1 == 88.0f);
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3374L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9634979770895203d), 76.93758070782783d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.012522457881223827d) + "'", double2 == (-0.012522457881223827d));
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        double double2 = org.apache.commons.math.util.FastMath.max(0.19006280234111014d, 1.2584612042072416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2584612042072416d + "'", double2 == 1.2584612042072416d);
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7603734074051981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8357914941303838d) + "'", double1 == (-0.8357914941303838d));
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5114854340796523d, (-88.99999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5114854340796523d + "'", double2 == 0.5114854340796523d);
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2334031175105369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09110504180060894d + "'", double1 == 0.09110504180060894d);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        double double1 = org.apache.commons.math.util.FastMath.asin(4342.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.07657256688026017d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9262856941868183d + "'", double1 == 0.9262856941868183d);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(103.35507978448088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103.35507978448089d + "'", double1 == 103.35507978448089d);
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1820604684682068d, 0.9996157480449777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1820604684682068d + "'", double2 == 1.1820604684682068d);
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        float float2 = org.apache.commons.math.util.FastMath.max(14.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8673445351016575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7144776763732182d + "'", double1 == 0.7144776763732182d);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        int int2 = org.apache.commons.math.util.FastMath.max(88, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2915496650148837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1364636663857246d + "'", double1 == 1.1364636663857246d);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.47516248865385863d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3139311415550486E14d, 0.9999999999675755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3139311415550484E14d + "'", double2 == 1.3139311415550484E14d);
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.205023552180745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.281452070980398d + "'", double1 == 2.281452070980398d);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1553250449256478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7679415450937047d + "'", double1 == 0.7679415450937047d);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.156119580207157E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.156119580207158E36d + "'", double1 == 6.156119580207158E36d);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.027406828344271994d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9867978813066445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.292146020044726d + "'", double1 == 6.292146020044726d);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        double double2 = org.apache.commons.math.util.FastMath.max(5.984477251954342d, 0.7763127943644386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.984477251954342d + "'", double2 == 5.984477251954342d);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4732902162636147E42d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        double double1 = org.apache.commons.math.util.FastMath.ceil(52.38248989944039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5721340827324173d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.151665335034498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8557691903637678d + "'", double1 == 0.8557691903637678d);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1802310322348819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1822214671962744d + "'", double1 == 0.1822214671962744d);
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 573);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 18, (long) 145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.615620091065296d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        long long2 = org.apache.commons.math.util.FastMath.max((-5L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9985923061026828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995305483505298d + "'", double1 == 0.9995305483505298d);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.46611365138537225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5937881252841115d + "'", double1 == 1.5937881252841115d);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.36221796077615454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.16571439123522547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7806397742442083d) + "'", double1 == (-0.7806397742442083d));
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        double double1 = org.apache.commons.math.util.FastMath.floor(416.60399367417324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 416.0d + "'", double1 == 416.0d);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        long long2 = org.apache.commons.math.util.FastMath.max(88L, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88L + "'", long2 == 88L);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999553501771875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999851165042118d + "'", double1 == 0.9999851165042118d);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.0679515313825692E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0679515313825692E-25d + "'", double1 == 2.0679515313825692E-25d);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7593379915389414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8714000180967071d + "'", double1 == 0.8714000180967071d);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9640275800758169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1204413228389418d) + "'", double1 == (-1.1204413228389418d));
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997957889856329d + "'", double1 == 0.9997957889856329d);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.506999785948914d), 1.0000000137312788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9849405581677622d) + "'", double2 == (-0.9849405581677622d));
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        double double2 = org.apache.commons.math.util.FastMath.max(0.02321157975766268d, 1.570784215959328d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570784215959328d + "'", double2 == 1.570784215959328d);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        float float2 = org.apache.commons.math.util.FastMath.max(145.0f, 2105.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2105.0f + "'", float2 == 2105.0f);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5703212366690238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.97277934089915d + "'", double1 == 89.97277934089915d);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7611197186420408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.705758623990155d + "'", double1 == 0.705758623990155d);
    }
}

