package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.913180823778077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8186321135530451d + "'", double1 == 0.8186321135530451d);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.00597000407914589d), 5.3014591923809045d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.715611538515039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 327.4804184931869d + "'", double1 == 327.4804184931869d);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.6870438843060785d, 4.330733340286331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6870438843060785d + "'", double2 == 0.6870438843060785d);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 149, (float) (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.24126560212316137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2367413102791537d) + "'", double1 == (-0.2367413102791537d));
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.267650449112502E30d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.267650449112502E30d) + "'", double1 == (-1.267650449112502E30d));
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        double double2 = org.apache.commons.math3.util.FastMath.min((-11.0d), 6.691622542798067E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-11.0d) + "'", double2 == (-11.0d));
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-3.6605256E19f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-1.9731728048816333d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2542623146609628d) + "'", double1 == (-1.2542623146609628d));
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.9939386574859939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 750L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 750.0f + "'", float1 == 750.0f);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(62.0f, (-6400.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-62.0f) + "'", float2 == (-62.0f));
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.03079223296E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.21791339488786254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6017664562168987d + "'", double1 == 0.6017664562168987d);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-6L), 0.33667481938672716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.009438404211252d + "'", double2 == 6.009438404211252d);
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 99L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.9342812E25f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 62.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.0d + "'", double1 == 62.0d);
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 13, 91555L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13L + "'", long2 == 13L);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.7763568E-15f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.1175824E-22f + "'", float1 == 2.1175824E-22f);
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.38874545763980906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0765179123853301d + "'", double1 == 1.0765179123853301d);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(12.000003f, 1.7581226356449182d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.000002f + "'", float2 == 12.000002f);
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 26, (-1.3600415E24f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3600415E24f) + "'", float2 == (-1.3600415E24f));
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1982426812833557E29d, 17.159393316255343d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1982426812833556E29d + "'", double2 == 1.1982426812833556E29d);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.801734439119775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        double double2 = org.apache.commons.math3.util.FastMath.max(148.41315910257663d, 0.9235039398260111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.41315910257663d + "'", double2 == 148.41315910257663d);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(15.009954090817086d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        double double1 = org.apache.commons.math3.util.FastMath.abs(7.629394531324017E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629394531324017E-6d + "'", double1 == 7.629394531324017E-6d);
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.2542623146609628d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8494745432493265d) + "'", double1 == (-0.8494745432493265d));
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5635500768149995d, (-15));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012255275299467247d + "'", double2 == 0.0012255275299467247d);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.40737488E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06502175233217634d + "'", double1 == 0.06502175233217634d);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.051759E-5f, (-41));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3877793E-17f + "'", float2 == 1.3877793E-17f);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5942587451767538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9533008284821517d + "'", double1 == 0.9533008284821517d);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(10.000000953674316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.48680089144d + "'", double1 == 22025.48680089144d);
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 116L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        double double1 = org.apache.commons.math3.util.FastMath.log10(101.04822696504081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0045286976033814d + "'", double1 == 2.0045286976033814d);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-5L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.16589945506899414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15349285356613754d + "'", double1 == 0.15349285356613754d);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.38418607523272E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.384186075232765E-7d + "'", double1 == 2.384186075232765E-7d);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.5893322666832159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8027842343104612d + "'", double1 == 1.8027842343104612d);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(32.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        double double2 = org.apache.commons.math3.util.FastMath.log((-5.447014912E9d), (-9.210991634471118E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.9843748f), (float) (-22));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-22.0f) + "'", float2 == (-22.0f));
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.4582582117691621E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002443120063413391d + "'", double1 == 0.002443120063413391d);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-22L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.0000000074505808d, (-1.5698188099996992d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5743991041099696d + "'", double2 == 2.5743991041099696d);
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        float float2 = org.apache.commons.math3.util.FastMath.min(75.99999f, (-3.7252903E-9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.7252903E-9f) + "'", float2 == (-3.7252903E-9f));
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.017459443376353797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017459443376353797d + "'", double1 == 0.017459443376353797d);
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 108L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 108.0f + "'", float2 == 108.0f);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 14L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.2606768457949564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8512506017495485d + "'", double1 == 0.8512506017495485d);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.00140198023312869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.569869589521421d) + "'", double1 == (-6.569869589521421d));
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(8.526779523018799E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 0L, (-12));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(95.0f, 1.0384595E34f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 95.0f + "'", float2 == 95.0f);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.5413248546129181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7182818284590453d + "'", double1 == 0.7182818284590453d);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.151562836514535d + "'", double1 == 1.151562836514535d);
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        long long1 = org.apache.commons.math3.util.FastMath.round(304.1700902674171d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 304L + "'", long1 == 304L);
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.4522069348155952d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007892499912883513d) + "'", double1 == (-0.007892499912883513d));
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.5877813477142805d), 5.820766091346741E-11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5877813477142805d + "'", double2 == 0.5877813477142805d);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9999999999813518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936150257d + "'", double1 == 1.1752011936150257d);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(16.242248758868847d, 128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.526950851786566E39d + "'", double2 == 5.526950851786566E39d);
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.17361906359809906d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.267964697122677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2374130142415542d + "'", double1 == 0.2374130142415542d);
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0823763028977422E-4d, (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.531241880575061E39d + "'", double2 == 4.531241880575061E39d);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(29.0f, 1.1172687352477229d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.999998f + "'", float2 == 28.999998f);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.999999f, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.43597351E11f + "'", float2 == 3.43597351E11f);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.056740745486681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9678245914133579d + "'", double1 == 0.9678245914133579d);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-5.3014591923809045d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-6));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.2684529660545276d, 6.830188762901751E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-50.01790258279686d) + "'", double2 == (-50.01790258279686d));
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.1691263E29f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.8889466E22f + "'", float1 == 1.8889466E22f);
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0817453575253018d, (-1.5549408655424255d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-12.041199826559248d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8086089434116457d + "'", double1 == 1.8086089434116457d);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.1218112307612413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11494454941766914d + "'", double1 == 0.11494454941766914d);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1022.99994f), 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1022.99994f + "'", float2 == 1022.99994f);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9999999f, (-0.18570947431310014d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999998f + "'", float2 == 1.9999998f);
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.002893947719693431d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1855309944438494E-160d + "'", double2 == 1.1855309944438494E-160d);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.267933988921239E91d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.8614109741702d + "'", double1 == 91.8614109741702d);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-48.99628209992639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8551464438796769d) + "'", double1 == (-0.8551464438796769d));
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(415.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.459035925891641d + "'", double1 == 7.459035925891641d);
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.12099404093087916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12861818683351864d + "'", double1 == 0.12861818683351864d);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1024);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.15409628067323952d, 1.1641303166053958d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15409628067323955d + "'", double2 == 0.15409628067323955d);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        long long2 = org.apache.commons.math3.util.FastMath.min(79L, 384L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 79L + "'", long2 == 79L);
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        float float1 = org.apache.commons.math3.util.FastMath.abs(39.999992f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 39.999992f + "'", float1 == 39.999992f);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 1.9014757E33f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.334875669653525d, (-113.22351824030044d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0403690565659729E-98d + "'", double2 == 1.0403690565659729E-98d);
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.2207031E-4f, 1.1920928E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920928E-7f + "'", float2 == 1.1920928E-7f);
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        double double1 = org.apache.commons.math3.util.FastMath.sin(623.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8218521846480703d + "'", double1 == 0.8218521846480703d);
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.63824392687195d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-2.9999998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8184463838374894d) + "'", double1 == (-1.8184463838374894d));
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-4.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        int int1 = org.apache.commons.math3.util.FastMath.abs(69);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69 + "'", int1 == 69);
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        int int2 = org.apache.commons.math3.util.FastMath.min(35, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.02998967538379875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0304438949608627d + "'", double1 == 1.0304438949608627d);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.3552527E-20f, 12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.551115E-17f + "'", float2 == 5.551115E-17f);
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.6670173837384175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2911302737285721d + "'", double1 == 1.2911302737285721d);
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        double double1 = org.apache.commons.math3.util.FastMath.rint(793232.1453335404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 793232.0d + "'", double1 == 793232.0d);
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.7430898918006583d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6876099239101502d) + "'", double1 == (-0.6876099239101502d));
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.9385244584858893E-57d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9385244584858893E-57d + "'", double1 == 1.9385244584858893E-57d);
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.1365081616962985d, 0.6930480294017594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2515494572460245d + "'", double2 == 0.2515494572460245d);
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.23509439727547046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2724666125241785d) + "'", double1 == (-0.2724666125241785d));
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-2.0363257828322695E43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        float float2 = org.apache.commons.math3.util.FastMath.min((-5.877472E-39f), (-6.338253E29f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.338253E29f) + "'", float2 == (-6.338253E29f));
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0000000397364284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000013245476d + "'", double1 == 1.000000013245476d);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        int int1 = org.apache.commons.math3.util.FastMath.abs(86);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86 + "'", int1 == 86);
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9999999958776927d, 1.0592232274909887d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776928d + "'", double2 == 0.9999999958776928d);
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-6912), 5.684342E-14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6912.0f) + "'", float2 == (-6912.0f));
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004921566601151848d + "'", double1 == 0.004921566601151848d);
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7616681427904104d, (-0.4103302129827837d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.058992283175157034d) + "'", double2 == (-0.058992283175157034d));
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-148.99999999999804d), 113);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.7157657780270366E245d) + "'", double2 == (-3.7157657780270366E245d));
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-126.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.9784664215479475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.231644183202217d + "'", double1 == 6.231644183202217d);
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.7430898918006683d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141380652391393d + "'", double1 == 3.141380652391393d);
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.4581006770885607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.756603154603038d + "'", double1 == 31.756603154603038d);
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.7325113393608302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5544560001599241d + "'", double1 == 1.5544560001599241d);
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(32768.0f, 750);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.008022644671146243d, (-1022.9999389648436d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008022644671146243d) + "'", double2 == (-0.008022644671146243d));
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        double double2 = org.apache.commons.math3.util.FastMath.min((-3.527224344196591d), 0.8079404376202444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.527224344196591d) + "'", double2 == (-3.527224344196591d));
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.4711741305367249E20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        double double1 = org.apache.commons.math3.util.FastMath.rint(7.21110307993129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        double double2 = org.apache.commons.math3.util.FastMath.log(6.1013894524176076d, 10.693147180044656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3102468536809848d + "'", double2 == 1.3102468536809848d);
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.733241996798949E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        double double1 = org.apache.commons.math3.util.FastMath.signum(9.215236359557623E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.6290482690107402d), (-1.2077476376787629E7d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6290482690107404d) + "'", double2 == (-1.6290482690107404d));
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.915327333074469E166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7047653076225491d) + "'", double1 == (-0.7047653076225491d));
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.4134023217187222E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.02366983698680812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        int int2 = org.apache.commons.math3.util.FastMath.max((-127), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.10546875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0055669861815735d + "'", double1 == 1.0055669861815735d);
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.40432E16f, (-35));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1572864.1f + "'", float2 == 1572864.1f);
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.600428854878443d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 0, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.739916819407977E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999962464d + "'", double1 == 0.9999999999962464d);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 46, (-1500.0001f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46.0f + "'", float2 == 46.0f);
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.5697684081055558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 7.555787E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.679185841765126d + "'", double1 == 52.679185841765126d);
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0562853121379475E-37d + "'", double1 == 3.0562853121379475E-37d);
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        float float1 = org.apache.commons.math3.util.FastMath.abs(76.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 76.0f + "'", float1 == 76.0f);
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-127.0d) + "'", double1 == (-127.0d));
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.6437583519585885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9036219328226124d + "'", double1 == 0.9036219328226124d);
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.6916735960212525E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.5440211108893698d), 1.727953564802034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8115690688476003d + "'", double2 == 1.8115690688476003d);
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 31.999994f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1638399.9f, 3.9999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1638399.9f + "'", float2 == 1638399.9f);
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        long long2 = org.apache.commons.math3.util.FastMath.max((-61944147371L), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.938917213337377d, 1.169647840508743E306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 46, 0.012128149649440787d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.999996f + "'", float2 == 45.999996f);
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8569259205417066d, 83);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718267637220074E-6d + "'", double2 == 2.718267637220074E-6d);
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        float float2 = org.apache.commons.math3.util.FastMath.min((-22.0f), 3.0517585E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-22.0f) + "'", float2 == (-22.0f));
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.9073486E-6f), 31);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4096.0f) + "'", float2 == (-4096.0f));
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.1415926365136895d, 2.2831781865614684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9423366562086654d + "'", double2 == 0.9423366562086654d);
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.23422432986760747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 8.796093E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.039790063769915E14d + "'", double1 == 5.039790063769915E14d);
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1024.0f, (-4));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 64.0f + "'", float2 == 64.0f);
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(41.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4482172403827303d + "'", double1 == 3.4482172403827303d);
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(10.000002f, (double) 63L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000003f + "'", float2 == 10.000003f);
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        int int2 = org.apache.commons.math3.util.FastMath.max(24, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9522971143772588d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 63, 86);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.874389E27f + "'", float2 == 4.874389E27f);
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        double double1 = org.apache.commons.math3.util.FastMath.exp(31.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9048849665247426E13d + "'", double1 == 2.9048849665247426E13d);
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 126);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 126L + "'", long1 == 126L);
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-5), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1638400.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1638400.1f + "'", float1 == 1638400.1f);
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (-16.42697542794437d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.4043195528445952E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.4043195528445952E16d + "'", double1 == 5.4043195528445952E16d);
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0024151657987541153d, 1.565804732394659d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.07441102552977749d) + "'", double2 == (-0.07441102552977749d));
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.3754263876807227d, 1.5845632502852868E29d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852868E29d + "'", double2 == 1.5845632502852868E29d);
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1023.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.395725598471343E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.395725598471343E-46d + "'", double1 == 2.395725598471343E-46d);
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        int int2 = org.apache.commons.math3.util.FastMath.min((-6912), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6912) + "'", int2 == (-6912));
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(32536.639431734748d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 65073.278863469495d + "'", double2 == 65073.278863469495d);
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 17, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.999998f + "'", float2 == 16.999998f);
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        double double2 = org.apache.commons.math3.util.FastMath.log(79.00000000000001d, 32.57791748631743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7972711424308473d + "'", double2 == 0.7972711424308473d);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        double double2 = org.apache.commons.math3.util.FastMath.max(20.357145936839963d, 15.560636497313808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.357145936839963d + "'", double2 == 20.357145936839963d);
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-54.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 54.0f + "'", float1 == 54.0f);
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.026054000153417d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        int int2 = org.apache.commons.math3.util.FastMath.max(75, 143);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 143 + "'", int2 == 143);
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.10543411299233287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1052397432827234d + "'", double1 == 0.1052397432827234d);
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2.14748352E9f, 143);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.8218158288739401d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.012818474064463535d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012818474064463535d + "'", double1 == 0.012818474064463535d);
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        int int1 = org.apache.commons.math3.util.FastMath.round(4.2949673E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.6780254335288145d, 0.8013707341213301d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6780254335288146d + "'", double2 == 0.6780254335288146d);
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.2904083499766355d), 2.4195298794937878E10d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        double double2 = org.apache.commons.math3.util.FastMath.pow(13.0d, 66);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3133037516798624E73d + "'", double2 == 3.3133037516798624E73d);
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8104874485208914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(6.067122724452812E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.067122724452813E30d + "'", double1 == 6.067122724452813E30d);
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        double double1 = org.apache.commons.math3.util.FastMath.sin(8.108075398769754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9678914919741832d + "'", double1 == 0.9678914919741832d);
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        int int2 = org.apache.commons.math3.util.FastMath.max((-106), 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(29937.07086594976d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29937.070865949758d + "'", double2 == 29937.070865949758d);
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1500);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1500.0d + "'", double1 == 1500.0d);
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.313136558784551E-27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-26.36520679138159d) + "'", double1 == (-26.36520679138159d));
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 5.551115E-17f, 0.9948848769417228d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.722483263067683E-17d + "'", double2 == 6.722483263067683E-17d);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.1052397432827234d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1052397432827234d + "'", double2 == 0.1052397432827234d);
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 718053L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 718053.0d + "'", double1 == 718053.0d);
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(22026.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 187);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.997171023392149d) + "'", double1 == (-0.997171023392149d));
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-96.99999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.26788464966007d) + "'", double1 == (-5.26788464966007d));
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.600540585471551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0000000152308706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        int int2 = org.apache.commons.math3.util.FastMath.max(25, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        int int1 = org.apache.commons.math3.util.FastMath.round((-0.5f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        int int2 = org.apache.commons.math3.util.FastMath.max(144, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 144 + "'", int2 == 144);
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5663168272343027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4487268933470131d + "'", double1 == 0.4487268933470131d);
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1024.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 20);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 86);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 86L + "'", long1 == 86L);
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.09265550807355083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09278814024962281d + "'", double1 == 0.09278814024962281d);
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        double double1 = org.apache.commons.math3.util.FastMath.asin(173888.74338370204d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.2952079394930578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9133151321773836d + "'", double1 == 0.9133151321773836d);
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2147483648), 86L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2147483648L) + "'", long2 == (-2147483648L));
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-9.876755530286335d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.0d) + "'", double1 == (-9.0d));
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.023193359375d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.023195439286575373d) + "'", double1 == (-0.023195439286575373d));
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2267.3262397605376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2267.0d + "'", double1 == 2267.0d);
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        int int2 = org.apache.commons.math3.util.FastMath.max((-127), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 3.0092655E-36f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.366949567869811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9392043273881848d + "'", double1 == 0.9392043273881848d);
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.7285236038432762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7461581536081734d + "'", double1 == 0.7461581536081734d);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0844638552900231E46d, (double) 29.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0d + "'", double2 == 7.0d);
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.203998096309481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8348700487516378d + "'", double1 == 0.8348700487516378d);
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.201867548519866d, (double) (-0.25f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2275934197384542d + "'", double2 == 1.2275934197384542d);
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0644306856851378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 60.98738587397468d + "'", double1 == 60.98738587397468d);
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-458L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 458L + "'", long1 == 458L);
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.027412134624038857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30151872315941486d + "'", double1 == 0.30151872315941486d);
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.8909429718644172d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.770363883878314d + "'", double1 == 3.770363883878314d);
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-6.884109657859856E-33d), (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.94875668844129d, 1.6354719781306986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6354719781306986d + "'", double2 == 1.6354719781306986d);
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.551070328970187E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9383630215740486E10d + "'", double1 == 3.9383630215740486E10d);
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.163085598195192d, 3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1630855981951917d + "'", double2 == 1.1630855981951917d);
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.1961198770301516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1961198770301516d + "'", double1 == 0.1961198770301516d);
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1911036946760945E-44d, 0.9950547536867305d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1911036946760948E-44d + "'", double2 == 1.1911036946760948E-44d);
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0652867919345605E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.003912354567348d) + "'", double1 == (-1.003912354567348d));
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(96.99998474121094d, (double) (-20L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-96.99998474121094d) + "'", double2 == (-96.99998474121094d));
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.228037402771233d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.228037402771233d + "'", double1 == 0.228037402771233d);
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        double double1 = org.apache.commons.math3.util.FastMath.atan(328280.00000000006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707932806148064d + "'", double1 == 1.5707932806148064d);
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(181.97662449228235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 161);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(26338.817682503548d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26338.817682503544d + "'", double2 == 26338.817682503544d);
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 491, 5.30829220390157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.30829220390157d + "'", double2 == 5.30829220390157d);
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.233070557154263E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001736143145873102d + "'", double1 == 0.001736143145873102d);
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-553.795452389488d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6191201596149115E240d) + "'", double1 == (-1.6191201596149115E240d));
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        int int2 = org.apache.commons.math3.util.FastMath.max((-7), 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.46573578359043d, 1.1710282582172556E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.46573578359043d + "'", double2 == 3.46573578359043d);
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-12.125f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-12.124999f) + "'", float1 == (-12.124999f));
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 33, (double) (-105.99999f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.0d + "'", double2 == 33.0d);
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.7563221378721828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8576727667775761d + "'", double1 == 0.8576727667775761d);
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-47.96018124249531d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-47.0d) + "'", double1 == (-47.0d));
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 52.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075713441951059d + "'", double1 == 0.9075713441951059d);
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.357616567889211E-68d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-67.47396890080005d) + "'", double1 == (-67.47396890080005d));
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-5.877472E-39f), (-100.50634118119207d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.877473E-39f) + "'", float2 == (-5.877473E-39f));
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.102527247362364d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.102527247362364d + "'", double2 == 1.102527247362364d);
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.1433134923316977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41458146691468406d + "'", double1 == 0.41458146691468406d);
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 1.570793586881831d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.006715348489118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.956997776853762d) + "'", double1 == (-0.956997776853762d));
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 128.00002f, 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.056489174291305E31d + "'", double2 == 4.056489174291305E31d);
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0678933985571917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.033389277357372d + "'", double1 == 1.033389277357372d);
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.8258287517996786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(97.01118046515612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.7669094215381605E41d + "'", double1 == 6.7669094215381605E41d);
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.4773253761765821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.1374665693876721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.137034025997639d + "'", double1 == 0.137034025997639d);
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        int int2 = org.apache.commons.math3.util.FastMath.min(2, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9494325008304088d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 22, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.999998f + "'", float2 == 21.999998f);
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.023195439286575373d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.9950547536867304d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.540597025349526d) + "'", double1 == (-1.540597025349526d));
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(9.88462260799664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 566.3471575178042d + "'", double1 == 566.3471575178042d);
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.984375f, 4.874389E27f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.874389E27f + "'", float2 == 4.874389E27f);
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.0769187E34f, 0.9767456046870426d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0769186E34f + "'", float2 == 2.0769186E34f);
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.008726646259971648d), (double) 11.999999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.000002219423639d + "'", double2 == 12.000002219423639d);
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        double double2 = org.apache.commons.math3.util.FastMath.pow(11.269427669584644d, (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.200012400024802E-5d + "'", double2 == 6.200012400024802E-5d);
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 15);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        double double2 = org.apache.commons.math3.util.FastMath.min(74.05609214199065d, (-1.4711741305367249E20d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4711741305367249E20d) + "'", double2 == (-1.4711741305367249E20d));
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, (double) (-127.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.08032752400444744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.490382165283795d + "'", double1 == 1.490382165283795d);
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.6831251162316458d, (double) 2.0769186E34f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6831251162316458d + "'", double2 == 1.6831251162316458d);
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.784919058198862E-4d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.392459529099431E-4d + "'", double2 == 2.392459529099431E-4d);
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.7951117725632785d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        double double1 = org.apache.commons.math3.util.FastMath.sin(11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9287285890878588d) + "'", double1 == (-0.9287285890878588d));
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.0405935286659937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.592070846450481d + "'", double1 == 1.592070846450481d);
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-97.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-97.0d) + "'", double1 == (-97.0d));
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9620773500730718d, 0.1374665693876721d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4288718223332764d + "'", double2 == 1.4288718223332764d);
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.7490592358260686d), (double) 984);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 984.0015544744889d + "'", double2 == 984.0015544744889d);
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(914254.422643271d, (-1.7898888675248745E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963269906724d + "'", double2 == 1.5707963269906724d);
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.5664551939031287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.843808572621504d + "'", double1 == 0.843808572621504d);
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.73480027861034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 97, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.1166652089154914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 97, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-0.49999997f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        double double1 = org.apache.commons.math3.util.FastMath.rint(168.50112223820605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 169.0d + "'", double1 == 169.0d);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 2.384186E-7f, 1.8205092196552366E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3841860752327193E-7d + "'", double2 == 2.3841860752327193E-7d);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 182L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-127), 61944147371L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.0799873446393424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2764982708919297d + "'", double1 == 1.2764982708919297d);
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        double double1 = org.apache.commons.math3.util.FastMath.acos(11.747717109465404d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9369601382566869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5522112448621552d + "'", double1 == 2.5522112448621552d);
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.3611831E21f, 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.8556837405048565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9250780513669907d + "'", double1 == 1.9250780513669907d);
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.403548280338642E98d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.37713172319331E100d + "'", double1 == 1.37713172319331E100d);
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        double double2 = org.apache.commons.math3.util.FastMath.min(6.930495573139114d, 0.8643238493907621d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8643238493907621d + "'", double2 == 0.8643238493907621d);
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 26, (-40));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3646862E-11f + "'", float2 == 2.3646862E-11f);
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 40.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6888795494813635d + "'", double1 == 3.6888795494813635d);
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9930314120465302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.4293757289532156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3015313102593261d) + "'", double1 == (-0.3015313102593261d));
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        double double2 = org.apache.commons.math3.util.FastMath.min((-108.0d), (-0.031006365979496693d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-108.0d) + "'", double2 == (-108.0d));
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.7563221378721827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1304263795315541d + "'", double1 == 1.1304263795315541d);
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        long long2 = org.apache.commons.math3.util.FastMath.min(144L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7992353978425616d, (-0.1758471462676247d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1758471462676247d) + "'", double2 == (-0.1758471462676247d));
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        int int1 = org.apache.commons.math3.util.FastMath.round(99.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        double double1 = org.apache.commons.math3.util.FastMath.sin(9.256230992860951E225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6436869811735894d + "'", double1 == 0.6436869811735894d);
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.3560551570236352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.2479614275509088d, 0.6128962765107444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2479614275509088d + "'", double2 == 1.2479614275509088d);
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        double double1 = org.apache.commons.math3.util.FastMath.acos(42.80412134742886d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.699650102470575E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.699650124418027E-5d + "'", double1 == 8.699650124418027E-5d);
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 14L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.062797777951831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8944577215482257d + "'", double1 == 2.8944577215482257d);
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(6.771877497737997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11819155887724292d + "'", double1 == 0.11819155887724292d);
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        int int2 = org.apache.commons.math3.util.FastMath.max(1018, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1018 + "'", int2 == 1018);
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        int int2 = org.apache.commons.math3.util.FastMath.min((-22), 187);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-2.14748365E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.09265550807355083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.8715802485510056E20d, 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        float float1 = org.apache.commons.math3.util.FastMath.abs(186.99998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 186.99998f + "'", float1 == 186.99998f);
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(11.0f, 5.269871691676145d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.999999f + "'", float2 == 10.999999f);
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-5137.518865003625d), (-100.31218449629624d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5137.518865003625d) + "'", double2 == (-5137.518865003625d));
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 2.3509887E-38f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.350988701644575E-38d + "'", double1 == 2.350988701644575E-38d);
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.9950547536867305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0000000000000013d) + "'", double1 == (-3.0000000000000013d));
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        long long2 = org.apache.commons.math3.util.FastMath.max(175L, (long) 126);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 175L + "'", long2 == 175L);
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-81920.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.169216851771277d + "'", double1 == 0.169216851771277d);
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 3.7252903E-9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.725290298461914E-9d + "'", double1 == 3.725290298461914E-9d);
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.009265538105056E-36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.9999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.545160918273219d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.081639652707737E-39d + "'", double2 == 9.081639652707737E-39d);
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0830799868521925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6461571458981297d + "'", double1 == 1.6461571458981297d);
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.135904E-25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.135904E-25f + "'", float1 == 4.135904E-25f);
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.6684525369475158d, (double) 22026.006f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22026.00586951821d + "'", double2 == 22026.00586951821d);
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 83, (long) 14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.017453292649980457d, 0.8427442981938755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8429250082674102d + "'", double2 == 0.8429250082674102d);
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(7.3906992E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.3906998E11f + "'", float1 == 7.3906998E11f);
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0113951599323715E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.730328834639913d + "'", double1 == 23.730328834639913d);
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-4L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.543945381313508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2644447065243008d) + "'", double1 == (-0.2644447065243008d));
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5701296602269954d + "'", double1 == 1.5701296602269954d);
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 1.2032471075153308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.1761948595190557E-53d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.5023810222358853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.357639544160998d + "'", double1 == 1.357639544160998d);
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        float float2 = org.apache.commons.math3.util.FastMath.max((-253.99998f), 5.8207657E-11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8207657E-11f + "'", float2 == 5.8207657E-11f);
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        double double1 = org.apache.commons.math3.util.FastMath.asin(6.691673596021348E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 3.22122547E12f, 0.010613255021887393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004164223810019321d + "'", double2 == 0.004164223810019321d);
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.186033145648624d, 2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.186033145648624d + "'", double2 == 4.186033145648624d);
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.9073486E-6f), (-0.02691254625951396d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9073489E-6f) + "'", float2 == (-1.9073489E-6f));
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        long long2 = org.apache.commons.math3.util.FastMath.min(22025L, 15L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        long long1 = org.apache.commons.math3.util.FastMath.round((-9.235280381378423d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9L) + "'", long1 == (-9L));
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.05448754828505034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        int int1 = org.apache.commons.math3.util.FastMath.round(131072.02f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 131072 + "'", int1 == 131072);
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 108L, 39);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9373628E13f + "'", float2 == 5.9373628E13f);
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.8944577215482257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05051781730078976d + "'", double1 == 0.05051781730078976d);
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.620414103520911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.427374327749687d + "'", double1 == 2.427374327749687d);
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.439626979519121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.346194491624951d + "'", double1 == 1.346194491624951d);
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.22011573792157446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22189751789242057d) + "'", double1 == (-0.22189751789242057d));
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        float float2 = org.apache.commons.math3.util.FastMath.max(8.544922E-4f, (float) 25);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 25.0f + "'", float2 == 25.0f);
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.2676506E30f, 13.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5.960464477539066E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000596046466d + "'", double1 == 1.0000000596046466d);
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 26, (-127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.6077746776921858E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6077746776921858E-13d + "'", double1 == 1.6077746776921858E-13d);
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.1114538964707412d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        long long1 = org.apache.commons.math3.util.FastMath.round((-17.0d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-17L) + "'", long1 == (-17L));
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(187.00002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 53248.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        long long1 = org.apache.commons.math3.util.FastMath.abs(388L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 388L + "'", long1 == 388L);
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(21.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22.0f + "'", float1 == 22.0f);
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-1.6784668E-4f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5709641734753723d + "'", double1 == 1.5709641734753723d);
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-2.778726E7d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-5.586233872033443d), 2.056740745486681d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0000000000000042E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.729577951308256E11d + "'", double1 == 5.729577951308256E11d);
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.8996937401571152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2384957783517165d + "'", double1 == 1.2384957783517165d);
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.031640086111471344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-40), (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-40L) + "'", long2 == (-40L));
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-29), 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-232.0f) + "'", float2 == (-232.0f));
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.778726E7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.5873617956816182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010251397235070448d + "'", double1 == 0.010251397235070448d);
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.05944444878960272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2258886956728559d) + "'", double1 == (-1.2258886956728559d));
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-4096.0f), 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4095.9998f) + "'", float2 == (-4095.9998f));
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.7874442638649422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.974164550546483d + "'", double1 == 5.974164550546483d);
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (-0.7285236038432762d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.5258789E-5f, (double) 4.135904E-25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        long long2 = org.apache.commons.math3.util.FastMath.min(40L, 182L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.03034029473695931d, 1.2992733051078518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030340294736959313d + "'", double2 == 0.030340294736959313d);
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-232.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9921249019112125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-12.124999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        double double1 = org.apache.commons.math3.util.FastMath.exp(84.31756151648315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1557718229979847E36d + "'", double1 == 4.1557718229979847E36d);
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-24));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8844991406148166d) + "'", double1 == (-2.8844991406148166d));
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.0801551973528744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-5));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.358015285337246d, 2.0122276272436452E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3580152853372461d + "'", double2 == 0.3580152853372461d);
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.1758471462676247d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 3.7252903E-9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.725290298461914E-9d + "'", double1 == 3.725290298461914E-9d);
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0652867919345605E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7057249105116804d + "'", double1 == 0.7057249105116804d);
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(30.999998f, 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8592452E20f + "'", float2 == 2.8592452E20f);
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 30.999998f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        double double1 = org.apache.commons.math3.util.FastMath.abs(8.419503680225981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.419503680225981d + "'", double1 == 8.419503680225981d);
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.07333574898527641d, (-13));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.952117796054249E-6d + "'", double2 == 8.952117796054249E-6d);
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9056071494359416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09914967686921636d) + "'", double1 == (-0.09914967686921636d));
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.0013810679320049757d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0130295945424814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.753931685773291d + "'", double1 == 2.753931685773291d);
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 131072, 1023L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023L + "'", long2 == 1023L);
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.7208914127261735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9876883405951378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 144, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-127L), 1.3552527E-20f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 108);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 108L + "'", long1 == 108L);
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.012793491209214d, 0.7175316273126001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0127934912092138d + "'", double2 == 1.0127934912092138d);
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.76837158203125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.32237840649762E-9d + "'", double1 == 8.32237840649762E-9d);
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(10.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000003f + "'", float1 == 10.000003f);
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        int int2 = org.apache.commons.math3.util.FastMath.max(9, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 458L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.8200151728564355d + "'", double1 == 6.8200151728564355d);
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.233403117511217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6705961048799894d + "'", double1 == 0.6705961048799894d);
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 161, (double) 1.8932662E-26f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 160.99998f + "'", float2 == 160.99998f);
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.5797630631386922E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5849394142282115E-26d + "'", double1 == 2.5849394142282115E-26d);
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 22026.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.289692630402075d) + "'", double1 == (-0.289692630402075d));
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.2126246307186003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 149, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 144.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6629726422063325d + "'", double1 == 5.6629726422063325d);
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.149868789856197E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998844882860455d + "'", double1 == 0.9998844882860455d);
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.954325598830174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999865362645369d + "'", double1 == 0.9999865362645369d);
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.9282756958820966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9754963752176558d) + "'", double1 == (-0.9754963752176558d));
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5258789061907882E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.641979420594022d, 1.015245761474795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6419794205940221d + "'", double2 == 0.6419794205940221d);
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 127.0f, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.464389127721526E-37d + "'", double2 == 7.464389127721526E-37d);
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.6448115121396387E-46d, (double) 3.051758E-5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.996802415464811d + "'", double2 == 0.996802415464811d);
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.2913289205442933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9118636975894872d + "'", double1 == 0.9118636975894872d);
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.9936026854386584d, (double) (-17.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9936026854386584d + "'", double2 == 1.9936026854386584d);
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.5782710483547281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9541884483339822d + "'", double1 == 0.9541884483339822d);
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.20945043706303793d, 74.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2053004562929438E-51d + "'", double2 == 1.2053004562929438E-51d);
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(749.9999389648436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 749.9999389648438d + "'", double1 == 749.9999389648438d);
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.027442878410953393d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027442878410953393d + "'", double2 == 0.027442878410953393d);
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.9843749f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.39932547317763495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0069695442940340335d + "'", double1 == 0.0069695442940340335d);
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.5574077246549023d), 1.5596953038813823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.557407724654902d) + "'", double2 == (-1.557407724654902d));
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 304L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.410172176795911d + "'", double1 == 6.410172176795911d);
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(99.99999f, (-17));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.629394E-4f + "'", float2 == 7.629394E-4f);
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 10.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276837460536d + "'", double1 == 1.4711276837460536d);
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(108.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6953127273165528d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-22));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 148.99998f, (double) 62.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.464442797840452E134d + "'", double2 == 5.464442797840452E134d);
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.00597000407914589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5767663663373794d + "'", double1 == 1.5767663663373794d);
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 749.99994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.313219861265277d + "'", double1 == 7.313219861265277d);
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        double double1 = org.apache.commons.math3.util.FastMath.rint(181.97662449228235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 182.0d + "'", double1 == 182.0d);
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
        double double1 = org.apache.commons.math3.util.FastMath.log(56.01144166945411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.025555985391541d + "'", double1 == 4.025555985391541d);
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        int int1 = org.apache.commons.math3.util.FastMath.round(100.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(63.07639343095502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.2076840865971654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8039504859800864d + "'", double1 == 0.8039504859800864d);
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.16125382097679095d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(18.693147178468404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6205879640050878d + "'", double1 == 3.6205879640050878d);
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 2.462542442645822E-32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.629394531175987E-6d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1 == (-18));
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.049807115302692835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04982773148197581d + "'", double1 == 0.04982773148197581d);
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(7.653953283385728E122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(8.561990438708674E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4943492367974013E48d + "'", double1 == 1.4943492367974013E48d);
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.1578293055013132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.38418579101567E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.384185791015647E-7d + "'", double1 == 2.384185791015647E-7d);
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5628918379719732d, 1.5462971792701188d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9760945433092127d + "'", double2 == 0.9760945433092127d);
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(10.424132284821418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33661.24913793864d + "'", double1 == 33661.24913793864d);
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9289897956534603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07365752445525607d) + "'", double1 == (-0.07365752445525607d));
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.998223140086234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000001907348631d + "'", double1 == 10.000001907348631d);
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.201966968334231E246d, (-0.5904105265143091d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.201966968334231E246d + "'", double2 == 4.201966968334231E246d);
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.7208914127261735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6174611607194466d) + "'", double1 == (-0.6174611607194466d));
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9950547536867304d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-458.00003f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-459.0d) + "'", double1 == (-459.0d));
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0029911026661902144d, 20.500218349388472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002991102666190215d + "'", double2 == 0.002991102666190215d);
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.02134620319296122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0002278388466086d + "'", double1 == 1.0002278388466086d);
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 15L, (-58));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.204170427930421E-17d + "'", double2 == 5.204170427930421E-17d);
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(9.754473730996652E91d, 14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5981729760864915E96d + "'", double2 == 1.5981729760864915E96d);
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.9257799E-24f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.9520523170857447d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.0725440480531385d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0842023E-19f, 3.0518047429114125E-5d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842024E-19f + "'", float2 == 1.0842024E-19f);
    }
}

