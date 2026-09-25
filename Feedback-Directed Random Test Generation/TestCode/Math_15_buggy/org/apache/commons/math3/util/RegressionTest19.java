package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

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
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.03079191E11f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.8517762794017062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.80318589907376d + "'", double1 == 48.80318589907376d);
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(9.256230992860951E225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1368683772161602E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.944289813551192d) + "'", double1 == (-12.944289813551192d));
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.684342E-14f, 4096.000976562497d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6843426E-14f + "'", float2 == 5.6843426E-14f);
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.3312028E-30f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.3312029E-30f + "'", float1 == 1.3312029E-30f);
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(Float.NEGATIVE_INFINITY, (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9526653544745283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-6.053128792867637d), 0.03819718917147717d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.01318058956493249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.8320774294189782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07983625831894747d) + "'", double1 == (-0.07983625831894747d));
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.834060808472666E43d, 3.2829984568665262E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7452873.048310127d) + "'", double2 == (-7452873.048310127d));
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.2261911708835171d), (-1.7209987736895118d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7209987736895118d) + "'", double2 == (-1.7209987736895118d));
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.587997411051078d), 76);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.199856919813021E23d) + "'", double2 == (-1.199856919813021E23d));
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.1934134844133713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2992922151926118d + "'", double1 == 1.2992922151926118d);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8.317617481530967E-11d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34) + "'", int1 == (-34));
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(9.580542411316677E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.580542411316677E-15d + "'", double1 == 9.580542411316677E-15d);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.6437583519585885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.8397558425555166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3738087146062985d + "'", double1 == 1.3738087146062985d);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.39592515018183416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4857581046653368d + "'", double1 == 1.4857581046653368d);
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.7611413249375834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.324722455208063d + "'", double1 == 1.324722455208063d);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.5529523200824553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.592483501642723d) + "'", double1 == (-0.592483501642723d));
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.0038417443621884145d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5746380806071985d + "'", double1 == 1.5746380806071985d);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.9932228461263812d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 3.0092655E-36f, 5.44703591863261E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.009265538105056E-36d + "'", double2 == 3.009265538105056E-36d);
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.092963241182991d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-20), (long) (-11));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-22.4267346769666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8205092196552366E-10d + "'", double1 == 1.8205092196552366E-10d);
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.2844135865397565E222d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(30.829470556638885d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.829470556638885d + "'", double2 == 30.829470556638885d);
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.4874710524825647d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.737125245533627E25d, 89.94404710810622d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.07430835130604421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07430835130604423d + "'", double1 == 0.07430835130604423d);
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.5136814478622124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6714331764108634d + "'", double1 == 1.6714331764108634d);
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        int int2 = org.apache.commons.math3.util.FastMath.min(126, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.2194703520389538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3441430901511383d + "'", double1 == 0.3441430901511383d);
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2863311.3185695773d, 2.723507743E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0010513317874681627d + "'", double2 == 0.0010513317874681627d);
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(51.99999999999999d, (-3.5498905892585824d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-51.99999999999999d) + "'", double2 == (-51.99999999999999d));
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.885315488201766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.885315488201767d + "'", double1 == 4.885315488201767d);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.8643238493907621d, 2.055620329093743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8643238493907622d + "'", double2 == 0.8643238493907622d);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-126.99999f), 58);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.6605256E19f) + "'", float2 == (-3.6605256E19f));
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 12.000003f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 162754.25706486337d + "'", double1 == 162754.25706486337d);
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-100.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.4E-45f, 2979.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8E-45f + "'", float2 == 2.8E-45f);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0384596E34f, (-1.2350186363540905d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0384595E34f + "'", float2 == 1.0384595E34f);
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-3.0948501E26f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        double double2 = org.apache.commons.math3.util.FastMath.min((-3.031835271646539d), (double) 6400L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.031835271646539d) + "'", double2 == (-3.031835271646539d));
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.3906992E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 3.8146977E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707925120971762d + "'", double1 == 1.5707925120971762d);
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-1.2676506E30f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 8192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1023L), (double) (-7));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1022.99994f) + "'", float2 == (-1022.99994f));
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-6912.0f), (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-108.0f) + "'", float2 == (-108.0f));
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.013466130757852076d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(22.41833367832856d, 1.5628821893349888E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.41833367832856d + "'", double2 == 22.41833367832856d);
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.298292365610487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.008726646259971648d), (double) (-1.26765045E30f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008726646259971648d) + "'", double2 == (-0.008726646259971648d));
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-10.01787252709252d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17484485964284932d) + "'", double1 == (-0.17484485964284932d));
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.698515008372825E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.698136709493502E-5d + "'", double1 == 8.698136709493502E-5d);
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.811682183676627d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.634833008701613E30d + "'", double2 == 8.634833008701613E30d);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.5067124930751009d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7972365553517278d) + "'", double1 == (-0.7972365553517278d));
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 2.09E-43f, (double) 2.9999998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.959782925927111E-44d + "'", double2 == 6.959782925927111E-44d);
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-11), (long) 24);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.8058394E32f, (float) 18L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.587997411051078d), 2.6063541659555467d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5879974110510777d) + "'", double2 == (-1.5879974110510777d));
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.010255307790662582d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5875858540125987d) + "'", double1 == (-0.5875858540125987d));
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 12);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.993223037822113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2483666956614294d + "'", double1 == 1.2483666956614294d);
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(8.796093E12f, 99);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 32768.004f, (double) 1.1884224E32f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.8104773809653483d, (-458));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.155306710247183E-267d + "'", double2 == 8.155306710247183E-267d);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 40L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 40.000004f + "'", float1 == 40.000004f);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0349065850398866d + "'", double1 == 0.0349065850398866d);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 83, (double) 1.20892575E24f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83.0d + "'", double2 == 83.0d);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        float float2 = org.apache.commons.math3.util.FastMath.max(1638399.9f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1638399.9f + "'", float2 == 1638399.9f);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        double double1 = org.apache.commons.math3.util.FastMath.signum(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.913811621960548E-34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3834058052359575E-17d + "'", double1 == 1.3834058052359575E-17d);
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        float float2 = org.apache.commons.math3.util.FastMath.min(258047.98f, 16.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.999998f + "'", float2 == 16.999998f);
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9.013560982203286d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.5653799348568223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6008938025796022d + "'", double1 == 0.6008938025796022d);
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.9999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 76.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3264502315156905d + "'", double1 == 1.3264502315156905d);
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.951243865300542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992606286826837d + "'", double1 == 0.9992606286826837d);
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 0.9999999f, (-1.059306170823243d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.059306290032532516d) + "'", double2 == (-0.059306290032532516d));
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1024.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.569820717232144d + "'", double1 == 1.569820717232144d);
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        long long2 = org.apache.commons.math3.util.FastMath.min((-10L), (-18L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.21770527575405668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.473593478439218d + "'", double1 == 12.473593478439218d);
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.021989770635849292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1023.0f, 0.13590897899958626d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1022.99994f + "'", float2 == 1022.99994f);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 96L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.697360918442304d) + "'", double1 == (-4.697360918442304d));
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.09746678486527317d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        int int1 = org.apache.commons.math3.util.FastMath.round((-9.2233709E18f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-2.3768449E32f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.03079223E11f, 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.31941406E13f + "'", float2 == 1.31941406E13f);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-2.09E-43f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        double double1 = org.apache.commons.math3.util.FastMath.log(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.772588722239781d + "'", double1 == 2.772588722239781d);
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 3.051758E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0518047429114125E-5d + "'", double1 == 3.0518047429114125E-5d);
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-14), 1.7125539158461947d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-13.999999f) + "'", float2 == (-13.999999f));
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        float float2 = org.apache.commons.math3.util.FastMath.max((-7.324219E-4f), (-1.0000001f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.324219E-4f) + "'", float2 == (-7.324219E-4f));
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.6643855961249147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.726671451338972d + "'", double1 == 0.726671451338972d);
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.051759E-5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1 == (-15));
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.94875668844129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.082213836220372d + "'", double1 == 18.082213836220372d);
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 32.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.465736141218277d + "'", double1 == 3.465736141218277d);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.3192574118357667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 6L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.5483703652841707d, 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1776163924955435E9d + "'", double2 == 1.1776163924955435E9d);
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        int int2 = org.apache.commons.math3.util.FastMath.min(144, (-106));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106) + "'", int2 == (-106));
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.44491153754783735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560352157149078d + "'", double1 == 1.560352157149078d);
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 95L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9357524720632393d + "'", double1 == 0.9357524720632393d);
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144L + "'", long2 == 144L);
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.8189894E-12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-39) + "'", int1 == (-39));
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.38172089560309924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1031.411577317404d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1031.411577317404d + "'", double2 == 1031.411577317404d);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 144L, 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207031E-4f + "'", float2 == 1.2207031E-4f);
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-7.324219E-4f), 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.942112E28f) + "'", float2 == (-5.942112E28f));
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5628821893349888E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5628821893349888E-18d + "'", double1 == 1.5628821893349888E-18d);
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.0078125f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0078125f + "'", float1 == 0.0078125f);
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7923084696963997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7923084696963997d + "'", double1 == 0.7923084696963997d);
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(15.851614849324065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.981408651385093d + "'", double1 == 3.981408651385093d);
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.12708331911094284d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(75.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.17136825E21f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69 + "'", int1 == 69);
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        long long1 = org.apache.commons.math3.util.FastMath.abs(2147483648L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483648L + "'", long1 == 2147483648L);
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        long long2 = org.apache.commons.math3.util.FastMath.max(40L, 1018L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1018L + "'", long2 == 1018L);
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.264378409705838E7d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.220446E-16f, 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7763568E-15f + "'", float2 == 1.7763568E-15f);
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.552211244862155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.7888705944722437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        int int1 = org.apache.commons.math3.util.FastMath.abs(149);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8375714918828912d, 0.6679190596134986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16965243226939253d + "'", double2 == 0.16965243226939253d);
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        int int1 = org.apache.commons.math3.util.FastMath.round(1024.9999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025 + "'", int1 == 1025);
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0793234388618709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8681756790905404d + "'", double1 == 1.8681756790905404d);
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.3465607551885772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41419541092925727d + "'", double1 == 0.41419541092925727d);
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-15), (float) (-18L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-15.0f) + "'", float2 == (-15.0f));
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        int int2 = org.apache.commons.math3.util.FastMath.max(53248, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53248 + "'", int2 == 53248);
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(39.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3296700211997184E16d + "'", double1 == 4.3296700211997184E16d);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.1606570981826605d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 63.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7993405757504377d + "'", double1 == 1.7993405757504377d);
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-39), (-1.0592232274909887d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5979492216692717d) + "'", double2 == (-1.5979492216692717d));
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.248291097914389d, 0.5481703243545996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.283511171588288d + "'", double2 == 4.283511171588288d);
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-565.8964071679023d), (-17.999999999999996d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-29));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-29) + "'", int1 == (-29));
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 2.772588722239781d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.42073952573286544d, 1.6585072831013276E208d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-553.795452389488d) + "'", double2 == (-553.795452389488d));
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        double double1 = org.apache.commons.math3.util.FastMath.rint(74.20321057778874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.0d + "'", double1 == 74.0d);
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0000038147045416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543085117871802d + "'", double1 == 1.543085117871802d);
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.005575957634910489d), 1.0015484291388311E92d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0015484291388311E92d + "'", double2 == 1.0015484291388311E92d);
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7525836961975957d, (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 125.47820700625542d + "'", double2 == 125.47820700625542d);
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1024, 25L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 22025.998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.41158326382413d + "'", double1 == 148.41158326382413d);
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.6634311403861297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9414422804445914d + "'", double1 == 1.9414422804445914d);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 138L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7430585504480339d, 96);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.151561323845982E-13d + "'", double2 == 4.151561323845982E-13d);
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.0384595E34f, 491);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        long long1 = org.apache.commons.math3.util.FastMath.abs(96L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 96L + "'", long1 == 96L);
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.03079223E11f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(22025.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22025.002f + "'", float1 == 22025.002f);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.154986906341471d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7341433604804716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7341433604804716d + "'", double1 == 0.7341433604804716d);
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        double double2 = org.apache.commons.math3.util.FastMath.min(148.99998474121094d, 1.5707963268805032d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963268805032d + "'", double2 == 1.5707963268805032d);
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(13.394771296627336d, 0.07156993751100402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.394771296627336d + "'", double2 == 13.394771296627336d);
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(30.708115498279298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.169527255817504E13d + "'", double1 == 2.169527255817504E13d);
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        long long2 = org.apache.commons.math3.util.FastMath.max((-13L), (long) 40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-17.999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(22026.004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22026.006f + "'", float1 == 22026.006f);
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        double double1 = org.apache.commons.math3.util.FastMath.floor(793232.1453335404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 793232.0d + "'", double1 == 793232.0d);
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(187.44378450003248d, (-0.4333887434795537d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-187.44378450003248d) + "'", double2 == (-187.44378450003248d));
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.7853981633974482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3246090892520057d + "'", double1 == 1.3246090892520057d);
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-1023L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2863311.3185695773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6405565398607552E8d + "'", double1 == 1.6405565398607552E8d);
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.1321892048529211E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.242248758868847d + "'", double1 == 16.242248758868847d);
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(35.000004f, 10.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0036030562437495d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4773253761765821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.952895810720043E12d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42 + "'", int1 == 42);
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-7.111969304174328E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        long long2 = org.apache.commons.math3.util.FastMath.max(9223372036854775807L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) (-8));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8L) + "'", long2 == (-8L));
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.49018803671909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9967529105736734d + "'", double1 == 0.9967529105736734d);
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-100), 1.1884223E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.4918373962705977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9036622709780766d + "'", double1 == 0.9036622709780766d);
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        long long2 = org.apache.commons.math3.util.FastMath.max(54L, 58L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58L + "'", long2 == 58L);
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.31941406E13f, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9421127E28f + "'", float2 == 5.9421127E28f);
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.4768406791145167d, 15.00237797068112d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.009954090817086d + "'", double2 == 15.009954090817086d);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.06556969098097142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.09966865249116202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09999999999999999d) + "'", double1 == (-0.09999999999999999d));
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        double double1 = org.apache.commons.math3.util.FastMath.signum(10.000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-95) + "'", int2 == (-95));
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(26241.467016991704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        float float2 = org.apache.commons.math3.util.FastMath.min((-4.0f), (-54.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-54.0f) + "'", float2 == (-54.0f));
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(5.545972E30f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.044629E23f + "'", float1 == 6.044629E23f);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-62.999996f), (-127.0d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-63.0f) + "'", float2 == (-63.0f));
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.021989770635849292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02198977063584929d) + "'", double1 == (-0.02198977063584929d));
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.06537329234338425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        int int2 = org.apache.commons.math3.util.FastMath.max((-17), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.6669829823489768d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 54L, (-0.926562324824456d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-54.0d) + "'", double2 == (-54.0d));
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.4576E7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.04399474110473024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04499186500939122d) + "'", double1 == (-0.04499186500939122d));
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9498815455645588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7243954228040914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7243954228040914d + "'", double1 == 0.7243954228040914d);
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.356974989417331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.330816953265807d + "'", double1 == 1.330816953265807d);
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.17603073842084696d, (-19.409313714545853d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.132523506950138d + "'", double2 == 3.132523506950138d);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4096.000976562497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.7144175303058917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.312221877264961d + "'", double1 == 1.312221877264961d);
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.7951117725632785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09957181625497864d) + "'", double1 == (-0.09957181625497864d));
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.108075398769753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.209161426468694d + "'", double1 == 2.209161426468694d);
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.299249233707907E97d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0129469452159566E95d + "'", double1 == 4.0129469452159566E95d);
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-2.600540585471551d), 0.02991027634527111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0016534565670356868d + "'", double2 == 0.0016534565670356868d);
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1018L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 5.9421127E28f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9022368629250546E9d + "'", double1 == 3.9022368629250546E9d);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.526703772217925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.127605173009768d + "'", double1 == 2.127605173009768d);
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        long long2 = org.apache.commons.math3.util.FastMath.max(58L, (-4L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58L + "'", long2 == 58L);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1024.0002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0004f + "'", float1 == 1024.0004f);
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-2.5154934E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.22122547E12f, (-1.557407724654902d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.22122521E12f + "'", float2 == 3.22122521E12f);
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.09252791806716626d, 7.334875669653525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.33545925657672d + "'", double2 == 7.33545925657672d);
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.03521111824852417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03521839462440023d + "'", double1 == 0.03521839462440023d);
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-127.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.562922473770796d) + "'", double1 == (-1.562922473770796d));
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.9073486E-6f, (float) 41L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073486E-6f + "'", float2 == 1.9073486E-6f);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 1, (-41L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41L) + "'", long2 == (-41L));
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(7.62939453139803E-6d, 0.7968076702201445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.62939453139803E-6d + "'", double2 == 7.62939453139803E-6d);
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.807880403871141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6684193266734539d + "'", double1 == 0.6684193266734539d);
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.842171E-14f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.842171E-14f + "'", float2 == 2.842171E-14f);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.844222393007231E-26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.844222393007231E-26d + "'", double1 == 7.844222393007231E-26d);
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 1.03079191E11f, (double) (-0.25f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-3.3990817041746885E-13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3990817041746885E-13d) + "'", double1 == (-3.3990817041746885E-13d));
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.22609662867095306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22609662867095306d + "'", double1 == 0.22609662867095306d);
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        int int1 = org.apache.commons.math3.util.FastMath.round(127.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.238566467956993E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 281.831802351527d + "'", double1 == 281.831802351527d);
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5609003851579142d, 57.29577951308395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02723611438071346d + "'", double2 == 0.02723611438071346d);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-2.14748365E9f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2147483648L) + "'", long1 == (-2147483648L));
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.9376862167110295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1500.0004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0005f + "'", float1 == 1500.0005f);
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.014811373879680489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999890313607141d + "'", double1 == 0.999890313607141d);
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(20.0f, 6400);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.830189170012751E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.12520241624226192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12520241624226192d + "'", double1 == 0.12520241624226192d);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 3, (double) 3.821045E-31f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9999998f + "'", float2 == 2.9999998f);
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.689503773740456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.024980582183254d + "'", double1 == 40.024980582183254d);
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.7544114892259424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013166964401866422d) + "'", double1 == (-0.013166964401866422d));
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.3759503453871893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(57.95729927114847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.752779266353297d + "'", double1 == 4.752779266353297d);
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.8715802485510056E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.980648102686758d + "'", double1 == 3.980648102686758d);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.6378768135265336d, 10.079369200195153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6378768135265338d + "'", double2 == 1.6378768135265338d);
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.7998912382754204d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0294145160673613d) + "'", double1 == (-1.0294145160673613d));
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.36787946309876646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.606530677788656d + "'", double1 == 0.606530677788656d);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 69);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69 + "'", int1 == 69);
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 0.001953125f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.568843200553131d + "'", double1 == 1.568843200553131d);
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0759610632151153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9340794002838225d + "'", double1 == 0.9340794002838225d);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        double double1 = org.apache.commons.math3.util.FastMath.log10(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914822473389d + "'", double1 == 4.041914822473389d);
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-2147483648L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.2156733284569168d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        long long2 = org.apache.commons.math3.util.FastMath.max((-3L), (long) 138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        float float2 = org.apache.commons.math3.util.FastMath.max(7.555788E22f, 22026.006f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.555788E22f + "'", float2 == 7.555788E22f);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(6.830188762901751E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000233258d + "'", double1 == 1.0000000000233258d);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.5474735E-13f, (-5.4470149E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.4470149E9f) + "'", float2 == (-5.4470149E9f));
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 7.3906992E11f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.8414038674724426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5709205366007007d + "'", double1 == 0.5709205366007007d);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (byte) 0, 750);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.4781431851220553E200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.220200232155833d, (double) 54);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 54.01378424630655d + "'", double2 == 54.01378424630655d);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        float float1 = org.apache.commons.math3.util.FastMath.abs(51200.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51200.0f + "'", float1 == 51200.0f);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.2300806254785061E-52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2300806254785061E-52d + "'", double1 == 1.2300806254785061E-52d);
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 32.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.496507792660227d + "'", double1 == 3.496507792660227d);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5707932806215363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334014816258259d + "'", double1 == 1.2334014816258259d);
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 7.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.7430898918006583d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5501637768927253E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 113);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 113L + "'", long1 == 113L);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.7433261306201424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1541500587079068d + "'", double1 == 1.1541500587079068d);
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.159127075050616d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        int int2 = org.apache.commons.math3.util.FastMath.max(41, 6400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6400 + "'", int2 == 6400);
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        double double1 = org.apache.commons.math3.util.FastMath.floor(9.382939107340338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.11031244697810666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        float float1 = org.apache.commons.math3.util.FastMath.abs(96.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 96.99999f + "'", float1 == 96.99999f);
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(567.8714856179881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32536.639431734748d + "'", double1 == 32536.639431734748d);
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.1190346870425511E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        int int2 = org.apache.commons.math3.util.FastMath.max((-3), 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        double double1 = org.apache.commons.math3.util.FastMath.rint(96.99999999999747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 22026.002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22027.0d + "'", double1 == 22027.0d);
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.166540501084165E80d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8912867791060297d + "'", double1 == 0.8912867791060297d);
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        int int2 = org.apache.commons.math3.util.FastMath.min(1023, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1023 + "'", int2 == 1023);
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9426286359925616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9426286359925617d + "'", double1 == 0.9426286359925617d);
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.6843426E-14f, 1499.9999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6843426E-14f + "'", float2 == 5.6843426E-14f);
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.7208914127261735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6696974859049024d) + "'", double1 == (-0.6696974859049024d));
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(127.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3248.7031076979088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.086318919673417d + "'", double1 == 8.086318919673417d);
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.0480573415747148d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.03034029473695931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03034495154245973d + "'", double1 == 0.03034495154245973d);
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 63);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63L + "'", long1 == 63L);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.8207657E-11f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.60978210179491616E17d + "'", double1 == 1.60978210179491616E17d);
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.462542442645822E-32d, (double) 1.9342812E25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2147483648), (-63L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2147483648L) + "'", long2 == (-2147483648L));
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4421.593908697327d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 384L, 3.991490053722689d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5604021957830725d + "'", double2 == 1.5604021957830725d);
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.762747174039086d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        double double1 = org.apache.commons.math3.util.FastMath.log10(168.50112223820605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2266027976716734d + "'", double1 == 2.2266027976716734d);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        double double1 = org.apache.commons.math3.util.FastMath.signum(8.318010277546872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.888867008940965E-111d, 2.935723255711777E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.34872123111099723d) + "'", double2 == (-0.34872123111099723d));
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (-0.24611750286723066d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        double double1 = org.apache.commons.math3.util.FastMath.asin(44051.931612313434d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9999998807907104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999998807907106d + "'", double1 == 0.9999998807907106d);
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 127.00001f, 1.1872174681517649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 314.53759229897486d + "'", double2 == 314.53759229897486d);
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(53247.996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        double double1 = org.apache.commons.math3.util.FastMath.tan(168.50112223820605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.204165904544292d) + "'", double1 == (-2.204165904544292d));
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 41, (double) 7.555787E22f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.18558328626067d + "'", double2 == 14.18558328626067d);
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.0822639194654398E10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.200915490465612E11d) + "'", double1 == (-6.200915490465612E11d));
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(175.00002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-2.4285721902064785d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-139.1469367416738d) + "'", double1 == (-139.1469367416738d));
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.994188727481171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.537679430522236d + "'", double1 == 1.537679430522236d);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9892996786096249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.424375980923104d + "'", double1 == 1.424375980923104d);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6931347588850472d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(12.701625227919099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328280.00000000006d + "'", double1 == 328280.00000000006d);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.03079215E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(23844.919681868952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.772473642504233d + "'", double1 == 10.772473642504233d);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8569259205417066d, 0.9868344195994365d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7150559600227717d + "'", double2 == 0.7150559600227717d);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-2.4338891524382005E32d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.5514298635472507d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.025817018473160622d, 8.124202398230408E-43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.124202398230408E-43d + "'", double2 == 8.124202398230408E-43d);
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        float float1 = org.apache.commons.math3.util.FastMath.signum(127.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.8119200707031418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 1.6827E-41f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6827E-41f + "'", float2 == 1.6827E-41f);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        double double1 = org.apache.commons.math3.util.FastMath.floor(28.03100307406022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.0d + "'", double1 == 28.0d);
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.930495573139114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.623832501180273d + "'", double1 == 2.623832501180273d);
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1008.00006f, 1.192093037616354E-7d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1008.0f + "'", float2 == 1008.0f);
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        int int2 = org.apache.commons.math3.util.FastMath.max(6, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        float float1 = org.apache.commons.math3.util.FastMath.abs(75.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 75.99999f + "'", float1 == 75.99999f);
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.2676505E30f), 127.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2676505E30f + "'", float2 == 1.2676505E30f);
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        float float1 = org.apache.commons.math3.util.FastMath.abs(40.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 40.000004f + "'", float1 == 40.000004f);
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.2675516869730743E40d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5550944478479611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993239821248876d + "'", double1 == 0.9993239821248876d);
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.9238054901410364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34572297664565477d) + "'", double1 == (-0.34572297664565477d));
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7350254851689573d, (double) (-6.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.0d) + "'", double2 == (-6.0d));
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6301286610132414d, (-458));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.267933988921239E91d + "'", double2 == 7.267933988921239E91d);
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.0038417538123018545d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003841734912172606d) + "'", double1 == (-0.003841734912172606d));
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 14);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4994888620096063d + "'", double1 == 1.4994888620096063d);
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-99.99999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-5.0031545098999704E16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(11.527563848906032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999998057705d + "'", double1 == 0.9999999998057705d);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-8L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-7.9999995f) + "'", float1 == (-7.9999995f));
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5380757678599976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49153001315302697d + "'", double1 == 0.49153001315302697d);
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(144.0f, (-13));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.017578125f + "'", float2 == 0.017578125f);
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019686266404607394d + "'", double1 == 0.019686266404607394d);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        int int1 = org.apache.commons.math3.util.FastMath.round(47.5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        int int2 = org.apache.commons.math3.util.FastMath.max((-149), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.693135830384266d + "'", double1 == 5.693135830384266d);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.3933437225722068E-26d, 5.2698187618349674d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3933437225722068E-26d + "'", double2 == 1.3933437225722068E-26d);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        int int2 = org.apache.commons.math3.util.FastMath.min(22026, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.522997974471263E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.223372E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.5325202929210884E272d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.5707952330074615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999994018d + "'", double1 == 0.9999999999994018d);
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        float float2 = org.apache.commons.math3.util.FastMath.max(35.000008f, 1500.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0005f + "'", float2 == 1500.0005f);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.2089257E24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.2057594E16f + "'", float1 == 7.2057594E16f);
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5563207343123242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.011183889850956d + "'", double1 == 1.011183889850956d);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.07726425812829045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        double double2 = org.apache.commons.math3.util.FastMath.log(328280.7253817591d, 0.1629259179658376d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.14285256881990374d) + "'", double2 == (-0.14285256881990374d));
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5442545888816204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4489746992361d + "'", double1 == 2.4489746992361d);
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        double double1 = org.apache.commons.math3.util.FastMath.cos(114898.22225041104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7288670088674518d) + "'", double1 == (-0.7288670088674518d));
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.2743457546915395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2778001951148185d + "'", double1 == 0.2778001951148185d);
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.8620958891185866d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        double double2 = org.apache.commons.math3.util.FastMath.max((-557.1752425929883d), (double) (-61944147371L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-557.1752425929883d) + "'", double2 == (-557.1752425929883d));
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        int int2 = org.apache.commons.math3.util.FastMath.max(35, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.001401979773852388d, (-149));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(458.00003f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 458.00003f + "'", float2 == 458.00003f);
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.248699261236361d, (-3.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0d) + "'", double2 == (-3.0d));
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-127L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(12.125000000000002d, (-0.031149730809723927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.125d + "'", double2 == 12.125d);
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 2979L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2922328441437454d, 1.6354719781306986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6686926171994434d + "'", double2 == 0.6686926171994434d);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.961121328055908E-308d, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.820015239488859d, (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.82001523948886d + "'", double2 == 6.82001523948886d);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        double double1 = org.apache.commons.math3.util.FastMath.signum(8.698515008372825E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.878439647493319E24d), (-61.239152961159384d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 128);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 128.00002f + "'", float1 == 128.00002f);
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(9.580542411316677E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6721200920443286E-16d + "'", double1 == 1.6721200920443286E-16d);
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.857680860275251d, (-0.014503305630723837d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.857680860275251d) + "'", double2 == (-2.857680860275251d));
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.99189285848507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017311796207582646d) + "'", double1 == (-0.017311796207582646d));
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 50.02724142034319d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 9.999998f, 2.9932228461263812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.279961353072454d + "'", double2 == 1.279961353072454d);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1.2169445E35f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 116 + "'", int1 == 116);
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6.709498192047019E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.709499198860319E-4d + "'", double1 == 6.709499198860319E-4d);
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1501.9344625450144d, 1.3108324944320862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.27957607415632646d) + "'", double2 == (-0.27957607415632646d));
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(125.47820700625542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        long long2 = org.apache.commons.math3.util.FastMath.min(8L, (long) 144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 67, (float) 2147483648L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.3852314045529424d, (double) 3.22122547E12f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3003242604215394E-13d + "'", double2 == 4.3003242604215394E-13d);
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9999999995371172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.093347156354074d + "'", double1 == 11.093347156354074d);
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.8360035413770986E37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2848611895569019E18d + "'", double1 == 4.2848611895569019E18d);
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 2.4576E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4576E7d + "'", double1 == 2.4576E7d);
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1024, (double) (-52.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.99994f + "'", float2 == 1023.99994f);
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.008950148660065434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.748066029033894E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.960464477539066E-8d + "'", double1 == 5.960464477539066E-8d);
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1638399.9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.5380757678599976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        int int2 = org.apache.commons.math3.util.FastMath.min(138, 144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 138 + "'", int2 == 138);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        double double1 = org.apache.commons.math3.util.FastMath.signum(13.394771296627336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.3817208956030992d, (double) 10.000002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.568384133256267E-5d + "'", double2 == 6.568384133256267E-5d);
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.2652169031666407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        float float1 = org.apache.commons.math3.util.FastMath.abs(22025.002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22025.002f + "'", float1 == 22025.002f);
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1.1884223E32f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.09E-43f, 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9257799E-24f + "'", float2 == 1.9257799E-24f);
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(8192.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.765625E-4f + "'", float1 == 9.765625E-4f);
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        long long2 = org.apache.commons.math3.util.FastMath.max(187L, (long) 46);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.011298952859326998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011299193276846486d + "'", double1 == 0.011299193276846486d);
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        float float2 = org.apache.commons.math3.util.FastMath.max(128.00002f, 5.9421127E28f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9421127E28f + "'", float2 == 5.9421127E28f);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 5.8207657E-11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.015915272271144E-12d + "'", double1 == 1.015915272271144E-12d);
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.5707963182292441d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 0, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-2.822713036326232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31350285643238496d) + "'", double1 == (-0.31350285643238496d));
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(74.2099485247879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2952079394930578d + "'", double1 == 1.2952079394930578d);
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.60978210179491616E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.206767094421643d + "'", double1 == 17.206767094421643d);
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.009624211171012755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009623914033088175d + "'", double1 == 0.009623914033088175d);
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-5.737022539278999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999792072937623d) + "'", double1 == (-0.9999792072937623d));
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(12.182493960703473d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 128, (float) 11L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11.0f + "'", float2 == 11.0f);
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-22));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1024.999755859375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58728.16001268196d + "'", double1 == 58728.16001268196d);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        int int2 = org.apache.commons.math3.util.FastMath.max(83, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 750L, (-95));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8932662E-26f + "'", float2 == 1.8932662E-26f);
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2979.0000000000005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2980.0d + "'", double1 == 2980.0d);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 35, (float) 1024L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.06037557856845913d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.060375578568459126d) + "'", double1 == (-0.060375578568459126d));
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1023.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-6L), (double) (-16.999998f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.0d) + "'", double2 == (-6.0d));
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.617207988524648d, 2.2873554892516914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3691645859476473d + "'", double2 == 2.3691645859476473d);
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-44.55243935826922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-45.0d) + "'", double1 == (-45.0d));
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.0202514011976098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7954220262240286d + "'", double1 == 0.7954220262240286d);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.816703495911541d, 33);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4195298794937878E10d + "'", double2 == 2.4195298794937878E10d);
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7163235781009699d) + "'", double1 == (-0.7163235781009699d));
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.38874545763980906d), 52.11725091815784d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.11725091815784d + "'", double2 == 52.11725091815784d);
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        int int2 = org.apache.commons.math3.util.FastMath.min(17, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        float float2 = org.apache.commons.math3.util.FastMath.min(32.0f, 9.2233715E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.6854304746023417E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963230710988d + "'", double1 == 1.5707963230710988d);
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        double double1 = org.apache.commons.math3.util.FastMath.log10(22026.001953125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.34293567339809d + "'", double1 == 4.34293567339809d);
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.15719598220151057d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.24611750286723066d), (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.061529375716807666d) + "'", double2 == (-0.061529375716807666d));
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.0836962511904766d, 37.68977774747066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.68977774747066d + "'", double2 == 37.68977774747066d);
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.45737666422341455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007982728712487138d + "'", double1 == 0.007982728712487138d);
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.1568137220942976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(34.13412347087103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.336041713264338E14d + "'", double1 == 3.336041713264338E14d);
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2267.3262397605376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 8);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.8171204965576213d), (-1.2599712366285878d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5571492599290335d) + "'", double2 == (-0.5571492599290335d));
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        double double1 = org.apache.commons.math3.util.FastMath.exp(7.523254369123166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1850.579975336163d + "'", double1 == 1850.579975336163d);
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.5828770266140352d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 22025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570750923843736d + "'", double1 == 1.570750923843736d);
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.5835191503837134d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5835191503837134d + "'", double2 == 3.5835191503837134d);
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        double double1 = org.apache.commons.math3.util.FastMath.floor(106.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 106.0d + "'", double1 == 106.0d);
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9426286359925616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05908288516130279d) + "'", double1 == (-0.05908288516130279d));
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-5.4470149E9f), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.447014911999999E9d) + "'", double2 == (-5.447014911999999E9d));
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-148.99998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-148.99997f) + "'", float1 == (-148.99997f));
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 2147483647, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 83);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        int int2 = org.apache.commons.math3.util.FastMath.min((-149), 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.0592232274909885d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9226369536145702d) + "'", double1 == (-0.9226369536145702d));
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5729.579526593802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.0d + "'", double1 == 5729.0d);
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(9.999999999999998E99d, (-1.199856919813021E23d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-1.6290482690107402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1766428250600236d) + "'", double1 == (-1.1766428250600236d));
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8033776881577706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6659208512998654d + "'", double1 == 0.6659208512998654d);
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-2.0122792E-16f), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0122792E-16f + "'", float2 == 2.0122792E-16f);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.5795230490737015E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.579523046178759E-5d + "'", double1 == 5.579523046178759E-5d);
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.9936026854386584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1058659731351455d + "'", double1 == 1.1058659731351455d);
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.003841734912172606d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        double double1 = org.apache.commons.math3.util.FastMath.asin(18.460482067365035d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 10, (long) (-39));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39L) + "'", long2 == (-39L));
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 0.9999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574073163013131d + "'", double1 == 1.5574073163013131d);
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.918595617854619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.898648165238734d + "'", double1 == 0.898648165238734d);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-2.3509887E-38f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3509887E-38f + "'", float1 == 2.3509887E-38f);
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.8163415799735064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0638840136422847d) + "'", double1 == (-1.0638840136422847d));
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.2582912E8f), (float) 15L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2582912E8f) + "'", float2 == (-1.2582912E8f));
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 9, (float) (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.0f) + "'", float2 == (-8.0f));
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.44839989783648926d, 1.0872902135394655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3911512287148525d + "'", double2 == 0.3911512287148525d);
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        int int2 = org.apache.commons.math3.util.FastMath.max((-63), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        int int2 = org.apache.commons.math3.util.FastMath.min(24, 113);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.068434252532353d, 0.5607823139334169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0684342525323527d + "'", double2 == 1.0684342525323527d);
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.019119947239050028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7185133104815216d) + "'", double1 == (-1.7185133104815216d));
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) '#', 0.3821732683383738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.708526687174765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1954752489985705d + "'", double1 == 1.1954752489985705d);
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-0.001953125f), (-2.0363257828322695E43d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 54.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.3484692283495345d + "'", double1 == 7.3484692283495345d);
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.22759351940662E7d, (double) (-0.001953125f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.22759351940662E7d) + "'", double2 == (-4.22759351940662E7d));
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-108.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-108.0d) + "'", double1 == (-108.0d));
    }
}

