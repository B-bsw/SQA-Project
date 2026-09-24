package org.apache.commons.lang.math;

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
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        short[] shortArray19 = new short[] { (short) 100 };
        short[] shortArray20 = new short[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray20);
        short[] shortArray23 = new short[] { (short) 100 };
        short[] shortArray24 = new short[] {};
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray23);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray23);
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray23);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray23);
        // The following exception was thrown during execution in test generation
        try {
            short short30 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 100 + "'", short28 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray14);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short[] shortArray26 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray26);
        short short29 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 100 + "'", short29 == (short) 100);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', (long) ' ', (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double[] doubleArray16 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray20 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray20);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray16);
        java.lang.Class<?> wildcardClass24 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray17);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray17);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray29);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray35, byteArray42);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray42);
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(byteArray47, byteArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(byteArray42, byteArray54);
        byte byte57 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        byte[] byteArray59 = new byte[] { (byte) 100 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray59);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray59);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray59);
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray80 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray73, byteArray80);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray73);
        byte byte83 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray29);
        java.lang.Class<?> wildcardClass86 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -1 + "'", byte32 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 100 + "'", byte57 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + byte83 + "' != '" + (byte) 100 + "'", byte83 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) -1 + "'", byte84 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) ' ', (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, (long) (-1), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '4', (float) (byte) -1, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int[] intArray30 = new int[] { (short) -1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray30);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray38);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        int[] intArray46 = new int[] { (short) -1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray46);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray53);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray50);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray50);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int[] intArray62 = new int[] { (short) -1 };
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray62);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray59);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray35);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray27);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int[] intArray76 = new int[] { (short) -1 };
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray76);
        int[] intArray80 = new int[] { (short) -1 };
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        int[] intArray83 = new int[] { (short) -1 };
        int int84 = org.apache.commons.lang.math.NumberUtils.min(intArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray83);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(intArray76, intArray80);
        int[] intArray88 = new int[] { (short) -1 };
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int[] intArray91 = new int[] { (short) -1 };
        int int92 = org.apache.commons.lang.math.NumberUtils.min(intArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray88, intArray91);
        int int94 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int int95 = org.apache.commons.lang.math.NumberUtils.max(intArray88);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray88);
        int int97 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray80);
        int int99 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, (long) (byte) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 0L, (float) 35L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(35.0f, (float) ' ', (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 1, (int) '4', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97, 0.0d, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 10, (long) (short) 10, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0d), (double) 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long[] longArray9 = new long[] { 0L };
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        long[] longArray12 = new long[] { (byte) 1 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long[] longArray16 = new long[] { 0L };
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long[] longArray19 = new long[] { (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray12);
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long[] longArray31 = new long[] { 0L };
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray31);
        long[] longArray34 = new long[] { (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray34);
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        long long39 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        java.lang.Class<?> wildcardClass40 = longArray34.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, 1L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0d), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        byte byte10 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray20);
        byte byte22 = org.apache.commons.lang.math.NumberUtils.min(byteArray20);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray20, byteArray32);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.max(byteArray32);
        byte[] byteArray37 = new byte[] { (byte) 100 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray32, byteArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray37);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray42, byteArray49);
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray49);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray61 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray49, byteArray61);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray37, byteArray61);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray37);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.max(byteArray37);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 100 + "'", byte35 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 100 + "'", byte65 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 100 + "'", byte67 == (byte) 100);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang.math.NumberUtils.max(shortArray1);
        java.lang.Class<?> wildcardClass3 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) -1 });
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((-1.0d), (double) 100L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 52L, 10.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 100, 100L, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) 0, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(32.0f, 0.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) 35, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35, (-1.0f), (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 0, (float) (byte) 1, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0L, (double) (short) 10, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100, (float) 100L, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, (float) ' ', (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, 100, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int[] intArray8 = new int[] { (short) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray11 = new int[] { (short) -1 };
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray8);
        int int15 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) 35L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((-1.0d), 35.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) ' ', 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray10);
        byte byte12 = org.apache.commons.lang.math.NumberUtils.max(byteArray10);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray22);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray22);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray42);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray42);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            byte byte47 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) -1, (float) 52L, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) '#', (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, 0.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 0, 32, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52, (double) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '#', (-1.0f), (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) (byte) 10, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(1.0f, 32.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) -1, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32, (double) 0.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) -1, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, (float) (byte) 10, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1), (double) 32L, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int[] intArray8 = new int[] { (short) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray11 = new int[] { (short) -1 };
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray8);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray16);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35, (float) 1, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray9 = new long[] { 0L };
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        long[] longArray12 = new long[] { (byte) 1 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray12);
        java.lang.Class<?> wildcardClass17 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(32.0d, (double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1, (double) (short) 100, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double[] doubleArray16 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray20 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray20);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray16);
        double double24 = org.apache.commons.lang.math.NumberUtils.max(doubleArray16);
        double[] doubleArray25 = null;
        double[] doubleArray30 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray34 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray30);
        double[] doubleArray37 = null;
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray46 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray42);
        double[] doubleArray53 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray57 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray53, doubleArray57);
        double double59 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray53);
        double double61 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray42);
        double double63 = org.apache.commons.lang.math.NumberUtils.min(doubleArray42);
        double double64 = org.apache.commons.lang.math.NumberUtils.min(doubleArray42);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray42);
        double[] doubleArray70 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray74 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray70, doubleArray74);
        double[] doubleArray80 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray84 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray80, doubleArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray70, doubleArray80);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray70);
        double double88 = org.apache.commons.lang.math.NumberUtils.max(doubleArray70);
        double double89 = org.apache.commons.lang.math.NumberUtils.min(doubleArray70);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 52.0d + "'", double88 == 52.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97L, 0.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, (float) 10L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int[] intArray30 = new int[] { (short) -1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray30);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray38);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        int[] intArray46 = new int[] { (short) -1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray46);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray53);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray50);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray50);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int[] intArray62 = new int[] { (short) -1 };
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray62);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray59);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray35);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray27);
        java.lang.Class<?> wildcardClass72 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray10 = new int[] { (short) -1 };
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray10);
        int[] intArray13 = new int[] { (short) -1 };
        int int14 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray10, intArray13);
        int[] intArray17 = new int[] { (short) -1 };
        int int18 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int[] intArray20 = new int[] { (short) -1 };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray13);
        int[] intArray26 = new int[] { (short) -1 };
        int int27 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        int[] intArray29 = new int[] { (short) -1 };
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray29);
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        int[] intArray34 = new int[] { (short) -1 };
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        int[] intArray37 = new int[] { (short) -1 };
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray34, intArray37);
        int[] intArray41 = new int[] { (short) -1 };
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
        int[] intArray44 = new int[] { (short) -1 };
        int int45 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray37, intArray41);
        int int48 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
        int int49 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray41);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray41);
        int int52 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 10, (float) 97L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35, 52.0d, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(35L, (long) ' ', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 0, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        boolean boolean4 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float[] floatArray18 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float float20 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
        float[] floatArray25 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray25);
        float float29 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        float float30 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray25);
        float[] floatArray36 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray39 = new float[] { (byte) 10 };
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        float float41 = org.apache.commons.lang.math.NumberUtils.max(floatArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray39);
        float float43 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray48 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float49 = org.apache.commons.lang.math.NumberUtils.min(floatArray48);
        float float50 = org.apache.commons.lang.math.NumberUtils.max(floatArray48);
        float[] floatArray55 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        float float57 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray48, floatArray55);
        float float59 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        float float60 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray55);
        float float62 = org.apache.commons.lang.math.NumberUtils.max(floatArray36);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray36);
        float float64 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray69 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float70 = org.apache.commons.lang.math.NumberUtils.min(floatArray69);
        float[] floatArray75 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float76 = org.apache.commons.lang.math.NumberUtils.min(floatArray75);
        float float77 = org.apache.commons.lang.math.NumberUtils.max(floatArray75);
        float float78 = org.apache.commons.lang.math.NumberUtils.min(floatArray75);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray69, floatArray75);
        float[] floatArray84 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float85 = org.apache.commons.lang.math.NumberUtils.min(floatArray84);
        float[] floatArray90 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float91 = org.apache.commons.lang.math.NumberUtils.min(floatArray90);
        float float92 = org.apache.commons.lang.math.NumberUtils.max(floatArray90);
        float float93 = org.apache.commons.lang.math.NumberUtils.min(floatArray90);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray84, floatArray90);
        float float95 = org.apache.commons.lang.math.NumberUtils.min(floatArray90);
        float float96 = org.apache.commons.lang.math.NumberUtils.min(floatArray90);
        float float97 = org.apache.commons.lang.math.NumberUtils.min(floatArray90);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(floatArray75, floatArray90);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray75);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 10.0f + "'", float40 == 10.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-1.0f) + "'", float43 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertArrayEquals(floatArray48, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-1.0f) + "'", float49 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 100.0f + "'", float50 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-1.0f) + "'", float56 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 100.0f + "'", float57 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 100.0f + "'", float59 == 100.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + (-1.0f) + "'", float60 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 100.0f + "'", float62 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-1.0f) + "'", float64 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertArrayEquals(floatArray69, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + (-1.0f) + "'", float70 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertArrayEquals(floatArray75, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + (-1.0f) + "'", float76 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 100.0f + "'", float77 == 100.0f);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + (-1.0f) + "'", float78 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertArrayEquals(floatArray84, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + (-1.0f) + "'", float85 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray90);
        org.junit.Assert.assertArrayEquals(floatArray90, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + (-1.0f) + "'", float91 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + 100.0f + "'", float92 == 100.0f);
        org.junit.Assert.assertTrue("'" + float93 + "' != '" + (-1.0f) + "'", float93 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + float95 + "' != '" + (-1.0f) + "'", float95 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + (-1.0f) + "'", float96 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float97 + "' != '" + (-1.0f) + "'", float97 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray16 = new long[] { 0L };
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long[] longArray19 = new long[] { (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray19);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long[] longArray23 = new long[] { 0L };
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long[] longArray26 = new long[] { (byte) 1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray26);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long31 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long32 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long33 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) ' ', (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1, (double) 52, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', (long) '4', (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) (short) -1, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double[] doubleArray16 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray20 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray20);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray16);
        double double24 = org.apache.commons.lang.math.NumberUtils.max(doubleArray16);
        double[] doubleArray25 = null;
        double[] doubleArray30 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray34 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray30);
        double[] doubleArray37 = null;
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray46 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray42);
        double[] doubleArray53 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray57 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray53, doubleArray57);
        double double59 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray53);
        double double61 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray42);
        double double63 = org.apache.commons.lang.math.NumberUtils.min(doubleArray42);
        double double64 = org.apache.commons.lang.math.NumberUtils.min(doubleArray42);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray42);
        double double66 = org.apache.commons.lang.math.NumberUtils.min(doubleArray42);
        double double67 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 52.0d + "'", double67 == 52.0d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray10 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray10);
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray7 = new float[] { (byte) 10 };
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray7);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray7);
        float[] floatArray15 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        float[] floatArray23 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray23);
        float[] floatArray30 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        float[] floatArray36 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float float38 = org.apache.commons.lang.math.NumberUtils.max(floatArray36);
        float float39 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray36);
        float[] floatArray47 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float48 = org.apache.commons.lang.math.NumberUtils.min(floatArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray47);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray47);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray7, floatArray23);
        java.lang.Class<?> wildcardClass52 = floatArray23.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertArrayEquals(floatArray47, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + (-1.0f) + "'", float48 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 100, (double) 32L, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray7 = new long[] { 52, (-1), '4', 100L };
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray7);
        long[] longArray11 = new long[] { 0L };
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        long[] longArray14 = new long[] { (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray14);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray21 = new long[] { (byte) 1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray21);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray25);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray21);
        java.lang.Class<?> wildcardClass29 = longArray7.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(52L, (long) (byte) 1, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, 52L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, (long) (byte) 1, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 'a', (long) (byte) 10, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, (float) (short) 10, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray11);
        long[] longArray15 = new long[] { 0L };
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray15);
        long[] longArray20 = new long[] { (short) -1, (short) 1 };
        long[] longArray22 = new long[] { 0L };
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long[] longArray25 = new long[] { (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray25);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray25);
        long long29 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray20);
        long[] longArray33 = new long[] { 0L };
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray36 = new long[] { (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray36);
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long[] longArray40 = new long[] { 0L };
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        long[] longArray43 = new long[] { (byte) 1 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray43);
        long long46 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long[] longArray48 = new long[] { 0L };
        long long49 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long[] longArray51 = new long[] { (byte) 1 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray51);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray51);
        long[] longArray55 = new long[] { 0L };
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long[] longArray58 = new long[] { (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray58);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray58);
        long long62 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long[] longArray64 = new long[] { 0L };
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray64);
        long[] longArray67 = new long[] { (byte) 1 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray64, longArray67);
        long long69 = org.apache.commons.lang.math.NumberUtils.min(longArray67);
        long long70 = org.apache.commons.lang.math.NumberUtils.min(longArray67);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray67);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray36);
        long long73 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertArrayEquals(longArray48, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertArrayEquals(longArray55, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertArrayEquals(longArray58, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertArrayEquals(longArray64, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertArrayEquals(longArray67, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', 52L, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(97.0d, (double) (-1.0f), (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray10);
        byte byte12 = org.apache.commons.lang.math.NumberUtils.min(byteArray10);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray22);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray34);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray34);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray42);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray42);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray42);
        java.lang.Class<?> wildcardClass47 = byteArray42.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, (float) 100L, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 100, (double) 0.0f, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int[] intArray30 = new int[] { (short) -1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray30);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray38);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        int[] intArray46 = new int[] { (short) -1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray46);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray53);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray50);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray50);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int[] intArray62 = new int[] { (short) -1 };
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray62);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray59);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray35);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray27);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int[] intArray76 = new int[] { (short) -1 };
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray76);
        int[] intArray80 = new int[] { (short) -1 };
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        int[] intArray83 = new int[] { (short) -1 };
        int int84 = org.apache.commons.lang.math.NumberUtils.min(intArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray83);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(intArray76, intArray80);
        int[] intArray88 = new int[] { (short) -1 };
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int[] intArray91 = new int[] { (short) -1 };
        int int92 = org.apache.commons.lang.math.NumberUtils.min(intArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray88, intArray91);
        int int94 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int int95 = org.apache.commons.lang.math.NumberUtils.max(intArray88);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray88);
        int int97 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray80);
        int int99 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52, (float) (byte) 1, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 1, 10.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35, 35.0d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 0, (long) ' ', (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 'a', (long) (byte) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) 10, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 10, (float) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, 97L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, (long) (byte) -1, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray16 = new long[] { 0L };
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long[] longArray21 = new long[] { (short) -1, (short) 1 };
        long[] longArray23 = new long[] { 0L };
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long[] longArray26 = new long[] { (byte) 1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray26);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray21);
        long[] longArray33 = new long[] { 0L };
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray36 = new long[] { (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray36);
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long[] longArray40 = new long[] { 0L };
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        long[] longArray43 = new long[] { (byte) 1 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray43);
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray36);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray36);
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 10, (float) (byte) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray21 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray17);
        double[] doubleArray28 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray32 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double double34 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray28);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray28);
        double[] doubleArray41 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray45 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        double double47 = org.apache.commons.lang.math.NumberUtils.max(doubleArray45);
        double double48 = org.apache.commons.lang.math.NumberUtils.max(doubleArray45);
        double double49 = org.apache.commons.lang.math.NumberUtils.min(doubleArray45);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray45);
        double[] doubleArray55 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray59 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray59);
        double double61 = org.apache.commons.lang.math.NumberUtils.max(doubleArray55);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray55);
        double[] doubleArray67 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray71 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray67, doubleArray71);
        double double73 = org.apache.commons.lang.math.NumberUtils.max(doubleArray71);
        double double74 = org.apache.commons.lang.math.NumberUtils.min(doubleArray71);
        double[] doubleArray79 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray83 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray79, doubleArray83);
        double[] doubleArray89 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray93 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray89, doubleArray93);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray79, doubleArray89);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray71, doubleArray79);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray79);
        double double98 = org.apache.commons.lang.math.NumberUtils.max(doubleArray55);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 100.0d + "'", double73 == 100.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 52.0d + "'", double98 == 52.0d);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, 0.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) ' ', (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '#', 0.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int[] intArray8 = new int[] { (short) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray11 = new int[] { (short) -1 };
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray8);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray16);
        int[] intArray24 = new int[] { (short) -1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray24);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray27);
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray24);
        int[] intArray32 = new int[] { (short) -1 };
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray35);
        int[] intArray39 = new int[] { (short) -1 };
        int int40 = org.apache.commons.lang.math.NumberUtils.min(intArray39);
        int[] intArray42 = new int[] { (short) -1 };
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray39, intArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray39);
        int int46 = org.apache.commons.lang.math.NumberUtils.max(intArray39);
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray39);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray39);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray53);
        int int56 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        int[] intArray58 = new int[] { (short) -1 };
        int int59 = org.apache.commons.lang.math.NumberUtils.min(intArray58);
        int[] intArray61 = new int[] { (short) -1 };
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray58, intArray61);
        int int64 = org.apache.commons.lang.math.NumberUtils.min(intArray58);
        int[] intArray66 = new int[] { (short) -1 };
        int int67 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        int[] intArray69 = new int[] { (short) -1 };
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray66, intArray69);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int[] intArray76 = new int[] { (short) -1 };
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray76);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(intArray69, intArray73);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray58, intArray73);
        int[] intArray82 = new int[] { (short) -1 };
        int int83 = org.apache.commons.lang.math.NumberUtils.min(intArray82);
        int[] intArray85 = new int[] { (short) -1 };
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(intArray82, intArray85);
        int int88 = org.apache.commons.lang.math.NumberUtils.min(intArray82);
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray82);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray58, intArray82);
        int int91 = org.apache.commons.lang.math.NumberUtils.min(intArray58);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray58);
        int int93 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray39, intArray50);
        int int95 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray50);
        int[] intArray97 = null;
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray97);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 100, (long) (short) 1, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 100, 32.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) '4', 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int[] intArray30 = new int[] { (short) -1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray30);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray38);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        int[] intArray46 = new int[] { (short) -1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray46);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray53);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray50);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray50);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int[] intArray62 = new int[] { (short) -1 };
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray62);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray59);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray35);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray27);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int[] intArray76 = new int[] { (short) -1 };
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray76);
        int[] intArray80 = new int[] { (short) -1 };
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        int[] intArray83 = new int[] { (short) -1 };
        int int84 = org.apache.commons.lang.math.NumberUtils.min(intArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray83);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(intArray76, intArray80);
        int[] intArray88 = new int[] { (short) -1 };
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int[] intArray91 = new int[] { (short) -1 };
        int int92 = org.apache.commons.lang.math.NumberUtils.min(intArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray88, intArray91);
        int int94 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int int95 = org.apache.commons.lang.math.NumberUtils.max(intArray88);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray88);
        int int97 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray80);
        int int99 = org.apache.commons.lang.math.NumberUtils.max(intArray80);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 0.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', 32L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 0, (double) (-1.0f), (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 10, 35L, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) (-1), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, 1.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 1, 10L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int[] intArray8 = new int[] { (short) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray11 = new int[] { (short) -1 };
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray8);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray24 = null;
        int[] intArray26 = new int[] { (short) -1 };
        int int27 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        int[] intArray29 = new int[] { (short) -1 };
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray29);
        int[] intArray33 = new int[] { (short) -1 };
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int[] intArray36 = new int[] { (short) -1 };
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray33);
        int int40 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray33);
        int int43 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray33);
        int int45 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, (long) 'a', 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double12 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double13 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double14 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double[] doubleArray19 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray23 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray29 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray33 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray19, doubleArray29);
        double[] doubleArray36 = null;
        double[] doubleArray41 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray45 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray36, doubleArray41);
        double[] doubleArray52 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray56 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray56);
        double double58 = org.apache.commons.lang.math.NumberUtils.min(doubleArray52);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray52);
        double double60 = org.apache.commons.lang.math.NumberUtils.max(doubleArray41);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray41);
        double double62 = org.apache.commons.lang.math.NumberUtils.min(doubleArray29);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray29);
        java.lang.Class<?> wildcardClass64 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97, (float) (short) 1, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(1.0f, 100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35.0f, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0L, (double) (short) 0, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double[] doubleArray16 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray20 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray20);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray16);
        double double24 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double double25 = org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
        double double26 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), 10.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((-1L), (long) (short) 0, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) 32, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100, (float) (short) 10, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(10.0d, (double) 100, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, (-1.0f), 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double[] doubleArray16 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray20 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray20);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray16);
        double[] doubleArray24 = null;
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray24);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = org.apache.commons.lang.math.NumberUtils.min(doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) ' ', 97.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 52L, 0.0d, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 52L, 0.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) '#', (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (-1), (long) (short) -1, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 32, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, (long) 'a', 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, (float) 1L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray5 = new long[] { (byte) 1 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        long[] longArray10 = new long[] { 0L };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long[] longArray13 = new long[] { (byte) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray13);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray28 = new long[] { (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray28);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        long[] longArray32 = new long[] { 0L };
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray35 = new long[] { (byte) 1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray35);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray35);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, 52L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray5 = new long[] { 0L };
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
        long[] longArray8 = new long[] { (byte) 1 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray12 = new long[] { 0L };
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long[] longArray15 = new long[] { (byte) 1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray15);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray20 = new long[] { 0L };
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray23 = new long[] { (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray23);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long[] longArray27 = new long[] { 0L };
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long[] longArray30 = new long[] { (byte) 1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray30);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray30);
        long[] longArray35 = new long[] { 0L };
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        long[] longArray38 = new long[] { (byte) 1 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray38);
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long[] longArray42 = new long[] { 0L };
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long[] longArray45 = new long[] { (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray45);
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long[] longArray50 = new long[] { 0L };
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long[] longArray53 = new long[] { (byte) 1 };
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray53);
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray53);
        long[] longArray57 = new long[] { 0L };
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray57);
        long[] longArray60 = new long[] { (byte) 1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray53, longArray60);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray60);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray38);
        long[] longArray66 = new long[] { 0L };
        long long67 = org.apache.commons.lang.math.NumberUtils.max(longArray66);
        long[] longArray69 = new long[] { (byte) 1 };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray66, longArray69);
        long long71 = org.apache.commons.lang.math.NumberUtils.min(longArray69);
        long long72 = org.apache.commons.lang.math.NumberUtils.min(longArray69);
        long long73 = org.apache.commons.lang.math.NumberUtils.min(longArray69);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray69);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray30);
        long[] longArray77 = new long[] { 0L };
        long long78 = org.apache.commons.lang.math.NumberUtils.max(longArray77);
        long[] longArray80 = new long[] { (byte) 1 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(longArray77, longArray80);
        long long82 = org.apache.commons.lang.math.NumberUtils.max(longArray80);
        long[] longArray84 = new long[] { 0L };
        long long85 = org.apache.commons.lang.math.NumberUtils.max(longArray84);
        long[] longArray87 = new long[] { (byte) 1 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray84, longArray87);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(longArray80, longArray87);
        long long90 = org.apache.commons.lang.math.NumberUtils.min(longArray80);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray80);
        long long92 = org.apache.commons.lang.math.NumberUtils.min(longArray80);
        long long93 = org.apache.commons.lang.math.NumberUtils.max(longArray80);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertArrayEquals(longArray45, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertArrayEquals(longArray50, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertArrayEquals(longArray53, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertArrayEquals(longArray57, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertArrayEquals(longArray60, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertArrayEquals(longArray66, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertArrayEquals(longArray69, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertArrayEquals(longArray77, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertArrayEquals(longArray80, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertArrayEquals(longArray84, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertArrayEquals(longArray87, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) ' ', 0.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1.0f, (double) 1.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, (long) (byte) -1, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        java.lang.Class<?> wildcardClass39 = byteArray33.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 100 + "'", byte38 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) '4', (float) 52L, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(1.0d, (double) '4', (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 1, 97.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(35.0f, (float) 1L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100.0f, 52.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray21 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray17);
        double[] doubleArray28 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray32 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double double34 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray28);
        double double36 = org.apache.commons.lang.math.NumberUtils.max(doubleArray17);
        double double37 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray46 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        double[] doubleArray52 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray56 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray52);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray42);
        double[] doubleArray64 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray68 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray68);
        double double71 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        double[] doubleArray76 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray80 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray76, doubleArray80);
        double double82 = org.apache.commons.lang.math.NumberUtils.max(doubleArray80);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray80);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray42);
        double double85 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double86 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double[] doubleArray91 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray95 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray91, doubleArray95);
        double double97 = org.apache.commons.lang.math.NumberUtils.min(doubleArray95);
        double double98 = org.apache.commons.lang.math.NumberUtils.min(doubleArray95);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray95);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 52.0d + "'", double36 == 52.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 52.0d + "'", double71 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 100.0d + "'", double82 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertArrayEquals(doubleArray95, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + (-1.0d) + "'", double97 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-1.0d) + "'", double98 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) (byte) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float[] floatArray18 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float float20 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
        float[] floatArray25 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray25);
        float float29 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        float float30 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray25);
        float[] floatArray36 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray39 = new float[] { (byte) 10 };
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        float float41 = org.apache.commons.lang.math.NumberUtils.max(floatArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray39);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray39);
        float float44 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 10.0f + "'", float40 == 10.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0d, (double) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(97.0f, 52.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray14);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short[] shortArray26 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray26);
        short[] shortArray30 = new short[] { (short) 100 };
        short[] shortArray31 = new short[] {};
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray31);
        short[] shortArray34 = new short[] { (short) 100 };
        short[] shortArray35 = new short[] {};
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray34);
        short[] shortArray39 = new short[] { (short) 100 };
        short[] shortArray40 = new short[] {};
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray39);
        short[] shortArray44 = new short[] { (short) 100 };
        short[] shortArray45 = new short[] {};
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray45);
        short[] shortArray48 = new short[] { (short) 100 };
        short[] shortArray49 = new short[] {};
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray48, shortArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray48);
        short[] shortArray53 = new short[] { (short) 100 };
        short[] shortArray54 = new short[] {};
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray54);
        short[] shortArray57 = new short[] { (short) 100 };
        short[] shortArray58 = new short[] {};
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray57);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray48, shortArray57);
        short short62 = org.apache.commons.lang.math.NumberUtils.min(shortArray57);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray57);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray34);
        short short65 = org.apache.commons.lang.math.NumberUtils.max(shortArray34);
        java.lang.Class<?> wildcardClass66 = shortArray34.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray39, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray54, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 100 + "'", short65 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), 0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97, 0.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (short) -1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray5 = new long[] { (byte) 1 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray5);
        long[] longArray10 = new long[] { 0L };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long[] longArray13 = new long[] { (byte) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray33 = new long[] { 0L };
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray36 = new long[] { (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray36);
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray36);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray13);
        java.lang.Class<?> wildcardClass42 = longArray5.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (byte) 0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, (float) 1, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 'a', 10.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray10);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray16);
        short[] shortArray19 = new short[] { (short) 100 };
        short[] shortArray20 = new short[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray19);
        short[] shortArray24 = new short[] { (short) 100 };
        short[] shortArray25 = new short[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray24);
        short[] shortArray29 = new short[] { (short) 100 };
        short[] shortArray30 = new short[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray29);
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        short short34 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        short[] shortArray36 = new short[] { (short) 100 };
        short[] shortArray37 = new short[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray37);
        short[] shortArray40 = new short[] { (short) 100 };
        short[] shortArray41 = new short[] {};
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray40);
        short[] shortArray45 = new short[] { (short) 100 };
        short[] shortArray46 = new short[] {};
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray45);
        short[] shortArray50 = new short[] { (short) 100 };
        short[] shortArray51 = new short[] {};
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray50, shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray50);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray19);
        java.lang.Class<?> wildcardClass56 = shortArray5.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 100 + "'", short34 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), (long) (short) -1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(32.0f, (float) 0L, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), 1.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0.0f, 32.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) -1, 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(1.0f, (float) 10, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(32.0d, (double) (-1.0f), 97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray41);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 100 + "'", byte46 == (byte) 100);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, (long) (byte) 100, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52L, (float) 100L, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        short[] shortArray18 = new short[] { (short) 100 };
        short[] shortArray19 = new short[] {};
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray18);
        short[] shortArray23 = new short[] { (short) 100 };
        short[] shortArray24 = new short[] {};
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray23);
        short[] shortArray28 = new short[] { (short) 100 };
        short[] shortArray29 = new short[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray28);
        short[] shortArray32 = null;
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray32);
        short short35 = org.apache.commons.lang.math.NumberUtils.min(shortArray10);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray10);
        short short37 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 100 + "'", short37 == (short) 100);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 100 + "'", short38 == (short) 100);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1L, (float) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(52.0f, (float) (byte) 0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 1, 97.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1.0f, (double) 52L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97L, (double) 0.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, (long) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1, 0.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1.0f, (double) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 10, 10L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32L, (double) 35, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(52.0f, (float) (-1), (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) -1, (double) (byte) 0, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, 10.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, (long) 0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, 32.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) ' ', 1L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 1L, 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, (long) (byte) 10, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, (-1L), 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray14);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short[] shortArray22 = new short[] { (short) 100 };
        short[] shortArray23 = new short[] {};
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray23);
        short[] shortArray26 = new short[] { (short) 100 };
        short[] shortArray27 = new short[] {};
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray26);
        short[] shortArray31 = new short[] { (short) 100 };
        short[] shortArray32 = new short[] {};
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray31);
        short short35 = org.apache.commons.lang.math.NumberUtils.max(shortArray26);
        short[] shortArray41 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray41);
        short short45 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        java.lang.Class<?> wildcardClass46 = shortArray14.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 100 + "'", short45 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 97.0f, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) (short) -1, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 35, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(52.0f, 1.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 1, (float) (byte) 1, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) (byte) 10, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = null;
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray13 = new int[] { (short) -1 };
        int int14 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray16);
        int[] intArray20 = new int[] { (short) -1 };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray23 = new int[] { (short) -1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray20);
        int[] intArray28 = new int[] { (short) -1 };
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        int[] intArray31 = new int[] { (short) -1 };
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray28, intArray31);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray28);
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray28);
        int int37 = org.apache.commons.lang.math.NumberUtils.max(intArray28);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray28);
        int[] intArray40 = new int[] { (short) -1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray43);
        int[] intArray47 = new int[] { (short) -1 };
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray47);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray47, intArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray47);
        int int54 = org.apache.commons.lang.math.NumberUtils.max(intArray47);
        int int55 = org.apache.commons.lang.math.NumberUtils.max(intArray47);
        int[] intArray57 = new int[] { (short) -1 };
        int int58 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        int[] intArray60 = new int[] { (short) -1 };
        int int61 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray57, intArray60);
        int[] intArray64 = new int[] { (short) -1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        int[] intArray67 = new int[] { (short) -1 };
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray64, intArray67);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray60, intArray64);
        int[] intArray72 = new int[] { (short) -1 };
        int int73 = org.apache.commons.lang.math.NumberUtils.min(intArray72);
        int[] intArray75 = new int[] { (short) -1 };
        int int76 = org.apache.commons.lang.math.NumberUtils.min(intArray75);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(intArray72, intArray75);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray64, intArray72);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(intArray47, intArray64);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray64);
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        java.lang.Class<?> wildcardClass82 = intArray64.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(35.0f, (float) 97, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int[] intArray30 = new int[] { (short) -1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray30);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray38);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        int[] intArray46 = new int[] { (short) -1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray46);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray53);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray50);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray50);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int[] intArray62 = new int[] { (short) -1 };
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray62);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray59);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray35);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray27);
        int int72 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int int73 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 0, 52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, (long) 0, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 100, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', (long) '#', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) (byte) 1, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(97.0d, (double) '#', (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray21 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray17);
        double[] doubleArray28 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray32 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double double34 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray28);
        double double36 = org.apache.commons.lang.math.NumberUtils.max(doubleArray17);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray17);
        double double38 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        double double39 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        double[] doubleArray40 = null;
        double[] doubleArray45 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray49 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray45, doubleArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray40, doubleArray45);
        double[] doubleArray52 = null;
        double[] doubleArray57 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray61 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray57);
        double[] doubleArray68 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray72 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray68, doubleArray72);
        double double74 = org.apache.commons.lang.math.NumberUtils.min(doubleArray68);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray68);
        double double76 = org.apache.commons.lang.math.NumberUtils.max(doubleArray57);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray40, doubleArray57);
        double double78 = org.apache.commons.lang.math.NumberUtils.min(doubleArray57);
        double double79 = org.apache.commons.lang.math.NumberUtils.min(doubleArray57);
        double double80 = org.apache.commons.lang.math.NumberUtils.min(doubleArray57);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray57);
        double double82 = org.apache.commons.lang.math.NumberUtils.max(doubleArray17);
        java.lang.Class<?> wildcardClass83 = doubleArray17.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 52.0d + "'", double36 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 52.0d + "'", double76 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 52.0d + "'", double82 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 100, (float) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, 52, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) 100 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray35);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray46);
        byte byte48 = org.apache.commons.lang.math.NumberUtils.min(byteArray46);
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray46, byteArray58);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray58);
        byte[] byteArray63 = new byte[] { (byte) 100 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray35, byteArray63);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        byte byte67 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.max(byteArray35);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 100 + "'", byte24 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) -1 + "'", byte48 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 100 + "'", byte66 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 100 + "'", byte67 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 100 + "'", byte68 == (byte) 100);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, (float) (-1L), (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float[] floatArray7 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray7);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray7);
        float[] floatArray14 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray7, floatArray14);
        float[] floatArray22 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float23 = org.apache.commons.lang.math.NumberUtils.min(floatArray22);
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray22);
        float[] floatArray29 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float30 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        float float31 = org.apache.commons.lang.math.NumberUtils.max(floatArray29);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray29);
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray22);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray22);
        float float35 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float float36 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray41 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray41);
        float[] floatArray47 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float48 = org.apache.commons.lang.math.NumberUtils.min(floatArray47);
        float float49 = org.apache.commons.lang.math.NumberUtils.max(floatArray47);
        float float50 = org.apache.commons.lang.math.NumberUtils.min(floatArray47);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray47);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray47);
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray47);
        float[] floatArray55 = new float[] { (byte) 10 };
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        float float57 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        float[] floatArray64 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float65 = org.apache.commons.lang.math.NumberUtils.min(floatArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray64);
        float[] floatArray68 = new float[] { (byte) 10 };
        float float69 = org.apache.commons.lang.math.NumberUtils.min(floatArray68);
        float float70 = org.apache.commons.lang.math.NumberUtils.max(floatArray68);
        float[] floatArray77 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float78 = org.apache.commons.lang.math.NumberUtils.min(floatArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray77);
        float float80 = org.apache.commons.lang.math.NumberUtils.max(floatArray77);
        float[] floatArray84 = new float[] { 97.0f, 0L, 32L };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(floatArray77, floatArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray77);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray47, floatArray55);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray47);
        float float89 = org.apache.commons.lang.math.NumberUtils.max(floatArray47);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-1.0f) + "'", float36 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertArrayEquals(floatArray41, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertArrayEquals(floatArray47, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + (-1.0f) + "'", float48 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 100.0f + "'", float49 == 100.0f);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-1.0f) + "'", float50 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 100.0f + "'", float53 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 10.0f + "'", float56 == 10.0f);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 10.0f + "'", float57 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertArrayEquals(floatArray64, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + (-1.0f) + "'", float65 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertArrayEquals(floatArray68, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 10.0f + "'", float69 == 10.0f);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 10.0f + "'", float70 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertArrayEquals(floatArray77, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + (-1.0f) + "'", float78 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 100.0f + "'", float80 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertArrayEquals(floatArray84, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 100.0f + "'", float89 == 100.0f);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(97L, (long) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1.0f), (double) 0.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray21 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray17);
        double[] doubleArray28 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray32 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double double34 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray28);
        double double36 = org.apache.commons.lang.math.NumberUtils.max(doubleArray17);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray17);
        double[] doubleArray38 = null;
        double[] doubleArray43 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray47 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray43, doubleArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray43);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray43);
        double double51 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 52.0d + "'", double36 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) 0, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35, 0.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, (float) 35L, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long8 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long[] longArray10 = new long[] { 0L };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long[] longArray13 = new long[] { (byte) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray20);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray28 = new long[] { (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray28);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        long[] longArray32 = new long[] { 0L };
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray35 = new long[] { (byte) 1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray35);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray35);
        long long39 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray13);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray43 = new long[] { 0L };
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        long[] longArray46 = new long[] { (byte) 1 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray46);
        long long49 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
        long[] longArray51 = new long[] { 0L };
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray51);
        long[] longArray54 = new long[] { (byte) 1 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray54);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray54);
        long[] longArray58 = new long[] { 0L };
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long[] longArray61 = new long[] { (byte) 1 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray61);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray54);
        long long65 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray46);
        long long67 = org.apache.commons.lang.math.NumberUtils.max(longArray46);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertArrayEquals(longArray54, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertArrayEquals(longArray58, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) 1, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min(byteArray2);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray6, byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray18, byteArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray25);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        byte[] byteArray30 = new byte[] { (byte) 100 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray30);
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray37);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 0 };
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte byte47 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray37, byteArray43);
        java.lang.Class<?> wildcardClass49 = byteArray37.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 1 + "'", byte39 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 0 + "'", byte44 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 0 + "'", byte46 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 0 + "'", byte47 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, (float) (-1L), (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, (long) (byte) 1, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(35L, (long) (byte) 10, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, 35, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) 100 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        byte byte44 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray43);
        java.lang.Class<?> wildcardClass46 = byteArray43.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 100 + "'", byte24 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 100 + "'", byte38 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 10 + "'", byte44 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(97L, (long) 32, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32L, 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 100, 32L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int[] intArray30 = new int[] { (short) -1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray30);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray38);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        int[] intArray46 = new int[] { (short) -1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray46);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray53);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray50);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray50);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int[] intArray62 = new int[] { (short) -1 };
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray62);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray59);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray35);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray27);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int[] intArray76 = new int[] { (short) -1 };
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray76);
        int[] intArray80 = new int[] { (short) -1 };
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        int[] intArray83 = new int[] { (short) -1 };
        int int84 = org.apache.commons.lang.math.NumberUtils.min(intArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray83);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(intArray76, intArray80);
        int[] intArray88 = new int[] { (short) -1 };
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int[] intArray91 = new int[] { (short) -1 };
        int int92 = org.apache.commons.lang.math.NumberUtils.min(intArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray88, intArray91);
        int int94 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int int95 = org.apache.commons.lang.math.NumberUtils.max(intArray88);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray88);
        int int97 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray80);
        java.lang.Class<?> wildcardClass99 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 'a', 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 97, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) (short) 0, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray10);
        byte byte12 = org.apache.commons.lang.math.NumberUtils.min(byteArray10);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray22);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        byte[] byteArray27 = new byte[] { (byte) 100 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray27);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.max(byteArray27);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray36);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray27);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.min(byteArray27);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray27);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray50);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray62);
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray74 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray67, byteArray74);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(byteArray62, byteArray74);
        byte[] byteArray82 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte83 = org.apache.commons.lang.math.NumberUtils.min(byteArray82);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.min(byteArray82);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray74, byteArray82);
        byte byte86 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray74);
        // The following exception was thrown during execution in test generation
        try {
            byte byte88 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 100 + "'", byte38 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 100 + "'", byte39 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) -1 + "'", byte52 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) -1 + "'", byte76 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte83 + "' != '" + (byte) 1 + "'", byte83 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 1 + "'", byte84 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) -1 + "'", byte86 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 1, (float) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(52.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray6 = new long[] { (short) -1, (short) 1 };
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray6, longArray11);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray6);
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray21 = new long[] { (byte) 1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray21);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray28 = new long[] { (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray28);
        long long31 = org.apache.commons.lang.math.NumberUtils.min(longArray21);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray21);
        long long34 = org.apache.commons.lang.math.NumberUtils.min(longArray21);
        java.lang.Class<?> wildcardClass35 = longArray21.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35L, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) 'a', (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97L, (float) (short) 100, (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', (long) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 'a', 97.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97L, (double) 52, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, 0L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 'a', 97.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(52.0d, (double) 1.0f, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray16 = new long[] { 0L };
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long[] longArray19 = new long[] { (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray19);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long[] longArray23 = new long[] { 0L };
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long[] longArray26 = new long[] { (byte) 1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray26);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long[] longArray32 = new long[] { 0L };
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray35 = new long[] { (byte) 1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray35);
        long long37 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        long[] longArray39 = new long[] { 0L };
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        long[] longArray42 = new long[] { (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray42);
        long[] longArray46 = new long[] { 0L };
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray46);
        long[] longArray49 = new long[] { (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray49);
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray53 = new long[] { 0L };
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray53);
        long[] longArray56 = new long[] { (byte) 1 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray53, longArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray56);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray61 = new long[] { 0L };
        long long62 = org.apache.commons.lang.math.NumberUtils.max(longArray61);
        long[] longArray64 = new long[] { (byte) 1 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray61, longArray64);
        long long66 = org.apache.commons.lang.math.NumberUtils.max(longArray64);
        long[] longArray68 = new long[] { 0L };
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray68);
        long[] longArray71 = new long[] { (byte) 1 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(longArray64, longArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray71);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray49);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray35);
        long long77 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertArrayEquals(longArray53, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertArrayEquals(longArray56, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertArrayEquals(longArray64, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertArrayEquals(longArray68, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int28 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(97.0d, (double) 35, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, 97L, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, (-1), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, 52L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(1.0d, (double) 52L, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) (short) 10, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) (byte) -1, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((-1L), 35L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, (double) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray5 = new long[] { (byte) 1 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray5);
        long[] longArray10 = new long[] { 0L };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long[] longArray13 = new long[] { (byte) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray33 = new long[] { 0L };
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray36 = new long[] { (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray36);
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray36);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray13);
        long[] longArray43 = new long[] { 1 };
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray43);
        long[] longArray47 = new long[] { 0L };
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long[] longArray50 = new long[] { (byte) 1 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray50);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long53 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        long[] longArray55 = new long[] { 0L };
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long[] longArray58 = new long[] { (byte) 1 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray58);
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long[] longArray62 = new long[] { 0L };
        long long63 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        long[] longArray65 = new long[] { (byte) 1 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray65);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray58);
        long[] longArray70 = new long[] { 0L };
        long long71 = org.apache.commons.lang.math.NumberUtils.max(longArray70);
        long[] longArray73 = new long[] { (byte) 1 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray70, longArray73);
        long long75 = org.apache.commons.lang.math.NumberUtils.max(longArray73);
        long[] longArray77 = new long[] { 0L };
        long long78 = org.apache.commons.lang.math.NumberUtils.max(longArray77);
        long[] longArray80 = new long[] { (byte) 1 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(longArray77, longArray80);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(longArray73, longArray80);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray80);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray80);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertArrayEquals(longArray47, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertArrayEquals(longArray50, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertArrayEquals(longArray55, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertArrayEquals(longArray58, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertArrayEquals(longArray62, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertArrayEquals(longArray65, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertArrayEquals(longArray70, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertArrayEquals(longArray73, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertArrayEquals(longArray77, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertArrayEquals(longArray80, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35L, (float) 32L, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, 100L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray18 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray14);
        double[] doubleArray21 = null;
        double[] doubleArray26 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray30 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray26);
        double[] doubleArray37 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray41 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double double43 = org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray37);
        double double45 = org.apache.commons.lang.math.NumberUtils.max(doubleArray26);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray26);
        java.lang.Class<?> wildcardClass47 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 52.0d + "'", double45 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray20);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        java.lang.Class<?> wildcardClass26 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray10 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray10);
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray20 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray20);
        float[] floatArray23 = new float[] { (byte) 10 };
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        float float25 = org.apache.commons.lang.math.NumberUtils.max(floatArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray23);
        float[] floatArray28 = new float[] { (byte) 10 };
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        float float30 = org.apache.commons.lang.math.NumberUtils.max(floatArray28);
        float[] floatArray37 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray28, floatArray37);
        float float40 = org.apache.commons.lang.math.NumberUtils.max(floatArray37);
        float[] floatArray44 = new float[] { 97.0f, 0L, 32L };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray37, floatArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray37);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray20);
        float float48 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertArrayEquals(floatArray44, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, (double) (short) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10, (double) 0L, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float[] floatArray14 = new float[] { (byte) 10 };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray14);
        float[] floatArray23 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray23);
        float float26 = org.apache.commons.lang.math.NumberUtils.max(floatArray23);
        float[] floatArray30 = new float[] { 97.0f, 0L, 32L };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray23);
        float[] floatArray37 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray37);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray37);
        java.lang.Class<?> wildcardClass41 = floatArray23.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int int9 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int int10 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, 97, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (int) (byte) 1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int[] intArray8 = new int[] { (short) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray11 = new int[] { (short) -1 };
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray8);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        int[] intArray23 = new int[] { (short) -1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray23);
        int[] intArray26 = new int[] { (short) -1 };
        int int27 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray23);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray19);
        java.lang.Class<?> wildcardClass31 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray16 = new long[] { 0L };
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long[] longArray19 = new long[] { (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray19);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long[] longArray23 = new long[] { 0L };
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long[] longArray26 = new long[] { (byte) 1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray26);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (-1), (long) 10, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray38 = null;
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray48);
        byte byte50 = org.apache.commons.lang.math.NumberUtils.max(byteArray48);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray60 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray60);
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray72);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray60);
        byte[] byteArray80 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte81 = org.apache.commons.lang.math.NumberUtils.min(byteArray80);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.min(byteArray80);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray80);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray38, byteArray80);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray80);
        byte[] byteArray88 = new byte[] { (byte) 0, (byte) 0 };
        byte byte89 = org.apache.commons.lang.math.NumberUtils.min(byteArray88);
        byte byte90 = org.apache.commons.lang.math.NumberUtils.min(byteArray88);
        byte byte91 = org.apache.commons.lang.math.NumberUtils.max(byteArray88);
        byte byte92 = org.apache.commons.lang.math.NumberUtils.min(byteArray88);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(byteArray80, byteArray88);
        java.lang.Class<?> wildcardClass94 = byteArray88.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) -1 + "'", byte37 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 100 + "'", byte50 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) -1 + "'", byte62 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 1 + "'", byte81 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 1 + "'", byte82 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) 0 + "'", byte89 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte90 + "' != '" + (byte) 0 + "'", byte90 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) 0 + "'", byte91 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 0 + "'", byte92 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, 100.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(1.0d, (double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        short[] shortArray0 = null;
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray3 = new short[] {};
        boolean boolean4 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray3);
        short[] shortArray6 = new short[] { (short) 100 };
        short[] shortArray7 = new short[] {};
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] { (short) 100 };
        short[] shortArray12 = new short[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray12);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray15);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray15);
        short[] shortArray21 = new short[] { (short) 100 };
        short[] shortArray22 = new short[] {};
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray22);
        short[] shortArray25 = new short[] { (short) 100 };
        short[] shortArray26 = new short[] {};
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray25);
        short[] shortArray30 = new short[] { (short) 100 };
        short[] shortArray31 = new short[] {};
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray30);
        short[] shortArray35 = new short[] { (short) 100 };
        short[] shortArray36 = new short[] {};
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray36);
        short[] shortArray39 = new short[] { (short) 100 };
        short[] shortArray40 = new short[] {};
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray39);
        short[] shortArray44 = new short[] { (short) 100 };
        short[] shortArray45 = new short[] {};
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray44);
        short[] shortArray49 = new short[] { (short) 100 };
        short[] shortArray50 = new short[] {};
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray49);
        short short53 = org.apache.commons.lang.math.NumberUtils.min(shortArray39);
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray39);
        short[] shortArray56 = new short[] { (short) 100 };
        short[] shortArray57 = new short[] {};
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray56, shortArray57);
        short[] shortArray60 = new short[] { (short) 100 };
        short[] shortArray61 = new short[] {};
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray60);
        short[] shortArray65 = new short[] { (short) 100 };
        short[] shortArray66 = new short[] {};
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray65);
        short[] shortArray70 = new short[] { (short) 100 };
        short[] shortArray71 = new short[] {};
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray70, shortArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray70);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray70);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray39);
        short short76 = org.apache.commons.lang.math.NumberUtils.min(shortArray25);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray25);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray25);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray39, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 100 + "'", short53 == (short) 100);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 100 + "'", short54 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray60, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray65, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray66, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray70, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray71, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) 100 + "'", short76 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 0, 35.0d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) 100 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte31 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 100 + "'", byte24 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 100 + "'", byte30 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 100 + "'", byte31 == (byte) 100);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(52, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray20);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray27 = new long[] { 0L };
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long[] longArray30 = new long[] { (byte) 1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray30);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        long[] longArray34 = new long[] { 0L };
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        long[] longArray37 = new long[] { (byte) 1 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray37);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray30);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        long[] longArray43 = new long[] { 0L };
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        long[] longArray46 = new long[] { (byte) 1 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray46);
        long long50 = org.apache.commons.lang.math.NumberUtils.min(longArray30);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray30);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertArrayEquals(longArray37, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        long[] longArray2 = new long[] { (short) -1, (short) 1 };
        long[] longArray4 = new long[] { 0L };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray7 = new long[] { (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long[] longArray12 = new long[] { 0L };
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray12);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray22 = new long[] { (short) -1, (short) 1 };
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray27);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray22);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray22);
        long[] longArray35 = new long[] { 0L };
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        long[] longArray38 = new long[] { (byte) 1 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray38);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray38);
        long[] longArray42 = new long[] { 0L };
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long[] longArray45 = new long[] { (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray45);
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long[] longArray49 = new long[] { 0L };
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray52 = new long[] { (byte) 1 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray52);
        long long55 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long[] longArray58 = new long[] { 0L };
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long[] longArray61 = new long[] { (byte) 1 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray61);
        long long63 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray61);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray61);
        long long66 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
        long[] longArray68 = new long[] { 0L };
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray68);
        long[] longArray71 = new long[] { (byte) 1 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray71);
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray71);
        long[] longArray75 = new long[] { 0L };
        long long76 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        long[] longArray78 = new long[] { (byte) 1 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(longArray71, longArray78);
        long long81 = org.apache.commons.lang.math.NumberUtils.min(longArray71);
        long long82 = org.apache.commons.lang.math.NumberUtils.max(longArray71);
        long long83 = org.apache.commons.lang.math.NumberUtils.max(longArray71);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray61, longArray71);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray61);
        long[] longArray87 = new long[] { 0L };
        long long88 = org.apache.commons.lang.math.NumberUtils.max(longArray87);
        long[] longArray90 = new long[] { (byte) 1 };
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(longArray87, longArray90);
        long long92 = org.apache.commons.lang.math.NumberUtils.min(longArray90);
        long long93 = org.apache.commons.lang.math.NumberUtils.min(longArray90);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(longArray61, longArray90);
        long long95 = org.apache.commons.lang.math.NumberUtils.max(longArray90);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertArrayEquals(longArray45, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertArrayEquals(longArray52, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertArrayEquals(longArray58, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertArrayEquals(longArray68, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertArrayEquals(longArray75, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertArrayEquals(longArray78, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertArrayEquals(longArray87, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertArrayEquals(longArray90, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 1L + "'", long95 == 1L);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) 100 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte[] byteArray38 = null;
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray38);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 100 + "'", byte24 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }
}

