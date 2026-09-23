package org.apache.commons.compress.compressors.bzip2;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.MAX_ALPHA_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 258 + "'", int0 == 258);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.RUNA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.G_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.N_GROUPS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.RUNB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.NUM_OVERSHOOT_BYTES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.BASEBLOCKSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100000 + "'", int0 == 100000);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream2 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream0, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No InputStream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.MAX_SELECTORS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 18002 + "'", int0 == 18002);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.N_ITERS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream2 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No InputStream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2Constants.MAX_CODE_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream1 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No InputStream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, 6);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 6);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 6);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 1);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean3 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, 20);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) '#');
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, 6);
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, 50);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 6);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 0);
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 0);
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 6);
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean3 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 100, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 100000);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 0);
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 6);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 6);
        java.lang.Class<?> wildcardClass8 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, 6);
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, 50);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 6);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) '#');
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) 'a');
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) ' ');
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray4, 6);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 0);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 4);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 4);
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 4);
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 50);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (short) 1);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        boolean boolean3 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, 6);
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, 50);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, (int) (short) 1);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 20);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 6);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray3, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 258);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) -1);
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 10);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean3 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, (int) ' ');
        boolean boolean5 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, 100000);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

