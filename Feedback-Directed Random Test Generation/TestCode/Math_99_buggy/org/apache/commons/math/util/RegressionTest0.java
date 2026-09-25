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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852868E30d + "'", double2 == 1.5845632502852868E30d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        float float2 = org.apache.commons.math.util.MathUtils.round(1.0f, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        double double0 = org.apache.commons.math.util.MathUtils.SAFE_MIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.2250738585072014E-308d + "'", double0 == 2.2250738585072014E-308d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0333147966386297E40d + "'", double1 == 1.0333147966386297E40d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(100.0d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.0d + "'", double2 == 50.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        double double3 = org.apache.commons.math.util.MathUtils.round(1.5845632502852868E30d, 97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5845632502852868E30d + "'", double3 == 1.5845632502852868E30d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.2250738585072014E-308d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2250738585072014E-308d + "'", double2 == 2.2250738585072014E-308d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(1.5845632502852868E30d, (double) 'a', (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 0, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 10L, (int) 'a');
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        double double0 = org.apache.commons.math.util.MathUtils.EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-16d + "'", double0 == 1.1102230246251565E-16d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(50.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(10.0d, (double) 0.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (byte) 100, (double) '4', (double) Float.NaN);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079574528 + "'", int1 == 1079574528);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (short) 100, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1079574528);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) ' ', (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.11503837897544d + "'", double2 == 101.11503837897544d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 1, 1079574528);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1079574529 + "'", int2 == 1079574529);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1079574529);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 10.0f, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.13617560368711d + "'", double1 == 92.13617560368711d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(2, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-95) + "'", int2 == (-95));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-1), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11L) + "'", long2 == (-11L));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 0L, (int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 3, (-1074790400));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, (double) 1079574529);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0795745307187357E9d + "'", double2 == 1.0795745307187357E9d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-95));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.056195414445117E40d) + "'", double1 == (-9.056195414445117E40d));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 2, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        long long1 = org.apache.commons.math.util.MathUtils.sign(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (byte) -1, (-95));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(97, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.969700941885356E27d + "'", double2 == 9.969700941885356E27d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-9.056195414445117E40d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 378821512 + "'", int1 == 378821512);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 378821512, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(97, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (long) (-1074790400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1074790400L) + "'", long2 == (-1074790400L));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1079574529);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int int1 = org.apache.commons.math.util.MathUtils.hash(1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1072693248 + "'", int1 == 1072693248);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1L, 1072693248, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1072693248, 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0571946649941077E26d + "'", double2 == 2.0571946649941077E26d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.332621544395286E157d + "'", double1 == 9.332621544395286E157d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (short) 0, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (short) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1, (double) (-1074790400));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0747903993285136E9d) + "'", double2 == (-1.0747903993285136E9d));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1079574528, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 349.9541180407703d + "'", double1 == 349.9541180407703d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((-1.0d), 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-11L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29937.07084924806d) + "'", double1 == (-29937.07084924806d));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        float float1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 10, (long) (-95));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-1.0f), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((-1.0747903993285136E9d), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0747903993285134E9d) + "'", double2 == (-1.0747903993285134E9d));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) 1, 97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 0, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (byte) 10, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        float float2 = org.apache.commons.math.util.MathUtils.round(1.0f, (int) 'a');
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(378821512, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 870.7730969879667d + "'", double2 == 870.7730969879667d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 378821512, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.78821512E8d + "'", double2 == 3.78821512E8d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) '#', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-62) + "'", int2 == (-62));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(9.332621544395286E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-90L), (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(10L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1079574529, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (short) 100, (-95));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (short) 1, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 2, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000004d + "'", double2 == 2.0000000000000004d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(349.9541180407703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.809637984124462E151d + "'", double1 == 4.809637984124462E151d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815244d + "'", double1 == 1.543080634815244d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 110L, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9797233107284223d + "'", double2 == 0.9797233107284223d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) (-1), (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-90L), 1.3440585709080678E43d, 1.543080634815244d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(9.969700941885356E27d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0208973764490605E31d + "'", double2 == 1.0208973764490605E31d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-11L), (-29937.07084924806d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-29937.81161809637d) + "'", double2 == (-29937.81161809637d));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) '#', 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 595.0d + "'", double2 == 595.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (-1125991615), 0, 2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.12599155E9f) + "'", float3 == (-1.12599155E9f));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.065817517094494E67d + "'", double1 == 8.065817517094494E67d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-9.056195414445117E40d), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(1.0208973764490605E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(2.0000000000000004d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1072693248, 378821512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1451514760 + "'", int2 == 1451514760);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1074790400), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 4, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        double[] doubleArray21 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray28 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray28);
        boolean boolean30 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray21);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int32 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1125991615) + "'", int31 == (-1125991615));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1125991615) + "'", int32 == (-1125991615));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 378821512);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1, 1079574529);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (byte) -1, 11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.423843485814d + "'", double2 == 11013.423843485814d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (short) -1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int int1 = org.apache.commons.math.util.MathUtils.hash(0.9797233107284223d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1933968693) + "'", int1 == (-1933968693));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(1.0333147966386297E40d, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0333147966386295E40d + "'", double2 == 1.0333147966386295E40d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((-29937.07084924806d), 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1125991615));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 1000L, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 999.9999999999999d + "'", double2 == 999.9999999999999d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-95));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        double double2 = org.apache.commons.math.util.MathUtils.round(1.543080634815244d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5d + "'", double2 == 1.5d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(378821512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(1.0208973764490605E31d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0208973764490605E31d + "'", double2 == 1.0208973764490605E31d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.0333147966386295E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-1287300162), (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-1074790400), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0747904E9d) + "'", double2 == (-1.0747904E9d));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(97, (-1287300162));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1L), (long) (-1933968693));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1933968692L + "'", long2 == 1933968692L);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1125991615), (-1287300162));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        float float1 = org.apache.commons.math.util.MathUtils.sign((-1.12599155E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-11L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(999.9999999999999d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9735361584456541d + "'", double2 == 0.9735361584456541d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-95), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-95) + "'", int2 == (-95));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 97, (double) Float.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(378821512, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 378821512 + "'", int2 == 378821512);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (byte) 0, 110L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (short) 0, (long) (-1074790400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1074790400L + "'", long2 == 1074790400L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1125991615));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) '4', (-1125991615));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1125991563) + "'", int2 == (-1125991563));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-1933968693));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        double double1 = org.apache.commons.math.util.MathUtils.sign(1.0333147966386297E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int int1 = org.apache.commons.math.util.MathUtils.hash(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50.0f + "'", float2 == 50.0f);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1287300162));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1079574528);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 110L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((-29937.81161809637d), 870.7730969879667d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (short) 10, 0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 1, 1451514760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1451514759) + "'", int2 == (-1451514759));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (byte) -1, (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1125991563));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 100, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96L + "'", long2 == 96L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-3), 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0d) + "'", double2 == (-3.0d));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round(50.0f, 0, 378821512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1933968693), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1451514759));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815244d + "'", double1 == 1.543080634815244d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 96L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) '4', 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (short) 0, (double) 1079574529);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1074790400L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1933968692L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 10, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42L) + "'", long2 == (-42L));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-62));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-90L), 1079574528);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24L + "'", long1 == 24L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1079574529);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1079574529, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.07957453E9f + "'", float2 == 1.07957453E9f);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1079574528, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-1074790400));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        double double1 = org.apache.commons.math.util.MathUtils.sign(0.9797233107284223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) -1, 1079574529);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1079574530) + "'", int2 == (-1079574530));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, 50.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 0, (-1125991563));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1125991563) + "'", int2 == (-1125991563));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(8.065817517094494E67d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1079574529, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(1079574529, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1.07957453E9f, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.55795945611504d + "'", double1 == 81.55795945611504d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 110L, 1.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.185849777947027d + "'", double2 == 3.185849777947027d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-1.12599155E9f), (double) 24L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-29937.81161809637d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 96L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1933968692L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) ' ', 1072693248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 1000L, (double) (-0.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 999.9999999999999d + "'", double2 == 999.9999999999999d);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1000);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1125991615) + "'", int15 == (-1125991615));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 2, 378821512, (-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray21 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean22 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray21);
        java.lang.Class<?> wildcardClass23 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1125991615) + "'", int15 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1000);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        double[] doubleArray21 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray28 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray28);
        boolean boolean30 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray21);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray38 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray45 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray38, doubleArray45);
        int int47 = org.apache.commons.math.util.MathUtils.hash(doubleArray38);
        double[] doubleArray48 = null;
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray38, doubleArray48);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray48);
        int int51 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1125991615) + "'", int31 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1125991615) + "'", int47 == (-1125991615));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1125991615) + "'", int51 == (-1125991615));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-11L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((-29937.07084924806d), 2.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.0d, 9.969700941885356E27d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.969700941885356E27d + "'", double2 == 9.969700941885356E27d);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (byte) 10, 0.9735361584456541d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(0.9797233107284223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1441520798404945d + "'", double1 == 1.1441520798404945d);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-11L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((-1125991615), (-1079574530));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(378821512, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 378821502 + "'", int2 == 378821502);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1074790400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        double double2 = org.apache.commons.math.util.MathUtils.log(3.185849777947027d, (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.598201241929278d + "'", double2 == 0.598201241929278d);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        double double2 = org.apache.commons.math.util.MathUtils.log(100.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1287300162), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1072693248, 378821502);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1451514750 + "'", int2 == 1451514750);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1079574529, 378821502);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 0, 1451514760);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 197 + "'", int2 == 197);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-1125991615));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(1.0333147966386297E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(3.185849777947027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.073245432250028d + "'", double1 == 12.073245432250028d);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(1000L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1001L + "'", long2 == 1001L);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-62), 1001L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1063L) + "'", long2 == (-1063L));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(870.7730969879667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(4, (-1287300162));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-6L), 4, (-1287300162));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        double double2 = org.apache.commons.math.util.MathUtils.log(999.9999999999999d, 1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.3761393982204d + "'", double2 == 14.3761393982204d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        double[] doubleArray21 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray28 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray28);
        double[] doubleArray36 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray43 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equals(doubleArray36, doubleArray43);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray36);
        int int46 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        double[] doubleArray53 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray60 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equals(doubleArray53, doubleArray60);
        int int62 = org.apache.commons.math.util.MathUtils.hash(doubleArray53);
        double[] doubleArray63 = null;
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equals(doubleArray53, doubleArray63);
        boolean boolean65 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray63);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray63);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1125991615) + "'", int46 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1125991615) + "'", int62 == (-1125991615));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-42L), 1000, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        double[] doubleArray21 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray28 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray28);
        boolean boolean30 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray21);
        java.lang.Class<?> wildcardClass31 = doubleArray21.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(6.0d, (double) 24L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        long long1 = org.apache.commons.math.util.MathUtils.sign(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-95));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 1000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round(2.0571946649941077E26d, (-1125991615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1287300162));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 4, 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        double double2 = org.apache.commons.math.util.MathUtils.log(1.0208973764490605E31d, 3.78821512E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2766435418254151d + "'", double2 == 0.2766435418254151d);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-95));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(2.0571946649941077E26d, (double) Float.NaN, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1125991563));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1.07957453E9f, 870.7730969879667d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.71315737027922d + "'", double1 == 201.71315737027922d);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-1063L), 1072693248, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-6L), (double) (-1063L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.000000000000001d) + "'", double2 == (-6.000000000000001d));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1079574530), (-1933968693));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 378821512);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-910781349) + "'", int1 == (-910781349));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1451514760);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray21 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean22 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray21);
        double[] doubleArray29 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray36 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray36);
        int int38 = org.apache.commons.math.util.MathUtils.hash(doubleArray29);
        double[] doubleArray44 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray44);
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray44);
        int int47 = org.apache.commons.math.util.MathUtils.hash(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1125991615) + "'", int15 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1125991615) + "'", int38 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1310747978 + "'", int47 == 1310747978);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1079574530), (-910781349));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-1287300162), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.43650081E8d) + "'", double2 == (-6.43650081E8d));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1079574530), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-62));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 2, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(81.55795945611504d, (-1), 1079574529);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        double[] doubleArray21 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray28 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray28);
        boolean boolean30 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray21);
        double[] doubleArray37 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray44 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray37, doubleArray44);
        int int46 = org.apache.commons.math.util.MathUtils.hash(doubleArray37);
        double[] doubleArray52 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equals(doubleArray37, doubleArray52);
        double[] doubleArray60 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray67 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean68 = org.apache.commons.math.util.MathUtils.equals(doubleArray60, doubleArray67);
        int int69 = org.apache.commons.math.util.MathUtils.hash(doubleArray60);
        double[] doubleArray75 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean76 = org.apache.commons.math.util.MathUtils.equals(doubleArray60, doubleArray75);
        boolean boolean77 = org.apache.commons.math.util.MathUtils.equals(doubleArray52, doubleArray75);
        boolean boolean78 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray52);
        java.lang.Class<?> wildcardClass79 = doubleArray21.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1125991615) + "'", int46 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1125991615) + "'", int69 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) -1, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        double double1 = org.apache.commons.math.util.MathUtils.sign(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(25, (-1079574530));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray24 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray31 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray31);
        int int33 = org.apache.commons.math.util.MathUtils.hash(doubleArray24);
        double[] doubleArray39 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray39);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1125991615) + "'", int15 == (-1125991615));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1125991615) + "'", int16 == (-1125991615));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1125991615) + "'", int17 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1125991615) + "'", int33 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1079574530));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (byte) -1, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.53096491487338d + "'", double2 == 99.53096491487338d);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1L), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        int int1 = org.apache.commons.math.util.MathUtils.hash(81.55795945611504d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-608156879) + "'", int1 == (-608156879));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(50.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(1310747978, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1310747978 + "'", int2 == 1310747978);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1287300162));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(378821512);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 0, (long) 1451514760);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1451514760L) + "'", long2 == (-1451514760L));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1000);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5912.128178488171d + "'", double1 == 5912.128178488171d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.2766435418254151d, (-1079574530), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1310747978, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-1L), 1079574529, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1079574528, (-1074790400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1160316338778931200L) + "'", long2 == (-1160316338778931200L));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1451514760, 1072693248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: add");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        float float1 = org.apache.commons.math.util.MathUtils.sign(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-1451514759));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1), 1451514750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1451514750) + "'", int2 == (-1451514750));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-62));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-1.0747903993285136E9d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1040516513 + "'", int1 == 1040516513);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1000, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.141712475E10d + "'", double2 == 4.141712475E10d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1451514759), (long) (-95));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137893902105L + "'", long2 == 137893902105L);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-1), 378821502);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3207363278391631E269d) + "'", double2 == (-1.3207363278391631E269d));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        int int1 = org.apache.commons.math.util.MathUtils.sign(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1933968692L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1000, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1000.0d + "'", double2 == 1000.0d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray14 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray14);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray17 = null;
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray17);
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1125991615) + "'", int16 == (-1125991615));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-90L), (long) 1072693248);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96542392320L) + "'", long2 == (-96542392320L));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 1451514760);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        double double2 = org.apache.commons.math.util.MathUtils.round(2.0000000000000004d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000004d + "'", double2 == 2.0000000000000004d);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 378821502, 1079574529);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1310747978, (-95));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1451514750));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1079574528, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1310747978, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1310747978L + "'", long2 == 1310747978L);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1.12599155E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (short) -1, (double) 197);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray23 = new double[] { (-6L), 3.78821512E8d, 4.141712475E10d, 1451514760, 870.7730969879667d, 2.0d };
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1125991615) + "'", int15 == (-1125991615));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1125991615) + "'", int16 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-6.0d), 3.78821512E8d, 4.141712475E10d, 1.45151476E9d, 870.7730969879667d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-1451514759), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 197, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 297L + "'", long2 == 297L);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-42L), (long) (-608156879));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-608156921L) + "'", long2 == (-608156921L));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1072693248);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1232287713188984E10d + "'", double1 == 2.1232287713188984E10d);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) 105L, (-1125991563));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        double double2 = org.apache.commons.math.util.MathUtils.round((-9.056195414445117E40d), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.056195414445117E40d) + "'", double2 == (-9.056195414445117E40d));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1451514760, (-1079574530), 1072693248);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        double[] doubleArray21 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray28 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray28);
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        double[] doubleArray36 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray36);
        double[] doubleArray44 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray51 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray51);
        int int53 = org.apache.commons.math.util.MathUtils.hash(doubleArray44);
        double[] doubleArray59 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray59);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equals(doubleArray36, doubleArray59);
        int int62 = org.apache.commons.math.util.MathUtils.hash(doubleArray36);
        boolean boolean63 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray36);
        int int64 = org.apache.commons.math.util.MathUtils.hash(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1125991615) + "'", int30 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1125991615) + "'", int53 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1310747978 + "'", int62 == 1310747978);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1310747978 + "'", int64 == 1310747978);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 25);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-3), 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0d) + "'", double2 == (-3.0d));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-3), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1287300162));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(349.9541180407703d, 1000.0d, (double) (-62));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        int int1 = org.apache.commons.math.util.MathUtils.hash(0.9735361584456541d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1926286133 + "'", int1 == 1926286133);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 25, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2250L) + "'", long2 == (-2250L));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 100, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 200L + "'", long2 == 200L);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1125991615) + "'", int15 == (-1125991615));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1125991615) + "'", int16 == (-1125991615));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray21 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean22 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray21);
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        java.lang.Class<?> wildcardClass24 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1125991615) + "'", int15 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1125991615) + "'", int23 == (-1125991615));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(1310747978L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1310747978L + "'", long2 == 1310747978L);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-96542392320L), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96542392320L + "'", long2 == 96542392320L);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1079574528);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 1072693248, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.072693248E9d + "'", double2 == 1.072693248E9d);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1926286133);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-96542392320L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-96542392320L), (long) 25);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96542392295L) + "'", long2 == (-96542392295L));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438016d) + "'", double1 == (-1.1752011936438016d));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-97) + "'", int2 == (-97));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 100, 1079574529, 197);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(96542392320L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96542392320L) + "'", long2 == (-96542392320L));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-1.0747903993285136E9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 378821502, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.78821504E8f + "'", float2 == 3.78821504E8f);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-97), (-1125991615));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-6L), (double) 105L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 107.09733552923255d + "'", double2 == 107.09733552923255d);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 98, (-97), 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(25, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        double double2 = org.apache.commons.math.util.MathUtils.log(107.09733552923255d, 1.0333147966386297E40d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.713594055978845d + "'", double2 == 19.713594055978845d);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        double[] doubleArray3 = new double[] { (-90L), 9.332621544395286E157d, 870.7730969879667d };
        int int4 = org.apache.commons.math.util.MathUtils.hash(doubleArray3);
        int int5 = org.apache.commons.math.util.MathUtils.hash(doubleArray3);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-90.0d), 9.332621544395286E157d, 870.7730969879667d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1287300162) + "'", int4 == (-1287300162));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1287300162) + "'", int5 == (-1287300162));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(1000L, (-11L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1011L + "'", long2 == 1011L);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 98, (-910781349));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((-6.000000000000001d), (double) (-97), (double) 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-96542392320L), (-910781349));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1451514760, 105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 152409049800L + "'", long2 == 152409049800L);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1926286133, 197);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1125991615));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1310747978L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.310747978E9d + "'", double2 == 1.310747978E9d);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (-1451514750), 378821502, 3);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        double[] doubleArray6 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        double[] doubleArray21 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray28 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray28);
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        double[] doubleArray36 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray36);
        double[] doubleArray44 = new double[] { 10L, (short) -1, 0, 97, (short) -1, 'a' };
        double[] doubleArray51 = new double[] { 2, (short) 10, (byte) 10, (-1), (short) -1, 3 };
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray51);
        int int53 = org.apache.commons.math.util.MathUtils.hash(doubleArray44);
        double[] doubleArray59 = new double[] { 3.78821512E8d, 9.332621544395286E157d, (byte) 0, (-1074790400L), (-1.0d) };
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray59);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equals(doubleArray36, doubleArray59);
        int int62 = org.apache.commons.math.util.MathUtils.hash(doubleArray36);
        boolean boolean63 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray36);
        java.lang.Class<?> wildcardClass64 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1125991615) + "'", int30 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, (-1.0d), 0.0d, 97.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 2.0d, 10.0d, 10.0d, (-1.0d), (-1.0d), 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1125991615) + "'", int53 == (-1125991615));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 3.78821512E8d, 9.332621544395286E157d, 0.0d, (-1.0747904E9d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1310747978 + "'", int62 == 1310747978);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-97), (double) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 105L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-90L), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0354056994857928d) + "'", double2 == (-2.0354056994857928d));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(378821512, 1310747978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1933968693));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1451514759));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 10, (-6L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-60L) + "'", long2 == (-60L));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 3.78821504E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(1451514750, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1451514750 + "'", int2 == 1451514750);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(81.55795945611504d, 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 652.4636756489203d + "'", double2 == 652.4636756489203d);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1451514760);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }
}

