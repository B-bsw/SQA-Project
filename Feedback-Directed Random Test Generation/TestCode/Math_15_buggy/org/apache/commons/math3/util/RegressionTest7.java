package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.0f), 12.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 5447015486L, 0.026931837701290245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1612272431311002d) + "'", double2 == (-0.1612272431311002d));
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.75d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        long long2 = org.apache.commons.math3.util.FastMath.min((-2L), 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.8291319638968807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5932431253020993d + "'", double1 == 0.5932431253020993d);
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        float float2 = org.apache.commons.math3.util.FastMath.max(19.999998f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.999998f + "'", float2 == 19.999998f);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        int int1 = org.apache.commons.math3.util.FastMath.round(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        double double1 = org.apache.commons.math3.util.FastMath.log((-56.83127452036154d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        double double1 = org.apache.commons.math3.util.FastMath.asin(23207.519636520385d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.8991879649199075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46227637316155d + "'", double1 == 0.46227637316155d);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-458));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-458) + "'", int1 == (-458));
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.6448115121396387E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6262876474165445E-23d + "'", double1 == 1.6262876474165445E-23d);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        float float2 = org.apache.commons.math3.util.FastMath.max(1022.99994f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1022.99994f + "'", float2 == 1022.99994f);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 4294967296L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326562066d + "'", double1 == 1.570796326562066d);
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8569259205417066d + "'", double1 == 0.8569259205417066d);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5514298635472507d, 0.6780254335288145d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6679190596134985d + "'", double2 == 0.6679190596134985d);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(22026.0f, 1.0954922813103776d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.998f + "'", float2 == 22025.998f);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.16664239346762777d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0139170048883013d + "'", double1 == 1.0139170048883013d);
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6795639535619324d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.555348061489414d + "'", double1 == 3.555348061489414d);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.027415567780803774d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        long long1 = org.apache.commons.math3.util.FastMath.abs(6L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.0466282343967674d, 0.7168146928204135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2988575544122901d) + "'", double2 == (-0.2988575544122901d));
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        float float2 = org.apache.commons.math3.util.FastMath.min(12.000002f, 1.9843749f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9843749f + "'", float2 == 1.9843749f);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.7355948833786616d), (double) 458L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4781431851220553E200d + "'", double2 == 1.4781431851220553E200d);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.2599210498948732d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1024L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.624619224577892d + "'", double1 == 7.624619224577892d);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1658334890961391E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        double double2 = org.apache.commons.math3.util.FastMath.pow(22026.0d, (double) 75.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) (-106));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-106L) + "'", long2 == (-106L));
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.8828125E-4f, 22026);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 31.999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-18.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1373137123376869d + "'", double1 == 1.1373137123376869d);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4617111047443176d + "'", double1 == 0.4617111047443176d);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1018L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1018L + "'", long1 == 1018L);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.831008000716578E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.69314718055995d + "'", double1 == 52.69314718055995d);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.2058605766631043d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.9131200615513249d), 144);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0363257828322695E43d) + "'", double2 == (-2.0363257828322695E43d));
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.687883945229643d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.8604993868447559d), (double) 5447015486L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5797630630139097E-10d) + "'", double2 == (-1.5797630630139097E-10d));
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        int int2 = org.apache.commons.math3.util.FastMath.min(76, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        int int1 = org.apache.commons.math3.util.FastMath.abs(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(138.00002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1023));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 127);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 51200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.132710668902234d + "'", double1 == 37.132710668902234d);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1500.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 85943.66926962348d + "'", double1 == 85943.66926962348d);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        float float2 = org.apache.commons.math3.util.FastMath.max(52.000004f, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000004f + "'", float2 == 52.000004f);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        float float2 = org.apache.commons.math3.util.FastMath.min((-4.0f), 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 100.0f, (-0.37460659341591257d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.37684487542793E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.0f, 1.565804732394659d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.9999995f + "'", float2 == 6.9999995f);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        double double2 = org.apache.commons.math3.util.FastMath.min((-7.623359472495549E-46d), 4.633495252341099E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.623359472495549E-46d) + "'", double2 == (-7.623359472495549E-46d));
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2979.38053468028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4741259760439713d + "'", double1 == 3.4741259760439713d);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.8414700862537113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9998646693394199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-19.409313714545853d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(7.5557864E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.555787E22f + "'", float1 == 7.555787E22f);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.5797630630139097E-10d), (-149.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.57976306301391E-10d) + "'", double2 == (-1.57976306301391E-10d));
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.3283064365386964E22d, 0.9999983369439447d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999983369439447d + "'", double2 == 0.9999983369439447d);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        float float1 = org.apache.commons.math3.util.FastMath.signum(10.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 6, 1.8996937401571155d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(22026.002f, 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.3383347192042886E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.69314718055996d + "'", double1 == 97.69314718055996d);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 1, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 3.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.8873521996253d + "'", double1 == 171.8873521996253d);
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        int int2 = org.apache.commons.math3.util.FastMath.max(1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.4121184852417566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39090949783528534d + "'", double1 == 0.39090949783528534d);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7433261306201424d + "'", double1 == 1.7433261306201424d);
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.0f, 5.877472E-39f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.877472E-39f + "'", float2 == 5.877472E-39f);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.0174594433763538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003524181127128d + "'", double1 == 1.0003524181127128d);
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7717075948257832d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.27666287087872976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.731673471130767d + "'", double1 == 4.731673471130767d);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1168694296386497d, 1.560487412837878d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.026054000153417d + "'", double2 == 4.026054000153417d);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.802596928649634E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.193615433083745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3759503453871893d + "'", double1 == 1.3759503453871893d);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078964d) + "'", double1 == (-0.8414709848078964d));
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 75);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 75.0f + "'", float1 == 75.0f);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.825487151967882d, 4.505395525898652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.6018115012922545d + "'", double2 == 6.6018115012922545d);
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.002889764289507054d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0000000074505806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (-0.9640275800758169d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(32768.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32768.004f + "'", float1 == 32768.004f);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 9, 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.6293945E-6f + "'", float2 == 7.6293945E-6f);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8052885407089897d), (-458));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1863265471780543E43d + "'", double2 == 1.1863265471780543E43d);
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8768045251087089d, 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2204589790200114E-5d + "'", double2 == 5.2204589790200114E-5d);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.4337808304830271d, 144);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.673635772608993E42d + "'", double2 == 9.673635772608993E42d);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(258048.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(105049.8032003758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.0f), (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.25f) + "'", float2 == (-0.25f));
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(512.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 511.99997f + "'", float2 == 511.99997f);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.9500520559216498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.313136558784551E-27d, (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2.4E-44f, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1911036946760945E-44d + "'", double2 == 1.1911036946760945E-44d);
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 79L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.0d + "'", double1 == 79.0d);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.09265550807355083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.5788897342925496d, 0.8405507891024043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8405507891024043d + "'", double2 == 0.8405507891024043d);
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.4016131876221174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9204315909532462d + "'", double1 == 0.9204315909532462d);
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.058704492638887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.058704492638887d + "'", double1 == 5.058704492638887d);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-6), 1024L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.6354719781306986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.46850959034376d + "'", double1 == 2.46850959034376d);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.4280592992577826E77d, (-0.031634807252392476d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4280592992577826E77d) + "'", double2 == (-1.4280592992577826E77d));
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.16589945506899414d, 1.0771787365603915d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16589945506899414d + "'", double2 == 0.16589945506899414d);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2979.3805346802797d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2979.3805346802797d + "'", double2 == 2979.3805346802797d);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-10L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8731400784750731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0616072162990837d + "'", double1 == 1.0616072162990837d);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.814697720372351E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000038147049963d + "'", double1 == 1.0000038147049963d);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.33749774856093107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.0000005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 458L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0517578E-5f + "'", float1 == 3.0517578E-5f);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.269871691676145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.018940590342241933d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.973642758047122E-8d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.516582543750002E7d + "'", double2 == 2.516582543750002E7d);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.22191504464504894d), (-0.16244735150962653d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.22191504464504894d) + "'", double2 == (-0.22191504464504894d));
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-6), 1.5707963267947769d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 4096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(6.830188762901751E-6d, (double) 22025L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1011072703299664E-10d + "'", double2 == 3.1011072703299664E-10d);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8191520442889918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0698934839162715d + "'", double1 == 1.0698934839162715d);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.15782930550131322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15717486411743792d + "'", double1 == 0.15717486411743792d);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 6400, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6400L + "'", long2 == 6400L);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9426286359925615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8091056466488193d + "'", double1 == 0.8091056466488193d);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.25484119874557287d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(18128.26395102926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18128.263951029265d + "'", double1 == 18128.263951029265d);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.4305321337581916d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.722257605773872E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.722257605773872E-8d + "'", double1 == 4.722257605773872E-8d);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        float float2 = org.apache.commons.math3.util.FastMath.max((-253.99998f), 7.5557864E22f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.5557864E22f + "'", float2 == 7.5557864E22f);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.7782794100389228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.949823557438858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0817453575253018d + "'", double1 == 1.0817453575253018d);
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5707963264277232d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1499.9999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.017459443376353793d, 1.545160918273219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011298952859326998d + "'", double2 == 0.011298952859326998d);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.376845E32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9342813E25f + "'", float1 == 1.9342813E25f);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.0970924770267199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-127));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.9500520559216498d), (double) 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9500520559216498d) + "'", double2 == (-0.9500520559216498d));
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.381888937281653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1274099260468922d) + "'", double1 == (-1.1274099260468922d));
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 12L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        double double1 = org.apache.commons.math3.util.FastMath.log(1029.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.9363427358340495d + "'", double1 == 6.9363427358340495d);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        double double1 = org.apache.commons.math3.util.FastMath.rint(6.666666172839648E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.447015485737373E9d, 79);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.292518830274316E33d + "'", double2 == 3.292518830274316E33d);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.557407724654902d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.23288960379848d) + "'", double1 == (-89.23288960379848d));
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.7185149746194424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 6400);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6400.0d + "'", double1 == 6400.0d);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(32.000004f, 0.33749774856093107d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.545160918273219d, (double) (-54.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.243374546616421E-11d + "'", double2 == 6.243374546616421E-11d);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        int int2 = org.apache.commons.math3.util.FastMath.min((-458), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-458) + "'", int2 == (-458));
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.8715802485510056E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24364487601066484d + "'", double1 == 0.24364487601066484d);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-10.07608628613008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11883.891508581362d + "'", double1 == 11883.891508581362d);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(54.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.0d + "'", double1 == 55.0d);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.108210104759392E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        long long2 = org.apache.commons.math3.util.FastMath.min(4096L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2872214.977727966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9706244805940946d + "'", double1 == 0.9706244805940946d);
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.4696084840113481d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.00262719563966585d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.233403117511217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8620958891185866d + "'", double1 == 1.8620958891185866d);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0853695281061901d + "'", double1 == 1.0853695281061901d);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1024.0000003439764d, 1025);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1025L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1025.0f + "'", float2 == 1025.0f);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3.1691265E29f, 1025);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.0d), 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 0.1425465430742778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.0005f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.2089257E24f, 6.338253E29f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2089257E24f + "'", float2 == 1.2089257E24f);
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0830799868521925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.938917213337377d + "'", double1 == 0.938917213337377d);
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.449489742783178d + "'", double1 == 2.449489742783178d);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.6144206905127136d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.0562853121379475E-37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0562853121379475E-37d + "'", double1 == 3.0562853121379475E-37d);
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        double double2 = org.apache.commons.math3.util.FastMath.max(182.7525636550004d, (double) (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 182.7525636550004d + "'", double2 == 182.7525636550004d);
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9376558078861459d, (double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8812778905541143d, 3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        double double2 = org.apache.commons.math3.util.FastMath.min((-5.026525594659021d), (-0.4103302129827837d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.026525594659021d) + "'", double2 == (-5.026525594659021d));
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.07545690704752087d), 4.633495252341099E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.07545690704752085d) + "'", double2 == (-0.07545690704752085d));
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5327963125236287E304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5327963125236287E304d + "'", double1 == 1.5327963125236287E304d);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        double double1 = org.apache.commons.math3.util.FastMath.asin(182.7525636550004d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.4874710524825647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-58) + "'", int1 == (-58));
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.00140198023312869d, 117341.7564427926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0014019802331286901d + "'", double2 == 0.0014019802331286901d);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1025L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        int int2 = org.apache.commons.math3.util.FastMath.max((-2), 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.2998044433940747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6685791825735485d + "'", double1 == 2.6685791825735485d);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.5832605322327451d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 597.258785006331d + "'", double2 == 597.258785006331d);
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(22.48528964305201d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.621322410763002d + "'", double2 == 5.621322410763002d);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 35.00001f, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.551635497780683E154d + "'", double2 == 2.551635497780683E154d);
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.6378768135265336d, 1.4716190657154942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6378768135265336d + "'", double2 == 1.6378768135265336d);
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        int int2 = org.apache.commons.math3.util.FastMath.max((-106), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.189620006501493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.048008891512491894d) + "'", double1 == (-0.048008891512491894d));
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.6578630036664289d), 11013.232920103323d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 5.648027917416435E219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 100, 53247.996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(750.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0d + "'", double1 == 750.0d);
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 31.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.99999809265137d + "'", double1 == 31.99999809265137d);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(9.580542411316679E-15d, (-54));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.318269386720797E-31d + "'", double2 == 5.318269386720797E-31d);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(10.0d, 328280.7252583891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.864427920919126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03254040588615121d + "'", double1 == 0.03254040588615121d);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        double double1 = org.apache.commons.math3.util.FastMath.exp(268.3983345924218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.66366424019851E116d + "'", double1 == 3.66366424019851E116d);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.73480027861034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2367438401448574d + "'", double1 == 2.2367438401448574d);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-149), 2.0626820368470065d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-148.99998f) + "'", float2 == (-148.99998f));
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.021824986869035452d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2689031827977141E-7d + "'", double2 == 2.2689031827977141E-7d);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        double double1 = org.apache.commons.math3.util.FastMath.acos(8.69927168291248E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707093340779579d + "'", double1 == 1.5707093340779579d);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 3L, (double) (-4.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.0d) + "'", double2 == (-4.0d));
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(18.02648053791345d, 0.6128962765107444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.53680964411134d + "'", double2 == 1.53680964411134d);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.008726646259971648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008726646259971646d) + "'", double1 == (-0.008726646259971646d));
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.5501416712979399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5783152542625629d) + "'", double1 == (-0.5783152542625629d));
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.2676505246703657E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.263102496115639E31d + "'", double1 == 7.263102496115639E31d);
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.010723761948906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7665309945044432d + "'", double1 == 1.7665309945044432d);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-106));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-105.99999f) + "'", float1 == (-105.99999f));
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436354751788103d + "'", double1 == 1.4436354751788103d);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        long long2 = org.apache.commons.math3.util.FastMath.max((-18L), (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.1702617153949575d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 4096L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-10L), 53248.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 106);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.356564024018388d + "'", double1 == 5.356564024018388d);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.27666287087872976d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700771743855d + "'", double1 == 4.594700771743855d);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 9.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.1884223E32f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2169445E35f + "'", float2 == 1.2169445E35f);
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        int int2 = org.apache.commons.math3.util.FastMath.max((-17), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.08737760592421796d, 0.5403024061792941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5403024061792941d + "'", double2 == 0.5403024061792941d);
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.228037402771233d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-5.9999995f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-5.999999f) + "'", float1 == (-5.999999f));
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(29.885930658415557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5635500768149995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5635500768149995d + "'", double1 == 1.5635500768149995d);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        long long2 = org.apache.commons.math3.util.FastMath.min(1024L, (long) 63);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0831933869426666d, 0.9159937224722687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0831933869426666d + "'", double2 == 1.0831933869426666d);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5380269225745904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9956875083454144d + "'", double1 == 0.9956875083454144d);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.03413309100327678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03472230979471843d + "'", double1 == 0.03472230979471843d);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        double double1 = org.apache.commons.math3.util.FastMath.atan(58.224363167035406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5536230742797728d + "'", double1 == 1.5536230742797728d);
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.383362716805521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05905081919747683d + "'", double1 == 0.05905081919747683d);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (-0.5136814478622124d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5136814478622124d + "'", double2 == 0.5136814478622124d);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        double double1 = org.apache.commons.math3.util.FastMath.log(11883.891508581362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.382939107340336d + "'", double1 == 9.382939107340336d);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        double double2 = org.apache.commons.math3.util.FastMath.log((-3.850490314861334d), 0.9998646693394199d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 22026, (float) 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22026.0f + "'", float2 == 22026.0f);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.07156993751100402d, (-0.8414709203988365d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.7561974449853123d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1982426812833557E29d + "'", double2 == 1.1982426812833557E29d);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9169970877394357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.031634807252392476d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031640083996804645d) + "'", double1 == (-0.031640083996804645d));
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) Float.POSITIVE_INFINITY, 2.7185149746194424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.22374095013561138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0000000000000263E148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000131E74d + "'", double1 == 1.0000000000000131E74d);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-9.215236359557623E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6083621582377656E-5d) + "'", double1 == (-1.6083621582377656E-5d));
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-5.3014591923809045d), (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.428926624964046E-45d) + "'", double2 == (-7.428926624964046E-45d));
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.7911843097149078d, 0.9678957951470605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7911843097149079d + "'", double2 == 0.7911843097149079d);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1500.0001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0002f + "'", float1 == 1500.0002f);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1500.0002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(138.0088572840262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0014019802331286901d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 458L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(22025.465794806718d, 1.081221371125345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.465794806718d + "'", double2 == 22025.465794806718d);
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.864427920919126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.289430284648579d) + "'", double1 == (-0.289430284648579d));
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1368683772161603E-13d, (-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1368683772161602E-13d + "'", double2 == 1.1368683772161602E-13d);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 75.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.330733340286331d + "'", double1 == 4.330733340286331d);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.37928799478267644d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3884476551279826d) + "'", double1 == (-0.3884476551279826d));
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7450920600186577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7350254851689573d + "'", double1 == 0.7350254851689573d);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        double double1 = org.apache.commons.math3.util.FastMath.rint(8.587394049396288E-231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(171.8873521996253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.000000238418579d + "'", double1 == 3.000000238418579d);
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2979.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(8.56324762248225E59d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.69314718055995d + "'", double1 == 138.69314718055995d);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.627430214775713E-5d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-47.96018124249531d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.03413309100327678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3774879545834167d) + "'", double1 == (-3.3774879545834167d));
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.8808637063441951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7712889028347941d) + "'", double1 == (-0.7712889028347941d));
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.6679190596134985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6679190596134986d + "'", double1 == 0.6679190596134986d);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        int int2 = org.apache.commons.math3.util.FastMath.min(127, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1025.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        double double2 = org.apache.commons.math3.util.FastMath.log(16.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.38636319993752116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6215812094469404d + "'", double1 == 0.6215812094469404d);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.09252791806716626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09239639582003953d + "'", double1 == 0.09239639582003953d);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(57.29578634327149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.642647781635327E24d + "'", double1 == 7.642647781635327E24d);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        double double2 = org.apache.commons.math3.util.FastMath.max((-30.708115498279298d), 7.629394531250002E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.629394531250002E-6d + "'", double2 == 7.629394531250002E-6d);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5293379817722996d + "'", double1 == 1.5293379817722996d);
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.233403117511217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33102839773286313d + "'", double1 == 0.33102839773286313d);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(6.472984194686474E-35d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.04548581173721E-18d + "'", double1 == 8.04548581173721E-18d);
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        double double1 = org.apache.commons.math3.util.FastMath.asin(6.709497688640471E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.709498192047019E-4d + "'", double1 == 6.709498192047019E-4d);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.970566590482209E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.9999999801317847d), 0.5413248546129181d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1371158949224422d + "'", double2 == 1.1371158949224422d);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(56.873264042190655d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.2058605766631043d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-5.3014591923809045d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-100.31218449629624d) + "'", double1 == (-100.31218449629624d));
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.560487413648653d, 78.6900675259798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.810189733007238d + "'", double2 == 9.810189733007238d);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.709498192047019E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5701253769253511d + "'", double1 == 1.5701253769253511d);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 63, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        float float2 = org.apache.commons.math3.util.FastMath.min(10.0f, 6.9999995f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.9999995f + "'", float2 == 6.9999995f);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        double double1 = org.apache.commons.math3.util.FastMath.abs(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.13608771814969906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3569687047394818d + "'", double1 == 1.3569687047394818d);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-10.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-2.09E-43f), 5.298292365610486d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.07E-43f) + "'", float2 == (-2.07E-43f));
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(8.931287896711864E96d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.807880403871141d, 44.96478087983791d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-17.839398615889458d) + "'", double2 == (-17.839398615889458d));
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        long long2 = org.apache.commons.math3.util.FastMath.max((-18L), (-18L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.27666287087872976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.851614849324065d + "'", double1 == 15.851614849324065d);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(402.4287934927351d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        double double1 = org.apache.commons.math3.util.FastMath.rint(9.580542411316679E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8388608.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.14620091577486963d, (double) (-16.999998f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-16.999998092651367d) + "'", double2 == (-16.999998092651367d));
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 100, 4294967296L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4294967296L + "'", long2 == 4294967296L);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        double double1 = org.apache.commons.math3.util.FastMath.acos(10.000000000000004d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-0.5f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.49999997f) + "'", float1 == (-0.49999997f));
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.24860975225892687d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24611750286723066d) + "'", double1 == (-0.24611750286723066d));
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9706244805940946d, 2.935723255711777E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9706244805940947d + "'", double2 == 0.9706244805940947d);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.22168521914039824d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0024151657987541153d + "'", double2 == 0.0024151657987541153d);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9389941379013969d, 1.8620958891185866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.876755530286335d) + "'", double2 == (-9.876755530286335d));
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.7350254851689573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.6077344731494023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.11639988914972d + "'", double1 == 92.11639988914972d);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.7103239887280342E-12d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.383362716805521d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.7911843097149077d, 22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-13.244927519754937d) + "'", double2 == (-13.244927519754937d));
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(12.378790834633142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3132686642828073d + "'", double1 == 2.3132686642828073d);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.3768448754279146E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3768448754279146E32d + "'", double1 == 2.3768448754279146E32d);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.7363713281677684d), 0.7798115718222205d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.034665567835052E197d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-54.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.2131030729973007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8376078965335373d + "'", double1 == 0.8376078965335373d);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.33879047458320544d, (double) 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33879047458320544d + "'", double2 == 0.33879047458320544d);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.06703019001296902d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06698009627141037d) + "'", double1 == (-0.06698009627141037d));
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(32768.0f, 75);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.23794004E27f + "'", float2 == 1.23794004E27f);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1023L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1023L + "'", long1 == 1023L);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.8547811746108328d), (double) (-10L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8547811746108328d) + "'", double2 == (-0.8547811746108328d));
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        int int1 = org.apache.commons.math3.util.FastMath.abs(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.2699847631416846E296d, 1.192093037616354E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.169280592675679E-8d) + "'", double2 == (-2.169280592675679E-8d));
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.1760912590556813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        int int1 = org.apache.commons.math3.util.FastMath.round((-3.9999998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4583.662361046586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9969063677702439d) + "'", double1 == (-0.9969063677702439d));
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.970566590482209E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.68838516781345d + "'", double1 == 105.68838516781345d);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.004335786492981d, (double) 75.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 75.0067243010387d + "'", double2 == 75.0067243010387d);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1023L, (-97.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.0f) + "'", float2 == (-1023.0f));
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        float float2 = org.apache.commons.math3.util.FastMath.min((-6.338253E29f), 53247.996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.338253E29f) + "'", float2 == (-6.338253E29f));
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.1760912590556813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2657697715420921d + "'", double1 == 1.2657697715420921d);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(53248.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.882734304052615d + "'", double1 == 10.882734304052615d);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1024.9999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.9999f + "'", float1 == 1024.9999f);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 22026.0f, 0.8611867780249577d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01494441826103511d) + "'", double2 == (-0.01494441826103511d));
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(39.803104571515284d, 0.008949316167871405d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705714871469996d + "'", double2 == 1.5705714871469996d);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662191695169728d + "'", double1 == 0.5662191695169728d);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.3915327099543454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39153270995434547d + "'", double1 == 0.39153270995434547d);
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 148.99998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.697082123150881d + "'", double1 == 5.697082123150881d);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-5.877472E-39f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        int int2 = org.apache.commons.math3.util.FastMath.max((-458), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-44.3614195558365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.548258033850413d) + "'", double1 == (-1.548258033850413d));
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.8547811746108328d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.014618380254197412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8375714918828912d + "'", double1 == 0.8375714918828912d);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(12.000002f, 1025.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.000002f + "'", float2 == 12.000002f);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-10), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.16125382097679095d, 3.5855175597800497d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6997588155238473d) + "'", double2 == (-0.6997588155238473d));
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        double double1 = org.apache.commons.math3.util.FastMath.cos(97.69314718055996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9542141200785643d) + "'", double1 == (-0.9542141200785643d));
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.0f, 9.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-5.9999995f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.999999523162841d) + "'", double1 == (-5.999999523162841d));
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.1578506894064046d), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.3351006179351295d) + "'", double2 == (-6.3351006179351295d));
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        double double1 = org.apache.commons.math3.util.FastMath.log(17.894443933771722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8844902699029284d + "'", double1 == 2.8844902699029284d);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.1578506894064046d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15719598220151057d) + "'", double1 == (-0.15719598220151057d));
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 0, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(138.0088572840262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2L, (-0.5514753400485246d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6823220100278267d + "'", double2 == 0.6823220100278267d);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(75.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 75.00001f + "'", float1 == 75.00001f);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(52.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000008f + "'", float1 == 52.000008f);
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(7.2247201030232695d, (-4.323362308933902d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.419503680225981d + "'", double2 == 8.419503680225981d);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7561974449853123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6474556889270412d + "'", double1 == 0.6474556889270412d);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.9498235574388578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.584873353677999d + "'", double1 == 3.584873353677999d);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.401298464324817E-45d, 14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        long long2 = org.apache.commons.math3.util.FastMath.min(15L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.8517762794017062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3852314045529424d + "'", double1 == 1.3852314045529424d);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.1578293055013132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9875707883942624d + "'", double1 == 0.9875707883942624d);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.389765650634909d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (-0.0038417443621884145d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.023667627328711145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023665418289289288d + "'", double1 == 0.023665418289289288d);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.9999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        long long2 = org.apache.commons.math3.util.FastMath.min((-2L), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0644306856851378d, 76);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 115.05919655879654d + "'", double2 == 115.05919655879654d);
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.739913065842745E-6d, 2.3025849976266093d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.739913065842745E-6d + "'", double2 == 2.739913065842745E-6d);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        long long2 = org.apache.commons.math3.util.FastMath.min(1025L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 12.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-32.57791748631743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.57791748631743d + "'", double1 == 32.57791748631743d);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0113951599323715E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.9520523170857447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        float float1 = org.apache.commons.math3.util.FastMath.abs(7.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.666666172839648E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.038197183512634486d + "'", double1 == 0.038197183512634486d);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1024.0137072356283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.624632610454212d + "'", double1 == 7.624632610454212d);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-105.99999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-4.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0124843102732668d, 0.4617111047443176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0124843102732666d + "'", double2 == 1.0124843102732666d);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.8648790814947103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.782532834469048d) + "'", double1 == (-0.782532834469048d));
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        double double1 = org.apache.commons.math3.util.FastMath.abs(53.80040108927525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.80040108927525d + "'", double1 == 53.80040108927525d);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        double double2 = org.apache.commons.math3.util.FastMath.max(1759.4875643140501d, 1.2913289205442933d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1759.4875643140501d + "'", double2 == 1759.4875643140501d);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.2032471075153308d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        long long2 = org.apache.commons.math3.util.FastMath.min(12L, (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9223372036854775808L) + "'", long2 == (-9223372036854775808L));
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3841858E-7f + "'", float2 == 2.3841858E-7f);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        double double1 = org.apache.commons.math3.util.FastMath.sin(53.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39592515018183416d + "'", double1 == 0.39592515018183416d);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-126.999985f), 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-126.99998f) + "'", float2 == (-126.99998f));
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 6, (long) 144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0192837000737716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.566031181432495d + "'", double1 == 1.566031181432495d);
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.03079207E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8192.0f + "'", float1 == 8192.0f);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.389765650634909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.22168521914039824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21987391348109833d + "'", double1 == 0.21987391348109833d);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        int int2 = org.apache.commons.math3.util.FastMath.min(14, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(750.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.313219942645561d + "'", double1 == 7.313219942645561d);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5483703652841707d + "'", double1 == 0.5483703652841707d);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-4.323362308933902d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        long long2 = org.apache.commons.math3.util.FastMath.max(4294967296L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4294967296L + "'", long2 == 4294967296L);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9159937224722687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.33879047458320544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005913009255871099d + "'", double1 == 0.005913009255871099d);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.642647781635327E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        double double2 = org.apache.commons.math3.util.FastMath.log(5.2204589790200114E-5d, 4096.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8435577321556793d) + "'", double2 == (-0.8435577321556793d));
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.4515827052894548d, (-0.228037402771233d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.228037402771233d) + "'", double2 == (-0.228037402771233d));
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.035211118248524166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.01744846757651d + "'", double1 == 2.01744846757651d);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        float float2 = org.apache.commons.math3.util.FastMath.min(97.000015f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.4374925441739296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 12.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-18));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.0572141123059735d), 1.627430214775713E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0572141123059735d + "'", double2 == 0.0572141123059735d);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        int int2 = org.apache.commons.math3.util.FastMath.max((-58), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.17889431650439688d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-52.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-52.0d) + "'", double1 == (-52.0d));
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.163085598195192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020299673171033917d + "'", double1 == 0.020299673171033917d);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        int int2 = org.apache.commons.math3.util.FastMath.min((-17), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.515287744883901E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62939453125E-6d + "'", double1 == 7.62939453125E-6d);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (short) 100, 1.3076604860118306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6178030631008742d + "'", double2 == 0.6178030631008742d);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.648027917416435E219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.648027917416435E219d + "'", double1 == 5.648027917416435E219d);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.4280592992577826E77d), 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4280592992577826E77d) + "'", double2 == (-1.4280592992577826E77d));
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(37.132710668902234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.64808806136277d + "'", double1 == 0.64808806136277d);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        int int1 = org.apache.commons.math3.util.FastMath.round(52.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 4096L, 1.6370408237133427d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4095.9998f + "'", float2 == 4095.9998f);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 32.0f, 18128.263951029265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        double double2 = org.apache.commons.math3.util.FastMath.log(10.693080631879683d, (-0.913120061551325d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.7208914127261735d), 2.993222750278501d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.993222750278501d + "'", double2 == 2.993222750278501d);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-58));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 58 + "'", int1 == 58);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8291319638968807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9105668365896491d + "'", double1 == 0.9105668365896491d);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.8556837405048565d, 1.0726495045964528d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.8556837405048565d + "'", double2 == 6.8556837405048565d);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-18), (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014644560842127431d) + "'", double1 == (-0.014644560842127431d));
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1024.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        int int2 = org.apache.commons.math3.util.FastMath.min(58, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 63L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 144);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 144L + "'", long1 == 144L);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-6));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 4096);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(35.74434308084387d, (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.74434308084386d + "'", double2 == 35.74434308084386d);
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.952895810720043E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.644433940529861E10d + "'", double1 == 8.644433940529861E10d);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5698197646053376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0817453575253018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02741900222769117d) + "'", double1 == (-0.02741900222769117d));
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.09937288259301753d, 1.4696084840113481d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09937288259301753d + "'", double2 == 0.09937288259301753d);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.8844902699029284d, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.233070557154263E-9d + "'", double2 == 5.233070557154263E-9d);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(35.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.0194839173657902E-28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0194839173657902E-28d + "'", double1 == 2.0194839173657902E-28d);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(75.00001f, 1.0000000397364284d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 75.0f + "'", float2 == 75.0f);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) -1, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.001725492874692366d), 102.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4626599322445797E-282d + "'", double2 == 1.4626599322445797E-282d);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.32668391545583547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3155379877120162d + "'", double1 == 0.3155379877120162d);
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        int int2 = org.apache.commons.math3.util.FastMath.max((-54), (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.999999940395355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 750, 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-5.9999995f), (-0.682208564883936d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.8750612633917d, (-30.708115498279298d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0482393344835197d + "'", double2 == 3.0482393344835197d);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(18.582769399647436d, 20.500218349388472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9174489497410363d) + "'", double2 == (-1.9174489497410363d));
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.7031839360032603E-108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-10.178715679155326d), 5.049999527931213d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.005970039541977278d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.576766401800843d + "'", double1 == 1.576766401800843d);
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.6483608274590866d, (-7.428926624964046E-45d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        double double1 = org.apache.commons.math3.util.FastMath.exp(223.17520542459923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.389966244511489E96d + "'", double1 == 8.389966244511489E96d);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0230833853373482d, 1.5060119336077026E83d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0230833853373484d + "'", double2 == 1.0230833853373484d);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.026544854745010848d, 3.153770189511292E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026544854745010848d + "'", double2 == 0.026544854745010848d);
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.8190930489946614E-4d, 0.2092794124576321d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1913505432171244d + "'", double2 == 0.1913505432171244d);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-97.0f), (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-12.125f) + "'", float2 == (-12.125f));
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0317125014678934d, 1.04060401E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0317125014678934d + "'", double2 == 1.0317125014678934d);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 111.70107212763709d + "'", double1 == 111.70107212763709d);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.014811373879680489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }
}

