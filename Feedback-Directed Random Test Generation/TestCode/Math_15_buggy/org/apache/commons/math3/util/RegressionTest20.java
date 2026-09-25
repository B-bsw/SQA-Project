package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

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
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.4942208E7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9961846293802797d) + "'", double1 == (-0.9961846293802797d));
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.9363427358340495d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.1120213610286207d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        double double1 = org.apache.commons.math3.util.FastMath.asin(105049.8032003758d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5927622578907794d, 0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7490592358260686d) + "'", double2 == (-1.7490592358260686d));
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-100));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-99.99999f) + "'", float1 == (-99.99999f));
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.99189285848507d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 9.671406E24f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 128.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1072100214198017d + "'", double1 == 2.1072100214198017d);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.3509887E-38f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-125) + "'", int1 == (-125));
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        double double1 = org.apache.commons.math3.util.FastMath.cos(75.0067243010387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9243379715502619d + "'", double1 == 0.9243379715502619d);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.66827237527655d + "'", double1 == 43.66827237527655d);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.2699847631416842E296d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 984 + "'", int1 == 984);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.2519853959658094d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.8698592549372254E-42d, (-0.9131200615513249d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9131200615513249d + "'", double2 == 0.9131200615513249d);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.956763478491886d, 1.4994888620096063d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4994888620096063d + "'", double2 == 1.4994888620096063d);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6950751868245029d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        long long2 = org.apache.commons.math3.util.FastMath.min(8388608L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.14274598524894844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14226170363832635d + "'", double1 == 0.14226170363832635d);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 2.842171E-14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9257799E-24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        int int1 = org.apache.commons.math3.util.FastMath.round((-16.999998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17) + "'", int1 == (-17));
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.031139661750354587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031129602448428793d) + "'", double1 == (-0.031129602448428793d));
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1024.0001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0001f + "'", float1 == 1024.0001f);
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(9.580542411316677E-15d, 0.9746486480944884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.580542411316677E-15d + "'", double2 == 9.580542411316677E-15d);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4649444186343d + "'", double1 == 1833.4649444186343d);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.891454401121671E-47d, 1.0853695281061901d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.891454401121672E-47d + "'", double2 == 4.891454401121672E-47d);
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.4551915E-11f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.1433134923316977d), 7.3484692283495345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1433134923316977d + "'", double2 == 1.1433134923316977d);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.0605730817257655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.78392357951125d + "'", double1 == 1.78392357951125d);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1023L), 14.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.999999f + "'", float2 == 14.999999f);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.1541500587079068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0489483222642482d + "'", double1 == 1.0489483222642482d);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 491, (long) 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 491L + "'", long2 == 491L);
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 96L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560380036863927d + "'", double1 == 1.560380036863927d);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.2405994964072952d, 17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31535.857193096996d + "'", double2 == 31535.857193096996d);
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0269035089368426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6536207134389902d + "'", double1 == 1.6536207134389902d);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-5L), (-0.2855345016765238d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2855345016765238d) + "'", double2 == (-0.2855345016765238d));
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5729.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3817208956030992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.870996270011485d + "'", double1 == 21.870996270011485d);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.6940658945086007E-21d, (-5.026525594659021d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6940658945086007E-21d) + "'", double2 == (-1.6940658945086007E-21d));
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.02198799865777131d), 0.8114214365648633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8114214365648633d + "'", double2 == 0.8114214365648633d);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.9174489497410363d), 1.0941931051470568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2076840865971654d + "'", double2 == 2.2076840865971654d);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 1023);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.0f + "'", float1 == 1023.0f);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.303891005617736E-43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.03796666907934495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03798492218294381d + "'", double1 == 0.03798492218294381d);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.6827E-41f, 63.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.000004f + "'", float2 == 63.000004f);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-97.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-96.99999f) + "'", float1 == (-96.99999f));
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.47961458771971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9081031399222524d + "'", double1 == 0.9081031399222524d);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.030765742067207565d, 12.000001907348633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7137760712961093d) + "'", double2 == (-0.7137760712961093d));
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.563150929088647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        int int1 = org.apache.commons.math3.util.FastMath.round(95.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 95 + "'", int1 == 95);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(9.999998092651367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978950994030255d + "'", double1 == 2.3978950994030255d);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.4012984643248174E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4012984643248174E-45d + "'", double1 == 1.4012984643248174E-45d);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 126.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(113.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        int int2 = org.apache.commons.math3.util.FastMath.max(22, 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.573806628911546d), (-0.22191504464504894d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.573806628911546d) + "'", double2 == (-1.573806628911546d));
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.8808135922807914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0078125f, (-1.2675516869730743E40d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0078124995f + "'", float2 == 0.0078124995f);
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.9728899114665712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1.8189894E-12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-7.324219E-4f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.32421875E-4d + "'", double1 == 7.32421875E-4d);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.03079215E11f, (-40.20253647247683d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03079207E11f + "'", float2 == 1.03079207E11f);
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021347E41d + "'", double1 == 6.691673596021347E41d);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(26.179938779914945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1715827078377264E11d + "'", double1 == 1.1715827078377264E11d);
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.5347691E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0016592504408959d) + "'", double1 == (-1.0016592504408959d));
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-9.215236359557623E-4d), (double) (-34));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.215236359557623E-4d) + "'", double2 == (-9.215236359557623E-4d));
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        long long2 = org.apache.commons.math3.util.FastMath.max(15L, (-149L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.02258986917884267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.150299265396883d + "'", double1 == 0.150299265396883d);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (double) 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23151.906933686514d + "'", double1 == 23151.906933686514d);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.40213799685287804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40213799685287804d + "'", double1 == 0.40213799685287804d);
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.2688682312579694E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007529582853152536d + "'", double1 == 0.007529582853152536d);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        double double2 = org.apache.commons.math3.util.FastMath.log((-3.8559846071046557d), 0.23090266964395562d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.194983122255699E96d, (double) 54043195528445952L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.4043195528445952E16d + "'", double2 == 5.4043195528445952E16d);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-149), (long) 95);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-149L) + "'", long2 == (-149L));
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0962012461388824d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5403023058682973d, 11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703395d + "'", double2 == 11013.232874703395d);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 3.4900006E33f, 0.013609859283310707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.490000558753344E33d + "'", double2 == 3.490000558753344E33d);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5403023058682973d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04604517257146691d + "'", double2 == 0.04604517257146691d);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.7992353978425616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8939996632228457d + "'", double1 == 0.8939996632228457d);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 22, (long) (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0001761935342757d, (double) 1.5625001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0001761935342757d + "'", double2 == 1.0001761935342757d);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.712409072799656E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.224705402120716E-8d + "'", double1 == 8.224705402120716E-8d);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000127d + "'", double1 == 1.0000000000000127d);
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.358015285337246d, 458);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6646463823140003E137d + "'", double2 == 2.6646463823140003E137d);
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(101.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6535299896840854E43d + "'", double1 == 3.6535299896840854E43d);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 13);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963057214724d) + "'", double1 == (-1.5707963057214724d));
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        float float1 = org.apache.commons.math3.util.FastMath.signum(106.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5660735482843895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9423769284032523d + "'", double1 == 0.9423769284032523d);
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.08100514452844133d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5094560439945823d, 178.34851573024756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 178.34851573024756d + "'", double2 == 178.34851573024756d);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.568843200553131d, (-0.014918745881023593d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5688432005531308d + "'", double2 == 1.5688432005531308d);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.4280592992577826E77d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.3663880545204354d, 18629.058771181844d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3663880545204354d + "'", double2 == 0.3663880545204354d);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 5L, 0.06470393174263801d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9431253461204515d, 1.1662430606729808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1662430606729808d + "'", double2 == 1.1662430606729808d);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.269427669584644d + "'", double1 == 11.269427669584644d);
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 4.73480027861034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.73480027861034d + "'", double2 == 4.73480027861034d);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-58613.58244188321d), 0.7616681427904104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.172181589970962d) + "'", double2 == (-0.172181589970962d));
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.28916361722555534d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.56785485576075d) + "'", double1 == (-16.56785485576075d));
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.02567602146900736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.055352780953117735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05538108617453488d + "'", double1 == 0.05538108617453488d);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-10));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999958776927d) + "'", double1 == (-0.9999999958776927d));
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-2.185039863261519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.47006880877257834d), (double) (-1.9843748f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0392910237095125d + "'", double2 == 2.0392910237095125d);
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.877472E-39f, 258047.98f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.877472E-39f + "'", float2 == 5.877472E-39f);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 40.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7451106163071273d + "'", double1 == 0.7451106163071273d);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(7.3132203057100895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.687472819191201d + "'", double1 == 2.687472819191201d);
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        int int2 = org.apache.commons.math3.util.FastMath.min((-24), 138);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.8197907155348637E-15d, 0.0448443767581986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0448443767581986d + "'", double2 == 0.0448443767581986d);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.9843748f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.9843746f) + "'", float1 == (-1.9843746f));
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.7252903E-9f, (-1.9999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.7252903E-9f) + "'", float2 == (-3.7252903E-9f));
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        int int2 = org.apache.commons.math3.util.FastMath.max(750, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.02718189259122131d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000369450389111d + "'", double1 == 1.000369450389111d);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.080594477611303E-9d, 0.7450729502920265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7450729502920265d + "'", double2 == 0.7450729502920265d);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(6.763640597454251E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.763640597454251E-11d + "'", double1 == 6.763640597454251E-11d);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.5832605322327451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.546410917622178d), (-0.8042090786043492d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8042090786043492d) + "'", double2 == (-0.8042090786043492d));
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        int int2 = org.apache.commons.math3.util.FastMath.max(63, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-10L), (-126.999985f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.568384133256267E-5d, 11478.35722564624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.568384133256269E-5d + "'", double2 == 6.568384133256269E-5d);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.8886168046158662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5707962971309473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.451582686404798d + "'", double1 == 0.451582686404798d);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        int int1 = org.apache.commons.math3.util.FastMath.round(113.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 113 + "'", int1 == 113);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.6696974859049024d), (-0.7285236038432762d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05882611793837378d + "'", double2 == 0.05882611793837378d);
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.5501416712979399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5228080019404568d) + "'", double1 == (-0.5228080019404568d));
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.0592232274909887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0592232274909887d + "'", double1 == 1.0592232274909887d);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5707925120971762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334010689051067d + "'", double1 == 1.2334010689051067d);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-1.5706791906040234d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1713619060536078E-4d + "'", double1 == 1.1713619060536078E-4d);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 458.00003f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.129050276547641d + "'", double1 == 6.129050276547641d);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.0017485286359640957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9105668365896491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.1716367011654d + "'", double1 == 52.1716367011654d);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 750, 1.6061400801265278d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.99994f + "'", float2 == 749.99994f);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.4750429751260321d, 1.8029079379718067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8029079379718067d + "'", double2 == 1.8029079379718067d);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.3296700211997184E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9998757901941958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0000000000000127d, 1.381888937281653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000127d + "'", double2 == 1.0000000000000127d);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 58);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.9950547536867305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(10.067664384225559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.172958301684023d + "'", double1 == 3.172958301684023d);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8429167374147226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1222007532741443d + "'", double1 == 1.1222007532741443d);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.5783152542625629d), 0.014811373879680489d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5783152542625629d + "'", double2 == 0.5783152542625629d);
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.03079223E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0307922329600002E11d + "'", double1 == 1.0307922329600002E11d);
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-17.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.0065821320002953E46d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.23208856521353044d), 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23208856521353044d + "'", double2 == 0.23208856521353044d);
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-13));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-12.999999f) + "'", float1 == (-12.999999f));
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.688345401322032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9904194617472741d + "'", double1 == 0.9904194617472741d);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        int int2 = org.apache.commons.math3.util.FastMath.max(127, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1500.0001f, (float) (-127L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1500.0001f) + "'", float2 == (-1500.0001f));
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(6.72875599861461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.728755998614611d + "'", double1 == 6.728755998614611d);
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        float float2 = org.apache.commons.math3.util.FastMath.min(3000.0f, (-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.2233715E18f) + "'", float2 == (-9.2233715E18f));
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        long long1 = org.apache.commons.math3.util.FastMath.round(328280.7253817591d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 328281L + "'", long1 == 328281L);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02998967538379875d + "'", double1 == 0.02998967538379875d);
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(6.718548E31f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8357033E24f + "'", float1 == 4.8357033E24f);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.981408651385093d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        double double1 = org.apache.commons.math3.util.FastMath.tan(5.3014591923809045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4965358188094133d) + "'", double1 == (-1.4965358188094133d));
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-6.338253E29f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        int int2 = org.apache.commons.math3.util.FastMath.min(58, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.2009190019566577d, 11.527563848906032d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2009190019566577d + "'", double2 == 0.2009190019566577d);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 22025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.637978807091713E-12d + "'", double1 == 3.637978807091713E-12d);
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.6109948509855884E-13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.574710978503383d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-149), (float) 101651685L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.01651688E8f + "'", float2 == 1.01651688E8f);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-3.6605256E19f), (float) (-54L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.6605256E19f) + "'", float2 == (-3.6605256E19f));
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-5.942112E28f), (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.942112E28f) + "'", float2 == (-5.942112E28f));
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(192.21757041936067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.506607629269173E83d + "'", double1 == 1.506607629269173E83d);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        long long2 = org.apache.commons.math3.util.FastMath.min(76L, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.7320508075688772d, 1.5705714871469996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3696080648864815d + "'", double2 == 2.3696080648864815d);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9340794002838225d, (double) 3.0517585E-5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9340794002838225d + "'", double2 == 0.9340794002838225d);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.1365081616962985d, (-24));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.704179227933028E20d + "'", double2 == 5.704179227933028E20d);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        double double2 = org.apache.commons.math3.util.FastMath.pow(56.68269625798027d, (-34));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.41369831047428E-60d + "'", double2 == 2.41369831047428E-60d);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1023.99994f, (-35));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.980232E-8f + "'", float2 == 2.980232E-8f);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        double double1 = org.apache.commons.math3.util.FastMath.acos(12.944289813551192d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.014503305630723837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014502797227095314d) + "'", double1 == (-0.014502797227095314d));
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        double double2 = org.apache.commons.math3.util.FastMath.pow(26338.81768250355d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8779340371103932E141d + "'", double2 == 2.8779340371103932E141d);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.094949E-13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-40) + "'", int1 == (-40));
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-7.555788E22f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0071993E15f + "'", float1 == 9.0071993E15f);
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.621409754253409d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0954922813103776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9430430676591957d + "'", double1 == 1.9430430676591957d);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 18L, (-0.8100774437579773d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17.999998f + "'", float2 == 17.999998f);
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 6, 2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0000005f + "'", float2 == 6.0000005f);
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5153791807308472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2310073845151568d + "'", double1 == 1.2310073845151568d);
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.4626599322445797E-282d, 0.7567679096855728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9327721399448556E-282d + "'", double2 == 1.9327721399448556E-282d);
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(14.999999f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.999999f + "'", float2 == 14.999999f);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0000000152308706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077768285373d + "'", double1 == 1.5574077768285373d);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(131072.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2287.6379571740076d + "'", double1 == 2287.6379571740076d);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.4161468365471428d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007263132469506313d) + "'", double1 == (-0.007263132469506313d));
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        int int1 = org.apache.commons.math3.util.FastMath.abs(13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.0592232274909887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8141502220529702d) + "'", double1 == (-0.8141502220529702d));
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.666665679012609E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03819718068321397d + "'", double1 == 0.03819718068321397d);
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.39592515018183416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9226401640503834d + "'", double1 == 0.9226401640503834d);
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-6400.0f), 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-409600.0f) + "'", float2 == (-409600.0f));
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.0000001f, 97.000015f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-6), 0.9767456046870426d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.9999995f) + "'", float2 == (-5.9999995f));
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(10.545893600459793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2474441643328977d + "'", double1 == 3.2474441643328977d);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 8.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.4515827052894548d, 3.584873353677999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4515827052894548d + "'", double2 == 0.4515827052894548d);
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(21.725186498135784d, 0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.553324941070647d + "'", double2 == 1.553324941070647d);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        long long1 = org.apache.commons.math3.util.FastMath.round(17.247748258387595d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.5481703243545996d, 0.3186965710060212d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08922281765744289d) + "'", double2 == (-0.08922281765744289d));
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-6.047748557155732E15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6823907848375064d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4654359675125508d + "'", double2 == 1.4654359675125508d);
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.010255307790662582d), (-553.795452389488d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010255307790662582d) + "'", double2 == (-0.010255307790662582d));
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        int int1 = org.apache.commons.math3.util.FastMath.round((-12.999999f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13) + "'", int1 == (-13));
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.17889431650439688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(6.929946017359989E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.94701102221269d + "'", double1 == 100.94701102221269d);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        int int1 = org.apache.commons.math3.util.FastMath.round(40.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5437283808052962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4477986981010615d + "'", double1 == 2.4477986981010615d);
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.010613055774744197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010613454275763838d + "'", double1 == 0.010613454275763838d);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.2092794124576321d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9993239821248876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7164448423410983d + "'", double1 == 1.7164448423410983d);
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.2676506E30f), 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0384594E34f) + "'", float2 == (-1.0384594E34f));
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.4741259760439713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.150300350315092d + "'", double1 == 16.150300350315092d);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.564924489102427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(12.119006116482174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.119006116482176d + "'", double1 == 12.119006116482176d);
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        double double1 = org.apache.commons.math3.util.FastMath.exp(383.4369511116792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.346201007294013E166d + "'", double1 == 3.346201007294013E166d);
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        long long1 = org.apache.commons.math3.util.FastMath.abs(76L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 76L + "'", long1 == 76L);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.230756230241793E37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.47006880877257834d), 0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47810053385824464d + "'", double2 == 0.47810053385824464d);
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.576766401800843d, (-1.5826474541736284d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.48641168059916784d + "'", double2 == 0.48641168059916784d);
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-41));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 41L + "'", long1 == 41L);
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(8.03837595936612E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9999999998749475d, (-100));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.888609051223628E-31d + "'", double2 == 7.888609051223628E-31d);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.09252791806716626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09266045765894548d + "'", double1 == 0.09266045765894548d);
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.013432001936747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.357145936839963d + "'", double1 == 20.357145936839963d);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.9611213280559075E-308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9611213280559075E-308d + "'", double1 == 1.9611213280559075E-308d);
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5704188603648326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45134237381937675d + "'", double1 == 0.45134237381937675d);
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        double double1 = org.apache.commons.math3.util.FastMath.signum(97.69314718055996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        int int1 = org.apache.commons.math3.util.FastMath.round(11.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 186.99998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10714.309894682181d + "'", double1 == 10714.309894682181d);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1023), 113);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948961d + "'", double1 == 1.5707963267948961d);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.012818474064463535d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        double double2 = org.apache.commons.math3.util.FastMath.max((-4.547473508864641E-13d), 21.725186498135784d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.725186498135784d + "'", double2 == 21.725186498135784d);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5707949341414806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334023696153307d + "'", double1 == 1.2334023696153307d);
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        int int2 = org.apache.commons.math3.util.FastMath.min(22, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-10), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) 24L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24.0f + "'", float2 == 24.0f);
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(100.94701102221269d, 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3307831.6571758655d + "'", double2 == 3307831.6571758655d);
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5135741754193315d, 60.20853816867183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5135741754193317d + "'", double2 == 1.5135741754193317d);
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.023665418289289288d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 22026L, 0.9999999999998966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22026.000022700446d + "'", double2 == 22026.000022700446d);
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 79);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.888194417315589d + "'", double1 == 8.888194417315589d);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.7381034178687166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9037307759181229d) + "'", double1 == (-0.9037307759181229d));
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        double double1 = org.apache.commons.math3.util.FastMath.sin(6.285615910267171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002430600694319627d + "'", double1 == 0.002430600694319627d);
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533627E25d + "'", double2 == 7.737125245533627E25d);
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.3383347192043076E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192043076E42d + "'", double1 == 1.3383347192043076E42d);
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        int int2 = org.apache.commons.math3.util.FastMath.max(2147483647, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.336041713264338E14d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 333604171326434L + "'", long1 == 333604171326434L);
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192093108670653E-7d + "'", double1 == 1.192093108670653E-7d);
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-4.9999995f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.380520932331934d + "'", double1 == 3.380520932331934d);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        double double2 = org.apache.commons.math3.util.FastMath.log((-3.944304291006189E-31d), 3.2699847631416846E296d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.5549408655424255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.0915489880002d) + "'", double1 == (-89.0915489880002d));
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(13.089969389957473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 143, (-10.999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.999999f) + "'", float2 == (-10.999999f));
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 113);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 113.0d + "'", double1 == 113.0d);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0592232274909887d, 57.295779939969144d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.295779939969144d + "'", double2 == 57.295779939969144d);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-100), (-2.0122792E-16f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.8376078965335373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5779068801328656d + "'", double1 == 0.5779068801328656d);
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.149937061583715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8177332267676073d + "'", double1 == 0.8177332267676073d);
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.7285236038432762d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        int int2 = org.apache.commons.math3.util.FastMath.min(175, 6400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 175 + "'", int2 == 175);
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.7137760712961093d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-40.89635640269601d) + "'", double1 == (-40.89635640269601d));
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        long long1 = org.apache.commons.math3.util.FastMath.round(718052.9999999999d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 718053L + "'", long1 == 718053L);
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1872174681517649d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        long long2 = org.apache.commons.math3.util.FastMath.min(127L, (-13L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13L) + "'", long2 == (-13L));
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.5705714871469996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999747235665d + "'", double1 == 0.9999999747235665d);
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.060443010546419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4012920835590674d + "'", double1 == 1.4012920835590674d);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 53248L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.275957614183426E-12d + "'", double1 == 7.275957614183426E-12d);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.43361281667855023d, 0.5471063997054444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6981013446388421d + "'", double2 == 0.6981013446388421d);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.994188727481171d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.14672230633339658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14778896977102307d + "'", double1 == 0.14778896977102307d);
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        int int2 = org.apache.commons.math3.util.FastMath.max((-6), (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.23606797749979d, 1.163085598195192d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18773817972170712d + "'", double2 == 0.18773817972170712d);
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 19.999996f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 4.0f, 3.6535299896840854E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        int int1 = org.apache.commons.math3.util.FastMath.round((-2.5154934E30f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 6400L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6400.0f + "'", float1 == 6400.0f);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.026538621740554002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.39932547317763495d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 69);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 69L + "'", long1 == 69L);
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.6072657569537874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9181817501356361d + "'", double1 == 0.9181817501356361d);
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        int int2 = org.apache.commons.math3.util.FastMath.max(76, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.6008938025796022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5695911769948219d + "'", double1 == 0.5695911769948219d);
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 53248.004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53248.0d + "'", double1 == 53248.0d);
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.4965358188094133d), 1.007272099154055d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.7998912382754204d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9282756958820966d) + "'", double1 == (-0.9282756958820966d));
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 0.9433589200145089d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.6727890835229181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6400.0f, (-18));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.024414062f + "'", float2 == 0.024414062f);
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6795276293349446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        float float2 = org.apache.commons.math3.util.FastMath.max(4096.0f, (float) (-10L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 4.440892E-16f, 0.7576211478872673d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3366774420594444E-12d + "'", double2 == 2.3366774420594444E-12d);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        long long2 = org.apache.commons.math3.util.FastMath.max(458L, (long) (-2147483648));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 458L + "'", long2 == 458L);
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-16.999998f), 0.2260966286709531d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.999998092651367d + "'", double2 == 16.999998092651367d);
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.09746678486527317d), 0.1365081616962985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6200600645984855d) + "'", double2 == (-0.6200600645984855d));
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.5707963057214724d), 0.8205677036841424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7722111585242013d + "'", double2 == 1.7722111585242013d);
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 53248, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53248L + "'", long2 == 53248L);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        long long2 = org.apache.commons.math3.util.FastMath.max(4L, (long) 187);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.7489785816197908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8654354866885173d + "'", double1 == 0.8654354866885173d);
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.0021857658352489153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0021857623543741337d + "'", double1 == 0.0021857623543741337d);
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.5689319876403915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5677741706249706d, (-0.16065669868064283d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6729142634634753d + "'", double2 == 1.6729142634634753d);
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5698197646053373d, 0.15867420742219507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.0821777304672215d) + "'", double2 == (-4.0821777304672215d));
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.269984763141685E296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 296.51454572902145d + "'", double1 == 296.51454572902145d);
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-2.0344439834794175d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1139437887396466d) + "'", double1 == (-1.1139437887396466d));
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 175);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.1647859739235145d + "'", double1 == 5.1647859739235145d);
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0041442383211276d, (-0.08933569103737334d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021451636910020958d + "'", double2 == 0.021451636910020958d);
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.1920300642971347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.337784594625163d + "'", double1 == 24.337784594625163d);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-2147483648L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        int int2 = org.apache.commons.math3.util.FastMath.min(1024, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-2.14748365E9f), 48);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.044629E23f) + "'", float2 == (-6.044629E23f));
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        int int1 = org.apache.commons.math3.util.FastMath.abs(54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54 + "'", int1 == 54);
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.1602900942795302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1616771239794264d + "'", double1 == 0.1616771239794264d);
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        long long2 = org.apache.commons.math3.util.FastMath.min(9L, (-12L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-1.9843749f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9843748807907102d) + "'", double1 == (-1.9843748807907102d));
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.6302320770101165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8780463800814613d + "'", double1 == 0.8780463800814613d);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1.9999999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-4));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.0f, 1.0269035089368426d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        float float2 = org.apache.commons.math3.util.FastMath.min(19.999996f, (-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.2233715E18f) + "'", float2 == (-9.2233715E18f));
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 3.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6780254335288145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(496.52885935020964d, 1.49018803671909d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 496.53109552978157d + "'", double2 == 496.53109552978157d);
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.39592515018183416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3959251501818342d + "'", double1 == 0.3959251501818342d);
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5706217938714693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9736588669793692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9736588669793693d + "'", double1 == 0.9736588669793693d);
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 255.99998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.557023013120662E110d + "'", double1 == 7.557023013120662E110d);
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 255.99998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        float float1 = org.apache.commons.math3.util.FastMath.signum(32.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.6379788E-12f, (double) 1.19209275E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6379792E-12f + "'", float2 == 3.6379792E-12f);
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        int int2 = org.apache.commons.math3.util.FastMath.min((-127), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 2.3611831E21f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9340794002838225d, 1.5416750205131582d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9340794002838225d + "'", double2 == 0.9340794002838225d);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.3663468017587768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.28590509197608d + "'", double1 == 78.28590509197608d);
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 99.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.00000000000001d + "'", double1 == 99.00000000000001d);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-565.8964071679023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5690292207549121d) + "'", double1 == (-1.5690292207549121d));
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.7433261306201426d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-79.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-79.0d) + "'", double1 == (-79.0d));
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.64808806136277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2174633912160902d + "'", double1 == 1.2174633912160902d);
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-127.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0529879845855437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.051631822436730465d + "'", double1 == 0.051631822436730465d);
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.9542141200785643d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.4741259760439713d, 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.818545842432399E32d + "'", double2 == 2.818545842432399E32d);
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(10.079369200195153d, 5.95177979919759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8241903982000274d) + "'", double2 == (-1.8241903982000274d));
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.011298952859326998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.559497133505772d + "'", double1 == 1.559497133505772d);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 458, 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.7157374E34f + "'", float2 == 3.7157374E34f);
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-4));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        double double2 = org.apache.commons.math3.util.FastMath.pow(171.8873521996253d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854067E-14d + "'", double1 == 1.2722218725854067E-14d);
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.20892575E24f, (float) 113);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.20892575E24f + "'", float2 == 1.20892575E24f);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9562112315661497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.786867891747015d + "'", double1 == 54.786867891747015d);
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 9223372036854775807L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.2233720368547748E18d + "'", double2 == 9.2233720368547748E18d);
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16372121576841156d) + "'", double1 == (-0.16372121576841156d));
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.03819718068321397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        long long2 = org.apache.commons.math3.util.FastMath.max(328281L, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 328281L + "'", long2 == 328281L);
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.017612750376510982d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        float float1 = org.apache.commons.math3.util.FastMath.signum(9.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 2, 144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 5.9421127E28f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66.25444734077583d + "'", double1 == 66.25444734077583d);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        double double1 = org.apache.commons.math3.util.FastMath.exp(200.3351263076086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0102756527453965E87d + "'", double1 == 1.0102756527453965E87d);
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 31L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-3.3774879545834167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3774879545834167d + "'", double1 == 3.3774879545834167d);
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.026538621740554002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026541737913276218d + "'", double1 == 0.026541737913276218d);
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.2089257E24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2089257E24f + "'", float1 == 1.2089257E24f);
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.021989770635849292d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 8.796093E12f, 2.8844902699029284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.407294356934878d + "'", double2 == 1.407294356934878d);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 149);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.15292164E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.15292178E18f + "'", float1 == 1.15292178E18f);
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 1.5707962142597092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.15167488020881612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        double double1 = org.apache.commons.math3.util.FastMath.log(384.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.950642552587727d + "'", double1 == 5.950642552587727d);
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 20L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 20.0f + "'", float1 == 20.0f);
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (double) 138);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.15052756842981832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1402205923355473d + "'", double1 == 0.1402205923355473d);
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8784688923495146d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 0.6823220100278267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6823220100278267d + "'", double2 == 0.6823220100278267d);
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(9.999998f, (float) 187L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999998f + "'", float2 == 9.999998f);
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.2999252260795204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.7181765752430962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7181765752430962d + "'", double1 == 1.7181765752430962d);
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.001953125f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-9) + "'", int1 == (-9));
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.3016241492783763E19d, (-2.185039863261519d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.185039863261519d) + "'", double2 == (-2.185039863261519d));
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        double double1 = org.apache.commons.math3.util.FastMath.rint(9.744848763971409E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.9385244584858893E-57d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1106926995412482E-55d + "'", double1 == 1.1106926995412482E-55d);
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.008022644671146243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008054912317806405d + "'", double1 == 0.008054912317806405d);
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        long long2 = org.apache.commons.math3.util.FastMath.min(8L, (long) 95);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 256.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5668900966629296d + "'", double1 == 1.5668900966629296d);
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.0822639194654398E10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.79805317935657d) + "'", double1 == (-23.79805317935657d));
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        int int1 = org.apache.commons.math3.util.FastMath.abs(83);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(32768.0f, 99);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0769187E34f + "'", float2 == 2.0769187E34f);
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.570796326794887d, (double) 2.5243552E-29f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-145.81821062385154d) + "'", double2 == (-145.81821062385154d));
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        long long2 = org.apache.commons.math3.util.FastMath.min(187L, (long) 31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.2169445E35f, (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9014757E33f + "'", float2 == 1.9014757E33f);
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9999998807907106d, 1.3601695942848226E29d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998807907106d + "'", double2 == 0.9999998807907106d);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.41369831047428E-60d, 0.018471250572709978d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.018471250572709978d + "'", double2 == 0.018471250572709978d);
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-5.8058397E32f), 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8058397E32f + "'", float2 == 5.8058397E32f);
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.551115123125783E-17d, 1.7722111585242013d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.551115123125783E-17d + "'", double2 == 5.551115123125783E-17d);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-8.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.0d) + "'", double1 == (-8.0d));
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.687472819191201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48814639231200097d) + "'", double1 == (-0.48814639231200097d));
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(8.155306710247183E-267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 5.4043196E16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.324719241724599E8d + "'", double1 == 2.324719241724599E8d);
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.6823220100278267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9784664215479475d + "'", double1 == 1.9784664215479475d);
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.23235910202965793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        long long1 = org.apache.commons.math3.util.FastMath.abs(8388608L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8388608L + "'", long1 == 8388608L);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.12049738039639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9997775029757584d) + "'", double1 == (-0.9997775029757584d));
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.014503305630723837d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(99.0f, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5687176E31f + "'", float2 == 1.5687176E31f);
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9794818692056363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6630760626877992d + "'", double1 == 1.6630760626877992d);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 9223372036854775807L, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.611686E18f + "'", float2 == 4.611686E18f);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(22025.002f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 3.371747880871523E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.39410242298628406d), 0.058396981403728045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.058396981403728045d + "'", double2 == 0.058396981403728045d);
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(353.06753976376604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 353.0675397637661d + "'", double1 == 353.0675397637661d);
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.44491153754783735d, 1.602619601945246E39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7761518516796347E-40d + "'", double2 == 2.7761518516796347E-40d);
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.017453292649980457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000074505806d + "'", double1 == 1.0000000074505806d);
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.7449091110358109d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2905137207051824d + "'", double1 == 1.2905137207051824d);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        double double1 = org.apache.commons.math3.util.FastMath.abs(10.693147181075235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.693147181075235d + "'", double1 == 10.693147181075235d);
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.4290008686463924d, 41);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.526779523018799E-16d + "'", double2 == 8.526779523018799E-16d);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        int int2 = org.apache.commons.math3.util.FastMath.max((-5), 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-2.857680860275251d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.223373E19f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.07125835569920674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012436929265084238d + "'", double1 == 0.0012436929265084238d);
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(749.9999389648438d, (-1.7608407657843304d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 749.9999389648436d + "'", double2 == 749.9999389648436d);
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.7254630513334037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.545495450016542d + "'", double1 == 0.545495450016542d);
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.03844259002118798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03772208117011153d + "'", double1 == 0.03772208117011153d);
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        long long2 = org.apache.commons.math3.util.FastMath.min((-10L), 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.5063590621241333d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.797051155271773d) + "'", double1 == (-0.797051155271773d));
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.8626451E-9f, 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3841858E-7f + "'", float2 == 2.3841858E-7f);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.46923377193038524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8919150406232845d + "'", double1 == 0.8919150406232845d);
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.01494441826103511d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 2.0122792E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1529510720305247E-14d + "'", double1 == 1.1529510720305247E-14d);
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.45134237381937675d, (double) (-1.17136825E21f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4513423738193767d + "'", double2 == 0.4513423738193767d);
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 491L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 491.0f + "'", float2 == 491.0f);
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(255.99998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(8.700388696552714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.056740745486681d + "'", double1 == 2.056740745486681d);
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        double double2 = org.apache.commons.math3.util.FastMath.max((-10.87234351317457d), (-4.185891831851988d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.185891831851988d) + "'", double2 == (-4.185891831851988d));
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0269035089368426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7924057741941706d + "'", double1 == 2.7924057741941706d);
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.6881171418161356E43d, 2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.234021194410018d + "'", double2 == 2.234021194410018d);
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-3.527224344196591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9731728048816333d) + "'", double1 == (-1.9731728048816333d));
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        long long1 = org.apache.commons.math3.util.FastMath.round(387.99999999999994d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 388L + "'", long1 == 388L);
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 3.0948501E26f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0948500982134514E26d + "'", double1 == 3.0948500982134514E26d);
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(542.7661979669267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31098.212405867023d + "'", double1 == 31098.212405867023d);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.09473991049806847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09445747369689829d + "'", double1 == 0.09445747369689829d);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 7.2057594E16f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.857680860275251d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.4878958005159275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4878958005159275d + "'", double1 == 1.4878958005159275d);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1411200080598672d + "'", double1 == 0.1411200080598672d);
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.1529215E18f, 9.223372E19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1529215E18f + "'", float2 == 1.1529215E18f);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.3186965710060212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33019565537172896d + "'", double1 == 0.33019565537172896d);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 18.000002f, 1638400.125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1638400.125098877d + "'", double2 == 1638400.125098877d);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        double double1 = org.apache.commons.math3.util.FastMath.abs(10.498374723366416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.498374723366416d + "'", double1 == 10.498374723366416d);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        double double1 = org.apache.commons.math3.util.FastMath.rint(8.973831323390355E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8149601367384811d, 4.7713898455600543E306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7713898455600543E306d + "'", double2 == 4.7713898455600543E306d);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.193615433083745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.641881390975181d) + "'", double1 == (-1.641881390975181d));
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0771875889955993d, 1638400.125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.586233872033443d) + "'", double2 == (-5.586233872033443d));
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(35.764957001820996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.604545136106389d + "'", double1 == 3.604545136106389d);
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.13970367520817575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0097744403396323d + "'", double1 == 1.0097744403396323d);
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.15560004901740182d, 148.46705289324876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0010480439196103495d + "'", double2 == 0.0010480439196103495d);
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.012647060384878258d, 187);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5574077246549023d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.7320508763943914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1605566065073065d) + "'", double1 == (-0.1605566065073065d));
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 22025, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-9), 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-288.0f) + "'", float2 == (-288.0f));
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1024.0001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.000001907348576d + "'", double1 == 32.000001907348576d);
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-2.549839933542756E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.450310223915449E-6d) + "'", double1 == (-4.450310223915449E-6d));
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.757246511475293E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7572458056304024E-7d + "'", double1 == 3.7572458056304024E-7d);
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.11812448149071139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9930314120465302d + "'", double1 == 0.9930314120465302d);
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 458);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 458.0d + "'", double1 == 458.0d);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.912801418045861d + "'", double1 == 0.912801418045861d);
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(31.594603878732347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1458829830567625d + "'", double1 == 4.1458829830567625d);
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.308860714383271d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5502.877435695553d + "'", double2 == 5502.877435695553d);
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.5571492599290335d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1017.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        long long2 = org.apache.commons.math3.util.FastMath.min((-17L), (long) 1025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17L) + "'", long2 == (-17L));
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(548.3170351552121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 83, 1.7763568E-15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7763568E-15f + "'", float2 == 1.7763568E-15f);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.221356488779385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4904215808889059d + "'", double1 == 1.4904215808889059d);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.006264389542770915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006264430514648786d + "'", double1 == 0.006264430514648786d);
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(7.3132203057100895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.000272298204d + "'", double1 == 750.000272298204d);
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        int int2 = org.apache.commons.math3.util.FastMath.max(33, 458);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 458 + "'", int2 == 458);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        double double2 = org.apache.commons.math3.util.FastMath.min(328280.725258389d, 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(8537.071147449265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 489138.1461517498d + "'", double1 == 489138.1461517498d);
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0148003881138887E33d, 3.149868789856197E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40896009219577206d + "'", double2 == 0.40896009219577206d);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1024.0008978929602d, 1.0549609508701883d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0014413213473d + "'", double2 == 1024.0014413213473d);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 175L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0035391806143295E76d + "'", double1 == 1.0035391806143295E76d);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.8200151728564355d, 1.1368683772161602E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.820015172856435d + "'", double2 == 6.820015172856435d);
    }
}

