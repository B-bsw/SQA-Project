package org.apache.commons.compress.utils;

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
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray6);
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray16 = new byte[] {};
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, 100, 0, byteArray16, (int) (byte) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.compress.utils.ArchiveUtils.toString(archiveEntry0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        java.lang.Class<?> wildcardClass14 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray26);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray26, true);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, (int) (short) -1, 0, byteArray20, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray10, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 129");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray13 = new byte[] {};
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray4, (int) (byte) 100, 10, byteArray13, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray19, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = new byte[] {};
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 10 };
        byte[] byteArray8 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray8);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray8, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray3, 100, (int) (short) 100, byteArray8, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray4, (-1));
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        byte[] byteArray25 = new byte[] { (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray25, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, 100, (int) '#', byteArray23, (int) (short) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] {};
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray20, false);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray11);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray6);
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray26);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray26, true);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, (int) (short) -1, 0, byteArray20, 1, 0);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray41 = new byte[] {};
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray40, byteArray41);
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray41, (int) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, 1, (-1), byteArray41, (int) (short) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        java.lang.String str6 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, byteArray20, true);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray36);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray36, true);
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, (int) (short) -1, 0, byteArray30, 1, 0);
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray30, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, 1, (int) (short) 1, byteArray30, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n\n\ufffd" + "'", str6, "\n\n\ufffd");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 100 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray7, false);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray22);
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray22, true);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray31 = new byte[] {};
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray31);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, byteArray31, false);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray42 = new byte[] {};
        boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray41, byteArray42);
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray22, (int) (short) 1, (-1), byteArray41, 1, (int) (byte) 100);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean52 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray51);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean58 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray57);
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray51, byteArray57, true);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray66 = new byte[] {};
        boolean boolean67 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray65, byteArray66);
        boolean boolean69 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray57, byteArray66, false);
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray41, byteArray57, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray5, (int) (short) 100, (int) (byte) 100, byteArray41, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray6);
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16);
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray16, true);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray26);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, byteArray32, true);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, (int) (short) -1, 0, byteArray26, 1, 0);
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray26, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray2, (int) (byte) -1, (int) 'a', byteArray26, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        byte[] byteArray1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray10 = new byte[] {};
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray9, byteArray10);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray1, (int) (short) 100, 100, byteArray9, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        byte[] byteArray2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray2);
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray2, (int) (short) -1);
        byte[] byteArray10 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, (int) '4', (int) (byte) 10, byteArray10, 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 100 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray7, false);
        java.lang.Class<?> wildcardClass10 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        byte[] byteArray2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray2);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16);
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray16, true);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, (int) (byte) 0, (int) (byte) 0, byteArray10, (-1), (int) '4', false);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray36);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray36, true);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray45 = new byte[] {};
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray44, byteArray45);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray36, byteArray45, false);
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray56 = new byte[] {};
        boolean boolean57 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray55, byteArray56);
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray36, (int) (short) 1, (-1), byteArray55, 1, (int) (byte) 100);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean66 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray65);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray71);
        boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray65, byteArray71, true);
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray80 = new byte[] {};
        boolean boolean81 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray79, byteArray80);
        boolean boolean83 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray71, byteArray80, false);
        boolean boolean85 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray55, byteArray71, true);
        boolean boolean88 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (byte) 0, (int) (byte) 1, byteArray55, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str91 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray6);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray12);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray12, true);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray21 = new byte[] {};
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray21);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray21, false);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray12, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray35 = new byte[] {};
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray34, byteArray35);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, (int) (byte) 1, 0, byteArray34, (int) (short) 1, (int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray12, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = new byte[] {};
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray8);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray7);
        java.lang.String str11 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray7);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray7);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray7, (int) (short) 0, (-1));
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray29);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray29, true);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray23, (-1));
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray23);
        java.lang.String str36 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (int) (byte) 100, (int) (byte) 0, byteArray23, (int) '#', (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\000\000d" + "'", str11, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\n\n\ufffd" + "'", str36, "\n\n\ufffd");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray6);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray6, (int) (byte) 10, (int) (short) 10);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray39);
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray39, true);
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, (int) (short) -1, 0, byteArray33, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, 0, (int) 'a', byteArray33, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        java.lang.String str23 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray10);
        byte[] byteArray29 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray29);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray29, (int) (byte) 10, 0);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray29, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) '#', (int) '#', byteArray29, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n\n\ufffd" + "'", str23, "\n\n\ufffd");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize("\n\000\000d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "???d" + "'", str1, "???d");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize("\n\n\ufffd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "???" + "'", str1, "???");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] {};
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray20, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray34 = new byte[] {};
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray34);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (int) (byte) 1, 0, byteArray33, (int) (short) 1, (int) '#', false);
        byte[] byteArray44 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray44);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray52);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray58);
        boolean boolean61 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray52, byteArray58, true);
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray44, (int) (byte) 0, (int) (byte) 0, byteArray52, (-1), (int) '4', false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray33, (-1), (int) (short) 10, byteArray44, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        byte[] byteArray3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray3);
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray3, (int) (short) -1);
        byte[] byteArray9 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray9);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray9, (int) (byte) 0, (int) (byte) 0, byteArray17, (-1), (int) '4', false);
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("???", byteArray3, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        byte[] byteArray3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray3);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray17, true);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, (int) (byte) 0, (int) (byte) 0, byteArray11, (-1), (int) '4', false);
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray3);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray5, (-1));
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray5);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray24);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray30);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray30, true);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray39 = new byte[] {};
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray38, byteArray39);
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray39, false);
        boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray30, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, (int) (short) 1, 1, byteArray30, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] {};
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray30);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (short) 1, (-1), byteArray29, 1, (int) (byte) 100);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray45);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray45, true);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray54 = new byte[] {};
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray53, byteArray54);
        boolean boolean57 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray54, false);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray45, true);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray70);
        boolean boolean73 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray64, byteArray70, true);
        boolean boolean75 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray64, (-1));
        boolean boolean76 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray64);
        boolean boolean78 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray64, (int) (byte) 1);
        java.lang.String str81 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray64, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        byte[] byteArray2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray2);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16);
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray16, true);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, (int) (byte) 0, (int) (byte) 0, byteArray10, (-1), (int) '4', false);
        java.lang.String str24 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray2);
        java.lang.Class<?> wildcardClass25 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] {};
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray20, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray34 = new byte[] {};
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray34);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (int) (byte) 1, 0, byteArray33, (int) (short) 1, (int) '#', false);
        byte[] byteArray43 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\n\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (int) ' ', (int) (short) 1, byteArray43, (-1), 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 10, (byte) 63 });
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = new byte[] {};
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray5);
        byte[] byteArray8 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\000\000d");
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray8, true);
        java.lang.Class<?> wildcardClass11 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize("???");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "???" + "'", str1, "???");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        byte[] byteArray2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray2);
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray2, (int) (short) -1);
        byte[] byteArray8 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray22);
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray22, true);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, (int) (byte) 0, (int) (byte) 0, byteArray16, (-1), (int) '4', false);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, byteArray8);
        java.lang.Class<?> wildcardClass31 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray4, (int) (short) 100);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, byteArray20, true);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray29 = new byte[] {};
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray28, byteArray29);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray29, false);
        java.lang.String str33 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray20);
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, 0, 0, byteArray20, 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n\n\ufffd" + "'", str33, "\n\n\ufffd");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray9 = new byte[] {};
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, byteArray9);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray8);
        java.lang.String str12 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray8);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray8);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray8, (int) (short) 0, (-1));
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray8);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray29);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray29, true);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray38 = new byte[] {};
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray37, byteArray38);
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray38, false);
        boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray29, (int) (byte) -1, (int) (byte) -1);
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, byteArray29);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n\000\000d" + "'", str12, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = new byte[] {};
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray8);
        byte[] byteArray11 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\000\000d");
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, byteArray11, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray0, (int) (byte) 0, (int) (short) 1, byteArray11, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] {};
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray30);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (short) 1, (-1), byteArray29, 1, (int) (byte) 100);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray45);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray45, true);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray54 = new byte[] {};
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray53, byteArray54);
        boolean boolean57 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray54, false);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray45, true);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray70);
        boolean boolean73 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray64, byteArray70, true);
        boolean boolean75 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray64, (-1));
        boolean boolean76 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray64);
        boolean boolean78 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray64, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str81 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray64, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 152");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray0, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray4, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        byte[] byteArray2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\000\000d");
        byte[] byteArray7 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray7);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray7, (int) (short) -1);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, (int) '#', (int) '4', byteArray7, (int) (byte) 100, (int) (short) -1, false);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray2, 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        byte[] byteArray1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\000\000d");
        byte[] byteArray6 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray6);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray6, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray1, (int) '#', (int) '4', byteArray6, (int) (byte) 100, (int) (short) -1, false);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray26);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray26, true);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray35 = new byte[] {};
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray34, byteArray35);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, byteArray35, false);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray46 = new byte[] {};
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray46);
        boolean boolean50 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray26, (int) (short) 1, (-1), byteArray45, 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray1, (int) (short) 100, 10, byteArray26, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = new byte[] {};
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray8);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray7);
        java.lang.String str11 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray7);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray7);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray24);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray24, true);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray33 = new byte[] {};
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray32, byteArray33);
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray33, false);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray24, (int) (byte) -1, (int) (byte) -1);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\000\000d" + "'", str11, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        java.lang.String str6 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray4);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray18);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray18, true);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray27 = new byte[] {};
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, byteArray27);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray27, false);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray18, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray41 = new byte[] {};
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray40, byteArray41);
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, (int) (byte) 1, 0, byteArray40, (int) (short) 1, (int) '#', false);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray40, false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n\n\ufffd" + "'", str6, "\n\n\ufffd");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] {};
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray20, false);
        java.lang.String str24 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray11);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray11, (int) (byte) 10);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("???d", byteArray11);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n\n\ufffd" + "'", str24, "\n\n\ufffd");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] {};
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray30);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (short) 1, (-1), byteArray29, 1, (int) (byte) 100);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray45);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray45, true);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray54 = new byte[] {};
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray53, byteArray54);
        boolean boolean57 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray54, false);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray45, true);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray70);
        boolean boolean73 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray64, byteArray70, true);
        boolean boolean75 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray64, (-1));
        boolean boolean76 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str79 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray45, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] {};
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray20, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray34 = new byte[] {};
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray34);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (int) (byte) 1, 0, byteArray33, (int) (short) 1, (int) '#', false);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray52);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray46, byteArray52, true);
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean63 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray62);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean69 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray68);
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray62, byteArray68, true);
        boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray52, (int) (short) -1, 0, byteArray62, 1, 0);
        boolean boolean77 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray11, (int) (short) 1, (int) 'a', byteArray52, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray52, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        byte[] byteArray1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\n\ufffd");
        java.lang.String str2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) 10, (byte) 63 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n?" + "'", str2, "\n\n?");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] {};
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray30);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (short) 1, (-1), byteArray29, 1, (int) (byte) 100);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray45);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray45, true);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray54 = new byte[] {};
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray53, byteArray54);
        boolean boolean57 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray54, false);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray45, true);
        byte[] byteArray65 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean66 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray65);
        boolean boolean69 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray65, (int) (byte) 10, 0);
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray65, (int) (short) 10);
        boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, 0, (int) (byte) 1, byteArray65, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] {};
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray30);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (short) 1, (-1), byteArray29, 1, (int) (byte) 100);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray45);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray45, true);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray54 = new byte[] {};
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray53, byteArray54);
        boolean boolean57 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray54, false);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray45, true);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray70);
        boolean boolean73 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray64, byteArray70, true);
        boolean boolean75 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray64, (-1));
        boolean boolean76 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray64);
        java.lang.String str77 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray45);
        byte[] byteArray82 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean83 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray82);
        boolean boolean85 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray82, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean89 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, (int) ' ', (int) (byte) 10, byteArray82, (int) (short) 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\n\n\ufffd" + "'", str77, "\n\n\ufffd");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        byte[] byteArray1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 100 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray7, false);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray7, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        byte[] byteArray3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray3);
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray3, (int) (short) -1);
        byte[] byteArray9 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray9);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray9, (int) (byte) 0, (int) (byte) 0, byteArray17, (-1), (int) '4', false);
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray9);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray9);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray5, (-1));
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray5);
        java.lang.String str18 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray29);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray29, true);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray29);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n\n\ufffd" + "'", str18, "\n\n\ufffd");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = new byte[] {};
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray8);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray7);
        java.lang.String str11 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray7);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray7);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("???d", byteArray7, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\000\000d" + "'", str11, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray9 = new byte[] {};
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, byteArray9);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray8);
        java.lang.String str12 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray8);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray8);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray8, (int) (short) 0, (-1));
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray8);
        java.lang.String str18 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray8);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n\000\000d" + "'", str12, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n\000\000d" + "'", str18, "\n\000\000d");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16);
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray16, true);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray25 = new byte[] {};
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray25);
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray25, false);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray3, (int) (byte) 1, (int) (short) 10, byteArray16, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        byte[] byteArray4 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray4, (int) (byte) 10, 0);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("???d", byteArray4);
        byte[] byteArray13 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\n\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray4, (int) ' ', 10, byteArray13, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 63 });
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        byte[] byteArray28 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray28);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray28, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (short) 10, (int) (short) -1, byteArray28, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] {};
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray7);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray6);
        java.lang.String str10 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray6);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray6);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray32 = new byte[] {};
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray32, false);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23, (int) (byte) -1, (int) (byte) -1);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray23);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray50);
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray44, byteArray50, true);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray59 = new byte[] {};
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray58, byteArray59);
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, byteArray59, false);
        boolean boolean64 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray50, (int) (short) 1);
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray50);
        java.lang.String str66 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray50);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n\000\000d" + "'", str10, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\n\n\ufffd" + "'", str66, "\n\n\ufffd");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = new byte[] {};
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray5);
        byte[] byteArray8 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\000\000d");
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray8, true);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray32 = new byte[] {};
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray32, false);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray43 = new byte[] {};
        boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray42, byteArray43);
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray23, (int) (short) 1, (-1), byteArray42, 1, (int) (byte) 100);
        byte[] byteArray51 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean52 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray51);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray59);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean66 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray65);
        boolean boolean68 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray59, byteArray65, true);
        boolean boolean72 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray51, (int) (byte) 0, (int) (byte) 0, byteArray59, (-1), (int) '4', false);
        boolean boolean73 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray59);
        boolean boolean75 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray59, false);
        java.lang.String str76 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray8, (int) (byte) 100, (int) '4', byteArray23, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\n\n\ufffd" + "'", str76, "\n\n\ufffd");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        byte[] byteArray2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray2);
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray2, (int) (short) -1);
        byte[] byteArray8 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray22);
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray22, true);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, (int) (byte) 0, (int) (byte) 0, byteArray16, (-1), (int) '4', false);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray2, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray5, (-1));
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray5);
        java.lang.String str18 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5);
        java.lang.String str19 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n\n\ufffd" + "'", str18, "\n\n\ufffd");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n\n\ufffd" + "'", str19, "\n\n\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray27);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, byteArray27, true);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (int) (short) -1, 0, byteArray21, 1, 0);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("???", byteArray21);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n?", byteArray1, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray6);
        byte[] byteArray9 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\000\000d");
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray9, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray9, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray5, (int) (short) 1, 0);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray32 = new byte[] {};
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray32, false);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray46 = new byte[] {};
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray46);
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, (int) (byte) 1, 0, byteArray45, (int) (short) 1, (int) '#', false);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray58);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray64);
        boolean boolean67 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray58, byteArray64, true);
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean75 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray74);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean81 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray80);
        boolean boolean83 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray74, byteArray80, true);
        boolean boolean86 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray64, (int) (short) -1, 0, byteArray74, 1, 0);
        boolean boolean89 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray23, (int) (short) 1, (int) 'a', byteArray64, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, (int) (short) 10, (int) (byte) 100, byteArray64, (int) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = new byte[] {};
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray8);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray7);
        java.lang.String str11 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray7);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray7);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray24);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray24, true);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray33 = new byte[] {};
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray32, byteArray33);
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray33, false);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray24, (int) (byte) -1, (int) (byte) -1);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray24);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean52 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray51);
        boolean boolean54 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray51, true);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray60 = new byte[] {};
        boolean boolean61 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray59, byteArray60);
        boolean boolean63 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray51, byteArray60, false);
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray51, (int) (short) 1);
        boolean boolean66 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray51);
        boolean boolean69 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray51, 1, (int) ' ');
        java.lang.String str70 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray51);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\000\000d" + "'", str11, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\n\n\ufffd" + "'", str70, "\n\n\ufffd");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] {};
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray7);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray6);
        java.lang.String str10 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray6);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray6);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray32 = new byte[] {};
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray32, false);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23, (int) (byte) -1, (int) (byte) -1);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray23);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray50);
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray44, byteArray50, true);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray59 = new byte[] {};
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray58, byteArray59);
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, byteArray59, false);
        boolean boolean64 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray50, (int) (short) 1);
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray50);
        boolean boolean67 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray50, 0);
        byte[] byteArray70 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, (int) (short) 100, 100, byteArray70, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n\000\000d" + "'", str10, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] {};
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray7);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray6);
        java.lang.String str10 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray6);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray6);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray32 = new byte[] {};
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray32, false);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23, (int) (byte) -1, (int) (byte) -1);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray23);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray50);
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray44, byteArray50, true);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray59 = new byte[] {};
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray58, byteArray59);
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, byteArray59, false);
        boolean boolean64 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray50, (int) (short) 1);
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray23, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 107");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n\000\000d" + "'", str10, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray6);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray6, (int) (byte) -1, (int) (short) -1);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray18);
        java.lang.String str22 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray6, 100, (int) '#', byteArray18, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n\000\000d" + "'", str22, "\n\000\000d");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        byte[] byteArray3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray3);
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] {};
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray20, false);
        java.lang.String str24 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray11);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray11, (int) (byte) 10);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray11);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n\n\ufffd" + "'", str24, "\n\n\ufffd");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = new byte[] {};
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray5);
        byte[] byteArray8 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\000\000d");
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray8, true);
        byte[] byteArray15 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray15);
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, (int) (short) 10, (-1), byteArray15, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray5, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        byte[] byteArray4 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray18);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray18, true);
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, (int) (byte) 0, (int) (byte) 0, byteArray12, (-1), (int) '4', false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray12);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray34 = new byte[] {};
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray34);
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray33);
        java.lang.String str37 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray33);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray33);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray33);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray33);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\n\000\000d" + "'", str37, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n?", byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = new byte[] {};
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray5);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray16 = new byte[] {};
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray16);
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray15);
        java.lang.String str19 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray15);
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray15);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray26);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, byteArray32, true);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray41 = new byte[] {};
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray40, byteArray41);
        boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray32, byteArray41, false);
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray32, (int) (byte) -1, (int) (byte) -1);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray32);
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray4, 0, (int) (byte) 100, byteArray15, (int) (short) 1, 0);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray61 = new byte[] {};
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray60, byteArray61);
        boolean boolean63 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray60);
        java.lang.String str64 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray60);
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray60);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray71);
        byte[] byteArray77 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean78 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray77);
        boolean boolean80 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray71, byteArray77, true);
        byte[] byteArray85 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray86 = new byte[] {};
        boolean boolean87 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray85, byteArray86);
        boolean boolean89 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray77, byteArray86, false);
        boolean boolean92 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray77, (int) (byte) -1, (int) (byte) -1);
        boolean boolean93 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray60, byteArray77);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray15, (int) (short) 1, (int) '#', byteArray77, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n\000\000d" + "'", str19, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\n\000\000d" + "'", str64, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray4, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] {};
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray30);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (short) 1, (-1), byteArray29, 1, (int) (byte) 100);
        byte[] byteArray38 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray38);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray52);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray46, byteArray52, true);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray38, (int) (byte) 0, (int) (byte) 0, byteArray46, (-1), (int) '4', false);
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray46);
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray46, false);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray70 = new byte[] {};
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray69, byteArray70);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray46, (int) (short) 1, (int) '#', byteArray70, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        byte[] byteArray4 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray4, (int) (byte) 10, 0);
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray4, (int) (short) 10);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray24);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray24, true);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray33 = new byte[] {};
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray32, byteArray33);
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray33, false);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray24, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray47 = new byte[] {};
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray46, byteArray47);
        boolean boolean52 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, (int) (byte) 1, 0, byteArray46, (int) (short) 1, (int) '#', false);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray59);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean66 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray65);
        boolean boolean68 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray59, byteArray65, true);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean76 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray75);
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean82 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray81);
        boolean boolean84 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray75, byteArray81, true);
        boolean boolean87 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray65, (int) (short) -1, 0, byteArray75, 1, 0);
        boolean boolean90 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray24, (int) (short) 1, (int) 'a', byteArray65, 0, (int) (short) 1);
        boolean boolean94 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, 0, 0, byteArray65, (int) '#', (int) (byte) 0, true);
        boolean boolean95 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n?", byteArray65);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray6);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray12);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray12, true);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray21 = new byte[] {};
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray21);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray21, false);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray12, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray35 = new byte[] {};
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray34, byteArray35);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, (int) (byte) 1, 0, byteArray34, (int) (short) 1, (int) '#', false);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray47);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean54 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray53);
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray47, byteArray53, true);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean64 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray63);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean70 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray69);
        boolean boolean72 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray63, byteArray69, true);
        boolean boolean75 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray53, (int) (short) -1, 0, byteArray63, 1, 0);
        boolean boolean78 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray12, (int) (short) 1, (int) 'a', byteArray53, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("???d", byteArray12, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize("???d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "???d" + "'", str1, "???d");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] {};
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray20, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray34 = new byte[] {};
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray34);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (int) (byte) 1, 0, byteArray33, (int) (short) 1, (int) '#', false);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray52);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray46, byteArray52, true);
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean63 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray62);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean69 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray68);
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray62, byteArray68, true);
        boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray52, (int) (short) -1, 0, byteArray62, 1, 0);
        boolean boolean77 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray11, (int) (short) 1, (int) 'a', byteArray52, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass78 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        byte[] byteArray2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray2);
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray2, (int) (short) -1);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray13);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, (int) (byte) 100, 100, byteArray13, (int) (short) -1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray5, (-1));
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray5);
        java.lang.String str18 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5);
        java.lang.String str19 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5);
        java.lang.String str22 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5, (int) (short) 0, 0);
        byte[] byteArray28 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray28);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray28, (int) (byte) 10, 0);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray28, (int) (short) 10);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, (int) (short) -1, (int) (byte) 10, byteArray28, 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n\n\ufffd" + "'", str18, "\n\n\ufffd");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n\n\ufffd" + "'", str19, "\n\n\ufffd");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] {};
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray7);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray6);
        java.lang.String str10 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray6);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray6);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray32 = new byte[] {};
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray32, false);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23, (int) (byte) -1, (int) (byte) -1);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray23);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray50);
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray44, byteArray50, true);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray59 = new byte[] {};
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray58, byteArray59);
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, byteArray59, false);
        boolean boolean64 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray50, (int) (short) 1);
        boolean boolean65 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray50);
        java.lang.Class<?> wildcardClass66 = byteArray23.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n\000\000d" + "'", str10, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] {};
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray20, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray34 = new byte[] {};
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray34);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (int) (byte) 1, 0, byteArray33, (int) (short) 1, (int) '#', false);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray52);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray46, byteArray52, true);
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean63 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray62);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean69 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray68);
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray62, byteArray68, true);
        boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray52, (int) (short) -1, 0, byteArray62, 1, 0);
        boolean boolean77 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray11, (int) (short) 1, (int) 'a', byteArray52, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray11, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 110");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        byte[] byteArray0 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray11 = new byte[] {};
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray11);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        java.lang.String str14 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray10);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray10);
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray10, (int) (short) 0, (-1));
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray0, (-1), (-1), byteArray10, (int) ' ', (int) '#', false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n\000\000d" + "'", str14, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = new byte[] {};
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray5);
        java.lang.String str7 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n\000\000d" + "'", str7, "\n\000\000d");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] {};
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray30);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (short) 1, (-1), byteArray29, 1, (int) (byte) 100);
        byte[] byteArray38 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray38);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray52);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray46, byteArray52, true);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray38, (int) (byte) 0, (int) (byte) 0, byteArray46, (-1), (int) '4', false);
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray46);
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray46, false);
        java.lang.String str63 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray10);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray70);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean77 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray76);
        boolean boolean79 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray70, byteArray76, true);
        byte[] byteArray84 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray85 = new byte[] {};
        boolean boolean86 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray84, byteArray85);
        boolean boolean88 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray76, byteArray85, false);
        boolean boolean90 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray76, (int) (short) 1);
        boolean boolean94 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, (int) ' ', 0, byteArray76, (int) (short) -1, 100, false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\n\n\ufffd" + "'", str63, "\n\n\ufffd");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray27);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, byteArray27, true);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (int) (short) -1, 0, byteArray21, 1, 0);
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray21, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass37 = byteArray21.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray26);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray26, true);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, (int) (short) -1, 0, byteArray20, 1, 0);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray40 = new byte[] {};
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray40);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray51 = new byte[] {};
        boolean boolean52 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, byteArray51);
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray50);
        java.lang.String str54 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray50);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray50);
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray61);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean68 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray67);
        boolean boolean70 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray61, byteArray67, true);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray76 = new byte[] {};
        boolean boolean77 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray75, byteArray76);
        boolean boolean79 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray67, byteArray76, false);
        boolean boolean82 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray67, (int) (byte) -1, (int) (byte) -1);
        boolean boolean83 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, byteArray67);
        boolean boolean86 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray39, 0, (int) (byte) 100, byteArray50, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean89 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray20, (int) 'a', (int) ' ', byteArray39, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\n\000\000d" + "'", str54, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray5, (int) (short) 100);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray5);
        java.lang.String str10 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5);
        byte[] byteArray14 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\000\000d");
        byte[] byteArray19 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray19, (int) (short) -1);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, (int) '#', (int) '4', byteArray19, (int) (byte) 100, (int) (short) -1, false);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, (int) (byte) 0, (int) (byte) 0, byteArray14, 0, (int) 'a', true);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray40 = new byte[] {};
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray40);
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray39);
        java.lang.String str43 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray39);
        boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray39);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray50);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean57 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray56);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, byteArray56, true);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray65 = new byte[] {};
        boolean boolean66 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray64, byteArray65);
        boolean boolean68 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray56, byteArray65, false);
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray56, (int) (byte) -1, (int) (byte) -1);
        boolean boolean72 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray56);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, (int) ' ', (int) '#', byteArray39, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n\n\ufffd" + "'", str10, "\n\n\ufffd");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\n\000\000d" + "'", str43, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        byte[] byteArray1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("???");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray11 = new byte[] {};
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray11);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        java.lang.String str14 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray10);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray10);
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray10, (int) (short) 0, (-1));
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray1, byteArray10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 63, (byte) 63, (byte) 63 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n\000\000d" + "'", str14, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray5, (int) (short) 100);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5, (int) (byte) 10, (int) (short) 10);
        java.lang.String str14 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray5, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = new byte[] {};
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        byte[] byteArray0 = null;
        byte[] byteArray4 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\n?");
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray0, (int) (byte) -1, (int) ' ', byteArray4, (int) (byte) 100, (-1), false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 63 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String str1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize("\n\n?");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "???" + "'", str1, "???");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray9 = new byte[] {};
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, byteArray9);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray8);
        java.lang.String str12 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray8);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray8);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\000\000d", byteArray8, (int) (short) 0, (-1));
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray8, 0, 1);
        byte[] byteArray23 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("???d");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray8, (int) '#', (int) (short) 0, byteArray23, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n\000\000d" + "'", str12, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 63, (byte) 63, (byte) 63, (byte) 100 });
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        byte[] byteArray2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray2);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray12 = new byte[] {};
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray12);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        java.lang.String str15 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray11);
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, (int) (short) 10, (int) (short) 1, byteArray11, 100, (int) (byte) 0, false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\000\000d" + "'", str15, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20);
        java.lang.String str22 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (byte) 10, (int) ' ', byteArray20, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n\n\ufffd" + "'", str22, "\n\n\ufffd");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray27);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, byteArray27, true);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (int) (short) -1, 0, byteArray21, 1, 0);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("???d", byteArray11);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray4, (int) (short) 100);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray21);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray21, true);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray37);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, byteArray37, true);
        boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) -1, 0, byteArray31, 1, 0);
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray31, 0, (int) (short) 10);
        java.lang.String str47 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray31);
        boolean boolean50 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray4, (int) '4', (-1), byteArray31, (int) 'a', (int) (short) -1);
        java.lang.String str51 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\n\n\ufffd" + "'", str47, "\n\n\ufffd");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\n\n\ufffd" + "'", str51, "\n\n\ufffd");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        byte[] byteArray3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray3);
        boolean boolean7 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray3, (int) (byte) 10, 0);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray3, (int) (short) 10);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray26);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray26, true);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray36);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray42);
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray36, byteArray42, true);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, (int) (short) -1, 0, byteArray36, 1, 0);
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray4, (int) (short) 1, (int) ' ', byteArray26, (-1), 0);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray59 = new byte[] {};
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray58, byteArray59);
        byte[] byteArray62 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\n\000\000d");
        boolean boolean64 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray59, byteArray62, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, 1, (int) '4', byteArray59, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        byte[] byteArray4 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\n\n\ufffd", byteArray4, (int) (byte) 10, 0);
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("???d", byteArray4);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray22);
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray22, true);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray31 = new byte[] {};
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray31);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, byteArray31, false);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray42 = new byte[] {};
        boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray41, byteArray42);
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray22, (int) (short) 1, (-1), byteArray41, 1, (int) (byte) 100);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean52 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray51);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean58 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray57);
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray51, byteArray57, true);
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray51, (-1));
        boolean boolean63 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, byteArray51);
        java.lang.String str64 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray22);
        boolean boolean67 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, 100, (int) (byte) 1, byteArray22, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\n\n\ufffd" + "'", str64, "\n\n\ufffd");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = new byte[] {};
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray5);
        byte[] byteArray9 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray9);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray23);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray23, true);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray9, (int) (byte) 0, (int) (byte) 0, byteArray17, (-1), (int) '4', false);
        java.lang.String str31 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray9);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray9, true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray11);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray11, true);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] {};
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray20);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray20, false);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray31 = new byte[] {};
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray31);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray11, (int) (short) 1, (-1), byteArray30, 1, (int) (byte) 100);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray46);
        boolean boolean49 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray40, byteArray46, true);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray55 = new byte[] {};
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray54, byteArray55);
        boolean boolean58 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray46, byteArray55, false);
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray46, true);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean66 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray65);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean72 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray71);
        boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray65, byteArray71, true);
        boolean boolean76 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray65, (-1));
        boolean boolean77 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray46, byteArray65);
        boolean boolean79 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray65, (int) (byte) 1);
        boolean boolean80 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray65);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray10);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray10, true);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray19 = new byte[] {};
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray19);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray19, false);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] {};
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray30);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, (int) (short) 1, (-1), byteArray29, 1, (int) (byte) 100);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray39);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("", byteArray45);
        boolean boolean48 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray45, true);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray54 = new byte[] {};
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray53, byteArray54);
        boolean boolean57 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray54, false);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray45, true);
        java.lang.String str60 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray29);
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray29, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\n\000\000d" + "'", str60, "\n\000\000d");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }
}

