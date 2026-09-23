package org.apache.commons.compress.archivers.zip;

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
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray3, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray4, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100 });
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray4, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100 });
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray7, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray6, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.lang.String str1 = x7875_NewUnix0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x7875 Zip Extra Field: UID=1000 GID=1000" + "'", str1, "0x7875 Zip Extra Field: UID=1000 GID=1000");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.lang.Object obj1 = null;
        boolean boolean2 = x7875_NewUnix0.equals(obj1);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray7, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray1);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getCentralDirectoryLength();
        x7875_NewUnix0.setUID((long) (short) 10);
        byte[] byteArray5 = new byte[] { (byte) 100 };
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray5);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray6, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100 });
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray4);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x7875_NewUnix0.getCentralDirectoryLength();
        long long3 = x7875_NewUnix0.getUID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1000L + "'", long3 == 1000L);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getCentralDirectoryLength();
        x7875_NewUnix0.setUID((long) (short) 10);
        java.lang.Class<?> wildcardClass4 = x7875_NewUnix0.getClass();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix0.setGID(1000L);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix0.setUID(0L);
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix3 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x7875_NewUnix3.getCentralDirectoryLength();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        x7875_NewUnix3.parseFromCentralDirectoryData(byteArray10, (int) (short) 1, (int) (short) 0);
        byte[] byteArray14 = x7875_NewUnix3.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray14, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 2, (byte) -24, (byte) 3, (byte) 2, (byte) -24, (byte) 3 });
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray1);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray2);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getCentralDirectoryLength();
        x7875_NewUnix0.setUID((long) (short) 10);
        byte[] byteArray4 = x7875_NewUnix0.getCentralDirectoryData();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray10, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        java.lang.Object obj2 = x7875_NewUnix0.clone();
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix3 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long4 = x7875_NewUnix3.getGID();
        java.lang.Object obj5 = x7875_NewUnix3.clone();
        boolean boolean6 = x7875_NewUnix0.equals((java.lang.Object) x7875_NewUnix3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1000L + "'", long4 == 1000L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getCentralDirectoryLength();
        x7875_NewUnix0.setUID((long) (short) 10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x7875_NewUnix0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x7875_NewUnix0.getHeaderId();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.lang.Object obj1 = null;
        boolean boolean2 = x7875_NewUnix0.equals(obj1);
        long long3 = x7875_NewUnix0.getGID();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x7875_NewUnix0.getCentralDirectoryLength();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1000L + "'", long3 == 1000L);
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.lang.Object obj1 = null;
        boolean boolean2 = x7875_NewUnix0.equals(obj1);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray4, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getCentralDirectoryLength();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray7, (int) (short) 1, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x7875_NewUnix0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix12 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x7875_NewUnix12.getCentralDirectoryLength();
        x7875_NewUnix12.setUID((long) (short) 10);
        byte[] byteArray16 = x7875_NewUnix12.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray16, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.lang.Object obj1 = null;
        boolean boolean2 = x7875_NewUnix0.equals(obj1);
        x7875_NewUnix0.setUID((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getCentralDirectoryLength();
        x7875_NewUnix0.setUID((long) (short) 10);
        byte[] byteArray4 = x7875_NewUnix0.getCentralDirectoryData();
        long long5 = x7875_NewUnix0.getUID();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        long long2 = x7875_NewUnix0.getGID();
        long long3 = x7875_NewUnix0.getUID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1000L + "'", long3 == 1000L);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getCentralDirectoryLength();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray7, (int) (short) 1, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x7875_NewUnix0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x7875_NewUnix0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipShort12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(zipShort1);
    }
}

