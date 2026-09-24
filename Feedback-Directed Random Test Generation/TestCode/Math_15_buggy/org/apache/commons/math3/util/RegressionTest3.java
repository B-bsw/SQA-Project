package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.0d, 1.3187334977903953E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3187334977903953E21d + "'", double2 == 1.3187334977903953E21d);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.1622776601683795d, (double) 4096.001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.2247201030232695d + "'", double2 == 7.2247201030232695d);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.0026272016841214006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0026306558026923d + "'", double1 == 1.0026306558026923d);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.15052756842981832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16244735150962653d + "'", double1 == 0.16244735150962653d);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.7713898455600543E306d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1018 + "'", int1 == 1018);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 10, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-1023));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0954922813103776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019119947239050028d + "'", double1 == 0.019119947239050028d);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453293851523841d + "'", double1 == 1.7453293851523841d);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.8146977E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(6.8556837405048565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8996937401571155d + "'", double1 == 1.8996937401571155d);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        float float1 = org.apache.commons.math3.util.FastMath.signum(100.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.71828215250351d + "'", double1 == 2.71828215250351d);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 127, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-1023));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.07608628613008d) + "'", double1 == (-10.07608628613008d));
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(9.849160264910656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.11052961946631416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9565213251730015d) + "'", double1 == (-0.9565213251730015d));
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536743164063946E-7d + "'", double1 == 9.536743164063946E-7d);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.2599210498948732d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        double double1 = org.apache.commons.math3.util.FastMath.sin(223.23772953327423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18360360379727975d) + "'", double1 == (-0.18360360379727975d));
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        long long2 = org.apache.commons.math3.util.FastMath.min(97L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-6));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        double double1 = org.apache.commons.math3.util.FastMath.log(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.8370630725347682d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.942437867146782d) + "'", double1 == (-0.942437867146782d));
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.192093E-7f + "'", float1 == 1.192093E-7f);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15853338004399595d) + "'", double1 == (-0.15853338004399595d));
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        double double2 = org.apache.commons.math3.util.FastMath.min(5730.0d, 0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065102d + "'", double2 == 0.8342233605065102d);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(223.23772953327423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.465643948356059E96d + "'", double1 == 4.465643948356059E96d);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 203.18733465192955d + "'", double1 == 203.18733465192955d);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.7853981633974483d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-44.3614195558365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9289897956534603d + "'", double1 == 0.9289897956534603d);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.942437867146782d), 1024.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.313136558784551E-27d + "'", double2 == 4.313136558784551E-27d);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.5413248546129181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5681525607948594d + "'", double1 == 0.5681525607948594d);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 10, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(96.99999f, (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.6669829823489768d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0995616862503343d) + "'", double1 == (-1.0995616862503343d));
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000074505806d + "'", double1 == 1.0000000074505806d);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.95177979919759d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.95177979919759d + "'", double2 == 5.95177979919759d);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 7L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.8808637063441951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 7, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 149.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.4E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.666665679012609E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.668888394485652E-4d + "'", double1 == 6.668888394485652E-4d);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 0, 1018);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        int int1 = org.apache.commons.math3.util.FastMath.abs(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(12.701627437177594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.617514616813844d + "'", double1 == 2.617514616813844d);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(7276.563998161455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.377992543417857d + "'", double1 == 19.377992543417857d);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.52587890625E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4016131876221174d) + "'", double1 == (-0.4016131876221174d));
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 0, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.993222750278501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.000000000000004E10d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1023), (float) 15L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        double double2 = org.apache.commons.math3.util.FastMath.max(138.0088572840262d, 19010.49395704137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19010.49395704137d + "'", double2 == 19010.49395704137d);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9342812E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 100L, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        int int2 = org.apache.commons.math3.util.FastMath.max(7, (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.09252791806716626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-9.223372036854776E18d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(223.23772953327423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.066281120220074d + "'", double1 == 6.066281120220074d);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 10, (long) (-149));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-149L) + "'", long2 == (-149L));
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 9.536743E-7f, (-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008837747656337245d) + "'", double2 == (-0.008837747656337245d));
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000004f + "'", float1 == 32.000004f);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0000000000000284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 15.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999998128d + "'", double1 == 0.9999999999998128d);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.662514762151963d, 0.8149601367384811d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0325944886750007d + "'", double2 == 0.0325944886750007d);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-57.29577951308232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6519950360895284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.562922473770796d), 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.256230992860951E225d) + "'", double2 == (-9.256230992860951E225d));
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.016451973321653327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998646693394199d + "'", double1 == 0.9998646693394199d);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.0995616862503343d), 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.722581482379799E9d) + "'", double2 == (-4.722581482379799E9d));
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.814697720372351E-6d, 0.7450729502920265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.119898284918105E-6d + "'", double2 == 5.119898284918105E-6d);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(15.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-3));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.666666666666754E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1500);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        double double1 = org.apache.commons.math3.util.FastMath.asin(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 35.000008f, 0.5066812382891345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5563207343123242d + "'", double2 == 1.5563207343123242d);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 2, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        int int2 = org.apache.commons.math3.util.FastMath.max((-17), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42971.83463481174d + "'", double1 == 42971.83463481174d);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.831008000716578E22d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 75 + "'", int1 == 75);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.342925101645957d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        float float1 = org.apache.commons.math3.util.FastMath.abs(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.848629212096d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.005969933155126179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00597000407914589d) + "'", double1 == (-0.00597000407914589d));
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.71828215250351d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2676505246703657E30d) + "'", double1 == (-1.2676505246703657E30d));
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.14933831547143916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8258287517996786d) + "'", double1 == (-0.8258287517996786d));
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        float float1 = org.apache.commons.math3.util.FastMath.signum(15.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(718053.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 847.3800800113253d + "'", double1 == 847.3800800113253d);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 138L, 9.094948E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-7.6770288745698245d), (double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.677028874569825d + "'", double2 == 7.677028874569825d);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0000005f + "'", float1 == 6.0000005f);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7320508075688772d + "'", double1 == 1.7320508075688772d);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 19.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7144175303058917d + "'", double1 == 2.7144175303058917d);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-17), (float) 15L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-17.0f) + "'", float2 == (-17.0f));
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 10, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.662514762151963d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.3197768247158532d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 97.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 126.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 126.99999237060547d + "'", double1 == 126.99999237060547d);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(9.178679289503757E-29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.580542411316677E-15d + "'", double1 == 9.580542411316677E-15d);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        double double1 = org.apache.commons.math3.util.FastMath.log10(750.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8750612633917d + "'", double1 == 2.8750612633917d);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1023);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.15786583843612662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15919046908362347d + "'", double1 == 0.15919046908362347d);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 1018);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        float float2 = org.apache.commons.math3.util.FastMath.max((-0.99999994f), (float) 138);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(9.848857801796106d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.69771560359221d + "'", double2 == 19.69771560359221d);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(31.999998f, (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9999998f + "'", float2 == 3.9999998f);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.8421709430404007E-14d, 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(53248.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        float float1 = org.apache.commons.math3.util.FastMath.abs(35.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.000004f + "'", float1 == 35.000004f);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-148.99999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9746486480944884d + "'", double1 == 0.9746486480944884d);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.9867717001074399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0941931051470568d + "'", double1 == 1.0941931051470568d);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 9.094947E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.211020790109826E-11d + "'", double1 == 5.211020790109826E-11d);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.0771875889955993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07726425812829045d + "'", double1 == 0.07726425812829045d);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5706217938714693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.094947E-13f, 5.4470154E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4470154E9f + "'", float2 == 5.4470154E9f);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.1920928E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(10.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 750);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 750L + "'", long1 == 750L);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.7687861752511085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8768045251087089d + "'", double1 == 0.8768045251087089d);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        long long1 = org.apache.commons.math3.util.FastMath.round(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22025L + "'", long1 == 22025L);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(78.6900675259798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.058704492638887d + "'", double1 == 5.058704492638887d);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9999999403953551d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999403953551d + "'", double2 == 0.9999999403953551d);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        double double2 = org.apache.commons.math3.util.FastMath.min(22026.0d, (-2.9499630527705192E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9499630527705192E-5d) + "'", double2 == (-2.9499630527705192E-5d));
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.308769561254787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(97.00001f, (-9.256230992860951E225d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.615120516841259d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.460482067365035d + "'", double2 == 18.460482067365035d);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.9867447596805989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37278823330921d + "'", double1 == 0.37278823330921d);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.009624211171012755d, (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.342690407571987E-8d + "'", double2 == 7.342690407571987E-8d);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(11013.232920103323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        double double2 = org.apache.commons.math3.util.FastMath.max(1500.0003333332963d, (double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1500.0003333332963d + "'", double2 == 1500.0003333332963d);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.37278823330921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006506382083938511d + "'", double1 == 0.006506382083938511d);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.0f), 19.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        long long2 = org.apache.commons.math3.util.FastMath.max(1025L, 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 53248.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53248.00000000001d + "'", double1 == 53248.00000000001d);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.7450729502920265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6780254335288145d + "'", double1 == 0.6780254335288145d);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5635505418565119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5635505418565119d + "'", double1 == 1.5635505418565119d);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.9530087697160634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9530087697160634d + "'", double1 == 2.9530087697160634d);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        double double1 = org.apache.commons.math3.util.FastMath.signum(35.014282800023196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(101.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.1168694296386497d, 0.5832605322327451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2599960997248316d + "'", double2 == 1.2599960997248316d);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(39.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.00000000000001d + "'", double1 == 39.00000000000001d);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-2.5049299045672764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.162191050793719d + "'", double1 == 6.162191050793719d);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0000000397364284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8190930489946614E-4d + "'", double1 == 2.8190930489946614E-4d);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5442452350911982d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.544245235091198d + "'", double2 == 1.544245235091198d);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.848629212096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9376558078861459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7341433604804715d + "'", double1 == 0.7341433604804715d);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8139312059190631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6643855961249147d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-4.722581482379799E9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 4096.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5729.578400155824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.019119947239050028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019119947239050028d + "'", double1 == 0.019119947239050028d);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146972656157483E-6d + "'", double1 == 3.8146972656157483E-6d);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.932447891572509d + "'", double1 == 6.932447891572509d);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0941931051470568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.692646897240664d + "'", double1 == 62.692646897240664d);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 127.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(127.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        long long1 = org.apache.commons.math3.util.FastMath.abs(7L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        double double2 = org.apache.commons.math3.util.FastMath.max(39.00000000000001d, (-0.913120061551325d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39.00000000000001d + "'", double2 == 39.00000000000001d);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967296L + "'", long1 == 4294967296L);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.993222846126381d, 0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.993222846126381d + "'", double2 == 2.993222846126381d);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(6.591783121186793E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.591783121186793E31d + "'", double1 == 6.591783121186793E31d);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        double double1 = org.apache.commons.math3.util.FastMath.atan(200.3351263076086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.565804732394659d + "'", double1 == 1.565804732394659d);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.0969082479362111d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        double double1 = org.apache.commons.math3.util.FastMath.signum(328280.7252583891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3025849976266093d + "'", double1 == 2.3025849976266093d);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.33667481938672716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        int int1 = org.apache.commons.math3.util.FastMath.round(99.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.09252791806716626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0970924770267199d) + "'", double1 == (-0.0970924770267199d));
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1024L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(12.182493960703473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5788897342925496d + "'", double1 == 2.5788897342925496d);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.5066812382891345d, 328280.7252583891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5066812382891345d + "'", double2 == 0.5066812382891345d);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.185891831851989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6217880014903024d + "'", double1 == 0.6217880014903024d);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.026541737035255974d, 126.99999237060547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 126.99999237060547d + "'", double2 == 126.99999237060547d);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.8036261707997578d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9333634218998555d) + "'", double1 == (-0.9333634218998555d));
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.006506382083938511d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.23422432986760747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23003301858504133d) + "'", double1 == (-0.23003301858504133d));
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9342813E25f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9342812E25f + "'", float2 == 1.9342812E25f);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.09731253940776538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09746678486527317d) + "'", double1 == (-0.09746678486527317d));
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.2491947060601294d, 2.3283064365386964E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3283064365386964E22d + "'", double2 == 2.3283064365386964E22d);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.3710953E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.371095300000001E7d + "'", double1 == 3.371095300000001E7d);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(178.34851573024756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4280592992577826E77d + "'", double1 == 1.4280592992577826E77d);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.06443056647584822d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06434163106438166d) + "'", double1 == (-0.06434163106438166d));
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.8556837405048565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-0.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9899924966004454d), (-8.61536494421336E37d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.141592653589793d) + "'", double2 == (-3.141592653589793d));
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-126.99999f), (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9843749f) + "'", float2 == (-1.9843749f));
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000004f + "'", float1 == 52.000004f);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1029.9685644157091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8898290414478994d + "'", double1 == 0.8898290414478994d);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(91.45317136336227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.342690407571987E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.342690407571994E-8d + "'", double1 == 7.342690407571994E-8d);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        int int2 = org.apache.commons.math3.util.FastMath.max(127, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6217880014903024d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(31.999996f, 75);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2089257E24f + "'", float2 == 1.2089257E24f);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-148.99998f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.5127512017063653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008949196713333642d + "'", double1 == 0.008949196713333642d);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027415567780803774d) + "'", double1 == (-0.027415567780803774d));
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(31.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        double double1 = org.apache.commons.math3.util.FastMath.log10(31.99999809265137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.505149952433937d + "'", double1 == 1.505149952433937d);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1023, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-7.623359472495549E-46d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.623359472495549E-46d) + "'", double1 == (-7.623359472495549E-46d));
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0562853121379475E-37d + "'", double1 == 3.0562853121379475E-37d);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        long long1 = org.apache.commons.math3.util.FastMath.abs(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        long long1 = org.apache.commons.math3.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        long long1 = org.apache.commons.math3.util.FastMath.round(22026.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22026L + "'", long1 == 22026L);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        int int2 = org.apache.commons.math3.util.FastMath.max((-6), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 2.688117141816136E43d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        long long2 = org.apache.commons.math3.util.FastMath.max(10L, 15L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        long long2 = org.apache.commons.math3.util.FastMath.min(9223372036854775807L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.71828215250351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9117340478983207d) + "'", double1 == (-0.9117340478983207d));
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0771787365603915d, 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.440356430148375d + "'", double2 == 2.440356430148375d);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8405507891024043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.22304735158536d + "'", double1 == 1.22304735158536d);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        int int1 = org.apache.commons.math3.util.FastMath.round(35.000008f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9376558078861459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.081221371125345d + "'", double1 == 1.081221371125345d);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.8375714918828912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014618380254197412d + "'", double1 == 0.014618380254197412d);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23509439727547046d + "'", double1 == 0.23509439727547046d);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        long long2 = org.apache.commons.math3.util.FastMath.min(22025L, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023L) + "'", long2 == (-1023L));
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1.1920928E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.080594477611303E-9d + "'", double1 == 2.080594477611303E-9d);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.3197768247158532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3197768247158534d + "'", double1 == 1.3197768247158534d);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-7.6770288745698245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7355948833786616d) + "'", double1 == (-2.7355948833786616d));
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.017453291479645992d), 1.9238054901410364d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4040823497388352d) + "'", double1 == (-0.4040823497388352d));
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        long long2 = org.apache.commons.math3.util.FastMath.max(5L, 1025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.026931837701290245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026938351971522147d + "'", double1 == 0.026938351971522147d);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8898290414478994d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768985d + "'", double1 == 5557.690612768985d);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.5707963267948966d), 1.004335786492981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.864427920919126d + "'", double2 == 1.864427920919126d);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        long long2 = org.apache.commons.math3.util.FastMath.max(12L, (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.09746678486527317d), (double) 6.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09746678486527317d) + "'", double2 == (-0.09746678486527317d));
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 5L, (float) 12L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.932447891572509d, 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1500L, (float) 138L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0f + "'", float2 == 1500.0f);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9169970877394357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41031030614622616d + "'", double1 == 0.41031030614622616d);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.8604993868447559d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.9843749f), 1.9342813E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9342813E25f + "'", float2 == 1.9342813E25f);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.0017254937309181956d), 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        double double1 = org.apache.commons.math3.util.FastMath.signum(847.3800800113253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.1533302069155655d, 2.37684487542793E32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.19293729440321d + "'", double2 == 97.19293729440321d);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-7.623359472495549E-46d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.623359472495549E-46d) + "'", double1 == (-7.623359472495549E-46d));
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.4302079958348105E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4273537190268928E18d + "'", double1 == 2.4273537190268928E18d);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '4', 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1023 + "'", int2 == 1023);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.5066812382891345d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.079368399158986d + "'", double1 == 10.079368399158986d);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.254833995939045d + "'", double1 == 45.254833995939045d);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        double double1 = org.apache.commons.math3.util.FastMath.log(8.973830118957929E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.016027794960618d) + "'", double1 == (-7.016027794960618d));
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 22026.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.8813735870195429d), 7.677028874569825d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8813735870195429d + "'", double2 == 0.8813735870195429d);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.5327963125236284E304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7522224108782153d) + "'", double1 == (-0.7522224108782153d));
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.8146977E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1 == (-18));
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 138L, 1.602619601945246E39d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.00002f + "'", float2 == 138.00002f);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 2.299249233707907E97d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.1578506894064046d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0124843102732668d + "'", double1 == 1.0124843102732668d);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0000000397364284d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 4096.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 6, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.019119947239050028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01893945804830624d + "'", double1 == 0.01893945804830624d);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.026541737035255974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026535507103947666d + "'", double1 == 0.026535507103947666d);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.47381939152118935d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258789061907882E-5d + "'", double1 == 1.5258789061907882E-5d);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.6940658945086007E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-149L), (float) (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-149.0f) + "'", float2 == (-149.0f));
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        long long2 = org.apache.commons.math3.util.FastMath.max(97L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5262586308923471d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 32768.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-2.09E-43f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 15L, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1023);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.5987297191141082d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.0017254937309181956d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.001725492874692366d) + "'", double1 == (-0.001725492874692366d));
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.633495252341099E-4d, 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-6L), 99.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(15.29676667877352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999998966d + "'", double1 == 0.9999999999998966d);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 7.6293945E-6f, (-0.01745329147964599d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.62939453125E-6d + "'", double2 == 7.62939453125E-6d);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0003524181127126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3076604860118306d + "'", double1 == 1.3076604860118306d);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        int int2 = org.apache.commons.math3.util.FastMath.min(4, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.5365721132383438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5136814478622125d) + "'", double1 == (-0.5136814478622125d));
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9.580542411316677E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794887d + "'", double1 == 1.570796326794887d);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.2949673E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-6.053128792867638d), (double) 1.2089257E24f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.007031379631276E-24d) + "'", double2 == (-5.007031379631276E-24d));
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 548.3170351552121d + "'", double1 == 548.3170351552121d);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        int int2 = org.apache.commons.math3.util.FastMath.min(1500, (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.99189285848507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-56.83127452036154d) + "'", double1 == (-56.83127452036154d));
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 75);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 75.00001f + "'", float1 == 75.00001f);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        int int1 = org.apache.commons.math3.util.FastMath.round(6400.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6400 + "'", int1 == 6400);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(10.079368399158986d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        long long1 = org.apache.commons.math3.util.FastMath.abs(750L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 750L + "'", long1 == 750L);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        double double1 = org.apache.commons.math3.util.FastMath.abs(53248.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53248.0d + "'", double1 == 53248.0d);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1023, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.0f + "'", float2 == 1023.0f);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.008949196713333642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008949316167871405d + "'", double1 == 0.008949316167871405d);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.949823557438858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.949823557438858d + "'", double1 == 1.949823557438858d);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-97.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-97.0d) + "'", double1 == (-97.0d));
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.71828215250351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-22.4267346769666d) + "'", double1 == (-22.4267346769666d));
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.4874710524825647d), (-0.39929200144991767d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6301286610132414d + "'", double2 == 0.6301286610132414d);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 52L, 2.606354165955547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12708331911094284d) + "'", double2 == (-0.12708331911094284d));
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 35.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5835191503837134d + "'", double1 == 3.5835191503837134d);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        float float2 = org.apache.commons.math3.util.FastMath.max(6.0f, (-17.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.09731253940776538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.002893947719693431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5385093188471615d) + "'", double1 == (-2.5385093188471615d));
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 402.4287934927351d + "'", double1 == 402.4287934927351d);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.802425921479547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9292551640092286d + "'", double1 == 0.9292551640092286d);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.094948E-13f, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.031250004f + "'", float2 == 0.031250004f);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-149), (long) 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.16181164155481406d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0512062454087515E29d + "'", double2 == 2.0512062454087515E29d);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        double double1 = org.apache.commons.math3.util.FastMath.atan(9.848857801796106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4696084840113481d + "'", double1 == 1.4696084840113481d);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 5447015486L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.111480858936716d + "'", double1 == 23.111480858936716d);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7450920600186577d, 5.308769561254787d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7450920600186577d + "'", double2 == 0.7450920600186577d);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        double double2 = org.apache.commons.math3.util.FastMath.log(8.63114046460753E38d, 1.2684529660545276d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002652408759588795d + "'", double2 == 0.002652408759588795d);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(31.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.564085018163574d, 8.63114046460753E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5640850181635741d + "'", double2 == 1.5640850181635741d);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        int int2 = org.apache.commons.math3.util.FastMath.max(97, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        int int2 = org.apache.commons.math3.util.FastMath.max(127, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(101.04822696504081d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(15.00402842524522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 4.2949673E9f, 101.04822696504083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1025.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9483398404364088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.666977646080837d + "'", double1 == 0.666977646080837d);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.03844259002118798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.70949768864047E-4d + "'", double1 == 6.70949768864047E-4d);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.7320508075688772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.4302079958348105E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.2699847631416846E296d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1235582092889473E307d + "'", double2 == 1.1235582092889473E307d);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        int int2 = org.apache.commons.math3.util.FastMath.min(4, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.22374095013561138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22191504464504894d) + "'", double1 == (-0.22191504464504894d));
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1025);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1025L + "'", long1 == 1025L);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.2491947060601294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6920724930525287d + "'", double1 == 0.6920724930525287d);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.15052756842981832d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        double double1 = org.apache.commons.math3.util.FastMath.floor(7.584283767291423E71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.584283767291423E71d + "'", double1 == 7.584283767291423E71d);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(7.105427357601002E-15d, 138.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.105427357601002E-15d + "'", double2 == 7.105427357601002E-15d);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.027181892591221314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027188589065316054d) + "'", double1 == (-0.027188589065316054d));
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-149));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        int int1 = org.apache.commons.math3.util.FastMath.abs(6400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6400 + "'", int1 == 6400);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 22026L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22026 + "'", int1 == 22026);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        int int2 = org.apache.commons.math3.util.FastMath.max(2147483647, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 7L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7539022543433046d + "'", double1 == 0.7539022543433046d);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.913120061551325d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9131200615513249d) + "'", double1 == (-0.9131200615513249d));
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 1025, 328280.725258389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1025.0d + "'", double2 == 1025.0d);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        double double1 = org.apache.commons.math3.util.FastMath.exp(384.416897404767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.915327333074469E166d + "'", double1 == 8.915327333074469E166d);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.633123935319537E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.666977646080837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5110121940091826d + "'", double1 == 0.5110121940091826d);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.8750612633917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8750612633917d + "'", double1 == 2.8750612633917d);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7320508075688772d + "'", double1 == 1.7320508075688772d);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(9.580542411316677E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.580542411316679E-15d + "'", double1 == 9.580542411316679E-15d);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-1023L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.0f + "'", float1 == 1023.0f);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.2676505246703657E30d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.8428370245346917d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4304874857964348d + "'", double1 == 0.4304874857964348d);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146972656157483E-6d + "'", double1 == 3.8146972656157483E-6d);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5698197646053376d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5698197646053376d + "'", double2 == 1.5698197646053376d);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.447015485737373E9d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4531176911848156E25d + "'", double2 == 2.4531176911848156E25d);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.7911843097149078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7911843097149079d + "'", double1 == 0.7911843097149079d);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5635500768149995d, 1018);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.034665567835052E197d + "'", double2 == 4.034665567835052E197d);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        long long1 = org.apache.commons.math3.util.FastMath.round(148.99998474121094d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) '4', (long) 6400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6400L + "'", long2 == 6400L);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.1760912590556813d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5.447015486E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.5110121940091826d, 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        double double2 = org.apache.commons.math3.util.FastMath.pow(Double.NaN, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(114.59155902616463d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1833.464944418634d + "'", double2 == 1833.464944418634d);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950547536867305d + "'", double1 == 0.9950547536867305d);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 138.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-7.623359472495549E-46d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 22025L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4391749470972324d + "'", double1 == 0.4391749470972324d);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.15853338004399595d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15919828051924276d) + "'", double1 == (-0.15919828051924276d));
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.5830326867761627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.834796820967027d + "'", double1 == 0.834796820967027d);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 149.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        int int1 = org.apache.commons.math3.util.FastMath.round(31.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        long long2 = org.apache.commons.math3.util.FastMath.min((-9223372036854775808L), 4096L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9223372036854775808L) + "'", long2 == (-9223372036854775808L));
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        float float2 = org.apache.commons.math3.util.FastMath.max(10.0f, 1.0000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        int int2 = org.apache.commons.math3.util.FastMath.max(1018, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1018 + "'", int2 == 1018);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.37278823330921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39165746393081896d + "'", double1 == 0.39165746393081896d);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(23.111480858936716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1826881112499317d + "'", double1 == 3.1826881112499317d);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.38991180981351d), 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.5963016834733655E18d) + "'", double2 == (-3.5963016834733655E18d));
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        double double2 = org.apache.commons.math3.util.FastMath.max(6.932447891572509d, 53.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.0d + "'", double2 == 53.0d);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-1.2676505E30f), (double) 22025.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.0d + "'", double2 == 22025.0d);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.5136814478622125d), (-0.41032129904822556d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5136814478622124d) + "'", double2 == (-0.5136814478622124d));
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2048.0d + "'", double1 == 2048.0d);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.677028874569825d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.306979419100936E85d + "'", double2 == 7.306979419100936E85d);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.066281120220074d, (double) (-5.877472E-39f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.066281120220073d + "'", double2 == 6.066281120220073d);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.832824094709035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2998044433940747d + "'", double1 == 1.2998044433940747d);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000002f + "'", float1 == 3.0000002f);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1499.9999f, (-149));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.102E-42f + "'", float2 == 2.102E-42f);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.5830326867761627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.835406085372415d + "'", double1 == 0.835406085372415d);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9875650456761653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.24E-44f + "'", float1 == 2.24E-44f);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0644306856851378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0317125014678934d + "'", double1 == 1.0317125014678934d);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-4.323362308933903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.323362308933902d) + "'", double1 == (-4.323362308933902d));
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.3734007669450157d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0026272016841214006d, (double) 0.031250004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0312500037252903d + "'", double2 == 0.0312500037252903d);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        int int2 = org.apache.commons.math3.util.FastMath.max((-18), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9426286359925615d, (double) 512.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.284538580399531E-14d + "'", double2 == 7.284538580399531E-14d);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.6920724930525287d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3779429792974384E10d + "'", double2 == 2.3779429792974384E10d);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.031250004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.031250004f + "'", float1 == 0.031250004f);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.850338976445283E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794893d + "'", double1 == 1.570796326794893d);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.320704855363221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38174553771740516d) + "'", double1 == (-0.38174553771740516d));
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.15782930550131322d, (-9.215236359557623E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1578293055013132d + "'", double2 == 0.1578293055013132d);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9292551640092286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9758393522576108d + "'", double1 == 0.9758393522576108d);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7341433604804715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0836962511904766d + "'", double1 == 2.0836962511904766d);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-149.0f), 2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 149.0d + "'", double2 == 149.0d);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-97.0f), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-97.0f) + "'", float2 == (-97.0f));
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        double double1 = org.apache.commons.math3.util.FastMath.floor(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(9.849160264910656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17190027517928788d + "'", double1 == 0.17190027517928788d);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 12L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-1023L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1023.0d) + "'", double1 == (-1023.0d));
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(8.69927168291248E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000037838663d + "'", double1 == 1.0000000037838663d);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9998646693394199d, (-1.3237334981628701d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9998646693394199d) + "'", double2 == (-0.9998646693394199d));
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        float float2 = org.apache.commons.math3.util.FastMath.min(35.0f, 1.9342813E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 32.000004f, (-0.6669829823489768d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.015179338053620484d) + "'", double2 == (-0.015179338053620484d));
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4111572870929613E-29d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 138);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.408554367752175d + "'", double1 == 2.408554367752175d);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-149));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 6.0000005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.5681525607948594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5380757678599976d + "'", double1 == 0.5380757678599976d);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.5136814478622124d), 0.22609662867095306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.561238198427539d + "'", double2 == 0.561238198427539d);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.553096817707418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 12.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2894284851066637d + "'", double1 == 2.2894284851066637d);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-7.623359472495549E-46d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.623359472495547E-46d) + "'", double1 == (-7.623359472495547E-46d));
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.018471250572709978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13590897899958626d + "'", double1 == 0.13590897899958626d);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.9999999403953551d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 750);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 750 + "'", int1 == 750);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.07726425812829045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08032752400444744d + "'", double1 == 0.08032752400444744d);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.058916076536616895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0572141123059735d) + "'", double1 == (-0.0572141123059735d));
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.7615941559557649d), (double) 7L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7615941559557649d) + "'", double2 == (-0.7615941559557649d));
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        long long1 = org.apache.commons.math3.util.FastMath.round((-10.07608628613008d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-10L) + "'", long1 == (-10L));
    }
}

