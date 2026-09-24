package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.80040108927525d + "'", double1 == 53.80040108927525d);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1500L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0f + "'", float2 == 1500.0f);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8370630725347682d), 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.41095182754680054d) + "'", double2 == (-0.41095182754680054d));
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.9867447596805989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.323362308933903d) + "'", double1 == (-4.323362308933903d));
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0000000000000042E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 138.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.0d + "'", double1 == 138.0d);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-1.0f), (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        long long1 = org.apache.commons.math3.util.FastMath.abs(5447015486L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5447015486L + "'", long1 == 5447015486L);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        double double2 = org.apache.commons.math3.util.FastMath.log(91.45317136336229d, 0.026541737035255974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8036261707997578d) + "'", double2 == (-0.8036261707997578d));
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.00001f + "'", float1 == 97.00001f);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        float float2 = org.apache.commons.math3.util.FastMath.min((-2.3768449E32f), (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3768449E32f) + "'", float2 == (-2.3768449E32f));
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        float float2 = org.apache.commons.math3.util.FastMath.min(97.00001f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-0.99999994f), (double) 32L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(101.04822696504081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.9E-324d, 0.15052756842981832d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15052756842981832d + "'", double2 == 0.15052756842981832d);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) -1, (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.877472E-39f) + "'", float2 == (-5.877472E-39f));
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 1500, 5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5832605322327451d + "'", double2 == 0.5832605322327451d);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        int int2 = org.apache.commons.math3.util.FastMath.min(32, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        int int2 = org.apache.commons.math3.util.FastMath.min(1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796106d + "'", double1 == 9.848857801796106d);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 2, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        double double1 = org.apache.commons.math3.util.FastMath.atan(10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4716190657154942d + "'", double1 == 1.4716190657154942d);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.15987052369731924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16125382097679095d + "'", double1 == 0.16125382097679095d);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.999999940395355d) + "'", double1 == (-0.999999940395355d));
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 5.0f, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3283064365386964E22d + "'", double2 == 2.3283064365386964E22d);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0771875889955993d, (double) 9.999998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07718758899559931d + "'", double2 == 0.07718758899559931d);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.153330206915566d, (double) (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1533302069155655d + "'", double2 == 2.1533302069155655d);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(97.0f, 6.666665679012609E-4d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904824216d) + "'", double1 == (-0.41032129904824216d));
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(7.668093098623077E43d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.668093098623077E43d + "'", double2 == 7.668093098623077E43d);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6935959727279236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.009624211171012755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-149L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-148.99999999999997d) + "'", double1 == (-148.99999999999997d));
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1024.9999f, 1.373400766945016d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.9998f + "'", float2 == 1024.9998f);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 10, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 750, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.373400766945016d, (-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3734007669450157d + "'", double2 == 1.3734007669450157d);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.094947E-13f + "'", float1 == 9.094947E-13f);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.41095182754680054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38991180981351d) + "'", double1 == (-0.38991180981351d));
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.5f) + "'", float2 == (-0.5f));
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.027415567780803774d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-127));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        double double1 = org.apache.commons.math3.util.FastMath.exp(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.1624473515096265d, 33.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.035211118248524166d + "'", double2 == 0.035211118248524166d);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.633123935319537E16d + "'", double1 == 1.633123935319537E16d);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 9.094947E-13f, (double) (-148.99998f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.99998474121094d + "'", double2 == 148.99998474121094d);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-4.323362308933903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37928799478267644d) + "'", double1 == (-0.37928799478267644d));
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3197768247158532d + "'", double1 == 1.3197768247158532d);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4012984643248174E-45d + "'", double1 == 1.4012984643248174E-45d);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.560487413648653d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.8370630725347682d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7613487752456315d) + "'", double1 == (-0.7613487752456315d));
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(10.545893600459793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19010.49395704137d + "'", double1 == 19010.49395704137d);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-2.3768449E32f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9342813E25f + "'", float1 == 1.9342813E25f);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 35, 1.0113951599323715E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 32L, 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.5440211108893698d), (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.623359472495549E-46d) + "'", double2 == (-7.623359472495549E-46d));
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.949823557438858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026544854745010848d + "'", double1 == 0.026544854745010848d);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-1), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-4.323362308933903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07545690704752087d) + "'", double1 == (-0.07545690704752087d));
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1024.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7450920600186577d + "'", double1 == 0.7450920600186577d);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        double double1 = org.apache.commons.math3.util.FastMath.floor(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 10, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 52L, (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0562853E-37f + "'", float2 == 3.0562853E-37f);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 631011.7625152355d + "'", double1 == 631011.7625152355d);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 32.0f, 101.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7853981633974483d, 10.545893600459793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1025);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        double double1 = org.apache.commons.math3.util.FastMath.atan(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-149L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8537.071147449265d) + "'", double1 == (-8537.071147449265d));
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 10, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.8342233605065102d, 5729.577951308233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065102d + "'", double2 == 0.8342233605065102d);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8388608.0d + "'", double1 == 8388608.0d);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 138.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.00000000000003d + "'", double1 == 138.00000000000003d);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        int int2 = org.apache.commons.math3.util.FastMath.max(35, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.633495252341099E-4d + "'", double1 == 4.633495252341099E-4d);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.094947E-13f, (float) (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.094947E-13f + "'", float2 == 9.094947E-13f);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.562922473770796d) + "'", double1 == (-1.562922473770796d));
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 97, 0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17453292519943295d + "'", double2 == 0.17453292519943295d);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        float float2 = org.apache.commons.math3.util.FastMath.min(32.000004f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-8537.071147449265d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5706791906040234d) + "'", double1 == (-1.5706791906040234d));
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 97, 3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        double double1 = org.apache.commons.math3.util.FastMath.rint(400.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 400.0d + "'", double1 == 400.0d);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        int int2 = org.apache.commons.math3.util.FastMath.min(750, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436354751788103d + "'", double1 == 1.4436354751788103d);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        double double1 = org.apache.commons.math3.util.FastMath.asin(35.014282800023196d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.0f), (-2.3768449E32f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        long long1 = org.apache.commons.math3.util.FastMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-148.99999999999997d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.09966865249116202d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-149), (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-149L) + "'", long2 == (-149L));
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.30685281944005d + "'", double1 == 96.30685281944005d);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.4716190657154942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.31756151648315d + "'", double1 == 84.31756151648315d);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-1), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.560487413648653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2491947060601294d + "'", double1 == 1.2491947060601294d);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        double double1 = org.apache.commons.math3.util.FastMath.log(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.3734007669450161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.6900675259798d + "'", double1 == 78.6900675259798d);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4096.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0005f + "'", float1 == 4096.0005f);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1025, 1500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(9.094947E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.094948E-13f + "'", float1 == 9.094948E-13f);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(100.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8375714918828912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1624473515096265d, 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.29676667877352d + "'", double2 == 15.29676667877352d);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 5.0f, 0.6935959727279236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.99189285848507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7581682870722382d) + "'", double1 == (-0.7581682870722382d));
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.0113951599323715E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963266960232d + "'", double1 == 1.5707963266960232d);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.564085018163574d), 3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.564085018163574d + "'", double2 == 1.564085018163574d);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        long long2 = org.apache.commons.math3.util.FastMath.max(1500L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        double double1 = org.apache.commons.math3.util.FastMath.atan(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.7182818284590453d, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7182818284590455d + "'", double2 == 1.7182818284590455d);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 5);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35.0f, 1.5845632502852868E29d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        double double1 = org.apache.commons.math3.util.FastMath.signum(84.31756151648315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.7613487752456315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.913120061551325d) + "'", double1 == (-0.913120061551325d));
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        int int2 = org.apache.commons.math3.util.FastMath.max(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0113951599323715E10d, 1025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 138L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (-101.04822696504081d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.1920929E-7f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 138.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5635500768149995d + "'", double1 == 1.5635500768149995d);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.24871540768837d + "'", double1 == 22.24871540768837d);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 2.1533302069155655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        long long1 = org.apache.commons.math3.util.FastMath.round(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22026L + "'", long1 == 22026L);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-5.877472E-39f), (-149));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        long long1 = org.apache.commons.math3.util.FastMath.round(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.4716190657154942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38636319993752116d + "'", double1 == 0.38636319993752116d);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(101.04822696504081d, (double) 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.04822696504083d + "'", double2 == 101.04822696504083d);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        double double2 = org.apache.commons.math3.util.FastMath.min(6.691673596021348E41d, (double) 22026L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22026.0d + "'", double2 == 22026.0d);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9483398404364088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.33587040111615d + "'", double1 == 54.33587040111615d);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        long long2 = org.apache.commons.math3.util.FastMath.max(100L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        int int1 = org.apache.commons.math3.util.FastMath.round((-5.877472E-39f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 10, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 138L, (double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4842386559313054d + "'", double2 == 1.4842386559313054d);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1024.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1168694296386497d + "'", double1 == 1.1168694296386497d);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.560487413648653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 22026L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1500.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1500.0003333332963d + "'", double2 == 1500.0003333332963d);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5698197646053373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9169970877394357d + "'", double1 == 0.9169970877394357d);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.16323882911185375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8125409412719369d) + "'", double1 == (-1.8125409412719369d));
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        double double1 = org.apache.commons.math3.util.FastMath.floor(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2684529660545276d + "'", double1 == 1.2684529660545276d);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.26765045E30f) + "'", float1 == (-1.26765045E30f));
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 35, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2979.3805346802806d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        double double1 = org.apache.commons.math3.util.FastMath.floor(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0612373131777817d + "'", double1 == 2.0612373131777817d);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        float float1 = org.apache.commons.math3.util.FastMath.signum(138.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 32L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.564085018163574d), 1.4716190657154942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09246595244807976d) + "'", double2 == (-0.09246595244807976d));
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        double double1 = org.apache.commons.math3.util.FastMath.floor(22026.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.0d + "'", double1 == 22026.0d);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.15786583843612662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9875650456761652d + "'", double1 == 0.9875650456761652d);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.557407724654902d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        int int2 = org.apache.commons.math3.util.FastMath.min(1500, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390720478950319d) + "'", double1 == (-0.8390720478950319d));
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.0612373131777817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9914900537226896d + "'", double1 == 3.9914900537226896d);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(10.545893600459793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0466282343967674d + "'", double1 == 3.0466282343967674d);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 0, 1.662514762151963d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1500.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3010299956639812d + "'", double1 == 0.3010299956639812d);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.999999f, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.999998f + "'", float2 == 19.999998f);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(6.666665679012609E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.666666666666754E-4d + "'", double1 == 6.666666666666754E-4d);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(10.052274715955628d, (-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6698790550935152d + "'", double2 == 1.6698790550935152d);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 1, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 5.4470154E9f, (double) (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.447015423999999E9d + "'", double2 == 5.447015423999999E9d);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        float float1 = org.apache.commons.math3.util.FastMath.abs(5.4470154E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.4470154E9f + "'", float1 == 5.4470154E9f);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.5557864E22f + "'", float1 == 7.5557864E22f);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 5447015486L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 512.0f + "'", float1 == 512.0f);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.3283064365386964E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7717075948257832d + "'", double1 == 0.7717075948257832d);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5635500768149995d, (double) 138.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 138.0088572840262d + "'", double2 == 138.0088572840262d);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42280635864377986d) + "'", double1 == (-0.42280635864377986d));
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026931837701290245d + "'", double1 == 0.026931837701290245d);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 32.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.9952379872535d + "'", double2 == 104.9952379872535d);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.61512051684126d, 0.16125382097679095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.615120516841259d + "'", double2 == 4.615120516841259d);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 138L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23422432986760747d) + "'", double1 == (-0.23422432986760747d));
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(96.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-149L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.3014591923809045d) + "'", double1 == (-5.3014591923809045d));
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.56324762248225E59d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.0d + "'", double1 == 138.0d);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.7613487752456315d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.0612373131777817d, 0.0771875889955993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0626820368470065d + "'", double2 == 2.0626820368470065d);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08726646259971647d + "'", double1 == 0.08726646259971647d);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 1, (long) 1025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 32L, (-0.09731253940776538d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.999998f + "'", float2 == 31.999998f);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1025L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1624473515096265d, 400.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39.803104571515284d + "'", double2 == 39.803104571515284d);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) '4', (float) 22026L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22026.0f + "'", float2 == 22026.0f);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E20d + "'", double2 == 1.0E20d);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.2479614275509088d, 750.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.885930658415557d + "'", double2 == 29.885930658415557d);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(138.0088572840262d, 1.5706217938714693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2058605766631043d) + "'", double2 == (-0.2058605766631043d));
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.743392130574644E-23d + "'", double1 == 3.743392130574644E-23d);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.026544854745010848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5707963267948966d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-149), (float) 22026L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-149.0f) + "'", float2 == (-149.0f));
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4096.0005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.001f + "'", float1 == 4096.001f);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(99.99999f, 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        int int2 = org.apache.commons.math3.util.FastMath.min(52, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.4470154E9f, (-5.877472E-39f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.4470154E9f) + "'", float2 == (-5.4470154E9f));
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.8808637063441951d), (-2.9405615342893493E8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9405615342893493E8d) + "'", double2 == (-2.9405615342893493E8d));
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        float float1 = org.apache.commons.math3.util.FastMath.signum(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.4716190657154942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.564085018163574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027298433348069678d) + "'", double1 == (-0.027298433348069678d));
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5729.5779513082325d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.26310292903031E33d + "'", double2 == 7.26310292903031E33d);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E100d + "'", double2 == 1.0E100d);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9376558078861459d + "'", double1 == 0.9376558078861459d);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.8851621707325812d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0830799868521925d + "'", double2 == 1.0830799868521925d);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9426286359925615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 52L, 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000004f + "'", float2 == 52.000004f);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.23422432986760747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7911843097149078d + "'", double1 == 0.7911843097149078d);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.017453292519943295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (byte) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 9.094947E-13f, 1025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.269984763141685E296d + "'", double2 == 3.269984763141685E296d);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        double double1 = org.apache.commons.math3.util.FastMath.floor(718053.7444319915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 718053.0d + "'", double1 == 718053.0d);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 0, 1500.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        double double2 = org.apache.commons.math3.util.FastMath.min(6.666665679012609E-4d, 0.026931837701290245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.666665679012609E-4d + "'", double2 == 6.666665679012609E-4d);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.564085018163574d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        long long2 = org.apache.commons.math3.util.FastMath.max(9223372036854775807L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.026547972235306663d, 2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.204438512506361d) + "'", double2 == (-2.204438512506361d));
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.61512051684126d, (double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.438801799115821d + "'", double2 == 5.438801799115821d);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.1168694296386497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11052961946631416d + "'", double1 == 0.11052961946631416d);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.3560551570236352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023667627328711145d + "'", double1 == 0.023667627328711145d);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.141592653589793d, (double) (-5.877472E-39f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(192.21717495245434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.09731253940776538d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '#', 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 138L, 3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        double double1 = org.apache.commons.math3.util.FastMath.floor(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.0d + "'", double1 == 114.0d);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.557407724654902d), (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6420926159343308d) + "'", double2 == (-0.6420926159343308d));
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560487412837878d + "'", double1 == 1.560487412837878d);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-6), (float) 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(6.811682183676626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999975763076077d + "'", double1 == 0.9999975763076077d);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453291479645992d) + "'", double1 == (-0.017453291479645992d));
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 32L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1071487177940904d + "'", double1 == 1.1071487177940904d);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.6669829823489768d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8052885407089897d) + "'", double1 == (-0.8052885407089897d));
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 35.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000381469727d + "'", double1 == 35.00000381469727d);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16299078079570548d) + "'", double1 == (-0.16299078079570548d));
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1932800507380155d + "'", double1 == 1.1932800507380155d);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.26765045E30f), (float) (-149L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.26765045E30f) + "'", float2 == (-1.26765045E30f));
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        int int2 = org.apache.commons.math3.util.FastMath.min(2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.7911843097149078d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        double double2 = org.apache.commons.math3.util.FastMath.log(Double.NaN, (double) 7);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.42280635864377986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39929200144991767d) + "'", double1 == (-0.39929200144991767d));
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.831008000716578E22d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 5.4470154E9f, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.63114046460753E38d + "'", double2 == 8.63114046460753E38d);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.0612373131777817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.8556837405048565d + "'", double1 == 6.8556837405048565d);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 4096.0005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35.000004f, 53248.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000008f + "'", float2 == 35.000008f);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        double double1 = org.apache.commons.math3.util.FastMath.cos(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764514d) + "'", double1 == (-0.8390715290764514d));
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.07718758899559931d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7399168194079767E-6d + "'", double2 == 2.7399168194079767E-6d);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1L, 2.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-2.3768449E32f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1624473515096265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06537329234338424d + "'", double1 == 0.06537329234338424d);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.5832605322327451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.418366853490404d + "'", double1 == 33.418366853490404d);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 138, (-9.215235055286076E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 138L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9344739331306915d + "'", double1 == 4.9344739331306915d);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        double double2 = org.apache.commons.math3.util.FastMath.max(104.9952379872535d, 0.9999999403953551d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.9952379872535d + "'", double2 == 104.9952379872535d);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2.0f, (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.802596928649634E-45d + "'", double2 == 2.802596928649634E-45d);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8375714918828912d, 15.29676667877352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8375714918828912d + "'", double2 == 0.8375714918828912d);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.438801799115821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.09246595244807976d), (-0.8390720478950319d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.031835271646539d) + "'", double2 == (-3.031835271646539d));
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        double double1 = org.apache.commons.math3.util.FastMath.acos(400.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.662514762151963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0954922813103776d + "'", double1 == 1.0954922813103776d);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5.438801799115821d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 35L, 22026.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-149.0f), (-149));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.09E-43f) + "'", float2 == (-2.09E-43f));
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.8813735870195429d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.27151120192428d, (double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.033714142796992426d + "'", double2 == 0.033714142796992426d);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.913120061551325d), 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9131200615513249d) + "'", double2 == (-0.9131200615513249d));
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-2.09E-43f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 7.5557864E22f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(192.21717495245434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5060119336077023E83d + "'", double1 == 1.5060119336077023E83d);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-1.5707963267948966d), 53248.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9499630527705192E-5d) + "'", double2 == (-2.9499630527705192E-5d));
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-9.215233751015083E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        double double1 = org.apache.commons.math3.util.FastMath.signum(53.80040108927525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999801317847d) + "'", double1 == (-0.9999999801317847d));
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000004f + "'", float1 == 32.000004f);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.662514762151963d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.8146973E-6f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.6293945E-6f + "'", float2 == 7.6293945E-6f);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.09246595244807976d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09246595244807976d + "'", double1 == 0.09246595244807976d);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.811682183676626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.606354165955547d + "'", double1 == 2.606354165955547d);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1024, 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 32, 138L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(35.000004f, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.545972E30f + "'", float2 == 5.545972E30f);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 32, 138);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 99.99999f, (double) 6.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999237060545d + "'", double2 == 99.99999237060545d);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.394771296627336d + "'", double1 == 13.394771296627336d);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 35.000008f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(9.848857801796106d, 0.0771875889955993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.849160264910656d + "'", double2 == 9.849160264910656d);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 52, 1024.9999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.9999f + "'", float2 == 1024.9999f);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 15L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 15.000001f + "'", float1 == 15.000001f);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.017453291479645992d), 1.5845632502852868E29d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01745329147964599d) + "'", double2 == (-0.01745329147964599d));
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        double double2 = org.apache.commons.math3.util.FastMath.pow(Double.NaN, 22.24871540768837d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.6881171418161356E43d, 328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6881171418161356E43d + "'", double2 == 2.6881171418161356E43d);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.38991180981351d), 192.21717495245434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 192.21757041936067d + "'", double2 == 192.21757041936067d);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        double double1 = org.apache.commons.math3.util.FastMath.rint(10.052274715955628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        int int2 = org.apache.commons.math3.util.FastMath.max(138, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 138 + "'", int2 == 138);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1024);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.606354165955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6144206905127136d + "'", double1 == 1.6144206905127136d);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        int int2 = org.apache.commons.math3.util.FastMath.max(1025, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.3283064365386964E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.52587890625E11d + "'", double1 == 1.52587890625E11d);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1025, (double) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.9999f + "'", float2 == 1024.9999f);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.38636319993752116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1741109918529156d + "'", double1 == 1.1741109918529156d);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.999999940395355d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 0, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0230833853373482d, (double) 1024.9998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0230833853373482d + "'", double2 == 1.0230833853373482d);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001192092898d + "'", double1 == 1.0000001192092898d);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        double double1 = org.apache.commons.math3.util.FastMath.log10(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.342925101645957d + "'", double1 == 4.342925101645957d);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9875650456761652d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9875650456761652d + "'", double2 == 0.9875650456761652d);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 138.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.0d + "'", double1 == 138.0d);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.0d), 1.0230833853373482d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(104.9952379872535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970566590482209E45d + "'", double1 == 3.970566590482209E45d);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1024.0d, 101.0482306841231d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5327963125236284E304d + "'", double2 == 1.5327963125236284E304d);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000397364284d + "'", double1 == 1.0000000397364284d);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        double double1 = org.apache.commons.math3.util.FastMath.tan(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-126.99999f), 0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-126.999985f) + "'", float2 == (-126.999985f));
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 512.0f, 2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) ' ', 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02655421183195658d + "'", double1 == 0.02655421183195658d);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.447015485737373E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.418333678328555d + "'", double1 == 22.418333678328555d);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.831008000716577E22d, (double) (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-149.0d) + "'", double2 == (-149.0d));
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.6420926159343308d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6420926159343308d + "'", double2 == 0.6420926159343308d);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.026547972235306663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        double double2 = org.apache.commons.math3.util.FastMath.log(7.668093098623077E43d, 114.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04687067344618581d + "'", double2 == 0.04687067344618581d);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.802596928649634E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-44.55243935826922d) + "'", double1 == (-44.55243935826922d));
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1, (long) 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 4.505395525898652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.505395525898652d + "'", double2 == 4.505395525898652d);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 32, (float) 22026L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.633495252341099E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.6770288745698245d) + "'", double1 == (-7.6770288745698245d));
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0269035089368426d + "'", double1 == 1.0269035089368426d);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.269984763141685E296d, 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2699847631416846E296d + "'", double2 == 3.2699847631416846E296d);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.4131591025766d + "'", double1 == 148.4131591025766d);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1), 22026.465794806718d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        int int2 = org.apache.commons.math3.util.FastMath.min(127, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.447015423999999E9d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8715802485510056E20d + "'", double2 == 1.8715802485510056E20d);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1024.9999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 52.000004f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.2684529660545276d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.856118598515538E77d + "'", double2 == 2.856118598515538E77d);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(96.99999f, 22026.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(97.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-97.0f) + "'", float2 == (-97.0f));
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 9.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.21191404869d + "'", double1 == 11013.21191404869d);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(5729.578400155824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-97.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-96.99999999999999d) + "'", double1 == (-96.99999999999999d));
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0000000397364284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.97364275804712E-8d + "'", double1 == 3.97364275804712E-8d);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-4.323362308933903d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.6935959727279236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000897785780501d + "'", double1 == 1.000897785780501d);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        double double1 = org.apache.commons.math3.util.FastMath.acos(32.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.014609506662591823d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1658334890961391E10d + "'", double1 == 1.1658334890961391E10d);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(53248.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3050885.6675126073d + "'", double1 == 3050885.6675126073d);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 138, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 512.0f, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2048.0d + "'", double2 == 2048.0d);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.802596928649634E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '#', 22026L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.37928799478267644d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 138, (-0.99999994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        float float2 = org.apache.commons.math3.util.FastMath.max(22026.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22026.0f + "'", float2 == 22026.0f);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1624473515096265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.2491947060601294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.076985968228509d + "'", double1 == 1.076985968228509d);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9238054901410364d + "'", double1 == 1.9238054901410364d);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-126.99999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.7613487752456315d), 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.522697550491263d) + "'", double2 == (-1.522697550491263d));
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.1533302069155655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5501416712979399d) + "'", double1 == (-0.5501416712979399d));
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.562922473770796d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.562922473770796d) + "'", double2 == (-1.562922473770796d));
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7254630513334037d + "'", double1 == 1.7254630513334037d);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 35, (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.587394049396288E-231d + "'", double2 == 8.587394049396288E-231d);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-1L), 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-9.215235055286076E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.215236359557623E-4d) + "'", double1 == (-9.215236359557623E-4d));
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.574710978503383d, 1.52587890625E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.93539593942879d + "'", double2 == 16.93539593942879d);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 52, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.9914900537226896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6600602236808388d) + "'", double1 == (-0.6600602236808388d));
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.1741109918529156d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.15987052369731924d, 1.4842386559313054d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10729846174016215d + "'", double2 == 0.10729846174016215d);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.5574077842595472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.848629212096d + "'", double1 == 0.848629212096d);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.95177979919759d, 1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.95177979919759d + "'", double2 == 5.95177979919759d);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.684434645507153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 268.3983345924218d + "'", double1 == 268.3983345924218d);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1024.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-5.3014591923809045d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09252791806716626d) + "'", double1 == (-0.09252791806716626d));
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3678794630987664d + "'", double1 == 0.3678794630987664d);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 138.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.420081748504424E270d, (-0.017453291479645992d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.420081748504423E270d + "'", double2 == 4.420081748504423E270d);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.8390720478950319d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 138);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 138.00002f + "'", float1 == 138.00002f);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.017453292519943295d, (-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5574077246549023d) + "'", double2 == (-1.5574077246549023d));
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(52.000004f, (-149.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-52.000004f) + "'", float2 == (-52.000004f));
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0001761935342754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7616681427904104d + "'", double1 == 0.7616681427904104d);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        double double1 = org.apache.commons.math3.util.FastMath.tan(35.00000381469727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47381939152118935d + "'", double1 == 0.47381939152118935d);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7724538509055159d + "'", double1 == 1.7724538509055159d);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.5049299045672764d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.591783121186793E31d + "'", double2 == 6.591783121186793E31d);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5327963125236284E304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 700.4129619927088d + "'", double1 == 700.4129619927088d);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-5.3014591923809045d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00498431552268554d + "'", double1 == 0.00498431552268554d);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.105427357601002E-15d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-44.3614195558365d) + "'", double1 == (-44.3614195558365d));
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 7, (-0.99999994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.545972E30f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-126.99999f), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-126.99999f) + "'", float2 == (-126.99999f));
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837747656337245d) + "'", double1 == (-0.008837747656337245d));
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32L, 5.545972E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.545972E30f + "'", float2 == 5.545972E30f);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-6), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.6144206905127136d, 91.45317136336229d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.45317136336229d + "'", double2 == 91.45317136336229d);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1025.0d + "'", double1 == 1025.0d);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.9E-324d) + "'", double1 == (-4.9E-324d));
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.549839933542756E-4d) + "'", double1 == (-2.549839933542756E-4d));
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(53248.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53248.0f + "'", float2 == 53248.0f);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-97.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41032129904824216d + "'", double1 == 0.41032129904824216d);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(148.4131591025766d, 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.438801799115821d, 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.452146029569111d + "'", double2 == 1.452146029569111d);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (short) 100, 3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5553480614894135d + "'", double2 == 3.5553480614894135d);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7276.563998161455d + "'", double1 == 7276.563998161455d);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        long long1 = org.apache.commons.math3.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '#', (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.5f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.6952633082705699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7687861752511085d + "'", double1 == 0.7687861752511085d);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1168694296386497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8405507891024043d + "'", double1 == 0.8405507891024043d);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-148.99999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22374095013561138d) + "'", double1 == (-0.22374095013561138d));
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0272356433040997d + "'", double1 == 0.0272356433040997d);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        double double2 = org.apache.commons.math3.util.FastMath.max(11013.232874703393d, 0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703393d + "'", double2 == 11013.232874703393d);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(5729.578400155824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1024);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1024L + "'", long1 == 1024L);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        float float2 = org.apache.commons.math3.util.FastMath.max((-52.000004f), (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        float float2 = org.apache.commons.math3.util.FastMath.min(15.000001f, 52.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.000001f + "'", float2 == 15.000001f);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        int int1 = org.apache.commons.math3.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }
}

