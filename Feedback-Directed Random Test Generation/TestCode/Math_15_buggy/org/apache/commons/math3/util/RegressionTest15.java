package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

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
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.0872902135394655d, 1.3383347192043076E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.124202398230408E-43d + "'", double2 == 8.124202398230408E-43d);
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        long long2 = org.apache.commons.math3.util.FastMath.max(22025L, 61944147371L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61944147371L + "'", long2 == 61944147371L);
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 2.09E-43f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.668970750059695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5423445972342054d + "'", double1 == 1.5423445972342054d);
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 32, 2147483648L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.7331672126158295d), 175);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.5735411863141905E-24d) + "'", double2 == (-2.5735411863141905E-24d));
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-101.04822696504081d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7636242638424793d) + "'", double1 == (-1.7636242638424793d));
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.3678794630987664d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 99, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-9223372036854775808L), (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.223372E18f) + "'", float2 == (-9.223372E18f));
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 8L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0000857660011895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5402301342795646d + "'", double1 == 0.5402301342795646d);
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(10.000002f, 1.1884224E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000002f + "'", float2 == 10.000002f);
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9352688996691373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9670930150037985d + "'", double1 == 0.9670930150037985d);
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) (-13));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.6109948509855884E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6109948509855884E-13d + "'", double1 == 1.6109948509855884E-13d);
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.11812448149071139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.136016282674487d) + "'", double1 == (-2.136016282674487d));
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9678957951470605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-36.51480610569081d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        double double1 = org.apache.commons.math3.util.FastMath.tan(35.764957001820996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6299036625652747d + "'", double1 == 2.6299036625652747d);
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.0027321120508483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5462971792701188d + "'", double1 == 1.5462971792701188d);
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.294967296E9d, 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1602900942795302d + "'", double2 == 0.1602900942795302d);
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.3788101090755207d, (double) 53248.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3788101090755207d + "'", double2 == 1.3788101090755207d);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.53680964411134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026822388266145167d + "'", double1 == 0.026822388266145167d);
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.103803694866161d, 2.71828215250351d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1038036948661616d + "'", double2 == 2.1038036948661616d);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 144, (long) 63);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        int int2 = org.apache.commons.math3.util.FastMath.min((-3), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-100));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-100L) + "'", long1 == (-100L));
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2924316695611777d + "'", double1 == 2.2924316695611777d);
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        int int2 = org.apache.commons.math3.util.FastMath.max(1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.4576E7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4576E7f + "'", float1 == 2.4576E7f);
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1500L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000000000000004d + "'", double1 == 2.0000000000000004d);
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        int int1 = org.apache.commons.math3.util.FastMath.round(749.99994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 750 + "'", int1 == 750);
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.0823734317612075d), 6.8200151728564355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0823734317612075d) + "'", double2 == (-1.0823734317612075d));
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 5.820766E-11f, 33.418366853490404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.820766091346741E-11d + "'", double2 == 5.820766091346741E-11d);
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-32.57791748631743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.0d) + "'", double1 == (-33.0d));
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(11883.891508581362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0551539859229482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        int int1 = org.apache.commons.math3.util.FastMath.round(22025.998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22026 + "'", int1 == 22026);
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(16.93539593942879d, (-2.549839933542756E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708113830707726d + "'", double2 == 1.5708113830707726d);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.112963841460668E31d, 40);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.973642758047122E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.97364275804712E-8d + "'", double1 == 3.97364275804712E-8d);
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.2456317406686555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0759610632151153d + "'", double1 == 1.0759610632151153d);
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.7453293851523843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000762939455d + "'", double1 == 100.00000762939455d);
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5446174307243075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2363925013647d + "'", double1 == 2.2363925013647d);
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 11.999999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.000070482837111d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        float float2 = org.apache.commons.math3.util.FastMath.min(108.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.29191991346996E54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7175316273126001d + "'", double1 == 0.7175316273126001d);
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.1691265E29f, 131072.02f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1691265E29f + "'", float2 == 3.1691265E29f);
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0124843102732668d, 0.9292551640092286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0124843102732666d + "'", double2 == 1.0124843102732666d);
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 187, 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(15.851614849324065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5714470418077833d, (double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.317620524241511E-10d + "'", double2 == 7.317620524241511E-10d);
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2.376845E32f, 35.74434308084387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.598430891781625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8426967805898358d + "'", double1 == 0.8426967805898358d);
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.16267372390397128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.320517817373968d + "'", double1 == 9.320517817373968d);
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3663468017587768d + "'", double1 == 1.3663468017587768d);
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.235329763979993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2353297639799932d + "'", double1 == 1.2353297639799932d);
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-148.99997f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.99996948242188d + "'", double1 == 148.99996948242188d);
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 5.40432E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5d + "'", double1 == 0.5d);
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        double double2 = org.apache.commons.math3.util.FastMath.log(1501.9344625450144d, (double) (-2.09E-43f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.3383347192042886E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 2.09E-43f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.025822755842440984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02582562653620525d + "'", double1 == 0.02582562653620525d);
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(101.04822696504083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8340465493115973E43d + "'", double1 == 3.8340465493115973E43d);
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 75, (long) (-149));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-149L) + "'", long2 == (-149L));
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.2491947060601294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.57358444733086d + "'", double1 == 71.57358444733086d);
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.9333634218998555d), (double) 750.00006f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9333634218998555d) + "'", double2 == (-0.9333634218998555d));
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        double double1 = org.apache.commons.math3.util.FastMath.atan(22.248701292912614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258801131414248d + "'", double1 == 1.5258801131414248d);
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.01240157071850156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01240157071850156d + "'", double1 == 0.01240157071850156d);
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9875707883942624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-18.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.999999999999996d) + "'", double1 == (-17.999999999999996d));
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.0000001f, 1024.0001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-14));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.1760913650845946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4293757289532156d + "'", double1 == 1.4293757289532156d);
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.5437283808052962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-1022.99994f), (-0.09220376963371194d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1022.9999389648436d) + "'", double2 == (-1022.9999389648436d));
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(6.811682183676626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.055620329093743d + "'", double1 == 2.055620329093743d);
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(92.11639988914972d, (-1.3237334981628701d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5851655638965927d + "'", double2 == 1.5851655638965927d);
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.5673717388783177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02735579744613546d) + "'", double1 == (-0.02735579744613546d));
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9754659633069416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5607823139334169d + "'", double1 == 0.5607823139334169d);
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        double double1 = org.apache.commons.math3.util.FastMath.exp(17.894443933771722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.908241749342274E7d + "'", double1 == 5.908241749342274E7d);
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9640275800758169d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.8686736438028053d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.408554367752175d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5707935868818308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810464200693579d + "'", double1 == 4.810464200693579d);
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.147124287800051E46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.6698790550935152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029144887621473627d + "'", double1 == 0.029144887621473627d);
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.9073486E-6f, (-3.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9073486E-6f) + "'", float2 == (-1.9073486E-6f));
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(32.00001402957443d, 0.9056071494359416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.012825901536246d + "'", double2 == 32.012825901536246d);
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.6578630036664289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5818829705452302d) + "'", double1 == (-0.5818829705452302d));
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        int int1 = org.apache.commons.math3.util.FastMath.abs(75);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 75 + "'", int1 == 75);
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.24548152128728426d), (-2.5735411863141905E-24d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.24548152128728426d) + "'", double2 == (-0.24548152128728426d));
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-12L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        int int2 = org.apache.commons.math3.util.FastMath.min(149, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.8808135922807914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2743457546915395d + "'", double1 == 0.2743457546915395d);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        int int2 = org.apache.commons.math3.util.FastMath.min(52, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 22026, (long) 128);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 128L + "'", long2 == 128L);
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.3625831891367726E215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 496.52885935020964d + "'", double1 == 496.52885935020964d);
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9483398404364088d, (-45.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.120521553928585d + "'", double2 == 3.120521553928585d);
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.7712889028347941d), 0.00140198023312869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7712901770311058d + "'", double2 == 0.7712901770311058d);
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 5.8058397E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9999998807907104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453290439348693d + "'", double1 == 0.017453290439348693d);
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 10, (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.2779475125273763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1872174681517649d + "'", double1 == 1.1872174681517649d);
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.835406085372415d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1024L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.03165064858562794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031640086111471344d) + "'", double1 == (-0.031640086111471344d));
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9997926233378113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7177181786924947d + "'", double1 == 1.7177181786924947d);
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        float float1 = org.apache.commons.math3.util.FastMath.abs(152576.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 152576.0f + "'", float1 == 152576.0f);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.6519950360895284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7948748463561401d + "'", double1 == 0.7948748463561401d);
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.646977960169689E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.646977960169689E-23d + "'", double1 == 2.646977960169689E-23d);
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.193615433083745d, (double) 1018.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.267964697122677d, 0.4374925441739296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2679646971226768d + "'", double2 == 1.2679646971226768d);
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5707962971309473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.9999983003809d + "'", double1 == 89.9999983003809d);
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(38.025003373828866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.331218159986756d + "'", double1 == 4.331218159986756d);
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        double double1 = org.apache.commons.math3.util.FastMath.tan(328280.72538175905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0010448939893813872d + "'", double1 == 0.0010448939893813872d);
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5705893062276597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5705893062276597d + "'", double1 == 1.5705893062276597d);
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (-4.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        long long2 = org.apache.commons.math3.util.FastMath.min(17L, (long) 23);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.784919240787009E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.784919058198862E-4d + "'", double1 == 4.784919058198862E-4d);
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 5.877473E-39f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.877473155409902E-39d + "'", double1 == 5.877473155409902E-39d);
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        double double2 = org.apache.commons.math3.util.FastMath.pow(89.40934278535332d, 1.5442545888816204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1031.411577317404d + "'", double2 == 1031.411577317404d);
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.17260366972569707d), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        double double1 = org.apache.commons.math3.util.FastMath.asin(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-14), 19.999996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.102E-42f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0842022E-19f + "'", float1 == 1.0842022E-19f);
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 7.555787E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.37233302232507d + "'", double1 == 53.37233302232507d);
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 40, 13.394771571571138d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.999996f + "'", float2 == 39.999996f);
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.15320675349590304d, 0.12487556775313036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15320675349590304d + "'", double2 == 0.15320675349590304d);
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 15L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.9999875783251015d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0041442383211276d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.15987052369731924d, 91.45317136336227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.45331109916607d + "'", double2 == 91.45331109916607d);
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.2710663101885897d, 0.41031030614622616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011416138981219515d) + "'", double2 == (-0.011416138981219515d));
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.15919038274063185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.172561160839341d + "'", double1 == 1.172561160839341d);
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.801734439119775d, 2.2894284851066637d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9133708616528797d + "'", double2 == 2.9133708616528797d);
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-4), 127L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-2.7787262E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.833235452775604d) + "'", double1 == (-17.833235452775604d));
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.02654173791358725d, 0.3155379877120162d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026541737913587254d + "'", double2 == 0.026541737913587254d);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0384596E34f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 113 + "'", int1 == 113);
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.7031839360032603E-108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7031839360032603E-108d) + "'", double1 == (-1.7031839360032603E-108d));
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 127L, (double) (-1.9843746f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.0d + "'", double2 == 127.0d);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 62.0f, (-0.8886168046158662d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.025541748500633312d + "'", double2 == 0.025541748500633312d);
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.4280173086891232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6201605292514591d + "'", double1 == 1.6201605292514591d);
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-6.0f), (-0.07552869653363556d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.9999995f) + "'", float2 == (-5.9999995f));
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.6207413942088964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8673958914208877d) + "'", double1 == (-0.8673958914208877d));
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.01327398611765252d, (-43.62207155902897d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01327398611765252d + "'", double2 == 0.01327398611765252d);
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.33749774856093107d, 1.1641303166053958d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2823877351287914d + "'", double2 == 0.2823877351287914d);
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5365729180004349d) + "'", double1 == (-0.5365729180004349d));
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 18, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1.9843745f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0393938154819877d + "'", double1 == 2.0393938154819877d);
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1.1529215E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0122276272436452E16d + "'", double1 == 2.0122276272436452E16d);
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.5018895836882269d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.794699111476132d) + "'", double1 == (-0.794699111476132d));
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 5.4043196E16f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 54043195528445952L + "'", long1 == 54043195528445952L);
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9999875783251015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182480630556016d + "'", double1 == 2.7182480630556016d);
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        double double1 = org.apache.commons.math3.util.FastMath.log10(200.3351263076086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3017571041816596d + "'", double1 == 2.3017571041816596d);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9914771161824055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.80745424105381d + "'", double1 == 56.80745424105381d);
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.8189894E-12f + "'", float1 == 1.8189894E-12f);
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(96.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5788569702133275d + "'", double1 == 4.5788569702133275d);
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9706244805940946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.0092655367037576E-36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.038197183512634486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03817862287847749d + "'", double1 == 0.03817862287847749d);
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5716961944464807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5705893062276597d, 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705893062276597d + "'", double2 == 1.5705893062276597d);
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        long long2 = org.apache.commons.math3.util.FastMath.max(53248L, 128L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53248L + "'", long2 == 53248L);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.76034803810641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 5447015486L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.447015485999999E9d + "'", double2 == 5.447015485999999E9d);
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.5483703652841707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.908241749342274E7d, (-0.09731253940776538d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17528294529134433d + "'", double2 == 0.17528294529134433d);
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, 53248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-3.0948501E26f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0948500982134507E26d) + "'", double1 == (-3.0948500982134507E26d));
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0124843102732668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6993699341426841d + "'", double1 == 0.6993699341426841d);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.4425149084880988d, 0.9999806514771749d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.28093363621104E-5d) + "'", double2 == (-5.28093363621104E-5d));
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.5403023058682972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058682973d + "'", double1 == 0.5403023058682973d);
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 2.376845E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6028797018963968E16d + "'", double1 == 3.6028797018963968E16d);
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.970566590482209E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        long long2 = org.apache.commons.math3.util.FastMath.min(54L, (long) 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.007245784937053269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0072456581364313665d + "'", double1 == 0.0072456581364313665d);
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        double double2 = org.apache.commons.math3.util.FastMath.log(8.973831323390355E-4d, 0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5172160209448105d + "'", double2 == 0.5172160209448105d);
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-13));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3513346877207577d) + "'", double1 == (-2.3513346877207577d));
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.0393938154819877d, 2.288774100786787d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.288774100786787d + "'", double2 == 2.288774100786787d);
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 0.8550811513593496d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.108210104759392E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5045471494343999d) + "'", double1 == (-0.5045471494343999d));
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(15.0f, (double) 2.0769192E34f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.000001f + "'", float2 == 15.000001f);
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.16267372390397128d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16267372390397128d + "'", double1 == 0.16267372390397128d);
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 5.4975581E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0000001192092898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453294600537902d + "'", double1 == 0.017453294600537902d);
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.026541737035255974d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.41032129904822556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9936026854386584d + "'", double1 == 1.9936026854386584d);
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.7325113393608302d, 16.21301914394243d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7325113393608302d + "'", double2 == 3.7325113393608302d);
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3000.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3000.0f + "'", float1 == 3000.0f);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 75.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0147926458308918E33d + "'", double1 == 1.0147926458308918E33d);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        double double2 = org.apache.commons.math3.util.FastMath.min((-2.440356430148375d), 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.440356430148375d) + "'", double2 == (-2.440356430148375d));
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-2.3768449E32f), 0.0026272016841214006d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3768447E32f) + "'", float2 == (-2.3768447E32f));
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1499.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.3132203057100895d + "'", double1 == 7.3132203057100895d);
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.7897890063461337d, 0.9235039398260111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7897890063461337d + "'", double2 == 2.7897890063461337d);
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.7470130562799936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8435577321556793d) + "'", double1 == (-0.8435577321556793d));
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1500.0001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9021813597714503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.483820718218251d + "'", double1 == 1.483820718218251d);
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, (-3.527224344196591d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.527224344196591d) + "'", double2 == (-3.527224344196591d));
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        double double2 = org.apache.commons.math3.util.FastMath.pow(25.75100659895216d, 3.171871484450947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29844.06145328171d + "'", double2 == 29844.06145328171d);
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (-1.9073486E-6f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.0823734317612075d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        long long2 = org.apache.commons.math3.util.FastMath.min(7L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1, 91555L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.031749638761473686d, 10.693080631879683d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.693080631879683d + "'", double2 == 10.693080631879683d);
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(11.093347164296198d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        double double1 = org.apache.commons.math3.util.FastMath.floor(31.984371183438952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.163085598195192d, 0.18387663746222113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1630855981951917d + "'", double2 == 1.1630855981951917d);
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.7636242638424793d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-101.04822696504081d) + "'", double1 == (-101.04822696504081d));
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        int int2 = org.apache.commons.math3.util.FastMath.min((-127), 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.265263931807735d + "'", double1 == 0.265263931807735d);
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.4391749470972324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.011724305106613233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.010255307790662582d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7898888675248745E-4d) + "'", double1 == (-1.7898888675248745E-4d));
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-12.041199774787314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5013608289305436d + "'", double1 == 0.5013608289305436d);
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        long long1 = org.apache.commons.math3.util.FastMath.abs(328281L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 328281L + "'", long1 == 328281L);
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.595196397132241E-32d, 144.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.4280173086891232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440556766460205d + "'", double1 == 1.3440556766460205d);
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(152576.0f, (float) 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 152576.0f + "'", float2 == 152576.0f);
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.6379788E-12f, 1.1884223E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6379788E-12f + "'", float2 == 3.6379788E-12f);
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.999999f), (float) 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(384.426221044271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.0d + "'", double1 == 22026.0d);
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1023.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.7615941559557649d), 7.34269040757198E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707962303827807d) + "'", double2 == (-1.5707962303827807d));
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(27.386127875258307d, 0.15782930550131322d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.386127875258307d + "'", double2 == 27.386127875258307d);
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        int int2 = org.apache.commons.math3.util.FastMath.min(22025, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.063364510108606d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.8626451E-9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.220446E-16f + "'", float1 == 2.220446E-16f);
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        long long1 = org.apache.commons.math3.util.FastMath.round(6.243374546616421E-11d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        float float2 = org.apache.commons.math3.util.FastMath.max(75.00001f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 75.00001f + "'", float2 == 75.00001f);
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        float float2 = org.apache.commons.math3.util.FastMath.max(256.0f, 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 256.0f + "'", float2 == 256.0f);
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5.269871691676145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.19293729440322d + "'", double1 == 97.19293729440322d);
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 2.9360128E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.497733214368157d + "'", double1 == 19.497733214368157d);
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.9999998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        long long2 = org.apache.commons.math3.util.FastMath.max((-41L), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(115.05919655879654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.14274598524894844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14274598524894844d + "'", double1 == 0.14274598524894844d);
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.999999999999999d + "'", double1 == 4.999999999999999d);
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        double double1 = org.apache.commons.math3.util.FastMath.atan(12.035003420284841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4878958005159275d + "'", double1 == 1.4878958005159275d);
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 53248L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53248.004f + "'", float1 == 53248.004f);
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9235039398260111d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23087598495650277d + "'", double2 == 0.23087598495650277d);
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.6109948509855884E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6109948509855884E-13d + "'", double1 == 1.6109948509855884E-13d);
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1291321151650904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5163019408528369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.87770167836293d + "'", double1 == 86.87770167836293d);
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        int int1 = org.apache.commons.math3.util.FastMath.abs(36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.573806628911546d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.00498431552268554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2855802432114244d + "'", double1 == 0.2855802432114244d);
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.7341433604804716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6699514281265647d + "'", double1 == 0.6699514281265647d);
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5705893062276597d, 0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705893062276597d + "'", double2 == 1.5705893062276597d);
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        float float1 = org.apache.commons.math3.util.FastMath.signum(9.6714065E24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        long long2 = org.apache.commons.math3.util.FastMath.max(95L, (long) 75);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95L + "'", long2 == 95L);
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-4L), (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 128L, 7.629366337055335E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4285721902064785d) + "'", double2 == (-2.4285721902064785d));
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-79.0f), 33);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.184986029821366E62d) + "'", double2 == (-4.184986029821366E62d));
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 144);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 144.00002f + "'", float1 == 144.00002f);
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(148.99998f, 1.984375f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 148.99998f + "'", float2 == 148.99998f);
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(12.701627437177594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999814417d + "'", double1 == 0.9999999999814417d);
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0038597321273568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6950751868245029d + "'", double1 == 0.6950751868245029d);
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.7725886626351346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3277614137389286d + "'", double1 == 1.3277614137389286d);
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1023.0f), 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6210082E32f) + "'", float2 == (-1.6210082E32f));
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5707963266113099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.7888705944722437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3276334812831994d + "'", double1 == 1.3276334812831994d);
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.9999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599210248624904d + "'", double1 == 1.2599210248624904d);
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        double double2 = org.apache.commons.math3.util.FastMath.max(3830353.554453491d, (double) 131072.02f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3830353.554453491d + "'", double2 == 3830353.554453491d);
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        long long2 = org.apache.commons.math3.util.FastMath.min(6L, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.9999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.9999998f + "'", float1 == 2.9999998f);
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        float float1 = org.apache.commons.math3.util.FastMath.abs(127.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        double double2 = org.apache.commons.math3.util.FastMath.min(258047.0d, 1.4711276648614138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4711276648614138d + "'", double2 == 1.4711276648614138d);
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        int int2 = org.apache.commons.math3.util.FastMath.max(17, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.5549408655424255d), 0.9948848769417228d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(97.19293729440322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2698187618349674d + "'", double1 == 5.2698187618349674d);
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.5659969E7d, 23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.50795741233152E14d + "'", double2 == 5.50795741233152E14d);
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.092963241182991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5707963267889127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334031175080034d + "'", double1 == 1.2334031175080034d);
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.17702174851391653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.142599071873668d + "'", double1 == 10.142599071873668d);
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 97.000015f, 1.471793136883215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.01118046515612d + "'", double2 == 97.01118046515612d);
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 75.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.733270479283728E32d + "'", double1 == 3.733270479283728E32d);
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.43361281667855023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3601977034040275d + "'", double1 == 0.3601977034040275d);
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.017454177589139353d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017452405451122824d) + "'", double1 == (-0.017452405451122824d));
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.2913289205442933d, 0.15167488020881614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2913289205442933d + "'", double2 == 1.2913289205442933d);
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.37293782932771496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3821732683383738d + "'", double1 == 0.3821732683383738d);
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.39410242298628406d), (-1.5704510598095374d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.39410242298628406d) + "'", double2 == (-0.39410242298628406d));
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 63L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.9914900537226896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.103803694866161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9706725837473859d + "'", double1 == 0.9706725837473859d);
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-4.0f), (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3509887E-38f) + "'", float2 == (-2.3509887E-38f));
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(75.69676347110224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.700388696552714d + "'", double1 == 8.700388696552714d);
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.27418518264208536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1863265471780543E43d, 0.0016057530318482293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.855336392215509E-4d + "'", double2 == 4.855336392215509E-4d);
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9620613237814036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9728899114665712d + "'", double1 == 1.9728899114665712d);
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.996833390848202d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.26310292903031E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.8146972656157483E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146972655972444E-6d + "'", double1 == 3.8146972655972444E-6d);
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.16693720083014163d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16772245730490729d) + "'", double1 == (-0.16772245730490729d));
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.649558242894909d, (-11));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012937296107885298d + "'", double2 == 0.0012937296107885298d);
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(8537.071147449265d, 718052.9999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011888633478172156d + "'", double2 == 0.011888633478172156d);
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.9542141200785643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1023), (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.8343985715979176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.192093037616354E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.35242532392588855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3524253239258886d + "'", double1 == 0.3524253239258886d);
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(175.0006414538025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.1031660031673982E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(89.94404710810622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.192365859934017d + "'", double1 == 5.192365859934017d);
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 113, (-17.999998f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 113.0f + "'", float2 == 113.0f);
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1.19209275E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-57.01243777067935d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8813599054816682d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        double double2 = org.apache.commons.math3.util.FastMath.log((-4.722581482379799E9d), (double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        int int2 = org.apache.commons.math3.util.FastMath.min(75, 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 35, 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8395373E33f + "'", float2 == 2.8395373E33f);
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.6679190596134985d, 0.9057397565936123d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6679190596134985d + "'", double2 == 0.6679190596134985d);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6952633082705699d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-3.011554682704359E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.011554682704359E-5d + "'", double1 == 3.011554682704359E-5d);
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.12099404093087916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002111744389536626d + "'", double1 == 0.002111744389536626d);
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 1.9342812E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5258801131414248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(56.873264042190655d, 1.8996937401571155d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.87326404219065d + "'", double2 == 56.87326404219065d);
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(496.52885935020964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.918595617854619d + "'", double1 == 7.918595617854619d);
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 187, (long) 1025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-22), (-17));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6784668E-4f) + "'", float2 == (-1.6784668E-4f));
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.2139997708197d + "'", double1 == 92.2139997708197d);
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-12), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.17260366972569707d), 1.5705714871469996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705714871469996d + "'", double2 == 1.5705714871469996d);
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 9.2233709E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.416462082982836d) + "'", double1 == (-0.416462082982836d));
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-3.3774879545834167d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-3.0948501E26f), (double) 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8230640525110062d, 0.21791339488786254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9584552842800668d + "'", double2 == 0.9584552842800668d);
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        int int2 = org.apache.commons.math3.util.FastMath.min(13, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 9223372036854775807L, 1.9999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.223839925475233d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        long long1 = org.apache.commons.math3.util.FastMath.abs(9L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        double double1 = org.apache.commons.math3.util.FastMath.signum(31.594603878732343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.60978200584442592E17d) + "'", double1 == (-1.60978200584442592E17d));
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 8192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 142.97737232337548d + "'", double1 == 142.97737232337548d);
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        int int2 = org.apache.commons.math3.util.FastMath.min((-10), 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.999999f, 1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999986f + "'", float2 == 5.9999986f);
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.522697550491263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5845756539673204d + "'", double1 == 3.5845756539673204d);
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.004335786492981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6953127273165528d + "'", double1 == 0.6953127273165528d);
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.4391749470972324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4261581559972684d + "'", double1 == 0.4261581559972684d);
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.7433261306201424d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        long long2 = org.apache.commons.math3.util.FastMath.min((-9223372036854775808L), 20L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9223372036854775808L) + "'", long2 == (-9223372036854775808L));
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        float float2 = org.apache.commons.math3.util.FastMath.max(108.0f, 3.8146977E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 108.0f + "'", float2 == 108.0f);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1023.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0001761935342757d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 18);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2829984568665262E7d + "'", double1 == 3.2829984568665262E7d);
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.8626451E-9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-29) + "'", int1 == (-29));
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.449489742783178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 140.3454242220617d + "'", double1 == 140.3454242220617d);
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4764498148372358E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.34482984476743d + "'", double1 == 56.34482984476743d);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.2233715E18f, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1691263E29f + "'", float2 == 3.1691263E29f);
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1024.0001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-3.944304291006189E-31d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.017452405451122824d), (-0.2058605766631043d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 53248, 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        int int2 = org.apache.commons.math3.util.FastMath.max(22025, 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3669495678698107d + "'", double1 == 1.3669495678698107d);
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1.9843746f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.3768449E32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(86.87770167836293d, (-458));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.167267272770831E-136d + "'", double2 == 1.167267272770831E-136d);
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        double double1 = org.apache.commons.math3.util.FastMath.sin(16.93539593942879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9416275987720248d) + "'", double1 == (-0.9416275987720248d));
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 20L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.0026272016841214006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1379847648958913d + "'", double1 == 0.1379847648958913d);
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.999719987057447d, 328280.7252583891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.04532039237905E-6d + "'", double2 == 3.04532039237905E-6d);
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.991490053722689d, (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.744848763971409E-4d + "'", double2 == 9.744848763971409E-4d);
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 72L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.48528137423857d + "'", double1 == 8.48528137423857d);
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 3.7778932E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.777893186295716E22d + "'", double1 == 3.777893186295716E22d);
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.172561160839341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9217468180081935d + "'", double1 == 0.9217468180081935d);
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.606354165955547d, 0.337497748560931d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6063541659555467d + "'", double2 == 2.6063541659555467d);
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        int int2 = org.apache.commons.math3.util.FastMath.max((-63), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.6920724930525287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5259541048599212d + "'", double1 == 0.5259541048599212d);
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-29));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.965667148572021E12d) + "'", double1 == (-1.965667148572021E12d));
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.4758266482833906E-37d, 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.913811621960548E-34d + "'", double2 == 1.913811621960548E-34d);
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-61944147371L), (-6.338253E29f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1944148E10f) + "'", float2 == (-6.1944148E10f));
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5.269871691676145d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.991490053722689d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.103E-42f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 5L, (float) 58);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        int int2 = org.apache.commons.math3.util.FastMath.max(108, 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0000001192092898d, (-1.1674533972268023E8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0000001192092898d) + "'", double2 == (-1.0000001192092898d));
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-44.55243935826922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5397517683411182d) + "'", double1 == (-0.5397517683411182d));
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        double double1 = org.apache.commons.math3.util.FastMath.log10(19.964889768248362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3002669166754288d + "'", double1 == 1.3002669166754288d);
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.15719598220151057d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15655567643651128d) + "'", double1 == (-0.15655567643651128d));
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(140.3454242220617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.469030353138562E60d + "'", double1 == 4.469030353138562E60d);
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5423445972342054d, 76.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5423445972342054d + "'", double2 == 1.5423445972342054d);
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0842024E-19f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-63) + "'", int1 == (-63));
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5628821893349888E-18d, 138.69314718055995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 138.69314718055995d + "'", double2 == 138.69314718055995d);
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 3.6379788E-12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.629395E-6f, (-0.7208914127261735d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.6293945E-6f + "'", float2 == 7.6293945E-6f);
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.8014959971344089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8014959971344089d + "'", double1 == 1.8014959971344089d);
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.8395373E33f, 1024.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8395373E33f + "'", float2 == 2.8395373E33f);
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-9.0f), 750.00006f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.712409072799656E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.712409072817097E-6d + "'", double1 == 4.712409072817097E-6d);
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.3351068943768114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8004021663287735d + "'", double1 == 2.8004021663287735d);
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-5.4470149E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.111480753557903d) + "'", double1 == (-23.111480753557903d));
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.6600602236808388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7208989266620003d) + "'", double1 == (-0.7208989266620003d));
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.026532393125271468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2982580273683269d + "'", double1 == 0.2982580273683269d);
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.8673958914208877d), (double) (-1.9843745f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8673958914208877d) + "'", double2 == (-0.8673958914208877d));
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-16.999998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 16.999998f + "'", float1 == 16.999998f);
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        double double1 = org.apache.commons.math3.util.FastMath.cos(31.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9147423578045313d + "'", double1 == 0.9147423578045313d);
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(388.0d, 2.816703495911541d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 387.99999999999994d + "'", double2 == 387.99999999999994d);
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-5.9325167282148206E-15d), 1.7412648893537577d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9459101490553132d + "'", double1 == 1.9459101490553132d);
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.2261911708835171d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 53248, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.4965075614664807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.503300998004841d + "'", double1 == 1.503300998004841d);
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        int int2 = org.apache.commons.math3.util.FastMath.max(58, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '4', (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 4294967296L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5664551939031287d, (-0.8390720478950319d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6110605986256412d + "'", double2 == 1.6110605986256412d);
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.03165064858562794d), (double) (-1.9843748f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.984374761581421d) + "'", double2 == (-1.984374761581421d));
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        double double1 = org.apache.commons.math3.util.FastMath.floor(8.602325267042627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4096, (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-565.8964071679023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.271399149115647d) + "'", double1 == (-8.271399149115647d));
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4096.0f, (double) 1024.0001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4095.9998f + "'", float2 == 4095.9998f);
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.9932228461263812d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.026931838645756087d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-22));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22L + "'", long1 == 22L);
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        int int2 = org.apache.commons.math3.util.FastMath.min(6400, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.996833390848202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8397558425555166d) + "'", double1 == (-0.8397558425555166d));
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.231345238091908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.109659965075747d + "'", double1 == 1.109659965075747d);
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.9131200615513249d), (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9131200615513249d) + "'", double2 == (-0.9131200615513249d));
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1500L, (float) (-458));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1500.0f) + "'", float2 == (-1500.0f));
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.006264389542770915d, (-7.623359472495549E-46d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006264389542770914d + "'", double2 == 0.006264389542770914d);
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-61944147371L), 97.01261692195835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.1944147371E10d + "'", double2 == 6.1944147371E10d);
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.40213799685287804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7381167090762502d + "'", double1 == 0.7381167090762502d);
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.05553124655104E14d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.320704855363221d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.38418579101567E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.384185791015647E-7d + "'", double1 == 2.384185791015647E-7d);
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-1500.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.447142425533318d) + "'", double1 == (-11.447142425533318d));
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 22025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.0d + "'", double1 == 22025.0d);
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.155183333204203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4298027965326559d + "'", double1 == 1.4298027965326559d);
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.6855647465563859d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.8488112896435829d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.832824094709035d, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1769717968331717E-6d + "'", double2 == 3.1769717968331717E-6d);
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        long long2 = org.apache.commons.math3.util.FastMath.min(95L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-11), 0.9914771161824055d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.999999f) + "'", float2 == (-10.999999f));
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.389765650634909d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7356613311792525d) + "'", double2 == (-0.7356613311792525d));
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.35242532392588855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006150982269914304d + "'", double1 == 0.006150982269914304d);
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(148.4131591025766d, 430.07458243245395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.41315910257663d + "'", double2 == 148.41315910257663d);
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 750, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-41L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 41L + "'", long1 == 41L);
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 32768.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7615941559557649d, (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.72875599861461d + "'", double2 == 6.72875599861461d);
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-2.3509887E-38f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.350988701644575E-38d) + "'", double1 == (-2.350988701644575E-38d));
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-3.0948500982134507E26d), 10.693080631879683d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0948500982134503E26d) + "'", double2 == (-3.0948500982134503E26d));
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-17));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5272244561999657d) + "'", double1 == (-3.5272244561999657d));
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1018.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9964048291869961d, 0.8114214365648633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.996404829186996d + "'", double2 == 0.996404829186996d);
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, (double) (-11));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5403024061792941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4932168427946843d + "'", double1 == 0.4932168427946843d);
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.361831799193183E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.80272145004768E35d + "'", double1 == 7.80272145004768E35d);
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.058916076536616895d), 0.021824986869035452d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.058916076536616895d) + "'", double2 == (-0.058916076536616895d));
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.2908005164676777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29080051646767774d + "'", double1 == 0.29080051646767774d);
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        double double1 = org.apache.commons.math3.util.FastMath.exp(6.709497185234125E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000671174855635d + "'", double1 == 1.000671174855635d);
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.6795276293349446d, 0.666977646080837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6795276293349446d + "'", double2 == 0.6795276293349446d);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.13235423529153753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3638052161411894d + "'", double1 == 0.3638052161411894d);
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.382026634673881d, 1.9867717001074399d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.382026634673881d + "'", double2 == 4.382026634673881d);
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1.2089257E24f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(7.555788E22f, (float) (-22));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.555788E22f) + "'", float2 == (-7.555788E22f));
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.5685946486297746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999975763076077d + "'", double1 == 0.9999975763076077d);
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(126.99999237060547d, (-2.9405615342893493E8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 126.99999237060545d + "'", double2 == 126.99999237060545d);
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(22025.0f, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4900006E33f + "'", float2 == 3.4900006E33f);
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.3854256169537897d, 328280.725258389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3854256169537897d + "'", double2 == 0.3854256169537897d);
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 7);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        double double1 = org.apache.commons.math3.util.FastMath.exp(16.93539593942879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.264378409705838E7d + "'", double1 == 2.264378409705838E7d);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0000000422840953d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1018.0f, 0.023964666826589657d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1017.99994f + "'", float2 == 1017.99994f);
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.057658467270625d, 11478.35722564624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.057658467270626d + "'", double2 == 5.057658467270626d);
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.5440211108893698d), 26.179943040972688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5440211108893697d) + "'", double2 == (-0.5440211108893697d));
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.17992474214638624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7449091110358109d) + "'", double1 == (-0.7449091110358109d));
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(5.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.02729777739900466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027294387283991216d + "'", double1 == 0.027294387283991216d);
    }
}

