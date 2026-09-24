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
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308232d + "'", double1 == 572.9577951308232d);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 10.0f, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.984807753012208d + "'", double1 == 0.984807753012208d);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.00000000000001d + "'", double1 == 52.00000000000001d);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        double double1 = org.apache.commons.math.util.FastMath.acosh(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        double double2 = org.apache.commons.math.util.FastMath.max(10.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        double double0 = org.apache.commons.math.util.FastMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        double double1 = org.apache.commons.math.util.FastMath.signum(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.896296018267969E13d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896296018267967E13d + "'", double2 == 7.896296018267967E13d);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4711276743037347d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        float float1 = org.apache.commons.math.util.FastMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9512437185814275d + "'", double1 == 3.9512437185814275d);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.984807753012208d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3440585709080678E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.896296018267967E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        double double1 = org.apache.commons.math.util.FastMath.sinh(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8212977905417654E24d + "'", double1 == 3.8212977905417654E24d);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        float float1 = org.apache.commons.math.util.FastMath.abs(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.897423420904053d + "'", double1 == 13.897423420904053d);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        double double0 = org.apache.commons.math.util.FastMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.896296018267967E13d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896296018267966E13d + "'", double2 == 7.896296018267966E13d);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        long long1 = org.apache.commons.math.util.FastMath.abs(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        double double0 = org.apache.commons.math.util.FastMath.random();
// flaky "1) test00067(org.apache.commons.math.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.7582649015960806d + "'", double0 == 0.7582649015960806d);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806718d + "'", double1 == 22026.465794806718d);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        double double1 = org.apache.commons.math.util.FastMath.rint(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806718d + "'", double1 == 22026.465794806718d);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        double double1 = org.apache.commons.math.util.FastMath.log10(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.342925101645957d + "'", double1 == 4.342925101645957d);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037345d + "'", double1 == 1.4711276743037345d);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.984807753012208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3962634015954634d + "'", double1 == 1.3962634015954634d);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 100, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        double double1 = org.apache.commons.math.util.FastMath.asin(13.897423420904053d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (short) 10, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        double double1 = org.apache.commons.math.util.FastMath.tan(52.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.053272382792571d) + "'", double1 == (-6.053272382792571d));
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9877735581754346d + "'", double1 == 1.9877735581754346d);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        double double1 = org.apache.commons.math.util.FastMath.acos(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.00961538461539d + "'", double1 == 26.00961538461539d);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        double double1 = org.apache.commons.math.util.FastMath.log(52.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9512437185814275d + "'", double1 == 3.9512437185814275d);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 52L, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        double double1 = org.apache.commons.math.util.FastMath.cos(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703395d + "'", double1 == 11013.232874703395d);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        double double1 = org.apache.commons.math.util.FastMath.acos(22026.465794806718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.896296018267967E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268E13d + "'", double1 == 7.896296018268E13d);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.2318521822d + "'", double1 == 1261966.2318521822d);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        double double1 = org.apache.commons.math.util.FastMath.cosh(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.399216241149525E248d + "'", double1 == 3.399216241149525E248d);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        double double1 = org.apache.commons.math.util.FastMath.cosh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        double double1 = org.apache.commons.math.util.FastMath.floor(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.0d + "'", double1 == 1261966.0d);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        double double1 = org.apache.commons.math.util.FastMath.signum(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        int int1 = org.apache.commons.math.util.FastMath.round((-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        double double2 = org.apache.commons.math.util.FastMath.pow(2005.3522829578812d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.342925101645957d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) -1, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        double double2 = org.apache.commons.math.util.FastMath.min(0.36787944117144233d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36787944117144233d + "'", double2 == 0.36787944117144233d);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1261966.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.0d + "'", double1 == 1261966.0d);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.8212977905417654E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308233d + "'", double1 == 572.9577951308233d);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        long long1 = org.apache.commons.math.util.FastMath.round(26.00961538461539d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 26L + "'", long1 == 26L);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.8212977905417654E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7253825588523148d + "'", double1 == 1.7253825588523148d);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19240232444172617d + "'", double1 == 0.19240232444172617d);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 0L, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027712143770207958d + "'", double1 == 0.027712143770207958d);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.027712143770207958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027719239916259047d + "'", double1 == 0.027719239916259047d);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320668d + "'", double1 == 1.8184464592320668d);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        double double1 = org.apache.commons.math.util.FastMath.rint((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.0d) + "'", double1 == (-57.0d));
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.896296018267966E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267966E13d + "'", double1 == 7.896296018267966E13d);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9224869535749408E-5d + "'", double1 == 1.9224869535749408E-5d);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        double double1 = org.apache.commons.math.util.FastMath.sinh(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.399216241149911E248d + "'", double1 == 3.399216241149911E248d);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7615941559557649d), (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.073385839060845E-7d + "'", double2 == 7.073385839060845E-7d);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9732324798502845d + "'", double1 == 0.9732324798502845d);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.027719239916259047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30264054181560024d + "'", double1 == 0.30264054181560024d);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132616875182228d + "'", double1 == 1.3132616875182228d);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) ' ', 0.7582649015960806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.845300947487885d + "'", double2 == 13.845300947487885d);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7853981633974483d, 3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.848501131276805d) + "'", double1 == (-3.848501131276805d));
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.38905609893065d + "'", double1 == 7.38905609893065d);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        double double1 = org.apache.commons.math.util.FastMath.acosh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999995877692d + "'", double1 == 9.999999995877692d);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.949874371066198d + "'", double1 == 9.949874371066198d);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        double double1 = org.apache.commons.math.util.FastMath.atan(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        double double1 = org.apache.commons.math.util.FastMath.signum(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (byte) 1, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        double double2 = org.apache.commons.math.util.FastMath.min(572.9577951308232d, 9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.949874371066198d + "'", double2 == 9.949874371066198d);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.993222846126381d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        long long1 = org.apache.commons.math.util.FastMath.abs(26L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 26L + "'", long1 == 26L);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.896296018267967E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.524244356327113E15d + "'", double1 == 4.524244356327113E15d);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        double double1 = org.apache.commons.math.util.FastMath.log(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.04818156408044d + "'", double1 == 14.04818156408044d);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        double double2 = org.apache.commons.math.util.FastMath.pow(Double.POSITIVE_INFINITY, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.30685281944005d + "'", double1 == 99.30685281944005d);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893683d) + "'", double1 == (-0.5440211108893683d));
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134E13d + "'", double1 == 3.948148009134E13d);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        int int1 = org.apache.commons.math.util.FastMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149994957367078d + "'", double1 == 0.9149994957367078d);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.896296018267967E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047442967903742035d + "'", double1 == 0.047442967903742035d);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6897511201227055d) + "'", double1 == (-0.6897511201227055d));
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        double double1 = org.apache.commons.math.util.FastMath.atanh(14.04818156408044d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932228457120735d + "'", double1 == 2.9932228457120735d);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        double double1 = org.apache.commons.math.util.FastMath.rint((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.0d) + "'", double1 == (-57.0d));
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.342925101645957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.93224517135305d + "'", double1 == 76.93224517135305d);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5430806348152437d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-57.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        double double1 = org.apache.commons.math.util.FastMath.asin(76.93224517135305d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        double double2 = org.apache.commons.math.util.FastMath.pow(57.29577951308232d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8886110.520507816d + "'", double1 == 8886110.520507816d);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        long long1 = org.apache.commons.math.util.FastMath.round(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.30264054181560024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005282073904701802d + "'", double1 == 0.005282073904701802d);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 26L, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7897808285809945E73d + "'", double2 == 3.7897808285809945E73d);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.88733853924697d + "'", double1 == 171.88733853924697d);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        long long1 = org.apache.commons.math.util.FastMath.round(Double.NaN);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6283429.00742421d + "'", double1 == 6283429.00742421d);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(32.0d, 1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        double double1 = org.apache.commons.math.util.FastMath.asin(31.999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        double double2 = org.apache.commons.math.util.FastMath.max(7.896296018267967E13d, 4.524244356327113E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.524244356327113E15d + "'", double2 == 4.524244356327113E15d);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5017009167919775d + "'", double1 == 0.5017009167919775d);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5017009167919775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5230140581531376d + "'", double1 == 0.5230140581531376d);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        double double1 = org.apache.commons.math.util.FastMath.tan(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9224869535749408E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.355372716651809E-7d + "'", double1 == 3.355372716651809E-7d);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134E13d + "'", double1 == 3.948148009134E13d);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        long long1 = org.apache.commons.math.util.FastMath.round(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 573L + "'", long1 == 573L);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        double double1 = org.apache.commons.math.util.FastMath.expm1(171.88733853924697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.463984075193098E74d + "'", double1 == 4.463984075193098E74d);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2401310215141802E-16d + "'", double1 == 1.2401310215141802E-16d);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999995520374d + "'", double1 == 9.999999995520374d);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9518224930797358d + "'", double1 == 0.9518224930797358d);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 52L, 1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999999999999d + "'", double2 == 51.99999999999999d);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2401310215141802E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.463984075193098E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.463984075193098E74d + "'", double1 == 4.463984075193098E74d);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999999958776927d, 1.9224869535749408E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9224869535749408E-5d + "'", double2 == 1.9224869535749408E-5d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        long long1 = org.apache.commons.math.util.FastMath.round(3.399216241149911E248d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6321205588285577d), 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.993222846126381d, (-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4694426632156045d + "'", double2 == 0.4694426632156045d);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        int int1 = org.apache.commons.math.util.FastMath.abs((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        int int1 = org.apache.commons.math.util.FastMath.round((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        double double2 = org.apache.commons.math.util.FastMath.min((double) '4', 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459045d + "'", double2 == 2.718281828459045d);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-57.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        double double1 = org.apache.commons.math.util.FastMath.rint(26.00961538461539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.0d + "'", double1 == 26.0d);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.027712143770207958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16646964819512283d + "'", double1 == 0.16646964819512283d);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5230140581531376d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        double double1 = org.apache.commons.math.util.FastMath.tanh(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        double double1 = org.apache.commons.math.util.FastMath.atan(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 52.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.949874371066198d + "'", double1 == 18.949874371066198d);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5230140581531376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.842859999667966E24d) + "'", double1 == (-2.842859999667966E24d));
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999103740052037d + "'", double1 == 0.9999103740052037d);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854067E-14d + "'", double1 == 1.2722218725854067E-14d);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 573L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.091500380984786E248d + "'", double1 == 7.091500380984786E248d);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134E13d + "'", double1 == 3.948148009134E13d);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2.842859999667966E24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842859999667966E24d + "'", double1 == 2.842859999667966E24d);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        double double1 = org.apache.commons.math.util.FastMath.cos(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 26L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9624960684073707d + "'", double1 == 2.9624960684073707d);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066027288565E7d + "'", double1 == 3.748066027288565E7d);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.342925101645957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        double double1 = org.apache.commons.math.util.FastMath.acosh(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.693147180044656d + "'", double1 == 10.693147180044656d);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.896296018267969E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        double double2 = org.apache.commons.math.util.FastMath.max(0.30264054181560024d, 4.463984075193098E74d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.463984075193098E74d + "'", double2 == 4.463984075193098E74d);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        double double1 = org.apache.commons.math.util.FastMath.signum(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        int int1 = org.apache.commons.math.util.FastMath.abs(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (byte) -1, 0.5230140581531376d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0889074357665707d) + "'", double2 == (-1.0889074357665707d));
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        double double2 = org.apache.commons.math.util.FastMath.atan2(26.00961538461539d, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8199681505512405E-18d + "'", double2 == 2.8199681505512405E-18d);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        double double2 = org.apache.commons.math.util.FastMath.min(32.0d, 2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        double double1 = org.apache.commons.math.util.FastMath.cos((-3.848501131276805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7603734074051981d) + "'", double1 == (-0.7603734074051981d));
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6929693744344998d, 51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999999999999d + "'", double2 == 51.99999999999999d);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009494959585376654d) + "'", double1 == (-0.009494959585376654d));
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 7L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12217304763960307d + "'", double1 == 0.12217304763960307d);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        double double1 = org.apache.commons.math.util.FastMath.sin(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.9932228457120735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8163011534362759d + "'", double1 == 1.8163011534362759d);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        double double1 = org.apache.commons.math.util.FastMath.cosh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.342925101645957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.45962336030118d + "'", double1 == 38.45962336030118d);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 26L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1787535542062797d + "'", double1 == 1.1787535542062797d);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        int int1 = org.apache.commons.math.util.FastMath.abs(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.2328896037985d) + "'", double1 == (-89.2328896037985d));
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        double double1 = org.apache.commons.math.util.FastMath.tan(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        double double1 = org.apache.commons.math.util.FastMath.ceil(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        double double1 = org.apache.commons.math.util.FastMath.acos(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.389377026852705d + "'", double1 == 14.389377026852705d);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.691649480399091E41d + "'", double1 == 4.691649480399091E41d);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999103740052037d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4762966926573635d) + "'", double1 == (-0.4762966926573635d));
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        double double1 = org.apache.commons.math.util.FastMath.cos(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16299078079570548d) + "'", double1 == (-0.16299078079570548d));
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.842859999667966E24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        double double2 = org.apache.commons.math.util.FastMath.min(1261966.0d, 0.9999103740052037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999103740052037d + "'", double2 == 0.9999103740052037d);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.399216241149911E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19687317393211679d) + "'", double1 == (-0.19687317393211679d));
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1787535542062797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020573130590485034d + "'", double1 == 0.020573130590485034d);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) '4', 4.691649480399091E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.00000000000001d + "'", double2 == 52.00000000000001d);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        double double2 = org.apache.commons.math.util.FastMath.max((-89.2328896037985d), 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703393d + "'", double2 == 11013.232874703393d);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.69314718055993d + "'", double1 == 32.69314718055993d);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.376727508058575d + "'", double1 == 0.376727508058575d);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7182818284590453d, 0.027719239916259047d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027719239916259047d + "'", double2 == 0.027719239916259047d);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        double double1 = org.apache.commons.math.util.FastMath.exp(76.93224517135305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5778020121309203E33d + "'", double1 == 2.5778020121309203E33d);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.986746382996133d + "'", double1 == 0.986746382996133d);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9877735581754346d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.027712143770207958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027705053070945423d + "'", double1 == 0.027705053070945423d);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        double double2 = org.apache.commons.math.util.FastMath.max(3.748066027288565E7d, 4.691649480399091E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.691649480399091E41d + "'", double2 == 4.691649480399091E41d);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 97);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.9932228457120735d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7615941559557649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.020573130590485034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066E7d + "'", double1 == 3.748066E7d);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.16646964819512283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4080069217490346d + "'", double1 == 0.4080069217490346d);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        double double2 = org.apache.commons.math.util.FastMath.min(2.9624960684073707d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9624960684073707d + "'", double2 == 2.9624960684073707d);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999986258976d + "'", double1 == 0.9999999986258976d);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(51.99999999999999d, 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        double double2 = org.apache.commons.math.util.FastMath.max((-57.29577951308232d), 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250313E-16d + "'", double2 == 2.220446049250313E-16d);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 26L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        double double1 = org.apache.commons.math.util.FastMath.ulp(99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        double double1 = org.apache.commons.math.util.FastMath.expm1(76.93224517135305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5778020121309203E33d + "'", double1 == 2.5778020121309203E33d);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.19240232444172617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5773024999492183d + "'", double1 == 0.5773024999492183d);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        double double1 = org.apache.commons.math.util.FastMath.atan((-6.053272382792571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4070751110264779d) + "'", double1 == (-1.4070751110264779d));
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        int int1 = org.apache.commons.math.util.FastMath.round(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        double double2 = org.apache.commons.math.util.FastMath.min(572.9577951308232d, 2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 572.9577951308232d + "'", double2 == 572.9577951308232d);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        float float1 = org.apache.commons.math.util.FastMath.abs((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.9624960684073707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7493933565307835d + "'", double1 == 1.7493933565307835d);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        double double1 = org.apache.commons.math.util.FastMath.rint(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.896296018267967E13d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267936302d + "'", double2 == 1.5707963267936302d);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.4762966926573635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4445057894400712d) + "'", double1 == (-0.4445057894400712d));
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274785475506d + "'", double1 == 1.0232274785475506d);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1494681981443936d) + "'", double1 == (-0.1494681981443936d));
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.027719239916259047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027715691434453935d + "'", double1 == 0.027715691434453935d);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.19240232444172617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19006280234111017d + "'", double1 == 0.19006280234111017d);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7805951733159242d + "'", double1 == 0.7805951733159242d);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.027719239916259047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027712143770207958d + "'", double1 == 0.027712143770207958d);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        double double1 = org.apache.commons.math.util.FastMath.acos(38.45962336030118d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 573L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.816301153436276d + "'", double1 == 1.816301153436276d);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815244d + "'", double1 == 1.543080634815244d);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        double double1 = org.apache.commons.math.util.FastMath.expm1(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 26L, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6823165548747481d + "'", double2 == 0.6823165548747481d);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        double double1 = org.apache.commons.math.util.FastMath.sin((-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9545943990414509d) + "'", double1 == (-0.9545943990414509d));
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4669214877224426d + "'", double1 == 0.4669214877224426d);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.8212977905417654E24d, 0.4669214877224426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.585786437626905d) + "'", double1 == (-0.585786437626905d));
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        double double1 = org.apache.commons.math.util.FastMath.log1p(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9702919135521215d + "'", double1 == 3.9702919135521215d);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.816301153436276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        double double1 = org.apache.commons.math.util.FastMath.log(1.816301153436276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5968020998202848d + "'", double1 == 0.5968020998202848d);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.9702919135521215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5988224392024553d + "'", double1 == 0.5988224392024553d);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267936305d + "'", double1 == 1.5707963267936305d);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982229502979694d + "'", double1 == 2.9982229502979694d);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222845712074d + "'", double1 == 2.993222845712074d);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        double double1 = org.apache.commons.math.util.FastMath.acos(11013.232874703393d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        double double1 = org.apache.commons.math.util.FastMath.log(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0980197632589186d + "'", double1 == 1.0980197632589186d);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.027719239916259047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543073535942135d + "'", double1 == 1.543073535942135d);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6823165548747481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2401310215141802E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.906532428616288d) + "'", double1 == (-15.906532428616288d));
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.993222845712074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        double double2 = org.apache.commons.math.util.FastMath.min(7.896296018267967E13d, 57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308232d + "'", double2 == 57.29577951308232d);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7453292519943295d, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7175057781016483d + "'", double2 == 0.7175057781016483d);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.875409442231813E-18d + "'", double1 == 3.875409442231813E-18d);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4711276743037345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025676021633806945d + "'", double1 == 0.025676021633806945d);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 26);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 26L + "'", long1 == 26L);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.8199681505512405E-18d, 1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5525884268785043E-18d + "'", double2 == 1.5525884268785043E-18d);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 0.0f, 1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.291904389212817d + "'", double1 == 2.291904389212817d);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        double double2 = org.apache.commons.math.util.FastMath.max(7.896296018267966E13d, 6283429.00742421d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896296018267966E13d + "'", double2 == 7.896296018267966E13d);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        double double1 = org.apache.commons.math.util.FastMath.floor(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.0d + "'", double1 == 5729.0d);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9545943990414509d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6150317436149153d) + "'", double1 == (-0.6150317436149153d));
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        double double1 = org.apache.commons.math.util.FastMath.tan(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9262160379374064d + "'", double1 == 0.9262160379374064d);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.19240232444172617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1900795435532183d + "'", double1 == 0.1900795435532183d);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10728189713552241d) + "'", double1 == (-0.10728189713552241d));
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        double double2 = org.apache.commons.math.util.FastMath.max(3.355372716651809E-7d, 2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.993222846126381d + "'", double2 == 2.993222846126381d);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9518224930797358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9756139057433201d + "'", double1 == 0.9756139057433201d);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.267909768656306d) + "'", double1 == (-2.267909768656306d));
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        double double1 = org.apache.commons.math.util.FastMath.atan(8886110.520507816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962142597218d + "'", double1 == 1.5707962142597218d);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9732324798502845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.291904389212817d, (-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2919043892128164d + "'", double2 == 2.2919043892128164d);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.896296018267966E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268E13d + "'", double1 == 7.896296018268E13d);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.027712143770207958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.02809969691994d + "'", double1 == 1.02809969691994d);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707962142597218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8104768396174693d + "'", double1 == 3.8104768396174693d);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        double double2 = org.apache.commons.math.util.FastMath.max(3.2710663101885897d, 3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2710663101885897d + "'", double2 == 3.2710663101885897d);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        double double1 = org.apache.commons.math.util.FastMath.asinh(14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.360842641004344d + "'", double1 == 3.360842641004344d);
    }
}
