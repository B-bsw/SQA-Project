package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.37076031045626007d, 2.395725598471343E-46d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.8768045251087089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.23719874670144d + "'", double1 == 50.23719874670144d);
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.7103239887280342E-12d, 5.3554640413010734E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3554640413010734E-8d + "'", double2 == 5.3554640413010734E-8d);
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.5404161777443722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6047432792246682d + "'", double1 == 0.6047432792246682d);
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-149.0f), 100.00371790007361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-48.99628209992639d) + "'", double2 == (-48.99628209992639d));
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.560487413648653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99999999999747d + "'", double1 == 96.99999999999747d);
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        double double1 = org.apache.commons.math3.util.FastMath.exp(44.55243935826922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2329477897752064E19d + "'", double1 == 2.2329477897752064E19d);
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        double double2 = org.apache.commons.math3.util.FastMath.max(35.00000381469727d, 0.21987391348109833d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000381469727d + "'", double2 == 35.00000381469727d);
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.081221371125345d, 23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9069942.243593039d + "'", double2 == 9069942.243593039d);
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1023.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.99994f + "'", float1 == 1023.99994f);
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-1023L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5698188099996992d) + "'", double1 == (-1.5698188099996992d));
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.5614902362389387d, 1.522697550491263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5614902362389388d + "'", double2 == 0.5614902362389388d);
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.0024151657987541153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002415168146714362d + "'", double1 == 0.002415168146714362d);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.313136558784551E-27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.9709157047357585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9709157047357585d + "'", double1 == 0.9709157047357585d);
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 9.2233709E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        int int2 = org.apache.commons.math3.util.FastMath.max((-149), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.8360035413770986E37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8360035413770988E37d + "'", double1 == 1.8360035413770988E37d);
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.562922473770796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-6), (-7.111969304174328E-6d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.9999995f) + "'", float2 == (-5.9999995f));
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.2699847631416846E296d, 1.0000001192092898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2699847631416846E296d + "'", double2 == 3.2699847631416846E296d);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(32.0f, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.09951163E12f + "'", float2 == 1.09951163E12f);
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7276.5644352935615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(8.915327333074469E166d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(52.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.00001f + "'", float1 == 52.00001f);
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.552211244862155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9141496005314748d + "'", double1 == 0.9141496005314748d);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        double double2 = org.apache.commons.math3.util.FastMath.log(104.9952379872535d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.7456418720467646d), 138.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7456418720467646d + "'", double2 == 1.7456418720467646d);
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.38905609893065d + "'", double1 == 6.38905609893065d);
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.9999999f, 1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.0517585E-5f, 2.687883945229643d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.051759E-5f + "'", float2 == 3.051759E-5f);
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(8.389966244511489E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4643253509790913E95d + "'", double1 == 1.4643253509790913E95d);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.620414103520911d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.0038417443621884145d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0038417538123018545d) + "'", double1 == (-0.0038417538123018545d));
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 22025.998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 4L, (-41));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8189894E-12f + "'", float2 == 1.8189894E-12f);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        int int2 = org.apache.commons.math3.util.FastMath.min(149, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        double double1 = org.apache.commons.math3.util.FastMath.rint(96.99999237060545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(31.999996f, (double) 5.4470154E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.999998f + "'", float2 == 31.999998f);
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-41));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5628821893349888E-18d + "'", double1 == 1.5628821893349888E-18d);
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0842023E-19f, 1.3351068943768114d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842024E-19f + "'", float2 == 1.0842024E-19f);
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2872214.977727966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.563741239878231d + "'", double1 == 15.563741239878231d);
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        long long2 = org.apache.commons.math3.util.FastMath.min((-9223372036854775808L), (long) 53248);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9223372036854775808L) + "'", long2 == (-9223372036854775808L));
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.933345970255334E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.933345970255334E-13d + "'", double1 == 4.933345970255334E-13d);
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        float float2 = org.apache.commons.math3.util.FastMath.max(106.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 106.0f + "'", float2 == 106.0f);
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.361831799193183E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.8813735448726939d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(11883.891508581362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.6536436208636119d), 38.72983776538828d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 38.73535314562644d + "'", double2 == 38.73535314562644d);
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.7615941559557649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 15L, 1018);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        double double2 = org.apache.commons.math3.util.FastMath.pow(22025.0d, 6.709498192047019E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.006732012348487d + "'", double2 == 1.006732012348487d);
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(52.0d, 0.16295463120745166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999999999999d + "'", double2 == 51.99999999999999d);
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.6677388851171007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.231345238091908d + "'", double1 == 1.231345238091908d);
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.5483703652841707d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.27418518264208536d + "'", double2 == 0.27418518264208536d);
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 14);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        double double1 = org.apache.commons.math3.util.FastMath.floor(114.59156861177442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.0d + "'", double1 == 114.0d);
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(9.999998092651369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.423782697402d + "'", double1 == 22025.423782697402d);
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-2.3768449E32f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-458), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.8058397E32f) + "'", float2 == (-5.8058397E32f));
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 0, 0.9169927026825043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) 0, (-1.26765045E30f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.26765045E30f) + "'", float2 == (-1.26765045E30f));
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.99189285848507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7520476545250374d) + "'", double1 == (-2.7520476545250374d));
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        long long1 = org.apache.commons.math3.util.FastMath.round(53247.99609375001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53248L + "'", long1 == 53248L);
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.6634567844538422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0962012461388824d + "'", double1 == 1.0962012461388824d);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 58);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 58 + "'", int1 == 58);
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.401298464324817E-45d, 5.447015485737373E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5725986423097538E-55d + "'", double2 == 2.5725986423097538E-55d);
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-5.4470154E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 512.0f + "'", float1 == 512.0f);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.8146977E-6f, (-2.09E-43f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146977E-6f + "'", float2 == 3.8146977E-6f);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.23208856521353044d), (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.07975889918023E10d) + "'", double2 == (-6.07975889918023E10d));
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.14725614967358547d, (-44.55243935826922d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14725614967358547d + "'", double2 == 0.14725614967358547d);
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.000000337174845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001685874083d + "'", double1 == 1.0000001685874083d);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.272273108766264d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.993222750278501d, 1.4055329035376677E27d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.993222750278501d + "'", double2 == 2.993222750278501d);
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.0482393344835197d, 9.999998092651367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2958765778522976d + "'", double2 == 0.2958765778522976d);
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.5145744929332654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5653799348568223d + "'", double1 == 0.5653799348568223d);
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        double double1 = org.apache.commons.math3.util.FastMath.atan(101.04822696504083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5609003851579142d + "'", double1 == 1.5609003851579142d);
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        double double1 = org.apache.commons.math3.util.FastMath.sin(89.54726317526658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999295221303693d + "'", double1 == 0.9999295221303693d);
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 35.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3527200899882d + "'", double1 == 2005.3527200899882d);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        double double2 = org.apache.commons.math3.util.FastMath.log(101.00000000000001d, 1.2599960997248316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05007640096477724d + "'", double2 == 0.05007640096477724d);
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6795276293349446d, 458);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4153401004382837E-77d + "'", double2 == 1.4153401004382837E-77d);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-3.49391564547484d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3450790354940288d + "'", double1 == 0.3450790354940288d);
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.8429167374147226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07421532248940557d) + "'", double1 == (-0.07421532248940557d));
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 18L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 18.000002f + "'", float1 == 18.000002f);
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8886109.520507872d + "'", double1 == 8886109.520507872d);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.051759E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.6379788E-12f + "'", float1 == 3.6379788E-12f);
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        int int2 = org.apache.commons.math3.util.FastMath.min(25, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(10.000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932228461263812d + "'", double1 == 2.9932228461263812d);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.4016131876221174d), 9.673635772608993E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4016131876221174d) + "'", double2 == (-0.4016131876221174d));
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8256645486206606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7525836961975957d + "'", double1 == 0.7525836961975957d);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-1018.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.806179973983887d + "'", double1 == 3.806179973983887d);
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 1.6061400801265278d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6061400801265278d + "'", double2 == 1.6061400801265278d);
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.2722218725854067E-14d, 25);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2688682312579694E-7d + "'", double2 == 4.2688682312579694E-7d);
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-9.876755530286335d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-565.8964071679023d) + "'", double1 == (-565.8964071679023d));
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.003173546455298d, 58);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.008007012061949E27d + "'", double2 == 5.008007012061949E27d);
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-18), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.0f) + "'", float2 == (-9.0f));
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1024);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.7561974449853123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.13970367520817575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9500520559216498d), 2.9831006351425686d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 18);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 18.0f + "'", float1 == 18.0f);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.2688682312579694E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000004268869143d + "'", double1 == 1.0000004268869143d);
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 31.999998f, (-1.4942208E7d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2599712366285878d) + "'", double1 == (-1.2599712366285878d));
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 10.000001f, 99.99999237060545d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000953674316d + "'", double2 == 10.000000953674316d);
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.1727481272914977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17361906359809906d + "'", double1 == 0.17361906359809906d);
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2147483647, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.1962369316816621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8049881677891615d + "'", double1 == 1.8049881677891615d);
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.015179338053620484d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015179338053620482d) + "'", double1 == (-0.015179338053620482d));
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        long long2 = org.apache.commons.math3.util.FastMath.min(750L, (long) 1018);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5698197646053376d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.3779429792974384E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3779429792974384E10d + "'", double1 == 2.3779429792974384E10d);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        int int2 = org.apache.commons.math3.util.FastMath.max((-17), 144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 144 + "'", int2 == 144);
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.824212550988658E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6262347243376027d + "'", double1 == 0.6262347243376027d);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5707963268805032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963268805032d + "'", double1 == 1.5707963268805032d);
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-2.667490975180856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.236605282015445d + "'", double1 == 7.236605282015445d);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.025822755842440984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.587997411051078d) + "'", double1 == (-1.587997411051078d));
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.7103239887280342E-12d, 92.11639988914972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16693720083014163d) + "'", double2 == (-0.16693720083014163d));
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.5788897342925496d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(750.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.3450790354940288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2184733349098498d + "'", double1 == 1.2184733349098498d);
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.06434163106438166d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.09966865249116202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.001739546146996826d) + "'", double1 == (-0.001739546146996826d));
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 22026);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22026L + "'", long1 == 22026L);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0036030562437495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0011995791823076d + "'", double1 == 1.0011995791823076d);
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1018.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-1018.0f), 1.5845632502852868E29d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1018.0d + "'", double2 == 1018.0d);
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.4391749470972324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(7.629394531250002E-6d, 2.153330206915566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.629394531250002E-6d + "'", double2 == 7.629394531250002E-6d);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.7182818284590458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1977461928657025d + "'", double1 == 1.1977461928657025d);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.50292279378833d + "'", double1 == 71.50292279378833d);
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        double double1 = org.apache.commons.math3.util.FastMath.tan(43.134641898419105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1329639571222294d) + "'", double1 == (-1.1329639571222294d));
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.913120061551325d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        double double2 = org.apache.commons.math3.util.FastMath.min((-57.29577951308232d), 2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-57.29577951308232d) + "'", double2 == (-57.29577951308232d));
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 138L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 138 + "'", int1 == 138);
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.0562853E-37f, (double) (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.056285E-37f + "'", float2 == 3.056285E-37f);
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.006506382083938511d, 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.169647840508743E306d + "'", double2 == 1.169647840508743E306d);
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 58, 1.3197768247158532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.548045480055047d + "'", double2 == 1.548045480055047d);
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.233403117511217d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, 458);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 458 + "'", int2 == 458);
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.7721795659792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.089969389957473d + "'", double1 == 13.089969389957473d);
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1025L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        int int1 = org.apache.commons.math3.util.FastMath.abs(106);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        double double2 = org.apache.commons.math3.util.FastMath.log((-5137.518865003625d), 6.472984194686474E-35d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.24364487601066484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0298285346991745d + "'", double1 == 1.0298285346991745d);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.8457801672828005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3795085488311785d + "'", double1 == 1.3795085488311785d);
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-3));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.9999998f) + "'", float1 == (-2.9999998f));
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.027415567780803778d, 3.948163070152176E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.704462930760254d) + "'", double2 == (-8.704462930760254d));
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453291188362752d + "'", double1 == 1.7453291188362752d);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.3779429792974384E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5.049999527931213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.00799074830248d + "'", double1 == 78.00799074830248d);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        long long1 = org.apache.commons.math3.util.FastMath.round(187.44378450003248d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 187L + "'", long1 == 187L);
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9075712776160786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5135741754193315d + "'", double1 == 1.5135741754193315d);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-2.5385093188471615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04430534570644151d) + "'", double1 == (-0.04430534570644151d));
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 99);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1.9843749f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.035211118248524166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0358383700995653d + "'", double1 == 1.0358383700995653d);
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        float float2 = org.apache.commons.math3.util.FastMath.min(1500.0004f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(42.333333333333336d, (double) (-5.8058397E32f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 99);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0E100d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000038147045416d + "'", double1 == 1.0000038147045416d);
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1.09951163E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.419034402957756d + "'", double1 == 28.419034402957756d);
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.9998646693394199d), 0.33749774856093107d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9998646693394199d) + "'", double2 == (-0.9998646693394199d));
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        int int2 = org.apache.commons.math3.util.FastMath.max(3, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.2999252260795204d, (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4161468365471424d) + "'", double2 == (-0.4161468365471424d));
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.564085018163574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2506338465608444d + "'", double1 == 1.2506338465608444d);
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        double double1 = org.apache.commons.math3.util.FastMath.abs(74.20321057778875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20321057778875d + "'", double1 == 74.20321057778875d);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.4942208E7d), 5.447015423999999E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.44703591863261E9d + "'", double2 == 5.44703591863261E9d);
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 750L, (-18.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-750.0f) + "'", float2 == (-750.0f));
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6780254335288145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01183377622733977d + "'", double1 == 0.01183377622733977d);
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        double double1 = org.apache.commons.math3.util.FastMath.atan(85943.66926962348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707846912665506d + "'", double1 == 1.5707846912665506d);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1884223E32f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-4.0d), (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25d) + "'", double2 == (-0.25d));
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1500.0004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0004f + "'", float1 == 1500.0004f);
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.8991879649199075d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-54.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3093.9720937064453d) + "'", double1 == (-3093.9720937064453d));
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.951243865300542d, 4.5849675565215335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 544.5092619083326d + "'", double2 == 544.5092619083326d);
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 3.9443043E-31f, (-5.447015424E9d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.944304291006189E-31d) + "'", double2 == (-3.944304291006189E-31d));
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(9.5367431640625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.6077344731494023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.267964697122677d + "'", double1 == 1.267964697122677d);
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.01745329147964599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9826981349689595d + "'", double1 == 0.9826981349689595d);
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.025819886105840354d, (double) 75L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.025819886105840354d + "'", double2 == 0.025819886105840354d);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.449489742783178d + "'", double1 == 2.449489742783178d);
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.24E-44f, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.842171E-14f + "'", float2 == 2.842171E-14f);
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5373482451913212d, 2.0626820368470065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4280173086891232d + "'", double2 == 2.4280173086891232d);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1029.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(105.68838516781345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 106.0d + "'", double1 == 106.0d);
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.000897785780501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4421.593908697327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-6L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1024.9999f, (double) 4096.001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.9843749f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.9843748f) + "'", float1 == (-1.9843748f));
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.9611213280559075E-308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.961121328055908E-308d + "'", double1 == 1.961121328055908E-308d);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9679911994835083d, 114.59155902616463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 114.59155902616463d + "'", double2 == 114.59155902616463d);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1662430606729808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8230640525110062d + "'", double1 == 0.8230640525110062d);
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(18629.058771181848d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 5.684342E-14f, 22025.998046875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5807420276636606E-18d + "'", double2 == 2.5807420276636606E-18d);
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.7208914127261735d), (-2.600540585471551d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.05553124655104E14d, (-0.031634807252392476d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.05553124655104E14d) + "'", double2 == (-1.05553124655104E14d));
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.6080833035834922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4750429751260321d + "'", double1 == 0.4750429751260321d);
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-16.42697542794437d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6809493.145514925d) + "'", double1 == (-6809493.145514925d));
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 53248L, 63.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53248.0f + "'", float2 == 53248.0f);
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        int int2 = org.apache.commons.math3.util.FastMath.min(144, 53248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 144 + "'", int2 == 144);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.649558242894909d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.649558242894909d + "'", double2 == 2.649558242894909d);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(148.41315910257663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.006715348489118d + "'", double1 == 5.006715348489118d);
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.8146977E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5474735E-13f + "'", float1 == 4.5474735E-13f);
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.4302079958348105E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.9709157047357585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5645439425056553d + "'", double1 == 0.5645439425056553d);
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-2147483648));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9921249019112125d, (-0.6578630036664289d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1563151184255194d + "'", double2 == 2.1563151184255194d);
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.8851621707325812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.235329763979993d + "'", double1 == 1.235329763979993d);
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 7, (float) 12L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0817453575253018d, (-1.2599712366285878d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9057397565936123d + "'", double2 == 0.9057397565936123d);
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.2178216919163152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0678933985571917d + "'", double1 == 1.0678933985571917d);
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2676506E30f + "'", float2 == 1.2676506E30f);
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1023);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-106));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 106L + "'", long1 == 106L);
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        float float1 = org.apache.commons.math3.util.FastMath.signum(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        int int2 = org.apache.commons.math3.util.FastMath.max(23, 53248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53248 + "'", int2 == 53248);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-5.877472E-39f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8390715290764524d), (double) 9.094948E-13f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.9998646693394199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1749923782830711d) + "'", double1 == (-1.1749923782830711d));
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.07545690704752087d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07552869653363556d) + "'", double1 == (-0.07552869653363556d));
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32L, (-54.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-149), (-2.0363257828322695E43d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-149.00002f) + "'", float2 == (-149.00002f));
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.0f), (-54.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.2599712366285878d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        long long2 = org.apache.commons.math3.util.FastMath.max(3L, 138L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5707963267889127d, 22025.423782697402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.14423310405345d + "'", double2 == 22.14423310405345d);
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.8731400784750731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.02724142034319d + "'", double1 == 50.02724142034319d);
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        float float1 = org.apache.commons.math3.util.FastMath.abs(11.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11.999999f + "'", float1 == 11.999999f);
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-1.1274099260468922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4290008686463924d + "'", double1 == 0.4290008686463924d);
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.1585290151921035d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.212020862233431E-18d + "'", double1 == 6.212020862233431E-18d);
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9999999999998966d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.0786305240141214d, (-0.07421532248940557d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.2938915700029449d, 0.6413706132531851d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4296721313153656d + "'", double2 == 0.4296721313153656d);
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.03079207E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.03079207E11f + "'", float1 == 1.03079207E11f);
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.5807420276636606E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5807420276636606E-18d + "'", double1 == 2.5807420276636606E-18d);
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) ' ', 1500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(75.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 75.000015f + "'", float1 == 75.000015f);
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(192.21717495245434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5060119336077023E83d + "'", double1 == 1.5060119336077023E83d);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(56.68269625798027d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1025);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025 + "'", int1 == 1025);
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8517762794017062d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0785812159379906E-5d + "'", double2 == 4.0785812159379906E-5d);
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-10L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-9.999999f) + "'", float1 == (-9.999999f));
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.3931722845112914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(22.48528964305201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8055136416358946d + "'", double1 == 3.8055136416358946d);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 750L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0d + "'", double1 == 750.0d);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        float float2 = org.apache.commons.math3.util.FastMath.min(22025.998f, (float) 138L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.0f, 6400.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0000005f + "'", float2 == 7.0000005f);
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-17L), (float) (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-17.0f) + "'", float2 == (-17.0f));
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        long long2 = org.apache.commons.math3.util.FastMath.min(15L, (-18L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.317766226323982d, 750);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.7332419967990015E32d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.094948E-13f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-1L), (-0.032630847141665004d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.9342813E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.035952442790704d) + "'", double1 == (-1.035952442790704d));
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-149));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1024.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.629395E-6f + "'", float1 == 7.629395E-6f);
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        double double2 = org.apache.commons.math3.util.FastMath.max(7.263102496115639E31d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.263102496115639E31d + "'", double2 == 7.263102496115639E31d);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        long long2 = org.apache.commons.math3.util.FastMath.min((-10L), (long) 99);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(328280.7253817591d, 0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 328280.72538175905d + "'", double2 == 328280.72538175905d);
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.361831799193183E34d, 3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3618317991931828E34d + "'", double2 == 1.3618317991931828E34d);
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.5574077842595472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5319611009760749d + "'", double1 == 0.5319611009760749d);
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.384185791015625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999716d + "'", double1 == 0.9999999999999716d);
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        double double1 = org.apache.commons.math3.util.FastMath.acos(908.3976140407738d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(631011.7625152355d, (-0.5063590621241333d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 631011.7625152353d + "'", double2 == 631011.7625152353d);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-18));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-1023L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1022.99994f) + "'", float1 == (-1022.99994f));
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.564085018163574d), 1.4153401004382837E-77d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.564085018163574d + "'", double2 == 1.564085018163574d);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.292518830274316E33d, (-56.83127452036154d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(328281.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328281.00000000006d + "'", double1 == 328281.00000000006d);
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        float float1 = org.apache.commons.math3.util.FastMath.abs(12.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.000002f + "'", float1 == 12.000002f);
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.9843749f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.984375f + "'", float1 == 1.984375f);
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-10.579878738885967d), 4.034665567835052E197d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.579878738885967d + "'", double2 == 10.579878738885967d);
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 3050885.6675126073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3050885.6675126073d + "'", double2 == 3050885.6675126073d);
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 15, (long) 1023);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.013362476578269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7920349615599266d + "'", double1 == 0.7920349615599266d);
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.999999940395355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5704510598095374d) + "'", double1 == (-1.5704510598095374d));
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.5481985207131723d, 1.6698790550935152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5481703243545996d + "'", double2 == 0.5481703243545996d);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(52.00001f, 0.017612750376510982d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000008f + "'", float2 == 52.000008f);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.3283064365386964E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.195160378451156d + "'", double1 == 52.195160378451156d);
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(97.0f, (-0.4040823497388352d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.153770189511292E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.153770189511292E-18d + "'", double1 == 3.153770189511292E-18d);
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1023), 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        int int2 = org.apache.commons.math3.util.FastMath.max((-127), (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 35.000008f, 1.076985968228509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.000007629394524d + "'", double2 == 35.000007629394524d);
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.05553124655104E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.05553124655104E14d) + "'", double1 == (-1.05553124655104E14d));
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.15782930550131322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15653171911551872d + "'", double1 == 0.15653171911551872d);
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-5.8058397E32f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.8058397E32f + "'", float1 == 5.8058397E32f);
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.172561628611239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.0038417443621884145d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0038417349122005003d) + "'", double1 == (-0.0038417349122005003d));
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-63), 32.000008f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000008f + "'", float2 == 32.000008f);
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        double double1 = org.apache.commons.math3.util.FastMath.exp(97.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192043076E42d + "'", double1 == 1.3383347192043076E42d);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.7945743751980148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.36787946309876646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.194068795155346d + "'", double1 == 1.194068795155346d);
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-58), (-2147483648));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        float float1 = org.apache.commons.math3.util.FastMath.abs(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.010723761948906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.052547042514038377d + "'", double1 == 0.052547042514038377d);
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.027181892591221314d), 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1674533972268024E8d) + "'", double2 == (-1.1674533972268024E8d));
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7616681427904104d, 9069942.243593039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7616681427904104d + "'", double2 == 0.7616681427904104d);
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.031139661750354587d), 18);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.5796654013055405E-28d + "'", double2 == 7.5796654013055405E-28d);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(9.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-106L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-106.0d) + "'", double1 == (-106.0d));
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.7181765752430962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 2, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 52.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7325113393608302d + "'", double1 == 3.7325113393608302d);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.288774100786787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.86283941997888d + "'", double1 == 9.86283941997888d);
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-3.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1529215E18f, (-1.2261911708835171d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.15292144E18f + "'", float2 == 1.15292144E18f);
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.031139661750354587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031149730809723927d) + "'", double1 == (-0.031149730809723927d));
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1143659906583754d + "'", double1 == 1.1143659906583754d);
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 17);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.0d + "'", double1 == 17.0d);
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2456317406686555d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 'a', (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        float float2 = org.apache.commons.math3.util.FastMath.max((-2.0f), (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.012849789557351726d), 0.6677388851171007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.012849789557351724d) + "'", double2 == (-0.012849789557351724d));
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-9.999999f), 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 4294967296L, 3.66366424019851E116d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.66366424019851E116d + "'", double2 == 3.66366424019851E116d);
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 79L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 79.00001f + "'", float1 == 79.00001f);
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        double double1 = org.apache.commons.math3.util.FastMath.sin(9.506835355571496E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5877852480805601d + "'", double1 == 0.5877852480805601d);
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.038197183512634486d, 0.07726425812829045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03819718351263449d + "'", double2 == 0.03819718351263449d);
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 53248);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53248.0f + "'", float1 == 53248.0f);
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.961121328055908E-308d, 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.7005101697610547d, (double) 144L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 144.0d + "'", double2 == 144.0d);
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4095.9998f, (double) 22026.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 14.0f, (double) 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6071863961886731E72d + "'", double2 == 1.6071863961886731E72d);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.192093E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 138L, 1.9999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        double double2 = org.apache.commons.math3.util.FastMath.pow(18128.263951029265d, (double) 127.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.15349285356613754d, 7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15349285356613754d + "'", double2 == 0.15349285356613754d);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        double double1 = org.apache.commons.math3.util.FastMath.acos(8.453021129808693E148d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.269984763141685E296d, 1.1743590056195488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.842171E-14f + "'", float1 == 2.842171E-14f);
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5707886974003653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707886974003655d + "'", double1 == 1.5707886974003655d);
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 75L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        double double1 = org.apache.commons.math3.util.FastMath.log10(11883.891508581362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.074958678352131d + "'", double1 == 4.074958678352131d);
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 31.999996f, 1.3076604860118306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3076604860118306d + "'", double2 == 1.3076604860118306d);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-1023));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1023L + "'", long1 == 1023L);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-1.26765045E30f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1606570981826605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06470393174263801d + "'", double1 == 0.06470393174263801d);
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2979.38053468028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.70926996097583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999951358629069d) + "'", double1 == (-0.9999951358629069d));
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4430227241169226d + "'", double1 == 0.4430227241169226d);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 5L, (double) (-1018.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.0d) + "'", double2 == (-5.0d));
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.570796326794893d, 0.27666287087872976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948928d + "'", double2 == 1.5707963267948928d);
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        int int2 = org.apache.commons.math3.util.FastMath.min(458, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        double double1 = org.apache.commons.math3.util.FastMath.atan(328281.00000000006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707932806240856d + "'", double1 == 1.5707932806240856d);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237368419565787d + "'", double1 == 0.7237368419565787d);
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        int int1 = org.apache.commons.math3.util.FastMath.round((-4.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-106));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.4223192764501157E45d) + "'", double1 == (-5.4223192764501157E45d));
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        float float2 = org.apache.commons.math3.util.FastMath.min((-9.2233715E18f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.2233715E18f) + "'", float2 == (-9.2233715E18f));
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.5796654013055405E-28d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4526698300124393E-4d + "'", double1 == 3.4526698300124393E-4d);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(25.75100659895216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44943985085450217d + "'", double1 == 0.44943985085450217d);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.9914900537226896d, 0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.991490053722689d + "'", double2 == 3.991490053722689d);
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2872214.977727966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2405994964072952d + "'", double1 == 0.2405994964072952d);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.954325598830174d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.2689031827977141E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6469779601696886E-23d + "'", double1 == 2.6469779601696886E-23d);
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(55.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.694785265142018E23d + "'", double1 == 7.694785265142018E23d);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.1622776601683795d, 4.505395525898652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9333634218998555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.3710953E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 75L, 1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.99999999999999d + "'", double2 == 74.99999999999999d);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.355327355879784E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.9238054901410364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 110.22593518917809d + "'", double1 == 110.22593518917809d);
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.1826881112499317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1826881112499317d + "'", double1 == 3.1826881112499317d);
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 32L, 12.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.000002f + "'", float2 == 12.000002f);
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.17702174851391653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42073952573286544d + "'", double1 == 0.42073952573286544d);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(18.000002f, (-17));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3732912E-4f + "'", float2 == 1.3732912E-4f);
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        float float2 = org.apache.commons.math3.util.FastMath.max((-97.0f), (float) 53248L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53248.0f + "'", float2 == 53248.0f);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.09246595244807976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0042780229528336d + "'", double1 == 1.0042780229528336d);
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3050885.6675126073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.62408966978161d + "'", double1 == 15.62408966978161d);
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(9.094948E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.094949E-13f + "'", float1 == 9.094949E-13f);
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066029033894E7d + "'", double1 == 3.748066029033894E7d);
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.014609506662591821d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01471727643514217d) + "'", double1 == (-0.01471727643514217d));
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.666666172839648E-4d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2863311.3185695773d + "'", double2 == 2863311.3185695773d);
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1024.0000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.10876056725620209d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.194508866842774d + "'", double2 == 9.194508866842774d);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-2.822713036326232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.6795276293349446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7778696553673483d + "'", double1 == 0.7778696553673483d);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        int int1 = org.apache.commons.math3.util.FastMath.round(22026.002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22026 + "'", int1 == 22026);
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.0139170048883013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7923084696963997d + "'", double1 == 0.7923084696963997d);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.2374576517016327E-71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2374576517016327E-71d + "'", double1 == 3.2374576517016327E-71d);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5609003851579142d, 0.41032129904824216d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0006493254743547d) + "'", double2 == (-2.0006493254743547d));
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.014618380254197412d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.3710953E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962971309473d + "'", double1 == 1.5707962971309473d);
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.624216256515976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.764957001820996d + "'", double1 == 35.764957001820996d);
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-1.26765045E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.267650449112502E30d) + "'", double1 == (-1.267650449112502E30d));
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5.000000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 4, (float) 23);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.007983904417203952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007952201681614113d + "'", double1 == 0.007952201681614113d);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-5.8058397E32f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108 + "'", int1 == 108);
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 75L, 5730.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5730.0d + "'", double2 == 5730.0d);
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 3.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.7227342478134157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8077504007366337d + "'", double1 == 0.8077504007366337d);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5698197646053376d, 0.42073952573286544d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6252248588609128d + "'", double2 == 1.6252248588609128d);
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(9.462941570952797d, (-58));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2831173789857327E-17d + "'", double2 == 3.2831173789857327E-17d);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5730.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.69676347110224d + "'", double1 == 75.69676347110224d);
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(31.911465395190167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.171871484450947d + "'", double1 == 3.171871484450947d);
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        long long2 = org.apache.commons.math3.util.FastMath.max(7L, 187L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 32, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 458);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 458.00003f + "'", float1 == 458.00003f);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-57.01243777067935d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.878439647493319E24d) + "'", double1 == (-2.878439647493319E24d));
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-9.999999f), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(74.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.733241996798949E32d + "'", double1 == 3.733241996798949E32d);
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 76.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0148003881138887E33d + "'", double1 == 1.0148003881138887E33d);
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.688345401322032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.02567602146900736d, 0.07156993751100402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02567602146900736d + "'", double2 == 0.02567602146900736d);
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.13235423529153753d, 1.7945743751980148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.28916361722555534d) + "'", double2 == (-0.28916361722555534d));
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.3612100257239834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.99158950487846d + "'", double1 == 77.99158950487846d);
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        int int1 = org.apache.commons.math3.util.FastMath.round((-126.99998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        double double1 = org.apache.commons.math3.util.FastMath.asin(90.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.4655091713670404E-8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4655091713670404E-8d) + "'", double1 == (-1.4655091713670404E-8d));
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.081221371125345d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(Float.POSITIVE_INFINITY, 1.9342813E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.595196397132241E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.595196397132241E-32d + "'", double1 == 1.595196397132241E-32d);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-9.223372036854776E18d), 1.1743590056195488d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9746486480944884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9872429529221712d + "'", double1 == 0.9872429529221712d);
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2676505246703657E30d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1023);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1023L + "'", long1 == 1023L);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        int int2 = org.apache.commons.math3.util.FastMath.min((-3), (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.1743590056195488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(19.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-3), 1759.4875643140501d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(13.0d, 2.9932207207429933d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.0d + "'", double2 == 13.0d);
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.19209275E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.03079223E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0872902135394655d + "'", double1 == 1.0872902135394655d);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 97L, (-0.017453291479645992d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.8058397E32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.80584E32f + "'", float1 == 5.80584E32f);
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        double double1 = org.apache.commons.math3.util.FastMath.sin(512.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07951849401287635d + "'", double1 == 0.07951849401287635d);
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8079404376202444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6684525369475158d + "'", double1 == 0.6684525369475158d);
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        float float2 = org.apache.commons.math3.util.FastMath.max(1023.0f, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.0f + "'", float2 == 1023.0f);
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 0, 144L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144L + "'", long2 == 144L);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        long long1 = org.apache.commons.math3.util.FastMath.round((-6.194414737140372E10d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-61944147371L) + "'", long1 == (-61944147371L));
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.027188589065316054d), 35.014282800023196d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-6809493.145514925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.901552178612685E8d) + "'", double1 == (-3.901552178612685E8d));
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 149.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.6727890835229181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6302320770101165d + "'", double1 == 0.6302320770101165d);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        double double1 = org.apache.commons.math3.util.FastMath.acos(13.089969389957473d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.453021129808693E148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9074079744350795E74d + "'", double1 == 2.9074079744350795E74d);
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(53248.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53248.004f + "'", float1 == 53248.004f);
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.3884476551279826d), (-0.972630067242408d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3884476551279826d) + "'", double2 == (-0.3884476551279826d));
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-3.380515006246586d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9057397565936123d, 0.9169970877394357d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9057397565936123d + "'", double2 == 0.9057397565936123d);
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8091056466488193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8091056466488195d + "'", double1 == 0.8091056466488195d);
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.562922473770796d), 14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-25606.921810260723d) + "'", double2 == (-25606.921810260723d));
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6679190596134986d, (double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999998460434073d + "'", double2 == 0.999998460434073d);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.8435577321556793d), (-0.16413292293649706d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8435577321556793d) + "'", double2 == (-0.8435577321556793d));
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-7.6770288745698245d), 127.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06037557856845913d) + "'", double2 == (-0.06037557856845913d));
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9541884483339822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02036584543290461d) + "'", double1 == (-0.02036584543290461d));
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.023964666826589657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.9999995f), (float) 22026L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22026.0f + "'", float2 == 22026.0f);
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-5.999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8171204965576213d) + "'", double1 == (-1.8171204965576213d));
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        double double1 = org.apache.commons.math3.util.FastMath.abs(83.17782841321889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.17782841321889d + "'", double1 == 83.17782841321889d);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.16371340869567735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.4374925441739296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.548818750867863d + "'", double1 == 1.548818750867863d);
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.22304735158536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02134620319296122d + "'", double1 == 0.02134620319296122d);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.942437867146782d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 9, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 328281L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.701625227919099d + "'", double1 == 12.701625227919099d);
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.5127512017063653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5664551939031287d + "'", double1 == 0.5664551939031287d);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.01471727643514217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        double double2 = org.apache.commons.math3.util.FastMath.min((-5.0d), 1.5563207343123242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.0d) + "'", double2 == (-5.0d));
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854067E-14d + "'", double1 == 1.2722218725854067E-14d);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 53248, 4294967296L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53248L + "'", long2 == 53248L);
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 22026L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999978852724889d + "'", double1 == 9.999978852724889d);
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.381888937281653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.381888937281653d + "'", double1 == 1.381888937281653d);
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        long long1 = org.apache.commons.math3.util.FastMath.round(71.50292279378833d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72L + "'", long1 == 72L);
    }
}

