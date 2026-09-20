package org.jfree.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 100L);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue(5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.clear();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) 5, (java.lang.Comparable) (-1.0d));
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        int int14 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) "hi!", (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int11 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        java.lang.Object obj19 = null;
        boolean boolean20 = defaultKeyedValues14.equals(obj19);
        int int21 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (-1.0f));
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues14.removeValue((java.lang.Comparable) (-1L));
        boolean boolean29 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues14);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) (byte) 10, (double) 1.0f);
        java.lang.Number number35 = defaultKeyedValues0.getValue((java.lang.Comparable) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (double) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, (double) (byte) 0);
        int int43 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + (-1.0d) + "'", number35, (-1.0d));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        int int5 = defaultKeyedValues2D1.getRowCount();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) "hi!");
        int int8 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D1.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D13.clear();
        int int16 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj17 = null;
        boolean boolean18 = defaultKeyedValues2D13.equals(obj17);
        int int20 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) (-1));
        int int22 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 100L);
        defaultKeyedValues2D13.clear();
        boolean boolean24 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D13);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D(false);
        boolean boolean27 = defaultKeyedValues2D13.equals((java.lang.Object) defaultKeyedValues2D26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultKeyedValues2D13.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list17 = defaultKeyedValues14.getKeys();
        defaultKeyedValues14.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues14.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int24 = defaultKeyedValues14.getItemCount();
        java.lang.Object obj25 = defaultKeyedValues14.clone();
        java.lang.Object obj26 = defaultKeyedValues14.clone();
        int int28 = defaultKeyedValues14.getIndex((java.lang.Comparable) 4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj30 = defaultKeyedValues2D29.clone();
        defaultKeyedValues2D29.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D32.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int38 = defaultKeyedValues2D32.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list41 = defaultKeyedValues2D32.getColumnKeys();
        boolean boolean42 = defaultKeyedValues2D29.equals((java.lang.Object) defaultKeyedValues2D32);
        boolean boolean43 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues2D29);
        boolean boolean44 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues14);
        java.lang.Class<?> wildcardClass45 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        java.lang.Number number11 = defaultKeyedValues0.getValue((java.lang.Comparable) 10L);
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) 10);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1.0d) + "'", number11, (-1.0d));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 10.0d);
        defaultKeyedValues0.insertValue(5, (java.lang.Comparable) 1.0d, (java.lang.Number) (short) 0);
        int int23 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 10);
        int int24 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (double) (byte) 100);
        java.util.List list21 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.clear();
        int int8 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        int int10 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues2D0.getValue(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        java.util.List list6 = defaultKeyedValues0.getKeys();
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues0.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj14 = defaultKeyedValues2D13.clone();
        int int16 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj17 = defaultKeyedValues2D13.clone();
        defaultKeyedValues2D13.clear();
        boolean boolean19 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D13);
        int int20 = defaultKeyedValues2D13.getRowCount();
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        int int12 = defaultKeyedValues8.getIndex((java.lang.Comparable) false);
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list19 = defaultKeyedValues16.getKeys();
        boolean boolean20 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues16);
        defaultKeyedValues8.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues8.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        boolean boolean27 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        int int28 = defaultKeyedValues8.getItemCount();
        defaultKeyedValues8.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0);
        defaultKeyedValues8.insertValue((int) (byte) 1, (java.lang.Comparable) (byte) 0, (java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) "hi!");
        defaultKeyedValues2D0.removeRow(1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D18.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 2, (java.lang.Comparable) 100L);
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D18.addValue((java.lang.Number) 5, (java.lang.Comparable) 1L, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj16 = defaultKeyedValues2D15.clone();
        defaultKeyedValues2D15.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D15.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D15.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D15);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.removeValue((java.lang.Comparable) (short) 0);
        int int30 = defaultKeyedValues26.getIndex((java.lang.Comparable) false);
        defaultKeyedValues26.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues34 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues34.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list37 = defaultKeyedValues34.getKeys();
        boolean boolean38 = defaultKeyedValues26.equals((java.lang.Object) defaultKeyedValues34);
        defaultKeyedValues26.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        defaultKeyedValues26.clear();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 1, 0.0d);
        defaultKeyedValues26.removeValue((java.lang.Comparable) ' ');
        defaultKeyedValues26.addValue((java.lang.Comparable) 0.0d, (java.lang.Number) (-1));
        defaultKeyedValues26.setValue((java.lang.Comparable) (-1.0f), (double) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D55 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int57 = defaultKeyedValues2D55.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list58 = defaultKeyedValues2D55.getRowKeys();
        defaultKeyedValues2D55.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int62 = defaultKeyedValues2D55.getColumnCount();
        java.util.List list63 = defaultKeyedValues2D55.getColumnKeys();
        int int64 = defaultKeyedValues2D55.getRowCount();
        defaultKeyedValues2D55.clear();
        boolean boolean66 = defaultKeyedValues26.equals((java.lang.Object) defaultKeyedValues2D55);
        boolean boolean67 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D55);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        java.lang.Number number7 = null;
        defaultKeyedValues2D1.addValue(number7, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 1);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj8 = defaultKeyedValues2D7.clone();
        int int10 = defaultKeyedValues2D7.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D7.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj13 = null;
        boolean boolean14 = defaultKeyedValues2D7.equals(obj13);
        int int15 = defaultKeyedValues2D7.getRowCount();
        int int16 = defaultKeyedValues2D7.getColumnCount();
        boolean boolean17 = defaultKeyedValues2D1.equals((java.lang.Object) int16);
        int int18 = defaultKeyedValues2D1.getRowCount();
        java.util.List list19 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int11 = defaultKeyedValues2D9.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list12 = defaultKeyedValues2D9.getRowKeys();
        int int13 = defaultKeyedValues2D9.getRowCount();
        int int15 = defaultKeyedValues2D9.getColumnIndex((java.lang.Comparable) 1.0f);
        boolean boolean16 = defaultKeyedValues2D0.equals((java.lang.Object) int15);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list18 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Number number19 = null;
        defaultKeyedValues2D0.setValue(number19, (java.lang.Comparable) 10, (java.lang.Comparable) false);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) "");
        defaultKeyedValues2D0.clear();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) 2, (java.lang.Comparable) 1.0d, (java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int10 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list11 = defaultKeyedValues2D8.getRowKeys();
        defaultKeyedValues2D8.clear();
        int int14 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 1.0d);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues0.clear();
        java.util.List list17 = defaultKeyedValues0.getKeys();
        int int18 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        int int29 = defaultKeyedValues28.getItemCount();
        java.lang.Object obj30 = null;
        boolean boolean31 = defaultKeyedValues28.equals(obj30);
        defaultKeyedValues28.clear();
        java.util.List list33 = defaultKeyedValues28.getKeys();
        java.util.List list34 = defaultKeyedValues28.getKeys();
        defaultKeyedValues28.addValue((java.lang.Comparable) 0, (double) '#');
        boolean boolean38 = defaultKeyedValues10.equals((java.lang.Object) '#');
        defaultKeyedValues10.addValue((java.lang.Comparable) false, (java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D8.addValue((java.lang.Number) 1, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        java.lang.Object obj17 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.clear();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) 1.0d);
        int int21 = defaultKeyedValues2D8.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues10.getKeys();
        int int30 = defaultKeyedValues10.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues10.setValue((java.lang.Comparable) 1L, (java.lang.Number) (byte) -1);
        int int35 = defaultKeyedValues10.getIndex((java.lang.Comparable) 3);
        java.util.List list36 = defaultKeyedValues10.getKeys();
        int int38 = defaultKeyedValues10.getIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues10.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        int int42 = defaultKeyedValues10.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) "");
        defaultKeyedValues2D0.clear();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues6.removeValue((java.lang.Comparable) (short) 0);
        int int10 = defaultKeyedValues6.getIndex((java.lang.Comparable) false);
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultKeyedValues6.equals(obj11);
        defaultKeyedValues6.setValue((java.lang.Comparable) 0, (double) (-1));
        int int16 = defaultKeyedValues6.getItemCount();
        defaultKeyedValues6.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues6.clear();
        int int22 = defaultKeyedValues6.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D24 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int26 = defaultKeyedValues2D24.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list27 = defaultKeyedValues2D24.getRowKeys();
        defaultKeyedValues2D24.clear();
        boolean boolean30 = defaultKeyedValues2D24.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D24.clear();
        boolean boolean32 = defaultKeyedValues6.equals((java.lang.Object) defaultKeyedValues2D24);
        defaultKeyedValues2D24.removeColumn((java.lang.Comparable) (-1.0d));
        java.util.List list35 = defaultKeyedValues2D24.getColumnKeys();
        boolean boolean36 = defaultKeyedValues2D0.equals((java.lang.Object) list35);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn(0);
        int int16 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 3, (java.lang.Comparable) ' ');
        java.lang.Object obj20 = defaultKeyedValues2D1.clone();
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(comparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = defaultKeyedValues2D0.getRowCount();
        java.lang.Comparable comparable12 = defaultKeyedValues2D0.getColumnKey(0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 3, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 1.0f + "'", comparable12, 1.0f);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        int int15 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean21 = defaultKeyedValues16.equals((java.lang.Object) int20);
        java.lang.Object obj22 = defaultKeyedValues16.clone();
        defaultKeyedValues16.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        java.lang.Number number27 = defaultKeyedValues16.getValue((java.lang.Comparable) 10L);
        defaultKeyedValues16.addValue((java.lang.Comparable) "", (java.lang.Number) 1.0f);
        java.lang.Comparable comparable32 = defaultKeyedValues16.getKey(1);
        boolean boolean33 = defaultKeyedValues2D8.equals((java.lang.Object) defaultKeyedValues16);
        defaultKeyedValues2D8.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + (-1.0d) + "'", number27, (-1.0d));
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + "" + "'", comparable32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int24 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) 10L);
        int int25 = defaultKeyedValues2D22.getColumnCount();
        defaultKeyedValues2D22.removeColumn((java.lang.Comparable) (short) -1);
        int int29 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list30 = defaultKeyedValues2D22.getColumnKeys();
        int int32 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) 100.0f);
        int int34 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues35 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues35.removeValue((java.lang.Comparable) (short) 0);
        int int39 = defaultKeyedValues35.getIndex((java.lang.Comparable) false);
        defaultKeyedValues35.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues43 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues43.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list46 = defaultKeyedValues43.getKeys();
        boolean boolean47 = defaultKeyedValues35.equals((java.lang.Object) defaultKeyedValues43);
        defaultKeyedValues35.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        boolean boolean51 = defaultKeyedValues2D22.equals((java.lang.Object) defaultKeyedValues35);
        boolean boolean52 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D22);
        int int54 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (-1));
        int int58 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) 2);
        int int14 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int19 = defaultKeyedValues2D17.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean20 = defaultKeyedValues15.equals((java.lang.Object) int19);
        java.lang.Object obj21 = defaultKeyedValues15.clone();
        java.lang.Object obj22 = defaultKeyedValues15.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D24 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int26 = defaultKeyedValues2D24.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list27 = defaultKeyedValues2D24.getRowKeys();
        boolean boolean29 = defaultKeyedValues2D24.equals((java.lang.Object) (-1.0f));
        int int30 = defaultKeyedValues2D24.getColumnCount();
        java.util.List list31 = defaultKeyedValues2D24.getRowKeys();
        boolean boolean32 = defaultKeyedValues15.equals((java.lang.Object) list31);
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (byte) 0);
        java.lang.Number number37 = defaultKeyedValues15.getValue((int) (short) 0);
        java.util.List list38 = defaultKeyedValues15.getKeys();
        defaultKeyedValues15.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) (-1.0d));
        boolean boolean42 = defaultKeyedValues0.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + (byte) 0 + "'", number37, (byte) 0);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', (double) 1.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues35 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues35.removeValue((java.lang.Comparable) (short) 0);
        int int39 = defaultKeyedValues35.getIndex((java.lang.Comparable) false);
        java.lang.Object obj40 = null;
        boolean boolean41 = defaultKeyedValues35.equals(obj40);
        int int42 = defaultKeyedValues35.getItemCount();
        boolean boolean43 = defaultKeyedValues0.equals((java.lang.Object) int42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list15 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        java.lang.Number number5 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), number5);
        int int7 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        int int15 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D0.getValue((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        java.util.List list17 = defaultKeyedValues0.getKeys();
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        int int10 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) (byte) 0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) false, (java.lang.Comparable) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues10.getKeys();
        int int30 = defaultKeyedValues10.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues10.setValue((java.lang.Comparable) 1L, (java.lang.Number) (byte) -1);
        int int35 = defaultKeyedValues10.getIndex((java.lang.Comparable) 3);
        defaultKeyedValues10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues10.getValue((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        int int12 = defaultKeyedValues8.getIndex((java.lang.Comparable) false);
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list19 = defaultKeyedValues16.getKeys();
        boolean boolean20 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues16);
        defaultKeyedValues8.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues8.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        boolean boolean27 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues8.addValue((java.lang.Comparable) 100L, (double) (byte) 0);
        defaultKeyedValues8.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) 0);
        defaultKeyedValues8.addValue((java.lang.Comparable) 10L, (java.lang.Number) 10L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, 100.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int27 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list28 = defaultKeyedValues2D25.getRowKeys();
        defaultKeyedValues2D25.clear();
        boolean boolean31 = defaultKeyedValues2D25.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D25.clear();
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D25);
        int int35 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) ' ');
        defaultKeyedValues2D25.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable38 = defaultKeyedValues2D25.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        int int8 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Class<?> wildcardClass12 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultKeyedValues0.equals(obj16);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 10.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable20 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable24 = defaultKeyedValues0.getKey(2);
        java.lang.Object obj25 = null;
        boolean boolean26 = defaultKeyedValues0.equals(obj25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable28 = defaultKeyedValues0.getKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + "hi!" + "'", comparable24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        java.util.List list14 = defaultKeyedValues2D3.getRowKeys();
        int int16 = defaultKeyedValues2D3.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D18.clear();
        int int21 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean26 = defaultKeyedValues2D18.equals((java.lang.Object) defaultKeyedValues22);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int31 = defaultKeyedValues2D29.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean32 = defaultKeyedValues27.equals((java.lang.Object) int31);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj34 = defaultKeyedValues2D33.clone();
        int int36 = defaultKeyedValues2D33.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean37 = defaultKeyedValues27.equals((java.lang.Object) int36);
        defaultKeyedValues27.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues27.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues27.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        boolean boolean47 = defaultKeyedValues2D18.equals((java.lang.Object) defaultKeyedValues27);
        int int48 = defaultKeyedValues2D18.getColumnCount();
        boolean boolean49 = defaultKeyedValues2D3.equals((java.lang.Object) defaultKeyedValues2D18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number52 = defaultKeyedValues2D3.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) 3);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj24 = defaultKeyedValues2D23.clone();
        int int26 = defaultKeyedValues2D23.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj27 = defaultKeyedValues2D23.clone();
        int int29 = defaultKeyedValues2D23.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D23.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D23.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 'a');
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues10.getKeys();
        int int30 = defaultKeyedValues10.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues10.setValue((java.lang.Comparable) 1L, (java.lang.Number) (byte) -1);
        int int35 = defaultKeyedValues10.getIndex((java.lang.Comparable) 3);
        java.util.List list36 = defaultKeyedValues10.getKeys();
        int int38 = defaultKeyedValues10.getIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues10.addValue((java.lang.Comparable) 100.0f, (double) (byte) -1);
        java.util.List list42 = defaultKeyedValues10.getKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int3 = defaultKeyedValues2D1.getRowCount();
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0.0d);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0d);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 3, (java.lang.Number) 1.0d);
        int int22 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, 100.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int27 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list28 = defaultKeyedValues2D25.getRowKeys();
        defaultKeyedValues2D25.clear();
        boolean boolean31 = defaultKeyedValues2D25.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D25.clear();
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D25);
        defaultKeyedValues0.removeValue(0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues10.getKeys();
        int int30 = defaultKeyedValues10.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues10.setValue((java.lang.Comparable) 1L, (java.lang.Number) (byte) -1);
        int int35 = defaultKeyedValues10.getIndex((java.lang.Comparable) 3);
        defaultKeyedValues10.setValue((java.lang.Comparable) true, (java.lang.Number) 10.0d);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0L);
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) -1, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) 2, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) 0L);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1));
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) (byte) 1);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.util.List list13 = defaultKeyedValues2D0.getColumnKeys();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj10 = defaultKeyedValues2D9.clone();
        defaultKeyedValues2D9.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D9.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D9.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        int int21 = defaultKeyedValues2D9.getRowCount();
        defaultKeyedValues2D9.removeColumn((java.lang.Comparable) (byte) 0);
        java.lang.Object obj24 = defaultKeyedValues2D9.clone();
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D9);
        java.util.List list26 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, 1.0d);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) "", 1.0d);
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable8, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues6.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues6.clear();
        defaultKeyedValues6.addValue((java.lang.Comparable) 10L, (java.lang.Number) 1L);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = defaultKeyedValues2D0.equals((java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = defaultKeyedValues2D0.clone();
        java.lang.Comparable comparable17 = null;
        defaultKeyedValues2D0.removeColumn(comparable17);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        int int12 = defaultKeyedValues8.getIndex((java.lang.Comparable) false);
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list19 = defaultKeyedValues16.getKeys();
        boolean boolean20 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues16);
        defaultKeyedValues8.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues8.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        boolean boolean27 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.lang.Number number29 = defaultKeyedValues8.getValue(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 0.0d + "'", number29, 0.0d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 2, (java.lang.Comparable) 0L);
        java.util.List list12 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        int int9 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int14 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean15 = defaultKeyedValues10.equals((java.lang.Object) int14);
        java.lang.Object obj16 = defaultKeyedValues10.clone();
        boolean boolean17 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list18 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        int int30 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        int int37 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0L);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) 0.0f, (java.lang.Number) (short) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D27 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj28 = defaultKeyedValues2D27.clone();
        int int30 = defaultKeyedValues2D27.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D27.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj33 = null;
        boolean boolean34 = defaultKeyedValues2D27.equals(obj33);
        int int35 = defaultKeyedValues2D27.getRowCount();
        int int37 = defaultKeyedValues2D27.getColumnIndex((java.lang.Comparable) "");
        java.util.List list38 = defaultKeyedValues2D27.getColumnKeys();
        boolean boolean39 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues2D27);
        int int41 = defaultKeyedValues10.getIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues42 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues42.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues42.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues42.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues42.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        java.util.List list54 = defaultKeyedValues42.getKeys();
        boolean boolean55 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues42);
        org.jfree.chart.util.SortOrder sortOrder56 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByValues(sortOrder56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 'a', (java.lang.Number) (byte) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (double) (short) 1);
        java.util.List list21 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) 10L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 0.0d, (double) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (short) 10, (java.lang.Number) 0L);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj7 = defaultKeyedValues2D1.clone();
        int int9 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) (short) 10, (double) 0L);
        defaultKeyedValues10.clear();
        defaultKeyedValues10.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) (-1L));
        int int30 = defaultKeyedValues10.getIndex((java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues10.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (double) (byte) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, (double) 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        int int27 = defaultKeyedValues2D18.getColumnCount();
        java.util.List list28 = defaultKeyedValues2D18.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (short) 0);
        int int20 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        java.util.List list22 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        int int3 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1L, (java.lang.Comparable) 0, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D0.getColumnKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100, 1.0d);
        java.util.List list10 = defaultKeyedValues6.getKeys();
        java.lang.Class<?> wildcardClass11 = defaultKeyedValues6.getClass();
        boolean boolean12 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues6);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (-1.0d));
        java.lang.Object obj16 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, 0.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (java.lang.Number) (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultKeyedValues2D0.getRowCount();
        java.util.List list8 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        defaultKeyedValues0.clear();
        java.lang.Number number18 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, number18);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues10.getKeys();
        java.util.List list29 = defaultKeyedValues10.getKeys();
        defaultKeyedValues10.insertValue(1, (java.lang.Comparable) 10, 100.0d);
        org.jfree.chart.util.SortOrder sortOrder34 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByValues(sortOrder34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj4 = null;
        boolean boolean5 = defaultKeyedValues2D1.equals(obj4);
        java.lang.Object obj6 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        defaultKeyedValues0.clear();
        java.lang.Number number18 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, number18);
        java.lang.Object obj20 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 4);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 52.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(5, (java.lang.Comparable) 10, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Number number7 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', number7);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int13 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 10L);
        int int14 = defaultKeyedValues2D11.getColumnCount();
        defaultKeyedValues2D11.removeColumn((java.lang.Comparable) (short) -1);
        int int18 = defaultKeyedValues2D11.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list19 = defaultKeyedValues2D11.getColumnKeys();
        defaultKeyedValues2D11.removeColumn((java.lang.Comparable) "hi!");
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) "hi!");
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 10.0f);
        org.jfree.chart.util.SortOrder sortOrder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        java.util.List list14 = defaultKeyedValues2D3.getRowKeys();
        int int16 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) ' ');
        int int18 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues2D3.getValue(3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues0.getItemCount();
        boolean boolean13 = defaultKeyedValues0.equals((java.lang.Object) true);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 0.0f, (double) 100L);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) "hi!", (double) (short) -1);
        java.lang.Number number23 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, number23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj14 = defaultKeyedValues2D13.clone();
        int int16 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj17 = defaultKeyedValues2D13.clone();
        defaultKeyedValues2D13.clear();
        boolean boolean19 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D13);
        defaultKeyedValues2D13.removeColumn((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) (short) 0);
        java.lang.Object obj26 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (java.lang.Number) 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj14 = defaultKeyedValues2D13.clone();
        int int16 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj17 = defaultKeyedValues2D13.clone();
        int int19 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D13.removeColumn((java.lang.Comparable) (byte) 100);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1L);
        java.lang.Object obj31 = defaultKeyedValues0.clone();
        int int32 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj33 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues2D1.equals(obj5);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D1.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 5, 0.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D8.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        java.util.List list18 = defaultKeyedValues2D8.getColumnKeys();
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeRow((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        int int7 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1.0f);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        int int15 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '4', (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.setValue((java.lang.Number) 0.0d, comparable15, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn(0);
        java.lang.Object obj16 = defaultKeyedValues2D1.clone();
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(comparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        int int7 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1.0f);
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D0.getValue((java.lang.Comparable) false, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int14 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean15 = defaultKeyedValues10.equals((java.lang.Object) int14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean20 = defaultKeyedValues10.equals((java.lang.Object) int19);
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues10.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        boolean boolean30 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues10);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (byte) -1);
        java.util.List list33 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues1 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int5 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean6 = defaultKeyedValues1.equals((java.lang.Object) int5);
        java.lang.Object obj7 = defaultKeyedValues1.clone();
        defaultKeyedValues1.setValue((java.lang.Comparable) 0L, (java.lang.Number) 0.0d);
        boolean boolean11 = defaultKeyedValues2D0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 1L, (java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.removeValue((java.lang.Comparable) (short) 0);
        int int20 = defaultKeyedValues16.getIndex((java.lang.Comparable) false);
        java.lang.Object obj21 = null;
        boolean boolean22 = defaultKeyedValues16.equals(obj21);
        defaultKeyedValues16.setValue((java.lang.Comparable) 0, (double) (-1));
        int int26 = defaultKeyedValues16.getItemCount();
        defaultKeyedValues16.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues16.clear();
        int int32 = defaultKeyedValues16.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D34 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int36 = defaultKeyedValues2D34.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list37 = defaultKeyedValues2D34.getRowKeys();
        defaultKeyedValues2D34.clear();
        boolean boolean40 = defaultKeyedValues2D34.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D34.clear();
        boolean boolean42 = defaultKeyedValues16.equals((java.lang.Object) defaultKeyedValues2D34);
        defaultKeyedValues2D34.removeColumn((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D34.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 2, (java.lang.Comparable) 100L);
        java.lang.Object obj49 = defaultKeyedValues2D34.clone();
        java.util.List list50 = defaultKeyedValues2D34.getColumnKeys();
        boolean boolean51 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D34);
        java.util.List list52 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 100L);
        defaultKeyedValues0.insertValue(3, (java.lang.Comparable) (short) 0, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (-1.0d));
        java.lang.Comparable comparable19 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (double) 100);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + false + "'", comparable19, false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) (byte) -1);
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D1.getValue(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        int int11 = defaultKeyedValues2D0.getRowCount();
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        java.lang.Object obj22 = null;
        boolean boolean23 = defaultKeyedValues20.equals(obj22);
        defaultKeyedValues20.clear();
        java.util.List list25 = defaultKeyedValues20.getKeys();
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) (short) 0, (java.lang.Number) (byte) -1);
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultKeyedValues0.getValue((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D1.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        int int12 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10L, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable8 = defaultKeyedValues2D1.getColumnKey((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.removeValue((java.lang.Comparable) (short) 0);
        int int13 = defaultKeyedValues9.getIndex((java.lang.Comparable) false);
        defaultKeyedValues9.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list20 = defaultKeyedValues17.getKeys();
        boolean boolean21 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues17);
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj26 = defaultKeyedValues2D25.clone();
        int int28 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj29 = defaultKeyedValues2D25.clone();
        java.util.List list30 = defaultKeyedValues2D25.getColumnKeys();
        java.lang.Object obj31 = defaultKeyedValues2D25.clone();
        boolean boolean32 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues2D25);
        boolean boolean33 = defaultKeyedValues2D1.equals((java.lang.Object) boolean32);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 1L);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 3, (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0f + "'", comparable8, 10.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable20 = defaultKeyedValues0.getKey(0);
        java.util.List list21 = defaultKeyedValues0.getKeys();
        java.lang.Object obj22 = defaultKeyedValues0.clone();
        java.lang.Comparable comparable24 = defaultKeyedValues0.getKey((int) (byte) 1);
        int int26 = defaultKeyedValues0.getIndex((java.lang.Comparable) 'a');
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (double) (short) 100);
        org.jfree.chart.util.SortOrder sortOrder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) 0 + "'", comparable24, (byte) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10, (java.lang.Comparable) false, (java.lang.Comparable) "");
        defaultKeyedValues2D0.clear();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 4, (java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        int int21 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj22 = defaultKeyedValues2D18.clone();
        int int24 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D18.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) (byte) 100);
        int int31 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) ' ');
        int int32 = defaultKeyedValues2D18.getColumnCount();
        defaultKeyedValues2D18.clear();
        java.util.List list34 = defaultKeyedValues2D18.getRowKeys();
        boolean boolean35 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) '#');
        java.lang.Object obj38 = defaultKeyedValues2D18.clone();
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        int int10 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getColumnKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) "hi!");
        int int12 = defaultKeyedValues2D1.getRowCount();
        int int13 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getColumnKeys();
        int int6 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 10.0d);
        int int18 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (short) -1);
        int int22 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int9 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0L);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1L));
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100);
        defaultKeyedValues2D0.removeRow(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        java.util.List list13 = defaultKeyedValues2D8.getColumnKeys();
        int int15 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        java.util.List list27 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 5, 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) ' ');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (double) 10L);
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues0.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable20 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable24 = defaultKeyedValues0.getKey((int) (short) 0);
        java.lang.Comparable comparable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable25, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (-1L) + "'", comparable24, (-1L));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.clear();
        int int8 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 2);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 6, (java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.clear();
        java.util.List list16 = defaultKeyedValues2D0.getColumnKeys();
        int int17 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) (short) -1);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        int int5 = defaultKeyedValues2D1.getRowCount();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) "hi!");
        int int8 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int13 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list14 = defaultKeyedValues2D11.getRowKeys();
        defaultKeyedValues2D11.clear();
        int int17 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list18 = defaultKeyedValues2D11.getRowKeys();
        java.util.List list19 = defaultKeyedValues2D11.getColumnKeys();
        defaultKeyedValues2D11.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
        int int23 = defaultKeyedValues2D11.getRowCount();
        int int24 = defaultKeyedValues2D11.getRowCount();
        java.util.List list25 = defaultKeyedValues2D11.getColumnKeys();
        boolean boolean26 = defaultKeyedValues2D1.equals((java.lang.Object) list25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (java.lang.Number) 0.0d);
        int int10 = defaultKeyedValues0.getItemCount();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) 1L);
        java.lang.Number number16 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, number16);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (double) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues0.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) 100L);
        java.lang.Object obj23 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues0.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int11 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getColumnKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int15 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        java.lang.Number number10 = null;
        defaultKeyedValues2D1.setValue(number10, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D1.getValue(6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1L));
        defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues0.getItemCount();
        boolean boolean13 = defaultKeyedValues0.equals((java.lang.Object) true);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) 10.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        int int13 = defaultKeyedValues12.getItemCount();
        java.lang.Object obj14 = null;
        boolean boolean15 = defaultKeyedValues12.equals(obj14);
        defaultKeyedValues12.clear();
        defaultKeyedValues12.clear();
        defaultKeyedValues12.addValue((java.lang.Comparable) false, (double) ' ');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list24 = defaultKeyedValues21.getKeys();
        defaultKeyedValues21.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues21.clear();
        int int29 = defaultKeyedValues21.getItemCount();
        java.lang.Class<?> wildcardClass30 = defaultKeyedValues21.getClass();
        boolean boolean31 = defaultKeyedValues12.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = defaultKeyedValues2D0.equals((java.lang.Object) wildcardClass30);
        int int34 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = defaultKeyedValues2D0.getValue(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues10.getKeys();
        int int30 = defaultKeyedValues10.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues10.setValue((java.lang.Comparable) 1L, (java.lang.Number) (byte) -1);
        int int35 = defaultKeyedValues10.getIndex((java.lang.Comparable) 3);
        java.util.List list36 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int40 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) 10L);
        int int41 = defaultKeyedValues2D38.getColumnCount();
        defaultKeyedValues2D38.removeColumn((java.lang.Comparable) (short) -1);
        int int45 = defaultKeyedValues2D38.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list46 = defaultKeyedValues2D38.getColumnKeys();
        int int48 = defaultKeyedValues2D38.getRowIndex((java.lang.Comparable) 100.0f);
        int int50 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) (short) 0);
        boolean boolean51 = defaultKeyedValues10.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D8.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int13 = defaultKeyedValues2D8.getRowCount();
        boolean boolean14 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.lang.Number number15 = null;
        defaultKeyedValues2D8.addValue(number15, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 2);
        int int19 = defaultKeyedValues2D8.getRowCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) '#');
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) "hi!");
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 100);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        int int14 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.clear();
        java.util.List list16 = defaultKeyedValues13.getKeys();
        java.util.List list17 = defaultKeyedValues13.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean20 = defaultKeyedValues13.equals((java.lang.Object) true);
        int int22 = defaultKeyedValues13.getIndex((java.lang.Comparable) 1.0d);
        boolean boolean23 = defaultKeyedValues2D1.equals((java.lang.Object) 1.0d);
        java.lang.Number number24 = null;
        defaultKeyedValues2D1.addValue(number24, (java.lang.Comparable) (-1L), (java.lang.Comparable) (-1L));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues28.removeValue((java.lang.Comparable) (short) 0);
        int int32 = defaultKeyedValues28.getIndex((java.lang.Comparable) false);
        defaultKeyedValues28.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues36.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list39 = defaultKeyedValues36.getKeys();
        boolean boolean40 = defaultKeyedValues28.equals((java.lang.Object) defaultKeyedValues36);
        defaultKeyedValues28.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        java.lang.Object obj44 = defaultKeyedValues28.clone();
        defaultKeyedValues28.addValue((java.lang.Comparable) 3, (java.lang.Number) 0L);
        boolean boolean48 = defaultKeyedValues2D1.equals((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues8.setValue((java.lang.Comparable) (short) 10, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues8.insertValue((int) (byte) 10, (java.lang.Comparable) (short) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) (byte) -1);
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D1.getRowKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        java.lang.Object obj19 = null;
        boolean boolean20 = defaultKeyedValues14.equals(obj19);
        defaultKeyedValues14.setValue((java.lang.Comparable) 0, (double) (-1));
        int int24 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues14.clear();
        int int30 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int34 = defaultKeyedValues2D32.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list35 = defaultKeyedValues2D32.getRowKeys();
        defaultKeyedValues2D32.clear();
        boolean boolean38 = defaultKeyedValues2D32.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D32.clear();
        boolean boolean40 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues2D32);
        int int41 = defaultKeyedValues2D32.getColumnCount();
        boolean boolean42 = defaultKeyedValues0.equals((java.lang.Object) int41);
        int int44 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.clear();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0f));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues11.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues11.clear();
        defaultKeyedValues11.setValue((java.lang.Comparable) ' ', (java.lang.Number) 10.0d);
        defaultKeyedValues11.setValue((java.lang.Comparable) 100L, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues11);
        java.lang.Comparable comparable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 6, comparable26, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.util.List list14 = defaultKeyedValues0.getKeys();
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) ' ', (java.lang.Comparable) 0.0d);
        int int17 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        java.util.List list14 = defaultKeyedValues2D3.getRowKeys();
        int int16 = defaultKeyedValues2D3.getRowIndex((java.lang.Comparable) 100);
        int int18 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list22 = defaultKeyedValues19.getKeys();
        defaultKeyedValues19.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues19.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int29 = defaultKeyedValues19.getItemCount();
        java.lang.Object obj30 = defaultKeyedValues19.clone();
        java.lang.Object obj31 = defaultKeyedValues19.clone();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        boolean boolean33 = defaultKeyedValues2D3.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int4 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int11 = defaultKeyedValues2D9.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list12 = defaultKeyedValues2D9.getRowKeys();
        boolean boolean14 = defaultKeyedValues2D9.equals((java.lang.Object) (-1.0f));
        int int15 = defaultKeyedValues2D9.getColumnCount();
        java.util.List list16 = defaultKeyedValues2D9.getRowKeys();
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) list16);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (byte) 0);
        java.lang.Number number22 = defaultKeyedValues0.getValue((int) (short) 0);
        java.util.List list23 = defaultKeyedValues0.getKeys();
        java.util.List list24 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues0.getValue((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + (byte) 0 + "'", number22, (byte) 0);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues10.getKeys();
        int int30 = defaultKeyedValues10.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues10.setValue((java.lang.Comparable) 1L, (java.lang.Number) (byte) -1);
        int int35 = defaultKeyedValues10.getIndex((java.lang.Comparable) 3);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 5);
        defaultKeyedValues10.insertValue((int) (byte) 1, (java.lang.Comparable) (short) -1, (java.lang.Number) 1L);
        defaultKeyedValues10.setValue((java.lang.Comparable) (-1.0d), (double) 100L);
        java.lang.Object obj45 = defaultKeyedValues10.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0L);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) 0.0f, (java.lang.Number) (short) 1);
        java.lang.Object obj27 = defaultKeyedValues10.clone();
        int int29 = defaultKeyedValues10.getIndex((java.lang.Comparable) 100L);
        defaultKeyedValues10.clear();
        int int32 = defaultKeyedValues10.getIndex((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) "", (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        java.util.List list4 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (double) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        java.lang.Object obj22 = null;
        boolean boolean23 = defaultKeyedValues20.equals(obj22);
        defaultKeyedValues20.clear();
        java.util.List list25 = defaultKeyedValues20.getKeys();
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) (short) 0, (java.lang.Number) (byte) -1);
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (double) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) (short) 1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1L, (double) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn(0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj20 = defaultKeyedValues2D16.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D16);
        int int22 = defaultKeyedValues2D1.getRowCount();
        int int23 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
        int int6 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj8 = defaultKeyedValues2D7.clone();
        defaultKeyedValues2D7.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D7.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int16 = defaultKeyedValues2D7.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list20 = defaultKeyedValues17.getKeys();
        boolean boolean21 = defaultKeyedValues2D7.equals((java.lang.Object) list20);
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) boolean21);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (double) 100.0f);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) (byte) 0);
        java.lang.Number number12 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, number12);
        java.util.List list14 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (java.lang.Number) 0.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj20 = defaultKeyedValues2D16.clone();
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        defaultKeyedValues0.removeValue((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn(0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj20 = defaultKeyedValues2D16.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D16);
        java.util.List list22 = defaultKeyedValues2D1.getRowKeys();
        int int24 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (-1), (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) 10L);
        int int14 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (short) 10);
        java.lang.Object obj16 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) "hi!");
        java.util.List list20 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D22.clear();
        int int25 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean30 = defaultKeyedValues2D22.equals((java.lang.Object) defaultKeyedValues26);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int35 = defaultKeyedValues2D33.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean36 = defaultKeyedValues31.equals((java.lang.Object) int35);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D37 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj38 = defaultKeyedValues2D37.clone();
        int int40 = defaultKeyedValues2D37.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean41 = defaultKeyedValues31.equals((java.lang.Object) int40);
        defaultKeyedValues31.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues31.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues31.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        boolean boolean51 = defaultKeyedValues2D22.equals((java.lang.Object) defaultKeyedValues31);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues52 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D54 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int56 = defaultKeyedValues2D54.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean57 = defaultKeyedValues52.equals((java.lang.Object) int56);
        java.lang.Object obj58 = defaultKeyedValues52.clone();
        defaultKeyedValues52.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues52.setValue((java.lang.Comparable) 'a', (double) 100);
        defaultKeyedValues52.addValue((java.lang.Comparable) (byte) 100, (double) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D67 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj68 = defaultKeyedValues2D67.clone();
        defaultKeyedValues2D67.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D67.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D67.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        boolean boolean77 = defaultKeyedValues52.equals((java.lang.Object) defaultKeyedValues2D67);
        java.util.List list78 = defaultKeyedValues52.getKeys();
        boolean boolean79 = defaultKeyedValues31.equals((java.lang.Object) defaultKeyedValues52);
        java.util.List list80 = defaultKeyedValues52.getKeys();
        boolean boolean81 = defaultKeyedValues2D0.equals((java.lang.Object) list80);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        java.lang.Object obj22 = null;
        boolean boolean23 = defaultKeyedValues20.equals(obj22);
        defaultKeyedValues20.clear();
        java.util.List list25 = defaultKeyedValues20.getKeys();
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) (short) 0, (java.lang.Number) (byte) -1);
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (double) 0.0f);
        java.lang.Object obj36 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (-1.0f));
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) (short) -1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) -1);
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 4, (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 10);
        int int17 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 10L, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 1L);
        int int11 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj12 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D11.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj19 = defaultKeyedValues2D11.clone();
        java.util.List list20 = defaultKeyedValues2D11.getColumnKeys();
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues2D11.getValue(comparable22, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 4);
        java.lang.Object obj7 = defaultKeyedValues2D1.clone();
        int int9 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1.0d));
        java.util.List list10 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D1.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int14 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean15 = defaultKeyedValues10.equals((java.lang.Object) int14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean20 = defaultKeyedValues10.equals((java.lang.Object) int19);
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues10.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        boolean boolean30 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int35 = defaultKeyedValues2D33.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean36 = defaultKeyedValues31.equals((java.lang.Object) int35);
        java.lang.Object obj37 = defaultKeyedValues31.clone();
        defaultKeyedValues31.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues31.setValue((java.lang.Comparable) 'a', (double) 100);
        defaultKeyedValues31.addValue((java.lang.Comparable) (byte) 100, (double) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D46 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj47 = defaultKeyedValues2D46.clone();
        defaultKeyedValues2D46.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D46.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D46.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        boolean boolean56 = defaultKeyedValues31.equals((java.lang.Object) defaultKeyedValues2D46);
        java.util.List list57 = defaultKeyedValues31.getKeys();
        boolean boolean58 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues31);
        java.util.List list59 = defaultKeyedValues31.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D60 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj61 = defaultKeyedValues2D60.clone();
        int int63 = defaultKeyedValues2D60.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj64 = defaultKeyedValues2D60.clone();
        int int66 = defaultKeyedValues2D60.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D60.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D60.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D60.clear();
        java.util.List list73 = defaultKeyedValues2D60.getRowKeys();
        boolean boolean74 = defaultKeyedValues31.equals((java.lang.Object) defaultKeyedValues2D60);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D60.removeRow((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int14 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean15 = defaultKeyedValues10.equals((java.lang.Object) int14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean20 = defaultKeyedValues10.equals((java.lang.Object) int19);
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues10.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        boolean boolean30 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int35 = defaultKeyedValues2D33.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean36 = defaultKeyedValues31.equals((java.lang.Object) int35);
        java.lang.Object obj37 = defaultKeyedValues31.clone();
        defaultKeyedValues31.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues31.setValue((java.lang.Comparable) 'a', (double) 100);
        defaultKeyedValues31.addValue((java.lang.Comparable) (byte) 100, (double) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D46 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj47 = defaultKeyedValues2D46.clone();
        defaultKeyedValues2D46.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D46.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D46.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        boolean boolean56 = defaultKeyedValues31.equals((java.lang.Object) defaultKeyedValues2D46);
        java.util.List list57 = defaultKeyedValues31.getKeys();
        boolean boolean58 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues31);
        defaultKeyedValues31.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number63 = defaultKeyedValues31.getValue((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list4 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues2D0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) (short) 10, (double) 0L);
        defaultKeyedValues10.removeValue((int) (byte) 1);
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByValues(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list10 = defaultKeyedValues2D1.getRowKeys();
        int int11 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 0L, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0L);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) 0.0f, (java.lang.Number) (short) 1);
        java.lang.Object obj27 = null;
        boolean boolean28 = defaultKeyedValues10.equals(obj27);
        defaultKeyedValues10.addValue((java.lang.Comparable) (short) 0, (double) 0.0f);
        org.jfree.chart.util.SortOrder sortOrder32 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByValues(sortOrder32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        defaultKeyedValues0.removeValue(1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0.0d);
        java.lang.Object obj30 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues2D1.equals(obj5);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int12 = defaultKeyedValues2D10.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D10.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) true);
        boolean boolean21 = defaultKeyedValues2D10.equals((java.lang.Object) defaultKeyedValues2D17);
        java.util.List list22 = defaultKeyedValues2D17.getColumnKeys();
        int int24 = defaultKeyedValues2D17.getRowIndex((java.lang.Comparable) 10);
        int int25 = defaultKeyedValues2D17.getRowCount();
        boolean boolean26 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D17);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) 5, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (java.lang.Number) 0.0d);
        java.lang.Comparable comparable11 = defaultKeyedValues0.getKey((int) (short) 0);
        java.util.List list12 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj14 = defaultKeyedValues2D13.clone();
        defaultKeyedValues2D13.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D13.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int22 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) (byte) 100);
        int int24 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 1);
        java.util.List list25 = defaultKeyedValues2D13.getColumnKeys();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D13);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) 10.0d, (java.lang.Number) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0L + "'", comparable11, 0L);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj14 = defaultKeyedValues2D13.clone();
        defaultKeyedValues2D13.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D13.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D13.removeColumn((int) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int27 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean28 = defaultKeyedValues23.equals((java.lang.Object) int27);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj30 = defaultKeyedValues2D29.clone();
        int int32 = defaultKeyedValues2D29.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean33 = defaultKeyedValues23.equals((java.lang.Object) int32);
        defaultKeyedValues23.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues23.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues23.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues23.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        boolean boolean46 = defaultKeyedValues2D13.equals((java.lang.Object) 100.0f);
        java.lang.Object obj47 = defaultKeyedValues2D13.clone();
        boolean boolean48 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D13);
        java.lang.Object obj49 = defaultKeyedValues2D13.clone();
        java.util.List list50 = defaultKeyedValues2D13.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        int int9 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, 100.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int27 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list28 = defaultKeyedValues2D25.getRowKeys();
        defaultKeyedValues2D25.clear();
        boolean boolean31 = defaultKeyedValues2D25.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D25.clear();
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D25);
        int int35 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) ' ');
        defaultKeyedValues2D25.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues37 = new org.jfree.data.DefaultKeyedValues();
        int int38 = defaultKeyedValues37.getItemCount();
        java.lang.Object obj39 = null;
        boolean boolean40 = defaultKeyedValues37.equals(obj39);
        defaultKeyedValues37.clear();
        defaultKeyedValues37.clear();
        defaultKeyedValues37.addValue((java.lang.Comparable) false, (double) ' ');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues46 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues46.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list49 = defaultKeyedValues46.getKeys();
        defaultKeyedValues46.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues46.clear();
        int int54 = defaultKeyedValues46.getItemCount();
        java.lang.Class<?> wildcardClass55 = defaultKeyedValues46.getClass();
        boolean boolean56 = defaultKeyedValues37.equals((java.lang.Object) wildcardClass55);
        defaultKeyedValues37.removeValue((java.lang.Comparable) (short) -1);
        defaultKeyedValues37.addValue((java.lang.Comparable) 0.0f, (double) 10L);
        defaultKeyedValues37.clear();
        java.util.List list63 = defaultKeyedValues37.getKeys();
        boolean boolean64 = defaultKeyedValues2D25.equals((java.lang.Object) list63);
        java.util.List list65 = defaultKeyedValues2D25.getRowKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) 3);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (double) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 100.0f);
        java.util.List list14 = defaultKeyedValues0.getKeys();
        int int15 = defaultKeyedValues0.getItemCount();
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D18.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj26 = defaultKeyedValues2D18.clone();
        int int28 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) "");
        int int29 = defaultKeyedValues2D18.getRowCount();
        int int31 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) false);
        defaultKeyedValues2D18.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 10L, (java.lang.Comparable) 1.0d);
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) 1.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj20 = defaultKeyedValues2D16.clone();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        java.lang.Object obj22 = defaultKeyedValues2D16.clone();
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        int int24 = defaultKeyedValues2D16.getRowCount();
        java.util.List list25 = defaultKeyedValues2D16.getColumnKeys();
        defaultKeyedValues2D16.setValue((java.lang.Number) 10L, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D31 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int32 = defaultKeyedValues2D31.getColumnCount();
        java.lang.Object obj33 = defaultKeyedValues2D31.clone();
        defaultKeyedValues2D31.clear();
        boolean boolean35 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues2D31);
        java.util.List list36 = defaultKeyedValues2D31.getRowKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int17 = defaultKeyedValues2D15.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean18 = defaultKeyedValues13.equals((java.lang.Object) int17);
        java.lang.Object obj19 = defaultKeyedValues13.clone();
        java.lang.Object obj20 = defaultKeyedValues13.clone();
        defaultKeyedValues13.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10.0f);
        boolean boolean24 = defaultKeyedValues2D0.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) 0L, (java.lang.Comparable) ' ');
        int int30 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        int int8 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable10 = defaultKeyedValues2D0.getColumnKey(0);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.util.List list14 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 10L);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1);
        int int21 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 3);
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int11 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getRowCount();
        boolean boolean14 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 100);
        java.util.List list15 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100);
        int int19 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0, (java.lang.Comparable) 0L, (java.lang.Comparable) 52.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) "hi!");
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        java.lang.Comparable comparable17 = defaultKeyedValues2D0.getColumnKey(1);
        java.lang.Object obj18 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "hi!" + "'", comparable17, "hi!");
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (-1.0d));
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.clear();
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        int int15 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj11 = defaultKeyedValues2D10.clone();
        defaultKeyedValues2D10.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D10.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj18 = defaultKeyedValues2D10.clone();
        int int20 = defaultKeyedValues2D10.getColumnIndex((java.lang.Comparable) "");
        int int21 = defaultKeyedValues2D10.getRowCount();
        java.lang.Object obj22 = defaultKeyedValues2D10.clone();
        defaultKeyedValues2D10.addValue((java.lang.Number) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) "hi!");
        boolean boolean27 = defaultKeyedValues0.equals((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues0.getValue((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        java.lang.Comparable comparable13 = defaultKeyedValues2D0.getRowKey(0);
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1.0d) + "'", comparable13, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0d);
        java.lang.Comparable comparable10 = null;
        defaultKeyedValues2D0.removeColumn(comparable10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int3 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 100, (java.lang.Comparable) 0L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        java.util.List list10 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D1.getColumnKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D1.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 100, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeRow(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable20 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        java.lang.Object obj26 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0f);
        int int25 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, 10.0d);
        int int12 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int17 = defaultKeyedValues2D15.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean18 = defaultKeyedValues13.equals((java.lang.Object) int17);
        java.lang.Object obj19 = defaultKeyedValues13.clone();
        defaultKeyedValues13.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues13.setValue((java.lang.Comparable) 'a', (double) 100);
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 100, (double) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D28 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj29 = defaultKeyedValues2D28.clone();
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D28.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        boolean boolean38 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues2D28);
        int int39 = defaultKeyedValues2D28.getRowCount();
        defaultKeyedValues2D28.clear();
        boolean boolean41 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 100.0f);
        java.util.List list14 = defaultKeyedValues0.getKeys();
        int int15 = defaultKeyedValues0.getItemCount();
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        int int18 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 4);
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 52.0d, (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        int int12 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 0);
        java.lang.Object obj15 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int14 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) '#', (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) 6, (java.lang.Comparable) 52.0d, (java.lang.Comparable) ' ');
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) '#', (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Number number11 = null;
        defaultKeyedValues2D0.addValue(number11, (java.lang.Comparable) (short) 0, (java.lang.Comparable) ' ');
        java.lang.Comparable comparable16 = defaultKeyedValues2D0.getColumnKey((int) (short) 1);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + ' ' + "'", comparable16, ' ');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (-1.0d) + "'", comparable18, (-1.0d));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Number number3 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) "", number3);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 1);
        int int10 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) "hi!", (java.lang.Comparable) 10);
        java.util.List list19 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.util.List list13 = defaultKeyedValues2D0.getColumnKeys();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) '#', (java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowCount();
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int16 = defaultKeyedValues2D14.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D14.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0d);
        java.util.List list21 = defaultKeyedValues2D14.getColumnKeys();
        boolean boolean22 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 10);
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0f));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues11.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues11.clear();
        defaultKeyedValues11.setValue((java.lang.Comparable) ' ', (java.lang.Number) 10.0d);
        defaultKeyedValues11.setValue((java.lang.Comparable) 100L, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues11);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj26 = defaultKeyedValues2D1.clone();
        java.lang.Object obj27 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) 10L);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 1L, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 1.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int17 = defaultKeyedValues2D15.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list18 = defaultKeyedValues2D15.getRowKeys();
        defaultKeyedValues2D15.clear();
        int int21 = defaultKeyedValues2D15.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list22 = defaultKeyedValues2D15.getRowKeys();
        java.util.List list23 = defaultKeyedValues2D15.getColumnKeys();
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D15.removeColumn((java.lang.Comparable) (short) 100);
        boolean boolean29 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D15);
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 1, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj15 = defaultKeyedValues2D14.clone();
        int int17 = defaultKeyedValues2D14.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj18 = defaultKeyedValues2D14.clone();
        int int20 = defaultKeyedValues2D14.getColumnIndex((java.lang.Comparable) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int24 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) 10L);
        int int25 = defaultKeyedValues2D22.getColumnCount();
        defaultKeyedValues2D22.removeColumn((java.lang.Comparable) (short) -1);
        java.lang.Number number28 = null;
        defaultKeyedValues2D22.addValue(number28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 1);
        int int32 = defaultKeyedValues2D22.getRowCount();
        java.lang.Object obj33 = defaultKeyedValues2D22.clone();
        boolean boolean34 = defaultKeyedValues2D14.equals(obj33);
        boolean boolean35 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D14);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        java.lang.Object obj22 = null;
        boolean boolean23 = defaultKeyedValues20.equals(obj22);
        defaultKeyedValues20.clear();
        java.util.List list25 = defaultKeyedValues20.getKeys();
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) (short) 0, (java.lang.Number) (byte) -1);
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) '#', (double) 'a');
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D35.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int40 = defaultKeyedValues2D35.getRowCount();
        boolean boolean42 = defaultKeyedValues2D35.equals((java.lang.Object) 10.0f);
        int int44 = defaultKeyedValues2D35.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D35.clear();
        java.util.List list46 = defaultKeyedValues2D35.getRowKeys();
        int int48 = defaultKeyedValues2D35.getColumnIndex((java.lang.Comparable) 1.0f);
        boolean boolean49 = defaultKeyedValues20.equals((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues20.insertValue((int) (byte) -1, (java.lang.Comparable) false, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        int int11 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int14 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list15 = defaultKeyedValues2D12.getRowKeys();
        defaultKeyedValues2D12.clear();
        boolean boolean17 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D12);
        java.lang.Number number18 = null;
        defaultKeyedValues2D12.setValue(number18, (java.lang.Comparable) 0, (java.lang.Comparable) (byte) 100);
        int int23 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) (byte) 10);
        java.lang.Number number26 = defaultKeyedValues0.getValue((int) (short) 0);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list32 = defaultKeyedValues29.getKeys();
        defaultKeyedValues29.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues29.clear();
        int int37 = defaultKeyedValues29.getItemCount();
        java.lang.Class<?> wildcardClass38 = defaultKeyedValues29.getClass();
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) wildcardClass38);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) (-1.0f));
        java.util.List list43 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D45 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int47 = defaultKeyedValues2D45.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list48 = defaultKeyedValues2D45.getRowKeys();
        boolean boolean50 = defaultKeyedValues2D45.equals((java.lang.Object) (-1.0f));
        int int51 = defaultKeyedValues2D45.getColumnCount();
        int int53 = defaultKeyedValues2D45.getRowIndex((java.lang.Comparable) (-1));
        int int55 = defaultKeyedValues2D45.getRowIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D45.removeColumn((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D45.setValue((java.lang.Number) 10, (java.lang.Comparable) 5, (java.lang.Comparable) 100);
        boolean boolean62 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D45);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (short) 0 + "'", number26, (short) 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) 3);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        int int14 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.clear();
        defaultKeyedValues13.removeValue((java.lang.Comparable) 1.0d);
        int int19 = defaultKeyedValues13.getIndex((java.lang.Comparable) 100.0f);
        java.util.List list20 = defaultKeyedValues13.getKeys();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues13);
        int int23 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) 5, (java.lang.Comparable) true, (java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        int int13 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
        int int13 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) "", (java.lang.Comparable) 0);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0, (java.lang.Comparable) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100, (java.lang.Comparable) 10.0d);
        int int19 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 0);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues2D1.equals(obj5);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D7.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D7.removeColumn((java.lang.Comparable) 1);
        java.util.List list14 = defaultKeyedValues2D7.getColumnKeys();
        boolean boolean15 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D7);
        defaultKeyedValues2D1.clear();
        java.util.List list17 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list18 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) '#', (java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeRow(1);
        java.lang.Object obj21 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        int int23 = defaultKeyedValues22.getItemCount();
        java.lang.Number number25 = null;
        defaultKeyedValues22.addValue((java.lang.Comparable) "", number25);
        int int27 = defaultKeyedValues22.getItemCount();
        defaultKeyedValues22.setValue((java.lang.Comparable) 3, (java.lang.Number) (short) 1);
        defaultKeyedValues22.addValue((java.lang.Comparable) 10.0d, (double) 1L);
        java.lang.Object obj34 = defaultKeyedValues22.clone();
        boolean boolean35 = defaultKeyedValues2D0.equals(obj34);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 0.0f);
        int int24 = defaultKeyedValues0.getItemCount();
        java.util.List list25 = defaultKeyedValues0.getKeys();
        java.lang.Number number27 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1L));
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + (-1) + "'", number27, (-1));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        int int16 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) ' ');
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) false);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        java.util.List list8 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) (short) -1);
        java.util.List list12 = defaultKeyedValues0.getKeys();
        java.util.List list13 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Number number3 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) "", number3);
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (byte) 1);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0L);
        defaultKeyedValues10.addValue((java.lang.Comparable) 0.0d, (java.lang.Number) 0);
        java.lang.Number number27 = null;
        defaultKeyedValues10.setValue((java.lang.Comparable) 2, number27);
        int int29 = defaultKeyedValues10.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) "", (java.lang.Comparable) 0);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 1);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        int int5 = defaultKeyedValues2D1.getRowCount();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D1.getValue(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        int int13 = defaultKeyedValues0.getItemCount();
        java.util.List list14 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int18 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list19 = defaultKeyedValues2D16.getRowKeys();
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int23 = defaultKeyedValues2D16.getColumnCount();
        defaultKeyedValues2D16.clear();
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultKeyedValues0.getValue((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.util.List list14 = defaultKeyedValues2D13.getRowKeys();
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) 100, (java.lang.Comparable) false);
        defaultKeyedValues2D13.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) ' ', (java.lang.Comparable) (short) 1);
        java.lang.Object obj22 = defaultKeyedValues2D13.clone();
        boolean boolean23 = defaultKeyedValues0.equals(obj22);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues24 = new org.jfree.data.DefaultKeyedValues();
        int int25 = defaultKeyedValues24.getItemCount();
        defaultKeyedValues24.clear();
        java.util.List list27 = defaultKeyedValues24.getKeys();
        defaultKeyedValues24.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues24.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int34 = defaultKeyedValues24.getItemCount();
        int int36 = defaultKeyedValues24.getIndex((java.lang.Comparable) 0.0d);
        int int38 = defaultKeyedValues24.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues24.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (-1.0d));
        boolean boolean42 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues24);
        java.lang.Number number44 = defaultKeyedValues24.getValue(0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + number44 + "' != '" + 100.0f + "'", number44, 100.0f);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        int int13 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        defaultKeyedValues14.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list25 = defaultKeyedValues22.getKeys();
        boolean boolean26 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues22);
        defaultKeyedValues14.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        boolean boolean30 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues14);
        int int32 = defaultKeyedValues14.getIndex((java.lang.Comparable) "");
        defaultKeyedValues14.setValue((java.lang.Comparable) 10L, (java.lang.Number) 100L);
        defaultKeyedValues14.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) "", (java.lang.Comparable) 0);
        boolean boolean16 = defaultKeyedValues2D0.equals((java.lang.Object) (-1.0f));
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 'a');
        java.util.List list21 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        java.lang.Number number7 = null;
        defaultKeyedValues2D1.addValue(number7, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue(6, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list14 = defaultKeyedValues11.getKeys();
        defaultKeyedValues11.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues11.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int21 = defaultKeyedValues11.getItemCount();
        java.lang.Object obj22 = defaultKeyedValues11.clone();
        defaultKeyedValues11.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D24 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj25 = defaultKeyedValues2D24.clone();
        int int27 = defaultKeyedValues2D24.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj28 = defaultKeyedValues2D24.clone();
        int int30 = defaultKeyedValues2D24.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D24.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D24.removeColumn((java.lang.Comparable) (byte) 100);
        boolean boolean36 = defaultKeyedValues11.equals((java.lang.Object) (byte) 100);
        defaultKeyedValues11.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 10);
        defaultKeyedValues11.removeValue((java.lang.Comparable) 1L);
        defaultKeyedValues11.setValue((java.lang.Comparable) 10, (double) 'a');
        java.lang.Class<?> wildcardClass45 = defaultKeyedValues11.getClass();
        boolean boolean46 = defaultKeyedValues2D0.equals((java.lang.Object) wildcardClass45);
        int int48 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 100);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        java.util.List list11 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), number13);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, 1.0d);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        int int14 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.clear();
        defaultKeyedValues13.removeValue((java.lang.Comparable) 1.0d);
        int int19 = defaultKeyedValues13.getIndex((java.lang.Comparable) 100.0f);
        java.util.List list20 = defaultKeyedValues13.getKeys();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues13);
        int int23 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.lang.Object obj24 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        java.lang.Object obj19 = null;
        boolean boolean20 = defaultKeyedValues14.equals(obj19);
        int int21 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (-1.0f));
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues14.removeValue((java.lang.Comparable) (-1L));
        boolean boolean29 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues14);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) (byte) 10, (double) 1.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0L);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) 0.0f, (java.lang.Number) (short) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D27 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj28 = defaultKeyedValues2D27.clone();
        int int30 = defaultKeyedValues2D27.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D27.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj33 = null;
        boolean boolean34 = defaultKeyedValues2D27.equals(obj33);
        int int35 = defaultKeyedValues2D27.getRowCount();
        int int37 = defaultKeyedValues2D27.getColumnIndex((java.lang.Comparable) "");
        java.util.List list38 = defaultKeyedValues2D27.getColumnKeys();
        boolean boolean39 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues2D27);
        defaultKeyedValues10.setValue((java.lang.Comparable) (byte) 10, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.removeValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        java.util.List list4 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (double) 1.0f);
        java.util.List list11 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 3, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0f));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues11.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues11.clear();
        defaultKeyedValues11.setValue((java.lang.Comparable) ' ', (java.lang.Number) 10.0d);
        defaultKeyedValues11.setValue((java.lang.Comparable) 100L, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues11);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj26 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues2D1.getValue((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int11 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 3);
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable11, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        int int8 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, 0.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        int int22 = defaultKeyedValues0.getItemCount();
        java.util.List list23 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) 0, (java.lang.Number) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) 10L);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) 'a');
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        int int14 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) (-1L));
        int int18 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int10 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list11 = defaultKeyedValues2D8.getRowKeys();
        defaultKeyedValues2D8.clear();
        int int14 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 1.0d);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) (byte) 100);
        java.lang.Object obj23 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (double) (-1));
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        java.util.List list3 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable12, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '#');
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0L);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) "", (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 0, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int3 = defaultKeyedValues2D1.getRowCount();
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj8 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues2D1.equals(obj5);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        int int10 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable20 = defaultKeyedValues0.getKey(0);
        java.util.List list21 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) (-1.0f));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues28.removeValue((java.lang.Comparable) (short) 0);
        int int32 = defaultKeyedValues28.getIndex((java.lang.Comparable) false);
        java.lang.Object obj33 = null;
        boolean boolean34 = defaultKeyedValues28.equals(obj33);
        defaultKeyedValues28.setValue((java.lang.Comparable) 0, (double) (-1));
        int int38 = defaultKeyedValues28.getItemCount();
        defaultKeyedValues28.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues28.clear();
        int int44 = defaultKeyedValues28.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D46 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int48 = defaultKeyedValues2D46.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list49 = defaultKeyedValues2D46.getRowKeys();
        defaultKeyedValues2D46.clear();
        boolean boolean52 = defaultKeyedValues2D46.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D46.clear();
        boolean boolean54 = defaultKeyedValues28.equals((java.lang.Object) defaultKeyedValues2D46);
        defaultKeyedValues28.addValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        java.lang.Class<?> wildcardClass58 = defaultKeyedValues28.getClass();
        boolean boolean59 = defaultKeyedValues0.equals((java.lang.Object) wildcardClass58);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues2D1.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 0.0d, (java.lang.Comparable) 'a');
        java.lang.Object obj15 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj20 = defaultKeyedValues2D16.clone();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        java.lang.Object obj22 = defaultKeyedValues2D16.clone();
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        int int24 = defaultKeyedValues2D16.getColumnCount();
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        java.lang.Object obj7 = defaultKeyedValues2D1.clone();
        int int8 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        java.lang.Number number10 = null;
        defaultKeyedValues2D1.setValue(number10, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues2D1.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int11 = defaultKeyedValues2D9.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list12 = defaultKeyedValues2D9.getRowKeys();
        boolean boolean14 = defaultKeyedValues2D9.equals((java.lang.Object) (-1.0f));
        int int15 = defaultKeyedValues2D9.getColumnCount();
        java.util.List list16 = defaultKeyedValues2D9.getRowKeys();
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) list16);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, 100.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) true);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D28 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.util.List list29 = defaultKeyedValues2D28.getRowKeys();
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) (-1L));
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) "");
        boolean boolean34 = defaultKeyedValues0.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0L);
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        java.lang.Class<?> wildcardClass12 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int14 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list15 = defaultKeyedValues2D12.getRowKeys();
        defaultKeyedValues2D12.clear();
        java.util.List list17 = defaultKeyedValues2D12.getRowKeys();
        defaultKeyedValues2D12.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0f));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues22.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues22.clear();
        defaultKeyedValues22.setValue((java.lang.Comparable) ' ', (java.lang.Number) 10.0d);
        defaultKeyedValues22.setValue((java.lang.Comparable) 100L, (java.lang.Number) 0L);
        boolean boolean35 = defaultKeyedValues2D12.equals((java.lang.Object) defaultKeyedValues22);
        defaultKeyedValues2D12.clear();
        boolean boolean37 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D12);
        int int38 = defaultKeyedValues2D12.getColumnCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2D0.equals((java.lang.Object) list13);
        java.util.List list15 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list16 = defaultKeyedValues2D0.getColumnKeys();
        int int18 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        java.lang.Comparable comparable13 = defaultKeyedValues2D0.getRowKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1.0d) + "'", comparable13, (-1.0d));
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        int int7 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) "hi!");
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultKeyedValues0.equals(obj16);
        java.lang.Comparable comparable19 = defaultKeyedValues0.getKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1L) + "'", comparable19, (-1L));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.util.List list13 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100, (java.lang.Comparable) "", (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeRow((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.clear();
        int int13 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 0L, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.clear();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 'a');
        int int11 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        int int13 = defaultKeyedValues12.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        defaultKeyedValues14.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list25 = defaultKeyedValues22.getKeys();
        boolean boolean26 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues22);
        boolean boolean27 = defaultKeyedValues12.equals((java.lang.Object) defaultKeyedValues22);
        defaultKeyedValues22.clear();
        boolean boolean29 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues22);
        defaultKeyedValues22.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj4 = null;
        boolean boolean5 = defaultKeyedValues2D1.equals(obj4);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        int int7 = defaultKeyedValues6.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        int int12 = defaultKeyedValues8.getIndex((java.lang.Comparable) false);
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list19 = defaultKeyedValues16.getKeys();
        boolean boolean20 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues16);
        boolean boolean21 = defaultKeyedValues6.equals((java.lang.Object) defaultKeyedValues16);
        defaultKeyedValues16.clear();
        boolean boolean23 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues16);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues24 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues24.removeValue((java.lang.Comparable) (short) 0);
        int int28 = defaultKeyedValues24.getIndex((java.lang.Comparable) false);
        defaultKeyedValues24.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues32 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues32.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list35 = defaultKeyedValues32.getKeys();
        boolean boolean36 = defaultKeyedValues24.equals((java.lang.Object) defaultKeyedValues32);
        defaultKeyedValues24.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        java.lang.Object obj40 = defaultKeyedValues24.clone();
        java.lang.Object obj41 = defaultKeyedValues24.clone();
        boolean boolean42 = defaultKeyedValues16.equals(obj41);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0L);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeRow((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2D0.equals((java.lang.Object) list13);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D16.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D16.removeColumn((java.lang.Comparable) 1);
        boolean boolean23 = defaultKeyedValues2D0.equals((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 52.0d, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(true);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj12 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.removeColumn((java.lang.Comparable) true);
        boolean boolean15 = defaultKeyedValues2D10.equals((java.lang.Object) true);
        boolean boolean16 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D1.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.util.List list13 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        int int21 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        int int23 = defaultKeyedValues22.getItemCount();
        defaultKeyedValues22.clear();
        java.util.List list25 = defaultKeyedValues22.getKeys();
        defaultKeyedValues22.setValue((java.lang.Comparable) 100L, (java.lang.Number) 1);
        defaultKeyedValues22.removeValue((java.lang.Comparable) 100);
        defaultKeyedValues22.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues34 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues34.removeValue((java.lang.Comparable) (short) 0);
        int int38 = defaultKeyedValues34.getIndex((java.lang.Comparable) false);
        defaultKeyedValues34.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues42 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues42.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list45 = defaultKeyedValues42.getKeys();
        boolean boolean46 = defaultKeyedValues34.equals((java.lang.Object) defaultKeyedValues42);
        defaultKeyedValues34.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues34.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable54 = defaultKeyedValues34.getKey(0);
        java.util.List list55 = defaultKeyedValues34.getKeys();
        java.lang.Object obj56 = defaultKeyedValues34.clone();
        boolean boolean57 = defaultKeyedValues22.equals(obj56);
        boolean boolean58 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues22);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + (-1L) + "'", comparable54, (-1L));
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj14 = defaultKeyedValues2D13.clone();
        int int16 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj17 = defaultKeyedValues2D13.clone();
        int int19 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D13.removeColumn((java.lang.Comparable) (byte) 100);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1L);
        java.lang.Object obj31 = defaultKeyedValues0.clone();
        int int32 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj33 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) 0L);
        int int37 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable20 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable24 = defaultKeyedValues0.getKey(2);
        java.lang.Comparable comparable26 = defaultKeyedValues0.getKey((int) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 'a', (double) 0.0f);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 1.0f, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + "hi!" + "'", comparable24, "hi!");
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (byte) 0 + "'", comparable26, (byte) 0);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) 10.0d);
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D1.getValue(3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey((int) (byte) 1);
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (-1.0d) + "'", comparable18, (-1.0d));
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (java.lang.Number) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1L, (java.lang.Number) (short) 100);
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        java.util.List list20 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 52.0d, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (java.lang.Number) 1L);
        int int13 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues0.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
        int int13 = defaultKeyedValues2D1.getRowCount();
        java.util.List list14 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D0.getValue((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 10L, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) -1);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D1.getValue(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Number number3 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) "", number3);
        defaultKeyedValues0.clear();
        java.util.List list6 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (java.lang.Number) 0.0d);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj12 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.clear();
        int int14 = defaultKeyedValues2D11.getColumnCount();
        defaultKeyedValues2D11.addValue((java.lang.Number) 1L, (java.lang.Comparable) 0, (java.lang.Comparable) ' ');
        java.lang.Object obj19 = defaultKeyedValues2D11.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues20.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues20.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues20.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues20.addValue((java.lang.Comparable) false, 10.0d);
        boolean boolean38 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues20);
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        org.jfree.chart.util.SortOrder sortOrder40 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (double) (short) 10);
        java.util.List list12 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) 10L);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues0.getValue((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) (byte) 10);
        java.lang.Number number26 = defaultKeyedValues0.getValue((int) (short) 0);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        java.lang.Comparable comparable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), comparable30, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (short) 0 + "'", number26, (short) 0);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D1.getValue((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.util.List list13 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        int int21 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj23 = defaultKeyedValues2D22.clone();
        defaultKeyedValues2D22.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D22.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D22.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        java.util.List list32 = defaultKeyedValues2D22.getColumnKeys();
        java.lang.Number number33 = null;
        defaultKeyedValues2D22.addValue(number33, (java.lang.Comparable) (short) 0, (java.lang.Comparable) ' ');
        java.lang.Comparable comparable38 = defaultKeyedValues2D22.getColumnKey((int) (short) 1);
        boolean boolean39 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + ' ' + "'", comparable38, ' ');
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int17 = defaultKeyedValues2D15.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean18 = defaultKeyedValues13.equals((java.lang.Object) int17);
        java.lang.Object obj19 = defaultKeyedValues13.clone();
        java.lang.Object obj20 = defaultKeyedValues13.clone();
        defaultKeyedValues13.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10.0f);
        boolean boolean24 = defaultKeyedValues2D0.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D0.addValue((java.lang.Number) 2, (java.lang.Comparable) 52.0d, (java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2D0.equals((java.lang.Object) list13);
        defaultKeyedValues2D0.clear();
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 'a');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) (byte) 0);
        java.util.List list17 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable18, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0d);
        int int9 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D1.getValue(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int4 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int5 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        defaultKeyedValues2D6.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D6.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D6.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D6.removeColumn((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D6.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj20 = defaultKeyedValues2D19.clone();
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D19.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D19.removeColumn((int) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D31 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int33 = defaultKeyedValues2D31.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean34 = defaultKeyedValues29.equals((java.lang.Object) int33);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj36 = defaultKeyedValues2D35.clone();
        int int38 = defaultKeyedValues2D35.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean39 = defaultKeyedValues29.equals((java.lang.Object) int38);
        defaultKeyedValues29.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues29.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues29.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues29.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        boolean boolean52 = defaultKeyedValues2D19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj53 = defaultKeyedValues2D19.clone();
        boolean boolean54 = defaultKeyedValues2D6.equals((java.lang.Object) defaultKeyedValues2D19);
        java.lang.Object obj55 = defaultKeyedValues2D19.clone();
        boolean boolean56 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number59 = defaultKeyedValues2D19.getValue((java.lang.Comparable) 1, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues10.getKeys();
        java.util.List list29 = defaultKeyedValues10.getKeys();
        defaultKeyedValues10.insertValue(1, (java.lang.Comparable) 10, 100.0d);
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D1.setValue((java.lang.Number) 3, (java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Long (java.lang.Short and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.clear();
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D24 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int26 = defaultKeyedValues2D24.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list27 = defaultKeyedValues2D24.getRowKeys();
        defaultKeyedValues2D24.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int31 = defaultKeyedValues2D24.getColumnCount();
        java.util.List list32 = defaultKeyedValues2D24.getColumnKeys();
        java.lang.Object obj33 = defaultKeyedValues2D24.clone();
        boolean boolean34 = defaultKeyedValues0.equals(obj33);
        java.util.List list35 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        int int20 = defaultKeyedValues2D17.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj21 = defaultKeyedValues2D17.clone();
        int int23 = defaultKeyedValues2D17.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list24 = defaultKeyedValues2D17.getColumnKeys();
        int int25 = defaultKeyedValues2D17.getColumnCount();
        int int26 = defaultKeyedValues2D17.getColumnCount();
        int int27 = defaultKeyedValues2D17.getColumnCount();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) int27);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (double) 4);
        java.util.List list32 = defaultKeyedValues0.getKeys();
        int int34 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D36 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int38 = defaultKeyedValues2D36.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D36.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        boolean boolean43 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 4, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (-1.0f));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        int int17 = defaultKeyedValues16.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.removeValue((java.lang.Comparable) (short) 0);
        int int22 = defaultKeyedValues18.getIndex((java.lang.Comparable) false);
        defaultKeyedValues18.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list29 = defaultKeyedValues26.getKeys();
        boolean boolean30 = defaultKeyedValues18.equals((java.lang.Object) defaultKeyedValues26);
        boolean boolean31 = defaultKeyedValues16.equals((java.lang.Object) defaultKeyedValues26);
        java.util.List list32 = defaultKeyedValues26.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj34 = defaultKeyedValues2D33.clone();
        defaultKeyedValues2D33.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D33.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean39 = defaultKeyedValues26.equals((java.lang.Object) (short) 10);
        defaultKeyedValues26.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list44 = defaultKeyedValues26.getKeys();
        int int46 = defaultKeyedValues26.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues26.setValue((java.lang.Comparable) true, (-1.0d));
        boolean boolean50 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues26);
        int int52 = defaultKeyedValues26.getIndex((java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        int int30 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) 5, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list16 = defaultKeyedValues13.getKeys();
        defaultKeyedValues13.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues13.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj23 = defaultKeyedValues13.clone();
        defaultKeyedValues13.clear();
        java.lang.Object obj25 = defaultKeyedValues13.clone();
        int int26 = defaultKeyedValues13.getItemCount();
        boolean boolean27 = defaultKeyedValues2D0.equals((java.lang.Object) int26);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj8 = defaultKeyedValues2D7.clone();
        int int10 = defaultKeyedValues2D7.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D7.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj13 = null;
        boolean boolean14 = defaultKeyedValues2D7.equals(obj13);
        int int15 = defaultKeyedValues2D7.getRowCount();
        int int16 = defaultKeyedValues2D7.getColumnCount();
        boolean boolean17 = defaultKeyedValues2D1.equals((java.lang.Object) int16);
        int int18 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) (-1), (java.lang.Comparable) '4');
        boolean boolean24 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D20);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (short) 0);
        int int20 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', 1.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        int int9 = defaultKeyedValues2D1.getRowCount();
        java.util.List list10 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D1.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        int int17 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 1);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.clear();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        java.util.List list6 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) (byte) 1, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        int int12 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        int int14 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.clear();
        java.util.List list16 = defaultKeyedValues13.getKeys();
        defaultKeyedValues13.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues13.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int23 = defaultKeyedValues13.getItemCount();
        int int25 = defaultKeyedValues13.getIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues13.addValue((java.lang.Comparable) 10.0f, (java.lang.Number) 0.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj30 = defaultKeyedValues2D29.clone();
        int int32 = defaultKeyedValues2D29.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj33 = defaultKeyedValues2D29.clone();
        boolean boolean34 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues2D29);
        int int35 = defaultKeyedValues2D29.getRowCount();
        defaultKeyedValues2D29.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) 100L);
        boolean boolean39 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D29);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (java.lang.Number) 0);
        java.lang.Number number15 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", 0.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int28 = defaultKeyedValues2D26.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list29 = defaultKeyedValues2D26.getRowKeys();
        defaultKeyedValues2D26.clear();
        java.util.List list31 = defaultKeyedValues2D26.getColumnKeys();
        int int32 = defaultKeyedValues2D26.getRowCount();
        defaultKeyedValues2D26.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) 0L);
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1.0d) + "'", number15, (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) 52.0d, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (java.lang.Number) 0.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj20 = defaultKeyedValues2D16.clone();
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        int int22 = defaultKeyedValues2D16.getRowCount();
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) 100L);
        defaultKeyedValues2D16.addValue((java.lang.Number) 1, (java.lang.Comparable) "", (java.lang.Comparable) (byte) -1);
        java.util.List list30 = defaultKeyedValues2D16.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1L);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int9 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        int int10 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int11 = defaultKeyedValues2D0.getRowCount();
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 'a');
        defaultKeyedValues2D0.removeColumn((int) (short) 0);
        java.lang.Object obj18 = defaultKeyedValues2D0.clone();
        int int20 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 0);
        int int21 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (java.lang.Number) 0.0d);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        java.util.List list3 = defaultKeyedValues2D1.getRowKeys();
        int int4 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D1.getValue(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        defaultKeyedValues10.removeValue((java.lang.Comparable) (byte) 10);
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 100.0f);
        org.jfree.chart.util.SortOrder sortOrder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByKeys(sortOrder21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        int int14 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D28 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D28.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) 1);
        java.util.List list35 = defaultKeyedValues2D28.getColumnKeys();
        defaultKeyedValues2D28.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D28.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (byte) 1);
        boolean boolean44 = defaultKeyedValues10.equals((java.lang.Object) (short) 1);
        defaultKeyedValues10.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj20 = defaultKeyedValues2D16.clone();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        java.lang.Object obj22 = defaultKeyedValues2D16.clone();
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues0.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        int int29 = defaultKeyedValues10.getIndex((java.lang.Comparable) (short) 1);
        int int30 = defaultKeyedValues10.getItemCount();
        defaultKeyedValues10.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues0.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0f);
        java.util.List list18 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 0L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) true, (java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100L);
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = defaultKeyedValues2D0.getColumnIndex(comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        java.lang.Object obj22 = null;
        boolean boolean23 = defaultKeyedValues20.equals(obj22);
        defaultKeyedValues20.clear();
        java.util.List list25 = defaultKeyedValues20.getKeys();
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) (short) 0, (java.lang.Number) (byte) -1);
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (double) 4);
        int int36 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int40 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D38.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D45 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj46 = defaultKeyedValues2D45.clone();
        defaultKeyedValues2D45.removeColumn((java.lang.Comparable) true);
        boolean boolean49 = defaultKeyedValues2D38.equals((java.lang.Object) defaultKeyedValues2D45);
        int int50 = defaultKeyedValues2D38.getColumnCount();
        defaultKeyedValues2D38.removeColumn(0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D53 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj54 = defaultKeyedValues2D53.clone();
        int int56 = defaultKeyedValues2D53.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj57 = defaultKeyedValues2D53.clone();
        boolean boolean58 = defaultKeyedValues2D38.equals((java.lang.Object) defaultKeyedValues2D53);
        boolean boolean59 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D38);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) 100, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        java.lang.Class<?> wildcardClass14 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 4, (java.lang.Comparable) true, (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) "", (java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Boolean (java.lang.String and java.lang.Boolean are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) (byte) 10);
        java.lang.Number number26 = defaultKeyedValues0.getValue((int) (short) 0);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list32 = defaultKeyedValues29.getKeys();
        defaultKeyedValues29.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues29.clear();
        int int37 = defaultKeyedValues29.getItemCount();
        java.lang.Class<?> wildcardClass38 = defaultKeyedValues29.getClass();
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) wildcardClass38);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        java.util.List list44 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D46 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int48 = defaultKeyedValues2D46.getColumnIndex((java.lang.Comparable) 10L);
        int int49 = defaultKeyedValues2D46.getColumnCount();
        defaultKeyedValues2D46.removeColumn((java.lang.Comparable) (short) -1);
        java.lang.Number number52 = null;
        defaultKeyedValues2D46.addValue(number52, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 1);
        java.lang.Class<?> wildcardClass56 = defaultKeyedValues2D46.getClass();
        boolean boolean57 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D46);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (short) 0 + "'", number26, (short) 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) (short) 10, (double) 0L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues10.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues10.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues10.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues10.addValue((java.lang.Comparable) false, 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        int int29 = defaultKeyedValues28.getItemCount();
        java.lang.Number number31 = null;
        defaultKeyedValues28.addValue((java.lang.Comparable) "", number31);
        defaultKeyedValues28.clear();
        java.util.List list34 = defaultKeyedValues28.getKeys();
        boolean boolean35 = defaultKeyedValues10.equals((java.lang.Object) list34);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D36 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj37 = defaultKeyedValues2D36.clone();
        defaultKeyedValues2D36.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D36.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D36.removeColumn((int) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues46 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D48 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int50 = defaultKeyedValues2D48.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean51 = defaultKeyedValues46.equals((java.lang.Object) int50);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D52 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj53 = defaultKeyedValues2D52.clone();
        int int55 = defaultKeyedValues2D52.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean56 = defaultKeyedValues46.equals((java.lang.Object) int55);
        defaultKeyedValues46.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues46.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues46.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues46.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        boolean boolean69 = defaultKeyedValues2D36.equals((java.lang.Object) 100.0f);
        boolean boolean70 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues2D36);
        defaultKeyedValues2D36.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 10);
        boolean boolean75 = defaultKeyedValues0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj3 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        java.util.List list5 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues2D1.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(10, (java.lang.Comparable) (-1), (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(true);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj12 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.removeColumn((java.lang.Comparable) true);
        boolean boolean15 = defaultKeyedValues2D10.equals((java.lang.Object) true);
        boolean boolean16 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D10);
        int int18 = defaultKeyedValues2D10.getColumnIndex((java.lang.Comparable) 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues2D10.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D1.getValue((java.lang.Comparable) true, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeColumn((int) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int14 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean15 = defaultKeyedValues10.equals((java.lang.Object) int14);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean20 = defaultKeyedValues10.equals((java.lang.Object) int19);
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues10.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues10.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        boolean boolean33 = defaultKeyedValues2D0.equals((java.lang.Object) 100.0f);
        java.util.List list34 = defaultKeyedValues2D0.getColumnKeys();
        int int35 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 100, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) 0.0d);
        int int8 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, 1.0d);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) 10.0f, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list17 = defaultKeyedValues14.getKeys();
        defaultKeyedValues14.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues14.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int24 = defaultKeyedValues14.getItemCount();
        java.lang.Object obj25 = defaultKeyedValues14.clone();
        java.lang.Object obj26 = defaultKeyedValues14.clone();
        int int28 = defaultKeyedValues14.getIndex((java.lang.Comparable) 4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj30 = defaultKeyedValues2D29.clone();
        defaultKeyedValues2D29.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D32.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int38 = defaultKeyedValues2D32.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list41 = defaultKeyedValues2D32.getColumnKeys();
        boolean boolean42 = defaultKeyedValues2D29.equals((java.lang.Object) defaultKeyedValues2D32);
        boolean boolean43 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues2D29);
        boolean boolean44 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues14);
        defaultKeyedValues14.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number49 = defaultKeyedValues14.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) '#');
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) (-1));
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) (-1));
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) (-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) ' ');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues9.getKeys();
        defaultKeyedValues9.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues9.clear();
        int int17 = defaultKeyedValues9.getItemCount();
        java.lang.Class<?> wildcardClass18 = defaultKeyedValues9.getClass();
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) wildcardClass18);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 10L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultKeyedValues0.getKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1.0d, (java.lang.Number) (byte) 100);
        java.lang.Comparable comparable21 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.clear();
        java.lang.Object obj23 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (short) 1, (double) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 1.0d + "'", comparable21, 1.0d);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        java.util.List list8 = defaultKeyedValues0.getKeys();
        java.lang.Class<?> wildcardClass9 = list8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.util.List list16 = defaultKeyedValues10.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj18 = defaultKeyedValues2D17.clone();
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean23 = defaultKeyedValues10.equals((java.lang.Object) (short) 10);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list28 = defaultKeyedValues10.getKeys();
        int int30 = defaultKeyedValues10.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues10.setValue((java.lang.Comparable) 1L, (java.lang.Number) (byte) -1);
        defaultKeyedValues10.removeValue((java.lang.Comparable) (byte) 1);
        int int36 = defaultKeyedValues10.getItemCount();
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (-1));
        org.jfree.chart.util.SortOrder sortOrder40 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByKeys(sortOrder40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0f);
        java.lang.Object obj21 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0f));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues11.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues11.clear();
        defaultKeyedValues11.setValue((java.lang.Comparable) ' ', (java.lang.Number) 10.0d);
        defaultKeyedValues11.setValue((java.lang.Comparable) 100L, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues11);
        int int26 = defaultKeyedValues11.getIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues11.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (java.lang.Number) 1L);
        int int13 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues14.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D21.clear();
        defaultKeyedValues2D21.clear();
        java.lang.Object obj24 = defaultKeyedValues2D21.clone();
        int int25 = defaultKeyedValues2D21.getRowCount();
        defaultKeyedValues2D21.setValue((java.lang.Number) 4, (java.lang.Comparable) true, (java.lang.Comparable) '4');
        boolean boolean30 = defaultKeyedValues14.equals((java.lang.Object) '4');
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) -1);
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        java.util.List list3 = defaultKeyedValues2D1.getRowKeys();
        int int4 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) -1);
        java.util.List list10 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1.0f));
        java.lang.Object obj15 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        java.lang.Object obj19 = null;
        boolean boolean20 = defaultKeyedValues14.equals(obj19);
        int int21 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (-1.0f));
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues14.removeValue((java.lang.Comparable) (-1L));
        boolean boolean29 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues14);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) (byte) 10, (double) 1.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) false, (double) 0L);
        defaultKeyedValues0.clear();
        java.lang.Class<?> wildcardClass41 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', (java.lang.Number) 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues10.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues10.clear();
        defaultKeyedValues10.setValue((java.lang.Comparable) ' ', (java.lang.Number) 10.0d);
        defaultKeyedValues10.setValue((java.lang.Comparable) 100L, (java.lang.Number) 0L);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        java.lang.Comparable comparable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues0.getValue(comparable24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        java.lang.Object obj22 = null;
        boolean boolean23 = defaultKeyedValues20.equals(obj22);
        defaultKeyedValues20.clear();
        java.util.List list25 = defaultKeyedValues20.getKeys();
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) (short) 0, (java.lang.Number) (byte) -1);
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, 0.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (-1), (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, (java.lang.Number) (byte) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowCount();
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) (short) -1);
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 0L, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues8.setValue((java.lang.Comparable) (short) 10, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues8.getKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj20 = defaultKeyedValues2D16.clone();
        java.util.List list21 = defaultKeyedValues2D16.getColumnKeys();
        java.lang.Object obj22 = defaultKeyedValues2D16.clone();
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        int int24 = defaultKeyedValues2D16.getRowCount();
        java.util.List list25 = defaultKeyedValues2D16.getColumnKeys();
        java.util.List list26 = defaultKeyedValues2D16.getColumnKeys();
        int int28 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, 1.0d);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D1.clear();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues2D1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 5, (java.lang.Number) (byte) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, (double) (-1));
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) 6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) 4, (java.lang.Comparable) '4');
        int int13 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        int int13 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 1);
        int int11 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj10 = null;
        boolean boolean11 = defaultKeyedValues2D0.equals(obj10);
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int9 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) -1);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        java.util.List list15 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj14 = defaultKeyedValues2D13.clone();
        int int16 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj17 = defaultKeyedValues2D13.clone();
        defaultKeyedValues2D13.clear();
        boolean boolean19 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D13);
        java.util.List list20 = defaultKeyedValues2D0.getRowKeys();
        java.util.List list21 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) (short) 10, (java.lang.Comparable) 6);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D30 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj31 = defaultKeyedValues2D30.clone();
        defaultKeyedValues2D30.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D30.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int39 = defaultKeyedValues2D30.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues40 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues40.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list43 = defaultKeyedValues40.getKeys();
        boolean boolean44 = defaultKeyedValues2D30.equals((java.lang.Object) list43);
        defaultKeyedValues2D30.clear();
        java.util.List list46 = defaultKeyedValues2D30.getRowKeys();
        java.lang.Object obj47 = defaultKeyedValues2D30.clone();
        boolean boolean48 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D30);
        int int49 = defaultKeyedValues2D30.getRowCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.util.List list2 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100, (java.lang.Comparable) false);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int10 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int1 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) 1.0d, (java.lang.Comparable) 2);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        java.util.List list8 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues9.getKeys();
        defaultKeyedValues9.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues9.clear();
        java.lang.Object obj17 = defaultKeyedValues9.clone();
        boolean boolean18 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        int int11 = defaultKeyedValues2D0.getRowCount();
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0L, (java.lang.Comparable) 0L, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        java.lang.Comparable comparable16 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0L + "'", comparable16, 0L);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        int int14 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.clear();
        defaultKeyedValues13.removeValue((java.lang.Comparable) 1.0d);
        int int19 = defaultKeyedValues13.getIndex((java.lang.Comparable) 100.0f);
        java.util.List list20 = defaultKeyedValues13.getKeys();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues13);
        java.lang.Object obj22 = defaultKeyedValues2D0.clone();
        int int23 = defaultKeyedValues2D0.getRowCount();
        int int25 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        java.util.List list3 = defaultKeyedValues2D1.getRowKeys();
        int int4 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D1.clear();
        java.lang.Object obj11 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.addValue((java.lang.Number) 0, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.clear();
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 10);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0L);
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj13 = defaultKeyedValues2D12.clone();
        defaultKeyedValues2D12.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D12.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj20 = defaultKeyedValues2D12.clone();
        int int21 = defaultKeyedValues2D12.getRowCount();
        boolean boolean22 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D12);
        defaultKeyedValues2D12.clear();
        java.lang.Comparable comparable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D12.removeRow(comparable24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues0.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, 100.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int27 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list28 = defaultKeyedValues2D25.getRowKeys();
        defaultKeyedValues2D25.clear();
        boolean boolean31 = defaultKeyedValues2D25.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D25.clear();
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D25);
        defaultKeyedValues0.removeValue(0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 52.0d);
        org.jfree.chart.util.SortOrder sortOrder39 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0.0f);
        int int10 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 4, (java.lang.Comparable) true);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues0.clear();
        java.lang.Number number8 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 1L, number8);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj11 = defaultKeyedValues2D10.clone();
        defaultKeyedValues2D10.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D10.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D10.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D10.removeColumn((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D10.clear();
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) "hi!");
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) '4', (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (-1.0f));
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        int int13 = defaultKeyedValues12.getItemCount();
        java.lang.Object obj14 = null;
        boolean boolean15 = defaultKeyedValues12.equals(obj14);
        defaultKeyedValues12.clear();
        defaultKeyedValues12.clear();
        defaultKeyedValues12.addValue((java.lang.Comparable) false, (double) ' ');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list24 = defaultKeyedValues21.getKeys();
        defaultKeyedValues21.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues21.clear();
        int int29 = defaultKeyedValues21.getItemCount();
        java.lang.Class<?> wildcardClass30 = defaultKeyedValues21.getClass();
        boolean boolean31 = defaultKeyedValues12.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = defaultKeyedValues2D0.equals((java.lang.Object) wildcardClass30);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
        java.lang.Number number14 = defaultKeyedValues0.getValue((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues0.getValue((java.lang.Comparable) 5);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 5");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1.0f) + "'", number14, (-1.0f));
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (double) 10.0f);
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int15 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list16 = defaultKeyedValues2D13.getRowKeys();
        defaultKeyedValues2D13.clear();
        int int19 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultKeyedValues2D13.getRowKeys();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) list20);
        int int23 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 10L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        java.lang.Object obj14 = defaultKeyedValues2D3.clone();
        defaultKeyedValues2D3.clear();
        java.lang.Object obj16 = defaultKeyedValues2D3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D3.getValue((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 1);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 100 + "'", comparable8, (short) 100);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 3);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        java.lang.Number number14 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) true, number14);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (-1.0d), (java.lang.Number) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues0.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (-1.0d));
        java.lang.Comparable comparable19 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + false + "'", comparable19, false);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 10.0f, (java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int9 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 52.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn(0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj17 = defaultKeyedValues2D16.clone();
        int int19 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj20 = defaultKeyedValues2D16.clone();
        boolean boolean21 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D16);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100L, (java.lang.Comparable) 1, (java.lang.Comparable) 'a');
        java.lang.Object obj26 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (double) (-1.0f));
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues0.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int10 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list11 = defaultKeyedValues2D8.getRowKeys();
        defaultKeyedValues2D8.clear();
        int int14 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 1.0d);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) 100L);
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) (byte) 0);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        int int13 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        int int14 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        int int31 = defaultKeyedValues0.getIndex((java.lang.Comparable) ' ');
        defaultKeyedValues0.removeValue((java.lang.Comparable) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (java.lang.Number) (short) 1);
        org.jfree.chart.util.SortOrder sortOrder37 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 1L);
        int int30 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 1, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultKeyedValues0.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        java.lang.Object obj22 = null;
        boolean boolean23 = defaultKeyedValues20.equals(obj22);
        defaultKeyedValues20.clear();
        java.util.List list25 = defaultKeyedValues20.getKeys();
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) (short) 0, (java.lang.Number) (byte) -1);
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (double) 100.0f);
        java.lang.Object obj34 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        int int5 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 'a');
        int int8 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "hi!");
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10, (java.lang.Comparable) false, (java.lang.Comparable) "");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        defaultKeyedValues5.setValue((java.lang.Comparable) 2, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues5.insertValue((int) '4', (java.lang.Comparable) 100.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) ' ');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues9.getKeys();
        defaultKeyedValues9.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues9.clear();
        int int17 = defaultKeyedValues9.getItemCount();
        java.lang.Class<?> wildcardClass18 = defaultKeyedValues9.getClass();
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) wildcardClass18);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
        java.lang.Object obj22 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj14 = defaultKeyedValues2D13.clone();
        int int16 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj17 = defaultKeyedValues2D13.clone();
        int int19 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D13.removeColumn((java.lang.Comparable) (byte) 100);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1L);
        java.lang.Object obj31 = defaultKeyedValues0.clone();
        int int32 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (java.lang.Number) 100L);
        java.util.List list36 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        defaultKeyedValues14.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list25 = defaultKeyedValues22.getKeys();
        boolean boolean26 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues22);
        defaultKeyedValues14.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        boolean boolean30 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues14);
        int int32 = defaultKeyedValues14.getIndex((java.lang.Comparable) "");
        defaultKeyedValues14.addValue((java.lang.Comparable) 0.0d, (double) (byte) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D37 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int39 = defaultKeyedValues2D37.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list40 = defaultKeyedValues2D37.getRowKeys();
        defaultKeyedValues2D37.clear();
        boolean boolean43 = defaultKeyedValues2D37.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D37.clear();
        int int45 = defaultKeyedValues2D37.getRowCount();
        int int46 = defaultKeyedValues2D37.getRowCount();
        boolean boolean47 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues2D37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number49 = defaultKeyedValues14.getValue((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.util.List list2 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (double) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int24 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) 10L);
        int int25 = defaultKeyedValues2D22.getColumnCount();
        defaultKeyedValues2D22.removeColumn((java.lang.Comparable) (short) -1);
        int int29 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list30 = defaultKeyedValues2D22.getColumnKeys();
        int int32 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) 100.0f);
        int int34 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues35 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues35.removeValue((java.lang.Comparable) (short) 0);
        int int39 = defaultKeyedValues35.getIndex((java.lang.Comparable) false);
        defaultKeyedValues35.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues43 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues43.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list46 = defaultKeyedValues43.getKeys();
        boolean boolean47 = defaultKeyedValues35.equals((java.lang.Object) defaultKeyedValues43);
        defaultKeyedValues35.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        boolean boolean51 = defaultKeyedValues2D22.equals((java.lang.Object) defaultKeyedValues35);
        boolean boolean52 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D22);
        java.lang.Object obj53 = defaultKeyedValues2D22.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D22.removeRow((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (java.lang.Number) 0.0d);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj12 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.clear();
        int int14 = defaultKeyedValues2D11.getColumnCount();
        defaultKeyedValues2D11.addValue((java.lang.Number) 1L, (java.lang.Comparable) 0, (java.lang.Comparable) ' ');
        java.lang.Object obj19 = defaultKeyedValues2D11.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues20.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues20.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues20.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues20.addValue((java.lang.Comparable) false, 10.0d);
        boolean boolean38 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues20);
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = defaultKeyedValues0.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0L);
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj13 = defaultKeyedValues2D12.clone();
        defaultKeyedValues2D12.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D12.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj20 = defaultKeyedValues2D12.clone();
        int int21 = defaultKeyedValues2D12.getRowCount();
        boolean boolean22 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D12);
        defaultKeyedValues2D12.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues2D12.getValue(2, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 'a');
        defaultKeyedValues2D0.removeColumn((int) (short) 0);
        java.lang.Object obj18 = defaultKeyedValues2D0.clone();
        java.util.List list19 = defaultKeyedValues2D0.getColumnKeys();
        int int21 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.setValue((java.lang.Number) 6, comparable23, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.util.List list23 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 4, (java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        int int21 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj22 = defaultKeyedValues2D18.clone();
        int int24 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D18.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) (byte) 100);
        int int31 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) ' ');
        int int32 = defaultKeyedValues2D18.getColumnCount();
        defaultKeyedValues2D18.clear();
        java.util.List list34 = defaultKeyedValues2D18.getRowKeys();
        boolean boolean35 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D18);
        int int37 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) 'a');
        int int39 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 6);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) 10.0d);
        int int14 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, 1.0d);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D5.clear();
        java.util.List list7 = defaultKeyedValues2D5.getRowKeys();
        int int8 = defaultKeyedValues2D5.getColumnCount();
        java.util.List list9 = defaultKeyedValues2D5.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        defaultKeyedValues10.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        java.lang.Object obj17 = defaultKeyedValues10.clone();
        java.lang.Object obj18 = defaultKeyedValues10.clone();
        boolean boolean19 = defaultKeyedValues2D5.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D5);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0L);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) 0.0f, (java.lang.Number) (short) 1);
        java.lang.Object obj27 = null;
        boolean boolean28 = defaultKeyedValues10.equals(obj27);
        defaultKeyedValues10.addValue((java.lang.Comparable) true, (java.lang.Number) 10.0d);
        defaultKeyedValues10.addValue((java.lang.Comparable) '4', 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.insertValue(5, (java.lang.Comparable) 100L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues2 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues2.removeValue((java.lang.Comparable) (short) 0);
        int int6 = defaultKeyedValues2.getIndex((java.lang.Comparable) false);
        defaultKeyedValues2.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean15 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        boolean boolean17 = defaultKeyedValues10.equals((java.lang.Object) "");
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 100.0d);
        defaultKeyedValues10.insertValue(0, (java.lang.Comparable) (short) 10, (double) 0L);
        defaultKeyedValues10.clear();
        defaultKeyedValues10.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) (-1L));
        java.util.List list29 = defaultKeyedValues10.getKeys();
        int int31 = defaultKeyedValues10.getIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj32 = defaultKeyedValues10.clone();
        org.jfree.chart.util.SortOrder sortOrder33 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByKeys(sortOrder33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        int int7 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1.0f);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) false, (java.lang.Comparable) ' ');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        java.util.List list14 = defaultKeyedValues2D3.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list18 = defaultKeyedValues15.getKeys();
        defaultKeyedValues15.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues15.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int25 = defaultKeyedValues15.getItemCount();
        java.lang.Object obj26 = defaultKeyedValues15.clone();
        defaultKeyedValues15.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D28 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj29 = defaultKeyedValues2D28.clone();
        int int31 = defaultKeyedValues2D28.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj32 = defaultKeyedValues2D28.clone();
        int int34 = defaultKeyedValues2D28.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D28.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) (byte) 100);
        boolean boolean40 = defaultKeyedValues15.equals((java.lang.Object) (byte) 100);
        defaultKeyedValues15.removeValue((java.lang.Comparable) "hi!");
        boolean boolean43 = defaultKeyedValues2D3.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D3.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 10.0d);
        int int47 = defaultKeyedValues2D3.getColumnCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int20 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultKeyedValues2D18.getRowKeys();
        defaultKeyedValues2D18.clear();
        boolean boolean24 = defaultKeyedValues2D18.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D18.clear();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) 10.0d);
        int int31 = defaultKeyedValues2D18.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = defaultKeyedValues2D18.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1), (java.lang.Comparable) 1.0d, (java.lang.Comparable) "");
        int int16 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        int int21 = defaultKeyedValues20.getItemCount();
        java.lang.Object obj22 = null;
        boolean boolean23 = defaultKeyedValues20.equals(obj22);
        defaultKeyedValues20.clear();
        java.util.List list25 = defaultKeyedValues20.getKeys();
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) (short) 0, (java.lang.Number) (byte) -1);
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues20);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, 0.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (-1), (double) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) 6);
        org.jfree.chart.util.SortOrder sortOrder43 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1L), (double) 1.0f);
        java.util.List list20 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable22 = null;
        java.lang.Number number23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(4, comparable22, number23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        java.util.List list14 = defaultKeyedValues2D3.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list18 = defaultKeyedValues15.getKeys();
        defaultKeyedValues15.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues15.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int25 = defaultKeyedValues15.getItemCount();
        java.lang.Object obj26 = defaultKeyedValues15.clone();
        defaultKeyedValues15.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D28 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj29 = defaultKeyedValues2D28.clone();
        int int31 = defaultKeyedValues2D28.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj32 = defaultKeyedValues2D28.clone();
        int int34 = defaultKeyedValues2D28.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D28.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) (byte) 100);
        boolean boolean40 = defaultKeyedValues15.equals((java.lang.Object) (byte) 100);
        defaultKeyedValues15.removeValue((java.lang.Comparable) "hi!");
        boolean boolean43 = defaultKeyedValues2D3.equals((java.lang.Object) "hi!");
        int int45 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0);
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0L, (java.lang.Comparable) 1.0d, (java.lang.Comparable) "");
        java.lang.Comparable comparable13 = defaultKeyedValues2D1.getRowKey((int) (short) 0);
        int int14 = defaultKeyedValues2D1.getColumnCount();
        int int15 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1.0d + "'", comparable13, 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 100.0f);
        java.util.List list14 = defaultKeyedValues0.getKeys();
        int int15 = defaultKeyedValues0.getItemCount();
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D18.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj26 = defaultKeyedValues2D18.clone();
        int int28 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) "");
        int int29 = defaultKeyedValues2D18.getRowCount();
        int int31 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) false);
        defaultKeyedValues2D18.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 10L, (java.lang.Comparable) 1.0d);
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) 1.0d);
        int int37 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '#');
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int13 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list14 = defaultKeyedValues2D11.getRowKeys();
        defaultKeyedValues2D11.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int18 = defaultKeyedValues2D11.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D11.getColumnKeys();
        int int20 = defaultKeyedValues2D11.getRowCount();
        defaultKeyedValues2D11.removeColumn((java.lang.Comparable) 'a');
        boolean boolean23 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int9 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D0.getValue((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (double) (short) 100);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (java.lang.Number) (byte) 1);
        java.util.List list22 = defaultKeyedValues0.getKeys();
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues0.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100, 1.0d);
        java.util.List list10 = defaultKeyedValues6.getKeys();
        java.lang.Class<?> wildcardClass11 = defaultKeyedValues6.getClass();
        boolean boolean12 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues6);
        int int13 = defaultKeyedValues2D0.getColumnCount();
        int int14 = defaultKeyedValues2D0.getRowCount();
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) ' ');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }
}

