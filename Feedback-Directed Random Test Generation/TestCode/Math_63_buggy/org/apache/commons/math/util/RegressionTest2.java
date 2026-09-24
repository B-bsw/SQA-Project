package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        long long2 = org.apache.commons.math.util.MathUtils.pow((-53299563000L), (long) 96);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1072693281L, (long) 132);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 141595513092L + "'", long2 == 141595513092L);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-481203526), 3201);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-481206727) + "'", int2 == (-481206727));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(88.64536084872124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5745667174321486E38d + "'", double1 == 1.5745667174321486E38d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        double double2 = org.apache.commons.math.util.MathUtils.log(1.900763733941378E162d, 78.76851654052734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01168576036445956d + "'", double2 == 0.01168576036445956d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1078034463);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 404, (double) 2159149118L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (short) 0, 1.5430806348152437d, 98);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(76, 1894776833);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-532995727), 1079574559);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(2.18402236762003E13d, (-481203526));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.8720636164257E223d) + "'", double2 == (-2.8720636164257E223d));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 532995729L, 1364195328);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        double double2 = org.apache.commons.math.util.MathUtils.log(0.0d, (double) 1079001088);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 2L, 1894776833);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-55145733986879231L), (double) 100L, 4.775146118562826d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(35625960447L, (long) 3380);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 120415746310860L + "'", long2 == 120415746310860L);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(2159149118L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        int[] intArray29 = new int[] { (-1), 100 };
        int[] intArray32 = new int[] { 'a', '4' };
        int int33 = org.apache.commons.math.util.MathUtils.distanceInf(intArray29, intArray32);
        int[] intArray36 = new int[] { (byte) 10, 35 };
        int[] intArray43 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int44 = org.apache.commons.math.util.MathUtils.distance1(intArray36, intArray43);
        int int45 = org.apache.commons.math.util.MathUtils.distance1(intArray32, intArray36);
        int[] intArray48 = new int[] { (-1), 100 };
        int[] intArray51 = new int[] { 'a', '4' };
        int int52 = org.apache.commons.math.util.MathUtils.distanceInf(intArray48, intArray51);
        int int53 = org.apache.commons.math.util.MathUtils.distanceInf(intArray36, intArray51);
        int[] intArray56 = new int[] { (-1), 100 };
        int[] intArray59 = new int[] { 'a', '4' };
        int int60 = org.apache.commons.math.util.MathUtils.distanceInf(intArray56, intArray59);
        int[] intArray63 = new int[] { (byte) 10, 35 };
        int[] intArray70 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int71 = org.apache.commons.math.util.MathUtils.distance1(intArray63, intArray70);
        int int72 = org.apache.commons.math.util.MathUtils.distance1(intArray59, intArray63);
        int[] intArray75 = new int[] { (-1), 100 };
        int[] intArray78 = new int[] { 'a', '4' };
        int int79 = org.apache.commons.math.util.MathUtils.distanceInf(intArray75, intArray78);
        int int80 = org.apache.commons.math.util.MathUtils.distanceInf(intArray63, intArray78);
        int int81 = org.apache.commons.math.util.MathUtils.distance1(intArray36, intArray78);
        int int82 = org.apache.commons.math.util.MathUtils.distanceInf(intArray24, intArray78);
        java.lang.Class<?> wildcardClass83 = intArray24.getClass();
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
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 76 + "'", int44 == 76);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 104 + "'", int45 == 104);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 98 + "'", int52 == 98);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 87 + "'", int53 == 87);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 98 + "'", int60 == 98);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 76 + "'", int71 == 76);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 104 + "'", int72 == 104);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 98 + "'", int79 == 98);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 87 + "'", int80 == 87);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 104 + "'", int81 == 104);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-1611030093), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1611030092L) + "'", long2 == (-1611030092L));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(35625960447L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 3395.0d);
        double[] doubleArray14 = new double[] { 35 };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        boolean boolean16 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray14);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 3395.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1078034463 + "'", int17 == 1078034463);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-1074790400), 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-87));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        int int2 = org.apache.commons.math.util.MathUtils.pow(440923534, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 65.92419889539804d);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray17);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double double25 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray22);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray5, doubleArray22);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double[] doubleArray35 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray35);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray35, (double) (-532995630));
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray22, doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1078034463 + "'", int3 == 1078034463);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 65.92419889539804d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1079574559 + "'", int24 == 1079574559);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 34.075801104601965d + "'", double26 == 34.075801104601965d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1067909019), 65.92419889539804d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(6.283185307179586d, (double) Float.NaN);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double double2 = org.apache.commons.math.util.MathUtils.log((-152.0d), (double) 33.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 10, (-481203526));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 3395.0d);
        double[] doubleArray14 = new double[] { 35 };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        boolean boolean16 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray14);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double double23 = org.apache.commons.math.util.MathUtils.distance1(doubleArray18, doubleArray21);
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        double double26 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 3395.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 65.0d + "'", double26 == 65.0d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 1413573307, 1079574559);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0356255620317839E18d + "'", double2 == 3.0356255620317839E18d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) (-100L), 0.0d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1413573307), (long) 638583807);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-902685023857639749L) + "'", long2 == (-902685023857639749L));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        double[] doubleArray27 = new double[] { 35 };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        double[] doubleArray30 = new double[] { 100L };
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray30);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection32 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray30, orderDirection32, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray27, orderDirection32, true);
        double[] doubleArray42 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray44 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray42, (double) 1L);
        double double45 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray27, doubleArray42);
        double[] doubleArray47 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray42, (double) (-52L));
        double[] doubleArray48 = null;
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray42, doubleArray48);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray42);
        java.lang.Class<?> wildcardClass51 = doubleArray5.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection32 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection32.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-11.741935483870968d), (-0.0d), (-33.54838709677419d), (-3.3548387096774195d), (-3.3548387096774195d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((-1611030093), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) 2147450880, (long) 5548);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) (-532995630));
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray14);
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
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray35);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 1.894776832824343E9d);
        double[] doubleArray43 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray41, (double) 141595513092L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 1.894776832824343E9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.41595513092E11d }, 1.0E-15);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int int1 = org.apache.commons.math.util.MathUtils.hash(2.1132819926743435E10d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1253484749) + "'", int1 == (-1253484749));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1072693247, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.893729570944416d + "'", double2 == 40.893729570944416d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        double[] doubleArray22 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 22639.925120280288d);
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
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 22639.925120280288d }, 1.0E-15);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1, 200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        long long1 = org.apache.commons.math.util.MathUtils.sign(1076101150L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1072693282, (-1043344512));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        boolean boolean3 = false; // flaky "1) test1047(org.apache.commons.math.util.RegressionTest2)": org.apache.commons.math.util.MathUtils.equals((double) 3395L, (double) 1048576L, 532995630);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        boolean boolean9 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray7);
        double double10 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray12 = new double[] { 35 };
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray12);
        double[] doubleArray15 = new double[] { 100L };
        double double16 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray15);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection17 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray15, orderDirection17, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray12, orderDirection17, true);
        double[] doubleArray27 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray29 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray27, (double) 1L);
        double double30 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray12, doubleArray27);
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray12);
        double double32 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray12);
        int int33 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection17 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection17.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 65.0d + "'", double32 == 65.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1078034463 + "'", int33 == 1078034463);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(Double.NEGATIVE_INFINITY, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(532995630, (-1074790324));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-5L), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1072693248, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693215 + "'", int2 == 1072693215);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 3395.0d);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray14);
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 10);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        int int22 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray20, (double) 10);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray24);
        double[] doubleArray27 = new double[] { 100L };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        int int29 = org.apache.commons.math.util.MathUtils.hash(doubleArray27);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        int int33 = org.apache.commons.math.util.MathUtils.hash(doubleArray31);
        double double34 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray31);
        double[] doubleArray36 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray27, 100.0d);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray24, doubleArray27);
        double[] doubleArray39 = new double[] { 100L };
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray39);
        double[] doubleArray42 = new double[] { 100L };
        double double43 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray42);
        double double44 = org.apache.commons.math.util.MathUtils.distance1(doubleArray39, doubleArray42);
        double[] doubleArray46 = new double[] { 100L };
        double double47 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray46);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        double double51 = org.apache.commons.math.util.MathUtils.distance1(doubleArray46, doubleArray49);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray39, doubleArray49);
        double double53 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray39);
        double[] doubleArray55 = new double[] { 100L };
        double double56 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray55);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection57 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray55, orderDirection57, true);
        double[] doubleArray61 = new double[] { 100L };
        double double62 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray61);
        double[] doubleArray64 = new double[] { 100L };
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray64);
        double double66 = org.apache.commons.math.util.MathUtils.distance1(doubleArray61, doubleArray64);
        double[] doubleArray68 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray61, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray68);
        double[] doubleArray71 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray68, (double) (-532995630));
        double double72 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray55, doubleArray68);
        double[] doubleArray74 = new double[] { 35 };
        double double75 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray74);
        double[] doubleArray77 = new double[] { 100L };
        double double78 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray77);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection79 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray77, orderDirection79, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray74, orderDirection79, true);
        double[] doubleArray89 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray91 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray89, (double) 1L);
        double double92 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray74, doubleArray89);
        boolean boolean93 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray55, doubleArray89);
        boolean boolean94 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray89);
        double double95 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray89);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 3395.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1079574559 + "'", int16 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1079574559 + "'", int22 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1079574559 + "'", int29 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1079574559 + "'", int33 == 1079574559);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection57 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection57.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 35.0d + "'", double75 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 100.0d + "'", double78 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection79 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection79.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) (-532995630));
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray14);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray20, doubleArray23);
        double[] doubleArray27 = new double[] { 100L };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        double[] doubleArray30 = new double[] { 100L };
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray30);
        double double32 = org.apache.commons.math.util.MathUtils.distance1(doubleArray27, doubleArray30);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray20, doubleArray30);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        int int37 = org.apache.commons.math.util.MathUtils.hash(doubleArray35);
        double double38 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray35);
        double double39 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray35);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1079574559 + "'", int37 == 1079574559);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(96);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.91677934871016E149d + "'", double1 == 9.91677934871016E149d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(35.0d, (double) (-1067909019));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 404, 80.67924332618713d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(268435456, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435421 + "'", int2 == 268435421);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        double[] doubleArray10 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 100.0d);
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
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
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double[] doubleArray35 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) (short) 100);
        double double36 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray23, doubleArray28);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray23);
        double[] doubleArray39 = new double[] { 100L };
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray39);
        int int41 = org.apache.commons.math.util.MathUtils.hash(doubleArray39);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        int int45 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double double46 = org.apache.commons.math.util.MathUtils.distance(doubleArray39, doubleArray43);
        double[] doubleArray48 = new double[] { 100L };
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        int int50 = org.apache.commons.math.util.MathUtils.hash(doubleArray48);
        double[] doubleArray52 = new double[] { 100L };
        double double53 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray52);
        int int54 = org.apache.commons.math.util.MathUtils.hash(doubleArray52);
        double double55 = org.apache.commons.math.util.MathUtils.distance(doubleArray48, doubleArray52);
        double[] doubleArray57 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray48, 100.0d);
        double double58 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray43, doubleArray57);
        double double59 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray23, doubleArray43);
        double[] doubleArray62 = new double[] { 35 };
        double double63 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray62);
        double[] doubleArray65 = new double[] { 100L };
        double double66 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray65);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection67 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray65, orderDirection67, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray62, orderDirection67, true);
        double[] doubleArray77 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray79 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray77, (double) 1L);
        double double80 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray62, doubleArray77);
        double double81 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray62);
        boolean boolean82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray23, doubleArray62);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1079574559 + "'", int41 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1079574559 + "'", int45 == 1079574559);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1079574559 + "'", int50 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1079574559 + "'", int54 == 1079574559);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 35.0d + "'", double63 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection67 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection67.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 35.0d + "'", double81 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1072693281, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1072693381L + "'", long2 == 1072693381L);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) 87, (long) 532995630);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (short) 10, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1, 256.22113555000954d, 3395.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 8031512433696974145L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1611030093));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(3201, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3201 + "'", int2 == 3201);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1364195328, (long) 5548);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7568555679744L + "'", long2 == 7568555679744L);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1067909120, 132, (int) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double[] doubleArray24 = new double[] { 100L };
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray21, doubleArray24);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray21, doubleArray31);
        double[] doubleArray36 = new double[] { 100L };
        double double37 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray36);
        double[] doubleArray39 = new double[] { 100L };
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray39);
        double double41 = org.apache.commons.math.util.MathUtils.distance1(doubleArray36, doubleArray39);
        double[] doubleArray43 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray36, (double) (short) 100);
        double double44 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray31, doubleArray36);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray16, doubleArray36);
        double[] doubleArray47 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray36, (double) (-2508L));
        int int48 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-2508.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1063020513) + "'", int48 == (-1063020513));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1067909120);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        boolean boolean3 = false; // flaky "2) test1071(org.apache.commons.math.util.RegressionTest2)": org.apache.commons.math.util.MathUtils.equals(1.0732178989295803E14d, 4.6218191175889715E18d, 1079525376);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        java.lang.Class<?> wildcardClass26 = doubleArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(1.0732178989295803E14d, (double) 104);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) (-1043344512), 1072693215);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        long long1 = org.apache.commons.math.util.MathUtils.sign(1076101217L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 96, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1072693282, 1104139136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray11, (-1.0d));
        double double27 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
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
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        boolean boolean3 = false; // flaky "3) test1079(org.apache.commons.math.util.RegressionTest2)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (short) -1, 0.0d, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 803937754, (double) (-1100758017L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-35), 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1079574559, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger7 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, 97);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, (long) 1072693281);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) 100, (-1413573307));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 10, (-532995630));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 532995630 + "'", int2 == 532995630);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger7 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, 97);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, 35625960447L);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-3319L), 532995727L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-532999046L) + "'", long2 == (-532999046L));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 2, 98);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(532995729L, 1894776823L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1009907954067188967L + "'", long2 == 1009907954067188967L);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 65.92419889539804d);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray17);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray22, (double) 10);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection30, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray26, orderDirection30, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection30, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection30, true);
        java.lang.Class<?> wildcardClass39 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1078034463 + "'", int3 == 1078034463);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 65.92419889539804d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 638583807, (double) 98, (double) 5548);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1078034432L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-1074790303), 0.0d, (double) 1072693248);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 532995726L, (double) 1078034564, 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        boolean boolean3 = false; // flaky "4) test1096(org.apache.commons.math.util.RegressionTest2)": org.apache.commons.math.util.MathUtils.equals(1.0613084341780446E57d, (double) 9123042065252004905L, (-532995630));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-532995727), (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-481203526), (-1187053567));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 0L, (-152.0d), (double) 532995729L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(6.283185307179586d, (double) 9036866128227814273L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(11013.232874703393d, (double) 2L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-34), (double) 99L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 35.0f, (double) (-532999046L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-34));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 404, (-87), 1104139136);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray13);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray13, (double) 10);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray5, doubleArray17);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        double[] doubleArray25 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray21, (double) 10);
        double[] doubleArray27 = new double[] { 100L };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray27);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        double double36 = org.apache.commons.math.util.MathUtils.distance1(doubleArray31, doubleArray34);
        double[] doubleArray38 = new double[] { 100L };
        double double39 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray38);
        double[] doubleArray41 = new double[] { 100L };
        double double42 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray41);
        double double43 = org.apache.commons.math.util.MathUtils.distance1(doubleArray38, doubleArray41);
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray31, doubleArray41);
        double[] doubleArray46 = new double[] { 100L };
        double double47 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray46);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        double double51 = org.apache.commons.math.util.MathUtils.distance1(doubleArray46, doubleArray49);
        double[] doubleArray53 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray46, (double) (short) 100);
        double double54 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray41, doubleArray46);
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray41);
        double[] doubleArray57 = new double[] { 100L };
        double double58 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray57);
        int int59 = org.apache.commons.math.util.MathUtils.hash(doubleArray57);
        double[] doubleArray61 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray57, (double) 10);
        double[] doubleArray63 = new double[] { 100L };
        double double64 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray63);
        boolean boolean65 = org.apache.commons.math.util.MathUtils.equals(doubleArray57, doubleArray63);
        double double66 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray57);
        double[] doubleArray68 = new double[] { 35 };
        double double69 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray68);
        double[] doubleArray71 = new double[] { 100L };
        double double72 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray71);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection73 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray71, orderDirection73, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray68, orderDirection73, true);
        double[] doubleArray83 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray85 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray83, (double) 1L);
        double double86 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray68, doubleArray83);
        double double87 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray68);
        double double88 = org.apache.commons.math.util.MathUtils.distance(doubleArray57, doubleArray68);
        boolean boolean89 = org.apache.commons.math.util.MathUtils.equals(doubleArray41, doubleArray68);
        boolean boolean90 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray41);
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
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1079574559 + "'", int15 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1079574559 + "'", int59 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 100.0d + "'", double64 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 35.0d + "'", double69 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection73 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection73.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 35.0d + "'", double87 == 35.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 65.0d + "'", double88 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-481206727), (-1072693116), 146);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 35625960447L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(132, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(803937754, 3211);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 100L };
        double double3 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray2);
        int int4 = org.apache.commons.math.util.MathUtils.hash(doubleArray2);
        double[] doubleArray6 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray2, (double) 10);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection10 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection10, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray6, orderDirection10, false);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 10);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection24 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection24, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection24, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray6, orderDirection24, false);
        boolean boolean31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1079574559 + "'", int4 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection10 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection10.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1079574559 + "'", int7 == 1079574559);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 97);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 1072693247);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger6, (long) 0);
        java.math.BigInteger bigInteger9 = null;
        java.math.BigInteger bigInteger11 = org.apache.commons.math.util.MathUtils.pow(bigInteger9, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, 97);
        java.math.BigInteger bigInteger15 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) 1072693247);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger15, (long) 0);
        java.math.BigInteger bigInteger18 = org.apache.commons.math.util.MathUtils.pow(bigInteger8, bigInteger15);
        java.math.BigInteger bigInteger19 = null;
        java.math.BigInteger bigInteger21 = org.apache.commons.math.util.MathUtils.pow(bigInteger19, (long) 0);
        java.math.BigInteger bigInteger23 = org.apache.commons.math.util.MathUtils.pow(bigInteger21, 97);
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger18, bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 268435456, (long) (-532995630));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 801431086L + "'", long2 == 801431086L);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray14);
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 10);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        int int22 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray20, (double) 10);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray24);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double double34 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray28);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray11, (double) 3201);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray11);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1079574559 + "'", int16 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1079574559 + "'", int22 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 3201.0d }, 1.0E-15);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(0, (-481203526));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-97));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 1079001089L, 2.6313083693369503E35d, 88.64536084872124d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 2, (-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(99L, (long) (-87));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow(0L, (long) (-2070612641));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(1894776823L, (long) 1067909120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2962685943L + "'", long2 == 2962685943L);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1079574528, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1079574528 + "'", int2 == 1079574528);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 195);
        java.math.BigInteger bigInteger5 = null;
        java.math.BigInteger bigInteger7 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, (long) 0);
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, 97);
        java.math.BigInteger bigInteger11 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, (long) 1072693247);
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) 0);
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, (long) 0);
        java.math.BigInteger bigInteger18 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, 97);
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, (long) 1072693247);
        java.math.BigInteger bigInteger22 = org.apache.commons.math.util.MathUtils.pow(bigInteger20, (long) 0);
        java.math.BigInteger bigInteger23 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, bigInteger20);
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1074790407);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        float float2 = org.apache.commons.math.util.MathUtils.round(35.0f, 1076101120);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger7 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, 97);
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, (long) 1072693247);
        java.math.BigInteger bigInteger11 = org.apache.commons.math.util.MathUtils.pow(bigInteger9, (long) 0);
        java.math.BigInteger bigInteger12 = null;
        java.math.BigInteger bigInteger14 = org.apache.commons.math.util.MathUtils.pow(bigInteger12, (long) 0);
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, 97);
        java.math.BigInteger bigInteger18 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, (long) 1072693247);
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger18, (long) 0);
        java.math.BigInteger bigInteger21 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, bigInteger18);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger22 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, bigInteger21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-803937719), (double) (-532995630), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(226173491);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) 35625960447L, 1078034432);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        long long2 = org.apache.commons.math.util.MathUtils.pow(0L, 7804846298364903425L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1079574528, (double) 1104139136);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0010816895071943d + "'", double2 == 1.0010816895071943d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1079574528, (double) (-2508L), (double) (-52L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) (short) 100);
        double[] doubleArray10 = new double[] { 35 };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray13, orderDirection15, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray10, orderDirection15, true);
        double[] doubleArray21 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray10, 3395.0d);
        double[] doubleArray23 = new double[] { 35 };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray10, doubleArray23);
        double double26 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray10);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection15 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection15.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 3395.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 65.0d + "'", double26 == 65.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1078034463 + "'", int27 == 1078034463);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 0.0f, 268435456);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round(1.6084585122371209d, 1104139136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        double[] doubleArray10 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 100.0d);
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
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
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double[] doubleArray35 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) (short) 100);
        double double36 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray23, doubleArray28);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray23);
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
    }
}
