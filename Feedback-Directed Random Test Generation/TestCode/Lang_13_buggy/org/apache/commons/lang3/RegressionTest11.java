package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        long long13 = inputStream8.skip((long) 100);
        byte[] byteArray14 = inputStream8.readAllBytes();
        byte[] byteArray15 = inputStream8.readAllBytes();
        int int16 = inputStream0.read(byteArray15);
        byte[] byteArray17 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        int int6 = inputStream0.readNBytes(byteArray3, (int) (byte) 1, (int) (byte) 16);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        byte[] byteArray11 = inputStream7.readAllBytes();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int14 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        long long18 = inputStream7.skip(10L);
        boolean boolean19 = inputStream7.markSupported();
        byte[] byteArray21 = inputStream7.readNBytes((int) (byte) 124);
        int int22 = inputStream0.read(byteArray21);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int30 = inputStream23.read(byteArray29);
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark((int) (byte) 122);
        long long36 = inputStream31.skip((long) 100);
        byte[] byteArray37 = inputStream31.readAllBytes();
        byte[] byteArray38 = inputStream31.readAllBytes();
        int int39 = inputStream23.read(byteArray38);
        java.io.InputStream inputStream40 = java.io.InputStream.nullInputStream();
        boolean boolean41 = inputStream40.markSupported();
        inputStream40.mark((int) (byte) 122);
        long long45 = inputStream40.skip((long) 100);
        byte[] byteArray46 = inputStream40.readAllBytes();
        byte[] byteArray47 = inputStream40.readAllBytes();
        byte[] byteArray48 = inputStream40.readAllBytes();
        java.io.SerializablePermission serializablePermission49 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray50 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission49);
        int int51 = inputStream40.read(byteArray50);
        int int54 = inputStream23.readNBytes(byteArray50, (int) 'a', (int) '4');
        long long56 = inputStream23.skip((long) (short) 100);
        java.io.InputStream inputStream57 = java.io.InputStream.nullInputStream();
        boolean boolean58 = inputStream57.markSupported();
        inputStream57.mark((int) (byte) 122);
        long long62 = inputStream57.skip((long) 100);
        byte[] byteArray63 = inputStream57.readAllBytes();
        long long65 = inputStream57.skip((long) (short) 10);
        inputStream57.mark(1);
        byte[] byteArray68 = inputStream57.readAllBytes();
        byte[] byteArray69 = org.apache.commons.lang3.SerializationUtils.clone(byteArray68);
        byte[] byteArray70 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray69);
        int int71 = inputStream23.read(byteArray69);
        byte[] byteArray72 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray69);
        int int73 = inputStream0.read(byteArray72);
        boolean boolean74 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(inputStream57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        inputStream0.mark((int) (byte) 8);
        byte[] byteArray14 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray16 = inputStream0.readNBytes((int) 'a');
        byte[] byteArray17 = inputStream0.readAllBytes();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        boolean boolean19 = inputStream18.markSupported();
        inputStream18.mark((int) (byte) 122);
        inputStream18.mark((int) (byte) 112);
        boolean boolean24 = inputStream18.markSupported();
        boolean boolean25 = inputStream18.markSupported();
        inputStream18.mark((int) (byte) 16);
        byte[] byteArray28 = inputStream18.readAllBytes();
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = inputStream0.readNBytes(byteArray28, (int) (byte) 123, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [123, 123 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass5);
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(1);
        boolean boolean3 = inputStream0.markSupported();
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        boolean boolean5 = inputStream4.markSupported();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        byte[] byteArray10 = inputStream6.readAllBytes();
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int13 = inputStream6.read(byteArray12);
        int int14 = inputStream4.read(byteArray12);
        byte[] byteArray15 = inputStream4.readAllBytes();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray17);
        int int21 = inputStream0.readNBytes(byteArray17, (int) (short) 10, 0);
        boolean boolean22 = inputStream0.markSupported();
        byte[] byteArray23 = inputStream0.readAllBytes();
        long long25 = inputStream0.skip((long) (byte) 117);
        java.lang.ClassLoader classLoader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream27 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader26);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 115);
        byte[] byteArray7 = inputStream0.readAllBytes();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        boolean boolean12 = inputStream8.markSupported();
        long long14 = inputStream8.skip((long) (byte) 115);
        boolean boolean15 = inputStream8.markSupported();
        long long17 = inputStream8.skip((long) (byte) 122);
        boolean boolean18 = inputStream8.markSupported();
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        inputStream19.mark((int) (byte) 122);
        long long24 = inputStream19.skip((long) 100);
        byte[] byteArray25 = inputStream19.readAllBytes();
        long long27 = inputStream19.skip((long) (short) 10);
        byte[] byteArray28 = inputStream19.readAllBytes();
        boolean boolean29 = inputStream19.markSupported();
        inputStream19.mark((int) (byte) 1);
        java.io.InputStream inputStream32 = java.io.InputStream.nullInputStream();
        boolean boolean33 = inputStream32.markSupported();
        inputStream32.mark((int) (short) 10);
        long long37 = inputStream32.skip((long) 8257536);
        byte[] byteArray39 = inputStream32.readNBytes(8257536);
        byte[] byteArray41 = inputStream32.readNBytes((int) (byte) 10);
        int int42 = inputStream19.read(byteArray41);
        boolean boolean43 = inputStream19.markSupported();
        byte[] byteArray45 = inputStream19.readNBytes((int) (short) 10);
        int int46 = inputStream8.read(byteArray45);
        int int47 = inputStream0.read(byteArray45);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(inputStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(0);
        inputStream0.mark((int) (short) 100);
        inputStream0.mark(0);
        long long12 = inputStream0.skip((long) (byte) 115);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        boolean boolean17 = inputStream13.markSupported();
        long long19 = inputStream13.skip((long) (byte) 113);
        byte[] byteArray21 = inputStream13.readNBytes((int) (byte) 1);
        int int22 = inputStream0.read(byteArray21);
        inputStream0.mark((int) '4');
        long long26 = inputStream0.skip((long) 8257536);
        byte[] byteArray28 = inputStream0.readNBytes((int) (byte) 121);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        boolean boolean11 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        long long19 = inputStream14.skip((long) 100);
        byte[] byteArray20 = inputStream14.readAllBytes();
        long long22 = inputStream14.skip((long) (short) 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        byte[] byteArray32 = inputStream28.readAllBytes();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        int int38 = inputStream28.readNBytes(byteArray34, (int) '4', (int) (short) 5);
        int int39 = inputStream23.read(byteArray34);
        int int40 = inputStream14.read(byteArray34);
        int int41 = inputStream0.read(byteArray34);
        byte[] byteArray42 = inputStream0.readAllBytes();
        byte[] byteArray44 = inputStream0.readNBytes(2);
        inputStream0.mark((int) (byte) 100);
        boolean boolean47 = inputStream0.markSupported();
        byte[] byteArray49 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray51 = inputStream0.readNBytes((int) (byte) 4);
        java.io.InputStream inputStream52 = java.io.InputStream.nullInputStream();
        boolean boolean53 = inputStream52.markSupported();
        inputStream52.mark((int) (byte) 122);
        byte[] byteArray56 = inputStream52.readAllBytes();
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int59 = inputStream52.read(byteArray58);
        java.lang.Object obj60 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray58);
        byte[] byteArray61 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray58);
        byte[] byteArray62 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray61);
        int int63 = inputStream0.read(byteArray61);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (-1.0d) + "'", obj60, (-1.0d));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        long long12 = inputStream7.skip((long) 100);
        byte[] byteArray13 = inputStream7.readAllBytes();
        long long15 = inputStream7.skip((long) (short) 10);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark((int) (byte) 122);
        byte[] byteArray20 = inputStream16.readAllBytes();
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 122);
        byte[] byteArray25 = inputStream21.readAllBytes();
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj28 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray27);
        int int31 = inputStream21.readNBytes(byteArray27, (int) '4', (int) (short) 5);
        int int32 = inputStream16.read(byteArray27);
        int int33 = inputStream7.read(byteArray27);
        byte[] byteArray35 = inputStream7.readNBytes((int) '4');
        byte[] byteArray37 = inputStream7.readNBytes((int) (short) 10);
        int int38 = inputStream0.read(byteArray37);
        byte[] byteArray40 = inputStream0.readNBytes((int) '4');
        inputStream0.mark((int) (byte) 119);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0d) + "'", obj28, (-1.0d));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 120);
        long long24 = inputStream0.skip((long) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        boolean boolean26 = inputStream25.markSupported();
        inputStream25.mark((int) (byte) 122);
        long long30 = inputStream25.skip((long) 100);
        byte[] byteArray31 = inputStream25.readAllBytes();
        byte[] byteArray32 = inputStream25.readAllBytes();
        int int33 = inputStream0.read(byteArray32);
        inputStream0.mark((int) (short) 100);
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        boolean boolean37 = inputStream36.markSupported();
        inputStream36.mark((int) (byte) 122);
        long long41 = inputStream36.skip((long) 100);
        byte[] byteArray42 = inputStream36.readAllBytes();
        long long44 = inputStream36.skip((long) (short) 10);
        java.io.InputStream inputStream45 = java.io.InputStream.nullInputStream();
        boolean boolean46 = inputStream45.markSupported();
        inputStream45.mark((int) (byte) 122);
        byte[] byteArray49 = inputStream45.readAllBytes();
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        boolean boolean51 = inputStream50.markSupported();
        inputStream50.mark((int) (byte) 122);
        byte[] byteArray54 = inputStream50.readAllBytes();
        byte[] byteArray56 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj57 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray56);
        int int60 = inputStream50.readNBytes(byteArray56, (int) '4', (int) (short) 5);
        int int61 = inputStream45.read(byteArray56);
        int int62 = inputStream36.read(byteArray56);
        byte[] byteArray64 = inputStream36.readNBytes((int) '4');
        byte[] byteArray66 = inputStream36.readNBytes((int) (short) 10);
        byte[] byteArray68 = inputStream36.readNBytes((int) (short) 0);
        byte[] byteArray70 = inputStream36.readNBytes((int) (short) 10);
        int int71 = inputStream0.read(byteArray70);
        byte[] byteArray72 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int71);
        java.lang.Object obj73 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray72);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(inputStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1.0d) + "'", obj57, (-1.0d));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 0 + "'", obj73, 0);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark((int) (short) 100);
        long long11 = inputStream0.skip(10L);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        boolean boolean13 = inputStream12.markSupported();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int21 = inputStream14.read(byteArray20);
        int int22 = inputStream12.read(byteArray20);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass27 = inputStream23.getClass();
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass27);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        int int30 = inputStream12.read(byteArray28);
        boolean boolean31 = inputStream12.markSupported();
        byte[] byteArray32 = inputStream12.readAllBytes();
        inputStream12.mark(2);
        byte[] byteArray35 = inputStream12.readAllBytes();
        byte[] byteArray37 = inputStream12.readNBytes(100);
        int int38 = inputStream0.read(byteArray37);
        byte[] byteArray40 = inputStream0.readNBytes((int) (byte) 8);
        inputStream0.mark(0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        inputStream6.mark((int) (byte) 112);
        byte[] byteArray12 = inputStream6.readAllBytes();
        int int13 = inputStream0.read(byteArray12);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 121);
        long long17 = inputStream0.skip((long) (byte) 1);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        byte[] byteArray20 = inputStream18.readNBytes(1);
        inputStream18.mark(0);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        long long28 = inputStream23.skip((long) 100);
        byte[] byteArray29 = inputStream23.readAllBytes();
        long long31 = inputStream23.skip((long) (short) 10);
        byte[] byteArray33 = inputStream23.readNBytes((int) (byte) 124);
        byte[] byteArray34 = inputStream23.readAllBytes();
        int int35 = inputStream18.read(byteArray34);
        int int36 = inputStream0.read(byteArray34);
        byte[] byteArray38 = inputStream0.readNBytes((int) (byte) 114);
        long long40 = inputStream0.skip((long) '#');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        long long3 = inputStream0.skip((long) (-1));
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 16);
        byte[] byteArray8 = inputStream0.readAllBytes();
        long long10 = inputStream0.skip((long) (byte) 119);
        long long12 = inputStream0.skip(100L);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 100);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.security.Permission permission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission2);
        java.io.SerializablePermission serializablePermission4 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission4);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(permission3);
        org.junit.Assert.assertNotNull(serializablePermission4);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        byte[] byteArray7 = inputStream0.readAllBytes();
        long long9 = inputStream0.skip((long) (byte) -1);
        inputStream0.mark((int) (byte) 100);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = inputStream0.transferTo(outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (short) 10);
        long long5 = inputStream0.skip((long) 8257536);
        long long7 = inputStream0.skip((long) 1);
        long long9 = inputStream0.skip((long) (byte) 16);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark((int) (byte) 122);
        inputStream10.mark((int) (byte) 112);
        byte[] byteArray17 = inputStream10.readNBytes((int) (byte) 117);
        int int18 = inputStream0.read(byteArray17);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        long long21 = inputStream19.skip((long) 10);
        boolean boolean22 = inputStream19.markSupported();
        byte[] byteArray23 = inputStream19.readAllBytes();
        inputStream19.mark(0);
        inputStream19.mark((int) (short) 100);
        inputStream19.mark(0);
        java.io.InputStream inputStream30 = java.io.InputStream.nullInputStream();
        boolean boolean31 = inputStream30.markSupported();
        inputStream30.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass34 = inputStream30.getClass();
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass34);
        java.lang.Object obj36 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray35);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray35);
        int int40 = inputStream19.readNBytes(byteArray35, 0, (int) (short) 5);
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.clone(byteArray35);
        int int42 = inputStream0.read(byteArray35);
        byte[] byteArray43 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission1 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.io.SerializablePermission serializablePermission3 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.security.Permission permission4 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission3);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(serializablePermission1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(serializablePermission3);
        org.junit.Assert.assertNotNull(permission4);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
        java.security.BasicPermission basicPermission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.Permission permission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) basicPermission1);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone(basicPermission1);
        java.security.BasicPermission basicPermission4 = org.apache.commons.lang3.SerializationUtils.clone(basicPermission3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) basicPermission3, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(basicPermission1);
        org.junit.Assert.assertNotNull(permission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(basicPermission4);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        long long13 = inputStream8.skip((long) 100);
        byte[] byteArray14 = inputStream8.readAllBytes();
        byte[] byteArray15 = inputStream8.readAllBytes();
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        byte[] byteArray24 = inputStream17.readAllBytes();
        int int25 = inputStream0.read(byteArray24);
        byte[] byteArray27 = inputStream0.readNBytes((int) ' ');
        boolean boolean28 = inputStream0.markSupported();
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        boolean boolean30 = inputStream29.markSupported();
        inputStream29.mark((int) (byte) 122);
        byte[] byteArray33 = inputStream29.readAllBytes();
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        boolean boolean35 = inputStream34.markSupported();
        inputStream34.mark((int) (byte) 122);
        byte[] byteArray38 = inputStream34.readAllBytes();
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj41 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray40);
        int int44 = inputStream34.readNBytes(byteArray40, (int) '4', (int) (short) 5);
        int int45 = inputStream29.read(byteArray40);
        java.io.InputStream inputStream46 = java.io.InputStream.nullInputStream();
        boolean boolean47 = inputStream46.markSupported();
        inputStream46.mark((int) (byte) 122);
        boolean boolean50 = inputStream46.markSupported();
        long long52 = inputStream46.skip((long) (byte) 113);
        java.io.InputStream inputStream53 = java.io.InputStream.nullInputStream();
        boolean boolean54 = inputStream53.markSupported();
        java.io.InputStream inputStream55 = java.io.InputStream.nullInputStream();
        boolean boolean56 = inputStream55.markSupported();
        inputStream55.mark((int) (byte) 122);
        byte[] byteArray59 = inputStream55.readAllBytes();
        byte[] byteArray61 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int62 = inputStream55.read(byteArray61);
        int int63 = inputStream53.read(byteArray61);
        byte[] byteArray64 = inputStream53.readAllBytes();
        byte[] byteArray65 = org.apache.commons.lang3.SerializationUtils.clone(byteArray64);
        byte[] byteArray66 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray64);
        int int67 = inputStream46.read(byteArray66);
        int int68 = inputStream29.read(byteArray66);
        java.lang.Class<?> wildcardClass69 = byteArray66.getClass();
        byte[] byteArray70 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass69);
        int int71 = inputStream0.read(byteArray70);
        boolean boolean72 = inputStream0.markSupported();
        byte[] byteArray74 = inputStream0.readNBytes((int) (byte) 125);
        boolean boolean75 = inputStream0.markSupported();
        long long77 = inputStream0.skip((long) (byte) -1);
        inputStream0.mark((int) '4');
        inputStream0.mark((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0d) + "'", obj41, (-1.0d));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(inputStream55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 118, (byte) 114, (byte) 0, (byte) 2, (byte) 91, (byte) 66, (byte) -84, (byte) -13, (byte) 23, (byte) -8, (byte) 6, (byte) 8, (byte) 84, (byte) -32, (byte) 2, (byte) 0, (byte) 0, (byte) 120, (byte) 112 });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark((int) (byte) 122);
        byte[] byteArray9 = inputStream5.readAllBytes();
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        int int15 = inputStream5.readNBytes(byteArray11, (int) '4', (int) (short) 5);
        int int16 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        long long19 = inputStream17.skip((long) 10);
        boolean boolean20 = inputStream17.markSupported();
        byte[] byteArray21 = inputStream17.readAllBytes();
        int int22 = inputStream0.read(byteArray21);
        long long24 = inputStream0.skip((long) (short) 5);
        boolean boolean25 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip(1L);
        byte[] byteArray8 = inputStream0.readNBytes((int) (short) 0);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (byte) 122);
        byte[] byteArray15 = inputStream11.readAllBytes();
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int18 = inputStream11.read(byteArray17);
        int int19 = inputStream9.read(byteArray17);
        boolean boolean20 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 1);
        inputStream9.mark((int) (short) -1);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        boolean boolean26 = inputStream25.markSupported();
        inputStream25.mark((int) (byte) 122);
        byte[] byteArray29 = inputStream25.readAllBytes();
        inputStream25.mark(100);
        inputStream25.mark((int) (short) 100);
        inputStream25.mark((int) (byte) 117);
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        boolean boolean37 = inputStream36.markSupported();
        inputStream36.mark((int) (byte) 122);
        byte[] byteArray40 = inputStream36.readAllBytes();
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int43 = inputStream36.read(byteArray42);
        inputStream36.mark((int) (short) 100);
        long long47 = inputStream36.skip(10L);
        java.io.InputStream inputStream48 = java.io.InputStream.nullInputStream();
        boolean boolean49 = inputStream48.markSupported();
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        boolean boolean51 = inputStream50.markSupported();
        inputStream50.mark((int) (byte) 122);
        byte[] byteArray54 = inputStream50.readAllBytes();
        byte[] byteArray56 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int57 = inputStream50.read(byteArray56);
        int int58 = inputStream48.read(byteArray56);
        java.io.InputStream inputStream59 = java.io.InputStream.nullInputStream();
        boolean boolean60 = inputStream59.markSupported();
        inputStream59.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass63 = inputStream59.getClass();
        byte[] byteArray64 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass63);
        byte[] byteArray65 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray64);
        int int66 = inputStream48.read(byteArray64);
        boolean boolean67 = inputStream48.markSupported();
        byte[] byteArray68 = inputStream48.readAllBytes();
        inputStream48.mark(2);
        byte[] byteArray71 = inputStream48.readAllBytes();
        byte[] byteArray73 = inputStream48.readNBytes(100);
        int int74 = inputStream36.read(byteArray73);
        byte[] byteArray76 = inputStream36.readNBytes((int) (byte) 8);
        int int77 = inputStream25.read(byteArray76);
        int int78 = inputStream9.read(byteArray76);
        byte[] byteArray80 = inputStream9.readNBytes((int) (byte) 126);
        // The following exception was thrown during execution in test generation
        try {
            int int83 = inputStream0.readNBytes(byteArray80, (int) (byte) -1, (int) (byte) 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 120) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(inputStream59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        boolean boolean17 = inputStream0.markSupported();
        inputStream0.mark((int) '4');
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        inputStream20.mark((int) (byte) 122);
        byte[] byteArray24 = inputStream20.readAllBytes();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int27 = inputStream20.read(byteArray26);
        java.lang.Object obj28 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray26);
        java.lang.Object obj29 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray26);
        int int30 = inputStream0.read(byteArray26);
        inputStream0.mark((-1));
        byte[] byteArray34 = inputStream0.readNBytes(8257536);
        java.io.InputStream inputStream35 = java.io.InputStream.nullInputStream();
        boolean boolean36 = inputStream35.markSupported();
        inputStream35.mark((int) (byte) 122);
        long long40 = inputStream35.skip((long) 100);
        byte[] byteArray41 = inputStream35.readAllBytes();
        long long43 = inputStream35.skip((long) (short) 10);
        inputStream35.mark(1);
        boolean boolean46 = inputStream35.markSupported();
        inputStream35.mark((int) (byte) 117);
        inputStream35.mark(0);
        long long52 = inputStream35.skip((long) 0);
        java.io.InputStream inputStream53 = java.io.InputStream.nullInputStream();
        boolean boolean54 = inputStream53.markSupported();
        inputStream53.mark((int) (byte) 122);
        byte[] byteArray57 = inputStream53.readAllBytes();
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray57);
        byte[] byteArray59 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray57);
        int int60 = inputStream35.read(byteArray59);
        int int63 = inputStream0.readNBytes(byteArray59, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0d) + "'", obj28, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = inputStream0.readAllBytes();
        java.io.SerializablePermission serializablePermission9 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission9);
        int int11 = inputStream0.read(byteArray10);
        long long13 = inputStream0.skip((long) (byte) 10);
        inputStream0.mark((int) (byte) 123);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip(1L);
        byte[] byteArray8 = inputStream0.readNBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = inputStream0.readNBytes((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark((int) (byte) 122);
        byte[] byteArray31 = inputStream27.readAllBytes();
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int34 = inputStream27.read(byteArray33);
        inputStream27.mark((int) (short) 100);
        long long38 = inputStream27.skip(10L);
        java.io.InputStream inputStream39 = java.io.InputStream.nullInputStream();
        boolean boolean40 = inputStream39.markSupported();
        java.io.InputStream inputStream41 = java.io.InputStream.nullInputStream();
        boolean boolean42 = inputStream41.markSupported();
        inputStream41.mark((int) (byte) 122);
        byte[] byteArray45 = inputStream41.readAllBytes();
        byte[] byteArray47 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int48 = inputStream41.read(byteArray47);
        int int49 = inputStream39.read(byteArray47);
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        boolean boolean51 = inputStream50.markSupported();
        inputStream50.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass54 = inputStream50.getClass();
        byte[] byteArray55 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass54);
        byte[] byteArray56 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray55);
        int int57 = inputStream39.read(byteArray55);
        boolean boolean58 = inputStream39.markSupported();
        byte[] byteArray59 = inputStream39.readAllBytes();
        inputStream39.mark(2);
        byte[] byteArray62 = inputStream39.readAllBytes();
        byte[] byteArray64 = inputStream39.readNBytes(100);
        int int65 = inputStream27.read(byteArray64);
        java.io.InputStream inputStream66 = java.io.InputStream.nullInputStream();
        byte[] byteArray68 = inputStream66.readNBytes(1);
        byte[] byteArray69 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1);
        int int70 = inputStream27.read(byteArray69);
        int int71 = inputStream0.read(byteArray69);
        byte[] byteArray73 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        byte[] byteArray74 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray73);
        byte[] byteArray75 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray73);
        int int76 = inputStream0.read(byteArray75);
        boolean boolean77 = inputStream0.markSupported();
        boolean boolean78 = inputStream0.markSupported();
        long long80 = inputStream0.skip((-1L));
        java.io.OutputStream outputStream81 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long82 = inputStream0.transferTo(outputStream81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(inputStream66);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        long long13 = inputStream8.skip((long) 100);
        byte[] byteArray14 = inputStream8.readAllBytes();
        byte[] byteArray15 = inputStream8.readAllBytes();
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        byte[] byteArray24 = inputStream17.readAllBytes();
        int int25 = inputStream0.read(byteArray24);
        byte[] byteArray27 = inputStream0.readNBytes((int) ' ');
        boolean boolean28 = inputStream0.markSupported();
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        boolean boolean30 = inputStream29.markSupported();
        inputStream29.mark((int) (byte) 122);
        byte[] byteArray33 = inputStream29.readAllBytes();
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        boolean boolean35 = inputStream34.markSupported();
        inputStream34.mark((int) (byte) 122);
        byte[] byteArray38 = inputStream34.readAllBytes();
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj41 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray40);
        int int44 = inputStream34.readNBytes(byteArray40, (int) '4', (int) (short) 5);
        int int45 = inputStream29.read(byteArray40);
        java.io.InputStream inputStream46 = java.io.InputStream.nullInputStream();
        boolean boolean47 = inputStream46.markSupported();
        inputStream46.mark((int) (byte) 122);
        boolean boolean50 = inputStream46.markSupported();
        long long52 = inputStream46.skip((long) (byte) 113);
        java.io.InputStream inputStream53 = java.io.InputStream.nullInputStream();
        boolean boolean54 = inputStream53.markSupported();
        java.io.InputStream inputStream55 = java.io.InputStream.nullInputStream();
        boolean boolean56 = inputStream55.markSupported();
        inputStream55.mark((int) (byte) 122);
        byte[] byteArray59 = inputStream55.readAllBytes();
        byte[] byteArray61 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int62 = inputStream55.read(byteArray61);
        int int63 = inputStream53.read(byteArray61);
        byte[] byteArray64 = inputStream53.readAllBytes();
        byte[] byteArray65 = org.apache.commons.lang3.SerializationUtils.clone(byteArray64);
        byte[] byteArray66 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray64);
        int int67 = inputStream46.read(byteArray66);
        int int68 = inputStream29.read(byteArray66);
        java.lang.Class<?> wildcardClass69 = byteArray66.getClass();
        byte[] byteArray70 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass69);
        int int71 = inputStream0.read(byteArray70);
        boolean boolean72 = inputStream0.markSupported();
        byte[] byteArray74 = inputStream0.readNBytes((int) (byte) 125);
        boolean boolean75 = inputStream0.markSupported();
        long long77 = inputStream0.skip((long) (byte) -1);
        inputStream0.mark((int) '4');
        inputStream0.mark((int) (short) -1);
        boolean boolean82 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0d) + "'", obj41, (-1.0d));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(inputStream55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 118, (byte) 114, (byte) 0, (byte) 2, (byte) 91, (byte) 66, (byte) -84, (byte) -13, (byte) 23, (byte) -8, (byte) 6, (byte) 8, (byte) 84, (byte) -32, (byte) 2, (byte) 0, (byte) 0, (byte) 120, (byte) 112 });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission1 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.security.Permission permission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission1);
        java.security.BasicPermission basicPermission5 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission1);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(serializablePermission1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(permission3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(basicPermission5);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        inputStream0.mark((int) (byte) 112);
        boolean boolean6 = inputStream0.markSupported();
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 16);
        byte[] byteArray10 = inputStream0.readAllBytes();
        boolean boolean11 = inputStream0.markSupported();
        byte[] byteArray12 = inputStream0.readAllBytes();
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        byte[] byteArray17 = inputStream13.readAllBytes();
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int20 = inputStream13.read(byteArray19);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 122);
        byte[] byteArray25 = inputStream21.readAllBytes();
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int28 = inputStream21.read(byteArray27);
        inputStream21.mark((int) (short) 100);
        long long32 = inputStream21.skip(10L);
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        boolean boolean34 = inputStream33.markSupported();
        java.io.InputStream inputStream35 = java.io.InputStream.nullInputStream();
        boolean boolean36 = inputStream35.markSupported();
        inputStream35.mark((int) (byte) 122);
        byte[] byteArray39 = inputStream35.readAllBytes();
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int42 = inputStream35.read(byteArray41);
        int int43 = inputStream33.read(byteArray41);
        java.io.InputStream inputStream44 = java.io.InputStream.nullInputStream();
        boolean boolean45 = inputStream44.markSupported();
        inputStream44.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass48 = inputStream44.getClass();
        byte[] byteArray49 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass48);
        byte[] byteArray50 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray49);
        int int51 = inputStream33.read(byteArray49);
        boolean boolean52 = inputStream33.markSupported();
        byte[] byteArray53 = inputStream33.readAllBytes();
        inputStream33.mark(2);
        byte[] byteArray56 = inputStream33.readAllBytes();
        byte[] byteArray58 = inputStream33.readNBytes(100);
        int int59 = inputStream21.read(byteArray58);
        byte[] byteArray61 = inputStream21.readNBytes((int) (byte) 8);
        int int62 = inputStream13.read(byteArray61);
        byte[] byteArray63 = inputStream13.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int66 = inputStream0.readNBytes(byteArray63, (int) (byte) 120, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [120, 120 + 1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(inputStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int10 = inputStream0.readNBytes(byteArray7, (int) (byte) 4, (int) (byte) 16);
        boolean boolean11 = inputStream0.markSupported();
        long long13 = inputStream0.skip(1L);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 118);
        long long17 = inputStream0.skip((long) (byte) 118);
        inputStream0.mark((int) (short) 1);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = inputStream0.transferTo(outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        byte[] byteArray11 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 118);
        boolean boolean14 = inputStream0.markSupported();
        long long16 = inputStream0.skip((long) (byte) 100);
        long long18 = inputStream0.skip((long) (byte) 120);
        byte[] byteArray20 = inputStream0.readNBytes((int) (byte) 117);
        java.lang.Class<?> wildcardClass21 = byteArray20.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        long long28 = inputStream0.skip((long) (byte) 126);
        inputStream0.mark((int) (byte) 113);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        byte[] byteArray9 = inputStream0.readAllBytes();
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark((int) (byte) 122);
        byte[] byteArray14 = inputStream10.readAllBytes();
        byte[] byteArray15 = inputStream10.readAllBytes();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        int int17 = inputStream0.read(byteArray15);
        long long19 = inputStream0.skip((long) (short) -1);
        byte[] byteArray21 = inputStream0.readNBytes(8257536);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark((int) (byte) 122);
        inputStream22.mark((int) (byte) 112);
        boolean boolean28 = inputStream22.markSupported();
        inputStream22.mark((int) (byte) 124);
        byte[] byteArray31 = inputStream22.readAllBytes();
        byte[] byteArray32 = inputStream22.readAllBytes();
        inputStream22.mark((int) (byte) 10);
        byte[] byteArray35 = inputStream22.readAllBytes();
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray35);
        int int39 = inputStream0.readNBytes(byteArray36, (int) (byte) 1, 10);
        boolean boolean40 = inputStream0.markSupported();
        boolean boolean41 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 115);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        byte[] byteArray10 = inputStream0.readAllBytes();
        long long12 = inputStream0.skip((long) 'a');
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        boolean boolean17 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 4);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark((int) (byte) 122);
        byte[] byteArray26 = inputStream22.readAllBytes();
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int29 = inputStream22.read(byteArray28);
        int int30 = inputStream20.read(byteArray28);
        byte[] byteArray31 = inputStream20.readAllBytes();
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.clone(byteArray31);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray31);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray33);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray34);
        java.lang.Object obj36 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray35);
        java.lang.Object obj37 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray35);
        int int38 = inputStream13.read(byteArray35);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray35);
        int int40 = inputStream0.read(byteArray39);
        java.lang.Class<?> wildcardClass41 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        byte[] byteArray28 = inputStream0.readNBytes((int) '4');
        byte[] byteArray30 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray32 = inputStream0.readNBytes(10);
        byte[] byteArray33 = inputStream0.readAllBytes();
        boolean boolean34 = inputStream0.markSupported();
        boolean boolean35 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        inputStream6.mark((int) (byte) 112);
        byte[] byteArray12 = inputStream6.readAllBytes();
        int int13 = inputStream0.read(byteArray12);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 121);
        long long17 = inputStream0.skip((long) (byte) 1);
        byte[] byteArray18 = inputStream0.readAllBytes();
        java.io.Serializable serializable19 = null;
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize(serializable19);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize(serializable19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize(serializable19);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = inputStream0.readNBytes(byteArray22, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [52, 52 + -1) out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 120);
        long long24 = inputStream0.skip((long) (byte) 0);
        java.lang.Class<?> wildcardClass25 = inputStream0.getClass();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray26);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class java.io.InputStream$1");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(0);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 10);
        byte[] byteArray11 = inputStream0.readNBytes((int) (byte) 115);
        boolean boolean12 = inputStream0.markSupported();
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = inputStream0.transferTo(outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        byte[] byteArray9 = inputStream0.readAllBytes();
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark((int) (byte) 122);
        byte[] byteArray14 = inputStream10.readAllBytes();
        byte[] byteArray15 = inputStream10.readAllBytes();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        int int17 = inputStream0.read(byteArray15);
        long long19 = inputStream0.skip((long) (short) -1);
        inputStream0.mark((int) (byte) 124);
        long long23 = inputStream0.skip((long) (byte) 122);
        java.lang.Class<?> wildcardClass24 = inputStream0.getClass();
        java.lang.Class<?> wildcardClass25 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass24);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        byte[] byteArray27 = inputStream0.readAllBytes();
        boolean boolean28 = inputStream0.markSupported();
        byte[] byteArray30 = inputStream0.readNBytes((int) 'a');
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a', outputStream31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        inputStream6.mark((int) (byte) 112);
        byte[] byteArray12 = inputStream6.readAllBytes();
        int int13 = inputStream0.read(byteArray12);
        byte[] byteArray14 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = inputStream0.transferTo(outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark(2);
        byte[] byteArray24 = inputStream0.readNBytes(0);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        long long3 = inputStream0.skip((long) (-1));
        long long5 = inputStream0.skip((long) 8257536);
        byte[] byteArray7 = inputStream0.readNBytes((int) (byte) 117);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 117, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark((int) (byte) 122);
        byte[] byteArray9 = inputStream5.readAllBytes();
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        int int15 = inputStream5.readNBytes(byteArray11, (int) '4', (int) (short) 5);
        int int16 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        boolean boolean21 = inputStream17.markSupported();
        long long23 = inputStream17.skip((long) (byte) 113);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        inputStream26.mark((int) (byte) 122);
        byte[] byteArray30 = inputStream26.readAllBytes();
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int33 = inputStream26.read(byteArray32);
        int int34 = inputStream24.read(byteArray32);
        byte[] byteArray35 = inputStream24.readAllBytes();
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.clone(byteArray35);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray35);
        int int38 = inputStream17.read(byteArray37);
        int int39 = inputStream0.read(byteArray37);
        boolean boolean40 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 8);
        boolean boolean43 = inputStream0.markSupported();
        boolean boolean44 = inputStream0.markSupported();
        byte[] byteArray45 = inputStream0.readAllBytes();
        byte[] byteArray47 = inputStream0.readNBytes((int) (byte) 113);
        long long49 = inputStream0.skip(100L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        byte[] byteArray8 = inputStream0.readNBytes(100);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        inputStream0.mark((int) (byte) 112);
        boolean boolean6 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray9 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 126);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        boolean boolean13 = inputStream12.markSupported();
        inputStream12.mark((int) (byte) 122);
        byte[] byteArray16 = inputStream12.readAllBytes();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj19 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
        int int22 = inputStream12.readNBytes(byteArray18, (int) '4', (int) (short) 5);
        inputStream12.mark((int) (byte) 8);
        byte[] byteArray25 = inputStream12.readAllBytes();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.clone(byteArray26);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray27);
        int int29 = inputStream0.read(byteArray27);
        boolean boolean30 = inputStream0.markSupported();
        boolean boolean31 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 113);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 1);
        boolean boolean9 = inputStream0.markSupported();
        long long11 = inputStream0.skip((long) (byte) 122);
        java.lang.ClassLoader classLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream13 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader12);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (byte) 121);
        long long10 = inputStream0.skip((long) 8257536);
        long long12 = inputStream0.skip((long) (byte) 114);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 126);
        inputStream0.mark((int) (short) 100);
        byte[] byteArray17 = inputStream0.readAllBytes();
        boolean boolean18 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        byte[] byteArray17 = inputStream0.readAllBytes();
        byte[] byteArray19 = inputStream0.readNBytes((int) '4');
        byte[] byteArray21 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        byte[] byteArray24 = inputStream22.readNBytes(1);
        byte[] byteArray26 = inputStream22.readNBytes((int) (byte) 8);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.clone(byteArray26);
        int int28 = inputStream0.read(byteArray27);
        long long30 = inputStream0.skip((long) (byte) 8);
        byte[] byteArray32 = inputStream0.readNBytes((int) '#');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        inputStream0.mark(0);
        inputStream0.mark((int) (byte) 116);
        long long11 = inputStream0.skip((long) '4');
        byte[] byteArray13 = inputStream0.readNBytes((int) (short) 1);
        boolean boolean14 = inputStream0.markSupported();
        byte[] byteArray16 = inputStream0.readNBytes((int) (byte) 116);
        byte[] byteArray17 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 120);
        long long24 = inputStream0.skip((long) (byte) 0);
        inputStream0.mark(0);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark((int) (byte) 122);
        inputStream27.mark((int) (byte) 112);
        inputStream27.mark(0);
        inputStream27.mark((int) (byte) 122);
        java.io.InputStream inputStream37 = java.io.InputStream.nullInputStream();
        boolean boolean38 = inputStream37.markSupported();
        inputStream37.mark((int) (short) 10);
        long long42 = inputStream37.skip((long) 8257536);
        byte[] byteArray43 = inputStream37.readAllBytes();
        int int44 = inputStream27.read(byteArray43);
        long long46 = inputStream27.skip((long) (byte) 16);
        byte[] byteArray48 = inputStream27.readNBytes((int) (byte) 122);
        int int49 = inputStream0.read(byteArray48);
        long long51 = inputStream0.skip((long) (short) 0);
        byte[] byteArray53 = inputStream0.readNBytes((int) (byte) 0);
        java.lang.Class<?> wildcardClass54 = inputStream0.getClass();
        java.io.OutputStream outputStream55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass54, outputStream55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        inputStream0.mark((int) (byte) 112);
        boolean boolean6 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray9 = inputStream0.readAllBytes();
        byte[] byteArray10 = inputStream0.readAllBytes();
        byte[] byteArray12 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray13 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark(2);
        byte[] byteArray24 = inputStream0.readNBytes(0);
        byte[] byteArray26 = inputStream0.readNBytes((int) (short) 5);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = inputStream0.transferTo(outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 115);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        byte[] byteArray10 = inputStream0.readAllBytes();
        long long12 = inputStream0.skip((long) 'a');
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark((int) (byte) 122);
        byte[] byteArray19 = inputStream15.readAllBytes();
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int22 = inputStream15.read(byteArray21);
        int int23 = inputStream13.read(byteArray21);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        inputStream24.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass28 = inputStream24.getClass();
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass28);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray29);
        int int31 = inputStream13.read(byteArray29);
        boolean boolean32 = inputStream13.markSupported();
        byte[] byteArray33 = inputStream13.readAllBytes();
        inputStream13.mark(2);
        byte[] byteArray36 = inputStream13.readAllBytes();
        byte[] byteArray38 = inputStream13.readNBytes(100);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray38);
        int int40 = inputStream0.read(byteArray38);
        java.io.OutputStream outputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long42 = inputStream0.transferTo(outputStream41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = inputStream0.readAllBytes();
        java.io.SerializablePermission serializablePermission9 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission9);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray15);
        int int17 = inputStream0.read(byteArray15);
        inputStream0.mark((int) (short) 0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        boolean boolean27 = inputStream0.markSupported();
        long long29 = inputStream0.skip(10L);
        long long31 = inputStream0.skip((long) '#');
        java.io.InputStream inputStream32 = java.io.InputStream.nullInputStream();
        boolean boolean33 = inputStream32.markSupported();
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        boolean boolean35 = inputStream34.markSupported();
        inputStream34.mark((int) (byte) 122);
        byte[] byteArray38 = inputStream34.readAllBytes();
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int41 = inputStream34.read(byteArray40);
        int int42 = inputStream32.read(byteArray40);
        byte[] byteArray43 = inputStream32.readAllBytes();
        byte[] byteArray44 = inputStream32.readAllBytes();
        byte[] byteArray45 = inputStream32.readAllBytes();
        byte[] byteArray46 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = inputStream0.readNBytes(byteArray46, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 100) out of bounds for length 27");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(inputStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray46);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1.0d) + "'", obj2, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class java.lang.Double");
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int10 = inputStream0.readNBytes(byteArray7, (int) (byte) 4, (int) (byte) 16);
        boolean boolean11 = inputStream0.markSupported();
        long long13 = inputStream0.skip(1L);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 118);
        long long17 = inputStream0.skip((long) (byte) 118);
        byte[] byteArray18 = inputStream0.readAllBytes();
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18, outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission1 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.io.SerializablePermission serializablePermission3 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.io.SerializablePermission serializablePermission4 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.security.Permission permission5 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission4);
        java.io.SerializablePermission serializablePermission6 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission4);
        java.io.SerializablePermission serializablePermission7 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission4);
        java.security.BasicPermission basicPermission8 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission7);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(serializablePermission1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(serializablePermission3);
        org.junit.Assert.assertNotNull(serializablePermission4);
        org.junit.Assert.assertNotNull(permission5);
        org.junit.Assert.assertNotNull(serializablePermission6);
        org.junit.Assert.assertNotNull(serializablePermission7);
        org.junit.Assert.assertNotNull(basicPermission8);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(0);
        inputStream0.mark((int) (byte) 4);
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark((int) (byte) 122);
        inputStream5.mark((int) (byte) 112);
        inputStream5.mark(0);
        inputStream5.mark((int) (byte) 122);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark((int) (short) 10);
        long long20 = inputStream15.skip((long) 8257536);
        byte[] byteArray21 = inputStream15.readAllBytes();
        int int22 = inputStream5.read(byteArray21);
        long long24 = inputStream5.skip((long) (byte) 16);
        byte[] byteArray26 = inputStream5.readNBytes((int) (byte) 122);
        int int29 = inputStream0.readNBytes(byteArray26, 0, (int) (short) 0);
        boolean boolean30 = inputStream0.markSupported();
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark((int) (byte) 122);
        byte[] byteArray35 = inputStream31.readAllBytes();
        long long37 = inputStream31.skip((long) (byte) 100);
        long long39 = inputStream31.skip(0L);
        byte[] byteArray41 = inputStream31.readNBytes((int) (byte) 16);
        long long43 = inputStream31.skip((long) 'a');
        byte[] byteArray44 = inputStream31.readAllBytes();
        int int45 = inputStream0.read(byteArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        inputStream0.mark((int) (byte) 8);
        byte[] byteArray14 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray15 = inputStream0.readAllBytes();
        long long17 = inputStream0.skip((long) (byte) 120);
        inputStream0.mark((int) (byte) 112);
        long long21 = inputStream0.skip((long) (byte) 121);
        boolean boolean22 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(1);
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        boolean boolean4 = inputStream3.markSupported();
        inputStream3.mark((int) (byte) 122);
        inputStream3.mark((int) (byte) 112);
        boolean boolean9 = inputStream3.markSupported();
        boolean boolean10 = inputStream3.markSupported();
        boolean boolean11 = inputStream3.markSupported();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        int int15 = inputStream3.read(byteArray13);
        int int16 = inputStream0.read(byteArray13);
        long long18 = inputStream0.skip((long) (byte) 10);
        inputStream0.mark((int) (byte) 121);
        byte[] byteArray21 = inputStream0.readAllBytes();
        byte[] byteArray22 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 120);
        boolean boolean23 = inputStream0.markSupported();
        byte[] byteArray24 = inputStream0.readAllBytes();
        byte[] byteArray26 = inputStream0.readNBytes(0);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = inputStream0.transferTo(outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        long long12 = inputStream7.skip((long) 100);
        byte[] byteArray13 = inputStream7.readAllBytes();
        long long15 = inputStream7.skip((long) (short) 10);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark((int) (byte) 122);
        byte[] byteArray20 = inputStream16.readAllBytes();
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 122);
        byte[] byteArray25 = inputStream21.readAllBytes();
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj28 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray27);
        int int31 = inputStream21.readNBytes(byteArray27, (int) '4', (int) (short) 5);
        int int32 = inputStream16.read(byteArray27);
        int int33 = inputStream7.read(byteArray27);
        byte[] byteArray35 = inputStream7.readNBytes((int) '4');
        byte[] byteArray37 = inputStream7.readNBytes((int) (short) 10);
        int int38 = inputStream0.read(byteArray37);
        byte[] byteArray39 = inputStream0.readAllBytes();
        byte[] byteArray41 = inputStream0.readNBytes(8257536);
        byte[] byteArray43 = inputStream0.readNBytes((int) '#');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0d) + "'", obj28, (-1.0d));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(2);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (byte) 122);
        byte[] byteArray15 = inputStream11.readAllBytes();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        int int18 = inputStream0.read(byteArray17);
        byte[] byteArray19 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int10 = inputStream0.readNBytes(byteArray7, (int) (byte) 4, (int) (byte) 16);
        boolean boolean11 = inputStream0.markSupported();
        byte[] byteArray12 = inputStream0.readAllBytes();
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 122);
        boolean boolean15 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        byte[] byteArray17 = inputStream0.readAllBytes();
        byte[] byteArray19 = inputStream0.readNBytes((int) '4');
        byte[] byteArray21 = inputStream0.readNBytes((int) (byte) 125);
        boolean boolean22 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        byte[] byteArray19 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 118);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        inputStream0.mark(0);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        long long13 = inputStream8.skip((long) 100);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        inputStream14.mark((int) (byte) 112);
        byte[] byteArray20 = inputStream14.readAllBytes();
        int int21 = inputStream8.read(byteArray20);
        byte[] byteArray23 = inputStream8.readNBytes((int) (byte) 121);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray23);
        int int25 = inputStream0.read(byteArray23);
        long long27 = inputStream0.skip(0L);
        long long29 = inputStream0.skip((long) 2);
        long long31 = inputStream0.skip((long) (byte) 117);
        inputStream0.mark(100);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark((int) (short) 100);
        long long11 = inputStream0.skip(10L);
        boolean boolean12 = inputStream0.markSupported();
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 124);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark((int) (byte) 122);
        byte[] byteArray19 = inputStream15.readAllBytes();
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int22 = inputStream15.read(byteArray21);
        int int23 = inputStream0.read(byteArray21);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        inputStream24.mark((int) (byte) 122);
        inputStream24.mark((int) (byte) 112);
        boolean boolean30 = inputStream24.markSupported();
        boolean boolean31 = inputStream24.markSupported();
        byte[] byteArray32 = inputStream24.readAllBytes();
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray32);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray33);
        int int35 = inputStream0.read(byteArray34);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 118);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        inputStream7.mark((int) (byte) 112);
        boolean boolean13 = inputStream7.markSupported();
        boolean boolean14 = inputStream7.markSupported();
        boolean boolean15 = inputStream7.markSupported();
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray17);
        int int19 = inputStream7.read(byteArray17);
        int int20 = inputStream0.read(byteArray17);
        boolean boolean21 = inputStream0.markSupported();
        long long23 = inputStream0.skip((long) 1);
        boolean boolean24 = inputStream0.markSupported();
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = inputStream0.transferTo(outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        byte[] byteArray12 = inputStream0.readNBytes((int) (byte) 4);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        byte[] byteArray17 = inputStream13.readAllBytes();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        boolean boolean19 = inputStream18.markSupported();
        inputStream18.mark((int) (byte) 122);
        byte[] byteArray22 = inputStream18.readAllBytes();
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        int int28 = inputStream18.readNBytes(byteArray24, (int) '4', (int) (short) 5);
        int int29 = inputStream13.read(byteArray24);
        java.io.InputStream inputStream30 = java.io.InputStream.nullInputStream();
        boolean boolean31 = inputStream30.markSupported();
        inputStream30.mark((int) (byte) 122);
        boolean boolean34 = inputStream30.markSupported();
        long long36 = inputStream30.skip((long) (byte) 113);
        java.io.InputStream inputStream37 = java.io.InputStream.nullInputStream();
        boolean boolean38 = inputStream37.markSupported();
        java.io.InputStream inputStream39 = java.io.InputStream.nullInputStream();
        boolean boolean40 = inputStream39.markSupported();
        inputStream39.mark((int) (byte) 122);
        byte[] byteArray43 = inputStream39.readAllBytes();
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int46 = inputStream39.read(byteArray45);
        int int47 = inputStream37.read(byteArray45);
        byte[] byteArray48 = inputStream37.readAllBytes();
        byte[] byteArray49 = org.apache.commons.lang3.SerializationUtils.clone(byteArray48);
        byte[] byteArray50 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray48);
        int int51 = inputStream30.read(byteArray50);
        int int52 = inputStream13.read(byteArray50);
        int int53 = inputStream0.read(byteArray50);
        byte[] byteArray54 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray50);
        java.lang.Class<?> wildcardClass55 = byteArray54.getClass();
        java.io.OutputStream outputStream56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass55, outputStream56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (short) 10);
        long long5 = inputStream0.skip((long) 8257536);
        byte[] byteArray7 = inputStream0.readNBytes(8257536);
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 10);
        byte[] byteArray11 = inputStream0.readNBytes((int) (byte) 116);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 124);
        byte[] byteArray15 = inputStream0.readNBytes(8257536);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass4 = inputStream0.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        long long25 = inputStream17.skip((long) (short) 10);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        inputStream26.mark((int) (byte) 122);
        byte[] byteArray30 = inputStream26.readAllBytes();
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark((int) (byte) 122);
        byte[] byteArray35 = inputStream31.readAllBytes();
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray37);
        int int41 = inputStream31.readNBytes(byteArray37, (int) '4', (int) (short) 5);
        int int42 = inputStream26.read(byteArray37);
        int int43 = inputStream17.read(byteArray37);
        byte[] byteArray45 = inputStream17.readNBytes((int) '4');
        byte[] byteArray47 = inputStream17.readNBytes((int) '#');
        int int48 = inputStream0.read(byteArray47);
        long long50 = inputStream0.skip((long) 8257536);
        byte[] byteArray52 = inputStream0.readNBytes((int) (byte) 114);
        byte[] byteArray53 = inputStream0.readAllBytes();
        byte[] byteArray55 = inputStream0.readNBytes((int) (short) 100);
        inputStream0.mark((int) (byte) 115);
        java.io.SerializablePermission serializablePermission58 = java.io.ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
        java.security.BasicPermission basicPermission59 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission58);
        java.security.Permission permission60 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission58);
        byte[] byteArray61 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission58);
        java.security.BasicPermission basicPermission62 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission58);
        byte[] byteArray63 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) basicPermission62);
        java.lang.Object obj64 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray63);
        int int67 = inputStream0.readNBytes(byteArray63, (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (-1.0d) + "'", obj38, (-1.0d));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission58);
        org.junit.Assert.assertNotNull(basicPermission59);
        org.junit.Assert.assertNotNull(permission60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(basicPermission62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "(\"java.io.SerializablePermission\" \"enableSubclassImplementation\")");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "(\"java.io.SerializablePermission\" \"enableSubclassImplementation\")");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "(\"java.io.SerializablePermission\" \"enableSubclassImplementation\")");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0L);
        java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray9);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray9);
        int int12 = inputStream0.read(byteArray11);
        long long14 = inputStream0.skip((long) 100);
        byte[] byteArray16 = inputStream0.readNBytes((int) (byte) 126);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0f);
        int int21 = inputStream0.readNBytes(byteArray18, (int) (byte) 1, (int) '4');
        long long23 = inputStream0.skip((long) (byte) 8);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0L + "'", obj10, 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        long long18 = inputStream0.skip((long) 1);
        byte[] byteArray20 = inputStream0.readNBytes((int) (byte) 0);
        byte[] byteArray21 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 1);
        byte[] byteArray25 = inputStream0.readNBytes((int) (byte) 123);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 115);
        inputStream0.mark((int) (byte) 0);
        byte[] byteArray10 = inputStream0.readNBytes((int) (byte) 120);
        byte[] byteArray11 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass12 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark((int) (short) 100);
        long long11 = inputStream0.skip(10L);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 112);
        byte[] byteArray15 = inputStream0.readNBytes(100);
        inputStream0.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        byte[] byteArray4 = inputStream0.readNBytes(0);
        boolean boolean5 = inputStream0.markSupported();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        byte[] byteArray10 = inputStream6.readAllBytes();
        long long12 = inputStream6.skip((long) (byte) 100);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        boolean boolean17 = inputStream13.markSupported();
        long long19 = inputStream13.skip((long) (byte) 113);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark((int) (byte) 122);
        byte[] byteArray26 = inputStream22.readAllBytes();
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int29 = inputStream22.read(byteArray28);
        int int30 = inputStream20.read(byteArray28);
        byte[] byteArray31 = inputStream20.readAllBytes();
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.clone(byteArray31);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray31);
        int int34 = inputStream13.read(byteArray33);
        int int35 = inputStream6.read(byteArray33);
        int int36 = inputStream0.read(byteArray33);
        long long38 = inputStream0.skip((long) (short) -1);
        inputStream0.mark((int) (short) -21267);
        inputStream0.mark((int) (byte) 4);
        boolean boolean43 = inputStream0.markSupported();
        inputStream0.mark(100);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        byte[] byteArray28 = inputStream0.readNBytes((int) '4');
        byte[] byteArray30 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray32 = inputStream0.readNBytes((int) '4');
        byte[] byteArray34 = inputStream0.readNBytes(8257536);
        long long36 = inputStream0.skip((long) (short) 100);
        boolean boolean37 = inputStream0.markSupported();
        byte[] byteArray38 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        inputStream0.mark((int) (byte) 8);
        byte[] byteArray14 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray15 = inputStream0.readAllBytes();
        byte[] byteArray16 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 115);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray5 = inputStream0.readNBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        boolean boolean11 = inputStream7.markSupported();
        long long13 = inputStream7.skip((long) (byte) 113);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark((int) (byte) 122);
        byte[] byteArray20 = inputStream16.readAllBytes();
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int23 = inputStream16.read(byteArray22);
        int int24 = inputStream14.read(byteArray22);
        byte[] byteArray25 = inputStream14.readAllBytes();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.clone(byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        int int28 = inputStream7.read(byteArray27);
        int int29 = inputStream0.read(byteArray27);
        inputStream0.mark((int) (short) 1);
        java.lang.ClassLoader classLoader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream33 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader32);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        byte[] byteArray4 = inputStream0.readNBytes(0);
        boolean boolean5 = inputStream0.markSupported();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        byte[] byteArray10 = inputStream6.readAllBytes();
        long long12 = inputStream6.skip((long) (byte) 100);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        boolean boolean17 = inputStream13.markSupported();
        long long19 = inputStream13.skip((long) (byte) 113);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark((int) (byte) 122);
        byte[] byteArray26 = inputStream22.readAllBytes();
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int29 = inputStream22.read(byteArray28);
        int int30 = inputStream20.read(byteArray28);
        byte[] byteArray31 = inputStream20.readAllBytes();
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.clone(byteArray31);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray31);
        int int34 = inputStream13.read(byteArray33);
        int int35 = inputStream6.read(byteArray33);
        int int36 = inputStream0.read(byteArray33);
        long long38 = inputStream0.skip((long) (short) -1);
        inputStream0.mark((int) (short) -21267);
        inputStream0.mark((int) (byte) 4);
        byte[] byteArray44 = inputStream0.readNBytes((int) (byte) 115);
        byte[] byteArray46 = inputStream0.readNBytes((int) 'a');
        java.lang.ClassLoader classLoader47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream48 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader47);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        byte[] byteArray28 = inputStream0.readNBytes((int) '4');
        byte[] byteArray30 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray32 = inputStream0.readNBytes((int) (short) 0);
        byte[] byteArray34 = inputStream0.readNBytes((int) (short) 10);
        long long36 = inputStream0.skip((long) (byte) 8);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        byte[] byteArray4 = inputStream0.readNBytes(0);
        boolean boolean5 = inputStream0.markSupported();
        java.lang.Class<?> wildcardClass6 = inputStream0.getClass();
        java.lang.Class<?> wildcardClass7 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass6);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 113);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        long long14 = inputStream9.skip((long) 100);
        byte[] byteArray15 = inputStream9.readAllBytes();
        long long17 = inputStream9.skip((long) (short) 10);
        byte[] byteArray18 = inputStream9.readAllBytes();
        byte[] byteArray19 = inputStream9.readAllBytes();
        int int20 = inputStream0.read(byteArray19);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        boolean boolean27 = inputStream0.markSupported();
        byte[] byteArray28 = inputStream0.readAllBytes();
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 119);
        byte[] byteArray32 = inputStream0.readNBytes((int) (byte) 8);
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        boolean boolean34 = inputStream33.markSupported();
        inputStream33.mark((int) (byte) 122);
        byte[] byteArray37 = inputStream33.readAllBytes();
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int40 = inputStream33.read(byteArray39);
        inputStream33.mark((int) (short) 100);
        long long44 = inputStream33.skip(10L);
        java.io.InputStream inputStream45 = java.io.InputStream.nullInputStream();
        boolean boolean46 = inputStream45.markSupported();
        java.io.InputStream inputStream47 = java.io.InputStream.nullInputStream();
        boolean boolean48 = inputStream47.markSupported();
        inputStream47.mark((int) (byte) 122);
        byte[] byteArray51 = inputStream47.readAllBytes();
        byte[] byteArray53 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int54 = inputStream47.read(byteArray53);
        int int55 = inputStream45.read(byteArray53);
        java.io.InputStream inputStream56 = java.io.InputStream.nullInputStream();
        boolean boolean57 = inputStream56.markSupported();
        inputStream56.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass60 = inputStream56.getClass();
        byte[] byteArray61 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass60);
        byte[] byteArray62 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray61);
        int int63 = inputStream45.read(byteArray61);
        boolean boolean64 = inputStream45.markSupported();
        byte[] byteArray65 = inputStream45.readAllBytes();
        inputStream45.mark(2);
        byte[] byteArray68 = inputStream45.readAllBytes();
        byte[] byteArray70 = inputStream45.readNBytes(100);
        int int71 = inputStream33.read(byteArray70);
        java.io.InputStream inputStream72 = java.io.InputStream.nullInputStream();
        byte[] byteArray74 = inputStream72.readNBytes(1);
        byte[] byteArray75 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1);
        int int76 = inputStream33.read(byteArray75);
        boolean boolean77 = inputStream33.markSupported();
        boolean boolean78 = inputStream33.markSupported();
        inputStream33.mark(0);
        byte[] byteArray81 = inputStream33.readAllBytes();
        byte[] byteArray82 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray81);
        int int83 = inputStream0.read(byteArray81);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(inputStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(inputStream47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(inputStream72);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) -1);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        boolean boolean11 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        long long19 = inputStream14.skip((long) 100);
        byte[] byteArray20 = inputStream14.readAllBytes();
        long long22 = inputStream14.skip((long) (short) 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        byte[] byteArray32 = inputStream28.readAllBytes();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        int int38 = inputStream28.readNBytes(byteArray34, (int) '4', (int) (short) 5);
        int int39 = inputStream23.read(byteArray34);
        int int40 = inputStream14.read(byteArray34);
        int int41 = inputStream0.read(byteArray34);
        byte[] byteArray42 = inputStream0.readAllBytes();
        java.io.InputStream inputStream43 = java.io.InputStream.nullInputStream();
        boolean boolean44 = inputStream43.markSupported();
        inputStream43.mark((int) (byte) 122);
        long long48 = inputStream43.skip((long) 100);
        byte[] byteArray49 = inputStream43.readAllBytes();
        inputStream43.mark((int) (byte) 115);
        java.io.InputStream inputStream52 = java.io.InputStream.nullInputStream();
        boolean boolean53 = inputStream52.markSupported();
        inputStream52.mark((int) (byte) 122);
        byte[] byteArray56 = inputStream52.readAllBytes();
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj59 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray58);
        int int62 = inputStream52.readNBytes(byteArray58, (int) '4', (int) (short) 5);
        byte[] byteArray63 = org.apache.commons.lang3.SerializationUtils.clone(byteArray58);
        java.lang.Object obj64 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray63);
        int int65 = inputStream43.read(byteArray63);
        int int68 = inputStream0.readNBytes(byteArray63, (int) (short) 5, (int) (byte) 0);
        java.lang.Object obj69 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray63);
        byte[] byteArray70 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray63);
        java.lang.Object obj71 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray63);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1.0d) + "'", obj59, (-1.0d));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (-1.0d) + "'", obj64, (-1.0d));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (-1.0d) + "'", obj69, (-1.0d));
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (-1.0d) + "'", obj71, (-1.0d));
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        byte[] byteArray7 = inputStream0.readAllBytes();
        boolean boolean8 = inputStream0.markSupported();
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 118);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        byte[] byteArray4 = inputStream0.readNBytes(0);
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark((int) (byte) 122);
        inputStream5.mark((int) (byte) 112);
        boolean boolean11 = inputStream5.markSupported();
        boolean boolean12 = inputStream5.markSupported();
        byte[] byteArray13 = inputStream5.readAllBytes();
        int int14 = inputStream0.read(byteArray13);
        byte[] byteArray16 = inputStream0.readNBytes(8257536);
        long long18 = inputStream0.skip((long) (byte) 118);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark((int) (byte) 122);
        byte[] byteArray9 = inputStream5.readAllBytes();
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        int int15 = inputStream5.readNBytes(byteArray11, (int) '4', (int) (short) 5);
        int int16 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        boolean boolean21 = inputStream17.markSupported();
        long long23 = inputStream17.skip((long) (byte) 113);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        inputStream26.mark((int) (byte) 122);
        byte[] byteArray30 = inputStream26.readAllBytes();
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int33 = inputStream26.read(byteArray32);
        int int34 = inputStream24.read(byteArray32);
        byte[] byteArray35 = inputStream24.readAllBytes();
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.clone(byteArray35);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray35);
        int int38 = inputStream17.read(byteArray37);
        int int39 = inputStream0.read(byteArray37);
        byte[] byteArray41 = inputStream0.readNBytes((int) (byte) 114);
        inputStream0.mark((int) (byte) -1);
        inputStream0.mark(0);
        java.io.InputStream inputStream46 = java.io.InputStream.nullInputStream();
        long long48 = inputStream46.skip((long) 10);
        boolean boolean49 = inputStream46.markSupported();
        byte[] byteArray50 = inputStream46.readAllBytes();
        inputStream46.mark(0);
        inputStream46.mark((int) (short) 100);
        inputStream46.mark(0);
        long long58 = inputStream46.skip((long) (byte) 115);
        java.io.InputStream inputStream59 = java.io.InputStream.nullInputStream();
        boolean boolean60 = inputStream59.markSupported();
        inputStream59.mark((int) (byte) 122);
        boolean boolean63 = inputStream59.markSupported();
        long long65 = inputStream59.skip((long) (byte) 113);
        byte[] byteArray67 = inputStream59.readNBytes((int) (byte) 1);
        int int68 = inputStream46.read(byteArray67);
        byte[] byteArray70 = inputStream46.readNBytes((int) (byte) 113);
        int int71 = inputStream0.read(byteArray70);
        inputStream0.mark((int) (byte) 124);
        java.io.InputStream inputStream74 = java.io.InputStream.nullInputStream();
        boolean boolean75 = inputStream74.markSupported();
        java.io.InputStream inputStream76 = java.io.InputStream.nullInputStream();
        boolean boolean77 = inputStream76.markSupported();
        inputStream76.mark((int) (byte) 122);
        byte[] byteArray80 = inputStream76.readAllBytes();
        byte[] byteArray82 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int83 = inputStream76.read(byteArray82);
        int int84 = inputStream74.read(byteArray82);
        byte[] byteArray85 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray82);
        java.lang.Object obj86 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray82);
        byte[] byteArray87 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray82);
        byte[] byteArray88 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray82);
        int int89 = inputStream0.read(byteArray82);
        byte[] byteArray91 = inputStream0.readNBytes((int) (byte) 16);
        java.lang.ClassLoader classLoader92 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream93 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader92);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(inputStream59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(inputStream74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(inputStream76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + (-1.0d) + "'", obj86, (-1.0d));
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] {});
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        boolean boolean6 = inputStream0.markSupported();
        byte[] byteArray7 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        int int6 = inputStream0.readNBytes(byteArray3, (int) (byte) 1, (int) (byte) 16);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0L);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        long long12 = inputStream0.skip((long) (byte) 115);
        inputStream0.mark((int) (byte) 116);
        long long16 = inputStream0.skip((long) (short) 100);
        byte[] byteArray17 = inputStream0.readAllBytes();
        boolean boolean18 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        inputStream0.mark((int) (byte) 112);
        boolean boolean6 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray9 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 126);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        boolean boolean13 = inputStream12.markSupported();
        inputStream12.mark((int) (byte) 122);
        byte[] byteArray16 = inputStream12.readAllBytes();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj19 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
        int int22 = inputStream12.readNBytes(byteArray18, (int) '4', (int) (short) 5);
        inputStream12.mark((int) (byte) 8);
        byte[] byteArray25 = inputStream12.readAllBytes();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.clone(byteArray26);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray27);
        int int29 = inputStream0.read(byteArray27);
        long long31 = inputStream0.skip(10L);
        inputStream0.mark((int) (byte) 115);
        byte[] byteArray34 = inputStream0.readAllBytes();
        inputStream0.mark(0);
        byte[] byteArray37 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        long long12 = inputStream7.skip((long) 100);
        byte[] byteArray13 = inputStream7.readAllBytes();
        long long15 = inputStream7.skip((long) (short) 10);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark((int) (byte) 122);
        byte[] byteArray20 = inputStream16.readAllBytes();
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 122);
        byte[] byteArray25 = inputStream21.readAllBytes();
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj28 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray27);
        int int31 = inputStream21.readNBytes(byteArray27, (int) '4', (int) (short) 5);
        int int32 = inputStream16.read(byteArray27);
        int int33 = inputStream7.read(byteArray27);
        byte[] byteArray35 = inputStream7.readNBytes((int) '4');
        byte[] byteArray37 = inputStream7.readNBytes((int) (short) 10);
        int int38 = inputStream0.read(byteArray37);
        boolean boolean39 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0d) + "'", obj28, (-1.0d));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        inputStream6.mark((int) (byte) 112);
        byte[] byteArray12 = inputStream6.readAllBytes();
        int int13 = inputStream0.read(byteArray12);
        byte[] byteArray14 = inputStream0.readAllBytes();
        inputStream0.mark((int) (short) 5);
        inputStream0.mark(0);
        inputStream0.mark((int) (short) -1);
        byte[] byteArray21 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass22 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 123);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        inputStream9.mark((int) (byte) 112);
        boolean boolean15 = inputStream9.markSupported();
        boolean boolean16 = inputStream9.markSupported();
        boolean boolean17 = inputStream9.markSupported();
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray19);
        int int21 = inputStream9.read(byteArray19);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark((int) (byte) 122);
        long long27 = inputStream22.skip((long) 100);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int32 = inputStream22.readNBytes(byteArray29, (int) (byte) 4, (int) (byte) 16);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.clone(byteArray29);
        java.lang.Object obj34 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray29);
        int int37 = inputStream9.readNBytes(byteArray29, 10, (int) (short) 10);
        inputStream9.mark((int) (byte) 126);
        java.io.SerializablePermission serializablePermission40 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission41 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission40);
        java.io.SerializablePermission serializablePermission42 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission41);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission42);
        int int44 = inputStream9.read(byteArray43);
        int int47 = inputStream0.readNBytes(byteArray43, (int) (byte) 112, 0);
        byte[] byteArray48 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray48);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0d) + "'", obj20, (-1.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '#' + "'", obj34, '#');
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(serializablePermission40);
        org.junit.Assert.assertNotNull(serializablePermission41);
        org.junit.Assert.assertNotNull(serializablePermission42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        boolean boolean27 = inputStream0.markSupported();
        byte[] byteArray28 = inputStream0.readAllBytes();
        boolean boolean29 = inputStream0.markSupported();
        long long31 = inputStream0.skip((long) 100);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        long long8 = inputStream0.skip(0L);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        byte[] byteArray11 = inputStream9.readNBytes(1);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        long long15 = inputStream0.skip((long) (short) 5);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission1 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.security.Permission permission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission1);
        java.security.Permission permission4 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission1);
        java.io.SerializablePermission serializablePermission5 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission1);
        java.io.SerializablePermission serializablePermission7 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.io.SerializablePermission serializablePermission8 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission8);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray9);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(serializablePermission1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(permission3);
        org.junit.Assert.assertNotNull(permission4);
        org.junit.Assert.assertNotNull(serializablePermission5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(serializablePermission7);
        org.junit.Assert.assertNotNull(serializablePermission8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark((int) (short) 100);
        boolean boolean10 = inputStream0.markSupported();
        byte[] byteArray12 = inputStream0.readNBytes((int) (byte) 8);
        inputStream0.mark((int) '#');
        boolean boolean15 = inputStream0.markSupported();
        byte[] byteArray16 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        byte[] byteArray11 = inputStream0.readAllBytes();
        long long13 = inputStream0.skip(10L);
        byte[] byteArray14 = inputStream0.readAllBytes();
        java.io.SerializablePermission serializablePermission15 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission16 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission15);
        java.io.SerializablePermission serializablePermission17 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission16);
        java.io.SerializablePermission serializablePermission18 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission16);
        java.io.SerializablePermission serializablePermission19 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission16);
        java.security.Permission permission20 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission19);
        java.io.SerializablePermission serializablePermission21 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission21);
        int int25 = inputStream0.readNBytes(byteArray22, 0, (int) (byte) 120);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission15);
        org.junit.Assert.assertNotNull(serializablePermission16);
        org.junit.Assert.assertNotNull(serializablePermission17);
        org.junit.Assert.assertNotNull(serializablePermission18);
        org.junit.Assert.assertNotNull(serializablePermission19);
        org.junit.Assert.assertNotNull(permission20);
        org.junit.Assert.assertNotNull(serializablePermission21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        boolean boolean11 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        long long19 = inputStream14.skip((long) 100);
        byte[] byteArray20 = inputStream14.readAllBytes();
        long long22 = inputStream14.skip((long) (short) 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        byte[] byteArray32 = inputStream28.readAllBytes();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        int int38 = inputStream28.readNBytes(byteArray34, (int) '4', (int) (short) 5);
        int int39 = inputStream23.read(byteArray34);
        int int40 = inputStream14.read(byteArray34);
        int int41 = inputStream0.read(byteArray34);
        byte[] byteArray42 = inputStream0.readAllBytes();
        byte[] byteArray44 = inputStream0.readNBytes(2);
        inputStream0.mark((int) (byte) 100);
        boolean boolean47 = inputStream0.markSupported();
        byte[] byteArray48 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark((int) (byte) 122);
        byte[] byteArray9 = inputStream5.readAllBytes();
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        int int15 = inputStream5.readNBytes(byteArray11, (int) '4', (int) (short) 5);
        int int16 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        boolean boolean21 = inputStream17.markSupported();
        long long23 = inputStream17.skip((long) (byte) 113);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        inputStream26.mark((int) (byte) 122);
        byte[] byteArray30 = inputStream26.readAllBytes();
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int33 = inputStream26.read(byteArray32);
        int int34 = inputStream24.read(byteArray32);
        byte[] byteArray35 = inputStream24.readAllBytes();
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.clone(byteArray35);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray35);
        int int38 = inputStream17.read(byteArray37);
        int int39 = inputStream0.read(byteArray37);
        boolean boolean40 = inputStream0.markSupported();
        boolean boolean41 = inputStream0.markSupported();
        boolean boolean42 = inputStream0.markSupported();
        byte[] byteArray43 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (short) 10);
        long long5 = inputStream0.skip((long) 8257536);
        byte[] byteArray6 = inputStream0.readAllBytes();
        boolean boolean7 = inputStream0.markSupported();
        long long9 = inputStream0.skip((long) 0);
        inputStream0.mark((int) (byte) 115);
        inputStream0.mark((int) (short) 0);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 122);
        boolean boolean16 = inputStream0.markSupported();
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = inputStream0.transferTo(outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        boolean boolean27 = inputStream0.markSupported();
        long long29 = inputStream0.skip(10L);
        inputStream0.mark(0);
        long long33 = inputStream0.skip((long) (-1));
        byte[] byteArray34 = inputStream0.readAllBytes();
        long long36 = inputStream0.skip((long) (-1));
        java.io.OutputStream outputStream37 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long38 = inputStream0.transferTo(outputStream37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        byte[] byteArray12 = inputStream0.readNBytes((int) (byte) 4);
        inputStream0.mark((int) (byte) 2);
        byte[] byteArray15 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15, outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        byte[] byteArray27 = inputStream0.readAllBytes();
        boolean boolean28 = inputStream0.markSupported();
        byte[] byteArray30 = inputStream0.readNBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        boolean boolean11 = inputStream7.markSupported();
        long long13 = inputStream7.skip((long) (byte) 113);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark((int) (byte) 122);
        byte[] byteArray20 = inputStream16.readAllBytes();
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int23 = inputStream16.read(byteArray22);
        int int24 = inputStream14.read(byteArray22);
        byte[] byteArray25 = inputStream14.readAllBytes();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.clone(byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        int int28 = inputStream7.read(byteArray27);
        int int29 = inputStream0.read(byteArray27);
        inputStream0.mark((int) (byte) 10);
        long long33 = inputStream0.skip((long) (byte) 117);
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        boolean boolean35 = inputStream34.markSupported();
        inputStream34.mark((int) (byte) 122);
        byte[] byteArray38 = inputStream34.readAllBytes();
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj41 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray40);
        int int44 = inputStream34.readNBytes(byteArray40, (int) '4', (int) (short) 5);
        byte[] byteArray46 = inputStream34.readNBytes((int) (byte) 4);
        inputStream34.mark((int) (byte) 2);
        byte[] byteArray50 = inputStream34.readNBytes(100);
        java.io.SerializablePermission serializablePermission51 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission52 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission51);
        java.io.SerializablePermission serializablePermission53 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission51);
        java.io.SerializablePermission serializablePermission54 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission51);
        byte[] byteArray55 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission51);
        byte[] byteArray56 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray55);
        int int59 = inputStream34.readNBytes(byteArray55, (int) (byte) 10, (int) (byte) 0);
        int int60 = inputStream0.read(byteArray55);
        byte[] byteArray62 = inputStream0.readNBytes((int) (byte) 2);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0d) + "'", obj41, (-1.0d));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission51);
        org.junit.Assert.assertNotNull(serializablePermission52);
        org.junit.Assert.assertNotNull(serializablePermission53);
        org.junit.Assert.assertNotNull(serializablePermission54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        byte[] byteArray7 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 1);
        boolean boolean10 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 123);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        inputStream9.mark((int) (byte) 112);
        boolean boolean15 = inputStream9.markSupported();
        boolean boolean16 = inputStream9.markSupported();
        boolean boolean17 = inputStream9.markSupported();
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray19);
        int int21 = inputStream9.read(byteArray19);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark((int) (byte) 122);
        long long27 = inputStream22.skip((long) 100);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int32 = inputStream22.readNBytes(byteArray29, (int) (byte) 4, (int) (byte) 16);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.clone(byteArray29);
        java.lang.Object obj34 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray29);
        int int37 = inputStream9.readNBytes(byteArray29, 10, (int) (short) 10);
        inputStream9.mark((int) (byte) 126);
        java.io.SerializablePermission serializablePermission40 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission41 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission40);
        java.io.SerializablePermission serializablePermission42 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission41);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission42);
        int int44 = inputStream9.read(byteArray43);
        int int47 = inputStream0.readNBytes(byteArray43, (int) (byte) 112, 0);
        java.lang.Class<?> wildcardClass48 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0d) + "'", obj20, (-1.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '#' + "'", obj34, '#');
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(serializablePermission40);
        org.junit.Assert.assertNotNull(serializablePermission41);
        org.junit.Assert.assertNotNull(serializablePermission42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark((int) (byte) 122);
        byte[] byteArray9 = inputStream5.readAllBytes();
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        int int15 = inputStream5.readNBytes(byteArray11, (int) '4', (int) (short) 5);
        int int16 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        boolean boolean21 = inputStream17.markSupported();
        long long23 = inputStream17.skip((long) (byte) 113);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        inputStream26.mark((int) (byte) 122);
        byte[] byteArray30 = inputStream26.readAllBytes();
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int33 = inputStream26.read(byteArray32);
        int int34 = inputStream24.read(byteArray32);
        byte[] byteArray35 = inputStream24.readAllBytes();
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.clone(byteArray35);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray35);
        int int38 = inputStream17.read(byteArray37);
        int int39 = inputStream0.read(byteArray37);
        boolean boolean40 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 8);
        boolean boolean43 = inputStream0.markSupported();
        boolean boolean44 = inputStream0.markSupported();
        byte[] byteArray45 = inputStream0.readAllBytes();
        byte[] byteArray47 = inputStream0.readNBytes((int) (byte) 120);
        java.io.OutputStream outputStream48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 120, outputStream48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        inputStream6.mark((int) (byte) 112);
        byte[] byteArray12 = inputStream6.readAllBytes();
        int int13 = inputStream0.read(byteArray12);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 121);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark((int) (byte) 122);
        inputStream16.mark((int) (byte) 112);
        boolean boolean22 = inputStream16.markSupported();
        boolean boolean23 = inputStream16.markSupported();
        boolean boolean24 = inputStream16.markSupported();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj27 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray26);
        int int28 = inputStream16.read(byteArray26);
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        boolean boolean30 = inputStream29.markSupported();
        inputStream29.mark((int) (byte) 122);
        long long34 = inputStream29.skip((long) 100);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int39 = inputStream29.readNBytes(byteArray36, (int) (byte) 4, (int) (byte) 16);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.clone(byteArray36);
        java.lang.Object obj41 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        int int44 = inputStream16.readNBytes(byteArray36, 10, (int) (short) 10);
        java.lang.Object obj45 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        int int46 = inputStream0.read(byteArray36);
        inputStream0.mark((int) 'a');
        long long50 = inputStream0.skip((long) (byte) 122);
        java.io.OutputStream outputStream51 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long52 = inputStream0.transferTo(outputStream51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0d) + "'", obj27, (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '#' + "'", obj41, '#');
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '#' + "'", obj45, '#');
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 126);
        long long8 = inputStream0.skip((long) (byte) 16);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 10);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (byte) 122);
        byte[] byteArray15 = inputStream11.readAllBytes();
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int18 = inputStream11.read(byteArray17);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        inputStream19.mark((int) (byte) 122);
        long long24 = inputStream19.skip((long) 100);
        byte[] byteArray25 = inputStream19.readAllBytes();
        byte[] byteArray26 = inputStream19.readAllBytes();
        int int27 = inputStream11.read(byteArray26);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        long long33 = inputStream28.skip((long) 100);
        byte[] byteArray34 = inputStream28.readAllBytes();
        byte[] byteArray35 = inputStream28.readAllBytes();
        int int36 = inputStream11.read(byteArray35);
        inputStream11.mark((int) (byte) 126);
        byte[] byteArray39 = inputStream11.readAllBytes();
        byte[] byteArray41 = inputStream11.readNBytes(0);
        int int42 = inputStream0.read(byteArray41);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray41);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteArray43);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        byte[] byteArray12 = inputStream0.readNBytes(1);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 121);
        int int15 = inputStream0.read(byteArray14);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        int int22 = inputStream16.readNBytes(byteArray19, (int) (byte) 1, (int) (byte) 16);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0L);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        int int26 = inputStream16.read(byteArray24);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24);
        int int28 = inputStream0.read(byteArray24);
        long long30 = inputStream0.skip((long) (byte) 120);
        byte[] byteArray32 = inputStream0.readNBytes((int) (byte) 116);
        boolean boolean33 = inputStream0.markSupported();
        byte[] byteArray34 = inputStream0.readAllBytes();
        byte[] byteArray36 = inputStream0.readNBytes((int) (byte) 117);
        java.io.OutputStream outputStream37 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long38 = inputStream0.transferTo(outputStream37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0L + "'", obj25, 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (short) 10);
        long long5 = inputStream0.skip((long) 8257536);
        byte[] byteArray6 = inputStream0.readAllBytes();
        byte[] byteArray7 = inputStream0.readAllBytes();
        boolean boolean8 = inputStream0.markSupported();
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray10);
        java.io.Serializable serializable12 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray10);
        int int15 = inputStream0.readNBytes(byteArray10, 10, 1);
        byte[] byteArray16 = inputStream0.readAllBytes();
        long long18 = inputStream0.skip(100L);
        byte[] byteArray20 = inputStream0.readNBytes(0);
        inputStream0.mark((int) (short) 5);
        long long24 = inputStream0.skip((long) 1);
        byte[] byteArray26 = inputStream0.readNBytes((int) (byte) 125);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertNotNull(serializable12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 123);
        boolean boolean9 = inputStream0.markSupported();
        long long11 = inputStream0.skip((long) (byte) 118);
        boolean boolean12 = inputStream0.markSupported();
        byte[] byteArray13 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readNBytes(2);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        boolean boolean17 = inputStream0.markSupported();
        inputStream0.mark((int) '4');
        inputStream0.mark((int) (byte) 118);
        byte[] byteArray22 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        byte[] byteArray12 = inputStream0.readNBytes(1);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 121);
        int int15 = inputStream0.read(byteArray14);
        byte[] byteArray17 = inputStream0.readNBytes((int) (byte) 16);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        boolean boolean19 = inputStream18.markSupported();
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        int int24 = inputStream18.readNBytes(byteArray21, (int) (byte) 1, (int) (byte) 16);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        boolean boolean26 = inputStream25.markSupported();
        inputStream25.mark((int) (byte) 122);
        byte[] byteArray29 = inputStream25.readAllBytes();
        byte[] byteArray31 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int32 = inputStream25.read(byteArray31);
        inputStream25.mark((int) (short) 100);
        long long36 = inputStream25.skip(10L);
        boolean boolean37 = inputStream25.markSupported();
        byte[] byteArray39 = inputStream25.readNBytes((int) (byte) 124);
        int int40 = inputStream18.read(byteArray39);
        int int41 = inputStream0.read(byteArray39);
        java.io.InputStream inputStream42 = java.io.InputStream.nullInputStream();
        boolean boolean43 = inputStream42.markSupported();
        inputStream42.mark((int) (byte) 122);
        long long47 = inputStream42.skip((long) 100);
        byte[] byteArray48 = inputStream42.readAllBytes();
        long long50 = inputStream42.skip((long) (short) 10);
        java.io.InputStream inputStream51 = java.io.InputStream.nullInputStream();
        boolean boolean52 = inputStream51.markSupported();
        inputStream51.mark((int) (byte) 122);
        byte[] byteArray55 = inputStream51.readAllBytes();
        java.io.InputStream inputStream56 = java.io.InputStream.nullInputStream();
        boolean boolean57 = inputStream56.markSupported();
        inputStream56.mark((int) (byte) 122);
        byte[] byteArray60 = inputStream56.readAllBytes();
        byte[] byteArray62 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj63 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray62);
        int int66 = inputStream56.readNBytes(byteArray62, (int) '4', (int) (short) 5);
        int int67 = inputStream51.read(byteArray62);
        int int68 = inputStream42.read(byteArray62);
        long long70 = inputStream42.skip((long) '4');
        byte[] byteArray71 = inputStream42.readAllBytes();
        int int72 = inputStream0.read(byteArray71);
        java.io.OutputStream outputStream73 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long74 = inputStream0.transferTo(outputStream73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(inputStream42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(inputStream51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1.0d) + "'", obj63, (-1.0d));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(100);
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        inputStream0.mark((-1));
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(1);
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        boolean boolean4 = inputStream3.markSupported();
        inputStream3.mark((int) (byte) 122);
        inputStream3.mark((int) (byte) 112);
        boolean boolean9 = inputStream3.markSupported();
        boolean boolean10 = inputStream3.markSupported();
        boolean boolean11 = inputStream3.markSupported();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        int int15 = inputStream3.read(byteArray13);
        int int16 = inputStream0.read(byteArray13);
        boolean boolean17 = inputStream0.markSupported();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        boolean boolean19 = inputStream18.markSupported();
        inputStream18.mark((int) (short) 10);
        long long23 = inputStream18.skip((long) 8257536);
        byte[] byteArray24 = inputStream18.readAllBytes();
        byte[] byteArray25 = inputStream18.readAllBytes();
        boolean boolean26 = inputStream18.markSupported();
        inputStream18.mark((int) (byte) 100);
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        boolean boolean30 = inputStream29.markSupported();
        inputStream29.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass33 = inputStream29.getClass();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass33);
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray34);
        int int37 = inputStream18.read(byteArray36);
        int int38 = inputStream0.read(byteArray36);
        byte[] byteArray40 = inputStream0.readNBytes((int) (short) 0);
        long long42 = inputStream0.skip(1L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 4);
        byte[] byteArray7 = inputStream0.readAllBytes();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        byte[] byteArray12 = inputStream8.readAllBytes();
        byte[] byteArray13 = inputStream8.readAllBytes();
        boolean boolean14 = inputStream8.markSupported();
        java.io.Serializable serializable15 = null;
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize(serializable15);
        int int17 = inputStream8.read(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = inputStream0.readNBytes(byteArray16, 8257536, (int) (byte) 114);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [8257536, 8257536 + 114) out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        inputStream0.mark((int) (byte) 8);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark((int) (byte) 122);
        byte[] byteArray19 = inputStream15.readAllBytes();
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int22 = inputStream15.read(byteArray21);
        int int23 = inputStream13.read(byteArray21);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        inputStream24.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass28 = inputStream24.getClass();
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass28);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray29);
        int int31 = inputStream13.read(byteArray29);
        int int32 = inputStream0.read(byteArray29);
        boolean boolean33 = inputStream0.markSupported();
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        boolean boolean35 = inputStream34.markSupported();
        inputStream34.mark((int) (byte) 122);
        inputStream34.mark((int) (byte) 112);
        byte[] byteArray41 = inputStream34.readNBytes((int) (byte) 117);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray41);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = inputStream0.readNBytes(byteArray43, (int) ' ', (int) (byte) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [32, 32 + 16) out of bounds for length 27");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertNotNull(byteArray43);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark((int) (short) 100);
        byte[] byteArray10 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass11 = inputStream0.getClass();
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass11);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        int int6 = inputStream0.readNBytes(byteArray3, (int) (byte) 1, (int) (byte) 16);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray12 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        boolean boolean6 = inputStream0.markSupported();
        java.io.Serializable serializable7 = null;
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable7);
        int int9 = inputStream0.read(byteArray8);
        inputStream0.mark((int) (byte) 117);
        byte[] byteArray13 = inputStream0.readNBytes(2);
        inputStream0.mark((int) 'a');
        java.lang.Class<?> wildcardClass16 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        inputStream0.mark((int) (byte) 112);
        boolean boolean6 = inputStream0.markSupported();
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int16 = inputStream9.read(byteArray15);
        inputStream9.mark((int) (short) 100);
        long long20 = inputStream9.skip((long) 'a');
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 122);
        byte[] byteArray25 = inputStream21.readAllBytes();
        byte[] byteArray27 = inputStream21.readNBytes((int) (byte) 118);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        inputStream28.mark((int) (byte) 112);
        boolean boolean34 = inputStream28.markSupported();
        boolean boolean35 = inputStream28.markSupported();
        boolean boolean36 = inputStream28.markSupported();
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        int int40 = inputStream28.read(byteArray38);
        int int41 = inputStream21.read(byteArray38);
        int int42 = inputStream9.read(byteArray38);
        byte[] byteArray44 = inputStream9.readNBytes((int) (short) 100);
        int int45 = inputStream0.read(byteArray44);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1.0d) + "'", obj39, (-1.0d));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        inputStream6.mark((int) (byte) 112);
        byte[] byteArray12 = inputStream6.readAllBytes();
        int int13 = inputStream0.read(byteArray12);
        inputStream0.mark(1);
        long long17 = inputStream0.skip((long) (byte) 115);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        boolean boolean11 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        long long19 = inputStream14.skip((long) 100);
        byte[] byteArray20 = inputStream14.readAllBytes();
        long long22 = inputStream14.skip((long) (short) 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        byte[] byteArray32 = inputStream28.readAllBytes();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        int int38 = inputStream28.readNBytes(byteArray34, (int) '4', (int) (short) 5);
        int int39 = inputStream23.read(byteArray34);
        int int40 = inputStream14.read(byteArray34);
        int int41 = inputStream0.read(byteArray34);
        long long43 = inputStream0.skip((long) (byte) 124);
        byte[] byteArray44 = inputStream0.readAllBytes();
        byte[] byteArray45 = inputStream0.readAllBytes();
        long long47 = inputStream0.skip((long) (byte) 113);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(1);
        boolean boolean3 = inputStream0.markSupported();
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        boolean boolean5 = inputStream4.markSupported();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        byte[] byteArray10 = inputStream6.readAllBytes();
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int13 = inputStream6.read(byteArray12);
        int int14 = inputStream4.read(byteArray12);
        byte[] byteArray15 = inputStream4.readAllBytes();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray17);
        int int21 = inputStream0.readNBytes(byteArray17, (int) (short) 10, 0);
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray24 = inputStream0.readAllBytes();
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        boolean boolean26 = inputStream25.markSupported();
        inputStream25.mark((int) (byte) 122);
        inputStream25.mark((int) (byte) 112);
        boolean boolean31 = inputStream25.markSupported();
        boolean boolean32 = inputStream25.markSupported();
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        boolean boolean34 = inputStream33.markSupported();
        inputStream33.mark((int) (byte) 122);
        long long38 = inputStream33.skip((long) 100);
        byte[] byteArray39 = inputStream33.readAllBytes();
        long long41 = inputStream33.skip((long) (short) 10);
        java.io.InputStream inputStream42 = java.io.InputStream.nullInputStream();
        boolean boolean43 = inputStream42.markSupported();
        inputStream42.mark((int) (byte) 122);
        byte[] byteArray46 = inputStream42.readAllBytes();
        java.io.InputStream inputStream47 = java.io.InputStream.nullInputStream();
        boolean boolean48 = inputStream47.markSupported();
        inputStream47.mark((int) (byte) 122);
        byte[] byteArray51 = inputStream47.readAllBytes();
        byte[] byteArray53 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj54 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray53);
        int int57 = inputStream47.readNBytes(byteArray53, (int) '4', (int) (short) 5);
        int int58 = inputStream42.read(byteArray53);
        int int59 = inputStream33.read(byteArray53);
        int int60 = inputStream25.read(byteArray53);
        java.lang.Object obj61 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray53);
        int int62 = inputStream0.read(byteArray53);
        java.io.InputStream inputStream63 = java.io.InputStream.nullInputStream();
        boolean boolean64 = inputStream63.markSupported();
        inputStream63.mark((int) (byte) 122);
        byte[] byteArray67 = inputStream63.readAllBytes();
        byte[] byteArray68 = inputStream63.readAllBytes();
        boolean boolean69 = inputStream63.markSupported();
        boolean boolean70 = inputStream63.markSupported();
        byte[] byteArray72 = inputStream63.readNBytes(2);
        long long74 = inputStream63.skip((long) (byte) 116);
        java.io.InputStream inputStream75 = java.io.InputStream.nullInputStream();
        boolean boolean76 = inputStream75.markSupported();
        inputStream75.mark((int) (byte) 122);
        inputStream75.mark((int) (byte) 112);
        inputStream75.mark(0);
        inputStream75.mark((int) (byte) 122);
        byte[] byteArray86 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        byte[] byteArray87 = org.apache.commons.lang3.SerializationUtils.clone(byteArray86);
        java.lang.Object obj88 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray87);
        int int91 = inputStream75.readNBytes(byteArray87, (int) (byte) 2, (int) (short) 10);
        byte[] byteArray93 = inputStream75.readNBytes((int) '#');
        byte[] byteArray95 = inputStream75.readNBytes((int) (byte) 119);
        int int96 = inputStream63.read(byteArray95);
        int int97 = inputStream0.read(byteArray95);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(inputStream42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1.0d) + "'", obj54, (-1.0d));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1.0d) + "'", obj61, (-1.0d));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(inputStream63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(inputStream75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + (-1.0d) + "'", obj88, (-1.0d));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] {});
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        byte[] byteArray7 = inputStream0.readAllBytes();
        boolean boolean8 = inputStream0.markSupported();
        inputStream0.mark(10);
        long long12 = inputStream0.skip((long) (byte) 2);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        byte[] byteArray17 = inputStream13.readAllBytes();
        byte[] byteArray18 = inputStream13.readAllBytes();
        inputStream13.mark(0);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 122);
        long long26 = inputStream21.skip((long) 100);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark((int) (byte) 122);
        inputStream27.mark((int) (byte) 112);
        byte[] byteArray33 = inputStream27.readAllBytes();
        int int34 = inputStream21.read(byteArray33);
        byte[] byteArray36 = inputStream21.readNBytes((int) (byte) 121);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray36);
        int int38 = inputStream13.read(byteArray36);
        int int39 = inputStream0.read(byteArray36);
        inputStream0.mark((int) (byte) 123);
        byte[] byteArray42 = inputStream0.readAllBytes();
        boolean boolean43 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        byte[] byteArray4 = inputStream0.readNBytes(0);
        byte[] byteArray5 = inputStream0.readAllBytes();
        boolean boolean6 = inputStream0.markSupported();
        inputStream0.mark((int) '4');
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (short) 10);
        long long5 = inputStream0.skip((long) 8257536);
        byte[] byteArray6 = inputStream0.readAllBytes();
        boolean boolean7 = inputStream0.markSupported();
        long long9 = inputStream0.skip((long) 0);
        inputStream0.mark((int) (byte) 115);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = inputStream0.transferTo(outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 120);
        long long24 = inputStream0.skip((long) (byte) 0);
        byte[] byteArray26 = inputStream0.readNBytes(0);
        boolean boolean27 = inputStream0.markSupported();
        byte[] byteArray29 = inputStream0.readNBytes((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        long long25 = inputStream17.skip((long) (short) 10);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        inputStream26.mark((int) (byte) 122);
        byte[] byteArray30 = inputStream26.readAllBytes();
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark((int) (byte) 122);
        byte[] byteArray35 = inputStream31.readAllBytes();
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray37);
        int int41 = inputStream31.readNBytes(byteArray37, (int) '4', (int) (short) 5);
        int int42 = inputStream26.read(byteArray37);
        int int43 = inputStream17.read(byteArray37);
        byte[] byteArray45 = inputStream17.readNBytes((int) '4');
        byte[] byteArray47 = inputStream17.readNBytes((int) '#');
        int int48 = inputStream0.read(byteArray47);
        long long50 = inputStream0.skip((long) 8257536);
        byte[] byteArray52 = inputStream0.readNBytes((int) (byte) 114);
        byte[] byteArray54 = inputStream0.readNBytes((int) (byte) 125);
        inputStream0.mark((int) (short) 100);
        java.io.InputStream inputStream57 = java.io.InputStream.nullInputStream();
        boolean boolean58 = inputStream57.markSupported();
        inputStream57.mark((int) (byte) 122);
        byte[] byteArray61 = inputStream57.readAllBytes();
        int int62 = inputStream0.read(byteArray61);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (-1.0d) + "'", obj38, (-1.0d));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(100);
        inputStream0.mark((int) (short) 100);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray15);
        int int19 = inputStream9.readNBytes(byteArray15, (int) '4', (int) (short) 5);
        inputStream9.mark((int) (byte) 8);
        byte[] byteArray22 = inputStream9.readAllBytes();
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray22);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray23);
        int int25 = inputStream0.read(byteArray24);
        boolean boolean26 = inputStream0.markSupported();
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark((int) (byte) 122);
        byte[] byteArray31 = inputStream27.readAllBytes();
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int34 = inputStream27.read(byteArray33);
        java.io.InputStream inputStream35 = java.io.InputStream.nullInputStream();
        boolean boolean36 = inputStream35.markSupported();
        inputStream35.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass39 = inputStream35.getClass();
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass39);
        java.lang.Object obj41 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray40);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray40);
        int int43 = inputStream27.read(byteArray42);
        java.io.InputStream inputStream44 = java.io.InputStream.nullInputStream();
        boolean boolean45 = inputStream44.markSupported();
        inputStream44.mark((int) (byte) 122);
        long long49 = inputStream44.skip((long) 100);
        byte[] byteArray50 = inputStream44.readAllBytes();
        long long52 = inputStream44.skip((long) (short) 10);
        java.io.InputStream inputStream53 = java.io.InputStream.nullInputStream();
        boolean boolean54 = inputStream53.markSupported();
        inputStream53.mark((int) (byte) 122);
        byte[] byteArray57 = inputStream53.readAllBytes();
        java.io.InputStream inputStream58 = java.io.InputStream.nullInputStream();
        boolean boolean59 = inputStream58.markSupported();
        inputStream58.mark((int) (byte) 122);
        byte[] byteArray62 = inputStream58.readAllBytes();
        byte[] byteArray64 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj65 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray64);
        int int68 = inputStream58.readNBytes(byteArray64, (int) '4', (int) (short) 5);
        int int69 = inputStream53.read(byteArray64);
        int int70 = inputStream44.read(byteArray64);
        byte[] byteArray72 = inputStream44.readNBytes((int) '4');
        byte[] byteArray74 = inputStream44.readNBytes((int) '#');
        int int75 = inputStream27.read(byteArray74);
        long long77 = inputStream27.skip((long) 8257536);
        boolean boolean78 = inputStream27.markSupported();
        boolean boolean79 = inputStream27.markSupported();
        byte[] byteArray80 = inputStream27.readAllBytes();
        inputStream27.mark(0);
        long long84 = inputStream27.skip(0L);
        java.io.InputStream inputStream85 = java.io.InputStream.nullInputStream();
        long long87 = inputStream85.skip((long) 10);
        byte[] byteArray89 = inputStream85.readNBytes((int) (short) 5);
        byte[] byteArray90 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray89);
        int int91 = inputStream27.read(byteArray90);
        byte[] byteArray92 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int91);
        int int93 = inputStream0.read(byteArray92);
        java.io.OutputStream outputStream94 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long95 = inputStream0.transferTo(outputStream94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(inputStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (-1.0d) + "'", obj65, (-1.0d));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(inputStream85);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        inputStream0.mark((int) (byte) 117);
        byte[] byteArray5 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 8);
        byte[] byteArray9 = inputStream0.readNBytes((int) (short) 0);
        boolean boolean10 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 115);
        inputStream0.mark((int) (byte) 0);
        inputStream0.mark(10);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (byte) 122);
        long long16 = inputStream11.skip((long) 100);
        byte[] byteArray17 = inputStream11.readAllBytes();
        long long19 = inputStream11.skip((long) (short) 10);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        inputStream20.mark((int) (byte) 122);
        byte[] byteArray24 = inputStream20.readAllBytes();
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        boolean boolean26 = inputStream25.markSupported();
        inputStream25.mark((int) (byte) 122);
        byte[] byteArray29 = inputStream25.readAllBytes();
        byte[] byteArray31 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray31);
        int int35 = inputStream25.readNBytes(byteArray31, (int) '4', (int) (short) 5);
        int int36 = inputStream20.read(byteArray31);
        int int37 = inputStream11.read(byteArray31);
        byte[] byteArray39 = inputStream11.readNBytes((int) '4');
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray39);
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.clone(byteArray40);
        int int42 = inputStream0.read(byteArray41);
        long long44 = inputStream0.skip((long) '#');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(1);
        inputStream0.mark(0);
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark((int) (byte) 122);
        long long10 = inputStream5.skip((long) 100);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (byte) 122);
        inputStream11.mark((int) (byte) 112);
        byte[] byteArray17 = inputStream11.readAllBytes();
        int int18 = inputStream5.read(byteArray17);
        int int19 = inputStream0.read(byteArray17);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        inputStream20.mark((int) (byte) 122);
        long long25 = inputStream20.skip((long) 100);
        byte[] byteArray26 = inputStream20.readAllBytes();
        int int27 = inputStream0.read(byteArray26);
        long long29 = inputStream0.skip(10L);
        byte[] byteArray31 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray31);
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass33);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.clone(byteArray34);
        int int36 = inputStream0.read(byteArray34);
        byte[] byteArray38 = inputStream0.readNBytes((int) (byte) 117);
        byte[] byteArray40 = inputStream0.readNBytes((int) (byte) 115);
        java.io.InputStream inputStream41 = java.io.InputStream.nullInputStream();
        byte[] byteArray43 = inputStream41.readNBytes(1);
        java.io.InputStream inputStream44 = java.io.InputStream.nullInputStream();
        boolean boolean45 = inputStream44.markSupported();
        inputStream44.mark((int) (byte) 122);
        inputStream44.mark((int) (byte) 112);
        boolean boolean50 = inputStream44.markSupported();
        boolean boolean51 = inputStream44.markSupported();
        boolean boolean52 = inputStream44.markSupported();
        byte[] byteArray54 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj55 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray54);
        int int56 = inputStream44.read(byteArray54);
        int int57 = inputStream41.read(byteArray54);
        long long59 = inputStream41.skip((long) (byte) 10);
        inputStream41.mark((int) (byte) 121);
        byte[] byteArray62 = inputStream41.readAllBytes();
        byte[] byteArray64 = inputStream41.readNBytes((int) (short) 1);
        byte[] byteArray65 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = inputStream0.readNBytes(byteArray65, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + -1) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (-1.0d) + "'", obj55, (-1.0d));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray65);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 126);
        long long8 = inputStream0.skip((long) (byte) 16);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) '#');
        boolean boolean12 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 120);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        byte[] byteArray21 = inputStream17.readAllBytes();
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int24 = inputStream17.read(byteArray23);
        inputStream17.mark((int) (short) 100);
        long long28 = inputStream17.skip(10L);
        boolean boolean29 = inputStream17.markSupported();
        byte[] byteArray31 = inputStream17.readNBytes((int) (byte) 124);
        int int32 = inputStream0.read(byteArray31);
        long long34 = inputStream0.skip(0L);
        byte[] byteArray36 = inputStream0.readNBytes((int) (byte) 16);
        long long38 = inputStream0.skip((long) (byte) 121);
        inputStream0.mark(0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        boolean boolean11 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        long long19 = inputStream14.skip((long) 100);
        byte[] byteArray20 = inputStream14.readAllBytes();
        long long22 = inputStream14.skip((long) (short) 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        byte[] byteArray32 = inputStream28.readAllBytes();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        int int38 = inputStream28.readNBytes(byteArray34, (int) '4', (int) (short) 5);
        int int39 = inputStream23.read(byteArray34);
        int int40 = inputStream14.read(byteArray34);
        int int41 = inputStream0.read(byteArray34);
        byte[] byteArray42 = inputStream0.readAllBytes();
        byte[] byteArray44 = inputStream0.readNBytes(2);
        inputStream0.mark((int) (byte) 100);
        boolean boolean47 = inputStream0.markSupported();
        byte[] byteArray49 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray51 = inputStream0.readNBytes(10);
        inputStream0.mark(0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission1 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission1);
        java.io.SerializablePermission serializablePermission3 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.io.SerializablePermission serializablePermission4 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.security.BasicPermission basicPermission5 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission1);
        java.security.BasicPermission basicPermission6 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission1);
        java.lang.Class<?> wildcardClass7 = basicPermission6.getClass();
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(serializablePermission1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(serializablePermission3);
        org.junit.Assert.assertNotNull(serializablePermission4);
        org.junit.Assert.assertNotNull(basicPermission5);
        org.junit.Assert.assertNotNull(basicPermission6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 118);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        inputStream7.mark((int) (byte) 112);
        boolean boolean13 = inputStream7.markSupported();
        boolean boolean14 = inputStream7.markSupported();
        boolean boolean15 = inputStream7.markSupported();
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray17);
        int int19 = inputStream7.read(byteArray17);
        int int20 = inputStream0.read(byteArray17);
        boolean boolean21 = inputStream0.markSupported();
        long long23 = inputStream0.skip((long) ' ');
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        inputStream24.mark((int) (short) 10);
        long long29 = inputStream24.skip((long) 8257536);
        byte[] byteArray31 = inputStream24.readNBytes(8257536);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int34 = inputStream24.read(byteArray33);
        int int35 = inputStream0.read(byteArray33);
        inputStream0.mark((int) (byte) 116);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 115);
        boolean boolean7 = inputStream0.markSupported();
        long long9 = inputStream0.skip((long) 1);
        boolean boolean10 = inputStream0.markSupported();
        byte[] byteArray11 = inputStream0.readAllBytes();
        byte[] byteArray12 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        long long13 = inputStream8.skip((long) 100);
        byte[] byteArray14 = inputStream8.readAllBytes();
        byte[] byteArray15 = inputStream8.readAllBytes();
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        byte[] byteArray24 = inputStream17.readAllBytes();
        int int25 = inputStream0.read(byteArray24);
        byte[] byteArray27 = inputStream0.readNBytes((int) ' ');
        boolean boolean28 = inputStream0.markSupported();
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 118);
        long long32 = inputStream0.skip((long) (byte) 126);
        inputStream0.mark(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0d);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        inputStream0.mark((int) (byte) 8);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark((int) (byte) 122);
        byte[] byteArray19 = inputStream15.readAllBytes();
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int22 = inputStream15.read(byteArray21);
        int int23 = inputStream13.read(byteArray21);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        inputStream24.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass28 = inputStream24.getClass();
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass28);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray29);
        int int31 = inputStream13.read(byteArray29);
        int int32 = inputStream0.read(byteArray29);
        byte[] byteArray34 = inputStream0.readNBytes((int) (byte) 124);
        inputStream0.mark(2);
        java.io.InputStream inputStream37 = java.io.InputStream.nullInputStream();
        boolean boolean38 = inputStream37.markSupported();
        inputStream37.mark((int) (byte) 122);
        long long42 = inputStream37.skip((long) 100);
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int47 = inputStream37.readNBytes(byteArray44, (int) (byte) 4, (int) (byte) 16);
        boolean boolean48 = inputStream37.markSupported();
        long long50 = inputStream37.skip(1L);
        byte[] byteArray52 = inputStream37.readNBytes((int) (byte) 118);
        long long54 = inputStream37.skip((long) (byte) 118);
        byte[] byteArray55 = inputStream37.readAllBytes();
        int int56 = inputStream0.read(byteArray55);
        inputStream0.mark((int) (short) 1);
        java.lang.ClassLoader classLoader59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream60 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader59);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        byte[] byteArray7 = inputStream0.readAllBytes();
        boolean boolean8 = inputStream0.markSupported();
        inputStream0.mark(10);
        long long12 = inputStream0.skip((long) 2);
        byte[] byteArray14 = inputStream0.readNBytes(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 126);
        long long8 = inputStream0.skip((long) (byte) 16);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 5);
        inputStream0.mark((int) (byte) 0);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        long long18 = inputStream13.skip((long) 100);
        byte[] byteArray19 = inputStream13.readAllBytes();
        long long21 = inputStream13.skip((long) (short) 10);
        byte[] byteArray22 = inputStream13.readAllBytes();
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        byte[] byteArray28 = inputStream23.readAllBytes();
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.clone(byteArray28);
        int int30 = inputStream13.read(byteArray28);
        byte[] byteArray32 = inputStream13.readNBytes((int) (short) 100);
        int int33 = inputStream0.read(byteArray32);
        long long35 = inputStream0.skip((long) (byte) 114);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        long long13 = inputStream8.skip((long) 100);
        byte[] byteArray14 = inputStream8.readAllBytes();
        byte[] byteArray15 = inputStream8.readAllBytes();
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        byte[] byteArray24 = inputStream17.readAllBytes();
        int int25 = inputStream0.read(byteArray24);
        inputStream0.mark((int) (byte) 126);
        byte[] byteArray28 = inputStream0.readAllBytes();
        byte[] byteArray30 = inputStream0.readNBytes(0);
        long long32 = inputStream0.skip((long) '4');
        byte[] byteArray33 = inputStream0.readAllBytes();
        inputStream0.mark(100);
        byte[] byteArray36 = inputStream0.readAllBytes();
        long long38 = inputStream0.skip(10L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 115);
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray10 = inputStream0.readNBytes((int) (byte) 119);
        byte[] byteArray12 = inputStream0.readNBytes(0);
        byte[] byteArray14 = inputStream0.readNBytes(100);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        boolean boolean9 = inputStream0.markSupported();
        boolean boolean10 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream12 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        byte[] byteArray9 = inputStream0.readAllBytes();
        boolean boolean10 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 1);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (short) 10);
        long long18 = inputStream13.skip((long) 8257536);
        byte[] byteArray20 = inputStream13.readNBytes(8257536);
        byte[] byteArray22 = inputStream13.readNBytes((int) (byte) 10);
        int int23 = inputStream0.read(byteArray22);
        byte[] byteArray25 = inputStream0.readNBytes((int) (byte) 119);
        boolean boolean26 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 120);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj30 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray29);
        int int33 = inputStream23.readNBytes(byteArray29, (int) '4', (int) (short) 5);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.clone(byteArray29);
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        int int36 = inputStream0.read(byteArray34);
        boolean boolean37 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0d) + "'", obj30, (-1.0d));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 115);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        byte[] byteArray10 = inputStream0.readAllBytes();
        long long12 = inputStream0.skip((long) 'a');
        byte[] byteArray14 = inputStream0.readNBytes((int) 'a');
        inputStream0.mark((int) (byte) 112);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        byte[] byteArray9 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass10 = inputStream0.getClass();
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass4 = inputStream0.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        java.io.SerializablePermission serializablePermission6 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission7 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission6);
        java.io.SerializablePermission serializablePermission8 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission8);
        int int10 = inputStream0.read(byteArray9);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int15 = inputStream0.read(byteArray12);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass19);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.clone(byteArray20);
        java.lang.Object obj22 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = inputStream0.readNBytes(byteArray21, (int) (byte) 126, (int) (byte) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [126, 126 + 16) out of bounds for length 76");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission6);
        org.junit.Assert.assertNotNull(serializablePermission7);
        org.junit.Assert.assertNotNull(serializablePermission8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class java.lang.Double");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(1);
        byte[] byteArray3 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        byte[] byteArray12 = inputStream0.readNBytes((int) (byte) 4);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        byte[] byteArray17 = inputStream13.readAllBytes();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        boolean boolean19 = inputStream18.markSupported();
        inputStream18.mark((int) (byte) 122);
        byte[] byteArray22 = inputStream18.readAllBytes();
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        int int28 = inputStream18.readNBytes(byteArray24, (int) '4', (int) (short) 5);
        int int29 = inputStream13.read(byteArray24);
        java.io.InputStream inputStream30 = java.io.InputStream.nullInputStream();
        boolean boolean31 = inputStream30.markSupported();
        inputStream30.mark((int) (byte) 122);
        boolean boolean34 = inputStream30.markSupported();
        long long36 = inputStream30.skip((long) (byte) 113);
        java.io.InputStream inputStream37 = java.io.InputStream.nullInputStream();
        boolean boolean38 = inputStream37.markSupported();
        java.io.InputStream inputStream39 = java.io.InputStream.nullInputStream();
        boolean boolean40 = inputStream39.markSupported();
        inputStream39.mark((int) (byte) 122);
        byte[] byteArray43 = inputStream39.readAllBytes();
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int46 = inputStream39.read(byteArray45);
        int int47 = inputStream37.read(byteArray45);
        byte[] byteArray48 = inputStream37.readAllBytes();
        byte[] byteArray49 = org.apache.commons.lang3.SerializationUtils.clone(byteArray48);
        byte[] byteArray50 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray48);
        int int51 = inputStream30.read(byteArray50);
        int int52 = inputStream13.read(byteArray50);
        int int53 = inputStream0.read(byteArray50);
        long long55 = inputStream0.skip((long) (byte) 112);
        long long57 = inputStream0.skip((long) (byte) 113);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        byte[] byteArray7 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray10 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass11 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 122);
        inputStream21.mark((int) (byte) 112);
        boolean boolean27 = inputStream21.markSupported();
        boolean boolean28 = inputStream21.markSupported();
        boolean boolean29 = inputStream21.markSupported();
        byte[] byteArray31 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray31);
        int int33 = inputStream21.read(byteArray31);
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        boolean boolean35 = inputStream34.markSupported();
        inputStream34.mark((int) (byte) 122);
        long long39 = inputStream34.skip((long) 100);
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int44 = inputStream34.readNBytes(byteArray41, (int) (byte) 4, (int) (byte) 16);
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.clone(byteArray41);
        java.lang.Object obj46 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray41);
        int int49 = inputStream21.readNBytes(byteArray41, 10, (int) (short) 10);
        java.lang.Object obj50 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray41);
        int int51 = inputStream0.read(byteArray41);
        java.io.InputStream inputStream52 = java.io.InputStream.nullInputStream();
        boolean boolean53 = inputStream52.markSupported();
        inputStream52.mark((int) (byte) 122);
        byte[] byteArray56 = inputStream52.readAllBytes();
        long long58 = inputStream52.skip((long) (byte) 100);
        boolean boolean59 = inputStream52.markSupported();
        long long61 = inputStream52.skip((long) (byte) 124);
        byte[] byteArray62 = inputStream52.readAllBytes();
        int int63 = inputStream0.read(byteArray62);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(inputStream52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 120);
        long long24 = inputStream0.skip((long) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        boolean boolean26 = inputStream25.markSupported();
        inputStream25.mark((int) (byte) 122);
        long long30 = inputStream25.skip((long) 100);
        byte[] byteArray31 = inputStream25.readAllBytes();
        byte[] byteArray32 = inputStream25.readAllBytes();
        int int33 = inputStream0.read(byteArray32);
        byte[] byteArray35 = inputStream0.readNBytes((int) (byte) 115);
        byte[] byteArray36 = inputStream0.readAllBytes();
        boolean boolean37 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        boolean boolean6 = inputStream0.markSupported();
        java.io.Serializable serializable7 = null;
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable7);
        int int9 = inputStream0.read(byteArray8);
        inputStream0.mark((int) (byte) 117);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        int int16 = inputStream0.readNBytes(byteArray13, (int) (short) 0, (int) (short) 5);
        long long18 = inputStream0.skip(0L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        long long25 = inputStream17.skip((long) (short) 10);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        inputStream26.mark((int) (byte) 122);
        byte[] byteArray30 = inputStream26.readAllBytes();
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark((int) (byte) 122);
        byte[] byteArray35 = inputStream31.readAllBytes();
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray37);
        int int41 = inputStream31.readNBytes(byteArray37, (int) '4', (int) (short) 5);
        int int42 = inputStream26.read(byteArray37);
        int int43 = inputStream17.read(byteArray37);
        byte[] byteArray45 = inputStream17.readNBytes((int) '4');
        byte[] byteArray47 = inputStream17.readNBytes((int) '#');
        int int48 = inputStream0.read(byteArray47);
        long long50 = inputStream0.skip((long) 8257536);
        byte[] byteArray52 = inputStream0.readNBytes((int) (byte) 114);
        byte[] byteArray53 = inputStream0.readAllBytes();
        byte[] byteArray55 = inputStream0.readNBytes((int) (short) 100);
        inputStream0.mark((int) (byte) 115);
        inputStream0.mark(1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (-1.0d) + "'", obj38, (-1.0d));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        byte[] byteArray18 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray19 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray19, outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        long long13 = inputStream8.skip((long) 100);
        byte[] byteArray14 = inputStream8.readAllBytes();
        byte[] byteArray15 = inputStream8.readAllBytes();
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        byte[] byteArray24 = inputStream17.readAllBytes();
        int int25 = inputStream0.read(byteArray24);
        byte[] byteArray27 = inputStream0.readNBytes((int) ' ');
        boolean boolean28 = inputStream0.markSupported();
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        boolean boolean30 = inputStream29.markSupported();
        inputStream29.mark((int) (byte) 122);
        byte[] byteArray33 = inputStream29.readAllBytes();
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int36 = inputStream29.read(byteArray35);
        inputStream29.mark((int) (short) 100);
        long long40 = inputStream29.skip(10L);
        java.io.InputStream inputStream41 = java.io.InputStream.nullInputStream();
        boolean boolean42 = inputStream41.markSupported();
        java.io.InputStream inputStream43 = java.io.InputStream.nullInputStream();
        boolean boolean44 = inputStream43.markSupported();
        inputStream43.mark((int) (byte) 122);
        byte[] byteArray47 = inputStream43.readAllBytes();
        byte[] byteArray49 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int50 = inputStream43.read(byteArray49);
        int int51 = inputStream41.read(byteArray49);
        java.io.InputStream inputStream52 = java.io.InputStream.nullInputStream();
        boolean boolean53 = inputStream52.markSupported();
        inputStream52.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass56 = inputStream52.getClass();
        byte[] byteArray57 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass56);
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray57);
        int int59 = inputStream41.read(byteArray57);
        boolean boolean60 = inputStream41.markSupported();
        byte[] byteArray61 = inputStream41.readAllBytes();
        inputStream41.mark(2);
        byte[] byteArray64 = inputStream41.readAllBytes();
        byte[] byteArray66 = inputStream41.readNBytes(100);
        int int67 = inputStream29.read(byteArray66);
        byte[] byteArray69 = inputStream29.readNBytes((int) (byte) 8);
        boolean boolean70 = inputStream29.markSupported();
        byte[] byteArray71 = inputStream29.readAllBytes();
        int int72 = inputStream0.read(byteArray71);
        java.lang.ClassLoader classLoader73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream74 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader73);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(inputStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(inputStream52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) 10);
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(0);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 10);
        byte[] byteArray11 = inputStream0.readNBytes((int) (byte) 115);
        byte[] byteArray12 = inputStream0.readAllBytes();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        boolean boolean11 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        long long19 = inputStream14.skip((long) 100);
        byte[] byteArray20 = inputStream14.readAllBytes();
        long long22 = inputStream14.skip((long) (short) 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        byte[] byteArray32 = inputStream28.readAllBytes();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        int int38 = inputStream28.readNBytes(byteArray34, (int) '4', (int) (short) 5);
        int int39 = inputStream23.read(byteArray34);
        int int40 = inputStream14.read(byteArray34);
        int int41 = inputStream0.read(byteArray34);
        byte[] byteArray42 = inputStream0.readAllBytes();
        byte[] byteArray44 = inputStream0.readNBytes(2);
        inputStream0.mark((int) (byte) 100);
        boolean boolean47 = inputStream0.markSupported();
        byte[] byteArray49 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray51 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray52 = inputStream0.readAllBytes();
        long long54 = inputStream0.skip((-1L));
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        byte[] byteArray9 = inputStream0.readAllBytes();
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark((int) (byte) 122);
        byte[] byteArray14 = inputStream10.readAllBytes();
        byte[] byteArray15 = inputStream10.readAllBytes();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        int int17 = inputStream0.read(byteArray15);
        long long19 = inputStream0.skip((long) (short) -1);
        inputStream0.mark((int) (byte) 124);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = inputStream0.transferTo(outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        int int6 = inputStream0.readNBytes(byteArray3, (int) (byte) 1, (int) (byte) 16);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0L);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        long long12 = inputStream0.skip((long) (byte) 115);
        inputStream0.mark((int) (byte) 10);
        long long16 = inputStream0.skip((long) (byte) 114);
        boolean boolean17 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        long long25 = inputStream17.skip((long) (short) 10);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        inputStream26.mark((int) (byte) 122);
        byte[] byteArray30 = inputStream26.readAllBytes();
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark((int) (byte) 122);
        byte[] byteArray35 = inputStream31.readAllBytes();
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray37);
        int int41 = inputStream31.readNBytes(byteArray37, (int) '4', (int) (short) 5);
        int int42 = inputStream26.read(byteArray37);
        int int43 = inputStream17.read(byteArray37);
        byte[] byteArray45 = inputStream17.readNBytes((int) '4');
        byte[] byteArray47 = inputStream17.readNBytes((int) '#');
        int int48 = inputStream0.read(byteArray47);
        long long50 = inputStream0.skip((long) 8257536);
        byte[] byteArray52 = inputStream0.readNBytes((int) (byte) 114);
        byte[] byteArray54 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray56 = inputStream0.readNBytes((int) '#');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (-1.0d) + "'", obj38, (-1.0d));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        long long12 = inputStream0.skip((long) (byte) 114);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(0);
        long long4 = inputStream0.skip((long) (byte) 124);
        inputStream0.mark((int) (short) 5);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        boolean boolean11 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        long long19 = inputStream14.skip((long) 100);
        byte[] byteArray20 = inputStream14.readAllBytes();
        long long22 = inputStream14.skip((long) (short) 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        byte[] byteArray32 = inputStream28.readAllBytes();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        int int38 = inputStream28.readNBytes(byteArray34, (int) '4', (int) (short) 5);
        int int39 = inputStream23.read(byteArray34);
        int int40 = inputStream14.read(byteArray34);
        int int41 = inputStream0.read(byteArray34);
        byte[] byteArray42 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray42, outputStream43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        boolean boolean11 = inputStream0.markSupported();
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 2);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
        java.security.BasicPermission basicPermission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.Permission permission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) basicPermission1);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone(basicPermission1);
        java.io.Serializable serializable4 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) basicPermission1);
        java.security.BasicPermission basicPermission5 = org.apache.commons.lang3.SerializationUtils.clone(basicPermission1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) basicPermission1);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(basicPermission1);
        org.junit.Assert.assertNotNull(permission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(serializable4);
        org.junit.Assert.assertNotNull(basicPermission5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(1);
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        boolean boolean4 = inputStream3.markSupported();
        inputStream3.mark((int) (byte) 122);
        inputStream3.mark((int) (byte) 112);
        boolean boolean9 = inputStream3.markSupported();
        boolean boolean10 = inputStream3.markSupported();
        boolean boolean11 = inputStream3.markSupported();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        int int15 = inputStream3.read(byteArray13);
        int int16 = inputStream0.read(byteArray13);
        long long18 = inputStream0.skip((long) (byte) 10);
        inputStream0.mark((int) (byte) 121);
        long long22 = inputStream0.skip((long) 2);
        byte[] byteArray23 = inputStream0.readAllBytes();
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        int int28 = inputStream0.read(byteArray25);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        boolean boolean27 = inputStream0.markSupported();
        byte[] byteArray28 = inputStream0.readAllBytes();
        long long30 = inputStream0.skip((long) (byte) 1);
        java.lang.Class<?> wildcardClass31 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        boolean boolean3 = inputStream2.markSupported();
        inputStream2.mark((int) (byte) 122);
        byte[] byteArray6 = inputStream2.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int9 = inputStream2.read(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = inputStream11.getClass();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int18 = inputStream0.read(byteArray16);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 120);
        boolean boolean23 = inputStream0.markSupported();
        byte[] byteArray24 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 113);
        inputStream0.mark((int) 'a');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        long long8 = inputStream0.skip(0L);
        byte[] byteArray10 = inputStream0.readNBytes((int) (byte) 16);
        long long12 = inputStream0.skip((long) 'a');
        long long14 = inputStream0.skip((long) (byte) 1);
        byte[] byteArray16 = inputStream0.readNBytes((int) '4');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark((int) (short) 100);
        long long11 = inputStream0.skip(10L);
        boolean boolean12 = inputStream0.markSupported();
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 124);
        byte[] byteArray16 = inputStream0.readNBytes((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        long long14 = inputStream9.skip((long) 100);
        byte[] byteArray15 = inputStream9.readAllBytes();
        long long17 = inputStream9.skip((long) (short) 10);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        boolean boolean19 = inputStream18.markSupported();
        inputStream18.mark((int) (byte) 122);
        byte[] byteArray22 = inputStream18.readAllBytes();
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 122);
        byte[] byteArray27 = inputStream23.readAllBytes();
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj30 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray29);
        int int33 = inputStream23.readNBytes(byteArray29, (int) '4', (int) (short) 5);
        int int34 = inputStream18.read(byteArray29);
        int int35 = inputStream9.read(byteArray29);
        byte[] byteArray37 = inputStream9.readNBytes((int) '4');
        int int38 = inputStream0.read(byteArray37);
        java.lang.Class<?> wildcardClass39 = inputStream0.getClass();
        java.lang.Class<?> wildcardClass40 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass39);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0d) + "'", obj30, (-1.0d));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        byte[] byteArray7 = inputStream0.readAllBytes();
        boolean boolean8 = inputStream0.markSupported();
        inputStream0.mark(10);
        long long12 = inputStream0.skip((long) (byte) 2);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark((int) (byte) 122);
        byte[] byteArray17 = inputStream13.readAllBytes();
        byte[] byteArray18 = inputStream13.readAllBytes();
        inputStream13.mark(0);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 122);
        long long26 = inputStream21.skip((long) 100);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark((int) (byte) 122);
        inputStream27.mark((int) (byte) 112);
        byte[] byteArray33 = inputStream27.readAllBytes();
        int int34 = inputStream21.read(byteArray33);
        byte[] byteArray36 = inputStream21.readNBytes((int) (byte) 121);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray36);
        int int38 = inputStream13.read(byteArray36);
        int int39 = inputStream0.read(byteArray36);
        byte[] byteArray40 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 122);
        long long13 = inputStream8.skip((long) 100);
        byte[] byteArray14 = inputStream8.readAllBytes();
        byte[] byteArray15 = inputStream8.readAllBytes();
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        long long22 = inputStream17.skip((long) 100);
        byte[] byteArray23 = inputStream17.readAllBytes();
        byte[] byteArray24 = inputStream17.readAllBytes();
        int int25 = inputStream0.read(byteArray24);
        byte[] byteArray27 = inputStream0.readNBytes((int) ' ');
        long long29 = inputStream0.skip((long) (short) 0);
        boolean boolean30 = inputStream0.markSupported();
        boolean boolean31 = inputStream0.markSupported();
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long33 = inputStream0.transferTo(outputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        inputStream0.mark(1);
        byte[] byteArray12 = inputStream0.readNBytes((int) 'a');
        boolean boolean13 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) '4');
        byte[] byteArray4 = inputStream0.readAllBytes();
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark((int) (byte) 122);
        long long10 = inputStream5.skip((long) 100);
        byte[] byteArray11 = inputStream5.readAllBytes();
        long long13 = inputStream5.skip((long) (short) 10);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        inputStream19.mark((int) (byte) 122);
        byte[] byteArray23 = inputStream19.readAllBytes();
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray25);
        int int29 = inputStream19.readNBytes(byteArray25, (int) '4', (int) (short) 5);
        int int30 = inputStream14.read(byteArray25);
        int int31 = inputStream5.read(byteArray25);
        byte[] byteArray32 = inputStream5.readAllBytes();
        byte[] byteArray33 = inputStream5.readAllBytes();
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray33);
        int int37 = inputStream0.readNBytes(byteArray34, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0d) + "'", obj26, (-1.0d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        long long18 = inputStream0.skip((long) 1);
        byte[] byteArray20 = inputStream0.readNBytes((int) (byte) 0);
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 114);
        byte[] byteArray23 = inputStream0.readAllBytes();
        boolean boolean24 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        boolean boolean27 = inputStream0.markSupported();
        byte[] byteArray28 = inputStream0.readAllBytes();
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 119);
        byte[] byteArray32 = inputStream0.readNBytes((int) (byte) 8);
        java.lang.Class<?> wildcardClass33 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 115);
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 5);
        long long12 = inputStream0.skip((long) (byte) 126);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 119);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        inputStream0.mark((int) (byte) 112);
        boolean boolean6 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray9 = inputStream0.readAllBytes();
        byte[] byteArray10 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission1 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission3 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        java.security.BasicPermission basicPermission6 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.Permission permission7 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.security.BasicPermission basicPermission8 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) basicPermission8, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(serializablePermission1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(serializablePermission3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(basicPermission6);
        org.junit.Assert.assertNotNull(permission7);
        org.junit.Assert.assertNotNull(basicPermission8);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 118);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        inputStream7.mark((int) (byte) 112);
        boolean boolean13 = inputStream7.markSupported();
        boolean boolean14 = inputStream7.markSupported();
        boolean boolean15 = inputStream7.markSupported();
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray17);
        int int19 = inputStream7.read(byteArray17);
        int int20 = inputStream0.read(byteArray17);
        boolean boolean21 = inputStream0.markSupported();
        long long23 = inputStream0.skip((long) ' ');
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        inputStream24.mark((int) (short) 10);
        long long29 = inputStream24.skip((long) 8257536);
        byte[] byteArray31 = inputStream24.readNBytes(8257536);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int34 = inputStream24.read(byteArray33);
        int int35 = inputStream0.read(byteArray33);
        boolean boolean36 = inputStream0.markSupported();
        boolean boolean37 = inputStream0.markSupported();
        byte[] byteArray38 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark((int) (byte) 122);
        byte[] byteArray21 = inputStream17.readAllBytes();
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int24 = inputStream17.read(byteArray23);
        inputStream17.mark((int) (short) 100);
        long long28 = inputStream17.skip(10L);
        boolean boolean29 = inputStream17.markSupported();
        byte[] byteArray31 = inputStream17.readNBytes((int) (byte) 124);
        int int32 = inputStream0.read(byteArray31);
        byte[] byteArray33 = inputStream0.readAllBytes();
        byte[] byteArray35 = inputStream0.readNBytes(0);
        byte[] byteArray36 = inputStream0.readAllBytes();
        inputStream0.mark((int) (short) 5);
        java.io.InputStream inputStream39 = java.io.InputStream.nullInputStream();
        boolean boolean40 = inputStream39.markSupported();
        inputStream39.mark((int) (byte) 122);
        byte[] byteArray43 = inputStream39.readAllBytes();
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray43);
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray43);
        byte[] byteArray46 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray45);
        int int47 = inputStream0.read(byteArray46);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        inputStream0.mark((int) (byte) 0);
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 114);
        byte[] byteArray31 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        long long8 = inputStream0.skip((long) (short) 10);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        byte[] byteArray13 = inputStream9.readAllBytes();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        int int24 = inputStream14.readNBytes(byteArray20, (int) '4', (int) (short) 5);
        int int25 = inputStream9.read(byteArray20);
        int int26 = inputStream0.read(byteArray20);
        byte[] byteArray28 = inputStream0.readNBytes((int) '4');
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        byte[] byteArray31 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray31);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 100);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 122);
        boolean boolean11 = inputStream7.markSupported();
        long long13 = inputStream7.skip((long) (byte) 113);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark((int) (byte) 122);
        byte[] byteArray20 = inputStream16.readAllBytes();
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int23 = inputStream16.read(byteArray22);
        int int24 = inputStream14.read(byteArray22);
        byte[] byteArray25 = inputStream14.readAllBytes();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.clone(byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        int int28 = inputStream7.read(byteArray27);
        int int29 = inputStream0.read(byteArray27);
        inputStream0.mark((int) (short) 1);
        inputStream0.mark((int) (byte) 16);
        inputStream0.mark(2);
        boolean boolean36 = inputStream0.markSupported();
        byte[] byteArray38 = inputStream0.readNBytes((int) (byte) 117);
        byte[] byteArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = inputStream0.readNBytes(byteArray39, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        long long18 = inputStream0.skip((long) 1);
        byte[] byteArray20 = inputStream0.readNBytes((int) (byte) 0);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 122);
        byte[] byteArray25 = inputStream21.readAllBytes();
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int28 = inputStream21.read(byteArray27);
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        boolean boolean30 = inputStream29.markSupported();
        inputStream29.mark((int) (byte) 122);
        long long34 = inputStream29.skip((long) 100);
        byte[] byteArray35 = inputStream29.readAllBytes();
        byte[] byteArray36 = inputStream29.readAllBytes();
        int int37 = inputStream21.read(byteArray36);
        boolean boolean38 = inputStream21.markSupported();
        boolean boolean39 = inputStream21.markSupported();
        boolean boolean40 = inputStream21.markSupported();
        byte[] byteArray41 = inputStream21.readAllBytes();
        int int42 = inputStream0.read(byteArray41);
        java.io.InputStream inputStream43 = java.io.InputStream.nullInputStream();
        boolean boolean44 = inputStream43.markSupported();
        inputStream43.mark((int) (byte) 122);
        long long48 = inputStream43.skip((long) 100);
        byte[] byteArray49 = inputStream43.readAllBytes();
        byte[] byteArray50 = inputStream43.readAllBytes();
        boolean boolean51 = inputStream43.markSupported();
        inputStream43.mark(10);
        long long55 = inputStream43.skip((long) 2);
        byte[] byteArray57 = inputStream43.readNBytes(0);
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0);
        int int61 = inputStream0.readNBytes(byteArray58, 1, (int) (byte) 10);
        java.io.InputStream inputStream62 = java.io.InputStream.nullInputStream();
        boolean boolean63 = inputStream62.markSupported();
        inputStream62.mark((int) (byte) 122);
        long long67 = inputStream62.skip((long) 100);
        byte[] byteArray68 = inputStream62.readAllBytes();
        byte[] byteArray69 = inputStream62.readAllBytes();
        boolean boolean70 = inputStream62.markSupported();
        inputStream62.mark(10);
        long long74 = inputStream62.skip((long) (byte) 2);
        byte[] byteArray76 = inputStream62.readNBytes(2);
        int int77 = inputStream0.read(byteArray76);
        byte[] byteArray78 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(inputStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(inputStream62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        inputStream0.mark(0);
        inputStream0.mark((int) (byte) 116);
        long long11 = inputStream0.skip((long) '4');
        byte[] byteArray13 = inputStream0.readNBytes((int) (short) 1);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 125);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int10 = inputStream0.readNBytes(byteArray7, (int) (byte) 4, (int) (byte) 16);
        boolean boolean11 = inputStream0.markSupported();
        long long13 = inputStream0.skip((long) ' ');
        long long15 = inputStream0.skip(1L);
        boolean boolean16 = inputStream0.markSupported();
        long long18 = inputStream0.skip((long) (byte) 10);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = inputStream0.readAllBytes();
        long long10 = inputStream0.skip((long) (byte) 125);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark((int) (byte) 122);
        byte[] byteArray15 = inputStream11.readAllBytes();
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark((int) (byte) 122);
        byte[] byteArray20 = inputStream16.readAllBytes();
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj23 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream16.readNBytes(byteArray22, (int) '4', (int) (short) 5);
        int int27 = inputStream11.read(byteArray22);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark((int) (byte) 122);
        boolean boolean32 = inputStream28.markSupported();
        long long34 = inputStream28.skip((long) (byte) 113);
        java.io.InputStream inputStream35 = java.io.InputStream.nullInputStream();
        boolean boolean36 = inputStream35.markSupported();
        java.io.InputStream inputStream37 = java.io.InputStream.nullInputStream();
        boolean boolean38 = inputStream37.markSupported();
        inputStream37.mark((int) (byte) 122);
        byte[] byteArray41 = inputStream37.readAllBytes();
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int44 = inputStream37.read(byteArray43);
        int int45 = inputStream35.read(byteArray43);
        byte[] byteArray46 = inputStream35.readAllBytes();
        byte[] byteArray47 = org.apache.commons.lang3.SerializationUtils.clone(byteArray46);
        byte[] byteArray48 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray46);
        int int49 = inputStream28.read(byteArray48);
        int int50 = inputStream11.read(byteArray48);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = inputStream0.readNBytes(byteArray48, (int) (short) -1, (int) (byte) 126);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 126) out of bounds for length 27");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(0);
        boolean boolean3 = inputStream0.markSupported();
        inputStream0.mark(10);
        byte[] byteArray7 = inputStream0.readNBytes(0);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes(1);
        byte[] byteArray4 = inputStream0.readNBytes((int) (byte) 8);
        byte[] byteArray5 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = inputStream0.transferTo(outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        byte[] byteArray17 = inputStream0.readAllBytes();
        byte[] byteArray19 = inputStream0.readNBytes((int) '4');
        byte[] byteArray21 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        byte[] byteArray24 = inputStream22.readNBytes(1);
        byte[] byteArray26 = inputStream22.readNBytes((int) (byte) 8);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.clone(byteArray26);
        int int28 = inputStream0.read(byteArray27);
        long long30 = inputStream0.skip((long) (byte) 8);
        byte[] byteArray32 = inputStream0.readNBytes((int) (byte) 126);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray32);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark((int) (short) 100);
        long long11 = inputStream0.skip(10L);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        boolean boolean13 = inputStream12.markSupported();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) 122);
        byte[] byteArray18 = inputStream14.readAllBytes();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int21 = inputStream14.read(byteArray20);
        int int22 = inputStream12.read(byteArray20);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass27 = inputStream23.getClass();
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass27);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        int int30 = inputStream12.read(byteArray28);
        boolean boolean31 = inputStream12.markSupported();
        byte[] byteArray32 = inputStream12.readAllBytes();
        inputStream12.mark(2);
        byte[] byteArray35 = inputStream12.readAllBytes();
        byte[] byteArray37 = inputStream12.readNBytes(100);
        int int38 = inputStream0.read(byteArray37);
        long long40 = inputStream0.skip((long) (byte) 113);
        byte[] byteArray42 = inputStream0.readNBytes(0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        byte[] byteArray17 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 120);
        byte[] byteArray20 = inputStream0.readAllBytes();
        long long22 = inputStream0.skip((long) '#');
        byte[] byteArray24 = inputStream0.readNBytes((int) (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0d);
        java.lang.Object obj27 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray26);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray26);
        int int29 = inputStream0.read(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 10.0d + "'", obj27, 10.0d);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 116);
        inputStream0.mark((int) (byte) 1);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = inputStream0.transferTo(outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission2);
        java.security.Permission permission4 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission2);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission2);
        java.io.SerializablePermission serializablePermission6 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission2);
        java.io.SerializablePermission serializablePermission7 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission6);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(permission4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(serializablePermission6);
        org.junit.Assert.assertNotNull(serializablePermission7);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        boolean boolean6 = inputStream0.markSupported();
        java.io.Serializable serializable7 = null;
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize(serializable7);
        int int9 = inputStream0.read(byteArray8);
        inputStream0.mark((int) (byte) 117);
        boolean boolean12 = inputStream0.markSupported();
        long long14 = inputStream0.skip((long) (byte) 119);
        byte[] byteArray16 = inputStream0.readNBytes((int) (byte) 126);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission1 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.io.SerializablePermission serializablePermission3 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.io.SerializablePermission serializablePermission4 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission1);
        java.lang.Class<?> wildcardClass5 = serializablePermission1.getClass();
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(serializablePermission1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(serializablePermission3);
        org.junit.Assert.assertNotNull(serializablePermission4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int10 = inputStream0.readNBytes(byteArray7, (int) (byte) 4, (int) (byte) 16);
        boolean boolean11 = inputStream0.markSupported();
        long long13 = inputStream0.skip(1L);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 1);
        inputStream0.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark((int) (byte) 122);
        inputStream6.mark((int) (byte) 112);
        byte[] byteArray12 = inputStream6.readAllBytes();
        int int13 = inputStream0.read(byteArray12);
        byte[] byteArray14 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readAllBytes();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = inputStream8.getClass();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream0.read(byteArray15);
        byte[] byteArray18 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray19 = inputStream0.readAllBytes();
        byte[] byteArray20 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 117);
        boolean boolean23 = inputStream0.markSupported();
        boolean boolean24 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        int int10 = inputStream0.readNBytes(byteArray6, (int) '4', (int) (short) 5);
        inputStream0.mark((int) (byte) 8);
        byte[] byteArray14 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray15 = inputStream0.readAllBytes();
        byte[] byteArray16 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 116);
        boolean boolean8 = inputStream0.markSupported();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        long long14 = inputStream9.skip((long) 100);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int19 = inputStream9.readNBytes(byteArray16, (int) (byte) 4, (int) (byte) 16);
        boolean boolean20 = inputStream9.markSupported();
        long long22 = inputStream9.skip(1L);
        byte[] byteArray24 = inputStream9.readNBytes((int) (byte) 118);
        long long26 = inputStream9.skip(0L);
        boolean boolean27 = inputStream9.markSupported();
        byte[] byteArray28 = inputStream9.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = inputStream0.readNBytes(byteArray28, 10, (int) (byte) 122);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 122) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 122);
        long long5 = inputStream0.skip((long) 100);
        byte[] byteArray6 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 123);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark((int) (byte) 122);
        inputStream9.mark((int) (byte) 112);
        boolean boolean15 = inputStream9.markSupported();
        boolean boolean16 = inputStream9.markSupported();
        boolean boolean17 = inputStream9.markSupported();
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray19);
        int int21 = inputStream9.read(byteArray19);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark((int) (byte) 122);
        long long27 = inputStream22.skip((long) 100);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#');
        int int32 = inputStream22.readNBytes(byteArray29, (int) (byte) 4, (int) (byte) 16);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.clone(byteArray29);
        java.lang.Object obj34 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray29);
        int int37 = inputStream9.readNBytes(byteArray29, 10, (int) (short) 10);
        inputStream9.mark((int) (byte) 126);
        java.io.SerializablePermission serializablePermission40 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.SerializablePermission serializablePermission41 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission40);
        java.io.SerializablePermission serializablePermission42 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission41);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission42);
        int int44 = inputStream9.read(byteArray43);
        int int47 = inputStream0.readNBytes(byteArray43, (int) (byte) 112, 0);
        java.io.InputStream inputStream48 = java.io.InputStream.nullInputStream();
        boolean boolean49 = inputStream48.markSupported();
        inputStream48.mark((int) (byte) 117);
        byte[] byteArray53 = inputStream48.readNBytes((int) (short) 10);
        java.io.InputStream inputStream54 = java.io.InputStream.nullInputStream();
        boolean boolean55 = inputStream54.markSupported();
        inputStream54.mark((int) (byte) 122);
        long long59 = inputStream54.skip((long) 100);
        byte[] byteArray60 = inputStream54.readAllBytes();
        byte[] byteArray61 = inputStream54.readAllBytes();
        byte[] byteArray62 = inputStream54.readAllBytes();
        java.io.SerializablePermission serializablePermission63 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray64 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission63);
        int int65 = inputStream54.read(byteArray64);
        byte[] byteArray66 = inputStream54.readAllBytes();
        int int67 = inputStream48.read(byteArray66);
        int int68 = inputStream0.read(byteArray66);
        inputStream0.mark((int) (byte) 124);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0d) + "'", obj20, (-1.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '#' + "'", obj34, '#');
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(serializablePermission40);
        org.junit.Assert.assertNotNull(serializablePermission41);
        org.junit.Assert.assertNotNull(serializablePermission42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }
}

