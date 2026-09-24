package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        long long1 = org.apache.commons.math.util.FastMath.round(88.41160108781288d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 88L + "'", long1 == 88L);
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        double double1 = org.apache.commons.math.util.FastMath.log(2.2454561448049524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8089086830966221d + "'", double1 == 0.8089086830966221d);
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.4091896264064065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7556587893900818d) + "'", double1 == (-0.7556587893900818d));
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        double double2 = org.apache.commons.math.util.FastMath.min(13.845300947487887d, 1.1584562587899128d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1584562587899128d + "'", double2 == 1.1584562587899128d);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.822482662536925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-104.42056479913087d) + "'", double1 == (-104.42056479913087d));
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        float float2 = org.apache.commons.math.util.FastMath.min(18.0f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2857111204210793d, 0.009291130834171431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009291130834171431d + "'", double2 == 0.009291130834171431d);
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715201903E-14d + "'", double1 == 1.4210854715201903E-14d);
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 9L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0f + "'", float1 == 9.0f);
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.04749646746707084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0474607997439881d + "'", double1 == 0.0474607997439881d);
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5974781997606962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.566661270303212d + "'", double1 == 0.566661270303212d);
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        long long2 = org.apache.commons.math.util.FastMath.min(31L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 573);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 573 + "'", int2 == 573);
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8758577137362273d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7680930116482992d) + "'", double1 == (-0.7680930116482992d));
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        long long1 = org.apache.commons.math.util.FastMath.round(0.010703413224816612d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.016250113174355E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.40531933496538397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3844911685834901d + "'", double1 == 0.3844911685834901d);
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 18L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9612179885158494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.765626287994698d + "'", double1 == 0.765626287994698d);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.550386653691239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1553250449256478d + "'", double1 == 1.1553250449256478d);
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.7192510249555393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7192510249555397d + "'", double1 == 2.7192510249555397d);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        int int1 = org.apache.commons.math.util.FastMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.3754758794263844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9976632019944932d + "'", double1 == 0.9976632019944932d);
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(32.00000000000003d, 38.45962336030118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.000000000000036d + "'", double2 == 32.000000000000036d);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.02740339846894975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        long long2 = org.apache.commons.math.util.FastMath.min(26L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9763608754884531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.027181157926883755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027177812063052576d + "'", double1 == 0.027177812063052576d);
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.004293648164526892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004293648164526892d + "'", double1 == 0.004293648164526892d);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7805951733159243d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.01654379973059443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8541673877839708d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3875274234338688d + "'", double1 == 1.3875274234338688d);
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.760373407405198d), 1.0470934242082532d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9127535552074842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.491172679433163d + "'", double1 == 2.491172679433163d);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7785713669985503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013588633815877825d + "'", double1 == 0.013588633815877825d);
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0821368667394677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.00187531968229d + "'", double1 == 62.00187531968229d);
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.3250734611491427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.901885733895505d + "'", double1 == 1.901885733895505d);
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 26.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.258096538021482d + "'", double1 == 3.258096538021482d);
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9957890945476039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9985943900355354d + "'", double1 == 0.9985943900355354d);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.4766393240263169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4766393240263169d + "'", double1 == 0.4766393240263169d);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.0794534402614928d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5127742681331149d + "'", double1 == 0.5127742681331149d);
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5619730447758076d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5619730447758073d + "'", double2 == 1.5619730447758073d);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11128.422256815777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.326014307562925d + "'", double1 == 22.326014307562925d);
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2105L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2105.0f + "'", float1 == 2105.0f);
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.12217123753453288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49619950233918614d + "'", double1 == 0.49619950233918614d);
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.730093305612845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6411802376524465d + "'", double1 == 5.6411802376524465d);
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3108324944320862d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        double double1 = org.apache.commons.math.util.FastMath.log(1.378163642309E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.951773034959217d + "'", double1 == 27.951773034959217d);
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7972957247486471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7972957247486472d + "'", double1 == 0.7972957247486472d);
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.532367934462324d, 0.38942345262260686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5323679344623238d + "'", double2 == 1.5323679344623238d);
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1748021039363987d + "'", double1 == 3.1748021039363987d);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7425643308790437d, 0.3976568654895484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7425643308790437d + "'", double2 == 0.7425643308790437d);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6808791884039018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6294764138281497d + "'", double1 == 0.6294764138281497d);
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000000356395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.8634651242655194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.774362643812196d) + "'", double1 == (-1.774362643812196d));
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5542664846177344d + "'", double1 == 0.5542664846177344d);
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.3595791268726303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3595791268726303d + "'", double1 == 2.3595791268726303d);
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.9617267167450815E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8386956415553325d + "'", double1 == 0.8386956415553325d);
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.748066E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.556320495207163d) + "'", double1 == (-2.556320495207163d));
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        int int2 = org.apache.commons.math.util.FastMath.min(26, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.23824322705557036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23824322705557036d + "'", double1 == 0.23824322705557036d);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.119514993737036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0383488944315367d + "'", double1 == 1.0383488944315367d);
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0067668676472898565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000228953362436d + "'", double1 == 1.0000228953362436d);
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.025681666614117072d, 18.949874371066198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.025681666614117075d + "'", double2 == 0.025681666614117075d);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0706683905894867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02965498116117008d + "'", double1 == 0.02965498116117008d);
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8749693034931421d, (-0.02678524629463562d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8749693034931421d + "'", double2 == 0.8749693034931421d);
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        double double1 = org.apache.commons.math.util.FastMath.atan(33.43950032726054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5409004834963647d + "'", double1 == 1.5409004834963647d);
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1488093008679707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9122769076921013d + "'", double1 == 0.9122769076921013d);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.774362643812196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2106375175232338d) + "'", double1 == (-1.2106375175232338d));
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 2.520586644733795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5574077246549025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8772827919571973d, 6.978995704713228E82d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        long long2 = org.apache.commons.math.util.FastMath.min(6061L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        long long1 = org.apache.commons.math.util.FastMath.round(3.1748021039363987d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.1101857890167285d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47941158948737106d) + "'", double1 == (-0.47941158948737106d));
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.39704103087032844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006929673254199679d + "'", double1 == 0.006929673254199679d);
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9910502745590536d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.46376691716139407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5900523133380877d + "'", double1 == 0.5900523133380877d);
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.974903989667673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5993266431154813d + "'", double1 == 0.5993266431154813d);
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0037665865012192047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037665686889649633d + "'", double1 == 0.0037665686889649633d);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.21580950969080773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2125204179373373d + "'", double1 == 0.2125204179373373d);
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.3111051691882221d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3062934652542403d) + "'", double1 == (-0.3062934652542403d));
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.4999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8011436155469335d) + "'", double1 == (-0.8011436155469335d));
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        double double1 = org.apache.commons.math.util.FastMath.cos((-27.288510643477288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5521769452406319d) + "'", double1 == (-0.5521769452406319d));
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2725138805025834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00475626447215646d + "'", double1 == 0.00475626447215646d);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8673445351016575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8079471069956126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.690983863080662d + "'", double1 == 0.690983863080662d);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.11482578710300392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1216780097738317d + "'", double1 == 0.1216780097738317d);
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5836293809324178d, 3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.787062140387918E-4d + "'", double2 == 1.787062140387918E-4d);
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.005282123029073894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005282172155090746d + "'", double1 == 0.005282172155090746d);
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2105, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.49299653486035117d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49299653486035117d + "'", double1 == 0.49299653486035117d);
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04749646746707084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04753223187708361d + "'", double1 == 0.04753223187708361d);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, 21.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.798432482299821E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2177.239621497128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.281317477353221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0398314119215128d + "'", double1 == 1.0398314119215128d);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        double double1 = org.apache.commons.math.util.FastMath.atanh(18.964889726830815d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4515219270969891d, 1.04582714110102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4515219270969891d + "'", double2 == 0.4515219270969891d);
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0461462579250012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018258696658209093d + "'", double1 == 0.018258696658209093d);
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.5605255838238796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9822165519059916d + "'", double1 == 1.9822165519059916d);
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.697765004828061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8384749410913358d + "'", double1 == 0.8384749410913358d);
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6571831014265066E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.70522113787048d) + "'", double1 == (-8.70522113787048d));
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4328100205340815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.190457935876819d + "'", double1 == 4.190457935876819d);
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.14336970329182389d), 1.0470934242082532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.14336970329182389d) + "'", double2 == (-0.14336970329182389d));
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 26, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.18950492734531413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9820976136448372d + "'", double1 == 0.9820976136448372d);
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3131479741286372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.254807234712487d + "'", double1 == 0.254807234712487d);
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999065754719239d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6145485553432246d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0016554297339535329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        double double1 = org.apache.commons.math.util.FastMath.tanh(10.991338187845834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999994323574d + "'", double1 == 0.9999999994323574d);
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.041577875227763905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0424543400597124d + "'", double1 == 1.0424543400597124d);
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.421010862427522E-20d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948948d + "'", double1 == 1.5707963267948948d);
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011915234506d + "'", double1 == 1.1752011915234506d);
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        double double2 = org.apache.commons.math.util.FastMath.max(7.642595581083531E24d, 17.439335651251554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.642595581083531E24d + "'", double2 == 7.642595581083531E24d);
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9996157480449777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6691057363794052E-4d) + "'", double1 == (-1.6691057363794052E-4d));
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        int int2 = org.apache.commons.math.util.FastMath.max(2105, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2105 + "'", int2 == 2105);
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6816339640127264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6375556246283297d + "'", double1 == 0.6375556246283297d);
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04813832110931332d + "'", double1 == 0.04813832110931332d);
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 44L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(116.29021260843672d, 0.4790553853029686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 116.2902126084367d + "'", double2 == 116.2902126084367d);
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.026147060205699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993634612486487d + "'", double1 == 0.9993634612486487d);
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4957913555252836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.406752190668858d + "'", double1 == 28.406752190668858d);
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.5937881252841114d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.12187114015074264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1224799415331224d + "'", double1 == 0.1224799415331224d);
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.01570692181693664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0316603012496908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0104439773554954d + "'", double1 == 1.0104439773554954d);
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-7L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999983369439447d) + "'", double1 == (-0.9999983369439447d));
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        double double1 = org.apache.commons.math.util.FastMath.tan(185.47866641176898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1253502589028981d + "'", double1 == 0.1253502589028981d);
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0000823799461538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017454730321241296d + "'", double1 == 0.017454730321241296d);
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8813735870195252d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        long long1 = org.apache.commons.math.util.FastMath.round(0.13250759287604744d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9992606284658041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.951243718581451d + "'", double1 == 3.951243718581451d);
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.15527491979894661d), 0.8931193992435265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1552749197989466d) + "'", double2 == (-0.1552749197989466d));
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.65292812185E-312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.65292812185E-312d + "'", double1 == 1.65292812185E-312d);
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8009803642025967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9289309427987065d + "'", double1 == 0.9289309427987065d);
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2798386717543342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24673403229618204d + "'", double1 == 0.24673403229618204d);
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.13371050230626771d), 0.02693177575907612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.372037147495056d) + "'", double2 == (-1.372037147495056d));
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5611212455169257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999531967662273d + "'", double1 == 0.9999531967662273d);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-8.271228063367024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1954.8736035001498d) + "'", double1 == (-1954.8736035001498d));
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7876030784130355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10369259505400377d) + "'", double1 == (-0.10369259505400377d));
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.15154642678291888d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        int int2 = org.apache.commons.math.util.FastMath.min(38, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2338357190760914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.01153673179946589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.12186934340514759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12126956628620691d + "'", double1 == 0.12126956628620691d);
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.1425465430742778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1430297799195695d) + "'", double1 == (-0.1430297799195695d));
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4693643970957537d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        long long2 = org.apache.commons.math.util.FastMath.max(97864804714L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 22025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.922505433236944E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9225054330000896E-5d + "'", double1 == 1.9225054330000896E-5d);
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707963129646567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.230532564718819E7d + "'", double1 == 7.230532564718819E7d);
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.565404923404685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999854664199463d + "'", double1 == 0.9999854664199463d);
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.556320495207163d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07758970755368584d + "'", double1 == 0.07758970755368584d);
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        double double2 = org.apache.commons.math.util.FastMath.pow((-4.336729333420862d), 7.7167639596083E91d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-2), (long) 145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.1029120896883755d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6987456384434759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        double double2 = org.apache.commons.math.util.FastMath.min((-2104.9999999999995d), 0.8686709614860095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2104.9999999999995d) + "'", double2 == (-2104.9999999999995d));
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        double double1 = org.apache.commons.math.util.FastMath.log(2.491172679433163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9127535552074844d + "'", double1 == 0.9127535552074844d);
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7607198300261392d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6425066610664365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5710894459602672d + "'", double1 == 0.5710894459602672d);
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7830288330849284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        double double2 = org.apache.commons.math.util.FastMath.min(7.073385839060845E-7d, (-4.943508829600679d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.943508829600679d) + "'", double2 == (-4.943508829600679d));
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-11.38587492474475d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5282953052207049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6380998614296134d) + "'", double1 == (-0.6380998614296134d));
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, (long) 573);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        double double2 = org.apache.commons.math.util.FastMath.max(0.16299078079570548d, (-1.557407724654815d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16299078079570548d + "'", double2 == 0.16299078079570548d);
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.7192510249555393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6490151682005654d + "'", double1 == 1.6490151682005654d);
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.46376691716139407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7740456749600706d + "'", double1 == 0.7740456749600706d);
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9994982660231281d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5316667212195025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7291547992158472d + "'", double1 == 0.7291547992158472d);
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.028815182787626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (-7L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6908159092322977d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.2454561448049524d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.16393750213817188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16248448599366297d + "'", double1 == 0.16248448599366297d);
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.00475626447215646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004756300337967979d + "'", double1 == 0.004756300337967979d);
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 57.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.37265448204541224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3915021340518289d + "'", double1 == 0.3915021340518289d);
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.017450748081259817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017604807315766753d) + "'", double1 == (-0.017604807315766753d));
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        double double2 = org.apache.commons.math.util.FastMath.max((-99.22961058022105d), 1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6929693744344998d + "'", double2 == 1.6929693744344998d);
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6098214429508984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 88L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.477336814478207d + "'", double1 == 4.477336814478207d);
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6961714618132557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2988776555210748d + "'", double1 == 1.2988776555210748d);
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9179836287841473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5042358266723017d + "'", double1 == 1.5042358266723017d);
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) 2105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9999561898404403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41610699968243714d) + "'", double1 == (-0.41610699968243714d));
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        float float2 = org.apache.commons.math.util.FastMath.max(9.7864802E10f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7785713669985503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7022630673105111d + "'", double1 == 0.7022630673105111d);
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7022630673105111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7785713669985503d + "'", double1 == 0.7785713669985503d);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2511212299366168d + "'", double1 == 0.2511212299366168d);
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.064934783641962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0161683420890135d + "'", double1 == 2.0161683420890135d);
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.286032070646461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1340335403533977d + "'", double1 == 1.1340335403533977d);
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0860321793404941d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.3554049701598595E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006948882707861607d + "'", double1 == 0.006948882707861607d);
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        int int2 = org.apache.commons.math.util.FastMath.min(2105, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8108288062597232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.1061285321866012d), 0.048623772378180656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10612853218660119d) + "'", double2 == (-0.10612853218660119d));
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4860487273861172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8841855372283647d + "'", double1 == 0.8841855372283647d);
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.11472999958168163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0020024162435120616d + "'", double1 == 0.0020024162435120616d);
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9634979770895203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9762070212577264E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.702762565175334d + "'", double1 == 26.702762565175334d);
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4537149018123079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45371490181230795d + "'", double1 == 0.45371490181230795d);
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        double double1 = org.apache.commons.math.util.FastMath.sin(3265.0000000000005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7740624720562873d) + "'", double1 == (-0.7740624720562873d));
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3915021340518289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7315511733755106d + "'", double1 == 0.7315511733755106d);
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        double double1 = org.apache.commons.math.util.FastMath.signum(32.000000000000036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6874262672169151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.255946955090421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.127367446610396d + "'", double1 == 2.127367446610396d);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.774362643812196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7743626438121958d) + "'", double1 == (-1.7743626438121958d));
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.3250734611491427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27752572209808707d) + "'", double1 == (-0.27752572209808707d));
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.6146685600490525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7253825588523148d + "'", double1 == 1.7253825588523148d);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5554654490571869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01533027719388377d + "'", double1 == 0.01533027719388377d);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        double double2 = org.apache.commons.math.util.FastMath.max(7.89629601826829E13d, 1.6098214429508984d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.89629601826829E13d + "'", double2 == 7.89629601826829E13d);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999999994323574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557407722710432d + "'", double1 == 1.557407722710432d);
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.368505610608687E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0368744177664E13d + "'", double1 == 7.0368744177664E13d);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1902899496825317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02077447867535781d + "'", double1 == 0.02077447867535781d);
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.920960112236651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.605056010682738d + "'", double1 == 0.605056010682738d);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9990920390306268d, 18.949874371066198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.982933744815721d + "'", double2 == 0.982933744815721d);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.03760197886023983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03760197886023984d + "'", double1 == 0.03760197886023984d);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8334357964461425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6947987431833846d + "'", double1 == 0.6947987431833846d);
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5700990765860825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1434.2051465974755d + "'", double1 == 1434.2051465974755d);
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        double double2 = org.apache.commons.math.util.FastMath.min(0.254807234712487d, 0.9974964160775457d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.254807234712487d + "'", double2 == 0.254807234712487d);
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.660217314678067d), 0.6592827871476782d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7861064069003021d) + "'", double2 == (-0.7861064069003021d));
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.976207021257726E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1322832176218787E13d + "'", double1 == 1.1322832176218787E13d);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7201746613556624d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.04633654665509406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6548885605479215d + "'", double1 == 2.6548885605479215d);
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4537149018123079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4709296116188755d + "'", double1 == 0.4709296116188755d);
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        double double2 = org.apache.commons.math.util.FastMath.min(3.8205576256903795d, 0.07011222389235412d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07011222389235412d + "'", double2 == 0.07011222389235412d);
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.6571830786712632E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5709620451035222d + "'", double1 == 1.5709620451035222d);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.057070660313307785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.057101686238878076d + "'", double1 == 0.057101686238878076d);
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        long long2 = org.apache.commons.math.util.FastMath.min(21L, 6061L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21L + "'", long2 == 21L);
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        int int2 = org.apache.commons.math.util.FastMath.min(38, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9030612511435306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4362355307740595d + "'", double1 == 1.4362355307740595d);
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8998668269691937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7162330197524863d + "'", double1 == 0.7162330197524863d);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        long long1 = org.apache.commons.math.util.FastMath.round(8.479030977575487d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        double double2 = org.apache.commons.math.util.FastMath.max(13.522442286918901d, 0.8550048170562257d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.522442286918901d + "'", double2 == 13.522442286918901d);
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 6061L, 0.21657131639750768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21657131639750768d + "'", double2 == 0.21657131639750768d);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6823165548747481d, 1.1441558259200015E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.6604007228000894d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.002941815253766312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.16354719567405981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1642851984039091d + "'", double1 == 0.1642851984039091d);
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.30264054181560024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30264054181560024d + "'", double1 == 0.30264054181560024d);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.24673403229618204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2492450961977028d + "'", double1 == 0.2492450961977028d);
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        int int2 = org.apache.commons.math.util.FastMath.min(38, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.928898996730949d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.978688344114683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.77462798227501d) + "'", double1 == (-0.77462798227501d));
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4984945046599057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4624424875899187d + "'", double1 == 0.4624424875899187d);
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.71827069403746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.154093508474027d + "'", double1 == 15.154093508474027d);
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(22.62434292201784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.394869275089486d + "'", double1 == 0.394869275089486d);
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.176903375733162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6442070736028715d + "'", double1 == 1.6442070736028715d);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7658368273288395d, 0.01570692181693664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7658368273288395d + "'", double2 == 0.7658368273288395d);
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 145, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 24L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.020573130590485038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0207862162123857d + "'", double1 == 1.0207862162123857d);
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 18.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3141592653589793d + "'", double1 == 0.3141592653589793d);
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2976454463101708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0446244017252841d + "'", double1 == 1.0446244017252841d);
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        double double1 = org.apache.commons.math.util.FastMath.rint((-8.70522113787048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.0d) + "'", double1 == (-9.0d));
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0318224457943772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0180086989750926d + "'", double1 == 0.0180086989750926d);
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5551139947717301d), 1.7048627526623752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7048627526623752d + "'", double2 == 1.7048627526623752d);
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.030307499521499394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.030771446952435d + "'", double1 == 1.030771446952435d);
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3875274234338688d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.65685424949238d + "'", double1 == 5.65685424949238d);
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9408416071039944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9408416071039944d + "'", double1 == 0.9408416071039944d);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.054801661324977324d, 2.7192510249555397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.719319974221618E-4d + "'", double2 == 3.719319974221618E-4d);
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707963263791258d, 1.0142047603949278d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9974761468650803d + "'", double2 == 0.9974761468650803d);
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7972957247486472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9228015395339156d + "'", double1 == 0.9228015395339156d);
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2439775726559248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02171150446381287d + "'", double1 == 0.02171150446381287d);
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2172043679489204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.377731627086182d + "'", double1 == 2.377731627086182d);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2105, (float) (-7L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2915496650148839d, 0.07890198156137432d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2915496650148837d + "'", double2 == 1.2915496650148837d);
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.6449961687907304d), 117.61174253155806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 117.61174253155806d + "'", double2 == 117.61174253155806d);
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2879824694293398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7417984354653467d + "'", double1 == 0.7417984354653467d);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999999999266639d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.278583561895402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0684737276299647d + "'", double1 == 2.0684737276299647d);
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(52.38248989944039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9142469191379081d + "'", double1 == 0.9142469191379081d);
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.02057603387904735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020573130836222826d + "'", double1 == 0.020573130836222826d);
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4917863811300067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2213870726063898d + "'", double1 == 1.2213870726063898d);
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9264927456996488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7009017030407749d) + "'", double1 == (-0.7009017030407749d));
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.12217304763960307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12186934340514748d + "'", double1 == 0.12186934340514748d);
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.8562864467071635E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8562864467071635E-9d + "'", double1 == 5.8562864467071635E-9d);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0980197632589184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09350834225041525d + "'", double1 == 0.09350834225041525d);
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9513433746520442d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8465463163030394d) + "'", double1 == (-0.8465463163030394d));
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4430227241169228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6655995223232382d + "'", double1 == 0.6655995223232382d);
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        double double2 = org.apache.commons.math.util.FastMath.min(0.02567602163380694d, 0.7472606656014572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02567602163380694d + "'", double2 == 0.02567602163380694d);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.982478439757623E7d + "'", double1 == 3.982478439757623E7d);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.02771214322521837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.718403203777176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6575024717937354d + "'", double1 == 1.6575024717937354d);
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        long long2 = org.apache.commons.math.util.FastMath.max(6061L, 252318057L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318057L + "'", long2 == 252318057L);
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.7192510249555397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7192510249555397d + "'", double1 == 2.7192510249555397d);
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.619035187754997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.3961566678666d + "'", double1 == 100.3961566678666d);
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.009972525083085703d, 181.18516357615334d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009972525083085704d + "'", double2 == 0.009972525083085704d);
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.12466504278665175d, 5.205023552180745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.964851878753161E-5d + "'", double2 == 1.964851878753161E-5d);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.5249271018183177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4755806431682656d, 0.42012681275810204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4755806431682656d + "'", double2 == 0.4755806431682656d);
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.16765036534441544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1684368179756126d + "'", double1 == 0.1684368179756126d);
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(22026.465794806703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1262023.5276316945d + "'", double1 == 1262023.5276316945d);
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 32L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.822482662536925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2490375183530201d) + "'", double1 == (-0.2490375183530201d));
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5093497777060075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4201312898382078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0895609743647756d + "'", double1 == 1.0895609743647756d);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.003368179841877693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0033681862103433764d + "'", double1 == 0.0033681862103433764d);
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.954289192030958d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6149142306722746d) + "'", double1 == (-0.6149142306722746d));
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 97864804714L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7864802E10f + "'", float2 == 9.7864802E10f);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.08106152637093929d, 0.0758711123132111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8184602640872807d + "'", double2 == 0.8184602640872807d);
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.027715691434453935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.654592440028928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707963263791258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.405171239038476E9d + "'", double1 == 2.405171239038476E9d);
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8108288062597232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        long long1 = org.apache.commons.math.util.FastMath.round(2.8994170381213606E-4d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0221148043495943E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6755556041877294E-4d + "'", double1 == 4.6755556041877294E-4d);
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999860498800669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.548711073922983d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2214830415908176d) + "'", double1 == (-1.2214830415908176d));
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.257208982583337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.702683232003031d + "'", double1 == 0.702683232003031d);
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4757278705561235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7806437106503584d + "'", double1 == 0.7806437106503584d);
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.998222949887785d + "'", double1 == 2.998222949887785d);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 22025, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.89400457879299d + "'", double1 == 17.89400457879299d);
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8522390299521388d + "'", double1 == 0.8522390299521388d);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3891513396382057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4757278705561234d + "'", double1 == 1.4757278705561234d);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6558995212736551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.027513104308492d + "'", double1 == 1.027513104308492d);
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3142624216984847d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        double double2 = org.apache.commons.math.util.FastMath.pow(45.68168005192165d, (-0.009495102254525043d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9643630888883036d + "'", double2 == 0.9643630888883036d);
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.355404970159922E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.792585752632344E-4d + "'", double1 == 5.792585752632344E-4d);
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(11128.422256815777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 194.22760893365327d + "'", double1 == 194.22760893365327d);
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.02109576457512843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14524381079801105d + "'", double1 == 0.14524381079801105d);
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.281317477353221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.11830415560668d + "'", double1 == 16.11830415560668d);
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.38542049584402066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39566348218648506d + "'", double1 == 0.39566348218648506d);
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        double double2 = org.apache.commons.math.util.FastMath.min(0.02048667164338245d, 0.12126956628620691d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02048667164338245d + "'", double2 == 0.02048667164338245d);
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8384749410913358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2105, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        double double1 = org.apache.commons.math.util.FastMath.ceil(32.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 22025L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22025.0f + "'", float1 == 22025.0f);
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0029216922179651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.786856877513438d + "'", double1 == 0.786856877513438d);
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.678775299712307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5976398958056577d + "'", double1 == 2.5976398958056577d);
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 21L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 21.0f + "'", float1 == 21.0f);
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.760373407405198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9970996906435381d) + "'", double1 == (-0.9970996906435381d));
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.172527850990744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.17597003220072988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5525884268785043E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5401776706283433E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.03905859609139826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.039048665719590016d + "'", double1 == 0.039048665719590016d);
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 52.0f, 1.9828744915858403d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5326825911566597d + "'", double2 == 1.5326825911566597d);
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4800229187927331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6161114410916003d + "'", double1 == 0.6161114410916003d);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1732412164843911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.985031234232907d + "'", double1 == 0.985031234232907d);
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (long) 573);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0052820984669221145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0052960733437533d + "'", double1 == 1.0052960733437533d);
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.949874371066198d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0000228953362436d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.017604807315766753d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5884020436116093d + "'", double1 == 1.5884020436116093d);
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.01654379973059443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5419542310290228d, 2.8210429626092037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8210429626092037d + "'", double2 == 2.8210429626092037d);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6061L, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2567610122556662E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2567610122556662E-9d + "'", double1 == 1.2567610122556662E-9d);
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.3580539237745366E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018324993652862574d + "'", double1 == 0.018324993652862574d);
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        long long2 = org.apache.commons.math.util.FastMath.min(24L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8307.888029396936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.025081067752414d + "'", double1 == 9.025081067752414d);
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        double double2 = org.apache.commons.math.util.FastMath.atan2(185.47866641176898d, 2.4999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5573185038727098d + "'", double2 == 1.5573185038727098d);
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4669214877224426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0849900646947546d + "'", double1 == 1.0849900646947546d);
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.33978118561914555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.516464347103154d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.970233767273539d) + "'", double1 == (-1.970233767273539d));
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3803000710956943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13997351035384709d + "'", double1 == 0.13997351035384709d);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.000044650487358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5292064628230686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42474894910837324d + "'", double1 == 0.42474894910837324d);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.36938946978079723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37835193832455283d + "'", double1 == 0.37835193832455283d);
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6779563950113555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7310973244101043d + "'", double1 == 0.7310973244101043d);
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.41614683654714235d), 0.0758711123132111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4161468365471423d) + "'", double2 == (-0.4161468365471423d));
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9442157056960554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.664858659602866d + "'", double1 == 0.664858659602866d);
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.2654676519986654d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.23688540362855587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        long long2 = org.apache.commons.math.util.FastMath.max(21L, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3940493875124622d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3686181549811496d + "'", double1 == 1.3686181549811496d);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6846624340993608d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.432066880993469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.161972439135291d + "'", double1 == 7.161972439135291d);
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0797696988252599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0797696988252599d + "'", double1 == 1.0797696988252599d);
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6784066528087076d, 0.16571020934276792d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6784066528087076d + "'", double2 == 0.6784066528087076d);
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9163193327076803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5000715031063323d + "'", double1 == 2.5000715031063323d);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8685596202237091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7006415713926705d + "'", double1 == 0.7006415713926705d);
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.784955363521653E-4d, 1.0000446504873581d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.783937610096956E-4d + "'", double2 == 2.783937610096956E-4d);
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        double double1 = org.apache.commons.math.util.FastMath.log(44.3614195558365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7923701627780075d + "'", double1 == 3.7923701627780075d);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.04582714110102d, 0.004293648164526892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0001924087026581d + "'", double2 == 1.0001924087026581d);
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.824846225420026E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.826542996529217E-4d + "'", double1 == 5.826542996529217E-4d);
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.8418176412695313d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        double double1 = org.apache.commons.math.util.FastMath.atan(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5405025668761214d + "'", double1 == 1.5405025668761214d);
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.411320617819579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1588005903371837d + "'", double1 == 0.1588005903371837d);
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.920960112236651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7263513014980092d) + "'", double1 == (-0.7263513014980092d));
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6657142123412991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8030064940059781d + "'", double1 == 0.8030064940059781d);
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.003109141424240039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9532328851516084d, (-0.08489862787744332d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08489862787744332d) + "'", double2 == (-0.08489862787744332d));
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.717906776707044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047436422015804246d + "'", double1 == 0.047436422015804246d);
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        double double1 = org.apache.commons.math.util.FastMath.atan((-35.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5422326689561365d) + "'", double1 == (-1.5422326689561365d));
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3329726105619924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.274123996952347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3153778949771762d + "'", double1 == 1.3153778949771762d);
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6823165548747481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6381195586291716d + "'", double1 == 0.6381195586291716d);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.442682411966751E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9786883441146831d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1171584131235877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.00846211951401d + "'", double1 == 64.00846211951401d);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 22025, (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        float float1 = org.apache.commons.math.util.FastMath.abs(6061.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6061.0f + "'", float1 == 6061.0f);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.201867548519866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020976545894544365d + "'", double1 == 0.020976545894544365d);
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.078927767113337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.078927767113337d + "'", double1 == 0.078927767113337d);
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9763608754884531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9763608754884532d + "'", double1 == 0.9763608754884532d);
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        long long2 = org.apache.commons.math.util.FastMath.min(145L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        double double1 = org.apache.commons.math.util.FastMath.acos(630983.1159256954d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        double double2 = org.apache.commons.math.util.FastMath.max(7.853398979608905d, 2104.8636254562957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2104.8636254562957d + "'", double2 == 2104.8636254562957d);
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.14336970329182389d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.20615494521474886d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        double double1 = org.apache.commons.math.util.FastMath.log1p(15.999999999999993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8332133440562157d + "'", double1 == 2.8332133440562157d);
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8711009277842993d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-95.13395371691644d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        double double1 = org.apache.commons.math.util.FastMath.signum(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999999351508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707849382711037d + "'", double1 == 1.5707849382711037d);
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2576775945507415E26d + "'", double1 == 3.2576775945507415E26d);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9702957262762539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9702957262762538d) + "'", double1 == (-0.9702957262762538d));
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3574158419544757d + "'", double1 == 1.3574158419544757d);
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.17410381825958643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17410381825958643d + "'", double1 == 0.17410381825958643d);
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.009972525083085703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.001194862670967d) + "'", double1 == (-2.001194862670967d));
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9623912578794126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03833419802937044d) + "'", double1 == (-0.03833419802937044d));
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.394869275089486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39486927508948605d + "'", double1 == 0.39486927508948605d);
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.01153673179946589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011536475885345746d + "'", double1 == 0.011536475885345746d);
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0523779637351338d + "'", double1 == 1.0523779637351338d);
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 60.30380470871524d + "'", double1 == 60.30380470871524d);
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7255801160921299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2749864585784243d + "'", double1 == 1.2749864585784243d);
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.047478595403964284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0011273202556092d + "'", double1 == 1.0011273202556092d);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9951355252760118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7595436208289167d + "'", double1 == 0.7595436208289167d);
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.1529211698783688d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.0920461537065214E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000409204699d + "'", double1 == 1.000000409204699d);
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.8962960182679E13d, 3.3553727166518095E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896296018267898E13d + "'", double2 == 7.896296018267898E13d);
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7255801160921299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.57267835069135d + "'", double1 == 41.57267835069135d);
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        double double1 = org.apache.commons.math.util.FastMath.sin((-8.833373523837084d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5575274776122784d) + "'", double1 == (-0.5575274776122784d));
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.983606621708336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.708105081693799d + "'", double1 == 1.708105081693799d);
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.786480471441939E10d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        double double1 = org.apache.commons.math.util.FastMath.signum((-47.82715545863623d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8334357964461425d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5195530114104545d) + "'", double1 == (-0.5195530114104545d));
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        double double2 = org.apache.commons.math.util.FastMath.min(0.16725907543191326d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.819513221744016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.819513221744016d + "'", double1 == 0.819513221744016d);
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        long long1 = org.apache.commons.math.util.FastMath.abs(2105L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2105L + "'", long1 == 2105L);
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.816301153436276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2201014771445793d + "'", double1 == 1.2201014771445793d);
    }
}

