package org.apache.commons.compress.archivers.sevenz;

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
        int int0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.SIGNATURE_HEADER_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.io.File file0 = null;
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100 };
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray3, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile1 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray2, 10);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        java.lang.Class<?> wildcardClass1 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.io.File file0 = null;
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 0);
        java.lang.Class<?> wildcardClass3 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 0);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.io.File file0 = null;
        byte[] byteArray2 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 0);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) -1);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.io.File file0 = null;
        byte[] byteArray2 = new byte[] { (byte) 0 };
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, 0);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.io.File file0 = null;
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 32);
        java.lang.Class<?> wildcardClass3 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 100 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) -1);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) -1);
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) -1);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) -1);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) -1);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) 'a');
        java.lang.Class<?> wildcardClass5 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (-1));
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, 1);
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) -1);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) -1);
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (-1));
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, 1);
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) '#');
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) -1);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) 'a');
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.io.File file0 = null;
        byte[] byteArray2 = new byte[] { (byte) 0 };
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray2, (-1));
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) -1);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) 'a');
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }
}

