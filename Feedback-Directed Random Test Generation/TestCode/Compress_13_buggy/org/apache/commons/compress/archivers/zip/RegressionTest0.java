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
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.PLATFORM_FAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        java.nio.file.attribute.FileTime fileTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry2 = zipArchiveEntry0.setLastModifiedTime(fileTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: lastModifiedTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        java.nio.file.attribute.FileTime fileTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry3 = zipArchiveEntry1.setLastModifiedTime(fileTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: lastModifiedTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
        int int2 = zipArchiveEntry0.getPlatform();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
        byte[] byteArray2 = zipArchiveEntry0.getRawName();
        java.nio.file.attribute.FileTime fileTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry4 = zipArchiveEntry0.setLastAccessTime(fileTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: lastAccessTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry0.addExtraField(zipExtraField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(file0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
        java.nio.file.attribute.FileTime fileTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry3 = zipArchiveEntry0.setLastAccessTime(fileTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: lastAccessTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        long long1 = zipArchiveEntry0.getCrc();
        zipArchiveEntry0.setUnixMode((int) (byte) 0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10 };
        zipArchiveEntry0.setExtra(byteArray6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        java.nio.file.attribute.FileTime fileTime1 = zipArchiveEntry0.getLastAccessTime();
        org.junit.Assert.assertNull(fileTime1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        long long1 = zipArchiveEntry0.getCrc();
        zipArchiveEntry0.setCrc((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        int int1 = zipArchiveEntry0.getUnixMode();
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry0.getLastAccessTime();
        boolean boolean3 = zipArchiveEntry0.isDirectory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort2);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        int int1 = zipArchiveEntry0.getUnixMode();
        boolean boolean2 = zipArchiveEntry0.isDirectory();
        zipArchiveEntry0.setTime(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setCrc((long) 1);
        org.junit.Assert.assertNull(fileTime2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        int int1 = zipArchiveEntry0.getUnixMode();
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry0.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry4 = zipArchiveEntry0.setLastModifiedTime(fileTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: lastModifiedTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(fileTime2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray3 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        int int1 = zipArchiveEntry0.getUnixMode();
        boolean boolean2 = zipArchiveEntry0.isDirectory();
        zipArchiveEntry0.setTime(0L);
        zipArchiveEntry0.setExternalAttributes((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getCreationTime();
        long long3 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setExtra();
        long long5 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
        byte[] byteArray2 = zipArchiveEntry0.getRawName();
        zipArchiveEntry0.setTime(1L);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        long long2 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        int int1 = zipArchiveEntry0.getUnixMode();
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry0.getCreationTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry0.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry5 = zipArchiveEntry0.setLastAccessTime(fileTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: lastAccessTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        int int1 = zipArchiveEntry0.getUnixMode();
        boolean boolean2 = zipArchiveEntry0.isDirectory();
        zipArchiveEntry0.setTime(0L);
        byte[] byteArray5 = zipArchiveEntry0.getRawName();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit6 = null;
        zipArchiveEntry0.setGeneralPurposeBit(generalPurposeBit6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        long long1 = zipArchiveEntry0.getCrc();
        boolean boolean2 = zipArchiveEntry0.isDirectory();
        java.nio.file.attribute.FileTime fileTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry4 = zipArchiveEntry0.setLastAccessTime(fileTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: lastAccessTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getCreationTime();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry0.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = zipArchiveEntry0.getExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry0.removeExtraField(zipShort5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(zipExtraField4);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        zipArchiveEntry0.setName("hi!");
        long long3 = zipArchiveEntry0.getCompressedSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        java.lang.Object obj1 = zipArchiveEntry0.clone();
        zipArchiveEntry0.setPlatform(100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        long long1 = zipArchiveEntry0.getCrc();
        zipArchiveEntry0.setUnixMode((int) (byte) 0);
        byte[] byteArray5 = new byte[] {};
        zipArchiveEntry0.setName("", byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry0.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }
}

