package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double double0 = org.apache.commons.math.util.MathUtils.SAFE_MIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.2250738585072014E-308d + "'", double0 == 2.2250738585072014E-308d);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 1L, (double) 0, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        double[] doubleArray2 = new double[] { 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.checkOrder(doubleArray2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException; message: points 0 and 1 are not strictly increasing (100 >= 0)");
        } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) (short) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        boolean boolean3 = false; // flaky "1) test0016(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.2250738585072014E-308d, (double) (-1), 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100L) + "'", long2 == (-100L));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        double[] doubleArray2 = new double[] { (short) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.checkOrder(doubleArray2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException; message: points 0 and 1 are not strictly increasing (1 >= 1)");
        } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 0, (long) 104);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int1 = org.apache.commons.math.util.MathUtils.sign(76);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        long long1 = org.apache.commons.math.util.MathUtils.sign(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1), (double) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) (byte) 10, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1074790400), (double) 10.0f, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        float float3 = org.apache.commons.math.util.MathUtils.round(0.0f, (-1074790400), 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + Float.NEGATIVE_INFINITY + "'", float3 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        double[] doubleArray4 = new double[] { (-100L), 98, 10, (short) 10 };
        double[] doubleArray6 = new double[] { 100L };
        double double7 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray4, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), 98.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(35, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (short) 1, (double) 35, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        long long2 = org.apache.commons.math.util.MathUtils.pow(10L, 76);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1079574559, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2676506002282294E31d + "'", double2 == 1.2676506002282294E31d);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(76, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-76) + "'", int2 == (-76));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int2 = org.apache.commons.math.util.MathUtils.pow((-1), (long) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) ' ', (long) 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (short) -1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 104);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.338311150777212E44d + "'", double1 == 7.338311150777212E44d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(10.0d, (double) 10, 76);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray0, 7.338311150777212E44d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 0, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) 'a', (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3395L + "'", long2 == 3395L);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (byte) -1, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (short) 0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (byte) 10, 35 };
        int[] intArray16 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int17 = org.apache.commons.math.util.MathUtils.distance1(intArray9, intArray16);
        int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray5, intArray9);
        int[] intArray21 = new int[] { (-1), 100 };
        int[] intArray24 = new int[] { 'a', '4' };
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray21, intArray24);
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray24);
        int[] intArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.math.util.MathUtils.distance1(intArray24, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 76 + "'", int17 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 87 + "'", int26 == 87);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(1.2676506002282294E31d, 2.2250738585072014E-308d, (double) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double[] doubleArray5 = new double[] { (-76), 1.2676506002282294E31d, (-1.0f), (short) 10, 35 };
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray13);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray13, (double) 10);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray5, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-76.0d), 1.2676506002282294E31d, (-1.0d), 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1079574559 + "'", int15 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(87, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection0 = org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING;
        org.junit.Assert.assertTrue("'" + orderDirection0 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection0.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(104, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5830658481259483E30d + "'", double2 == 1.5830658481259483E30d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-76), 76);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        long long2 = org.apache.commons.math.util.MathUtils.gcd(100L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 'a', (double) 1079574559);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6313083693369503E35d + "'", double1 == 2.6313083693369503E35d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        float float2 = org.apache.commons.math.util.MathUtils.round(0.0f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(33, (int) '#');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) ' ', 35.0d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) 0, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        double double3 = org.apache.commons.math.util.MathUtils.round(1.3440585709080678E43d, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3440585709080678E43d + "'", double3 == 1.3440585709080678E43d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 3395L, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3395.0d + "'", double2 == 3395.0d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-1.0f), 0, 1079574559);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        float float3 = org.apache.commons.math.util.MathUtils.round(10.0f, (-76), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + Float.POSITIVE_INFINITY + "'", float3 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1076101120 + "'", int1 == 1076101120);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) 1079574559, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35625960447L + "'", long2 == 35625960447L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int1 = org.apache.commons.math.util.MathUtils.sign(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        boolean boolean3 = false; // flaky "2) test0099(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN(7.338311150777212E44d, 0.0d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, bigInteger1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 3395L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1.0f, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(35, (int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int2 = org.apache.commons.math.util.MathUtils.pow(104, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) (byte) 1, (-76));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        long long2 = org.apache.commons.math.util.MathUtils.pow(3395L, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9123042065252004905L + "'", long2 == 9123042065252004905L);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) (short) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(76, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 76.0d + "'", double2 == 76.0d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1072693248 + "'", int1 == 1072693248);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 104, 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) Float.NEGATIVE_INFINITY, 1.2676506002282294E31d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        double double2 = org.apache.commons.math.util.MathUtils.log((-1.1752011936438014d), 88.64536084872124d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(132, 1072693248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693248 + "'", int2 == 1072693248);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        boolean boolean3 = false; // flaky "3) test0125(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 35625960447L, (double) (byte) 100, (-1074790400));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray0, 2.6313083693369503E35d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 10, 132, (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079525376 + "'", int1 == 1079525376);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1072693248);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1072693248, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693247 + "'", int2 == 1072693247);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 98);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(104, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4598126.0d + "'", double2 == 4598126.0d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-1074790400), (double) 35625960447L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.562596044395821E10d + "'", double2 == 3.562596044395821E10d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-76), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-152.0d) + "'", double2 == (-152.0d));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) -1, (-1074790400), 1076101120);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(10.0d, 4598126.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) (short) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-1.0f), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0d) + "'", double2 == (-2.0d));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1L), 1.5830658481259483E30d, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1072693248);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1072693247, (double) (-1), 3.562596044395821E10d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1078034432 + "'", int1 == 1078034432);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(98, 104);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(3628800.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        double[] doubleArray5 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray7 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray5, (double) 1L);
        double[] doubleArray9 = new double[] { 100L };
        double double10 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray9);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray9, (double) 10);
        double[] doubleArray15 = new double[] { 100L };
        double double16 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray15);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection17 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray15, orderDirection17, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray13, orderDirection17, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.checkOrder(doubleArray5, orderDirection17, false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException; message: points 1 and 2 are not decreasing (0 < 100)");
        } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1079574559 + "'", int11 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection17 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection17.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4650188248182272d + "'", double1 == 1.4650188248182272d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int2 = org.apache.commons.math.util.MathUtils.pow(35, (long) 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-532995727) + "'", int2 == (-532995727));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-100L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1067909120) + "'", int1 == (-1067909120));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 98);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079541760 + "'", int1 == 1079541760);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(3628800.0d, (-152.0d), 1.2676506002282294E31d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) 0, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-532995727), (long) 1078034432);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-574587745814872064L) + "'", long2 == (-574587745814872064L));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double double0 = org.apache.commons.math.util.MathUtils.EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-16d + "'", double0 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 76);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) (byte) 10, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        double double2 = org.apache.commons.math.util.MathUtils.log(1.3440585709080678E43d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04637313594421548d + "'", double2 == 0.04637313594421548d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 1079574559);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 0, 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(100.0d, Double.NaN, (double) (-1074790400));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 0.0f, 1.5830658481259483E30d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        double double2 = org.apache.commons.math.util.MathUtils.log(65.92419889539804d, (double) (-1074790400));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(132, 1072693248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1072693116) + "'", int2 == (-1072693116));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-76), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1072693116), (double) 76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) '#', 0.0d, 88.64536084872124d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        double[] doubleArray5 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray7 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray5, (double) 1L);
        double[] doubleArray9 = new double[] { 35 };
        double double10 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray9);
        double[] doubleArray12 = new double[] { 100L };
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray12);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection14 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray12, orderDirection14, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray9, orderDirection14, true);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection14 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection14.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(76, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1074790324) + "'", int2 == (-1074790324));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-100L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.1752011936438014d, (double) (-1074790324));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        double double2 = org.apache.commons.math.util.MathUtils.log(106.88779163215975d, (double) (-100L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 101, (double) (-1074790400), (double) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        long long2 = org.apache.commons.math.util.MathUtils.pow(100L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-76), 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1048576) + "'", int1 == (-1048576));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection9, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray5, orderDirection9, false);
        double[] doubleArray15 = new double[] { 35 };
        double double16 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray15);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection20 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray18, orderDirection20, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray15, orderDirection20, true);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray5, doubleArray15);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection9 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection9.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection20 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection20.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 25.0d + "'", double25 == 25.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1076101120, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1076101217L + "'", long2 == 1076101217L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) -1, (long) (-532995727));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 532995727L + "'", long2 == 532995727L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, (double) 0L, 11013.232920103324d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) 1, 9123042065252004905L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9123042065252004905L + "'", long2 == 9123042065252004905L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) ' ', (double) (-532995727), 2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 98, 76.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) -1, 532995727L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 532995726L + "'", long2 == 532995726L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(1.4650188248182272d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1500.1792766138647d + "'", double2 == 1500.1792766138647d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 132);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-532995727));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        double double0 = org.apache.commons.math.util.MathUtils.TWO_PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 6.283185307179586d + "'", double0 == 6.283185307179586d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double double1 = org.apache.commons.math.util.MathUtils.sign(7.338311150777212E44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int1 = org.apache.commons.math.util.MathUtils.sign(1072693248);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(1078034432, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        boolean boolean3 = false; // flaky "4) test0204(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equals((double) 1, (double) (-1048576), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection9, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray5, orderDirection9, false);
        double[] doubleArray15 = new double[] { 35 };
        double double16 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray15);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection20 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray18, orderDirection20, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray15, orderDirection20, true);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray5, doubleArray15);
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection9 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection9.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection20 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection20.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 25.0d + "'", double25 == 25.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1078034463 + "'", int26 == 1078034463);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double[] doubleArray19 = new double[] { 100L };
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray19);
        double double21 = org.apache.commons.math.util.MathUtils.distance1(doubleArray16, doubleArray19);
        double[] doubleArray23 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) (short) 100);
        double double24 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray11, doubleArray16);
        int int25 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1079574559 + "'", int25 == 1079574559);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (short) 0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1072693248, 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693144 + "'", int2 == 1072693144);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(33, (int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1072693247);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1078034432, 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1078034564 + "'", int2 == 1078034564);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1079574559, 1072693247);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int int1 = org.apache.commons.math.util.MathUtils.sign(104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((-1074790324), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-76));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (byte) 0, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray16 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 1L);
        double double19 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.checkOrder(doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException; message: points 0 and 1 are not strictly increasing (35 >= 0)");
        } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int2 = org.apache.commons.math.util.MathUtils.pow(101, 1076101120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1894776833 + "'", int2 == 1894776833);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(104, 1072693144);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 101, (double) (byte) 0, 3628800.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1078034564);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-2.0d), (double) (-1072693116));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.1752011936438014d), 76.0d, 3.562596044395821E10d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 3395L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int int1 = org.apache.commons.math.util.MathUtils.sign(98);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int int1 = org.apache.commons.math.util.MathUtils.hash(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(1078034463, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1076101120, (-1074790324));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 10.0f, (double) (byte) 0, 88.64536084872124d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow(104, (long) (-532995727));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) 76, 1078034564);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1), (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-574587745814872064L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-574587745814872054L) + "'", long2 == (-574587745814872054L));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1078034432);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1072693247, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(33, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3201 + "'", int2 == 3201);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        double double1 = org.apache.commons.math.util.MathUtils.sign(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection18 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray16, orderDirection18, true);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray22, (double) 10);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        double[] doubleArray38 = new double[] { 100L };
        double double39 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray38);
        double double40 = org.apache.commons.math.util.MathUtils.distance1(doubleArray35, doubleArray38);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray28, doubleArray38);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        int int45 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double[] doubleArray47 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray43, (double) 10);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection51 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray49, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray47, orderDirection51, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection51, false);
        double double60 = org.apache.commons.math.util.MathUtils.distance1(doubleArray16, doubleArray22);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22);
        boolean boolean62 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray22);
        double[] doubleArray64 = new double[] { 100L };
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray64);
        int int66 = org.apache.commons.math.util.MathUtils.hash(doubleArray64);
        double[] doubleArray68 = new double[] { 100L };
        double double69 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray68);
        int int70 = org.apache.commons.math.util.MathUtils.hash(doubleArray68);
        double double71 = org.apache.commons.math.util.MathUtils.distance(doubleArray64, doubleArray68);
        double[] doubleArray73 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray64, 100.0d);
        boolean boolean74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray22, doubleArray73);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection18 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection18.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1079574559 + "'", int24 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1079574559 + "'", int45 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection51 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection51.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1079574559 + "'", int66 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1079574559 + "'", int70 == 1079574559);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (-1072693116));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1072693248);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(35, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(87, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow(0L, (long) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1078034564);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.134336531441605E10d + "'", double1 == 2.134336531441605E10d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) 3395L, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3395.0d + "'", double3 == 3395.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) ' ', (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow(0L, (long) (-1074790400));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow((-1072693116), (-574587745814872064L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        double double2 = org.apache.commons.math.util.MathUtils.log(65.92419889539804d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5497390534142846d + "'", double2 == 0.5497390534142846d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 10, 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) '4', (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.1f + "'", float3 == 52.1f);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1074790400), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1074790303) + "'", int2 == (-1074790303));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1078034564, 1078034463);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 1, 1078034463);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) 1079574559, 1072693247);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) 10, 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 1078034564, 2.2250738585072014E-308d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 2.134336531441605E10d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) 7766279631452241920L, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 7.7662794E18f + "'", float3 == 7.7662794E18f);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 101, (-1048576), 3201);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) 1072693144, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        float float2 = org.apache.commons.math.util.MathUtils.round(Float.POSITIVE_INFINITY, 101);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-76), (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2508L) + "'", long2 == (-2508L));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 1076101217L, 10.0d, (double) 9123042065252004905L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray16 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 1L);
        double double19 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray16);
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray22, (double) 10);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection30, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray26, orderDirection30, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray26);
        double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1079574559 + "'", int24 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection30 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection30.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 25.0d + "'", double36 == 25.0d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(1.5830658481259483E30d, 1079541760, 1078034564);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        long long2 = org.apache.commons.math.util.MathUtils.pow(532995727L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2614362513533383839L) + "'", long2 == (-2614362513533383839L));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) 'a', (-532995727));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-532995630) + "'", int2 == (-532995630));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1079574559, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9036866128227814273L + "'", long2 == 9036866128227814273L);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-97) + "'", int2 == (-97));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        double[] doubleArray25 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray21, (double) 10);
        double[] doubleArray27 = new double[] { 100L };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        double[] doubleArray30 = new double[] { 100L };
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray30);
        double double32 = org.apache.commons.math.util.MathUtils.distance1(doubleArray27, doubleArray30);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double double39 = org.apache.commons.math.util.MathUtils.distance1(doubleArray34, doubleArray37);
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray37);
        double[] doubleArray42 = new double[] { 100L };
        double double43 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray42);
        int int44 = org.apache.commons.math.util.MathUtils.hash(doubleArray42);
        double[] doubleArray46 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray42, (double) 10);
        double[] doubleArray48 = new double[] { 100L };
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection50 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray48, orderDirection50, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray46, orderDirection50, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray27, orderDirection50, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray21, orderDirection50, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray17, orderDirection50, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection50, false);
        double[] doubleArray64 = new double[] { 100L };
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray64);
        int int66 = org.apache.commons.math.util.MathUtils.hash(doubleArray64);
        double[] doubleArray68 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray64, (double) 10);
        boolean boolean69 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray64);
        double[] doubleArray71 = new double[] { 100L };
        double double72 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray71);
        int int73 = org.apache.commons.math.util.MathUtils.hash(doubleArray71);
        double[] doubleArray75 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray71, (double) 10);
        double[] doubleArray77 = new double[] { 100L };
        double double78 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray77);
        int int79 = org.apache.commons.math.util.MathUtils.hash(doubleArray77);
        double[] doubleArray81 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray77, (double) 10);
        boolean boolean82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray71, doubleArray81);
        double double83 = org.apache.commons.math.util.MathUtils.distance1(doubleArray64, doubleArray81);
        double double84 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray64);
        int int85 = org.apache.commons.math.util.MathUtils.hash(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1079574559 + "'", int23 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1079574559 + "'", int44 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection50 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection50.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1079574559 + "'", int66 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1079574559 + "'", int73 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 100.0d + "'", double78 == 100.0d);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1079574559 + "'", int79 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 90.0d + "'", double83 == 90.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1079574559 + "'", int85 == 1079574559);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-532995727), (-1074790303));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int int1 = org.apache.commons.math.util.MathUtils.hash(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079574528 + "'", int1 == 1079574528);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-532995630));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1072693247, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 635.6341670092748d + "'", double2 == 635.6341670092748d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-76), (int) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 4, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(635.6341670092748d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 650889.3870174974d + "'", double2 == 650889.3870174974d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(0, (-1067909120));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1067909120 + "'", int2 == 1067909120);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(3201);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22639.925120280288d + "'", double1 == 22639.925120280288d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray16 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 1L);
        double double19 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray16);
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray22, (double) 10);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray28);
        double[] doubleArray32 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) 10);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray22, doubleArray32);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        int int37 = org.apache.commons.math.util.MathUtils.hash(doubleArray35);
        double[] doubleArray39 = new double[] { 100L };
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray39);
        int int41 = org.apache.commons.math.util.MathUtils.hash(doubleArray39);
        double double42 = org.apache.commons.math.util.MathUtils.distance(doubleArray35, doubleArray39);
        double[] doubleArray44 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray35, 100.0d);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray32, doubleArray35);
        double[] doubleArray47 = new double[] { 100L };
        double double48 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray47);
        double[] doubleArray50 = new double[] { 100L };
        double double51 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray50);
        double double52 = org.apache.commons.math.util.MathUtils.distance1(doubleArray47, doubleArray50);
        double[] doubleArray54 = new double[] { 100L };
        double double55 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray54);
        double[] doubleArray57 = new double[] { 100L };
        double double58 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray57);
        double double59 = org.apache.commons.math.util.MathUtils.distance1(doubleArray54, doubleArray57);
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray47, doubleArray57);
        double double61 = org.apache.commons.math.util.MathUtils.distance(doubleArray35, doubleArray47);
        // The following exception was thrown during execution in test generation
        try {
            double double62 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray16, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 106.88779163215975d + "'", double20 == 106.88779163215975d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1079574559 + "'", int24 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1079574559 + "'", int30 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1079574559 + "'", int37 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1079574559 + "'", int41 == 1079574559);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int int1 = org.apache.commons.math.util.MathUtils.sign(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int int1 = org.apache.commons.math.util.MathUtils.hash(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1048576) + "'", int1 == (-1048576));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) (short) 1, (double) 52.1f, (double) 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) 1, (-1067909120));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(35, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 100, 1079574559);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        double[] doubleArray5 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray7 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray5, (double) 1L);
        double[] doubleArray9 = new double[] { 100L };
        double double10 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray9);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray9, (double) 10);
        double[] doubleArray15 = new double[] { 100L };
        double double16 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray15);
        boolean boolean17 = org.apache.commons.math.util.MathUtils.equals(doubleArray9, doubleArray15);
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray9);
        double[] doubleArray20 = new double[] { 35 };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection25 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray23, orderDirection25, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection25, true);
        double[] doubleArray35 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray37 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray35, (double) 1L);
        double double38 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray35);
        double double39 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double double40 = org.apache.commons.math.util.MathUtils.distance(doubleArray9, doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            double double41 = org.apache.commons.math.util.MathUtils.distance(doubleArray5, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1079574559 + "'", int11 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection25 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection25.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 35.0d + "'", double39 == 35.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 65.0d + "'", double40 == 65.0d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        boolean boolean3 = false; // flaky "5) test0310(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (short) 100, (double) '#', 1078034463);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-35), (double) 104, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1067909120), 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1067909019) + "'", int2 == (-1067909019));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(98, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 195 + "'", int2 == 195);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) '4', 1067909120, 0);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(3395.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(76);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 256.22113555000954d + "'", double1 == 256.22113555000954d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1048576), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1048576L + "'", long2 == 1048576L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-52L) + "'", long2 == (-52L));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1078034463);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1343363213777176E10d + "'", double1 == 2.1343363213777176E10d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((-152.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-1048576), (double) 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-76));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 76, 1078034564, (int) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1078034432, (long) (-1074790400));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) '#', 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((-1.0d), 4598126.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 0, 1078034564);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (long) (-1074790303));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) '#', 1072693247);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693282 + "'", int2 == 1072693282);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1780538303479458d + "'", double1 == 3.1780538303479458d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 98, (double) (-574587745814872054L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1074790324), (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        boolean boolean3 = false; // flaky "6) test0342(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 10.0f, (double) 1079541760, (-1074790303));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (-35));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 97, 65.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((-0.0d), (double) 1072693248, 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        boolean boolean3 = false; // flaky "7) test0346(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equals((double) (-76), 2.134336531441605E10d, 1079574528);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(0L, (long) 1072693144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(195, (-532995727));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-532995532) + "'", int2 == (-532995532));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 195);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        long long2 = org.apache.commons.math.util.MathUtils.pow(0L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) (-100L), (double) (-532995630), (double) 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 87, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 87.0d + "'", double2 == 87.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-76), 100.0d, (double) 1079525376);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, (-532995532));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-532995630), 1078034463);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1611030093) + "'", int2 == (-1611030093));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) ' ', (long) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 35625960447L, (int) (short) 1, (-76));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (-1611030093), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7953902656989896119L) + "'", long2 == (-7953902656989896119L));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) 32L, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 33.0f + "'", float3 == 33.0f);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-532995630), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.3299563E8d) + "'", double2 == (-5.3299563E8d));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        double double2 = org.apache.commons.math.util.MathUtils.log((-1.1752011936438014d), 6.283185307179586d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 76, 3395L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3319L) + "'", long2 == (-3319L));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (short) 1, (long) 1079541760);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079541760L + "'", long2 == 1079541760L);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        double[] doubleArray10 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 100.0d);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1079574559 + "'", int7 == 1079574559);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1079574559 + "'", int11 == 1079574559);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) -1, (long) 1072693282);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1072693281L + "'", long2 == 1072693281L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(7766279631452241920L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(33, (-1072693116));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        double double2 = org.apache.commons.math.util.MathUtils.round((-5.3299563E8d), 3201);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.3299563E8d) + "'", double2 == (-5.3299563E8d));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(132, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1079574559, 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.900763733941378E162d + "'", double2 == 1.900763733941378E162d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1067909120), 98);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-76));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 4, 1079574559);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(4, (-532995630));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(10, 1072693282);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(87.0d, (double) '#', (double) 1079541760L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(87, 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double[] doubleArray19 = new double[] { 100L };
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray19);
        double double21 = org.apache.commons.math.util.MathUtils.distance1(doubleArray16, doubleArray19);
        double[] doubleArray23 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) (short) 100);
        double double24 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray11, doubleArray16);
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(65.0d, (double) 532995726L, (double) (-1048576));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-97), 1072693144);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 9036866128227814273L, (double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow(0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((-2508L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        long long2 = org.apache.commons.math.util.MathUtils.pow(32L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (-1067909019), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3798431950569582479L) + "'", long2 == (-3798431950569582479L));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 33, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1048576));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        double double1 = org.apache.commons.math.util.MathUtils.sign(1.900763733941378E162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int2 = org.apache.commons.math.util.MathUtils.pow(1076101120, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1), 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-76) + "'", int2 == (-76));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 35625960447L, 76.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 78.76851654052734d + "'", double2 == 78.76851654052734d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.4650188248182272d, (double) 1072693282, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        boolean boolean3 = false; // flaky "8) test0400(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-532995727), (double) (short) 100, 1894776833);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(1.900763733941378E162d, (double) 1894776833, 650889.3870174974d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-3798431950569582479L), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3798431950569582479L + "'", long2 == 3798431950569582479L);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1074790324));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        int int19 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        double[] doubleArray21 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray17, (double) 10);
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray11, doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1079574559 + "'", int19 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int[] intArray2 = new int[] { (byte) 10, 35 };
        int[] intArray9 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int10 = org.apache.commons.math.util.MathUtils.distance1(intArray2, intArray9);
        int[] intArray16 = new int[] { (byte) 0, 1079541760, (-532995727), 2, 1079574559 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 76 + "'", int10 == 76);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 1079541760, (-532995727), 2, 1079574559 });
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(104, (-1074790303));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1074790407 + "'", int2 == 1074790407);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int int2 = org.apache.commons.math.util.MathUtils.pow(1, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        long long2 = org.apache.commons.math.util.MathUtils.pow(100L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 2, 3798431950569582479L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(1079574528, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1078034564, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1072693144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 0, (-97));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-1074790324), 0.5497390534142846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9302899837493896d + "'", double2 == 0.9302899837493896d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow(100, (long) (-532995532));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double double7 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        long long2 = org.apache.commons.math.util.MathUtils.gcd(532995726L, 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-532995532), 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(87, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(10, 1894776833);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(35, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-3798431950569582479L), 25.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1078034463, 1072693282);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int int2 = org.apache.commons.math.util.MathUtils.pow((-1611030093), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-803937719) + "'", int2 == (-803937719));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 532995726L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-97), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (-1074790400), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1894776833, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.894776833E9d + "'", double2 == 1.894776833E9d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int int2 = org.apache.commons.math.util.MathUtils.pow(101, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1630474681 + "'", int2 == 1630474681);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 100, (-574587745814872054L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 574587745814872154L + "'", long2 == 574587745814872154L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        double double2 = org.apache.commons.math.util.MathUtils.log((-2.0d), (double) 97);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-532995727), 1630474681);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int int2 = org.apache.commons.math.util.MathUtils.pow(1079525376, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 195, (double) Float.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(4598126.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (short) 0, 88.64536084872124d, 2.134336531441605E10d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection18 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray16, orderDirection18, true);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray22, (double) 10);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        double[] doubleArray38 = new double[] { 100L };
        double double39 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray38);
        double double40 = org.apache.commons.math.util.MathUtils.distance1(doubleArray35, doubleArray38);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray28, doubleArray38);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        int int45 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double[] doubleArray47 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray43, (double) 10);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection51 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray49, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray47, orderDirection51, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection51, false);
        double double60 = org.apache.commons.math.util.MathUtils.distance1(doubleArray16, doubleArray22);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22);
        boolean boolean62 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray22);
        java.lang.Class<?> wildcardClass63 = doubleArray22.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection18 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection18.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1079574559 + "'", int24 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1079574559 + "'", int45 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection51 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection51.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(3201, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3211 + "'", int2 == 3211);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 65, (long) 1076101120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1076101185L + "'", long2 == 1076101185L);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(3395.0d, 65.92419889539804d, (double) 1079541760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) (-1074790324), (long) 132);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (-1), 100 };
        int[] intArray12 = new int[] { 'a', '4' };
        int int13 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray12);
        int int14 = org.apache.commons.math.util.MathUtils.distance1(intArray2, intArray9);
        int[] intArray17 = new int[] { (-1), 100 };
        int[] intArray20 = new int[] { 'a', '4' };
        int int21 = org.apache.commons.math.util.MathUtils.distanceInf(intArray17, intArray20);
        int[] intArray24 = new int[] { (byte) 10, 35 };
        int[] intArray31 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int32 = org.apache.commons.math.util.MathUtils.distance1(intArray24, intArray31);
        int int33 = org.apache.commons.math.util.MathUtils.distance1(intArray20, intArray24);
        int int34 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray20);
        java.lang.Class<?> wildcardClass35 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 76 + "'", int32 == 76);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 104 + "'", int33 == 104);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 98 + "'", int34 == 98);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(76.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1079574559 + "'", int7 == 1079574559);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 20);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 1078034564);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) -1, (-1611030093));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.2250738585072014E-308d, (double) 1894776833);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.894776832824343E9d + "'", double2 == 1.894776832824343E9d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 1079574528);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1079574528 + "'", int2 == 1079574528);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        double double1 = org.apache.commons.math.util.MathUtils.sign(2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 65, 1630474681, (-1067909019));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 2, (long) 1076101120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2152202240L + "'", long2 == 2152202240L);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.lcm((long) 4, 9036866128227814273L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((-5.3299563E8d), (double) 10.0f, 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 10);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection24 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection24, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection24, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection24, true);
        double[] doubleArray32 = new double[] { 100L };
        double double33 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray32);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection34 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray32, orderDirection34, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection34, true);
        java.lang.Class<?> wildcardClass39 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1079574559 + "'", int18 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection24 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection24.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection34 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection34.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1067909120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1104139136 + "'", int1 == 1104139136);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (-1), 100 };
        int[] intArray12 = new int[] { 'a', '4' };
        int int13 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray12);
        int[] intArray16 = new int[] { (byte) 10, 35 };
        int[] intArray23 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int24 = org.apache.commons.math.util.MathUtils.distance1(intArray16, intArray23);
        int int25 = org.apache.commons.math.util.MathUtils.distance1(intArray12, intArray16);
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray5, intArray16);
        int[] intArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double28 = org.apache.commons.math.util.MathUtils.distance(intArray16, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 104 + "'", int25 == 104);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 87 + "'", int26 == 87);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 4, (double) 132);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 129.66370614359172d + "'", double2 == 129.66370614359172d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, (long) 1079525376);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 107952537600L + "'", long2 == 107952537600L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079001088 + "'", int1 == 1079001088);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) -1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 132);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0613084341780446E57d + "'", double1 == 1.0613084341780446E57d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1079541760, (-1067909120));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147450880 + "'", int2 == 2147450880);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) '#', 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1894776833);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1100758016 + "'", int1 == 1100758016);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1072693282);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1232288420165874E10d + "'", double1 == 2.1232288420165874E10d);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) 'a', (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(129.66370614359172d, (int) (byte) 1, 1078034463);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (long) 1079574528);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079574528L + "'", long2 == 1079574528L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        float float2 = org.apache.commons.math.util.MathUtils.round(0.0f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(98);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-35), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int2 = org.apache.commons.math.util.MathUtils.pow(4, (long) 1078034432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double double18 = org.apache.commons.math.util.MathUtils.distance1(doubleArray13, doubleArray16);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray20, doubleArray23);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray23);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray28);
        double[] doubleArray32 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) 10);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection36 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray34, orderDirection36, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray32, orderDirection36, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray13, orderDirection36, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection36, false);
        double double45 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray7);
        double[] doubleArray47 = new double[] { 100L };
        double double48 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray47);
        int int49 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        double[] doubleArray51 = new double[] { 100L };
        double double52 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray51);
        int int53 = org.apache.commons.math.util.MathUtils.hash(doubleArray51);
        double double54 = org.apache.commons.math.util.MathUtils.distance(doubleArray47, doubleArray51);
        double[] doubleArray56 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray47, 100.0d);
        double double57 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray47);
        double[] doubleArray59 = new double[] { 35 };
        double double60 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray59);
        double[] doubleArray62 = new double[] { 100L };
        double double63 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray62);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection64 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray62, orderDirection64, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray59, orderDirection64, true);
        double[] doubleArray74 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray76 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray74, (double) 1L);
        double double77 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray59, doubleArray74);
        double[] doubleArray79 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray74, (double) (-52L));
        double double80 = org.apache.commons.math.util.MathUtils.distance(doubleArray7, doubleArray79);
        double double81 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray83 = new double[] { 100L };
        double double84 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray83);
        double[] doubleArray86 = new double[] { 100L };
        double double87 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray86);
        double double88 = org.apache.commons.math.util.MathUtils.distance1(doubleArray83, doubleArray86);
        double double89 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray83);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1079574559 + "'", int30 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection36 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection36.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1079574559 + "'", int49 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1079574559 + "'", int53 == 1079574559);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 35.0d + "'", double60 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection64 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection64.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { (-11.741935483870968d), (-0.0d), (-33.54838709677419d), (-3.3548387096774195d), (-3.3548387096774195d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 111.74193548387098d + "'", double80 == 111.74193548387098d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 100.0d + "'", double81 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 100.0d + "'", double87 == 100.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 532995727L, 1.5830658481259483E30d, 20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-34), 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int[] intArray5 = new int[] { (short) -1, 2, (byte) 100, 100, (-1067909019) };
        int[] intArray8 = new int[] { (-1), 100 };
        int[] intArray11 = new int[] { 'a', '4' };
        int int12 = org.apache.commons.math.util.MathUtils.distanceInf(intArray8, intArray11);
        int[] intArray15 = new int[] { (-1), 100 };
        int[] intArray18 = new int[] { 'a', '4' };
        int int19 = org.apache.commons.math.util.MathUtils.distanceInf(intArray15, intArray18);
        int[] intArray22 = new int[] { (byte) 10, 35 };
        int[] intArray29 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int30 = org.apache.commons.math.util.MathUtils.distance1(intArray22, intArray29);
        int int31 = org.apache.commons.math.util.MathUtils.distance1(intArray18, intArray22);
        int int32 = org.apache.commons.math.util.MathUtils.distanceInf(intArray11, intArray22);
        int[] intArray35 = new int[] { (-1), 100 };
        int[] intArray38 = new int[] { 'a', '4' };
        int int39 = org.apache.commons.math.util.MathUtils.distanceInf(intArray35, intArray38);
        int[] intArray42 = new int[] { (-1), 100 };
        int[] intArray45 = new int[] { 'a', '4' };
        int int46 = org.apache.commons.math.util.MathUtils.distanceInf(intArray42, intArray45);
        int int47 = org.apache.commons.math.util.MathUtils.distance1(intArray35, intArray42);
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = org.apache.commons.math.util.MathUtils.distance1(intArray5, intArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 2, 100, 100, (-1067909019) });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 76 + "'", int30 == 76);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 104 + "'", int31 == 104);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 87 + "'", int32 == 87);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 98 + "'", int39 == 98);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 98 + "'", int46 == 98);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 65 + "'", int48 == 65);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-532995532));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-574587745814872064L), 1079541760, (-34));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-532995532));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1048576));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double double2 = org.apache.commons.math.util.MathUtils.log(87.0d, (double) 1104139136);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6625078825219655d + "'", double2 == 4.6625078825219655d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 4, 1072693247, 1072693247);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1074790400));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 1079574528L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.079574528E9d }, 1.0E-15);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-5));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection9, true);
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray13);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray13, (double) 10);
        double[] doubleArray19 = new double[] { 100L };
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray19);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        double double24 = org.apache.commons.math.util.MathUtils.distance1(doubleArray19, doubleArray22);
        double[] doubleArray26 = new double[] { 100L };
        double double27 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray26);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray29);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray19, doubleArray29);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        int int36 = org.apache.commons.math.util.MathUtils.hash(doubleArray34);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray34, (double) 10);
        double[] doubleArray40 = new double[] { 100L };
        double double41 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray40);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection42 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray40, orderDirection42, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray38, orderDirection42, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray19, orderDirection42, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray13, orderDirection42, false);
        double double51 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray13);
        double[] doubleArray53 = new double[] { 100L };
        double double54 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray53);
        int int55 = org.apache.commons.math.util.MathUtils.hash(doubleArray53);
        double[] doubleArray57 = new double[] { 100L };
        double double58 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray57);
        int int59 = org.apache.commons.math.util.MathUtils.hash(doubleArray57);
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray53, doubleArray57);
        double[] doubleArray62 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray53, 100.0d);
        double double63 = org.apache.commons.math.util.MathUtils.distance1(doubleArray13, doubleArray53);
        double[] doubleArray65 = new double[] { 35 };
        double double66 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray65);
        double[] doubleArray68 = new double[] { 100L };
        double double69 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray68);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection70 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray68, orderDirection70, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray65, orderDirection70, true);
        double[] doubleArray80 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray82 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray80, (double) 1L);
        double double83 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray65, doubleArray80);
        double[] doubleArray85 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray80, (double) (-52L));
        double double86 = org.apache.commons.math.util.MathUtils.distance(doubleArray13, doubleArray85);
        double double87 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection9 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection9.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1079574559 + "'", int15 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1079574559 + "'", int36 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection42 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection42.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1079574559 + "'", int55 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1079574559 + "'", int59 == 1079574559);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 35.0d + "'", double66 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 100.0d + "'", double69 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection70 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection70.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { (-11.741935483870968d), (-0.0d), (-33.54838709677419d), (-3.3548387096774195d), (-3.3548387096774195d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 111.74193548387098d + "'", double86 == 111.74193548387098d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
    }
}
